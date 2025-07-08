package org.netapp.pcs.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Arrays;

import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import graphite.shared.Settings;
import pcs.Deployment;
import pcs.PcsFactory;
import pcs.PcsPackage;
import pcs.SnapMirror;
import pcs.Volume;
import pcs.impl.PcsFactoryImpl;
import pcs.impl.XtextCVOImpl;
import pcs.impl.XtextReplicationPolicyImpl;

public class ModifyingDerivedElementsTests {

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
	public void changeElementReferenceValue() {
		assertTrue("The Pcs is of type XtextReplicationPolicyImpl", deployment.getPcs().get(4) instanceof XtextReplicationPolicyImpl);
		XtextReplicationPolicyImpl replicationPolicy = (XtextReplicationPolicyImpl)deployment.getPcs().get(4);
		assertEquals("ReplicationPolicy has the initial expected mappings", "CVO_1 . volume3 <-> CVO_2 .volume22 { policy : snapshotPolicyDefault , max_transfer_rate : 55 }", replicationPolicy.getReplication_mapping());
		assertTrue("The Pcs is of type XtextCVOImpl", deployment.getPcs().get(0) instanceof XtextCVOImpl);
		XtextCVOImpl cvo = (XtextCVOImpl)deployment.getPcs().get(0);
		SnapMirror snapMirror = replicationPolicy.getReplication_mappings().get(0);
		snapMirror.setSource_volume(cvo.getVolumes().get(0));
		assertEquals("ReplicationPolicy has the final expected mappings", "CVO_1 . volume1 <-> CVO_2 . volume22 { policy : snapshotPolicyDefault , max_transfer_rate : 55 }", replicationPolicy.getReplication_mapping());
	}
	
	@Test
	public void changeElementLiteralValue() {
		assertTrue("The Pcs is of type XtextReplicationPolicyImpl", deployment.getPcs().get(4) instanceof XtextReplicationPolicyImpl);
		XtextReplicationPolicyImpl replicationPolicy = (XtextReplicationPolicyImpl)deployment.getPcs().get(4);
		assertEquals("ReplicationPolicy has the initial expected mappings", "CVO_1 . volume3 <-> CVO_2 .volume22 { policy : snapshotPolicyDefault , max_transfer_rate : 55 }", replicationPolicy.getReplication_mapping());
		SnapMirror snapMirror = replicationPolicy.getReplication_mappings().get(0);
		snapMirror.setMax_transfer_rate(1);
		assertEquals("ReplicationPolicy has the final expected mappings", "CVO_1 . volume3 <-> CVO_2 . volume22 { policy : snapshotPolicyDefault , max_transfer_rate : 1 }", replicationPolicy.getReplication_mapping());
	}
	
	@Test
	public void setReferenceToNull() {
		assertTrue("The Pcs is of type XtextReplicationPolicyImpl", deployment.getPcs().get(4) instanceof XtextReplicationPolicyImpl);
		XtextReplicationPolicyImpl replicationPolicy = (XtextReplicationPolicyImpl)deployment.getPcs().get(4);
		assertEquals("ReplicationPolicy has the initial expected mappings", "CVO_1 . volume3 <-> CVO_2 .volume22 { policy : snapshotPolicyDefault , max_transfer_rate : 55 }", replicationPolicy.getReplication_mapping());
		SnapMirror snapMirror = replicationPolicy.getReplication_mappings().get(0);
		snapMirror.setSource_volume(null);
		assertEquals("ReplicationPolicy has the final expected mappings", "CVO_1 . <-> CVO_2 . volume22 { policy : snapshotPolicyDefault , max_transfer_rate : 55 }", replicationPolicy.getReplication_mapping());	
	}
	
	@Test
	public void deleteElement() {
		assertTrue("The Pcs is of type XtextCVOImpl", deployment.getPcs().get(0) instanceof XtextCVOImpl);
		XtextCVOImpl cvo = (XtextCVOImpl)deployment.getPcs().get(0);
		assertEquals("CVO has the initial expected volumes", "{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }", cvo.getVolume());
		try {
			model.deleteElement(cvo.getVolumes().get(0));
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}
		assertEquals("CVO has the final expected volumes", "{ { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }", cvo.getVolume());
	}
	
	@Test
	public void deleteAllElements() {
		assertTrue("The Pcs is of type XtextCVOImpl", deployment.getPcs().get(0) instanceof XtextCVOImpl);
		XtextCVOImpl cvo = (XtextCVOImpl)deployment.getPcs().get(0);
		assertEquals("CVO has the initial expected volumes", "{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }", cvo.getVolume());
		try {
			model.deleteElement(cvo.getVolumes().get(0));
			model.deleteElement(cvo.getVolumes().get(0));
			model.deleteElement(cvo.getVolumes().get(0));
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}
		assertEquals("CVO has the final expected volumes", "{ }", cvo.getVolume());
	}
	
	@Test
	public void changeOrderOfElements() {
		assertTrue("The Pcs is of type XtextCVOImpl", deployment.getPcs().get(0) instanceof XtextCVOImpl);
		XtextCVOImpl cvo = (XtextCVOImpl)deployment.getPcs().get(0);
		assertEquals("CVO has the initial expected volumes", "{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }", cvo.getVolume());
		cvo.getVolumes().move(2, 0);
		assertEquals("CVO has the final expected volumes", "{ { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } , { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } }", cvo.getVolume());
	}
	
	@Test
	public void addElement() {
		assertTrue("The Pcs is of type XtextCVOImpl", deployment.getPcs().get(0) instanceof XtextCVOImpl);
		XtextCVOImpl cvo = (XtextCVOImpl)deployment.getPcs().get(0);
		assertEquals("CVO has the initial expected volumes", "{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }", cvo.getVolume());
		PcsFactory pcsFactory = PcsFactoryImpl.init();
		Volume volume = pcsFactory.createVolume();
		volume.setName("volume4");
		volume.setSize(15);
		volume.setMultiplicity(3);
		volume.setSize_unit("KB");
		volume.setSvm_name("svn4");
		cvo.getVolumes().add(volume);
		assertEquals("CVO has the final expected volumes", "{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }", cvo.getVolume());	
	}
	
}
