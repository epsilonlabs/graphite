package graphite.textual;

import org.eclipse.jface.action.Action;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;

import com.google.inject.Injector;

import graphite.xtextwidget.XtextPartialViewerController;

@SuppressWarnings("restriction")
public class RenameRefactoringAction extends Action {

	private XtextPartialViewerController controller;
	private EmbeddedEditor editor;
	private EmbeddedEditorModelAccess access;
	private Injector grammarInjector;
	
	public RenameRefactoringAction(String text, XtextPartialViewerController controller, EmbeddedEditor editor, EmbeddedEditorModelAccess access, Injector grammarInjector) {
		setText(text);
		this.controller = controller;
		this.editor = editor;
		this.access = access;
		this.grammarInjector = grammarInjector;
	}
	
	 @Override
     public void run() {
         try {
			CustomDefaultRenameElementHandler renameHandler = grammarInjector.getInstance(CustomDefaultRenameElementHandler.class);
			renameHandler.setEditor(editor);
			renameHandler.setController(controller);
			renameHandler.setAccess(access);
			renameHandler.execute(null);
         }
         catch (Exception e) {
             e.printStackTrace();
         }
     }
	
}
