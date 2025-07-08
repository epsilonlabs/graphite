package pcs.impl;

import graphite.textual.XtextEObject;
import graphite.shared.DerivedObjectProperties;
import graphite.textual.DerivedObjectUtility;

import pcs.impl.PropertiesData.DerivedObjectName;

public class XtextCVOImpl extends CVOImpl implements XtextEObject {

	@Override
	public void setVolume(String volume) {
		super.setVolume(volume);
		DerivedObjectUtility.setDeriveObject((DerivedObjectProperties)derivedObjectsProperties.get(DerivedObjectName.CVO__VOLUMES), volume, getVolumes());
	}
	
} //XtextCVOImpl