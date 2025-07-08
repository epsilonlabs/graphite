package graphite.textual;

import org.eclipse.jface.text.DocumentEvent;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.model.IXtextDocumentContentObserver;

import graphite.xtextwidget.XtextPartialViewerController;

@SuppressWarnings("restriction")
public class XtextDocumentContentObserver implements IXtextDocumentContentObserver {

	protected XtextPartialViewerController controller;
	protected EmbeddedEditorModelAccess access;
	
	public XtextDocumentContentObserver(XtextPartialViewerController controller, EmbeddedEditorModelAccess access) {
		this.controller = controller;
		this.access = access;
	}
	
	@Override
	public void documentAboutToBeChanged(DocumentEvent event) {
	}

	@Override
	public void documentChanged(DocumentEvent event) {
		controller.updateValue(access.getEditablePart());	
	}

	@Override
	public boolean performNecessaryUpdates(Processor processor) {
		return false;
	}

	@Override
	public boolean hasPendingUpdates() {
		return false;
	}

}
