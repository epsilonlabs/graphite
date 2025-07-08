package graphite.textual;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.impl.XMISaveImpl;

import graphite.shared.DerivedObjectProperties;

public class CustomXMISaveImpl extends XMISaveImpl {

	public CustomXMISaveImpl(XMLHelper helper) {
		super(helper);
	}
	
	public CustomXMISaveImpl(Map<?, ?> options, XMLHelper helper, String encoding, String xmlVersion) {
		super(options, helper, encoding, xmlVersion);
	}
	
	public CustomXMISaveImpl(Map<?, ?> options, XMLHelper helper, String encoding) {
		super(options, helper, encoding);
	}
	
	@Override
	protected boolean shouldSaveFeature(EObject o, EStructuralFeature f) {
		if (o instanceof XtextEObject) {
			XtextEObject object = (XtextEObject) o;
			if (object.getDerivedObjectsProperties().containsKey(f.getName())) {
				DerivedObjectProperties derivedObjectProperties = object.getDerivedObjectsProperties().get(f.getName());
				DerivedObjectUtility.setDeriveObject(derivedObjectProperties);
				return derivedObjectProperties.isInvalid();
			}
			else {
				return super.shouldSaveFeature(o, f);
			}
		}
		else {
			return super.shouldSaveFeature(o, f);
		}
	}

}