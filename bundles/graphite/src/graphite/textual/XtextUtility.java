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
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.impl.AssignmentImpl;
import org.eclipse.xtext.impl.CrossReferenceImpl;
import org.eclipse.xtext.impl.GroupImpl;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.XtextResource;

import com.google.inject.Injector;
import graphite.shared.DerivedObjectProperties;

@SuppressWarnings("restriction")
public class XtextUtility {
	
	public static Resource deserializeString(DerivedObjectProperties derivedObjectProperties, String parsedString) {
		Injector grammarInjector = derivedObjectProperties.getGrammarInjector();	
		registerInjector(grammarInjector, derivedObjectProperties.getExtension());
		ResourceSet resourceSet = grammarInjector.getInstance(ResourceSet.class);
		EList<Resource> resources = (derivedObjectProperties.getContainerObject().eResource() != null && derivedObjectProperties.getContainerObject().eResource().getResourceSet() != null) ? ((ResourceSet)derivedObjectProperties.getContainerObject().eResource().getResourceSet()).getResources() : null;
		if (resources != null) {
			for (Resource res : resources) {
				resourceSet.getResources().add(new XtextXMIResourceImpl(res));
			}
		}
		String uuid = UUID.randomUUID().toString().replace("-", "");
		String uri = "dummy:/parsed" + uuid + "." + derivedObjectProperties.getExtension();	
		XtextResource derivedResource = (XtextResource) resourceSet.createResource(URI.createURI(uri));
		derivedResource.setEntryPoint(derivedObjectProperties.getEntryParserRule());
		try {
			InputStream in = new ByteArrayInputStream(parsedString.getBytes());
			derivedResource.load(in, resourceSet.getLoadOptions());
		} catch (Exception e) {
			e.printStackTrace();
		}		
		if (derivedResource.getErrors().size() == 0) {
			EcoreUtil.resolveAll(derivedResource);
		}
		derivedObjectProperties.setInvalid((derivedResource.getErrors().size() > 0));
		derivedObjectProperties.setParseErrors(derivedResource.getErrors());
		derivedObjectProperties.setLastParsedString(parsedString);
		return derivedResource;
	}
	
	public static String serializeObject(DerivedObjectProperties derivedObjectProperties, EObject object) {
		Injector grammarInjector = derivedObjectProperties.getGrammarInjector();
		registerInjector(grammarInjector, derivedObjectProperties.getExtension());
		CustomSerializer serializer = grammarInjector.getInstance(CustomSerializer.class);
		return serializer.serialize(object);
	}
	
	public static void registerInjector(Injector grammarInjector, String extension) {
		IResourceFactory resourceFactory = grammarInjector.getInstance(IResourceFactory.class);
		IResourceServiceProvider serviceProvider = grammarInjector.getInstance(IResourceServiceProvider.class);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(extension, resourceFactory);
		IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put(extension, serviceProvider);
	}
	
	public static Set<EClassifier> getReferencedTypes(IGrammarAccess grammarAccess) {	
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