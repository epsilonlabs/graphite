package structurizr.impl;

import java.util.Map;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.util.SimpleAttributeResolver;

import graphite.shared.DerivedPropertyData;

import structurizr.ConditionElement;
import structurizr.IdentifiableElement;

@SuppressWarnings("rawtypes")
public class PropertiesData {

	public static class DerivedObjectClassContainer {
		public final static Class SYSTEMLANDSCAPEVIEW = XtextSystemLandscapeViewImpl.class;
		public final static Class SYSTEMCONTEXTVIEW = XtextSystemContextViewImpl.class;
		public final static Class CONTAINERVIEW = XtextContainerViewImpl.class;
		public final static Class COMPONENTVIEW = XtextComponentViewImpl.class;
	}
	
	public static class DerivedObjectName {
		public final static String SYSTEMLANDSCAPEVIEW__INCLUDE = "include";
		public final static String SYSTEMLANDSCAPEVIEW__EXCLUDE = "exclude";
		public final static String SYSTEMCONTEXTVIEW__INCLUDE = "include";
		public final static String SYSTEMCONTEXTVIEW__EXCLUDE = "exclude";
		public final static String CONTAINERVIEW__INCLUDE = "include";
		public final static String CONTAINERVIEW__EXCLUDE = "exclude";
		public final static String COMPONENTVIEW__INCLUDE = "include";
		public final static String COMPONENTVIEW__EXCLUDE = "exclude";
	}
	
	public static class DerivedObjectType {
		public final static Class SYSTEMLANDSCAPEVIEW__INCLUDE = ConditionElement.class;
		public final static Class SYSTEMLANDSCAPEVIEW__EXCLUDE = ConditionElement.class;
		public final static Class SYSTEMCONTEXTVIEW__INCLUDE = ConditionElement.class;
		public final static Class SYSTEMCONTEXTVIEW__EXCLUDE = ConditionElement.class;
		public final static Class CONTAINERVIEW__INCLUDE = ConditionElement.class;
		public final static Class CONTAINERVIEW__EXCLUDE = ConditionElement.class;
		public final static Class COMPONENTVIEW__INCLUDE = ConditionElement.class;
		public final static Class COMPONENTVIEW__EXCLUDE = ConditionElement.class;
	}
	
	public static class DerivedObjectIsMany {
		public final static boolean SYSTEMLANDSCAPEVIEW__INCLUDE = false;
		public final static boolean SYSTEMLANDSCAPEVIEW__EXCLUDE = false;
		public final static boolean SYSTEMCONTEXTVIEW__INCLUDE = false;
		public final static boolean SYSTEMCONTEXTVIEW__EXCLUDE = false;
		public final static boolean CONTAINERVIEW__INCLUDE = false;
		public final static boolean CONTAINERVIEW__EXCLUDE = false;
		public final static boolean COMPONENTVIEW__INCLUDE = false;
		public final static boolean COMPONENTVIEW__EXCLUDE = false;
	}
	
	public static class ParsedStringName {
		public final static String SYSTEMLANDSCAPEVIEW__INCLUDE_EXPRESSION = "includeExpression";
		public final static String SYSTEMLANDSCAPEVIEW__EXCLUDE_EXPRESSION = "excludeExpression";
		public final static String SYSTEMCONTEXTVIEW__INCLUDE_EXPRESSION = "includeExpression";
		public final static String SYSTEMCONTEXTVIEW__EXCLUDE_EXPRESSION = "excludeExpression";
		public final static String CONTAINERVIEW__INCLUDE_EXPRESSION = "includeExpression";
		public final static String CONTAINERVIEW__EXCLUDE_EXPRESSION = "excludeExpression";
		public final static String COMPONENTVIEW__INCLUDE_EXPRESSION = "includeExpression";
		public final static String COMPONENTVIEW__EXCLUDE_EXPRESSION = "excludeExpression";
	}
	
