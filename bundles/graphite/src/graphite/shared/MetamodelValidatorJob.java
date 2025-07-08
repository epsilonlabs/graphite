package graphite.shared;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.epsilon.common.dt.console.EpsilonConsole;
import org.eclipse.epsilon.emc.emf.CachedResourceSet;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;


public class MetamodelValidatorJob extends Job {

	private Map<String, List<IFile>> selectedModels;
	
	public MetamodelValidatorJob(Map<String, List<IFile>> selectedModels)  {
		super("Validate metamodel");
		this.selectedModels = selectedModels;
	}
	
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			boolean isValid = validateMetamodel();
			return isValid ? Status.OK_STATUS : Status.CANCEL_STATUS;
		}
		catch (Exception e) {
			e.printStackTrace();
			return Status.CANCEL_STATUS;
		}
	}
	
	public boolean validateMetamodel() throws Exception {
		
		EvlModule metamodelEvlModule = null;
		
		EpsilonConsole.getInstance().clear();

		try {
			
			if (selectedModels.get(ModelExtension.METAMODEL_EXTENSION).size() > 1) {
				Display.getDefault().asyncExec(() -> {
					MessageDialog.openError(Display.getDefault().getActiveShell(),
		 				"Validation Failed",
		 				"There must be a single metamodel (.ecore) selected.");
		 		});
				return false;
			}
			
			IFile metamodelFile = selectedModels.get(ModelExtension.METAMODEL_EXTENSION).get(0);
 			URI metamodelUri = FilesUtility.getPlatformURI(metamodelFile);
 			
			metamodelFile.deleteMarkers(EValidator.MARKER, true, IResource.DEPTH_ZERO);
			
			EmfModel metamodel = new EmfModel();
	 		metamodel.setMetamodelUris(Arrays.asList(EcorePackage.eINSTANCE.getNsURI()));
	 		metamodel.setModelFileUri(metamodelUri);
	 		metamodel.setName("Metamodel");
	 		metamodel.setReadOnLoad(true);
	 		metamodel.setStoredOnDisposal(false);
	 		metamodel.setCachingEnabled(false);
	 		metamodel.load();
	 		 		
	 		metamodelEvlModule = new EvlModule();
	 		metamodelEvlModule.parse(getClass().getResource(EpsilonData.METAMODEL_VALIDATOR).toURI());
	 		metamodelEvlModule.getContext().getModelRepository().addModel(metamodel);
	 		metamodelEvlModule.execute();
	 		Collection<UnsatisfiedConstraint> metamodelUnsatisfiedConstraints = metamodelEvlModule.getContext().getUnsatisfiedConstraints();
	 		
	 		if (metamodelUnsatisfiedConstraints.size() == 0) {	 				
				Display.getDefault().asyncExec(() -> {
		 			MessageDialog.openInformation(Display.getDefault().getActiveShell(),
		 				"Validation Success",
		 				"The metamodel is valid.");
		 		});
		 		EpsilonConsole.getInstance().getInfoStream().println("The metamodel '" + metamodelUri.toString() + "' is valid.");
		        return true; 			
	 		}
	 		else {
				ErrorReportingUtility.createMarkers(metamodelUnsatisfiedConstraints, EValidator.MARKER, null, null);
				Display.getDefault().asyncExec(() -> {
					MessageDialog.openError(Display.getDefault().getActiveShell(),
						"Validation Failed",
						"The metamodel is invalid. Please check the Console and Problems View for details.");
		        });
				return false;
	 		}
		}
		catch (Exception e) {
			Display.getDefault().asyncExec(() -> {
				MessageDialog.openError(Display.getDefault().getActiveShell(),
					"Validation Failed",
					"An error occured during the validation operation. Please check the Console and Problems View for details.");
	        });
			EpsilonConsole.getInstance().getErrorStream().println(e.getMessage());
	        return false;
		}
		finally {
			if (metamodelEvlModule != null) {
				metamodelEvlModule.getContext().getModelRepository().dispose();
			}
			CachedResourceSet.getCache().clear();
		}
	
	}
	
}
