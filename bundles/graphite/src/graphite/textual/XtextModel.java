package graphite.textual;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.xtext.resource.XtextResourceSet;

public class XtextModel extends EmfModel {

    private Resource externalResource;

    public void setExternalResource(Resource resource) {
        this.externalResource = resource;
    }
    
    @Override
    protected ResourceSet createResourceSet() {
    	XtextResourceSet rs = new XtextResourceSet();
    	if (externalResource != null && externalResource.getResourceSet() != null) {
    		rs.getResources().addAll(externalResource.getResourceSet().getResources());
    	}
    	return rs;
    }
	
}