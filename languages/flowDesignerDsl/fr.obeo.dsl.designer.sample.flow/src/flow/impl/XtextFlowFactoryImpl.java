package flow.impl;

import org.eclipse.emf.ecore.EFactory;

import graphite.textual.XtextBaseFactory;

import flow.FlowFactory;
import flow.CompositeProcessor;

public class XtextFlowFactoryImpl extends FlowFactoryImpl implements XtextBaseFactory {

	private static EFactory baseFactory;
	
	public EFactory getBaseFactory() {
		return baseFactory;
	}
	
	public static FlowFactory init() {
		baseFactory = FlowFactoryImpl.init();
		return new XtextFlowFactoryImpl();
	}
	
	@Override
	public CompositeProcessor createCompositeProcessor() {
		CompositeProcessorImpl compositeprocessor = new XtextCompositeProcessorImpl();
		return compositeprocessor;
	}
	
} //XtextFlowFactoryImpl