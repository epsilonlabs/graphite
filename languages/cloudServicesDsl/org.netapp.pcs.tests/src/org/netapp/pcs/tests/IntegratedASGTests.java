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

public class IntegratedASGTests {

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
	public void equivalentCVO() {
		assertTrue("The Pcs is of type XtextCVOImpl", deployment.getPcs().get(0) instanceof XtextCVOImpl);
		XtextCVOImpl cvo = (XtextCVOImpl)deployment.getPcs().get(0);
		assertEquals("CVO has the initial expected volumes", "{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }", cvo.getVolume());
		
		assertEquals("First volume expected name", "volume1", cvo.getVolumes().get(0).getName());
		assertEquals("First volume expected size", 11, cvo.getVolumes().get(0).getSize(), 1e-6);
		assertEquals("First volume expected size_unit", "GB", cvo.getVolumes().get(0).getSize_unit());
		assertEquals("First volume expected svm_name", "svn1", cvo.getVolumes().get(0).getSvm_name());
		assertEquals("First volume expected environment", deployment.getEnvironment(), cvo.getVolumes().get(0).getEnvironment());
		
		assertEquals("Second volume expected name", "volume2", cvo.getVolumes().get(1).getName());
		assertEquals("Second volume expected size", 22, cvo.getVolumes().get(1).getSize(), 1e-6);
		assertEquals("Second volume expected size_unit", "MB", cvo.getVolumes().get(1).getSize_unit());
		assertEquals("Second volume expected svm_name", "svn2", cvo.getVolumes().get(1).getSvm_name());
		assertEquals("Second volume expected snapshot_policy", deployment.getSnapshotPolicy(), cvo.getVolumes().get(1).getSnapshot_policy());
		
		assertEquals("Third volume expected name", "volume3", cvo.getVolumes().get(2).getName());
		assertEquals("Third volume expected size", 33, cvo.getVolumes().get(2).getSize(), 1e-6);
		assertEquals("Third volume expected size_unit", "TB", cvo.getVolumes().get(2).getSize_unit());
		assertEquals("Third volume expected svm_name", "svn3", cvo.getVolumes().get(2).getSvm_name());
	}
	
	@Test
	public void equivalentReplicationPolicy() {
		assertTrue("The Pcs is of type XtextReplicationPolicyImpl", deployment.getPcs().get(4) instanceof XtextReplicationPolicyImpl);
		XtextReplicationPolicyImpl replicationPolicy = (XtextReplicationPolicyImpl)deployment.getPcs().get(4);
		assertEquals("ReplicationPolicy has the initial expected mappings", "CVO_1 . volume3 <-> CVO_2 .volume22 { policy : snapshotPolicyDefault , max_transfer_rate : 55 }", replicationPolicy.getReplication_mapping());
		
		assertTrue("First Pcs is of type XtextCVOImpl", deployment.getPcs().get(0) instanceof XtextCVOImpl);
		assertTrue("Fourth Pcs is of type XtextCVOImpl", deployment.getPcs().get(3) instanceof XtextCVOImpl);
		XtextCVOImpl cvo1 = (XtextCVOImpl)deployment.getPcs().get(0);
		XtextCVOImpl cvo2 = (XtextCVOImpl)deployment.getPcs().get(3);
		
		assertEquals("ReplicationMapping expected source_cvo", cvo1, replicationPolicy.getReplication_mappings().get(0).getSource_cvo());
		assertEquals("ReplicationMapping expected source_volume", cvo1.getVolumes().get(2), replicationPolicy.getReplication_mappings().get(0).getSource_volume());
		assertEquals("ReplicationMapping expected destination_cvo", cvo2, replicationPolicy.getReplication_mappings().get(0).getDestination_cvo());
		assertEquals("ReplicationMapping expected destination_volume", cvo2.getVolumes().get(1), replicationPolicy.getReplication_mappings().get(0).getDestination_volume());
		assertEquals("ReplicationMapping expected policy", deployment.getSnapshotPolicy(), replicationPolicy.getReplication_mappings().get(0).getPolicy());
		assertEquals("ReplicationMapping expected max_transfer_rate", 55, replicationPolicy.getReplication_mappings().get(0).getMax_transfer_rate());
	}
	
}
