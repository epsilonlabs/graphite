package graphite.shared;

import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
					URI uri = EcoreUtil.getURI(eObject);
					List<?> parseErrors = derivedObjectProperties.getParseErrors();
					if (parseErrors != null && parseErrors.size() > 0) {
						AbstractDiagnostic xtextDiagnostic = (AbstractDiagnostic) parseErrors.get(0);
						String erroMessage = "Property '" + derivedObjectProperties.getParsedStringName() + "' of " + uri.toString() + " could not be parsed: " + xtextDiagnostic.getMessage();
						BasicDiagnostic basicDiagnostic = new BasicDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE,  0, erroMessage, new Object[] {eObject, xtextDiagnostic.getLocation()});
						diagnostics.add(basicDiagnostic);
					}
				}
			}
			return isValid;
		}
		return true;
	}
	
}