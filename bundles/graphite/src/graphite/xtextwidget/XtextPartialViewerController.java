package graphite.xtextwidget;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.AbstractEEFCustomWidgetController;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;

import graphite.graphical.RefreshConsumer;
import graphite.graphical.ViewUtility;
import graphite.shared.DerivedObjectProperties;
import graphite.textual.DerivedObjectUtility;
import graphite.textual.XtextEObject;

@SuppressWarnings({"restriction", "unchecked"})
public class XtextPartialViewerController extends AbstractEEFCustomWidgetController {

	private EmbeddedEditorModelAccess access;
	private DerivedObjectProperties derivedObjectProperties;
	private TransactionalEditingDomainImpl editingDomain;
	private ResourceSetListener diagramSelectionListener;
	
	public XtextPartialViewerController(EEFCustomWidgetDescription description, IVariableManager variableManager, IInterpreter interpreter, EditingContextAdapter contextAdapter, EmbeddedEditorModelAccess access) {
		super(description, variableManager, interpreter, contextAdapter);
		this.access = access;
		XtextEObject object = (XtextEObject) variableManager.getVariables().get("self");	
		EStructuralFeature eStructuralFeature = (EStructuralFeature) variableManager.getVariables().values().toArray()[0];
		this.derivedObjectProperties = DerivedObjectUtility.getDerivedObjectProperties(object, eStructuralFeature);
		this.editingDomain = (TransactionalEditingDomainImpl) this.editingContextAdapter.getEditingDomain();
		try {
			Field postcommitListenersField = this.editingDomain.getClass().getDeclaredField("postcommitListeners");
			postcommitListenersField.setAccessible(true);
			List<ResourceSetListener> resourceSetListeners = (List<ResourceSetListener>)postcommitListenersField.get(this.editingDomain);
			this.diagramSelectionListener = ViewUtility.getDiagramSelectionListener(resourceSetListeners);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
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
		this.editingDomain.removeResourceSetListener(this.diagramSelectionListener);
		IStatus status = this.editingContextAdapter.performModelChange(() -> {
			if (!Objects.equals(text, this.derivedObjectProperties.getLastParsedString())) {
				DerivedObjectUtility.setParsedString(this.derivedObjectProperties, text);
			}
		}
		);
		this.editingDomain.addResourceSetListener(diagramSelectionListener);
		return status;
	}
	
	public EditingContextAdapter getEditingContextAdapter() {
		return editingContextAdapter;
	}
	
	public DerivedObjectProperties getDerivedObjectProperties() {
		return derivedObjectProperties;
	}

	public void setDerivedObjectProperties(DerivedObjectProperties derivedObjectProperties) {
		this.derivedObjectProperties = derivedObjectProperties;
	}
	
}