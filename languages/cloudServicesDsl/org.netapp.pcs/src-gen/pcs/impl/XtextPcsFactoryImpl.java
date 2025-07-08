package pcs.impl;

import org.eclipse.emf.ecore.EFactory;

import graphite.textual.XtextBaseFactory;

import pcs.PcsFactory;
import pcs.ReplicationPolicy;
import pcs.CVO;

public class XtextPcsFactoryImpl extends PcsFactoryImpl implements XtextBaseFactory {

	private static EFactory baseFactory;
	
	public EFactory getBaseFactory() {
		return baseFactory;
	}
	
	public static PcsFactory init() {
		baseFactory = PcsFactoryImpl.init();
		return new XtextPcsFactoryImpl();
	}
	
	@Override
	public ReplicationPolicy createReplicationPolicy() {
		ReplicationPolicyImpl replicationpolicy = new XtextReplicationPolicyImpl();
		return replicationpolicy;
	}
	
	@Override
	public CVO createCVO() {
		CVOImpl cvo = new XtextCVOImpl();
		return cvo;
	}
	
} //XtextPcsFactoryImpl