	public static class GrammarName {
		public final static String SYSTEMLANDSCAPEVIEW__INCLUDE_EXPRESSION = "structurizr.expressions.StructurizrExpressions";
		public final static String SYSTEMLANDSCAPEVIEW__EXCLUDE_EXPRESSION = "structurizr.expressions.StructurizrExpressions";
		public final static String SYSTEMCONTEXTVIEW__INCLUDE_EXPRESSION = "structurizr.expressions.StructurizrExpressions";
		public final static String SYSTEMCONTEXTVIEW__EXCLUDE_EXPRESSION = "structurizr.expressions.StructurizrExpressions";
		public final static String CONTAINERVIEW__INCLUDE_EXPRESSION = "structurizr.expressions.StructurizrExpressions";
		public final static String CONTAINERVIEW__EXCLUDE_EXPRESSION = "structurizr.expressions.StructurizrExpressions";
		public final static String COMPONENTVIEW__INCLUDE_EXPRESSION = "structurizr.expressions.StructurizrExpressions";
		public final static String COMPONENTVIEW__EXCLUDE_EXPRESSION = "structurizr.expressions.StructurizrExpressions";
	}
	
	public static class GrammarEntryRule {
		public final static String SYSTEMLANDSCAPEVIEW__INCLUDE_EXPRESSION = "SystemLandscapeView_Include";
		public final static String SYSTEMLANDSCAPEVIEW__EXCLUDE_EXPRESSION = "SystemLandscapeView_Exclude";
		public final static String SYSTEMCONTEXTVIEW__INCLUDE_EXPRESSION = "SystemContextView_Include";
		public final static String SYSTEMCONTEXTVIEW__EXCLUDE_EXPRESSION = "SystemContextView_Exclude";
		public final static String CONTAINERVIEW__INCLUDE_EXPRESSION = "ContainerView_Include";
		public final static String CONTAINERVIEW__EXCLUDE_EXPRESSION = "ContainerView_Exclude";
		public final static String COMPONENTVIEW__INCLUDE_EXPRESSION = "ComponentView_Include";
		public final static String COMPONENTVIEW__EXCLUDE_EXPRESSION = "ComponentView_Exclude";
	}
	
	public static class GrammarSetup {
		public final static ISetup SYSTEMLANDSCAPEVIEW__INCLUDE_EXPRESSION = new structurizr.expressions.StructurizrExpressionsStandaloneSetup();
		public final static ISetup SYSTEMLANDSCAPEVIEW__EXCLUDE_EXPRESSION = new structurizr.expressions.StructurizrExpressionsStandaloneSetup();
		public final static ISetup SYSTEMCONTEXTVIEW__INCLUDE_EXPRESSION = new structurizr.expressions.StructurizrExpressionsStandaloneSetup();
		public final static ISetup SYSTEMCONTEXTVIEW__EXCLUDE_EXPRESSION = new structurizr.expressions.StructurizrExpressionsStandaloneSetup();
		public final static ISetup CONTAINERVIEW__INCLUDE_EXPRESSION = new structurizr.expressions.StructurizrExpressionsStandaloneSetup();
		public final static ISetup CONTAINERVIEW__EXCLUDE_EXPRESSION = new structurizr.expressions.StructurizrExpressionsStandaloneSetup();
		public final static ISetup COMPONENTVIEW__INCLUDE_EXPRESSION = new structurizr.expressions.StructurizrExpressionsStandaloneSetup();
		public final static ISetup COMPONENTVIEW__EXCLUDE_EXPRESSION = new structurizr.expressions.StructurizrExpressionsStandaloneSetup();
	}
	
