package org.netapp.pcs.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Arrays;

import org.eclipse.epsilon.emc.emf.EmfModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import graphite.shared.Settings;
import pcs.Deployment;
import pcs.PcsPackage;
import pcs.impl.XtextCVOImpl;
import pcs.impl.XtextReplicationPolicyImpl;

public class ModifyingTextualExpressionsTests {

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
	public void deleteReference() {
		assertTrue("The Pcs is of type XtextCVOImpl", deployment.getPcs().get(0) instanceof XtextCVOImpl);
		XtextCVOImpl cvo = (XtextCVOImpl)deployment.getPcs().get(0);
		assertEquals("CVO has the initial expected volumes", "{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }", cvo.getVolume());
		cvo.setVolume("{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }");	
		assertEquals("Volume has null environment", null, cvo.getVolumes().get(0).getEnvironment());
	}
	
	@Test
	public void deleteElement() {
		assertTrue("The Pcs is of type XtextCVOImpl", deployment.getPcs().get(0) instanceof XtextCVOImpl);
		XtextCVOImpl cvo = (XtextCVOImpl)deployment.getPcs().get(0);
		assertEquals("CVO has the initial expected volumes", "{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }", cvo.getVolume());
		assertTrue("CVO has three volumes", cvo.getVolumes().size() == 3);
		cvo.setVolume("{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } }");
		assertTrue("CVO has two volumes", cvo.getVolumes().size() == 2);
	}
	
	@Test
	public void deleteAllElements() {
		assertTrue("The Pcs is of type XtextCVOImpl", deployment.getPcs().get(0) instanceof XtextCVOImpl);
		XtextCVOImpl cvo = (XtextCVOImpl)deployment.getPcs().get(0);
		assertEquals("CVO has the initial expected volumes", "{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }", cvo.getVolume());
		assertTrue("CVO has three volumes", cvo.getVolumes().size() == 3);
		cvo.setVolume("{}");
		assertTrue("CVO has no volumes", cvo.getVolumes().isEmpty());
	}
	
	@Test
	public void changeReference() {
		assertTrue("The Pcs is of type XtextReplicationPolicyImpl", deployment.getPcs().get(4) instanceof XtextReplicationPolicyImpl);
		XtextReplicationPolicyImpl replicationPolicy = (XtextReplicationPolicyImpl)deployment.getPcs().get(4);
		assertEquals("ReplicationPolicy has the initial expected mappings", "CVO_1 . volume3 <-> CVO_2 .volume22 { policy : snapshotPolicyDefault , max_transfer_rate : 55 }", replicationPolicy.getReplication_mapping());
		replicationPolicy.setReplication_mapping("CVO_1 . volume1 <-> CVO_2 .volume22 { policy : snapshotPolicyDefault , max_transfer_rate : 55 }");	
		assertTrue("The Pcs is of type XtextCVOImpl", deployment.getPcs().get(0) instanceof XtextCVOImpl);
		XtextCVOImpl cvo = (XtextCVOImpl)deployment.getPcs().get(0);	
		assertEquals("ReplicationMapping has expected volume", cvo.getVolumes().get(0), replicationPolicy.getReplication_mappings().get(0).getSource_volume());
	}
	
	@Test
	public void changeValue() {
		assertTrue("The Pcs is of type XtextReplicationPolicyImpl", deployment.getPcs().get(4) instanceof XtextReplicationPolicyImpl);
		XtextReplicationPolicyImpl replicationPolicy = (XtextReplicationPolicyImpl)deployment.getPcs().get(4);
		assertEquals("ReplicationPolicy has the initial expected mappings", "CVO_1 . volume3 <-> CVO_2 .volume22 { policy : snapshotPolicyDefault , max_transfer_rate : 55 }", replicationPolicy.getReplication_mapping());
		replicationPolicy.setReplication_mapping("CVO_1 . volume3 <-> CVO_2 .volume22 { policy : snapshotPolicyDefault , max_transfer_rate : 1 }");
		assertEquals("ReplicationMapping has expected max_transfer_rate", 1, replicationPolicy.getReplication_mappings().get(0).getMax_transfer_rate());
	}
	
	@Test
	public void addElement() {
		assertTrue("The Pcs is of type XtextCVOImpl", deployment.getPcs().get(0) instanceof XtextCVOImpl);
		XtextCVOImpl cvo = (XtextCVOImpl)deployment.getPcs().get(0);
		assertEquals("CVO has the initial expected volumes", "{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }", cvo.getVolume());	
		assertTrue("CVO has three volumes", cvo.getVolumes().size() == 3);
		cvo.setVolume("{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } , { name : volume4 , size : 44 , size_unit : KB , } }");
		assertTrue("CVO has four volumes", cvo.getVolumes().size() == 4);	
		assertEquals("Volume has expected name", "volume4", cvo.getVolumes().get(3).getName());
		assertEquals("Volume has expected size", 44, cvo.getVolumes().get(3).getSize(), 1e-6);
		assertEquals("Volume has expected size_unit", "KB", cvo.getVolumes().get(3).getSize_unit());
	}
	
}
