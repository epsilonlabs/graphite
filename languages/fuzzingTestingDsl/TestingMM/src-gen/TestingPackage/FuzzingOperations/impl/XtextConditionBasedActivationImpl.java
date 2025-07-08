package TestingPackage.FuzzingOperations.impl;

import graphite.textual.XtextEObject;
import graphite.shared.DerivedObjectProperties;
import graphite.textual.DerivedObjectUtility;

import TestingPackage.impl.PropertiesData.DerivedObjectName;

public class XtextConditionBasedActivationImpl extends ConditionBasedActivationImpl implements XtextEObject {

	@Override
	public void setStartingExpression(String startingExpression) {
		super.setStartingExpression(startingExpression);
		DerivedObjectUtility.setDeriveObject((DerivedObjectProperties)derivedObjectsProperties.get(DerivedObjectName.CONDITIONBASEDACTIVATION__STARTING), startingExpression, getStarting());
	}
	
	@Override
	public void setEndingExpression(String endingExpression) {
		super.setEndingExpression(endingExpression);
		DerivedObjectUtility.setDeriveObject((DerivedObjectProperties)derivedObjectsProperties.get(DerivedObjectName.CONDITIONBASEDACTIVATION__ENDING), endingExpression, getEnding());
	}
	
} //XtextConditionBasedActivationImpl