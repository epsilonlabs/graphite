package org.netapp.pcs.tests;

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
import pcs.Deployment;
import pcs.Environment;
import pcs.PcsPackage;
import pcs.impl.XtextCVOImpl;

public class ErrorReportingTests {

	private EmfModel model;
	private Deployment deployment;
	
	@Before
	public void setup() throws Exception {
		Settings.setMergeDerivedModelElements(false);
 		model = new EmfModel();
 		model.setMetamodelUris((Arrays.asList(PcsPackage.eINSTANCE.getNsURI()))); 		
 		model.setModelFile(new File(TestsData.MODEL).getAbsolutePath());
 		model.setReadOnLoad(true);
 		model.setStoredOnDisposal(false);
 		model.load();
 		deployment = (Deployment)model.getResource().getContents().get(0);
	}
	
	@After
	public void teardown() {
	    if (model != null) {
	    	model.getResource().unload();
	    }
	}
	
	@Test
	public void semanticErrorTriggered() {
		assertTrue("The Pcs is of type XtextCVOImpl", deployment.getPcs().get(0) instanceof XtextCVOImpl);
		XtextCVOImpl cvo = (XtextCVOImpl)deployment.getPcs().get(0);
		assertEquals("CVO has the initial expected volumes", "{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }", cvo.getVolume());
		cvo.setVolume("{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP1 } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }");
		CustomValidator customValidator = new CustomValidator();
		BasicDiagnostic diagnostics = new BasicDiagnostic();
		boolean isValid = customValidator.validate((EClass)PcsPackage.eINSTANCE.getEClassifier("Volume"), cvo, diagnostics, null);
		assertFalse("Validate boolean result", isValid);
		assertTrue("Expected error message", diagnostics.getChildren().get(0).getMessage().endsWith("Couldn't resolve reference to Environment 'NetAppBlueXP1'."));
	}
	
	@Test
	public void syntaxErrorTriggered() {
		assertTrue("The Pcs is of type XtextCVOImpl", deployment.getPcs().get(0) instanceof XtextCVOImpl);
		XtextCVOImpl cvo = (XtextCVOImpl)deployment.getPcs().get(0);
		assertEquals("CVO has the initial expected volumes", "{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }", cvo.getVolume());
		cvo.setVolume("{ { name : volume1 , size : 11x , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }");
		CustomValidator customValidator = new CustomValidator();
		BasicDiagnostic diagnostics = new BasicDiagnostic();
		boolean isValid = customValidator.validate((EClass)PcsPackage.eINSTANCE.getEClassifier("Volume"), cvo, diagnostics, null);
		assertFalse("Validate boolean result", isValid);
		assertTrue("Expected error message", diagnostics.getChildren().get(0).getMessage().endsWith("could not be parsed: extraneous input 'x' expecting ','"));
	}
	
	@Test
	public void semanticErrorSolved() {
		assertTrue("The Pcs is of type XtextCVOImpl", deployment.getPcs().get(0) instanceof XtextCVOImpl);
		XtextCVOImpl cvo = (XtextCVOImpl)deployment.getPcs().get(0);
		assertEquals("CVO has the initial expected volumes", "{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }", cvo.getVolume());
		cvo.setVolume("{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP1 } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }");
		CustomValidator customValidator = new CustomValidator();
		BasicDiagnostic diagnostics1 = new BasicDiagnostic();
		boolean isValid1 = customValidator.validate((EClass)PcsPackage.eINSTANCE.getEClassifier("Volume"), cvo, diagnostics1, null);
		assertFalse("Validate boolean result with error", isValid1);
		assertTrue("Expected error message with error", diagnostics1.getChildren().get(0).getMessage().endsWith("Couldn't resolve reference to Environment 'NetAppBlueXP1'."));
		cvo.setVolume("{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }");
		BasicDiagnostic diagnostics2 = new BasicDiagnostic();
		boolean isValid2 = customValidator.validate((EClass)PcsPackage.eINSTANCE.getEClassifier("Volume"), cvo, diagnostics2, null);
		assertTrue("Validate boolean result without error", isValid2);
		assertTrue("Expected error message without error", diagnostics2.getChildren().isEmpty());
	}
	
