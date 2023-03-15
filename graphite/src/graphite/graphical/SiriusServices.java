package graphite.graphical;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import graphite.textual.DerivedObjectUtility;

public abstract class SiriusServices {

	public boolean isParsedString(EObject object, EStructuralFeature eStructuralFeature) {
    	return DerivedObjectUtility.isParsedString(object, eStructuralFeature);
    }
	
}