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
import pcs.Environment;
import pcs.PcsFactory;
import pcs.PcsPackage;
import pcs.Volume;
import pcs.impl.PcsFactoryImpl;
import pcs.impl.XtextCVOImpl;
import pcs.impl.XtextReplicationPolicyImpl;

public class ConsistencyEnforcementTests {

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
	public void changedNameOfReference() {
		assertTrue("The Pcs is of type XtextCVOImpl", deployment.getPcs().get(0) instanceof XtextCVOImpl);
		XtextCVOImpl cvo = (XtextCVOImpl)deployment.getPcs().get(0);
		assertEquals("CVO has the initial expected volumes", "{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }", cvo.getVolume());
		Environment environment = deployment.getEnvironment();
		environment.setName("NetAppBlueXP1");
		assertEquals("CVO has the final expected volumes", "{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP1 } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }", cvo.getVolume());
	}
	
	@Test
	public void deletedReference() {
		assertTrue("The Pcs is of type XtextCVOImpl", deployment.getPcs().get(0) instanceof XtextCVOImpl);
		XtextCVOImpl cvo = (XtextCVOImpl)deployment.getPcs().get(0);
		assertEquals("CVO has the initial expected volumes", "{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , environment : NetAppBlueXP } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }", cvo.getVolume());
		Environment environment = deployment.getEnvironment();
		try {
			model.deleteElement(environment);
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}
		assertEquals("CVO has the final expected volumes", "{ { name : volume1 , size : 11 , size_unit : GB , svm_name : svn1 , } , { name : volume2 , size : 22 , size_unit : MB , svm_name : svn2 , snapshot_policy : snapshotPolicyDefault , } , { name : volume3 , size : 33 , size_unit : TB , svm_name : svn3 , } }", cvo.getVolume());
	}
	
	@Test
	public void invalidExpressionBecomingValid() {
		assertTrue("The Pcs is of type XtextReplicationPolicyImpl", deployment.getPcs().get(4) instanceof XtextReplicationPolicyImpl);
		XtextReplicationPolicyImpl replicationPolicy = (XtextReplicationPolicyImpl)deployment.getPcs().get(4);
		assertEquals("ReplicationPolicy has the initial expected mappings", "CVO_1 . volume3 <-> CVO_2 .volume22 { policy : snapshotPolicyDefault , max_transfer_rate : 55 }", replicationPolicy.getReplication_mapping());
		replicationPolicy.setReplication_mapping("CVO_1 . volume3x <-> CVO_2 .volume22 { policy : snapshotPolicyDefault , max_transfer_rate : 55 }");
		assertTrue("The Pcs is of type XtextCVOImpl", deployment.getPcs().get(0) instanceof XtextCVOImpl);
		XtextCVOImpl cvo = (XtextCVOImpl)deployment.getPcs().get(0);
		PcsFactory pcsFactory = PcsFactoryImpl.init();
		Volume volume = pcsFactory.createVolume();		
		cvo.getVolumes().add(volume);
		volume.setName("volume3x");
		assertEquals("Volume is the new source", volume, replicationPolicy.getReplication_mappings().get(0).getSource_volume());		
	}
	
}
