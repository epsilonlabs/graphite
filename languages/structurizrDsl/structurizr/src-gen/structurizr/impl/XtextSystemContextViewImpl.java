package structurizr.impl;

import graphite.textual.XtextEObject;
import graphite.shared.DerivedObjectProperties;
import graphite.textual.DerivedObjectUtility;

import structurizr.impl.PropertiesData.DerivedObjectName;

public class XtextSystemContextViewImpl extends SystemContextViewImpl implements XtextEObject {

	@Override
	public void setIncludeExpression(String includeExpression) {
		super.setIncludeExpression(includeExpression);
		DerivedObjectUtility.setDeriveObject((DerivedObjectProperties)derivedObjectsProperties.get(DerivedObjectName.SYSTEMCONTEXTVIEW__INCLUDE), includeExpression, getInclude());
	}
	
	@Override
	public void setExcludeExpression(String excludeExpression) {
		super.setExcludeExpression(excludeExpression);
		DerivedObjectUtility.setDeriveObject((DerivedObjectProperties)derivedObjectsProperties.get(DerivedObjectName.SYSTEMCONTEXTVIEW__EXCLUDE), excludeExpression, getExclude());
	}
	
} //XtextSystemContextViewImpl