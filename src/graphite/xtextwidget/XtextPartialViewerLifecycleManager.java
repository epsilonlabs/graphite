package graphite.xtextwidget;

import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.xtext.resource.ResourceSetReferencingResourceSet;
import org.eclipse.xtext.resource.ResourceSetReferencingResourceSetImpl;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import com.google.inject.Injector;

import graphite.shared.DerivedObjectProperties;
import graphite.textual.DerivedObjectUtility;
import graphite.textual.XtextEObject;
import graphite.textual.XtextParser;

@SuppressWarnings("restriction")
public class XtextPartialViewerLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	private EEFCustomWidgetDescription description;
	private XtextPartialViewerController controller;
	private ModifyListener modifyListener;
	private EmbeddedEditorModelAccess access;
	private EmbeddedEditor editor;
	private XtextEObject object;
	private DerivedObjectProperties derivedObjectProperties;
	
	public XtextPartialViewerLifecycleManager(EEFCustomWidgetDescription controlDescription, IVariableManager variableManager, IInterpreter interpreter, EditingContextAdapter contextAdapter) {
		super(variableManager, interpreter, contextAdapter);
		this.description = controlDescription;
		this.object = (XtextEObject) variableManager.getVariables().get("self");	
		EStructuralFeature eStructuralFeature = (EStructuralFeature) variableManager.getVariables().values().toArray()[0];
		this.derivedObjectProperties = DerivedObjectUtility.getDerivedObjectProperties(this.object, eStructuralFeature);
	}

	@Override
	protected void createMainControl(Composite parent, IEEFFormContainer formContainer) {
		Injector grammarInjector = DerivedObjectUtility.getGrammarInjector(derivedObjectProperties);
		XtextParser.register(grammarInjector);
		grammarInjector.injectMembers(this);
		EmbeddedResourceProvider resProvider = grammarInjector.getInstance(EmbeddedResourceProvider.class);
		resProvider.setSiriusResourceSet(getSiriusResourceSet());
		EmbeddedEditorFactory factory = grammarInjector.getInstance(EmbeddedEditorFactory.class);
		this.editor = factory.newEditor(resProvider).showErrorAndWarningAnnotations().withParent(parent);
		this.access = editor.createPartialEditor();	
		Control control = editor.getViewer().getControl();
		GridData gridData = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
		gridData.heightHint = 250;
		gridData.widthHint = 300;
		gridData.verticalIndent = 8;
		gridData.horizontalIndent = VALIDATION_MARKER_OFFSET;
		control.setLayoutData(gridData);
		this.controller = new XtextPartialViewerController(description, variableManager, interpreter, editingContextAdapter, access);
	}
	
	protected ResourceSet getSiriusResourceSet() {
		ResourceSetReferencingResourceSet resourceSet = new ResourceSetReferencingResourceSetImpl();
		resourceSet.getReferencedResourceSets().add((this.object).eResource().getResourceSet());
		return resourceSet;	
	}

	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();
		this.modifyListener = new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent event) {
				controller.updateValue(access.getEditablePart());
			}
		};
		editor.getViewer().getTextWidget().addModifyListener(this.modifyListener);
	}

	@Override
	public void refresh() {
		super.refresh();
		this.controller.refresh();
	}

	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();
		if (this.modifyListener != null && editor != null && editor.getViewer() != null && editor.getViewer().getTextWidget() != null) {
			editor.getViewer().getTextWidget().removeModifyListener(this.modifyListener);
		}
	}

	@Override
	protected IEEFWidgetController getController() {
		return this.controller;
	}

	@Override
	protected EEFWidgetDescription getWidgetDescription() {
		return this.description;
	}

	@Override
	protected Control getValidationControl() {
		return editor.getViewer().getControl();
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	protected void setEnabled(boolean enabled) {
		this.editor.getViewer().setEditable(enabled);
	}
	
}