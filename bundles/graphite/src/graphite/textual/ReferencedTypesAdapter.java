package graphite.textual;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentAdapter;
import graphite.shared.DerivedObjectProperties;

public class ReferencedTypesAdapter extends EContentAdapter {
		
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		if (notification.getEventType() == Notification.SET && notification.getNotifier() instanceof EObject) {
			EObject notifier = (EObject)notification.getNotifier();
			Resource resource = notifier.eResource();
			if (resource != null) {
				for (EObject content: resource.getContents()) {
					setDerivedObjects(content, notifier);
				}
			}
		}
	}
	
	public void setDerivedObjects(EObject object, EObject notifier) {
		if (object instanceof XtextEObject) {
			setDerivedObjects((XtextEObject)object, notifier);
		}
		for (EObject contentObject: object.eContents()) {
			setDerivedObjects(contentObject, notifier);
		}
	}
	
	public void setDerivedObjects(XtextEObject xtextEObject, EObject notifier) {
		for (DerivedObjectProperties derivedObjectProperties: xtextEObject.getDerivedObjectsProperties().values()) {
			if (derivedObjectProperties.isInvalid()) {
				if (XtextUtility.isReferencedType(derivedObjectProperties.getReferencedTypes(), notifier.eClass())) {
					DerivedObjectUtility.setDeriveObjectOrParsedString(derivedObjectProperties);
				}
			}
		}
	}

}