	@Test
	public void syntaxErrorSolved() {
		assertTrue("The Pcs is of type XtextCVOImpl", deployment.getPcs().get(0) instanceof XtextCVOImpl);
		XtextCVOImpl cvo = (XtextCVOImpl)deployment.getPcs().get(0);
		assertEquals("CVO has the initial expected volumes", "{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }", cvo.getVolume());
		cvo.setVolume("{ { name : volume1 , size : 11x , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }");
		CustomValidator customValidator = new CustomValidator();
		BasicDiagnostic diagnostics1 = new BasicDiagnostic();
		boolean isValid1 = customValidator.validate((EClass)PcsPackage.eINSTANCE.getEClassifier("Volume"), cvo, diagnostics1, null);
		assertFalse("Validate boolean result with error", isValid1);
		assertTrue("Expected error message with error", diagnostics1.getChildren().get(0).getMessage().endsWith("could not be parsed: extraneous input 'x' expecting ','"));
		cvo.setVolume("{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }");
		BasicDiagnostic diagnostics2 = new BasicDiagnostic();
		boolean isValid2 = customValidator.validate((EClass)PcsPackage.eINSTANCE.getEClassifier("Volume"), cvo, diagnostics2, null);
		assertTrue("Validate boolean result without error", isValid2);
		assertTrue("Expected error message without error", diagnostics2.getChildren().isEmpty());
	}
	
	@Test
	public void toleratingTemporaryInconsistency() {
		assertTrue("The Pcs is of type XtextCVOImpl", deployment.getPcs().get(0) instanceof XtextCVOImpl);
		XtextCVOImpl cvo = (XtextCVOImpl)deployment.getPcs().get(0);
		assertEquals("CVO has the initial expected volumes", "{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }", cvo.getVolume());
		cvo.setVolume("{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP1 } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }");
		Environment environment = deployment.getEnvironment();
		assertEquals("Environment element is unchanged", environment, cvo.getVolumes().get(0).getEnvironment());
	}
	
	@Test
	public void managingInvalidExpression() {
		assertTrue("The Pcs is of type XtextCVOImpl", deployment.getPcs().get(0) instanceof XtextCVOImpl);
		XtextCVOImpl cvo = (XtextCVOImpl)deployment.getPcs().get(0);
		assertEquals("CVO has the initial expected volumes", "{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }", cvo.getVolume());
		cvo.setVolume("{ { name : volume1 , size : 11x , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }");	
		DerivedObjectProperties changedDerivedObjectProperties = null;
		for (DerivedObjectProperties derivedObjectProperties: cvo.getDerivedObjectsProperties().values()) {
			if (Objects.equals(derivedObjectProperties.getLastParsedString(), "{ { name : volume1 , size : 11x , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }")) {
				changedDerivedObjectProperties = derivedObjectProperties;
				break;
			}
		}
		assertTrue("Expression is invalid", changedDerivedObjectProperties.isInvalid());	
	}
	
	@Test
	public void managingValidExpression() {
		assertTrue("The Pcs is of type XtextCVOImpl", deployment.getPcs().get(0) instanceof XtextCVOImpl);
		XtextCVOImpl cvo = (XtextCVOImpl)deployment.getPcs().get(0);
		assertEquals("CVO has the initial expected volumes", "{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }", cvo.getVolume());	
		DerivedObjectProperties changedDerivedObjectProperties = null;
		for (DerivedObjectProperties derivedObjectProperties: cvo.getDerivedObjectsProperties().values()) {
			if (Objects.equals(derivedObjectProperties.getLastParsedString(), "{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }")) {
				changedDerivedObjectProperties = derivedObjectProperties;
				break;
			}
		}
		assertFalse("Expression is valid", changedDerivedObjectProperties.isInvalid());
	}
	
}
