package TestingPackage.FuzzingOperations.impl;

import graphite.textual.XtextEObject;
import graphite.shared.DerivedObjectProperties;
import graphite.textual.DerivedObjectUtility;

import TestingPackage.impl.PropertiesData.DerivedObjectName;

public class XtextConditionBasedTimeLimitedImpl extends ConditionBasedTimeLimitedImpl implements XtextEObject {

	@Override
	public void setStartingExpression(String startingExpression) {
		super.setStartingExpression(startingExpression);
		DerivedObjectUtility.setDeriveObject((DerivedObjectProperties)derivedObjectsProperties.get(DerivedObjectName.CONDITIONBASEDTIMELIMITED__STARTING), startingExpression, getStarting());
	}
	
} //XtextConditionBasedTimeLimitedImpl