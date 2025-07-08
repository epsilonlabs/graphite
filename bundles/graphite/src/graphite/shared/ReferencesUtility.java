package graphite.shared;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.UsageCrossReferencer;

@SuppressWarnings("rawtypes")
public class ReferencesUtility {
	
	private Map<EObject, ReferencesAdapter> referencesAdapters;
	private static ReferencesUtility instance;

	private ReferencesUtility() {
		referencesAdapters = new WeakHashMap<EObject, ReferencesAdapter>();
	}
	
	public static ReferencesUtility getInstance() {
		if(instance == null) {
			instance = new ReferencesUtility();
		}
		return instance;
	}
	
	public Map<EObject, ReferencesAdapter> getReferencesAdapters() {
		return referencesAdapters;
	}
	
	public void removeReferences(Object referencedObject) {
		if (referencedObject instanceof EObject) {
			removeReferences((EObject)referencedObject);
		}
		else if (referencedObject instanceof List) {
			removeReferences((List)referencedObject);
		}
	}
	
	public void removeReferences(EObject referencedObject) {
		if (referencesAdapters.containsKey(referencedObject)) {
			referencesAdapters.get(referencedObject).removeReferences();
		}
	}
	
	public void removeReferences(List referencedObjects) {
		for (Object referencedObject: referencedObjects) {
			if (referencedObject instanceof EObject) {
				removeReferences((EObject)referencedObject);
			}
		}
	}
	
	public void removeReferences(EObject referencedObject, EObject referencedObjectContainer, Set<EObject> referencingObjects) {				
		for (Iterator<EObject> it = referencingObjects.iterator(); it.hasNext();) {
			EObject referencingObject = it.next();
			removeReference(referencedObject, referencedObjectContainer, referencingObject);
		}
	}
	
	public void removeReference(EObject referencedObject, EObject referencedObjectContainer, EObject referencingObject) {
		Resource resource = referencedObjectContainer.eResource();
		Collection<EStructuralFeature.Setting> usages;
		if (resource == null) {
			usages = UsageCrossReferencer.find(referencedObject, referencedObjectContainer);
		}
		else {
			ResourceSet resourceSet = resource.getResourceSet();
			usages = (resourceSet == null) ? UsageCrossReferencer.find(referencedObject, resource) : UsageCrossReferencer.find(referencedObject, resourceSet);
	    }
		for (EStructuralFeature.Setting setting : usages) {
			if (Objects.equals(referencingObject, setting.getEObject()) && setting.getEStructuralFeature().isChangeable()) {
				EcoreUtil.remove(setting, referencedObject);
			}
		}
	}
			
	public void clearReferencesAdapters(DerivedObjectProperties derivedObjectProperties) {
		if (!derivedObjectProperties.getRecerencingAndReferencedObjects().isEmpty()) {
			for (EObject referencingObject : derivedObjectProperties.getRecerencingAndReferencedObjects().keySet()) {
				for (EObject referencedObject : derivedObjectProperties.getRecerencingAndReferencedObjects().get(referencingObject)) {
					getAndUpdateReferencesAdapter(derivedObjectProperties, referencingObject, referencedObject);
				}
			}
			for (EObject referencingObject : derivedObjectProperties.getRecerencingAndReferencedObjects().keySet()) {
				for (EObject referencedObject : derivedObjectProperties.getRecerencingAndReferencedObjects().get(referencingObject)) {
					if (referencesAdapters.containsKey(referencedObject)) {
						ReferencesAdapter adapter = referencesAdapters.get(referencedObject);
						removeAdapterIfNecessary(adapter, referencedObject);
					}
				}
			}
			derivedObjectProperties.getRecerencingAndReferencedObjects().clear();
		}
	}
	
	public void removeReferencesAdapters(DerivedObjectProperties derivedObjectProperties, Object object) {
		if (object instanceof EObject) {
			removeReferencesAdapters(derivedObjectProperties, (EObject)object);
		}
		else if (object instanceof List) {
			removeReferencesAdapters(derivedObjectProperties, (List)object);
		}
	}
	
	public void removeReferencesAdapters(DerivedObjectProperties derivedObjectProperties, List objects) {
		for (Object object: objects) {
			if (object instanceof EObject) {
				removeReferencesAdapters(derivedObjectProperties, (EObject)object);
			}
		}
	}
	
	public void removeReferencesAdapters(DerivedObjectProperties derivedObjectProperties, EObject referencingObject) {
		if (derivedObjectProperties.getRecerencingAndReferencedObjects().containsKey(referencingObject)) {
			for(EObject referencedObject : derivedObjectProperties.getRecerencingAndReferencedObjects().get(referencingObject)) {
				ReferencesAdapter adapter = getAndUpdateReferencesAdapter(derivedObjectProperties, referencingObject, referencedObject);
				removeAdapterIfNecessary(adapter, referencedObject);
			}
			derivedObjectProperties.getRecerencingAndReferencedObjects().remove(referencingObject);
		}
	}
	
