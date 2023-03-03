package graphite.shared;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;

import graphite.textual.DerivedObjectUtility;

public class ReferencesAdapter extends EContentAdapter {
		
	private EObject referencedObject;
	private EObject referencedObjectContainer;
	private Map<EObject, DerivedObjectProperties> referencingObjects;
	
	public ReferencesAdapter(EObject referencedObject) {
		this.referencedObject = referencedObject;
		this.referencedObjectContainer = referencedObject.eContainer();
		this.referencingObjects = new HashMap<EObject, DerivedObjectProperties>();
	}
	
	public Map<EObject, DerivedObjectProperties> getReferencingObjects() {
		return referencingObjects;
	}

	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);	
		if(notification.getEventType() == Notification.SET) {
			Object feature = notification.getFeature();
			if (feature != null && feature instanceof ENamedElement) {
				String nameOfChangedAttribute = ((ENamedElement)feature).getName();
				String nameOfIdentifier = ModelUtility.getIdentifierName(notification.getNotifier());
				if (Objects.equals(nameOfChangedAttribute, nameOfIdentifier)) {
					if (!removeReferences(!Settings.isRefactor())) {
						serializeDerivedObjects();
					}
				}
			}
		}
	}
	
	private boolean removeReferences(boolean removeReferences) {
		if (removeReferences) {
			removeReferences();
		}
		return removeReferences;
	}
	
	public void removeReferences() {
		ReferencesUtility.getInstance().removeReferences(referencedObject, referencedObjectContainer, referencingObjects.keySet());
	}
	
	private void serializeDerivedObjects() {
		for (DerivedObjectProperties derivedObjectProperties: new HashSet<DerivedObjectProperties>(referencingObjects.values())) {
			DerivedObjectUtility.serializeObject(derivedObjectProperties);		
		}
	}
	
	public void clearFields() {
		referencedObject = null;
		referencingObjects = null;
	}
}