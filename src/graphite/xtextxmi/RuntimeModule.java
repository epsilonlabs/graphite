package graphite.xtextxmi;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

public class RuntimeModule extends AbstractGenericResourceRuntimeModule {

	@Override
	protected String getLanguageName() {
		return LanguageProperties.getLanguageName();
	}

	@Override
	protected String getFileExtensions() {
		return LanguageProperties.getFileExtensions();
	}
	
}