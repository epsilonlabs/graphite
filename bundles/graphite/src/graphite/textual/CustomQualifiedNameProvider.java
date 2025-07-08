package graphite.textual;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.SimpleAttributeResolver;
import org.eclipse.xtext.util.Strings;

import graphite.shared.ModelUtility;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;

public class CustomQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
		
	@Override
	public QualifiedName getFullyQualifiedName(EObject object) {		
		SimpleAttributeResolver<EObject, String> resolver = ModelUtility.getResolver(object);
		if (resolver != null) {				
			String name = resolver.apply(object);
			if (Strings.isEmpty(name))
				return null;
			return getConverter().toQualifiedName(name);			
		}
		else {
			return super.getOrComputeFullyQualifiedName(object);
		}
	}
}
