package graphite.textual;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Manager;
import org.eclipse.xtext.resource.impl.ResourceSetBasedResourceDescriptions;

public class CustomResourceSetBasedResourceDescriptions extends ResourceSetBasedResourceDescriptions {
	
	@Override
	public IResourceDescription getResourceDescription(URI uri) {
		if (getData() != null) {
			return getData().getResourceDescription(uri);
		}
		Resource resource = getResourceSet().getResource(uri, false);
		if (resource == null)
			return null;
		Manager manager = new CustomResourceDescriptionManager();
		return manager.getResourceDescription(resource);
	}
	
}
