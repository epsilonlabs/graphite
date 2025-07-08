package TestingPackage.impl;

import java.util.Map;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.util.SimpleAttributeResolver;

import graphite.shared.DerivedPropertyData;

import TestingPackage.StandardGrammar.Condition;
import TestingPackage.FuzzingOperations.impl.XtextConditionBasedActivationImpl;
import TestingPackage.FuzzingOperations.impl.XtextConditionBasedTimeLimitedImpl;

@SuppressWarnings("rawtypes")
public class PropertiesData {

	public static class DerivedObjectClassContainer {
		public final static Class CONDITIONBASEDACTIVATION = XtextConditionBasedActivationImpl.class;
		public final static Class CONDITIONBASEDTIMELIMITED = XtextConditionBasedTimeLimitedImpl.class;
	}
	
	public static class DerivedObjectName {
		public final static String CONDITIONBASEDACTIVATION__STARTING = "starting";
		public final static String CONDITIONBASEDACTIVATION__ENDING = "ending";
		public final static String CONDITIONBASEDTIMELIMITED__STARTING = "starting";
	}
	
	public static class DerivedObjectType {
		public final static Class CONDITIONBASEDACTIVATION__STARTING = Condition.class;
		public final static Class CONDITIONBASEDACTIVATION__ENDING = Condition.class;
		public final static Class CONDITIONBASEDTIMELIMITED__STARTING = Condition.class;
	}
	
	public static class DerivedObjectIsMany {
		public final static boolean CONDITIONBASEDACTIVATION__STARTING = false;
		public final static boolean CONDITIONBASEDACTIVATION__ENDING = false;
		public final static boolean CONDITIONBASEDTIMELIMITED__STARTING = false;
	}
	
	public static class ParsedStringName {
		public final static String CONDITIONBASEDACTIVATION__STARTING_EXPRESSION = "startingExpression";
		public final static String CONDITIONBASEDACTIVATION__ENDING_EXPRESSION = "endingExpression";
		public final static String CONDITIONBASEDTIMELIMITED__STARTING_EXPRESSION = "startingExpression";
	}
	
	public static class GrammarName {
		public final static String CONDITIONBASEDACTIVATION__STARTING_EXPRESSION = "sesame.conditionBasedActivation.startingEndingExpression.ConditionsDsl";
		public final static String CONDITIONBASEDACTIVATION__ENDING_EXPRESSION = "sesame.conditionBasedActivation.startingEndingExpression.ConditionsDsl";
		public final static String CONDITIONBASEDTIMELIMITED__STARTING_EXPRESSION = "sesame.conditionBasedTimeLimited.startingExpression.ConditionsDsl";
	}
	
	public static class GrammarEntryRule {
		public final static String CONDITIONBASEDACTIVATION__STARTING_EXPRESSION = "ConditionBasedActivationStarting";
		public final static String CONDITIONBASEDACTIVATION__ENDING_EXPRESSION = "ConditionBasedActivationEnding";
		public final static String CONDITIONBASEDTIMELIMITED__STARTING_EXPRESSION = "ConditionBasedTimeLimited";
	}
	
	public static class GrammarSetup {
		public final static ISetup CONDITIONBASEDACTIVATION__STARTING_EXPRESSION = new sesame.conditionBasedActivation.startingEndingExpression.ConditionsDslStandaloneSetup();
		public final static ISetup CONDITIONBASEDACTIVATION__ENDING_EXPRESSION = new sesame.conditionBasedActivation.startingEndingExpression.ConditionsDslStandaloneSetup();
		public final static ISetup CONDITIONBASEDTIMELIMITED__STARTING_EXPRESSION = new sesame.conditionBasedTimeLimited.startingExpression.ConditionsDslStandaloneSetup();
	}
	
	public static class GrammarPlugin {
		public final static Plugin CONDITIONBASEDACTIVATION__STARTING_EXPRESSION = sesame.conditionBasedActivation.startingEndingExpression.ui.internal.StartingEndingExpressionActivator.getInstance();
		public final static Plugin CONDITIONBASEDACTIVATION__ENDING_EXPRESSION = sesame.conditionBasedActivation.startingEndingExpression.ui.internal.StartingEndingExpressionActivator.getInstance();
		public final static Plugin CONDITIONBASEDTIMELIMITED__STARTING_EXPRESSION = sesame.conditionBasedTimeLimited.startingExpression.ui.internal.StartingExpressionActivator.getInstance();
	}

