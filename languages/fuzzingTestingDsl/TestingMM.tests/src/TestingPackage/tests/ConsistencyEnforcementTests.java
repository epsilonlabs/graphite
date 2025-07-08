package TestingPackage.tests;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import TestingPackage.TestingMMPackage;
import TestingPackage.TestingSpace;
import TestingPackage.FuzzingOperations.RandomValueFromSetOperation;
import TestingPackage.FuzzingOperations.impl.XtextConditionBasedActivationImpl;
import TestingPackage.Metrics.FuzzingOperationTimesMetric;
import TestingPackage.Metrics.MetricsFactory;
import TestingPackage.Metrics.impl.FuzzingOperationTimesMetricImpl;
import TestingPackage.Metrics.impl.MetricsFactoryImpl;
import TestingPackage.StandardGrammar.BasicCondition;
import TestingPackage.StandardGrammar.CompositeCondition;
import TestingPackage.StandardGrammar.ConditionVariable;
import graphite.shared.Settings;

public class ConsistencyEnforcementTests {

	private EmfModel model;
	private TestingSpace testingSpace;
	
	@Before
	public void setup() throws Exception {
		Settings.setMergeDerivedModelElements(false);
 		model = new EmfModel();
 		model.setMetamodelUris((Arrays.asList(TestingMMPackage.eINSTANCE.getNsURI()))); 		
 		model.setModelFile(new File(TestsData.MODEL).getAbsolutePath());
 		model.setReadOnLoad(true);
 		model.setStoredOnDisposal(false);
 		model.load();
 		testingSpace = (TestingSpace)model.getResource().getContents().get(0);
	}
	
	@After
	public void teardown() {
	    if (model != null) {
	    	model.getResource().unload();
	    }
	}
	
	@Test
	public void changedNameOfReference() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(0).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimes>4) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]", conditionBasedActivation.getStartingExpression());
		FuzzingOperationTimesMetric fuzzingOperationTimesMetric = testingSpace.getMetrics().stream().filter(x -> x instanceof FuzzingOperationTimesMetricImpl).map(x -> (FuzzingOperationTimesMetricImpl) x).collect(Collectors.toList()).get(0);
		fuzzingOperationTimesMetric.setName("fuzzingOperationTimesX");
		assertEquals("ConditionBasedActivation has the final expected starting condition", "[ { ( @ collisionOccurance=2 ) AND { ( @ fuzzingOperationTimesX>4 ) AND { ( @ entryToTriggerZone1< @ jointExtremeR3200Link0Pos ) OR ( @ entryToTriggerZone1=43 ) } } } ]", conditionBasedActivation.getStartingExpression());
	}
	
	@Test
	public void deletedReference() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(0).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimes>4) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]", conditionBasedActivation.getStartingExpression());
		FuzzingOperationTimesMetric fuzzingOperationTimesMetric = testingSpace.getMetrics().stream().filter(x -> x instanceof FuzzingOperationTimesMetricImpl).map(x -> (FuzzingOperationTimesMetricImpl) x).collect(Collectors.toList()).get(0);
		try {
			model.deleteElement(fuzzingOperationTimesMetric);
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}
		assertEquals("ConditionBasedActivation has the final expected starting condition", "[ { ( @ collisionOccurance=2 ) AND { ( @ >4 ) AND { ( @ entryToTriggerZone1< @ jointExtremeR3200Link0Pos ) OR ( @ entryToTriggerZone1=43 ) } } } ]", conditionBasedActivation.getStartingExpression());
	}
	
	@Test
	public void invalidExpressionBecomingValid() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(0).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimes>4) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]", conditionBasedActivation.getStartingExpression());
		conditionBasedActivation.setStartingExpression("[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimesX>4) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]");
		MetricsFactory factory = MetricsFactoryImpl.init();
		FuzzingOperationTimesMetric fuzzingOperationTimesMetric = factory.createFuzzingOperationTimesMetric();
		testingSpace.getMetrics().add(fuzzingOperationTimesMetric);
		fuzzingOperationTimesMetric.setName("fuzzingOperationTimesX");
		ConditionVariable conditionVariable = (ConditionVariable)(((BasicCondition)(((CompositeCondition)((CompositeCondition)conditionBasedActivation.getStarting().getC()).getRight()).getLeft())).getLeft());
		assertEquals("FuzzingOperationTimesMetric is the new metric", fuzzingOperationTimesMetric, conditionVariable.getMetric());		
	}
	
}
