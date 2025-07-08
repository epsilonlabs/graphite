package graphite.xtextwidget;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.embedded.IEditedResourceProvider;

@SuppressWarnings("restriction")
public class EmbeddedResourceProvider implements IEditedResourceProvider {

	private FileExtensionProvider fileExtensionProvider;
	private ResourceSet siriusResourceSet;
	
	public void setFileExtensionProvider(FileExtensionProvider fileExtensionProvider) {
		this.fileExtensionProvider = fileExtensionProvider;
	}
	
	public ResourceSet getSiriusResourceSet() {
		return siriusResourceSet;
	}

	public void setSiriusResourceSet(ResourceSet resourceSet) {
		this.siriusResourceSet = resourceSet;
	}
	
	@Override
	public XtextResource createResource() {
		URI uri = URI.createURI("_synthetic." + fileExtensionProvider.getPrimaryFileExtension());
		XtextResource xtextVirtualResource = (XtextResource) siriusResourceSet.createResource(uri);
		siriusResourceSet.getResources().add(xtextVirtualResource);
		return xtextVirtualResource;
	}
}