	public final static Map<Class, Map<String, DerivedPropertyData>> derivedPropertiesData = Map.ofEntries(
	 	Map.entry(DerivedObjectClassContainer.CONDITIONBASEDACTIVATION, Map.ofEntries(
			Map.entry(DerivedObjectName.CONDITIONBASEDACTIVATION__STARTING, new DerivedPropertyData(DerivedObjectName.CONDITIONBASEDACTIVATION__STARTING, ParsedStringName.CONDITIONBASEDACTIVATION__STARTING_EXPRESSION, GrammarName.CONDITIONBASEDACTIVATION__STARTING_EXPRESSION, GrammarEntryRule.CONDITIONBASEDACTIVATION__STARTING_EXPRESSION, GrammarSetup.CONDITIONBASEDACTIVATION__STARTING_EXPRESSION, GrammarPlugin.CONDITIONBASEDACTIVATION__STARTING_EXPRESSION, DerivedObjectClassContainer.CONDITIONBASEDACTIVATION, DerivedObjectType.CONDITIONBASEDACTIVATION__STARTING, DerivedObjectIsMany.CONDITIONBASEDACTIVATION__STARTING)),					
			Map.entry(DerivedObjectName.CONDITIONBASEDACTIVATION__ENDING, new DerivedPropertyData(DerivedObjectName.CONDITIONBASEDACTIVATION__ENDING, ParsedStringName.CONDITIONBASEDACTIVATION__ENDING_EXPRESSION, GrammarName.CONDITIONBASEDACTIVATION__ENDING_EXPRESSION, GrammarEntryRule.CONDITIONBASEDACTIVATION__ENDING_EXPRESSION, GrammarSetup.CONDITIONBASEDACTIVATION__ENDING_EXPRESSION, GrammarPlugin.CONDITIONBASEDACTIVATION__ENDING_EXPRESSION, DerivedObjectClassContainer.CONDITIONBASEDACTIVATION, DerivedObjectType.CONDITIONBASEDACTIVATION__ENDING, DerivedObjectIsMany.CONDITIONBASEDACTIVATION__ENDING)))),					
	 	Map.entry(DerivedObjectClassContainer.CONDITIONBASEDTIMELIMITED, Map.ofEntries(
			Map.entry(DerivedObjectName.CONDITIONBASEDTIMELIMITED__STARTING, new DerivedPropertyData(DerivedObjectName.CONDITIONBASEDTIMELIMITED__STARTING, ParsedStringName.CONDITIONBASEDTIMELIMITED__STARTING_EXPRESSION, GrammarName.CONDITIONBASEDTIMELIMITED__STARTING_EXPRESSION, GrammarEntryRule.CONDITIONBASEDTIMELIMITED__STARTING_EXPRESSION, GrammarSetup.CONDITIONBASEDTIMELIMITED__STARTING_EXPRESSION, GrammarPlugin.CONDITIONBASEDTIMELIMITED__STARTING_EXPRESSION, DerivedObjectClassContainer.CONDITIONBASEDTIMELIMITED, DerivedObjectType.CONDITIONBASEDTIMELIMITED__STARTING, DerivedObjectIsMany.CONDITIONBASEDTIMELIMITED__STARTING)))));					
		
	public final static Map<Class, Map<String, String>> derivedPairsMappings = Map.ofEntries(
	 	Map.entry(DerivedObjectClassContainer.CONDITIONBASEDACTIVATION, Map.ofEntries(
			Map.entry(ParsedStringName.CONDITIONBASEDACTIVATION__STARTING_EXPRESSION, DerivedObjectName.CONDITIONBASEDACTIVATION__STARTING),					
			Map.entry(ParsedStringName.CONDITIONBASEDACTIVATION__ENDING_EXPRESSION, DerivedObjectName.CONDITIONBASEDACTIVATION__ENDING))),					
	 	Map.entry(DerivedObjectClassContainer.CONDITIONBASEDTIMELIMITED, Map.ofEntries(
			Map.entry(ParsedStringName.CONDITIONBASEDTIMELIMITED__STARTING_EXPRESSION, DerivedObjectName.CONDITIONBASEDTIMELIMITED__STARTING))));					
	
	public final static Map<Class, String> identifierAttributeByType = Map.ofEntries(
		/* protected region identifierAttributeByType on begin */
		Map.entry(Condition.class, "c")
		/* protected region identifierAttributeByType end */
	);
	
	public final static Map<Class, SimpleAttributeResolver<EObject, String>> resolvers = Map.of(
		/* protected region resolvers on begin */
		
		/* protected region resolvers end */
	);
	
}