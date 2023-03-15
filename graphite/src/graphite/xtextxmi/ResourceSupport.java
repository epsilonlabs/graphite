package graphite.xtextxmi;

import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

public class ResourceSupport extends AbstractGenericResourceSupport implements ISetup {

	@Override
	protected Module createGuiceModule() {
		return new RuntimeModule();
	}

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		Injector injector = Guice.createInjector(getGuiceModule());
		injector.injectMembers(this);
		registerInRegistry(false);
		return injector;
	}

}