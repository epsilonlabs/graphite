package graphite.textual;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import graphite.shared.Settings;

public class CustomXtextResourceImpl extends XMIResourceImpl {
	
	 public CustomXtextResourceImpl(){
	    super();
	 }
	 
	 public CustomXtextResourceImpl(URI uri) {
	    super(uri);
	 }
	 
	 @Override
	 public void load(Map<?, ?> options) throws IOException {
		 super.load(options);
		 if (isLoaded && !isLoading) {		 
			 for (EObject content: contents) {
				 DerivedObjectUtility.setDerivedObjects(content);
			 }
		 }
	 }
	
	 @Override
	 protected XMLSave createXMLSave() {
		 if (Settings.isStoreDerivedModelElements()) {
			 return super.createXMLSave();
		 }
		 return new CustomXMISaveImpl(createXMLHelper());
	 }
}