package workload.impl;

import graphite.textual.XtextEObject;
import graphite.shared.DerivedObjectProperties;
import graphite.textual.DerivedObjectUtility;

import workload.impl.PropertiesData.DerivedObjectName;

public class XtextTaskImpl extends TaskImpl implements XtextEObject {

	@Override
	public void setEffortsExpression(String effortsExpression) {
		super.setEffortsExpression(effortsExpression);
		DerivedObjectUtility.setDeriveObject((DerivedObjectProperties)derivedObjectsProperties.get(DerivedObjectName.TASK__EFFORTS), effortsExpression, getEfforts());
	}
	
} //XtextTaskImpl