package graphite.shared;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;

public class FilesUtility {

	public static URI getPlatformURI(IFile eclipseFile) {
		return URI.createPlatformResourceURI(eclipseFile.getFullPath().toString(), true);
	}
	
	public static IFile getFile(URI uri) {
		return uri.isPlatformResource() && uri.segmentCount() > 2 ? ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(uri.toPlatformString(true))) : null;
    }
	
	public static Map<String, List<IFile>> getSelectedModels(IStructuredSelection selection) {
    	Map<String, List<IFile>> selectedModels = new HashMap<String, List<IFile>>();	   
		for (Iterator<?> i = selection.iterator(); i.hasNext();) {
			IFile file = (IFile) i.next();		
			if (ModelExtension.METAMODEL_EXTENSION.equals(file.getFileExtension())) {
				if (!selectedModels.containsKey(ModelExtension.METAMODEL_EXTENSION)) {
					selectedModels.put(ModelExtension.METAMODEL_EXTENSION, new ArrayList<IFile>());
				}
				selectedModels.get(ModelExtension.METAMODEL_EXTENSION).add(file);		
			}
			else if (ModelExtension.GENMODEL_EXTENSION.equals(file.getFileExtension())) {
				if (!selectedModels.containsKey(ModelExtension.GENMODEL_EXTENSION)) {
					selectedModels.put(ModelExtension.GENMODEL_EXTENSION, new ArrayList<IFile>());
				}
				selectedModels.get(ModelExtension.GENMODEL_EXTENSION).add(file);	
			}
			else if (ModelExtension.ODESIGN_EXTENSION.equals(file.getFileExtension())) {
				if (!selectedModels.containsKey(ModelExtension.ODESIGN_EXTENSION)) {
					selectedModels.put(ModelExtension.ODESIGN_EXTENSION, new ArrayList<IFile>());
				}
				selectedModels.get(ModelExtension.ODESIGN_EXTENSION).add(file);
			}
			else if (ModelExtension.GRAMMAR_EXTENSION.equals(file.getFileExtension())) {
				if (!selectedModels.containsKey(ModelExtension.GRAMMAR_EXTENSION)) {
					selectedModels.put(ModelExtension.GRAMMAR_EXTENSION, new ArrayList<IFile>());
				}
				selectedModels.get(ModelExtension.GRAMMAR_EXTENSION).add(file);	
			}
		}
    	return selectedModels;
    }
	
	public static String getProjectPath(IFile file) {
		IProject project = file.getProject();
		IPath location = project.getLocation();
		return (location != null) ? location.toString() : null;
	}
	
	public static String readNormalizedFile(java.nio.file.Path path) throws IOException {
		List<String> lines = Files.readAllLines(path);
		return String.join("\n", lines);
	}
	
}
