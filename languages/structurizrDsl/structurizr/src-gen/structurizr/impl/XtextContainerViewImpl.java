package structurizr.impl;

import graphite.textual.XtextEObject;
import graphite.shared.DerivedObjectProperties;
import graphite.textual.DerivedObjectUtility;

import structurizr.impl.PropertiesData.DerivedObjectName;

public class XtextContainerViewImpl extends ContainerViewImpl implements XtextEObject {

	@Override
	public void setIncludeExpression(String includeExpression) {
		super.setIncludeExpression(includeExpression);
		DerivedObjectUtility.setDeriveObject((DerivedObjectProperties)derivedObjectsProperties.get(DerivedObjectName.CONTAINERVIEW__INCLUDE), includeExpression, getInclude());
	}
	
	@Override
	public void setExcludeExpression(String excludeExpression) {
		super.setExcludeExpression(excludeExpression);
		DerivedObjectUtility.setDeriveObject((DerivedObjectProperties)derivedObjectsProperties.get(DerivedObjectName.CONTAINERVIEW__EXCLUDE), excludeExpression, getExclude());
	}
	
} //XtextContainerViewImpl