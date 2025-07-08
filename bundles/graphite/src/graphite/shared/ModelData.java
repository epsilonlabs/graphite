package graphite.shared;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.util.SimpleAttributeResolver;

@SuppressWarnings("rawtypes")
public class ModelData {
	
	private Map<Class, Map<String, DerivedPropertyData>> derivedPropertiesData;
	private Map<Class, Map<String, String>> derivedPairsMappings;
	private Map<Class, String> identifierByType;
	private Map<Class, SimpleAttributeResolver<EObject, String>> resolvers;
	
	public ModelData(Map<Class, Map<String, DerivedPropertyData>> derivedPropertiesData, Map<Class, Map<String, String>> derivedPairsMappings, Map<Class, String> identifierByType, Map<Class, SimpleAttributeResolver<EObject, String>> resolvers) {
		this.derivedPropertiesData = derivedPropertiesData;
		this.derivedPairsMappings = derivedPairsMappings;
		this.identifierByType = identifierByType;
		this.resolvers = resolvers;
	}
	
	public Map<Class, Map<String, DerivedPropertyData>> getDerivedPropertiesData() {
		return derivedPropertiesData;
	}
		
	public Map<Class, Map<String, String>> getDerivedPairsMappings() {
		return derivedPairsMappings;
	}
	
	public Map<Class, String> getIdentifierByType() {
		return identifierByType;
	}
	
	public Map<Class, SimpleAttributeResolver<EObject, String>> getResolvers() {
		return resolvers;
	}

}