package TestingPackage.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EClass;
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
import TestingPackage.StandardGrammar.CompositeCondition;
import TestingPackage.StandardGrammar.ConditionVariable;
import graphite.shared.CustomValidator;
import graphite.shared.DerivedObjectProperties;
import graphite.shared.Settings;

public class ErrorReportingTests {

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
	public void semanticErrorTriggered() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(0).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimes>4) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]", conditionBasedActivation.getStartingExpression());
		conditionBasedActivation.setStartingExpression("[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimesX>4) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]");
		CustomValidator customValidator = new CustomValidator();
		BasicDiagnostic diagnostics = new BasicDiagnostic();
		boolean isValid = customValidator.validate((EClass)TestingMMPackage.eINSTANCE.getEClassifier("TestCampaign"), conditionBasedActivation, diagnostics, null);
		assertFalse("Validate boolean result", isValid);
		assertTrue("Expected error message", diagnostics.getChildren().get(0).getMessage().endsWith("Couldn't resolve reference to Metric 'fuzzingOperationTimesX'."));
	}
	
	@Test
	public void syntaxErrorTriggered() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(0).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimes>4) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]", conditionBasedActivation.getStartingExpression());
		conditionBasedActivation.setStartingExpression("[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimes>4x) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]");
		CustomValidator customValidator = new CustomValidator();
		BasicDiagnostic diagnostics = new BasicDiagnostic();
		boolean isValid = customValidator.validate((EClass)TestingMMPackage.eINSTANCE.getEClassifier("TestCampaign"), conditionBasedActivation, diagnostics, null);	
		assertFalse("Validate boolean result", isValid);
		assertTrue("Expected error message", diagnostics.getChildren().get(0).getMessage().endsWith("could not be parsed: extraneous input 'x' expecting ')'"));
	}
	
	@Test
	public void semanticErrorSolved() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(0).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimes>4) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]", conditionBasedActivation.getStartingExpression());
		conditionBasedActivation.setStartingExpression("[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimesX>4) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]");
		CustomValidator customValidator = new CustomValidator();
		BasicDiagnostic diagnostics1 = new BasicDiagnostic();
		boolean isValid1 = customValidator.validate((EClass)TestingMMPackage.eINSTANCE.getEClassifier("TestCampaign"), conditionBasedActivation, diagnostics1, null);
		assertFalse("Validate boolean result with error", isValid1);
		assertTrue("Expected error message with error", diagnostics1.getChildren().get(0).getMessage().endsWith("Couldn't resolve reference to Metric 'fuzzingOperationTimesX'."));
		conditionBasedActivation.setStartingExpression("[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimes>4) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]");
		BasicDiagnostic diagnostics2 = new BasicDiagnostic();
		boolean isValid2 = customValidator.validate((EClass)TestingMMPackage.eINSTANCE.getEClassifier("TestCampaign"), conditionBasedActivation, diagnostics2, null);	
		assertTrue("Validate boolean result without error", isValid2);
		assertTrue("Expected error message without error", diagnostics2.getChildren().isEmpty());
	}
	
	@Test
	public void syntaxErrorSolved() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(0).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimes>4) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]", conditionBasedActivation.getStartingExpression());
		conditionBasedActivation.setStartingExpression("[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimes>4x) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]");	
		CustomValidator customValidator = new CustomValidator();
		BasicDiagnostic diagnostics1 = new BasicDiagnostic();
		boolean isValid1 = customValidator.validate((EClass)TestingMMPackage.eINSTANCE.getEClassifier("TestCampaign"), conditionBasedActivation, diagnostics1, null);	
		assertFalse("Validate boolean result with error", isValid1);
		assertTrue("Expected error message with error", diagnostics1.getChildren().get(0).getMessage().endsWith("could not be parsed: extraneous input 'x' expecting ')'"));	
		conditionBasedActivation.setStartingExpression("[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimes>4) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]");
		BasicDiagnostic diagnostics2 = new BasicDiagnostic();
		boolean isValid2 = customValidator.validate((EClass)TestingMMPackage.eINSTANCE.getEClassifier("TestCampaign"), conditionBasedActivation, diagnostics2, null);	
		assertTrue("Validate boolean result without error", isValid2);
		assertTrue("Expected error message without error", diagnostics2.getChildren().isEmpty());
	}
	
	@Test
	public void toleratingTemporaryInconsistency() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(0).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimes>4) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]", conditionBasedActivation.getStartingExpression());
		conditionBasedActivation.setStartingExpression("[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimesX>4) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]");
		ConditionVariable conditionVariable = (ConditionVariable)(((BasicCondition)(((CompositeCondition)(((CompositeCondition)conditionBasedActivation.getStarting().getC()).getRight())).getLeft())).getLeft());
		FuzzingOperationTimesMetric fuzzingOperationTimesMetric = testingSpace.getMetrics().stream().filter(x -> x instanceof FuzzingOperationTimesMetricImpl).map(x -> (FuzzingOperationTimesMetricImpl) x).collect(Collectors.toList()).get(0);
		assertEquals("Metric element is unchanged", fuzzingOperationTimesMetric, conditionVariable.getMetric());	
	}
	
	@Test
	public void managingInvalidExpression() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(0).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimes>4) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]", conditionBasedActivation.getStartingExpression());
		conditionBasedActivation.setStartingExpression("[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimes>4x) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]");	
		DerivedObjectProperties changedDerivedObjectProperties = null;
		for (DerivedObjectProperties derivedObjectProperties: conditionBasedActivation.getDerivedObjectsProperties().values()) {
			if (Objects.equals(derivedObjectProperties.getLastParsedString(), "[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimes>4x) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]")) {
				changedDerivedObjectProperties = derivedObjectProperties;
				break;
			}
		}
		assertTrue("Expression is invalid", changedDerivedObjectProperties.isInvalid());
	}
	
	@Test
	public void managingValidExpression() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(0).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimes>4) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]", conditionBasedActivation.getStartingExpression());
		DerivedObjectProperties changedDerivedObjectProperties = null;
		for (DerivedObjectProperties derivedObjectProperties: conditionBasedActivation.getDerivedObjectsProperties().values()) {
			if (Objects.equals(derivedObjectProperties.getLastParsedString(), "[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimes>4) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]")) {
				changedDerivedObjectProperties = derivedObjectProperties;
				break;
			}
		}
		assertFalse("Expression is valid", changedDerivedObjectProperties.isInvalid());
	}
	
}
