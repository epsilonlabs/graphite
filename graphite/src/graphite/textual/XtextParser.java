package graphite.textual;

import java.util.UUID;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import com.google.inject.Injector;

import graphite.shared.DerivedObjectProperties;

@SuppressWarnings("restriction")
public class XtextParser {
	
	public static Resource deserializeString(DerivedObjectProperties derivedObjectProperties, String parsedString) {
		Injector grammarInjector = derivedObjectProperties.getGrammar().createInjectorAndDoEMFRegistration();
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
		Resource derivedResource = resourceSet.createResource(URI.createURI(uri));
		try {
			InputStream in = new ByteArrayInputStream(parsedString.getBytes());
			derivedResource.load(in, resourceSet.getLoadOptions());
		} catch (IOException e) {
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
	
}