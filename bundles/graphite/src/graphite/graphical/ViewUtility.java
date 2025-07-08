package graphite.graphical;

import java.util.List;
import java.util.Set;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.sirius.business.api.query.DRepresentationElementQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.diagram.ui.tools.internal.editor.DiagramSelectDRepresentationElementsListener;
import org.eclipse.sirius.ui.business.api.dialect.DialectEditor;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.tools.internal.editor.SelectDRepresentationElementsListener;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.ui.IEditorPart;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

@SuppressWarnings("restriction")
public class ViewUtility {
	
	public static void selectAndReveal(URI uri, EReference crossReference, int indexInList, boolean select) {
		for (Session session : SessionManager.INSTANCE.getSessions()) {
			if (session.isOpen()) {
				EObject found = session.getTransactionalEditingDomain().getResourceSet().getEObject(uri, false);
				if (found != null) {
					Set<DRepresentationElement> elementsRepresentingTarget = Sets.newLinkedHashSet();
					for (Setting setting : session.getSemanticCrossReferencer().getInverseReferences(found)) {
						if (setting.getEObject() instanceof DRepresentationElement) {
							elementsRepresentingTarget.add((DRepresentationElement) setting.getEObject());
						}
					}
					for (DRepresentationElement rep : elementsRepresentingTarget) {
						DRepresentation parentRepresentation = new DRepresentationElementQuery((DRepresentationElement) rep).getParentRepresentation();
						IEditorPart opened = DialectUIManager.INSTANCE.openEditor(session, parentRepresentation, new NullProgressMonitor());
						if (opened instanceof DialectEditor) {
							DialectUIManager.INSTANCE.selectAndReveal((DialectEditor) opened, Lists.newArrayList(rep));
						}
					}
				}
			}
		}
	}
	
	public static ResourceSetListener getDiagramSelectionListener(List<ResourceSetListener> resourceSetListeners) {
		for (ResourceSetListener resourceSetListener : resourceSetListeners) {
			if (resourceSetListener instanceof DiagramSelectDRepresentationElementsListener || resourceSetListener instanceof SelectDRepresentationElementsListener) {
				return resourceSetListener;
			}
		}
		return null;
	}

}