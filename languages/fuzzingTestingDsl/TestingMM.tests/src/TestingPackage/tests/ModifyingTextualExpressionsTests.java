package TestingPackage.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.eclipse.epsilon.emc.emf.EmfModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import TestingPackage.TestingMMPackage;
import TestingPackage.TestingSpace;
import TestingPackage.FuzzingOperations.RandomValueFromSetOperation;
import TestingPackage.FuzzingOperations.impl.XtextConditionBasedActivationImpl;
import TestingPackage.Metrics.FuzzingOperationTimesMetric;
import TestingPackage.Metrics.impl.FuzzingOperationTimesMetricImpl;
import TestingPackage.StandardGrammar.BasicCondition;
import TestingPackage.StandardGrammar.BinaryLogicalOperation;
import TestingPackage.StandardGrammar.CompositeCondition;
import TestingPackage.StandardGrammar.ConditionInteger;
import TestingPackage.StandardGrammar.ConditionVariable;
import graphite.shared.Settings;

public class ModifyingTextualExpressionsTests {

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
	public void deleteReference() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(1).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ { ( @ collisionOccurance > ) OR } ]", conditionBasedActivation.getStartingExpression());
		conditionBasedActivation.setStartingExpression( "[ { ( @ > ) OR } ]");
		ConditionVariable conditionVariable = (ConditionVariable)(((BasicCondition)(((CompositeCondition)conditionBasedActivation.getStarting().getC()).getLeft())).getLeft());
		assertEquals("ConditionVariable has null metric", null, conditionVariable.getMetric());	
	}
	
	@Test
	public void deleteConditionElement() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(1).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ { ( @ collisionOccurance > ) OR } ]", conditionBasedActivation.getStartingExpression());
		conditionBasedActivation.setStartingExpression( "[ { ( > ) OR } ]");
		BasicCondition basicCondition = (BasicCondition)(((CompositeCondition)conditionBasedActivation.getStarting().getC()).getLeft());
		assertEquals("Left of BasicCondition is null", null, basicCondition.getLeft());
	}
	
	@Test
	public void deleteBasicCondition() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(1).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ { ( @ collisionOccurance > ) OR } ]", conditionBasedActivation.getStartingExpression());
		conditionBasedActivation.setStartingExpression( "[ { OR } ]");
		assertEquals("BasicCondition is null", null, ((CompositeCondition)conditionBasedActivation.getStarting().getC()).getLeft());
	}
	
	@Test
	public void deleteCompositeCondition() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(1).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ { ( @ collisionOccurance > ) OR } ]", conditionBasedActivation.getStartingExpression());
		conditionBasedActivation.setStartingExpression( "[ ]");
		assertEquals("Condition is null", null, conditionBasedActivation.getStarting().getC());
	}
	
	@Test
	public void deleteEntireCondition() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(1).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ { ( @ collisionOccurance > ) OR } ]", conditionBasedActivation.getStartingExpression());
		conditionBasedActivation.setStartingExpression("");
		assertEquals("Starting condition is null", null, conditionBasedActivation.getStarting());
	}
	
	@Test
	public void changeReference() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(1).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ { ( @ collisionOccurance > ) OR } ]", conditionBasedActivation.getStartingExpression());
		conditionBasedActivation.setStartingExpression("[ { ( @ fuzzingOperationTimes > ) OR } ]");
		FuzzingOperationTimesMetric fuzzingOperationTimesMetric = testingSpace.getMetrics().stream().filter(x -> x instanceof FuzzingOperationTimesMetricImpl).map(x -> (FuzzingOperationTimesMetricImpl) x).collect(Collectors.toList()).get(0);
		ConditionVariable conditionVariable = (ConditionVariable)(((BasicCondition)(((CompositeCondition)conditionBasedActivation.getStarting().getC()).getLeft())).getLeft());
		assertEquals("ConditionVariable has new metric", fuzzingOperationTimesMetric, conditionVariable.getMetric());
	}
	
	@Test
	public void changeValue() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(1).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ { ( @ collisionOccurance > ) OR } ]", conditionBasedActivation.getStartingExpression());
		conditionBasedActivation.setStartingExpression("[ { ( @ collisionOccurance > ) AND } ]");
		CompositeCondition compositeCondition = (CompositeCondition)conditionBasedActivation.getStarting().getC();
		assertEquals("CompositeCondition has new value", BinaryLogicalOperation.AND, compositeCondition.getBinop());
	}
	
	@Test
	public void addConditionElement() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(1).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ { ( @ collisionOccurance > ) OR } ]", conditionBasedActivation.getStartingExpression());
		conditionBasedActivation.setStartingExpression("[ { ( @ collisionOccurance > 10 ) OR } ]");	
		BasicCondition leftCondition = (BasicCondition)((CompositeCondition)conditionBasedActivation.getStarting().getC()).getLeft();
		assertTrue("Right of condition is ConditionInteger", leftCondition.getRight() instanceof ConditionInteger);
		assertEquals("ConditionInteger has the value 10", 10, ((ConditionInteger)leftCondition.getRight()).getValue());
	}
	
	@Test
	public void addCondition() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(1).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ { ( @ collisionOccurance > ) OR } ]", conditionBasedActivation.getStartingExpression());
		conditionBasedActivation.setStartingExpression("[ { ( @ collisionOccurance > ) OR ( @ fuzzingOperationTimes > 4 ) } ]");
		FuzzingOperationTimesMetric fuzzingOperationTimesMetric = testingSpace.getMetrics().stream().filter(x -> x instanceof FuzzingOperationTimesMetricImpl).map(x -> (FuzzingOperationTimesMetricImpl) x).collect(Collectors.toList()).get(0);
		assertTrue("Right condition is BasicCondition", ((CompositeCondition)conditionBasedActivation.getStarting().getC()).getRight() instanceof BasicCondition);
		BasicCondition basicCondition = (BasicCondition)((CompositeCondition)conditionBasedActivation.getStarting().getC()).getRight();
		assertTrue("Left condition of BasicCondition is ConditionVariable", basicCondition.getLeft() instanceof ConditionVariable);
		assertEquals("ConditionVariable has fuzzingOperationTimesMetric", fuzzingOperationTimesMetric, ((ConditionVariable)basicCondition.getLeft()).getMetric());
		assertTrue("Right condition of BasicCondition is ConditionInteger", basicCondition.getRight() instanceof ConditionInteger);
		assertEquals("ConditionInteger has the value 4", 4, ((ConditionInteger)basicCondition.getRight()).getValue());
	}
	
}
