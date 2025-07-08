package pcs.impl;

import pcs.PcsPackage;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ui.IStartup;

import graphite.shared.CustomValidator;

public class PcsEditorStartup implements IStartup {
	
	public void earlyStartup() {
		EValidator.Registry.INSTANCE.put(PcsPackage.eINSTANCE, new CustomValidator());
	}
	
}