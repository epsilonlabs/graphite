package graphite.textual;

import java.lang.reflect.Method;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import com.google.inject.Injector;

import graphite.shared.DerivedObjectProperties;
import graphite.shared.DerivedPropertyData;
import graphite.shared.ModelUtility;
import graphite.shared.ReferencesUtility;
import graphite.shared.Settings;
import graphite.shared.ErrorReportingUtility;
import graphite.shared.WorkbenchData;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class DerivedObjectUtility {
	
	public static void setDerivedObjects(EObject object) {
		EList<EObject> contents = object.eContents();
		for (EObject content : contents) {
			 if (content instanceof XtextEObject) {
				 setDerivedObjects((XtextEObject)content);
			 }
			 setDerivedObjects(content);
		}
	}
	
	public static void setDerivedObjects(XtextEObject object) {
		for (DerivedObjectProperties derivedObjectProperties: object.getDerivedObjectsProperties().values()) {
			setDeriveObjectOrParsedString(derivedObjectProperties);
		}
	}
	
	public static void setDeriveObjectOrParsedString(DerivedObjectProperties derivedObjectProperties) {
		try {
 			derivedObjectProperties.getDerivedObjectGetter().setAccessible(true);
			derivedObjectProperties.getParsedStringField().setAccessible(true);
			Object derivedObject = derivedObjectProperties.getDerivedObjectGetter().invoke(derivedObjectProperties.getContainerObject());
			String parsedString = (String) derivedObjectProperties.getParsedStringField().get(derivedObjectProperties.getContainerObject());
			boolean isEmptyDerivedObject = (derivedObject instanceof List) ? (((List)derivedObject).size() == 0) : (derivedObject == null);
			if (!isEmptyDerivedObject && (parsedString == null || parsedString.trim().isEmpty())) {
				DerivedObjectUtility.serializeObject(derivedObjectProperties, false);
				parsedString = (String) derivedObjectProperties.getParsedStringField().get(derivedObjectProperties.getContainerObject());
			}	
			setDeriveObject(derivedObjectProperties, parsedString, derivedObject);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void setDeriveObject(DerivedObjectProperties derivedObjectProperties) {
		try {
			derivedObjectProperties.getDerivedObjectGetter().setAccessible(true);
			derivedObjectProperties.getParsedStringField().setAccessible(true);
			Object derivedObject = derivedObjectProperties.getDerivedObjectGetter().invoke(derivedObjectProperties.getContainerObject());
			String parsedString = (String) derivedObjectProperties.getParsedStringField().get(derivedObjectProperties.getContainerObject());
			setDeriveObject(derivedObjectProperties, parsedString, derivedObject);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void setDeriveObject(DerivedObjectProperties derivedObjectProperties, String parsedString, Object derivedObject) {
		if(!derivedObjectProperties.getLock().isLocked() && (!Objects.equals(parsedString, derivedObjectProperties.getLastParsedString()) || derivedObjectProperties.isInvalid())) {
			derivedObjectProperties.getLock().lock();
			Object newDerivedObject = deserializeObject(derivedObjectProperties, parsedString);
			if (!derivedObjectProperties.isInvalid()) {
				if (newDerivedObject instanceof EList) {
	 				setDerivedObjects(derivedObjectProperties, (EList)derivedObject, (EList)newDerivedObject);
				}
				else {
					setDerivedObject(derivedObjectProperties, (EObject)derivedObject, (EObject)newDerivedObject);
				}
			}
			ErrorReportingUtility.validateEditor();
			derivedObjectProperties.getLock().unlock();
		}
	}
	
	public static void setDerivedObject(DerivedObjectProperties derivedObjectProperties, EObject currentDerivedObject, EObject newDerivedObject) {
		derivedObjectProperties.getDerivedObjectSetter().setAccessible(true);
		Object derivedObject = derivedObjectProperties.isInvalid() ? null : newDerivedObject;
		if (Settings.isMergeDerivedModelElements() && isIdenticalDerivedObject(derivedObjectProperties, newDerivedObject, currentDerivedObject)) {
			ModelUtility.mergeObjects(newDerivedObject, currentDerivedObject);
		}
		else {
			try {
				derivedObjectProperties.getDerivedObjectSetter().invoke(derivedObjectProperties.getContainerObject(), derivedObject);
				ReferencesUtility.getInstance().clearReferencesAdapters(derivedObjectProperties);		
				ReferencesUtility.getInstance().addReferencesAdapters(derivedObjectProperties, derivedObject);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void setDerivedObjects(DerivedObjectProperties derivedObjectProperties, EList<EObject> currentDerivedObjects, EList<EObject> newDerivedObjects) {		
		if (Settings.isMergeDerivedModelElements()) {
			if (currentDerivedObjects.size() > 0) {
				for(int i = 0; i < currentDerivedObjects.size(); i++) {
					Entry identicalDerivedObject = getIdenticalDerivedObject(derivedObjectProperties, currentDerivedObjects.get(i), newDerivedObjects);
					if (identicalDerivedObject == null) {
						currentDerivedObjects.remove(i--);
					}
				}
			}
			if (newDerivedObjects != null) {
				for(int i = 0; i < newDerivedObjects.size(); i++) {
					Entry identicalDerivedObject = getIdenticalDerivedObject(derivedObjectProperties, newDerivedObjects.get(i), currentDerivedObjects);
					if (identicalDerivedObject != null) {	
						ModelUtility.mergeObjects(newDerivedObjects.get(i), (EObject)identicalDerivedObject.getValue());
						if (i != (int)identicalDerivedObject.getKey()) {
							currentDerivedObjects.move(i, (int)identicalDerivedObject.getKey());
						}
					}
					else {
						currentDerivedObjects.add(i, newDerivedObjects.get(i));
					}
				}
			}
		}
		else {
			if (!currentDerivedObjects.isEmpty()) {
				currentDerivedObjects.clear();
				ReferencesUtility.getInstance().clearReferencesAdapters(derivedObjectProperties);
			}
			if (newDerivedObjects != null && !newDerivedObjects.isEmpty()) {
				currentDerivedObjects.addAll(newDerivedObjects);
				ReferencesUtility.getInstance().addReferencesAdapters(derivedObjectProperties, currentDerivedObjects);		
			}	
		}
	}
	
	public static Object deserializeObject(DerivedObjectProperties derivedObjectProperties, String parsedString) {
		derivedObjectProperties.getDerivedObjectGetter().setAccessible(true);
		Resource derivedResource = XtextUtility.deserializeString(derivedObjectProperties, parsedString);
		Object model = derivedResource.getContents().get(0);
		Object deserializedObject = null;
		try {
			deserializedObject = derivedObjectProperties.getDerivedObjectGetter().invoke(model);
		} catch (Exception e) {
			e.printStackTrace();
		}	
		if (deserializedObject instanceof EObjectContainmentEList) {
			return new BasicEList<EObject>((EObjectContainmentEList)deserializedObject);
		}
		return deserializedObject;
	}
	
	public static boolean containsObject(DerivedObjectProperties derivedObjectProperties, Object object) {
		try {
			derivedObjectProperties.getDerivedObjectGetter().setAccessible(true);
			Object derivedObject = derivedObjectProperties.getDerivedObjectGetter().invoke(derivedObjectProperties.getContainerObject());
			return derivedObjectProperties.isMany() ? ((List)derivedObject).contains(object) : Objects.equals(derivedObject, object);
		} 
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static void updateReferencesAdapters(DerivedObjectProperties derivedObjectProperties, boolean isObjectAdded, boolean isObjectRemoved, Object addedObject, Object removedObject) {
		if (isObjectAdded) {
			ReferencesUtility.getInstance().addReferencesAdapters(derivedObjectProperties, addedObject);
		}
		if (isObjectRemoved) {
			ReferencesUtility.getInstance().removeReferences(removedObject);
			ReferencesUtility.getInstance().removeReferencesAdapters(derivedObjectProperties, removedObject);
		}
	}
	
	public static boolean serializeObject(DerivedObjectProperties derivedObjectProperties, boolean isSetLastParsed) {
		boolean hasException = false;
		if(!derivedObjectProperties.getLock().isLocked()) {
			derivedObjectProperties.getLock().lock();
			try {
				derivedObjectProperties.getSuperclazzConstructor().setAccessible(true);
				derivedObjectProperties.getDerivedObjectField().setAccessible(true);
				derivedObjectProperties.getParsedStringField().setAccessible(true);
				Object containerObject = derivedObjectProperties.getSuperclazzConstructor().newInstance();
				Object derivedObject = derivedObjectProperties.getDerivedObjectField().get(derivedObjectProperties.getContainerObject());
				derivedObjectProperties.getDerivedObjectField().set(containerObject, derivedObject);
				String serializationResult = XtextUtility.serializeObject((EObject)containerObject, derivedObjectProperties.getGrammar());
				derivedObjectProperties.getParsedStringField().set(derivedObjectProperties.getContainerObject(), serializationResult);
				if (derivedObjectProperties.isInvalid()) { //serializationResult is always a syntactically correct string
					derivedObjectProperties.setInvalid(true);
					derivedObjectProperties.setParseErrors(null);
				}
				ErrorReportingUtility.validateEditor();
				if (isSetLastParsed) {
					derivedObjectProperties.setLastParsedString(serializationResult);
				}
			} catch (Exception e) {
				hasException = true;
				System.out.println("[Object could not be parsed]: " + e.getMessage());
			}
			derivedObjectProperties.getLock().unlock();
		}
		return hasException;
	}

	public static Map<String, DerivedObjectProperties> getDerivedObjectsProperties(XtextEObject containerObject, Map<Class, Map<String, DerivedPropertyData>> derivedPropertiesData) {
		Map<String, DerivedObjectProperties> derivedObjectsProperties = new HashMap<String, DerivedObjectProperties>();
		for (DerivedPropertyData deriverPropertyData : derivedPropertiesData.get(containerObject.getClass()).values()) {
		    DerivedObjectProperties derivedObjectProperties = new DerivedObjectProperties(deriverPropertyData, containerObject);
		    derivedObjectsProperties.put(deriverPropertyData.getDerivedObjectName(), derivedObjectProperties);
		}
		return derivedObjectsProperties;
	}
	
	public static Map<Class, Map<String, DerivedObjectProperties>> getDerivedObjectsPropertiesByType(Map<String, DerivedObjectProperties> derivedObjectsProperties) {
		Map<Class, Map<String, DerivedObjectProperties>> derivedObjectsPropertiesByType = new HashMap<Class, Map<String, DerivedObjectProperties>>();
		for (Map.Entry<String, DerivedObjectProperties> entry : derivedObjectsProperties.entrySet()) {
			Map<String, DerivedObjectProperties> derivedObjectsPropertiesOfType = null;
			if (derivedObjectsPropertiesByType.containsKey(entry.getValue().getType())) {
				derivedObjectsPropertiesOfType = derivedObjectsPropertiesByType.get(entry.getValue().getType());
		    }
			else {
				derivedObjectsPropertiesOfType = new HashMap<String, DerivedObjectProperties>();
		    	derivedObjectsPropertiesByType.put(entry.getValue().getType(), derivedObjectsPropertiesOfType);
			}
			derivedObjectsPropertiesOfType.put(entry.getKey(), entry.getValue());
		}
		return derivedObjectsPropertiesByType;
	}
	
	public static boolean isIdenticalDerivedObject(DerivedObjectProperties derivedObjectProperties, EObject newDerivedObject, EObject oldDerivedObject) {
		if (newDerivedObject != null && oldDerivedObject != null) {
			try {
				Object identifierNewDerivedObject = derivedObjectProperties.getIdentifierGetterMethod().invoke(newDerivedObject);
				Object identifierOldDerivedObject = derivedObjectProperties.getIdentifierGetterMethod().invoke(oldDerivedObject);
				return Objects.equals(identifierNewDerivedObject, identifierOldDerivedObject);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	public static Entry<Integer, EObject> getIdenticalDerivedObject(DerivedObjectProperties derivedObjectProperties, EObject newDerivedObject, List<EObject> oldDerivedObjects) {
		try {
			Object identifierNewDerivedObject = derivedObjectProperties.getIdentifierGetterMethod().invoke(newDerivedObject);
			for (int i = 0; i < oldDerivedObjects.size(); i++) {
				Object identifierOldDerivedObject = derivedObjectProperties.getIdentifierGetterMethod().invoke(oldDerivedObjects.get(i));
				if (Objects.equals(identifierNewDerivedObject, identifierOldDerivedObject)) {
					return new AbstractMap.SimpleEntry<>(i, oldDerivedObjects.get(i));
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void setParsedString(DerivedObjectProperties derivedObjectProperties, String text) {		
		try {
			derivedObjectProperties.getParsedStringSetter().setAccessible(true);
			derivedObjectProperties.getParsedStringSetter().invoke(derivedObjectProperties.getContainerObject(), text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getParsedString(DerivedObjectProperties derivedObjectProperties) {		
		try {
			derivedObjectProperties.getParsedStringGetter().setAccessible(true);
			return (String) derivedObjectProperties.getParsedStringGetter().invoke(derivedObjectProperties.getContainerObject());
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static DerivedObjectProperties getDerivedObjectProperties(XtextEObject object, EStructuralFeature eStructuralFeature) {
		if (WorkbenchData.getModelData().getDerivedPairsMappings().containsKey(object.getClass())) {
			Map<String, String> derivedPairMapping = WorkbenchData.getModelData().getDerivedPairsMappings().get(object.getClass());
			if (derivedPairMapping.containsKey(eStructuralFeature.getName())) {
				String derivedObjectName = derivedPairMapping.get(eStructuralFeature.getName());
				if (object.getDerivedObjectsProperties().containsKey(derivedObjectName)) {
					return object.getDerivedObjectsProperties().get(derivedObjectName);
				}
			}
		}
		return null;
	}
	
	public static boolean isParsedString(EObject object, EStructuralFeature eStructuralFeature) {
		if (object instanceof XtextEObject) {
    		return (DerivedObjectUtility.getDerivedObjectProperties((XtextEObject)object, eStructuralFeature) != null);
    	}
    	return false;	
	}
	
	public static Injector getGrammarInjector(DerivedObjectProperties derivedObjectProperties) {
		try {
			Method getInjectorMethod = derivedObjectProperties.getGrammarPlugin().getClass().getMethod("getInjector", String.class);	
			getInjectorMethod.setAccessible(true);
			return (Injector) getInjectorMethod.invoke(derivedObjectProperties.getGrammarPlugin(), derivedObjectProperties.getGrammarName());	
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static Entry<XtextEObject, EObject> getXtextEObjectContainer(EObject object) {
		EObject container = object.eContainer();
		if (container != null) {
			if (container instanceof XtextEObject) {
				return new AbstractMap.SimpleEntry<>((XtextEObject)container, object);
			}
			else {
				return getXtextEObjectContainer(container);
			}
		}
		return null;
	}
		
}