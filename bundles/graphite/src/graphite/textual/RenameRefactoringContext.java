package graphite.textual;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;

public class RenameRefactoringContext {
	
	private EObject targetElement;
	private Resource resource;
	private XtextResource xtextResource;
		
	public EObject getTargetElement() {
		return targetElement;
	}
	public void setTargetElement(EObject targetElement) {
		this.targetElement = targetElement;
	}
	public Resource getResource() {
		return resource;
	}
	public void setResource(Resource resource) {
		this.resource = resource;
	}
	
	public XtextResource getXtextResource() {
		return xtextResource;
	}
	public void setXtextResource(XtextResource xtextResource) {
		this.xtextResource = xtextResource;
	}
	
}
