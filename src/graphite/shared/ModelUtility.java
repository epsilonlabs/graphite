package graphite.shared;

import java.util.Objects;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class ModelUtility {

	public static String getIdentifierName(Object object) {			
		for (Class clazz : WorkbenchData.getModelData().getIdentifierByType().keySet()) {
		    if (clazz.isAssignableFrom(object.getClass())) {
		    	return WorkbenchData.getModelData().getIdentifierByType().get(clazz);
		    }
		}
		return "name";
	}
	
	public static String getIdentifierName(Class clazz) {			
		String identifierName = WorkbenchData.getModelData().getIdentifierByType().get(clazz);
		return (identifierName != null) ? identifierName : "name";
	}
	
	public static String getIdentifierMethodName(Class clazz) {
		String identifierName = getIdentifierName(clazz);
		return "get" + identifierName.substring(0, 1).toUpperCase() + identifierName.substring(1);
	}
	
	public static void mergeObjects(EObject newObject, EObject oldObject) {
		for (EStructuralFeature structuralFeature: newObject.eClass().getEAllStructuralFeatures()) {
			if (!Objects.equals(structuralFeature.getName(), getIdentifierName(oldObject))) {
				oldObject.eSet(structuralFeature, newObject.eGet(structuralFeature));
			}
		}
	}
	
	public static String getGetterMethodName(String property) {
		return "get" + property.substring(0, 1).toUpperCase() + property.substring(1);
	}
	
	public static String getSetterMethodName(String property) {
		return "set" + property.substring(0, 1).toUpperCase() + property.substring(1);
	}
	
}