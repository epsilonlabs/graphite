package graphite.shared;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
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
			Object notifier = notification.getNotifier();
			if (notifier == this.referencedObject && notifier instanceof EObject) {
				EObject object = (EObject) notifier;
    			Object feature = notification.getFeature();
    			if (feature instanceof EAttribute) {
    				EAttribute attribute = ModelUtility.getIdentifierAttribute(object);
    				if (Objects.equals(attribute, feature)) {
    					if (!removeReferences(!Settings.isRefactor())) {
    						serializeDerivedObjects();
    					}
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
			DerivedObjectUtility.serializeObject(derivedObjectProperties, true);		
		}
	}
	
	public void clearFields() {
		referencedObject = null;
		referencingObjects = null;
	}
}