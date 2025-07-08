package workload.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import graphite.shared.CustomValidator;
import graphite.shared.DerivedObjectProperties;
import graphite.shared.Settings;
import workload.Effort;
import workload.Person;
import workload.Project;
import workload.WorkloadPackage;
import workload.impl.XtextTaskImpl;

public class ErrorReportingTests {

	private EmfModel model;
	private Project project;
	
	@Before
	public void setup() throws Exception {
		Settings.setMergeDerivedModelElements(false);
 		model = new EmfModel();
 		model.setMetamodelUris((Arrays.asList(WorkloadPackage.eINSTANCE.getNsURI()))); 		
 		model.setModelFile(new File(TestsData.MODEL).getAbsolutePath());
 		model.setReadOnLoad(true);
 		model.setStoredOnDisposal(false);
 		model.load();
 		project = (Project)model.getResource().getContents().get(0); 		
	}
	
	@After
	public void teardown() {
	    if (model != null) {
	    	model.getResource().unload();
	    }
	}
	
	@Test
	public void semanticErrorTriggered() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(2);
		assertEquals("Task has the initial expected efforts", "Alice : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
		task.setEffortsExpression("AliceX : 3\nBob : 6\nCharlie : 8");
		CustomValidator customValidator = new CustomValidator();
		BasicDiagnostic diagnostics = new BasicDiagnostic();
		boolean isValid = customValidator.validate((EClass)WorkloadPackage.eINSTANCE.getEClassifier("Person"), task, diagnostics, null);
		assertFalse("Validate boolean result", isValid);
		assertTrue("Expected error message", diagnostics.getChildren().get(0).getMessage().endsWith("Couldn't resolve reference to Person 'AliceX'."));
	}
	
	@Test
	public void syntaxErrorTriggered() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(2);
		assertEquals("Task has the initial expected efforts", "Alice : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
		task.setEffortsExpression("Alice : 3x\nBob : 6\nCharlie : 8");
		CustomValidator customValidator = new CustomValidator();
		BasicDiagnostic diagnostics = new BasicDiagnostic();
		boolean isValid = customValidator.validate((EClass)WorkloadPackage.eINSTANCE.getEClassifier("Person"), task, diagnostics, null);	
		assertFalse("Validate boolean result", isValid);
		assertTrue("Expected error message", diagnostics.getChildren().get(0).getMessage().endsWith("could not be parsed: missing EOF at 'x'"));
	}
	
	@Test
	public void semanticErrorSolved() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(2);
		assertEquals("Task has the initial expected efforts", "Alice : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
		task.setEffortsExpression("AliceX : 3\nBob : 6\nCharlie : 8");
		CustomValidator customValidator = new CustomValidator();
		BasicDiagnostic diagnostics1 = new BasicDiagnostic();
		boolean isValid1 = customValidator.validate((EClass)WorkloadPackage.eINSTANCE.getEClassifier("Person"), task, diagnostics1, null);
		assertFalse("Validate boolean result with error", isValid1);
		assertTrue("Expected error message with error", diagnostics1.getChildren().get(0).getMessage().endsWith("Couldn't resolve reference to Person 'AliceX'."));
		task.setEffortsExpression("Alice : 3\nBob : 6\nCharlie : 8");
		BasicDiagnostic diagnostics2 = new BasicDiagnostic();
		boolean isValid2 = customValidator.validate((EClass)WorkloadPackage.eINSTANCE.getEClassifier("Person"), task, diagnostics2, null);
		assertTrue("Validate boolean result without error", isValid2);
		assertTrue("Expected error message without error", diagnostics2.getChildren().isEmpty());
	}
	
	@Test
	public void syntaxErrorSolved() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(2);
		assertEquals("Task has the initial expected efforts", "Alice : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
		task.setEffortsExpression("Alice : 3x\nBob : 6\nCharlie : 8");
		CustomValidator customValidator = new CustomValidator();
		BasicDiagnostic diagnostics1 = new BasicDiagnostic();
		boolean isValid1 = customValidator.validate((EClass)WorkloadPackage.eINSTANCE.getEClassifier("Person"), task, diagnostics1, null);	
		assertFalse("Validate boolean result with error", isValid1);
		assertTrue("Expected error message with error", diagnostics1.getChildren().get(0).getMessage().endsWith("could not be parsed: missing EOF at 'x'"));	
		task.setEffortsExpression("Alice : 3\nBob : 6\nCharlie : 8");	
		BasicDiagnostic diagnostics2 = new BasicDiagnostic();
		boolean isValid2 = customValidator.validate((EClass)WorkloadPackage.eINSTANCE.getEClassifier("Person"), task, diagnostics2, null);
		assertTrue("Validate boolean result without error", isValid2);
		assertTrue("Expected error message without error", diagnostics2.getChildren().isEmpty());	
	}

	@Test
	public void toleratingTemporaryInconsistency() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(2);
		assertEquals("Task has the initial expected efforts", "Alice : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
		task.setEffortsExpression("AliceX : 3\nBob : 6\nCharlie : 8");	
		Person person = project.getPeople().get(0);
		Effort effort = task.getEfforts().get(0);
		assertEquals("Person element is unchanged", person, effort.getPerson());	
	}
	
	@Test
	public void managingInvalidExpression() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(2);
		assertEquals("Task has the initial expected efforts", "Alice : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
		task.setEffortsExpression("Alice : 3x\nBob : 6\nCharlie : 8");
		DerivedObjectProperties changedDerivedObjectProperties = null;
		for (DerivedObjectProperties derivedObjectProperties: task.getDerivedObjectsProperties().values()) {
			if (Objects.equals(derivedObjectProperties.getLastParsedString(), "Alice : 3x\nBob : 6\nCharlie : 8")) {
				changedDerivedObjectProperties = derivedObjectProperties;
				break;
			}
		}
		assertTrue("Expression is invalid", changedDerivedObjectProperties.isInvalid());
	}
	
	@Test
	public void managingValidExpression() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(2);
		assertEquals("Task has the initial expected efforts", "Alice : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
		DerivedObjectProperties changedDerivedObjectProperties = null;
		for (DerivedObjectProperties derivedObjectProperties: task.getDerivedObjectsProperties().values()) {
			if (Objects.equals(derivedObjectProperties.getLastParsedString(), "Alice : 3\nBob : 6\nCharlie : 8")) {
				changedDerivedObjectProperties = derivedObjectProperties;
				break;
			}
		}
		assertFalse("Expression is valid", changedDerivedObjectProperties.isInvalid());
	}
	
}
