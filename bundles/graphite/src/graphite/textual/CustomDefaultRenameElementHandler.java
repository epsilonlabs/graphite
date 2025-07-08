package graphite.textual;

import java.util.Iterator;
import java.util.Objects;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.SelectableBasedScope;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.refactoring.impl.RefactoringException;
import org.eclipse.xtext.ui.refactoring.ui.DefaultRenameElementHandler;
import org.eclipse.xtext.ui.refactoring.ui.IRenameElementContext;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

import com.google.inject.Inject;

import graphite.shared.ModelUtility;
import graphite.xtextwidget.XtextPartialViewerController;


@SuppressWarnings({ "restriction", "unused" })
public class CustomDefaultRenameElementHandler extends DefaultRenameElementHandler {
	
	@Inject
	private EObjectAtOffsetHelper eObjectAtOffsetHelper;
	
	@Inject
	private IGlobalScopeProvider globalScopeProvider;
	
	private EmbeddedEditor editor;
	private XtextPartialViewerController controller;
	private EmbeddedEditorModelAccess access;
	

	public void setEditor(EmbeddedEditor editor) {
		this.editor = editor;
	}

	public void setController(XtextPartialViewerController controller) {
		this.controller = controller;
	}

	public void setAccess(EmbeddedEditorModelAccess access) {
		this.access = access;
	}
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {    			
    	ITextSelection textSelection = (ITextSelection)editor.getViewer().getSelection();
        Shell activeShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();        
        RenameRefactoringContext renameRefactoringContext = new RenameRefactoringContext();
        IRenameElementContext renameElementContext = editor.getDocument().modify(
			new IUnitOfWork<IRenameElementContext, XtextResource>() {
				@Override
				public IRenameElementContext exec(XtextResource resource) throws Exception {
					EObject targetElement = eObjectAtOffsetHelper.resolveElementAt(resource, textSelection.getOffset());
					renameRefactoringContext.setTargetElement(targetElement);
					renameRefactoringContext.setResource(targetElement.eResource());
					renameRefactoringContext.setXtextResource(resource);
					return null;
				}
			}
		);
        if (renameRefactoringContext.getResource() == null || renameRefactoringContext.getResource() == renameRefactoringContext.getXtextResource()) {
        	MessageDialog.openError(activeShell, 
        		"Reference resolution failed", 
				"There is no model element in the model with the selected identifier. Select again an identifier that can be resolved to a model element.");
        }
        else {
        	EAttribute attribute = ModelUtility.getIdentifierAttribute(renameRefactoringContext.getTargetElement());
        	Object attributeValue = renameRefactoringContext.getTargetElement().eGet(attribute);        	
        	InputDialog dialog = new InputDialog(activeShell, "Enter new value", "You are about to refactor the '" + attributeValue.toString() + "' model element of type '" + renameRefactoringContext.getTargetElement().eClass().getName() + "'. Enter a new identifier for refactoring.", "", null);
    		if (dialog.open() == Window.OK) {
    			String newIdentifier = dialog.getValue();
    			boolean isValidNewIdentifier = true;
    			INode node = eObjectAtOffsetHelper.getCrossReferenceNode(renameRefactoringContext.getXtextResource(), new TextRegion(textSelection.getOffset(), 0));
				EObject referenceOwner = NodeModelUtils.findActualSemanticObjectFor(node);
				if (referenceOwner != null) {
					EReference crossReference = GrammarUtil.getReference((CrossReference) node.getGrammarElement(), referenceOwner.eClass());
					IScope scope = globalScopeProvider.getScope(renameRefactoringContext.getXtextResource(), crossReference, null);
					if (scope != null && scope instanceof SelectableBasedScope) {
						for (IEObjectDescription objectDescription : ((SelectableBasedScope)scope).getAllElements()) {
						    if (Objects.equals(newIdentifier, objectDescription.getName().toString())) {
						    	MessageDialog.openError(activeShell, 
						        		"Duplicate identifier found", 
										"In the scope of this reference, there is another model element in the model having the same identifier. Enter a unique identifier for refactoring.");
						    	isValidNewIdentifier = false;
						    	break;
						    }
						}
					}
				}
    			if (isValidNewIdentifier) {
	    			controller.getEditingContextAdapter().performModelChange(() -> renameRefactoringContext.getTargetElement().eSet(attribute, newIdentifier));		
					editor.getViewer().setSelectedRange(0, 0);
    			}
    		}
        }
		return null;
	}
	
}
