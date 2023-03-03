package graphite.shared;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.ui.IStartup;

public class EditorStartup implements IStartup {

	public void earlyStartup() {
		EPackage ePackage = (EPackage) EPackage.Registry.INSTANCE.get(WorkbenchData.getModelData().getPackageName());
		EValidator.Registry.INSTANCE.put(ePackage, new CustomValidator());
	}
}