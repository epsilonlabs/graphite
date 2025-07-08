package graphite.textual;

import com.google.common.base.Predicate;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ResourceSetReferencingResourceSet;
import org.eclipse.xtext.resource.generic.GenericResourceDescriptionManager;
import org.eclipse.xtext.resource.impl.ResourceSetBasedResourceDescriptions;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;
import org.eclipse.xtext.scoping.impl.SelectableBasedScope;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class GlobalScopeProvider extends DefaultGlobalScopeProvider {
	
	@Inject
	private Provider<ResourceSetBasedResourceDescriptions> resourceDescriptionsProvider;
 
	@Override
	public IScope getScope(final Resource resource, final EReference reference, final Predicate<IEObjectDescription> filter) {
		ResourceSet resourceSet = resource.getResourceSet();
		if ((resourceSet instanceof ResourceSetReferencingResourceSet)) {
			ResourceSet referenced = IterableExtensions.<ResourceSet>head(((ResourceSetReferencingResourceSet)resourceSet).getReferencedResourceSets());
			if ((referenced != null)) {
				ResourceSetBasedResourceDescriptions resourceDescriptions = this.resourceDescriptionsProvider.get();
				resourceDescriptions.setContext(referenced);
				return SelectableBasedScope.createScope(IScope.NULLSCOPE, resourceDescriptions, filter, reference.getEReferenceType(), false);
			}
		}
		return super.getScope(resource, reference, filter);
	}
}