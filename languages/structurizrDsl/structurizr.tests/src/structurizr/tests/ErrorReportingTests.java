package structurizr.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import graphite.shared.CustomValidator;
import graphite.shared.DerivedObjectProperties;
import graphite.shared.Settings;
import structurizr.ElementTagCondition;
import structurizr.StructurizrPackage;
import structurizr.Tag;
import structurizr.Workspace;
import structurizr.impl.XtextContainerViewImpl;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.epsilon.emc.emf.EmfModel;


public class ErrorReportingTests {
	
	private EmfModel model;
	private Workspace workspace;
	
	@Before
	public void setup() throws Exception {
		Settings.setMergeDerivedModelElements(false);
 		model = new EmfModel();
 		model.setMetamodelUris((Arrays.asList(StructurizrPackage.eINSTANCE.getNsURI()))); 		
 		model.setModelFile(new File(TestsData.MODEL).getAbsolutePath());
 		model.setReadOnLoad(true);
 		model.setStoredOnDisposal(false);
 		model.load();
 		workspace = (Workspace)model.getResource().getContents().get(0);	
	}
	
	@After
	public void teardown() {
	    if (model != null) {
	    	model.getResource().unload();
	    }
	}
	
	@Test
	public void semanticErrorTriggered() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected include", "( element.tag  != personMain)", containerView.getIncludeExpression());
		containerView.setIncludeExpression("( element.tag  != personMainX)");
		CustomValidator customValidator = new CustomValidator();
		BasicDiagnostic diagnostics = new BasicDiagnostic();
		boolean isValid = customValidator.validate((EClass)StructurizrPackage.eINSTANCE.getEClassifier("Person"), containerView, diagnostics, null);
		assertFalse("Validate boolean result", isValid);
		assertTrue("Expected error message", diagnostics.getChildren().get(0).getMessage().endsWith("Couldn't resolve reference to Tag 'personMainX'."));
	}
	
	@Test
	public void syntaxErrorTriggered() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected include", "( element.tag  != personMain)", containerView.getIncludeExpression());
		containerView.setIncludeExpression("( element.tag  !x= personMain)");
		CustomValidator customValidator = new CustomValidator();
		BasicDiagnostic diagnostics = new BasicDiagnostic();
		boolean isValid = customValidator.validate((EClass)StructurizrPackage.eINSTANCE.getEClassifier("Person"), containerView, diagnostics, null);
		assertFalse("Validate boolean result", isValid);
		assertTrue("Expected error message", diagnostics.getChildren().get(0).getMessage().endsWith("could not be parsed: no viable alternative at input '!'"));
	}
	
	@Test
	public void semanticErrorSolved() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected include", "( element.tag  != personMain)", containerView.getIncludeExpression());
		containerView.setIncludeExpression("( element.tag  != personMainX)");
		CustomValidator customValidator = new CustomValidator();
		BasicDiagnostic diagnostics1 = new BasicDiagnostic();
		boolean isValid1 = customValidator.validate((EClass)StructurizrPackage.eINSTANCE.getEClassifier("Person"), containerView, diagnostics1, null);
		assertFalse("Validate boolean result with error", isValid1);
		assertTrue("Expected error message with error", diagnostics1.getChildren().get(0).getMessage().endsWith("Couldn't resolve reference to Tag 'personMainX'."));
		containerView.setIncludeExpression("( element.tag  != personMain)");
		BasicDiagnostic diagnostics2 = new BasicDiagnostic();
		boolean isValid2 = customValidator.validate((EClass)StructurizrPackage.eINSTANCE.getEClassifier("Person"), containerView, diagnostics2, null);
		assertTrue("Validate boolean result without error", isValid2);
		assertTrue("Expected error message without error", diagnostics2.getChildren().isEmpty());
	}
	
	@Test
	public void syntaxErrorSolved() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected include", "( element.tag  != personMain)", containerView.getIncludeExpression());
		containerView.setIncludeExpression("( element.tag  !x= personMain)");
		CustomValidator customValidator = new CustomValidator();
		BasicDiagnostic diagnostics1 = new BasicDiagnostic();
		boolean isValid1 = customValidator.validate((EClass)StructurizrPackage.eINSTANCE.getEClassifier("Person"), containerView, diagnostics1, null);
		assertFalse("Validate boolean result with error", isValid1);
		assertTrue("Expected error message with error", diagnostics1.getChildren().get(0).getMessage().endsWith("could not be parsed: no viable alternative at input '!'"));
		containerView.setIncludeExpression("( element.tag  != personMain)");	
		BasicDiagnostic diagnostics2 = new BasicDiagnostic();
		boolean isValid2 = customValidator.validate((EClass)StructurizrPackage.eINSTANCE.getEClassifier("Person"), containerView, diagnostics2, null);
		assertTrue("Validate boolean result without error", isValid2);
		assertTrue("Expected error message without error", diagnostics2.getChildren().isEmpty());
	}
	
	@Test
	public void toleratingTemporaryInconsistency() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected include", "( element.tag  != personMain)", containerView.getIncludeExpression());
		containerView.setIncludeExpression("( element.tag  != personMainX)");
		Tag tag = workspace.getModel().getPersons().get(0).getTags().get(0);
		assertTrue("Include condition is ElementTagCondition", containerView.getInclude() instanceof ElementTagCondition);
		ElementTagCondition elementTagCondition = ((ElementTagCondition)containerView.getInclude());
		assertEquals("Tag element is unchanged", tag, elementTagCondition.getTags().get(0));	
	}
	
	@Test
	public void managingInvalidExpression() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected include", "( element.tag  != personMain)", containerView.getIncludeExpression());
		containerView.setIncludeExpression("( element.tag  !X= personMain)");
		DerivedObjectProperties changedDerivedObjectProperties = null;
		for (DerivedObjectProperties derivedObjectProperties: containerView.getDerivedObjectsProperties().values()) {
			if (Objects.equals(derivedObjectProperties.getLastParsedString(), "( element.tag  !X= personMain)")) {
				changedDerivedObjectProperties = derivedObjectProperties;
				break;
			}
		}
		assertTrue("Expression is invalid", changedDerivedObjectProperties.isInvalid());
	}
	
	@Test
	public void managingValidExpression() {
		assertTrue("First view is XtextContainerViewImpl", workspace.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace.getViews().getViewElements().get(0);
		assertEquals("ContainerView has the initial expected include", "( element.tag  != personMain)", containerView.getIncludeExpression());
		DerivedObjectProperties changedDerivedObjectProperties = null;
		for (DerivedObjectProperties derivedObjectProperties: containerView.getDerivedObjectsProperties().values()) {
			if (Objects.equals(derivedObjectProperties.getLastParsedString(), "( element.tag  != personMain)")) {
				changedDerivedObjectProperties = derivedObjectProperties;
				break;
			}
		}
		assertFalse("Expression is valid", changedDerivedObjectProperties.isInvalid());
	}
	
}
