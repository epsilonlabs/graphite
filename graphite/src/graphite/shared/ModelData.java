package graphite.shared;

import java.util.Map;
import org.eclipse.emf.ecore.EFactory;

@SuppressWarnings("rawtypes")
public class ModelData {
	
	private EFactory xtextFactory;
	private Map<Class, Map<String, DerivedPropertyData>> derivedPropertiesData;
	private Map<Class, Map<String, String>> derivedPairsMappings;
	private Map<Class, String> identifierByType;
	
	public ModelData(EFactory xtextFactory, Map<Class, Map<String, DerivedPropertyData>> derivedPropertiesData, Map<Class, Map<String, String>> derivedPairsMappings, Map<Class, String> identifierByType) {
		this.xtextFactory = xtextFactory;
		this.derivedPropertiesData = derivedPropertiesData;
		this.derivedPairsMappings = derivedPairsMappings;
		this.identifierByType = identifierByType;
	}
	
	public EFactory getXtextFactory() {
		return xtextFactory;
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

}