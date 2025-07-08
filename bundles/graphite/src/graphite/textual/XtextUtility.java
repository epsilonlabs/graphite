package graphite.textual;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.impl.AssignmentImpl;
import org.eclipse.xtext.impl.CrossReferenceImpl;
import org.eclipse.xtext.impl.GroupImpl;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Injector;

import graphite.shared.DerivedObjectProperties;

@SuppressWarnings("restriction")
public class XtextUtility {
	
	public static Resource deserializeString(DerivedObjectProperties derivedObjectProperties, String parsedString) {
		Injector grammarInjector = derivedObjectProperties.getGrammar().createInjectorAndDoEMFRegistration();
		IGrammarAccess grammarAccess = grammarInjector.getInstance(IGrammarAccess.class);	
		ParserRule entryParserRule = (ParserRule) GrammarUtil.findRuleForName(grammarAccess.getGrammar(), derivedObjectProperties.getGrammarEntryRule());		
		FileExtensionProvider fileExtensionProvider = grammarInjector.getInstance(FileExtensionProvider.class);
		ResourceSet resourceSet = grammarInjector.getInstance(ResourceSet.class);
		EList<Resource> resources = (derivedObjectProperties.getContainerObject().eResource() != null && derivedObjectProperties.getContainerObject().eResource().getResourceSet() != null) ? ((ResourceSet)derivedObjectProperties.getContainerObject().eResource().getResourceSet()).getResources() : null;
		if (resources != null) {
			for (Resource res : resources) {
				resourceSet.getResources().add(new XtextXMIResourceImpl(res));
			}
		}
		String uuid = UUID.randomUUID().toString().replace("-", "");
		String uri = "dummy:/parsed" + uuid + "." + fileExtensionProvider.getPrimaryFileExtension();	
		XtextResource derivedResource = (XtextResource) resourceSet.createResource(URI.createURI(uri));
		derivedResource.setEntryPoint((ParserRule) entryParserRule);
		try {
			InputStream in = new ByteArrayInputStream(parsedString.getBytes());
			derivedResource.load(in, resourceSet.getLoadOptions());
		} catch (Exception e) {
			e.printStackTrace();
		}		
		if (derivedResource.getErrors().size() == 0) {
			EcoreUtil.resolveAll(resourceSet);
		}
		derivedObjectProperties.setInvalid((derivedResource.getErrors().size() > 0));
		derivedObjectProperties.setParseErrors(derivedResource.getErrors());
		derivedObjectProperties.setLastParsedString(parsedString);
		return derivedResource;
	}
	
	public static String serializeObject(EObject object, ISetup grammar) {
		Injector grammarInjector = grammar.createInjectorAndDoEMFRegistration();
		CustomSerializer serializer = grammarInjector.getInstance(CustomSerializer.class);
		return serializer.serialize(object);
	}

	public static FileExtensionProvider register(Injector injector) {
		IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
		IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);
		FileExtensionProvider fileExtensionProvider = injector.getInstance(FileExtensionProvider.class);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(fileExtensionProvider.getPrimaryFileExtension(), resourceFactory);
		IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put(fileExtensionProvider.getPrimaryFileExtension(), serviceProvider);	
		return fileExtensionProvider;
	}
	
	public static Set<EClassifier> getReferencedTypes(ISetup setup) {
		Injector injector = setup.createInjectorAndDoEMFRegistration();		
		IGrammarAccess grammarAccess = injector.getInstance(IGrammarAccess.class);		
        Grammar grammar = grammarAccess.getGrammar();
        Set<EClassifier> referencedTypes = new HashSet<>();   
        for (AbstractRule rule : grammar.getRules()) {
            if (rule instanceof ParserRule) {
            	AbstractElement abstractElement = rule.getAlternatives();
            	if (abstractElement instanceof GroupImpl) {
            		collectReferencedTypes((GroupImpl)abstractElement, referencedTypes);
            	}     
            }
        }
        return referencedTypes;
	}
	
	private static void collectReferencedTypes(GroupImpl groupImpl, Set<EClassifier> referencedTypes) {
		EList<AbstractElement> elements = groupImpl.getElements();
		for (AbstractElement element : elements) {
			if (element instanceof AssignmentImpl) {
				AbstractElement terminal = ((AssignmentImpl)element).getTerminal();
				if (terminal instanceof CrossReferenceImpl) {
					referencedTypes.add(((CrossReferenceImpl)terminal).getType().getClassifier());
				}
			}
			else if (element instanceof GroupImpl){
				collectReferencedTypes((GroupImpl)element, referencedTypes);
			}
		}
	}
	
	public static boolean isReferencedType(Set<EClassifier> referencedTypes, EClass eClass) {
		for (EClassifier referencedType: referencedTypes) {
			if (referencedType.getInstanceClass().isAssignableFrom(eClass.getInstanceClass())) {
				return true;
			}
		}
		return false;
	}
	
}