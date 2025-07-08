package TestingPackage.impl;

import TestingPackage.TestingMMPackage;
import TestingPackage.FuzzingOperations.FuzzingOperationsPackage;
import TestingPackage.Metrics.MetricsPackage;
import TestingPackage.Results.ResultsPackage;
import TestingPackage.StandardGrammar.StandardGrammarPackage;
import TestingPackage.MRSPackage.MRSPackagePackage;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ui.IStartup;

import graphite.shared.CustomValidator;

public class TestingMMEditorStartup implements IStartup {
	
	public void earlyStartup() {
		EValidator.Registry.INSTANCE.put(TestingMMPackage.eINSTANCE, new CustomValidator());
		EValidator.Registry.INSTANCE.put(FuzzingOperationsPackage.eINSTANCE, new CustomValidator());
		EValidator.Registry.INSTANCE.put(MetricsPackage.eINSTANCE, new CustomValidator());
		EValidator.Registry.INSTANCE.put(ResultsPackage.eINSTANCE, new CustomValidator());
		EValidator.Registry.INSTANCE.put(StandardGrammarPackage.eINSTANCE, new CustomValidator());
		EValidator.Registry.INSTANCE.put(MRSPackagePackage.eINSTANCE, new CustomValidator());
	}
	
}