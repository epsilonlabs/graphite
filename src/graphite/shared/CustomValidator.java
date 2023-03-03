package graphite.shared;

import java.util.Map;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.xtext.diagnostics.AbstractDiagnostic;

import graphite.textual.XtextEObject;

public class CustomValidator extends EObjectValidator {
	
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {	  
		if (eObject instanceof XtextEObject) {
			boolean isValid = true;
			XtextEObject xtextEObject = (XtextEObject) eObject;
			for (DerivedObjectProperties derivedObjectProperties: xtextEObject.getDerivedObjectsProperties().values()) {
				if (derivedObjectProperties.isInvalid()) {
					isValid = false;			
					try {
						String objectIdentifier = (String) derivedObjectProperties.getIdentifierGetterMethod().invoke(eObject);
						AbstractDiagnostic xtextDiagnostic = (AbstractDiagnostic) derivedObjectProperties.getParseErrors().get(0);
						String erroMessage = "Property '" + derivedObjectProperties.getParsedStringName() + "' of " + objectIdentifier + " could not be parsed: " + xtextDiagnostic.getMessage();
						BasicDiagnostic basicDiagnostic = new BasicDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE,  0, erroMessage, new Object[] {eObject, xtextDiagnostic.getLocation()});
						diagnostics.add(basicDiagnostic);
					}
					catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
			return isValid;
		}
		return super.validate(eClass, eObject, diagnostics, context);
	}
	
}