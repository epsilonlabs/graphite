package graphite.graphical;

import java.util.function.Consumer;
import org.eclipse.xtext.ui.editor.embedded.EmbeddedEditorModelAccess;

import graphite.shared.DerivedObjectProperties;
import graphite.textual.DerivedObjectUtility;

@SuppressWarnings("restriction")
public class RefreshConsumer implements Consumer<Object> {

	private DerivedObjectProperties derivedObjectProperties;
	private EmbeddedEditorModelAccess access;

	public RefreshConsumer(DerivedObjectProperties derivedObjectProperties, EmbeddedEditorModelAccess access) {
		this.derivedObjectProperties = derivedObjectProperties;
		this.access = access;
	}
	
	@Override
	public void accept(Object object) {
		String valueToUpdate = DerivedObjectUtility.getParsedString(derivedObjectProperties);
		access.updateModel("", (valueToUpdate == null) ? "" : valueToUpdate, "");
	}
	
}