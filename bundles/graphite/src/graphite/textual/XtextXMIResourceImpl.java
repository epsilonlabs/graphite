package graphite.textual;

import java.util.Map;
import java.io.IOException;
import java.io.InputStream;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;

public class XtextXMIResourceImpl extends XMIResourceImpl {
	
	private Resource resource;
	
	public XtextXMIResourceImpl(Resource resource) {
		this.resource = resource;
	}
	
	@Override
	public void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		super.doLoad(inputStream, options);
	}
	
	@Override
	public EList<Adapter> eAdapters() {
		return resource.eAdapters();
	}

	@Override
	public boolean eDeliver() {
		return resource.eDeliver();
	}

	@Override
	public void eSetDeliver(boolean deliver) {
		resource.eSetDeliver(deliver);
	}

	@Override
	public void eNotify(Notification notification) {
		resource.eNotify(notification);
	}

	@Override
	public ResourceSet getResourceSet() {
		return resource.getResourceSet();
	}

	@Override
	public URI getURI() {
		return resource.getURI();
	}

	@Override
	public void setURI(URI uri) {
		resource.setURI(uri);
	}

	@Override
	public long getTimeStamp() {
		return resource.getTimeStamp();
	}

	@Override
	public void setTimeStamp(long timeStamp) {
		resource.setTimeStamp(timeStamp);
	}

	@Override
	public EList<EObject> getContents() {
		return resource.getContents();
	}

	@Override
	public TreeIterator<EObject> getAllContents() {
		return resource.getAllContents();
	}

	@Override
	public String getURIFragment(EObject eObject) {
		return resource.getURIFragment(eObject);
	}

	@Override
	public EObject getEObject(String uriFragment) {
		return resource.getEObject(uriFragment);
	}

	@Override
	public void save(Map<?, ?> options) throws IOException {
		resource.save(options);
	}

	@Override
	public void load(Map<?, ?> options) throws IOException {
		resource.load(options);
	}

	@Override
	public boolean isTrackingModification() {
		return resource.isTrackingModification();
	}

	@Override
	public void setTrackingModification(boolean isTrackingModification) {
		resource.setTrackingModification(isTrackingModification);
	}

	@Override
	public boolean isModified() {
		return resource.isModified();
	}

	@Override
	public void setModified(boolean isModified) {
		resource.setModified(isModified);
	}

	@Override
	public boolean isLoaded() {
		return resource.isLoaded();
	}

	@Override
	public void delete(Map<?, ?> options) throws IOException {
		resource.delete(options);
	}

	@Override
	public EList<Diagnostic> getErrors() {
		return resource.getErrors();
	}

	@Override
	public EList<Diagnostic> getWarnings() {
		return resource.getWarnings();
	}

}