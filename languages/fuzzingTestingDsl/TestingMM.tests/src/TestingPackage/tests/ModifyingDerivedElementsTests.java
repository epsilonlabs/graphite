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
import TestingPackage.Metrics.StreamMetric;
import TestingPackage.Metrics.impl.FuzzingOperationTimesMetricImpl;
import TestingPackage.StandardGrammar.BasicCondition;
import TestingPackage.StandardGrammar.BinaryComparisonOperation;
import TestingPackage.StandardGrammar.CompositeCondition;
import TestingPackage.StandardGrammar.ConditionInteger;
import TestingPackage.StandardGrammar.ConditionVariable;
import TestingPackage.StandardGrammar.StandardGrammarFactory;
import TestingPackage.StandardGrammar.impl.StandardGrammarFactoryImpl;
import graphite.shared.Settings;

public class ModifyingDerivedElementsTests {

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
	public void changeElementReferenceValue() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(0).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimes>4) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]", conditionBasedActivation.getStartingExpression());
		StreamMetric collisionOccurance = testingSpace.getMetrics().stream().filter(x -> (x instanceof StreamMetric && ((StreamMetric)x).getName().equals("collisionOccurance"))).map(x -> (StreamMetric) x).collect(Collectors.toList()).get(0);
		ConditionVariable conditionVariable = (ConditionVariable)(((BasicCondition)(((CompositeCondition)((CompositeCondition)conditionBasedActivation.getStarting().getC()).getRight()).getLeft())).getLeft());
		conditionVariable.setMetric(collisionOccurance);
		assertEquals("ConditionBasedActivation has the final expected starting condition", "[ { ( @ collisionOccurance=2 ) AND { ( @ collisionOccurance>4 ) AND { ( @ entryToTriggerZone1< @ jointExtremeR3200Link0Pos ) OR ( @ entryToTriggerZone1=43 ) } } } ]", conditionBasedActivation.getStartingExpression());		
	}
	
	@Test
	public void changeElementLiteralValue() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(0).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimes>4) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]", conditionBasedActivation.getStartingExpression());
		ConditionInteger conditionInteger = (ConditionInteger)(((BasicCondition)(((CompositeCondition)((CompositeCondition)conditionBasedActivation.getStarting().getC()).getRight()).getLeft())).getRight());
		conditionInteger.setValue(5);
		assertEquals("ConditionBasedActivation has the final expected starting condition", "[ { ( @ collisionOccurance=2 ) AND { ( @ fuzzingOperationTimes>5 ) AND { ( @ entryToTriggerZone1< @ jointExtremeR3200Link0Pos ) OR ( @ entryToTriggerZone1=43 ) } } } ]", conditionBasedActivation.getStartingExpression());
	}
	
	@Test
	public void setReferenceToNull() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(0).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimes>4) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]", conditionBasedActivation.getStartingExpression());
		ConditionVariable conditionVariable = (ConditionVariable)(((BasicCondition)(((CompositeCondition)((CompositeCondition)conditionBasedActivation.getStarting().getC()).getRight()).getLeft())).getLeft());
		conditionVariable.setMetric(null);
		assertEquals("ConditionBasedActivation has the final expected starting condition", "[ { ( @ collisionOccurance=2 ) AND { ( @ >4 ) AND { ( @ entryToTriggerZone1< @ jointExtremeR3200Link0Pos ) OR ( @ entryToTriggerZone1=43 ) } } } ]", conditionBasedActivation.getStartingExpression());
	}
	
	@Test
	public void deleteConditionElement() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(0).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimes>4) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]", conditionBasedActivation.getStartingExpression());
		ConditionInteger conditionInteger = (ConditionInteger)(((BasicCondition)(((CompositeCondition)((CompositeCondition)conditionBasedActivation.getStarting().getC()).getRight()).getLeft())).getRight());
		try {
			model.deleteElement(conditionInteger);
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}
		assertEquals("ConditionBasedActivation has the final expected starting condition", "[ { ( @ collisionOccurance=2 ) AND { ( @ fuzzingOperationTimes> ) AND { ( @ entryToTriggerZone1< @ jointExtremeR3200Link0Pos ) OR ( @ entryToTriggerZone1=43 ) } } } ]", conditionBasedActivation.getStartingExpression());
	}
	
	@Test
	public void deleteBasicCondition() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(0).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimes>4) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]", conditionBasedActivation.getStartingExpression());
		BasicCondition basicCondition = (BasicCondition)(((CompositeCondition)((CompositeCondition)conditionBasedActivation.getStarting().getC()).getRight()).getLeft());
		try {
			model.deleteElement(basicCondition);
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}
		assertEquals("ConditionBasedActivation has the final expected starting condition", "[ { ( @ collisionOccurance=2 ) AND { AND { ( @ entryToTriggerZone1< @ jointExtremeR3200Link0Pos ) OR ( @ entryToTriggerZone1=43 ) } } } ]", conditionBasedActivation.getStartingExpression());
	}
	
	@Test
	public void deleteCompositeCondition() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(0).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimes>4) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]", conditionBasedActivation.getStartingExpression());
		CompositeCondition compositeCondition = (CompositeCondition)((CompositeCondition)conditionBasedActivation.getStarting().getC()).getRight();
		try {
			model.deleteElement(compositeCondition);
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}
		assertEquals("ConditionBasedActivation has the final expected starting condition", "[ { ( @ collisionOccurance=2 ) AND } ]", conditionBasedActivation.getStartingExpression());
	}
	
	@Test
	public void deleteEntireCondition() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(0).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimes>4) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]", conditionBasedActivation.getStartingExpression());
		try {
			model.deleteElement(conditionBasedActivation.getStarting());
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}
		assertEquals("ConditionBasedActivation has the final expected starting condition", "", conditionBasedActivation.getStartingExpression());	
	}
	
	@Test
	public void addConditionElement() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(1).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ { ( @ collisionOccurance > ) OR } ]", conditionBasedActivation.getStartingExpression());
		StandardGrammarFactory factory = StandardGrammarFactoryImpl.init();
		ConditionInteger conditionInteger = factory.createConditionInteger();
		conditionInteger.setValue(10);
		BasicCondition leftCondition = (BasicCondition)((CompositeCondition)conditionBasedActivation.getStarting().getC()).getLeft();
		leftCondition.setRight(conditionInteger);
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ { ( @ collisionOccurance > 10 ) OR } ]", conditionBasedActivation.getStartingExpression());
	}
	
	@Test
	public void addCondition() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(1).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ { ( @ collisionOccurance > ) OR } ]", conditionBasedActivation.getStartingExpression());
		FuzzingOperationTimesMetric fuzzingOperationTimesMetric = testingSpace.getMetrics().stream().filter(x -> x instanceof FuzzingOperationTimesMetricImpl).map(x -> (FuzzingOperationTimesMetricImpl) x).collect(Collectors.toList()).get(0);
		StandardGrammarFactory factory = StandardGrammarFactoryImpl.init();
		ConditionVariable conditionVariable = factory.createConditionVariable();
		conditionVariable.setMetric(fuzzingOperationTimesMetric);
		ConditionInteger conditionInteger = factory.createConditionInteger();
		conditionInteger.setValue(10);
		BasicCondition basicCondition = factory.createBasicCondition();
		basicCondition.setBincomp(BinaryComparisonOperation.GREATER_THAN);
		basicCondition.setLeft(conditionVariable);
		basicCondition.setRight(conditionInteger);
		CompositeCondition compositeCondition = (CompositeCondition)conditionBasedActivation.getStarting().getC();
		compositeCondition.setRight(basicCondition);
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ { ( @ collisionOccurance > ) OR ( @ fuzzingOperationTimes > 10 ) } ]", conditionBasedActivation.getStartingExpression());
	}
	
}
