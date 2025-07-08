package graphite.xtextwidget;

import java.lang.reflect.Field;
import java.util.Map;

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
import org.eclipse.swt.custom.ST;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.TypedListener;
import org.eclipse.ui.texteditor.ITextEditorActionConstants;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.ResourceSetReferencingResourceSet;
import org.eclipse.xtext.resource.ResourceSetReferencingResourceSetImpl;
import org.eclipse.xtext.ui.editor.embedded.ActivationCodeTrigger;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditor;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorFactory;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;
import org.eclipse.xtext.ui.editor.model.IXtextDocumentContentObserver;
import com.google.inject.Injector;

import graphite.shared.DerivedObjectProperties;
import graphite.shared.WorkbenchData;
import graphite.textual.DerivedObjectUtility;
import graphite.textual.RenameRefactoringAction;
import graphite.textual.XtextDocumentContentObserver;
import graphite.textual.XtextEObject;
import graphite.textual.XtextUtility;
import org.eclipse.jface.action.IAction;

@SuppressWarnings({ "restriction", "unchecked" })
public class XtextPartialViewerLifecycleManager extends AbstractEEFWidgetLifecycleManager {

	private EEFCustomWidgetDescription description;
	private XtextPartialViewerController controller;
	private IXtextDocumentContentObserver xtextDocumentContentObserver;
	private EmbeddedEditorModelAccess access;
	private EmbeddedEditor editor;
	private XtextEObject object;
	private DerivedObjectProperties derivedObjectProperties;
	private EditingContextAdapter editingContextAdapter;

	public XtextPartialViewerLifecycleManager(EEFCustomWidgetDescription controlDescription, IVariableManager variableManager, IInterpreter interpreter, EditingContextAdapter contextAdapter) {
		super(variableManager, interpreter, contextAdapter);
		this.description = controlDescription;
		this.object = (XtextEObject) variableManager.getVariables().get("self");
		EStructuralFeature eStructuralFeature = (EStructuralFeature) variableManager.getVariables().values().toArray()[0];
		this.derivedObjectProperties = DerivedObjectUtility.getDerivedObjectProperties(this.object, eStructuralFeature);
	}

	@Override
	protected void createMainControl(Composite parent, IEEFFormContainer formContainer) {
		try {
			Injector grammarInjector = DerivedObjectUtility.getGrammarInjector(derivedObjectProperties);
			FileExtensionProvider fileExtensionProvider = XtextUtility.register(grammarInjector);
			grammarInjector.injectMembers(this);
			EmbeddedResourceProvider resProvider = grammarInjector.getInstance(EmbeddedResourceProvider.class);
			resProvider.setFileExtensionProvider(fileExtensionProvider);
			resProvider.setSiriusResourceSet(getSiriusResourceSet());
			EmbeddedEditorFactory factory = grammarInjector.getInstance(EmbeddedEditorFactory.class);
			editingContextAdapter = super.editingContextAdapter;
			this.editor = factory.newEditor(resProvider).showErrorAndWarningAnnotations().withParent(parent);
			this.access = editor.createPartialEditor();	
			Control control = editor.getViewer().getControl();	
			Composite borderComposite = new Composite((Composite) control.getParent(), SWT.BORDER);
			control.setParent(borderComposite);	
			GridData gridData = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
			gridData.heightHint = 150;
			gridData.widthHint = 300;
			gridData.verticalIndent = 8;
			gridData.horizontalIndent = VALIDATION_MARKER_OFFSET;		
			borderComposite.setLayoutData(gridData);
			GridData controlGridData = new GridData(SWT.FILL, SWT.FILL, true, true);
			control.setLayoutData(controlGridData);
			borderComposite.setLayout(new GridLayout(1, false));
			borderComposite.getParent().layout(true, true);				
			this.controller = new XtextPartialViewerController(description, variableManager, interpreter,editingContextAdapter, access);
			addRenameRefactoring(controller, editor, access, grammarInjector);
		}
		catch(Exception e) {
			System.err.println("An unexpected error occured when instantiating the Xtext embedded editor(s). Make sure to use a Java version compatible with your Eclipse/Xtext version, and ensure GMF/GEF are installed in your Eclipse IDE.");
			System.err.println(e);
		}
	}

	private void addRenameRefactoring(XtextPartialViewerController controller, EmbeddedEditor editor, EmbeddedEditorModelAccess access, Injector grammarInjector) {
		try {
			if (editor.getViewer() != null) {
				StyledText styledText = editor.getViewer().getTextWidget();
				if (styledText != null) {
					for (Listener listener : styledText.getListeners(ST.VerifyKey)) {
						if (listener instanceof TypedListener) {	
							Field field = TypedListener.class.getDeclaredField("eventListener");
							field.setAccessible(true);
							Object eventListener = field.get(listener);
							if (eventListener instanceof ActivationCodeTrigger) {
								Field actionsField = ActivationCodeTrigger.class.getDeclaredField("actions");
								actionsField.setAccessible(true);
								Map<String, IAction> actionsMap = (Map<String, IAction>) actionsField.get(eventListener);
								actionsMap.put(ITextEditorActionConstants.REDO, new RenameRefactoringAction("Rename Element", controller, editor, access, grammarInjector));
								actionsMap.get(ITextEditorActionConstants.REDO).setActionDefinitionId(WorkbenchData.RENAME_COMMAND);
								break;	
							}
						}
					}
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
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
	}

	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();
		if (this.xtextDocumentContentObserver != null && editor != null && editor.getViewer() != null
				&& editor.getViewer().getXtextDocument() != null) {
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

}