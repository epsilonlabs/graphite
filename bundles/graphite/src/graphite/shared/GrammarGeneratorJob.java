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
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.dt.ExtensionPointToolNativeTypeDelegate;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;


public class GrammarGeneratorJob extends Job {

	private Map<String, List<IFile>> selectedModels;
	
	public GrammarGeneratorJob(Map<String, List<IFile>> selectedModels)  {
		super("Generate grammar(s)");
		this.selectedModels = selectedModels;
	}
	
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		try {
			boolean isValid = generateGrammars();
			return isValid ? Status.OK_STATUS : Status.CANCEL_STATUS;
		}
		catch (Exception e) {
			e.printStackTrace();
			return Status.CANCEL_STATUS;
		}
	}
	
	public boolean generateGrammars() throws Exception {
		
		EvlModule metamodelEvlModule = null;
		EolModule grammarGenerationEolModule = null;
		
		EpsilonConsole.getInstance().clear();

		try {
			
			if (selectedModels.get(ModelExtension.METAMODEL_EXTENSION).size() > 1) {
				Display.getDefault().asyncExec(() -> {
					MessageDialog.openError(Display.getDefault().getActiveShell(),
		 				"Generation Failed",
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
	 			
	 			String metamodelAbsolutePath = metamodelFile.getLocation().toString();	
	 			int modelIndex = metamodelAbsolutePath.indexOf("/model/");
	 			String metamodelParentAbsolutePath = modelIndex != -1 ? metamodelAbsolutePath.substring(0, modelIndex) : metamodelAbsolutePath;
	 			String generatedGrammarsDirectory = metamodelParentAbsolutePath + "/generated_grammars";
	 			
	 			grammarGenerationEolModule = new EolModule();
	 			grammarGenerationEolModule.parse(getClass().getResource(EpsilonData.GRAMMAR_GENERATOR).toURI());
	 			grammarGenerationEolModule.getContext().getNativeTypeDelegates().add(new ExtensionPointToolNativeTypeDelegate());
	 			grammarGenerationEolModule.getContext().setOutputStream(EpsilonConsole.getInstance().getInfoStream());
	 			grammarGenerationEolModule.getContext().getFrameStack().put(Variable.createReadOnlyVariable("generatedGrammarsDirectory", generatedGrammarsDirectory));
	 			grammarGenerationEolModule.getContext().getFrameStack().put(Variable.createReadOnlyVariable("metamodelUri", metamodelUri.toString()));
	 			grammarGenerationEolModule.getContext().getModelRepository().addModel(metamodel);
	 			grammarGenerationEolModule.execute();				
				Display.getDefault().asyncExec(() -> {
		 			MessageDialog.openInformation(Display.getDefault().getActiveShell(),
		 				"Generation Success",
		 				"The grammar(s) generation operation has been executed successfully.");
		 		});
		        return true;
	 		}
	 		else {
				ErrorReportingUtility.createMarkers(metamodelUnsatisfiedConstraints, EValidator.MARKER, null, null);
				Display.getDefault().asyncExec(() -> {
					MessageDialog.openError(Display.getDefault().getActiveShell(),
						"Generation Failed",
						"The metamodel is invalid. Please check the Console and Problems View for details.");
		        });
				return false;
	 		}		
		}
		catch (Exception e) {
			Display.getDefault().asyncExec(() -> {
				MessageDialog.openError(Display.getDefault().getActiveShell(),
					"Generation Failed",
					"An error occured during the generation operation. Please check the Console and Problems View for details.");
	        });
			EpsilonConsole.getInstance().getErrorStream().println(e.getMessage());
	        return false;
		}
		finally {
			if (metamodelEvlModule != null) {
				metamodelEvlModule.getContext().getModelRepository().dispose();
			}
			if (grammarGenerationEolModule != null) {
				grammarGenerationEolModule.getContext().getModelRepository().dispose();
			}
			CachedResourceSet.getCache().clear();
		}
	
	}
	
}
