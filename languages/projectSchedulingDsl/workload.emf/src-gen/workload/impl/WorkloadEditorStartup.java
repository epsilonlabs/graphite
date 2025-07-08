package workload.impl;

import workload.WorkloadPackage;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ui.IStartup;

import graphite.shared.CustomValidator;

public class WorkloadEditorStartup implements IStartup {
	
	public void earlyStartup() {
		EValidator.Registry.INSTANCE.put(WorkloadPackage.eINSTANCE, new CustomValidator());
	}
	
}