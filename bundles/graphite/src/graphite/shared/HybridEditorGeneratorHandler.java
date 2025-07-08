package graphite.shared;

import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;


public class HybridEditorGeneratorHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final ISelection selection0 = HandlerUtil.getCurrentSelection(event);
		if (selection0 instanceof IStructuredSelection) {
			Map<String, List<IFile>> selectedModels = FilesUtility.getSelectedModels((IStructuredSelection)selection0);
			HybridEditorGeneratorJob job = new HybridEditorGeneratorJob(selectedModels);
			job.setUser(true);
			job.schedule();
		}
		return null;
	}
	
}
