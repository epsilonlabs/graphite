package structurizr.impl;

import structurizr.StructurizrPackage;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ui.IStartup;

import graphite.shared.CustomValidator;

public class StructurizrEditorStartup implements IStartup {
	
	public void earlyStartup() {
		EValidator.Registry.INSTANCE.put(StructurizrPackage.eINSTANCE, new CustomValidator());
	}
	
}