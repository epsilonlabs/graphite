package workload.impl;

import java.util.Map;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.util.SimpleAttributeResolver;

import graphite.shared.DerivedPropertyData;

import workload.Effort;

@SuppressWarnings("rawtypes")
public class PropertiesData {

	public static class DerivedObjectClassContainer {
		public final static Class TASK = XtextTaskImpl.class;
	}
	
	public static class DerivedObjectName {
		public final static String TASK__EFFORTS = "efforts";
	}
	
	public static class DerivedObjectType {
		public final static Class TASK__EFFORTS = Effort.class;
	}
	
	public static class DerivedObjectIsMany {
		public final static boolean TASK__EFFORTS = true;
	}
	
	public static class ParsedStringName {
		public final static String TASK__EFFORTS_EXPRESSION = "effortsExpression";
	}
	
	public static class GrammarName {
		public final static String TASK__EFFORTS_EXPRESSION = "workload.xtext_grammar.Efforts";
	}
	
	public static class GrammarEntryRule {
		public final static String TASK__EFFORTS_EXPRESSION = "Main";
	}
	
	public static class GrammarSetup {
		public final static ISetup TASK__EFFORTS_EXPRESSION = new workload.xtext_grammar.EffortsStandaloneSetup();
	}
	
	public static class GrammarPlugin {
		public final static Plugin TASK__EFFORTS_EXPRESSION = workload.xtext_grammar.ui.internal.Xtext_grammarActivator.getInstance();
	}

	public final static Map<Class, Map<String, DerivedPropertyData>> derivedPropertiesData = Map.ofEntries(
	 	Map.entry(DerivedObjectClassContainer.TASK, Map.ofEntries(
			Map.entry(DerivedObjectName.TASK__EFFORTS, new DerivedPropertyData(DerivedObjectName.TASK__EFFORTS, ParsedStringName.TASK__EFFORTS_EXPRESSION, GrammarName.TASK__EFFORTS_EXPRESSION, GrammarEntryRule.TASK__EFFORTS_EXPRESSION, GrammarSetup.TASK__EFFORTS_EXPRESSION, GrammarPlugin.TASK__EFFORTS_EXPRESSION, DerivedObjectClassContainer.TASK, DerivedObjectType.TASK__EFFORTS, DerivedObjectIsMany.TASK__EFFORTS)))));					
		
	public final static Map<Class, Map<String, String>> derivedPairsMappings = Map.ofEntries(
	 	Map.entry(DerivedObjectClassContainer.TASK, Map.ofEntries(
			Map.entry(ParsedStringName.TASK__EFFORTS_EXPRESSION, DerivedObjectName.TASK__EFFORTS))));					
	
	public final static Map<Class, String> identifierAttributeByType = Map.ofEntries(
		/* protected region identifierAttributeByType on begin */
		Map.entry(Effort.class, "person")
		/* protected region identifierAttributeByType end */
	);
	
	public final static Map<Class, SimpleAttributeResolver<EObject, String>> resolvers = Map.of(
		/* protected region resolvers on begin */
		
		/* protected region resolvers end */
	);
	
}