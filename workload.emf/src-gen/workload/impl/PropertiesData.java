package workload.impl;

import java.util.Map;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.xtext.ISetup;

import graphite.shared.DerivedPropertyData;

import graphite.shared.ITransformationService;

import workload.Effort;

import workload.xtext_grammar.EffortsStandaloneSetup;
import workload.xtext_grammar.ui.internal.Xtext_grammarActivator;

@SuppressWarnings("rawtypes")
public class PropertiesData {

	public static EFactory xtextFactory = workload.impl.WorkloadFactoryImpl.init();

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
	
	public static class DerivedObjectTransformationService {
		public final static ITransformationService TASK__EFFORTS = null;
	}
	
	public static class ParsedStringName {
		public final static String TASK__EFFORTS_EXPRESSION = "effortsExpression";
	}
	
	public static class GrammarName {
		public final static String TASK__EFFORTS_EXPRESSION = "workload.xtext_grammar.Efforts";
	}
	
	public static class GrammarSetup {
		public final static ISetup TASK__EFFORTS_EXPRESSION = new EffortsStandaloneSetup();
	}
	
	public static class GrammarPlugin {
		public final static Plugin TASK__EFFORTS_EXPRESSION = Xtext_grammarActivator.getInstance();
	}

	public final static Map<Class, Map<String, DerivedPropertyData>> derivedPropertiesData = Map.ofEntries(
	 	Map.entry(DerivedObjectClassContainer.TASK, Map.ofEntries(
			Map.entry(DerivedObjectName.TASK__EFFORTS, new DerivedPropertyData(DerivedObjectName.TASK__EFFORTS, ParsedStringName.TASK__EFFORTS_EXPRESSION, GrammarName.TASK__EFFORTS_EXPRESSION, GrammarSetup.TASK__EFFORTS_EXPRESSION, GrammarPlugin.TASK__EFFORTS_EXPRESSION, DerivedObjectClassContainer.TASK, DerivedObjectType.TASK__EFFORTS, DerivedObjectIsMany.TASK__EFFORTS, DerivedObjectTransformationService.TASK__EFFORTS)))));					
		
	public final static Map<Class, Map<String, String>> derivedPairsMappings = Map.ofEntries(
	 	Map.entry(DerivedObjectClassContainer.TASK, Map.ofEntries(
			Map.entry(ParsedStringName.TASK__EFFORTS_EXPRESSION, DerivedObjectName.TASK__EFFORTS))));					
	
	public final static Map<Class, String> identifierByType = Map.ofEntries(Map.entry(Effort.class, "person"));
	
}