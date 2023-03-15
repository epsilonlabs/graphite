package graphite.textual;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;

import graphite.shared.DerivedObjectProperties;

@SuppressWarnings("rawtypes")
public interface XtextEObject extends EObject {

	public Map<Class, Map<String, DerivedObjectProperties>> getDerivedObjectsPropertiesByType();
	public Map<String, DerivedObjectProperties> getDerivedObjectsProperties();
	
}