package TestingPackage.FuzzingOperations.impl;

import org.eclipse.emf.ecore.EFactory;

import graphite.textual.XtextBaseFactory;

import TestingPackage.FuzzingOperations.FuzzingOperationsFactory;
import TestingPackage.FuzzingOperations.ConditionBasedActivation;
import TestingPackage.FuzzingOperations.ConditionBasedTimeLimited;

public class XtextFuzzingOperationsFactoryImpl extends FuzzingOperationsFactoryImpl implements XtextBaseFactory {

	private static EFactory baseFactory;
	
	public EFactory getBaseFactory() {
		return baseFactory;
	}
	
	public static FuzzingOperationsFactory init() {
		baseFactory = FuzzingOperationsFactoryImpl.init();
		return new XtextFuzzingOperationsFactoryImpl();
	}
	
	@Override
	public ConditionBasedActivation createConditionBasedActivation() {
		ConditionBasedActivationImpl conditionbasedactivation = new XtextConditionBasedActivationImpl();
		return conditionbasedactivation;
	}
	
	@Override
	public ConditionBasedTimeLimited createConditionBasedTimeLimited() {
		ConditionBasedTimeLimitedImpl conditionbasedtimelimited = new XtextConditionBasedTimeLimitedImpl();
		return conditionbasedtimelimited;
	}
	
} //XtextFuzzingOperationsFactoryImpl