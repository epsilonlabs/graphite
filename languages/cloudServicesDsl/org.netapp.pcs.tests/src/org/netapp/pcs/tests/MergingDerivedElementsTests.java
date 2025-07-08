package org.netapp.pcs.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.epsilon.emc.emf.EmfModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import graphite.shared.Settings;
import pcs.Deployment;
import pcs.PcsPackage;
import pcs.Volume;
import pcs.impl.XtextCVOImpl;

public class MergingDerivedElementsTests {

	private EmfModel model;
	private Deployment deployment;
	
	@Before
	public void setup() throws Exception {
		Settings.setMergeDerivedModelElements(true);
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
	public void mergingElementsReversedList() {	
		assertTrue("The Pcs is of type XtextCVOImpl", deployment.getPcs().get(0) instanceof XtextCVOImpl);
		XtextCVOImpl cvo = (XtextCVOImpl)deployment.getPcs().get(0);
		assertEquals("CVO has the initial expected volumes", "{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }", cvo.getVolume());
		List<Volume> initialVolumes = new ArrayList<Volume>();
		initialVolumes.addAll(cvo.getVolumes());
		cvo.setVolume("{ { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } }");
		List<Volume> finalVolumes = cvo.getVolumes();
		assertEquals("First volume is now last volume", initialVolumes.get(0), finalVolumes.get(2));
		assertEquals("Middle volume is now middle volume", initialVolumes.get(1), finalVolumes.get(1));
		assertEquals("Last volume is now first volume", initialVolumes.get(2), finalVolumes.get(0));
	}
	
	@Test
	public void mergingElementsChangedValues() {
		assertTrue("The Pcs is of type XtextCVOImpl", deployment.getPcs().get(0) instanceof XtextCVOImpl);
		XtextCVOImpl cvo = (XtextCVOImpl)deployment.getPcs().get(0);
		assertEquals("CVO has the initial expected volumes", "{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }", cvo.getVolume());
		List<Volume> initialVolumes = new ArrayList<Volume>();
		initialVolumes.addAll(cvo.getVolumes());
		cvo.setVolume("{ { name : volume3 , size : 22 , size_unit : MB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume1 , size : 33 , size_unit : TB , svm_name : svn2 , } , { name : volume2 , size : 11 , size_unit : GB , svm_name : svn3 , snapshot_policy : snapshotPolicyDefault , } }");
		List<Volume> finalVolumes = cvo.getVolumes();
		assertEquals("First volume is now second volume", initialVolumes.get(0), finalVolumes.get(1));
		assertEquals("Second volume is now third volume", initialVolumes.get(1), finalVolumes.get(2));
		assertEquals("Third volume is now first volume", initialVolumes.get(2), finalVolumes.get(0));
	}
	
}
