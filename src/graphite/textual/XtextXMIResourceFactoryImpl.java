package graphite.textual;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class XtextXMIResourceFactoryImpl extends ResourceFactoryImpl {
	
	public XtextXMIResourceFactoryImpl() {
		super();
	}

	@Override
	public Resource createResource(URI uri) {
		return new CustomXtextResourceImpl(uri);		
	}

}