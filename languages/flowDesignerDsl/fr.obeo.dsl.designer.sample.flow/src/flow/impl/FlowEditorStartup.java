package flow.impl;

import flow.FlowPackage;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ui.IStartup;

import graphite.shared.CustomValidator;

public class FlowEditorStartup implements IStartup {
	
	public void earlyStartup() {
		EValidator.Registry.INSTANCE.put(FlowPackage.eINSTANCE, new CustomValidator());
	}
	
}