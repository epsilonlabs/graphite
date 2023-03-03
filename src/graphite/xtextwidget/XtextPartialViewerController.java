package graphite.xtextwidget;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFCustomWidgetController;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;

import graphite.graphical.RefreshConsumer;
import graphite.shared.DerivedObjectProperties;
import graphite.textual.DerivedObjectUtility;
import graphite.textual.XtextEObject;

@SuppressWarnings("restriction")
public class XtextPartialViewerController extends AbstractEEFCustomWidgetController {

	private EmbeddedEditorModelAccess access;
	private DerivedObjectProperties derivedObjectProperties;
	
	public XtextPartialViewerController(EEFCustomWidgetDescription description, IVariableManager variableManager, IInterpreter interpreter, EditingContextAdapter contextAdapter, EmbeddedEditorModelAccess access) {
		super(description, variableManager, interpreter, contextAdapter);
		this.access = access;
		XtextEObject object = (XtextEObject) variableManager.getVariables().get("self");	
		EStructuralFeature eStructuralFeature = (EStructuralFeature) variableManager.getVariables().values().toArray()[0];
		this.derivedObjectProperties = DerivedObjectUtility.getDerivedObjectProperties(object, eStructuralFeature);
	}

	@Override
	protected EEFCustomWidgetDescription getDescription() {
		return this.description;
	}

	@Override
	public void refresh() {
		super.refresh();
		this.newEval().call("var:self", new RefreshConsumer(this.derivedObjectProperties, this.access));
	}
	
	public IStatus updateValue(final String text) {
		return this.editingContextAdapter.performModelChange(() -> DerivedObjectUtility.setParsedString(this.derivedObjectProperties, text));
	}
}