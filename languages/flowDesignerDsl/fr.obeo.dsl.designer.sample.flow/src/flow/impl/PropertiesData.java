package flow.impl;

import java.util.Map;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.util.SimpleAttributeResolver;

import graphite.shared.DerivedPropertyData;

import flow.RoutingRule;

@SuppressWarnings("rawtypes")
public class PropertiesData {

	public static class DerivedObjectClassContainer {
		public final static Class COMPOSITEPROCESSOR = XtextCompositeProcessorImpl.class;
	}
	
	public static class DerivedObjectName {
		public final static String COMPOSITEPROCESSOR__ROUTING_RULES_LIST = "routingRulesList";
	}
	
	public static class DerivedObjectType {
		public final static Class COMPOSITEPROCESSOR__ROUTING_RULES_LIST = RoutingRule.class;
	}
	
	public static class DerivedObjectIsMany {
		public final static boolean COMPOSITEPROCESSOR__ROUTING_RULES_LIST = true;
	}
	
	public static class ParsedStringName {
		public final static String COMPOSITEPROCESSOR__ROUTING_RULES = "routingRules";
	}
	
	public static class GrammarName {
		public final static String COMPOSITEPROCESSOR__ROUTING_RULES = "fr.obeo.dsl.designer.sample.flow.xtext.FlowDesigner";
	}
	
	public static class GrammarEntryRule {
		public final static String COMPOSITEPROCESSOR__ROUTING_RULES = "Main";
	}
	
	public static class GrammarSetup {
		public final static ISetup COMPOSITEPROCESSOR__ROUTING_RULES = new fr.obeo.dsl.designer.sample.flow.xtext.FlowDesignerStandaloneSetup();
	}
	
	public static class GrammarPlugin {
		public final static Plugin COMPOSITEPROCESSOR__ROUTING_RULES = fr.obeo.dsl.designer.sample.flow.xtext.ui.internal.XtextActivator.getInstance();
	}

	public final static Map<Class, Map<String, DerivedPropertyData>> derivedPropertiesData = Map.ofEntries(
	 	Map.entry(DerivedObjectClassContainer.COMPOSITEPROCESSOR, Map.ofEntries(
			Map.entry(DerivedObjectName.COMPOSITEPROCESSOR__ROUTING_RULES_LIST, new DerivedPropertyData(DerivedObjectName.COMPOSITEPROCESSOR__ROUTING_RULES_LIST, ParsedStringName.COMPOSITEPROCESSOR__ROUTING_RULES, GrammarName.COMPOSITEPROCESSOR__ROUTING_RULES, GrammarEntryRule.COMPOSITEPROCESSOR__ROUTING_RULES, GrammarSetup.COMPOSITEPROCESSOR__ROUTING_RULES, GrammarPlugin.COMPOSITEPROCESSOR__ROUTING_RULES, DerivedObjectClassContainer.COMPOSITEPROCESSOR, DerivedObjectType.COMPOSITEPROCESSOR__ROUTING_RULES_LIST, DerivedObjectIsMany.COMPOSITEPROCESSOR__ROUTING_RULES_LIST)))));					
		
	public final static Map<Class, Map<String, String>> derivedPairsMappings = Map.ofEntries(
	 	Map.entry(DerivedObjectClassContainer.COMPOSITEPROCESSOR, Map.ofEntries(
			Map.entry(ParsedStringName.COMPOSITEPROCESSOR__ROUTING_RULES, DerivedObjectName.COMPOSITEPROCESSOR__ROUTING_RULES_LIST))));					
	
	public final static Map<Class, String> identifierAttributeByType = Map.ofEntries(
		/* protected region identifierAttributeByType on begin */
		
		/* protected region identifierAttributeByType end */
	);
	
	public final static Map<Class, SimpleAttributeResolver<EObject, String>> resolvers = Map.of(
		/* protected region resolvers on begin */
		
		/* protected region resolvers end */
	);
	
}