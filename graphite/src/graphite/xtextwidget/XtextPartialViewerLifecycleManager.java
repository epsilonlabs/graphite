package graphite.xtextwidget;

import java.lang.reflect.Field;
import java.util.List;

import org.eclipse.eef.EEFCustomWidgetDescription;
import org.eclipse.eef.EEFWidgetDescription;
import org.eclipse.eef.common.ui.api.IEEFFormContainer;
import org.eclipse.eef.core.api.EditingContextAdapter;
import org.eclipse.eef.core.api.controllers.IEEFWidgetController;
import org.eclipse.eef.ide.ui.api.widgets.AbstractEEFWidgetLifecycleManager;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.parts.AbstractEditPartViewer;
import org.eclipse.sirius.common.interpreter.api.IInterpreter;
import org.eclipse.sirius.common.interpreter.api.IVariableManager;
import org.eclipse.sirius.diagram.ui.tools.internal.editor.DiagramSelectDRepresentationElementsListener;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.gmf.runtime.common.ui.util.WorkbenchPartDescriptor;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.ResourceSetReferencingResourceSet;
import org.eclipse.xtext.resource.ResourceSetReferencingResourceSetImpl;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.model.IXtextDocumentContentObserver;
import com.google.inject.Injector;

import graphite.shared.DerivedObjectProperties;
import graphite.textual.DerivedObjectUtility;
import graphite.textual.XtextDocumentContentObserver;
import graphite.textual.XtextEObject;
import graphite.textual.XtextParser;


@SuppressWarnings({"restriction", "unchecked", "rawtypes"})
public class XtextPartialViewerLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	private EEFCustomWidgetDescription description;
	private XtextPartialViewerController controller;
	private IXtextDocumentContentObserver xtextDocumentContentObserver;
	private EmbeddedEditorModelAccess access;
	private EmbeddedEditor editor;
	private XtextEObject object;
	private DerivedObjectProperties derivedObjectProperties;
	private DialectEditor dialectEditor;
	private List selection;
	private Object selectedItem;
	
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
		FileExtensionProvider fileExtensionProvider = XtextParser.register(grammarInjector);
		grammarInjector.injectMembers(this);
		EmbeddedResourceProvider resProvider = grammarInjector.getInstance(EmbeddedResourceProvider.class);
		resProvider.setFileExtensionProvider(fileExtensionProvider);
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
		try {
			Field diagramSelectionListenerField = this.controller.getClass().getDeclaredField("diagramSelectionListener");
			diagramSelectionListenerField.setAccessible(true);
			DiagramSelectDRepresentationElementsListener diagramSelectionListener = (DiagramSelectDRepresentationElementsListener)diagramSelectionListenerField.get(this.controller);
			Field dialectEditorField = diagramSelectionListener.getClass().getSuperclass().getDeclaredField("dialectEditor");
			dialectEditorField.setAccessible(true);
			this.dialectEditor = (DialectEditor) dialectEditorField.get(diagramSelectionListener);
			WorkbenchPartDescriptor workbenchPartDescriptor = new WorkbenchPartDescriptor(this.dialectEditor.getSite().getId(), this.dialectEditor.getClass(), this.dialectEditor.getSite().getPage());
			IWorkbenchPart workbenchPart = workbenchPartDescriptor.getPartPage().getActivePart();
	        if (workbenchPart instanceof IDiagramWorkbenchPart) {
	        	IDiagramWorkbenchPart part = (IDiagramWorkbenchPart) workbenchPart;
	            EditPartViewer editPartViewer = part.getDiagramEditPart().getViewer();
            	Field selectionField = AbstractEditPartViewer.class.getDeclaredField("selection");
            	selectionField.setAccessible(true);
            	this.selection = (List)selectionField.get(editPartViewer);
            	this.selectedItem = this.selection.get(0);
	        }
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	protected ResourceSet getSiriusResourceSet() {
		ResourceSetReferencingResourceSet resourceSet = new ResourceSetReferencingResourceSetImpl();
		resourceSet.getReferencedResourceSets().add((this.object).eResource().getResourceSet());
		return resourceSet;	
	}

	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();
		this.xtextDocumentContentObserver = new XtextDocumentContentObserver(controller, access);
		editor.getViewer().getXtextDocument().addXtextDocumentContentObserver(this.xtextDocumentContentObserver);
	}

	@Override
	public void refresh() {
		super.refresh();
		this.controller.refresh();
		validateDiagram();
	}

	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();
		if (this.xtextDocumentContentObserver != null && editor != null && editor.getViewer() != null && editor.getViewer().getXtextDocument() != null) {
			editor.getViewer().getXtextDocument().removeXtextDocumentContentObserver(this.xtextDocumentContentObserver);
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
	
	private void validateDiagram() { //before validating the diagram, no elements must be selected, otherwise the error markers do not provide navigation
		if (this.dialectEditor != null && this.selection != null && this.selectedItem != null) {
			this.selection.remove(this.selectedItem);
			this.dialectEditor.validateRepresentation();
			this.selection.add(this.selectedItem);
		}
	}

}