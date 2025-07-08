package graphite.shared;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import graphite.textual.DerivedObjectUtility;
import graphite.textual.ReferencedTypesAdapter;
import graphite.textual.SerializationAdapter;
import graphite.textual.XtextEObject;

@SuppressWarnings("rawtypes")
public class CustomEObjectImpl extends EObjectImpl {
	
	protected Map<Class, Map<String, DerivedObjectProperties>> derivedObjectsPropertiesByType;
	protected Map<String, DerivedObjectProperties> derivedObjectsProperties;
      
	public CustomEObjectImpl() {
		super();
		if (this instanceof XtextEObject) {
			initializeXtextEObject((XtextEObject)this);
		}
		else {
			this.eAdapters().add(new ReferencedTypesAdapter());
		}
	}
	
	private void initializeXtextEObject(XtextEObject object) {
		object.eAdapters().add(new SerializationAdapter(object));
		derivedObjectsProperties = DerivedObjectUtility.getDerivedObjectsProperties(object, WorkbenchData.getModelData().getDerivedPropertiesData());
		derivedObjectsPropertiesByType = DerivedObjectUtility.getDerivedObjectsPropertiesByType(derivedObjectsProperties);
	}
	
	public Map<Class, Map<String, DerivedObjectProperties>> getDerivedObjectsPropertiesByType() {
		return derivedObjectsPropertiesByType;
	}

	public Map<String, DerivedObjectProperties> getDerivedObjectsProperties() {
		return derivedObjectsProperties;
	}
	
	@Override
	public void eNotify(Notification notification) {
		List<Adapter> adapters = getAdapters();
		if (adapters != null) {
	    	for (Adapter adapter : adapters) {
	    		adapter.notifyChanged(notification);
	    	}
		}
	}
	
	private List<Adapter> getAdapters() { //places the ReferencedTypesAdapters and ReferencesAdapters last in the list to avoid potential event conflicts
		Adapter[] eAdapters = eBasicAdapterArray();
	    if (eAdapters != null && eDeliver()) {
	    	List<Adapter> referencesAdapters = new ArrayList<Adapter>();
	    	List<Adapter> referencedTypesAdapters = new ArrayList<Adapter>();
	    	List<Adapter> eAdaptersList = new ArrayList<Adapter>(Arrays.asList(eAdapters));
	    	for (int i = 0; i < eAdaptersList.size(); i++) {
	    		if (eAdaptersList.get(i) instanceof ReferencesAdapter) {
	    			referencesAdapters.add(eAdaptersList.get(i));
	    		}
	    		else if (eAdaptersList.get(i) instanceof ReferencedTypesAdapter) {
	    			referencedTypesAdapters.add(eAdaptersList.get(i));
	    		}
	    	}
	    	eAdaptersList.removeAll(referencedTypesAdapters);
	    	eAdaptersList.addAll(referencedTypesAdapters);
	    	eAdaptersList.removeAll(referencesAdapters);
	    	eAdaptersList.addAll(referencesAdapters);
	    	return eAdaptersList;
	    }
	    return null;
	}
	
}