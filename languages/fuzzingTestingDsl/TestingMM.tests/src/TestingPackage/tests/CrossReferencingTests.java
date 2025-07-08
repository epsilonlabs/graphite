package TestingPackage.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
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
import TestingPackage.StandardGrammar.ConditionVariable;
import graphite.shared.Settings;

public class CrossReferencingTests {

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
	public void expressionWithCrossReference() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(0).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ {(@collisionOccurance=2) AND {(@fuzzingOperationTimes>4) AND {(@entryToTriggerZone1<@jointExtremeR3200Link0Pos) OR (@entryToTriggerZone1=43)}}}]", conditionBasedActivation.getStartingExpression());
		ConditionVariable conditionVariable = (ConditionVariable)(((BasicCondition)((CompositeCondition)conditionBasedActivation.getStarting().getC()).getLeft()).getLeft());
		EList<EObject> references = conditionVariable.eCrossReferences();
		StreamMetric streamMetric = testingSpace.getMetrics().stream().filter(x -> (x instanceof StreamMetric && ((StreamMetric)x).getName().equals("collisionOccurance"))).map(x -> (StreamMetric) x).collect(Collectors.toList()).get(0);
		assertEquals("Expression with cross reference", streamMetric, references.get(0));
	}
	
	@Test
	public void expressionWithoutCrossReference() {
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace.getCampaigns().get(0).getPerformedTests().get(1).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		assertEquals("ConditionBasedActivation has the initial expected starting condition", "[ { ( @ > @ entryToTriggerZone1 ) AND ( @ collisionOccurance > 5 ) } ]", conditionBasedActivation.getEndingExpression());
		ConditionVariable conditionVariable = (ConditionVariable)(((BasicCondition)((CompositeCondition)conditionBasedActivation.getEnding().getC()).getLeft()).getLeft());
		EList<EObject> references = conditionVariable.eCrossReferences();
		assertTrue("Expression without cross reference", references.isEmpty());
	}
	
}
