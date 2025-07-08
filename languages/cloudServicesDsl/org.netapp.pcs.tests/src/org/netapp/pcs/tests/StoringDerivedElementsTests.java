package org.netapp.pcs.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;

import org.eclipse.epsilon.emc.emf.EmfModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import graphite.shared.DerivedObjectProperties;
import graphite.shared.FilesUtility;
import graphite.shared.Settings;
import pcs.Deployment;
import pcs.PcsPackage;
import pcs.impl.XtextCVOImpl;

public class StoringDerivedElementsTests {

	private EmfModel validModel;
	private EmfModel invalidModel;
	private Deployment deployment1;
	private Deployment deployment2;
	
	@Before
	public void setup() throws Exception {
		validModel = new EmfModel();
		validModel.setMetamodelUris((Arrays.asList(PcsPackage.eINSTANCE.getNsURI()))); 		
		validModel.setModelFile(new File(TestsData.MODEL_VALID).getAbsolutePath());
		validModel.setReadOnLoad(true);
		validModel.setStoredOnDisposal(false);
		validModel.load();
		
		invalidModel = new EmfModel();
 		invalidModel.setMetamodelUris((Arrays.asList(PcsPackage.eINSTANCE.getNsURI()))); 		
 		invalidModel.setModelFile(new File(TestsData.MODEL_INVALID).getAbsolutePath());
 		invalidModel.setReadOnLoad(true);
 		invalidModel.setStoredOnDisposal(false);
 		invalidModel.load();
 		
 		deployment1 = (Deployment)validModel.getResource().getContents().get(0);		
 		deployment2 = (Deployment)invalidModel.getResource().getContents().get(0);
	}
	
	@After
	public void teardown() {
		if (validModel != null) {
	    	validModel.getResource().unload();
	    }
	    if (invalidModel != null) {
	    	invalidModel.getResource().unload();
	    }
	}
	
	@Test
	public void storeValidDerivedElements() {
		assertTrue("First Pcs is of type XtextCVOImpl", deployment1.getPcs().get(0) instanceof XtextCVOImpl);
		assertTrue("Fourth Pcs is of type XtextCVOImpl", deployment1.getPcs().get(3) instanceof XtextCVOImpl);
		XtextCVOImpl cvo1 = (XtextCVOImpl)deployment1.getPcs().get(0);
		XtextCVOImpl cvo2 = (XtextCVOImpl)deployment1.getPcs().get(3);
		for (DerivedObjectProperties derivedObjectProperties: cvo1.getDerivedObjectsProperties().values()) {
			assertFalse("CVO1 Expression is valid", derivedObjectProperties.isInvalid());
		}
		for (DerivedObjectProperties derivedObjectProperties: cvo2.getDerivedObjectsProperties().values()) {
			assertFalse("CVO2 Expression is valid", derivedObjectProperties.isInvalid());
		}
		
		String serializedDerivedElements1 = "<volumes name=\"volume1\" environment=\"//@environment\" size=\"11.0\" size_unit=\"GB\" svm_name=\"svn1\"/>\n"
				+ "    <volumes name=\"volume2\" snapshot_policy=\"//@snapshotPolicy\" size=\"22.0\" size_unit=\"MB\" svm_name=\"svn2\"/>\n"
				+ "    <volumes name=\"volume3\" size=\"33.0\" size_unit=\"TB\" svm_name=\"svn3\"/>";
		
		String serializedDerivedElements2 = "<volumes name=\"volume11\" environment=\"//@environment\" size=\"11.0\" size_unit=\"GB\" svm_name=\"svn1\"/>\n"
				+ "    <volumes name=\"volume22\" snapshot_policy=\"//@snapshotPolicy\" size=\"22.0\" size_unit=\"MB\" svm_name=\"svn2\"/>\n"
				+ "    <volumes name=\"volume33\" size=\"33.0\" size_unit=\"TB\" svm_name=\"svn3\"/>";
				
		try {
			Settings.setStoreDerivedModelElements(false);
			validModel.store();			
			String modelContent = FilesUtility.readNormalizedFile(Path.of(TestsData.MODEL_VALID));
			assertFalse("First valid derived elements not stored", modelContent.contains(serializedDerivedElements1));
			assertFalse("Last valid derived elements not stored", modelContent.contains(serializedDerivedElements2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void storeInvalidDerivedElements() {
		assertTrue("First Pcs is of type XtextCVOImpl", deployment2.getPcs().get(0) instanceof XtextCVOImpl);
		assertTrue("Fourth Pcs is of type XtextCVOImpl", deployment2.getPcs().get(3) instanceof XtextCVOImpl);
		XtextCVOImpl cvo1 = (XtextCVOImpl)deployment2.getPcs().get(0);
		XtextCVOImpl cvo2 = (XtextCVOImpl)deployment2.getPcs().get(3);
		for (DerivedObjectProperties derivedObjectProperties: cvo1.getDerivedObjectsProperties().values()) {
			assertTrue("CVO1 Expression is invalid", derivedObjectProperties.isInvalid());
		}
		for (DerivedObjectProperties derivedObjectProperties: cvo2.getDerivedObjectsProperties().values()) {
			assertFalse("CVO2 Expression is valid", derivedObjectProperties.isInvalid());
		}
		
		String serializedDerivedElements1 = "<volumes name=\"volume1\" environment=\"//@environment\" size=\"11.0\" size_unit=\"GB\" svm_name=\"svn1\"/>\n"
				+ "    <volumes name=\"volume2\" snapshot_policy=\"//@snapshotPolicy\" size=\"22.0\" size_unit=\"MB\" svm_name=\"svn2\"/>\n"
				+ "    <volumes name=\"volume3\" size=\"33.0\" size_unit=\"TB\" svm_name=\"svn3\"/>";
		
		String serializedDerivedElements2 = "<volumes name=\"volume11\" environment=\"//@environment\" size=\"11.0\" size_unit=\"GB\" svm_name=\"svn1\"/>\n"
				+ "    <volumes name=\"volume22\" snapshot_policy=\"//@snapshotPolicy\" size=\"22.0\" size_unit=\"MB\" svm_name=\"svn2\"/>\n"
				+ "    <volumes name=\"volume33\" size=\"33.0\" size_unit=\"TB\" svm_name=\"svn3\"/>";
		
		try {
			Settings.setStoreDerivedModelElements(false);
			invalidModel.store();			
			String modelContent = FilesUtility.readNormalizedFile(Path.of(TestsData.MODEL_INVALID));
			assertTrue("Invalid derived elements stored", modelContent.contains(serializedDerivedElements1));
			assertFalse("Valid derived elements not stored", modelContent.contains(serializedDerivedElements2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