	public static class GrammarPlugin {
		public final static Plugin SYSTEMLANDSCAPEVIEW__INCLUDE_EXPRESSION = structurizr.expressions.ui.internal.ExpressionsActivator.getInstance();
		public final static Plugin SYSTEMLANDSCAPEVIEW__EXCLUDE_EXPRESSION = structurizr.expressions.ui.internal.ExpressionsActivator.getInstance();
		public final static Plugin SYSTEMCONTEXTVIEW__INCLUDE_EXPRESSION = structurizr.expressions.ui.internal.ExpressionsActivator.getInstance();
		public final static Plugin SYSTEMCONTEXTVIEW__EXCLUDE_EXPRESSION = structurizr.expressions.ui.internal.ExpressionsActivator.getInstance();
		public final static Plugin CONTAINERVIEW__INCLUDE_EXPRESSION = structurizr.expressions.ui.internal.ExpressionsActivator.getInstance();
		public final static Plugin CONTAINERVIEW__EXCLUDE_EXPRESSION = structurizr.expressions.ui.internal.ExpressionsActivator.getInstance();
		public final static Plugin COMPONENTVIEW__INCLUDE_EXPRESSION = structurizr.expressions.ui.internal.ExpressionsActivator.getInstance();
		public final static Plugin COMPONENTVIEW__EXCLUDE_EXPRESSION = structurizr.expressions.ui.internal.ExpressionsActivator.getInstance();
	}

