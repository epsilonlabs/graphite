package structurizr.impl;

import org.eclipse.emf.ecore.EFactory;

import graphite.textual.XtextBaseFactory;

import structurizr.StructurizrFactory;
import structurizr.SystemLandscapeView;
import structurizr.SystemContextView;
import structurizr.ContainerView;
import structurizr.ComponentView;

public class XtextStructurizrFactoryImpl extends StructurizrFactoryImpl implements XtextBaseFactory {

	private static EFactory baseFactory;
	
	public EFactory getBaseFactory() {
		return baseFactory;
	}
	
	public static StructurizrFactory init() {
		baseFactory = StructurizrFactoryImpl.init();
		return new XtextStructurizrFactoryImpl();
	}
	
	@Override
	public SystemLandscapeView createSystemLandscapeView() {
		SystemLandscapeViewImpl systemlandscapeview = new XtextSystemLandscapeViewImpl();
		return systemlandscapeview;
	}
	
	@Override
	public SystemContextView createSystemContextView() {
		SystemContextViewImpl systemcontextview = new XtextSystemContextViewImpl();
		return systemcontextview;
	}
	
	@Override
	public ContainerView createContainerView() {
		ContainerViewImpl containerview = new XtextContainerViewImpl();
		return containerview;
	}
	
	@Override
	public ComponentView createComponentView() {
		ComponentViewImpl componentview = new XtextComponentViewImpl();
		return componentview;
	}
	
} //XtextStructurizrFactoryImpl