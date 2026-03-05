package flow.impl;

import graphite.textual.XtextEObject;
import graphite.shared.DerivedObjectProperties;
import graphite.textual.DerivedObjectUtility;

import flow.impl.PropertiesData.DerivedObjectName;

public class XtextCompositeProcessorImpl extends CompositeProcessorImpl implements XtextEObject {

	@Override
	public void setRoutingRules(String routingRules) {
		super.setRoutingRules(routingRules);
		DerivedObjectUtility.setDeriveObject((DerivedObjectProperties)derivedObjectsProperties.get(DerivedObjectName.COMPOSITEPROCESSOR__ROUTING_RULES_LIST), routingRules, getRoutingRulesList());
	}
	
} //XtextCompositeProcessorImpl