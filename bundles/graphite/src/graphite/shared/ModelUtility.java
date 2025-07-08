package graphite.shared;

import java.util.Map;
import java.util.Objects;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.xtext.impl.GrammarImpl;
import org.eclipse.xtext.util.SimpleAttributeResolver;
import org.eclipse.xtext.xtext.GrammarResource;

import graphite.textual.XtextModel;

@SuppressWarnings({ "unchecked", "rawtypes", "restriction" })
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
			if (!Objects.equals(structuralFeature.getName(), getIdentifierAttribute(oldObject))) {
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
	
	public static SimpleAttributeResolver<EObject, String> getResolver(EObject object) {
		for (Map.Entry<Class, SimpleAttributeResolver<EObject, String>> resolverEntry : WorkbenchData.getModelData().getResolvers().entrySet()) {		    
		    if (resolverEntry.getKey().isInstance(object)) {
		    	return resolverEntry.getValue();
		    }
		}
		return SimpleAttributeResolver.NAME_RESOLVER;
	}
	
	public static EAttribute getIdentifierAttribute(EObject object) {
		SimpleAttributeResolver<EObject, String> resolver = getResolver(object);
		return resolver.getAttribute(object);	
	}
	
	public static Diagnostic runEMFValidator(final EObject eObject) {
		return new Diagnostician() {
			
			@Override
			public String getObjectLabel(EObject eObject) {
				return EMFCoreUtil.getQualifiedName(eObject, true);
			}
		}.validate(eObject);
	}
	
	public static String firstToUpperCase(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}
		return input.substring(0, 1).toUpperCase() + input.substring(1);
	}
	
	public static String getGrammarName(XtextModel xtextModel) {
		GrammarResource grammarResource = (GrammarResource)xtextModel.getResource();
 		GrammarImpl grammarImpl = (GrammarImpl)grammarResource.getContents().get(0);
 		return grammarImpl.getName();
	}
}