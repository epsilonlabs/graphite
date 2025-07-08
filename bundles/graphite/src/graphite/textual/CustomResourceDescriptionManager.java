package graphite.textual;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionManager;

public class CustomResourceDescriptionManager extends DefaultResourceDescriptionManager {

	private IDefaultResourceDescriptionStrategy resourceDescriptionStrategy;
	
	public CustomResourceDescriptionManager() {
		resourceDescriptionStrategy = new CustomDefaultResourceDescriptionStrategy();
	}
	
	@Override
	public IResourceDescription getResourceDescription(final Resource resource) {
		return new DefaultResourceDescription(resource, resourceDescriptionStrategy, getCache());
	}
	
}
