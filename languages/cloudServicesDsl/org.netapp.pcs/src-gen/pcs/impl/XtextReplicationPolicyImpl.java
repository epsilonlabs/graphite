package pcs.impl;

import graphite.textual.XtextEObject;
import graphite.shared.DerivedObjectProperties;
import graphite.textual.DerivedObjectUtility;

import pcs.impl.PropertiesData.DerivedObjectName;

public class XtextReplicationPolicyImpl extends ReplicationPolicyImpl implements XtextEObject {

	@Override
	public void setReplication_mapping(String replication_mapping) {
		super.setReplication_mapping(replication_mapping);
		DerivedObjectUtility.setDeriveObject((DerivedObjectProperties)derivedObjectsProperties.get(DerivedObjectName.REPLICATIONPOLICY__REPLICATION_MAPPINGS), replication_mapping, getReplication_mappings());
	}
	
} //XtextReplicationPolicyImpl