	public void removeReferencesAdapters(DerivedObjectProperties derivedObjectProperties, EObject referencingObject, Object referencedObject) {		
		if (referencedObject instanceof EObject) {
			removeReferencesAdapters(derivedObjectProperties, referencingObject, (EObject)referencedObject);
		}
		else if (referencedObject instanceof List) {
			removeReferencesAdapters(derivedObjectProperties, referencingObject, (List)referencedObject);
		}
	}
	
	public void removeReferencesAdapters(DerivedObjectProperties derivedObjectProperties, EObject referencingObject, List referencedObjects) {		
		for (Object referencedObject: referencedObjects) {
			if (referencedObject instanceof EObject) {
				removeReferencesAdapters(derivedObjectProperties, referencingObject, (EObject)referencedObject);
			}
		}
	}
	
	public void removeReferencesAdapters(DerivedObjectProperties derivedObjectProperties, EObject referencingObject, EObject referencedObject) {		
		ReferencesAdapter adapter = getAndUpdateReferencesAdapter(derivedObjectProperties, referencingObject, referencedObject);
		removeAdapterIfNecessary(adapter, referencedObject);	
	}
	
	public void addReferencesAdapters(DerivedObjectProperties derivedObjectProperties, Object object) {
		if (object instanceof EObject) {
			addReferencesAdapters(derivedObjectProperties, (EObject)object);
		}
		else if (object instanceof List) {
			addReferencesAdapters(derivedObjectProperties, (List)object);
		}
	}
	
	public void addReferencesAdapters(DerivedObjectProperties derivedObjectProperties, List objects) {
		for (Object object: objects) {
			if (object instanceof EObject) {
				addReferencesAdapters(derivedObjectProperties, (EObject)object);
			}
		}
	}
	
	public void addReferencesAdapters(DerivedObjectProperties derivedObjectProperties, EObject referencingObject) {
		if (referencingObject != null) {
			EList<EObject> referencedObjects = referencingObject.eCrossReferences();
			derivedObjectProperties.getRecerencingAndReferencedObjects().put(referencingObject, referencedObjects);
			for (EObject referencedObject: referencedObjects) {
				addReferencesAdapters(derivedObjectProperties, referencingObject, referencedObject);
			}
			for (EObject containedObject: referencingObject.eContents()) {
				addReferencesAdapters(derivedObjectProperties, containedObject);
			}
		}
	}
	
	public void addReferencesAdapters(DerivedObjectProperties derivedObjectProperties, EObject referencingObject, Object referencedObject) {		
		if (referencedObject instanceof EObject) {
			addReferencesAdapters(derivedObjectProperties, referencingObject, (EObject)referencedObject);
		}
		else if (referencedObject instanceof List) {
			addReferencesAdapters(derivedObjectProperties, referencingObject, (List)referencedObject);
		}
	}
	
	public void addReferencesAdapters(DerivedObjectProperties derivedObjectProperties, EObject referencingObject, List referencedObjects) {		
		for (Object referencedObject: referencedObjects) {
			if (referencedObject instanceof EObject) {
				addReferencesAdapters(derivedObjectProperties, referencingObject, (EObject)referencedObject);
			}
		}
	}
	
	public void addReferencesAdapters(DerivedObjectProperties derivedObjectProperties, EObject referencingObject, EObject referencedObject) {
		if (referencedObject != null) {
			ReferencesAdapter referencesAdapter = null;
			if (!referencesAdapters.containsKey(referencedObject)) {
				referencesAdapter = new ReferencesAdapter(referencedObject);
				referencesAdapters.put(referencedObject, referencesAdapter);
				referencedObject.eAdapters().add(referencesAdapter);
			}
			else {
				referencesAdapter = referencesAdapters.get(referencedObject);
			}
			referencesAdapter.getReferencingObjects().put(referencingObject, derivedObjectProperties);
		}
	}

	public void updateReferencesAdapters(DerivedObjectProperties derivedObjectProperties, EObject referencingObject, Object oldReferencedObject, Object newReferencedObject) {		
		removeReferencesAdapters(derivedObjectProperties, referencingObject, oldReferencedObject);
		addReferencesAdapters(derivedObjectProperties, referencingObject, newReferencedObject);
	}
	
	private ReferencesAdapter getAndUpdateReferencesAdapter(DerivedObjectProperties derivedObjectProperties, EObject referencingObject, EObject referencedObject) {
		ReferencesAdapter adapter = null;
		if (referencesAdapters.containsKey(referencedObject)) {
			adapter = referencesAdapters.get(referencedObject);
			adapter.getReferencingObjects().remove(referencingObject);
		}
		return adapter;
	}
	
	private void removeAdapterIfNecessary(ReferencesAdapter adapter, EObject referencedObject) {
		if (adapter != null && adapter.getReferencingObjects().isEmpty()) {
			referencedObject.eAdapters().remove(adapter);
			referencesAdapters.remove(referencedObject);
			adapter.clearFields();
		}
	}
}