package graphite.textual;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;

import graphite.shared.DerivedObjectProperties;
import graphite.shared.ReferencesUtility;

public class SerializationAdapter extends EContentAdapter {

	private XtextEObject containerObject;
	private List<Integer> eventTypes_added = List.of(Notification.ADD, Notification.ADD_MANY);
	private List<Integer> eventTypes_removed = List.of(Notification.REMOVE, Notification.REMOVE_MANY);
	private List<Integer> eventTypes_changed = List.of(Notification.SET, Notification.MOVE, Notification.ADD, Notification.ADD_MANY, Notification.REMOVE, Notification.REMOVE_MANY);
	private List<Integer> allowedEventTypes_item = List.of(Notification.SET);
	private List<Integer> allowedEventTypes_list = List.of(Notification.ADD, Notification.ADD_MANY, Notification.REMOVE, Notification.REMOVE_MANY, Notification.MOVE);
	
	public SerializationAdapter(XtextEObject containerObject) {
		this.containerObject = containerObject;
	}
	
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		if (notification.getNotifier() instanceof EObject) {
			EObject notifier = (EObject) notification.getNotifier();	
			ResourceImpl resource = (ResourceImpl) notifier.eResource();
			if (resource != null && resource.isLoaded() && !resource.isLoading()) {
				ENamedElement feature = (ENamedElement) notification.getFeature();
				String featureName = (feature != null) ? feature.getName() : null;
				int eventType = notification.getEventType();
				if (containerObject.getClass().isInstance(notifier) && containerObject.getDerivedObjectsProperties().containsKey(featureName)) {
					DerivedObjectProperties derivedObjectProperties = containerObject.getDerivedObjectsProperties().get(featureName);					
					List<Integer> allowedEventTypes;
					boolean isObjectAdded;
					boolean isObjectRemoved;
					if (derivedObjectProperties.isMany()) {
						allowedEventTypes = allowedEventTypes_list;
						isObjectAdded = eventTypes_added.contains(eventType);
						isObjectRemoved = eventTypes_removed.contains(eventType);
					}
					else {
						allowedEventTypes = allowedEventTypes_item;
						isObjectAdded = (allowedEventTypes_item.contains(eventType) && notification.getOldValue() == null && notification.getNewValue() != null);
						isObjectRemoved = (allowedEventTypes_item.contains(eventType) && notification.getOldValue() != null && notification.getNewValue() == null);
					}
					if (allowedEventTypes.contains(eventType)) {
						DerivedObjectUtility.serializeObject(derivedObjectProperties, true);
						DerivedObjectUtility.updateReferencesAdapters(derivedObjectProperties, isObjectAdded, isObjectRemoved, notification.getNewValue(), notification.getOldValue());
					}
				}
				else if (eventTypes_changed.contains(eventType)) {
					Entry<XtextEObject, EObject> identicalDerivedObject = DerivedObjectUtility.getXtextEObjectContainer(notifier);
					if (identicalDerivedObject != null) {
						for (Map.Entry<String, DerivedObjectProperties> entry : identicalDerivedObject.getKey().getDerivedObjectsProperties().entrySet()) {
							DerivedObjectProperties derivedObjectProperties = entry.getValue();
							boolean containsObject = DerivedObjectUtility.containsObject(derivedObjectProperties, identicalDerivedObject.getValue());
							if (containsObject) {
								boolean hasException = DerivedObjectUtility.serializeObject(derivedObjectProperties, true);					
								if (!hasException && feature instanceof EReference) {		
									ReferencesUtility.getInstance().updateReferencesAdapters(derivedObjectProperties, (EObject)notifier, notification.getOldValue(), notification.getNewValue());
								}
							}
						}
					}
				}
			}
		}
	}
}