	public final static Map<Class, Map<String, DerivedPropertyData>> derivedPropertiesData = Map.ofEntries(
	 	Map.entry(DerivedObjectClassContainer.SYSTEMLANDSCAPEVIEW, Map.ofEntries(
			Map.entry(DerivedObjectName.SYSTEMLANDSCAPEVIEW__INCLUDE, new DerivedPropertyData(DerivedObjectName.SYSTEMLANDSCAPEVIEW__INCLUDE, ParsedStringName.SYSTEMLANDSCAPEVIEW__INCLUDE_EXPRESSION, GrammarName.SYSTEMLANDSCAPEVIEW__INCLUDE_EXPRESSION, GrammarEntryRule.SYSTEMLANDSCAPEVIEW__INCLUDE_EXPRESSION, GrammarSetup.SYSTEMLANDSCAPEVIEW__INCLUDE_EXPRESSION, GrammarPlugin.SYSTEMLANDSCAPEVIEW__INCLUDE_EXPRESSION, DerivedObjectClassContainer.SYSTEMLANDSCAPEVIEW, DerivedObjectType.SYSTEMLANDSCAPEVIEW__INCLUDE, DerivedObjectIsMany.SYSTEMLANDSCAPEVIEW__INCLUDE)),					
			Map.entry(DerivedObjectName.SYSTEMLANDSCAPEVIEW__EXCLUDE, new DerivedPropertyData(DerivedObjectName.SYSTEMLANDSCAPEVIEW__EXCLUDE, ParsedStringName.SYSTEMLANDSCAPEVIEW__EXCLUDE_EXPRESSION, GrammarName.SYSTEMLANDSCAPEVIEW__EXCLUDE_EXPRESSION, GrammarEntryRule.SYSTEMLANDSCAPEVIEW__EXCLUDE_EXPRESSION, GrammarSetup.SYSTEMLANDSCAPEVIEW__EXCLUDE_EXPRESSION, GrammarPlugin.SYSTEMLANDSCAPEVIEW__EXCLUDE_EXPRESSION, DerivedObjectClassContainer.SYSTEMLANDSCAPEVIEW, DerivedObjectType.SYSTEMLANDSCAPEVIEW__EXCLUDE, DerivedObjectIsMany.SYSTEMLANDSCAPEVIEW__EXCLUDE)))),					
	 	Map.entry(DerivedObjectClassContainer.SYSTEMCONTEXTVIEW, Map.ofEntries(
			Map.entry(DerivedObjectName.SYSTEMCONTEXTVIEW__INCLUDE, new DerivedPropertyData(DerivedObjectName.SYSTEMCONTEXTVIEW__INCLUDE, ParsedStringName.SYSTEMCONTEXTVIEW__INCLUDE_EXPRESSION, GrammarName.SYSTEMCONTEXTVIEW__INCLUDE_EXPRESSION, GrammarEntryRule.SYSTEMCONTEXTVIEW__INCLUDE_EXPRESSION, GrammarSetup.SYSTEMCONTEXTVIEW__INCLUDE_EXPRESSION, GrammarPlugin.SYSTEMCONTEXTVIEW__INCLUDE_EXPRESSION, DerivedObjectClassContainer.SYSTEMCONTEXTVIEW, DerivedObjectType.SYSTEMCONTEXTVIEW__INCLUDE, DerivedObjectIsMany.SYSTEMCONTEXTVIEW__INCLUDE)),					
			Map.entry(DerivedObjectName.SYSTEMCONTEXTVIEW__EXCLUDE, new DerivedPropertyData(DerivedObjectName.SYSTEMCONTEXTVIEW__EXCLUDE, ParsedStringName.SYSTEMCONTEXTVIEW__EXCLUDE_EXPRESSION, GrammarName.SYSTEMCONTEXTVIEW__EXCLUDE_EXPRESSION, GrammarEntryRule.SYSTEMCONTEXTVIEW__EXCLUDE_EXPRESSION, GrammarSetup.SYSTEMCONTEXTVIEW__EXCLUDE_EXPRESSION, GrammarPlugin.SYSTEMCONTEXTVIEW__EXCLUDE_EXPRESSION, DerivedObjectClassContainer.SYSTEMCONTEXTVIEW, DerivedObjectType.SYSTEMCONTEXTVIEW__EXCLUDE, DerivedObjectIsMany.SYSTEMCONTEXTVIEW__EXCLUDE)))),					
	 	Map.entry(DerivedObjectClassContainer.CONTAINERVIEW, Map.ofEntries(
			Map.entry(DerivedObjectName.CONTAINERVIEW__INCLUDE, new DerivedPropertyData(DerivedObjectName.CONTAINERVIEW__INCLUDE, ParsedStringName.CONTAINERVIEW__INCLUDE_EXPRESSION, GrammarName.CONTAINERVIEW__INCLUDE_EXPRESSION, GrammarEntryRule.CONTAINERVIEW__INCLUDE_EXPRESSION, GrammarSetup.CONTAINERVIEW__INCLUDE_EXPRESSION, GrammarPlugin.CONTAINERVIEW__INCLUDE_EXPRESSION, DerivedObjectClassContainer.CONTAINERVIEW, DerivedObjectType.CONTAINERVIEW__INCLUDE, DerivedObjectIsMany.CONTAINERVIEW__INCLUDE)),					
			Map.entry(DerivedObjectName.CONTAINERVIEW__EXCLUDE, new DerivedPropertyData(DerivedObjectName.CONTAINERVIEW__EXCLUDE, ParsedStringName.CONTAINERVIEW__EXCLUDE_EXPRESSION, GrammarName.CONTAINERVIEW__EXCLUDE_EXPRESSION, GrammarEntryRule.CONTAINERVIEW__EXCLUDE_EXPRESSION, GrammarSetup.CONTAINERVIEW__EXCLUDE_EXPRESSION, GrammarPlugin.CONTAINERVIEW__EXCLUDE_EXPRESSION, DerivedObjectClassContainer.CONTAINERVIEW, DerivedObjectType.CONTAINERVIEW__EXCLUDE, DerivedObjectIsMany.CONTAINERVIEW__EXCLUDE)))),					
	 	Map.entry(DerivedObjectClassContainer.COMPONENTVIEW, Map.ofEntries(
			Map.entry(DerivedObjectName.COMPONENTVIEW__INCLUDE, new DerivedPropertyData(DerivedObjectName.COMPONENTVIEW__INCLUDE, ParsedStringName.COMPONENTVIEW__INCLUDE_EXPRESSION, GrammarName.COMPONENTVIEW__INCLUDE_EXPRESSION, GrammarEntryRule.COMPONENTVIEW__INCLUDE_EXPRESSION, GrammarSetup.COMPONENTVIEW__INCLUDE_EXPRESSION, GrammarPlugin.COMPONENTVIEW__INCLUDE_EXPRESSION, DerivedObjectClassContainer.COMPONENTVIEW, DerivedObjectType.COMPONENTVIEW__INCLUDE, DerivedObjectIsMany.COMPONENTVIEW__INCLUDE)),					
			Map.entry(DerivedObjectName.COMPONENTVIEW__EXCLUDE, new DerivedPropertyData(DerivedObjectName.COMPONENTVIEW__EXCLUDE, ParsedStringName.COMPONENTVIEW__EXCLUDE_EXPRESSION, GrammarName.COMPONENTVIEW__EXCLUDE_EXPRESSION, GrammarEntryRule.COMPONENTVIEW__EXCLUDE_EXPRESSION, GrammarSetup.COMPONENTVIEW__EXCLUDE_EXPRESSION, GrammarPlugin.COMPONENTVIEW__EXCLUDE_EXPRESSION, DerivedObjectClassContainer.COMPONENTVIEW, DerivedObjectType.COMPONENTVIEW__EXCLUDE, DerivedObjectIsMany.COMPONENTVIEW__EXCLUDE)))));					
		
