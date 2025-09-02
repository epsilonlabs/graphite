package graphite.xtextwidget;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;

@SuppressWarnings("restriction")
public class EmbeddedResourceProvider implements IEditedResourceProvider {

	private String fileExtension;
	private ResourceSet siriusResourceSet;
	
	public void setFileExtension(String fileExtension) {
		this.fileExtension = fileExtension;
	}
	
	public ResourceSet getSiriusResourceSet() {
		return siriusResourceSet;
	}

	public void setSiriusResourceSet(ResourceSet resourceSet) {
		this.siriusResourceSet = resourceSet;
	}
	
	@Override
	public XtextResource createResource() {
		URI uri = URI.createURI("_synthetic." + fileExtension);
		XtextResource xtextVirtualResource = (XtextResource) siriusResourceSet.createResource(uri);
		siriusResourceSet.getResources().add(xtextVirtualResource);
		return xtextVirtualResource;
	}
}