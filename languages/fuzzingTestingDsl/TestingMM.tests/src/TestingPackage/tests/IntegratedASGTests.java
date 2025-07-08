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
import TestingPackage.Metrics.StreamMetric;
import TestingPackage.StandardGrammar.BasicCondition;
import TestingPackage.StandardGrammar.CompositeCondition;
import TestingPackage.StandardGrammar.ConditionInteger;
import TestingPackage.StandardGrammar.ConditionVariable;
import graphite.shared.Settings;

public class IntegratedASGTests {

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
	public void equivalentStartingCondition() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(1).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ { ( @ collisionOccurance > ) OR } ]", conditionBasedActivation.getStartingExpression());
		
		assertTrue("Starting condition is CompositeCondition", conditionBasedActivation.getStarting().getC() instanceof CompositeCondition);
		CompositeCondition compositeCondition = (CompositeCondition)conditionBasedActivation.getStarting().getC();
		
		assertTrue("Left side of starting condition is BasicCondition", compositeCondition.getLeft() instanceof BasicCondition);
		assertEquals("Right side of starting condition is null", null, compositeCondition.getRight());
		BasicCondition leftCondition = (BasicCondition)compositeCondition.getLeft();
		
		assertTrue("Left side of leftCondition is ConditionVariable", leftCondition.getLeft() instanceof ConditionVariable);
		StreamMetric collisionOccurance = testingSpace.getMetrics().stream().filter(x -> (x instanceof StreamMetric && ((StreamMetric)x).getName().equals("collisionOccurance"))).map(x -> (StreamMetric) x).collect(Collectors.toList()).get(0);
		assertEquals("Left Metric is collisionOccurance", collisionOccurance, ((ConditionVariable)leftCondition.getLeft()).getMetric());
		assertEquals("Right Metric is null", null, leftCondition.getRight());
	}
	
	@Test
	public void equivalentEndingCondition() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(1).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ { ( @ > @ entryToTriggerZone1 ) AND ( @ collisionOccurance > 5 ) } ]", conditionBasedActivation.getEndingExpression());
		
		assertTrue("Ending condition is CompositeCondition", conditionBasedActivation.getEnding().getC() instanceof CompositeCondition);
		CompositeCondition compositeCondition = (CompositeCondition)conditionBasedActivation.getEnding().getC();
		
		assertTrue("Left side of ending condition is BasicCondition", compositeCondition.getLeft() instanceof BasicCondition);
		assertTrue("Right side of ending condition is BasicCondition", compositeCondition.getRight() instanceof BasicCondition);
		BasicCondition leftCondition = (BasicCondition)compositeCondition.getLeft();
		BasicCondition rightCondition = (BasicCondition)compositeCondition.getRight();
		
		assertTrue("Left side of leftCondition is ConditionVariable", leftCondition.getLeft() instanceof ConditionVariable);
		assertEquals("Left Metric is null", null, ((ConditionVariable)leftCondition.getLeft()).getMetric());

		assertTrue("Right side of leftCondition is ConditionVariable", leftCondition.getRight() instanceof ConditionVariable);
		StreamMetric entryToTriggerZone1 = testingSpace.getMetrics().stream().filter(x -> (x instanceof StreamMetric && ((StreamMetric)x).getName().equals("entryToTriggerZone1"))).map(x -> (StreamMetric) x).collect(Collectors.toList()).get(0);
		assertEquals("Right Metric is entryToTriggerZone1", entryToTriggerZone1, ((ConditionVariable)leftCondition.getRight()).getMetric());

		assertTrue("Left side of rightCondition is ConditionVariable", rightCondition.getLeft() instanceof ConditionVariable);
		StreamMetric collisionOccurance = testingSpace.getMetrics().stream().filter(x -> (x instanceof StreamMetric && ((StreamMetric)x).getName().equals("collisionOccurance"))).map(x -> (StreamMetric) x).collect(Collectors.toList()).get(0);
		assertEquals("Left Metric is collisionOccurance", collisionOccurance, ((ConditionVariable)rightCondition.getLeft()).getMetric());
		
		assertTrue("Right side of rightCondition is ConditionInteger", rightCondition.getRight() instanceof ConditionInteger);
		assertEquals("Right ConditionInteger is 5", 5, ((ConditionInteger)rightCondition.getRight()).getValue());
	}
		
}