	public final static Map<Class, Map<String, String>> derivedPairsMappings = Map.ofEntries(
	 	Map.entry(DerivedObjectClassContainer.SYSTEMLANDSCAPEVIEW, Map.ofEntries(
			Map.entry(ParsedStringName.SYSTEMLANDSCAPEVIEW__INCLUDE_EXPRESSION, DerivedObjectName.SYSTEMLANDSCAPEVIEW__INCLUDE),					
			Map.entry(ParsedStringName.SYSTEMLANDSCAPEVIEW__EXCLUDE_EXPRESSION, DerivedObjectName.SYSTEMLANDSCAPEVIEW__EXCLUDE))),					
	 	Map.entry(DerivedObjectClassContainer.SYSTEMCONTEXTVIEW, Map.ofEntries(
			Map.entry(ParsedStringName.SYSTEMCONTEXTVIEW__INCLUDE_EXPRESSION, DerivedObjectName.SYSTEMCONTEXTVIEW__INCLUDE),					
			Map.entry(ParsedStringName.SYSTEMCONTEXTVIEW__EXCLUDE_EXPRESSION, DerivedObjectName.SYSTEMCONTEXTVIEW__EXCLUDE))),					
	 	Map.entry(DerivedObjectClassContainer.CONTAINERVIEW, Map.ofEntries(
			Map.entry(ParsedStringName.CONTAINERVIEW__INCLUDE_EXPRESSION, DerivedObjectName.CONTAINERVIEW__INCLUDE),					
			Map.entry(ParsedStringName.CONTAINERVIEW__EXCLUDE_EXPRESSION, DerivedObjectName.CONTAINERVIEW__EXCLUDE))),					
	 	Map.entry(DerivedObjectClassContainer.COMPONENTVIEW, Map.ofEntries(
			Map.entry(ParsedStringName.COMPONENTVIEW__INCLUDE_EXPRESSION, DerivedObjectName.COMPONENTVIEW__INCLUDE),					
			Map.entry(ParsedStringName.COMPONENTVIEW__EXCLUDE_EXPRESSION, DerivedObjectName.COMPONENTVIEW__EXCLUDE))));					
	
	public final static Map<Class, String> identifierAttributeByType = Map.ofEntries(
		/* protected region identifierAttributeByType on begin */
		
		/* protected region identifierAttributeByType end */
	);
	
	public final static Map<Class, SimpleAttributeResolver<EObject, String>> resolvers = Map.of(
		/* protected region resolvers on begin */
		IdentifiableElement.class, SimpleAttributeResolver.newResolver(String.class, "identifier")
		/* protected region resolvers end */
	);
	
}