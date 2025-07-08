package graphite.textual;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.xtext.parser.DefaultEcoreElementFactory;
import java.lang.reflect.Method;

public class AstFactory extends DefaultEcoreElementFactory {

	@Override
	public EObject create(EClassifier classifier) {
		if (classifier == null)
			throw new NullPointerException("Classifier may not be null.");
		if (!(classifier instanceof EClass))
			throw new IllegalArgumentException("Cannot create instance of datatype '" + classifier.getName() + "'");
		EClass clazz = (EClass) classifier;
		if (clazz.isAbstract() || clazz.isInterface())
			throw new IllegalArgumentException("Cannot create instance of abstract class '" + clazz.getName() + "'");
		if (classifier.eIsProxy())
			throw new IllegalStateException("Unresolved proxy "+((InternalEObject)classifier).eProxyURI()+". Make sure the EPackage has been registered.");
		try {
			EFactory eFactory = clazz.getEPackage().getEFactoryInstance();
			if (eFactory instanceof XtextBaseFactory) {
				eFactory = ((XtextBaseFactory) eFactory).getBaseFactory();
			}
			Method createMethod = eFactory.getClass().getMethod("create", EClass.class);
			createMethod.setAccessible(true);
			return (EObject) createMethod.invoke(eFactory, clazz);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}