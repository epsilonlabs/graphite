package graphite.xtextxmi;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

public class RuntimeModule extends AbstractGenericResourceRuntimeModule {

	@Override
	protected String getLanguageName() {
		return Activator.PLUGIN_ID;
	}

	@Override
	protected String getFileExtensions() {
		return String.valueOf(new char[0]);
	}
	
}