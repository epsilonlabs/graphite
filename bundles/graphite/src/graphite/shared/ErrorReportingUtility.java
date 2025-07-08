package graphite.shared;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;

import org.eclipse.gef.ui.parts.AbstractEditPartViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.epsilon.common.dt.console.EpsilonConsole;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.ui.part.SiriusMatchingStrategy;
import org.eclipse.sirius.diagram.ui.provider.DiagramUIPlugin;
import org.eclipse.sirius.tree.DTree;
import org.eclipse.sirius.tree.ui.tools.internal.editor.DTreeEditor;
import org.eclipse.sirius.ui.business.api.dialect.marker.TraceabilityMarkerNavigationProvider;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.EditorReference;
import org.eclipse.ui.internal.WorkbenchPage;
import org.eclipse.ui.internal.registry.EditorDescriptor;


@SuppressWarnings({"restriction", "rawtypes", "unchecked"})
public class ErrorReportingUtility {

	public static void validateEditor() {		
		try {
			if (Display.getCurrent() == null || !PlatformUI.isWorkbenchRunning()) {
	            return;
	        }			
			IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			if (window != null) {
				IWorkbenchPage workbenchPage = window.getActivePage();
				if (workbenchPage != null) {
					IEditorPart activeEditor = workbenchPage.getActiveEditor();	
					if (activeEditor != null) {
						if (activeEditor instanceof DTreeEditor) {
							validateTreeEditor((DTreeEditor) activeEditor, workbenchPage);
						}
						else if (activeEditor instanceof DialectEditor) {
							if (Settings.isValidateDiagramEditor()) {
								validateDiagramEditor((DialectEditor) activeEditor);
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
	
	private static void validateDiagramEditor(DialectEditor dialectEditor) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		IEditorSite editorSite = dialectEditor.getEditorSite();
		if (editorSite != null) {
			IWorkbenchPart workbenchPart = editorSite.getPart();
			if (workbenchPart != null && workbenchPart instanceof IDiagramWorkbenchPart) {
				IDiagramGraphicalViewer diagramGraphicalViewer = ((IDiagramWorkbenchPart)workbenchPart).getDiagramGraphicalViewer();
				if (diagramGraphicalViewer != null) {
					Field selectionField = AbstractEditPartViewer.class.getDeclaredField("selection");
		        	selectionField.setAccessible(true);
		        	List selection = (List)selectionField.get(diagramGraphicalViewer);
		        	if (selection.size() > 0) {
			        	Object selectedItem = selection.get(0);
			        	if (selectedItem != null && selection != null && selection.size() > 0) {
			    			selection.remove(selectedItem);
			    			dialectEditor.validateRepresentation();
			    			selection.add(selectedItem);
			    		}
		        	}
		        	else {
		        		dialectEditor.validateRepresentation();
		        	}
				}
			}
		}
	}
	
	private static void validateTreeEditor(DTreeEditor treeEditor, IWorkbenchPage workbenchPage) throws CoreException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		if (workbenchPage instanceof WorkbenchPage) {
			setSiriusMatchingStrategy((WorkbenchPage) workbenchPage);
		}
		DTree tree = treeEditor.getTreeModel();
		if (tree != null) {
			IFile file = getFile(tree);
			if (file != null) {
				Diagnostic diagnosticValidator = ModelUtility.runEMFValidator(tree.getTarget());
				String MARKER_TYPE = DiagramUIPlugin.ID + ".diagnostic";
				file.deleteMarkers(MARKER_TYPE, true, IResource.DEPTH_ZERO);
				for (Diagnostic diagnostic : diagnosticValidator.getChildren()) {
					List<?> data = diagnostic.getData();
					Object problematicObject = (data.size() > 0) ? data.get(0) : null;
					if (problematicObject != null) {
						DRepresentationElement representationElement = getRepresentationElement(tree, problematicObject);
						if (representationElement != null) {
							IMarker marker = file.createMarker(MARKER_TYPE);
							marker.setAttribute(IDE.EDITOR_ID_ATTR, DTreeEditor.ID);
							marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
							marker.setAttribute(IMarker.MESSAGE, diagnostic.getMessage());
							marker.setAttribute(IMarker.LOCATION, EMFCoreUtil.getQualifiedName(representationElement.getTarget(), true));
							marker.setAttribute(TraceabilityMarkerNavigationProvider.REPRESENTATION_URI, EcoreUtil.getURI(tree).toString());
							marker.setAttribute(TraceabilityMarkerNavigationProvider.REPRESENTATION_ELEMENT_ID, EcoreUtil.getURI(representationElement).fragment());
						}
					}
				}
			}
		}
	}
	
	private static void setSiriusMatchingStrategy(WorkbenchPage workbenchPage) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		IEditorReference[] editorReferences = workbenchPage.getSortedEditors();
		for (IEditorReference editorReference : editorReferences) {
			if (editorReference instanceof EditorReference) {
				EditorDescriptor editorDescriptor = ((EditorReference) editorReference).getDescriptor();
				if (DTreeEditor.ID.equals(editorDescriptor.getId())) {
					Field field = EditorDescriptor.class.getDeclaredField("matchingStrategy");
					field.setAccessible(true);
					field.set(editorDescriptor, new SiriusMatchingStrategy());
				}
			}
		}
	}

	private static DRepresentationElement getRepresentationElement(DTree tree, Object problematicObject) {
		for (DRepresentationElement representationElement : tree.getRepresentationElements()) {
			if (problematicObject.equals(representationElement.getTarget())) {
				return representationElement;
			}
		}
		return null;
	}
	
	private static IFile getFile(DTree tree) {
		Session session = SessionManager.INSTANCE.getSession(tree);
		if (session != null) {
			Resource airdResource = session.getSessionResource();
			if (airdResource != null) {
				URI uri = airdResource.getURI();
				if (uri.isPlatformResource()) {
					IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
					IFile file = root.getFile(new org.eclipse.core.runtime.Path(uri.toPlatformString(true)));
					return file;
				}
			}
		}
		return null;
	}
	
	public static void createMarkers(Collection<UnsatisfiedConstraint> unsatisfiedConstraints, String markerType, IFile file, URI fileUri) throws CoreException {
		for (UnsatisfiedConstraint unsatisfiedConstraint : unsatisfiedConstraints) {
			String location = null, uriAttribute = null;
			IFile fileOfMarker = null;
			if (file == null && fileUri == null) {
				EObject eObject = (EObject) unsatisfiedConstraint.getInstance();		
				URI uri = EcoreUtil.getURI(eObject);
			    fileOfMarker = FilesUtility.getFile(uri);
				location = eObject.eResource().getURIFragment(eObject);
				uriAttribute = EcoreUtil.getURI(eObject).toString();
			}
			else if (file != null && fileUri != null) {
				fileOfMarker = file;
				location = uriAttribute = fileUri.toString();			
			}			
			IMarker marker = fileOfMarker.createMarker(markerType);			
			if (unsatisfiedConstraint.getConstraint().isCritique()) {
				EpsilonConsole.getInstance().getWarningStream().println(unsatisfiedConstraint.getMessage());
				marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
			}
			else {
				EpsilonConsole.getInstance().getErrorStream().println(unsatisfiedConstraint.getMessage());
				marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
			}
			marker.setAttribute(IMarker.MESSAGE, unsatisfiedConstraint.getMessage());
			marker.setAttribute(IMarker.LOCATION, location);
            marker.setAttribute(EValidator.URI_ATTRIBUTE, uriAttribute);			
		}
	}
	
}