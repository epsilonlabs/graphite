package structurizr.impl;

import graphite.textual.XtextEObject;
import graphite.shared.DerivedObjectProperties;
import graphite.textual.DerivedObjectUtility;

import structurizr.impl.PropertiesData.DerivedObjectName;

public class XtextSystemLandscapeViewImpl extends SystemLandscapeViewImpl implements XtextEObject {

	@Override
	public void setIncludeExpression(String includeExpression) {
		super.setIncludeExpression(includeExpression);
		DerivedObjectUtility.setDeriveObject((DerivedObjectProperties)derivedObjectsProperties.get(DerivedObjectName.SYSTEMLANDSCAPEVIEW__INCLUDE), includeExpression, getInclude());
	}
	
	@Override
	public void setExcludeExpression(String excludeExpression) {
		super.setExcludeExpression(excludeExpression);
		DerivedObjectUtility.setDeriveObject((DerivedObjectProperties)derivedObjectsProperties.get(DerivedObjectName.SYSTEMLANDSCAPEVIEW__EXCLUDE), excludeExpression, getExclude());
	}
	
} //XtextSystemLandscapeViewImpl