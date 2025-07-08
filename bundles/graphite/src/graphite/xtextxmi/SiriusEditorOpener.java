package graphite.xtextxmi;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;

import graphite.graphical.ViewUtility;

public class SiriusEditorOpener extends LanguageSpecificURIEditorOpener {

	@Override
	public IEditorPart open(final URI uri, final EReference crossReference, final int indexInList, final boolean select) {
		ViewUtility.selectAndReveal(uri, crossReference, indexInList, select);
		return null;
	}
	
}