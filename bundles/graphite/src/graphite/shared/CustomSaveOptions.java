package graphite.shared;

import org.eclipse.xtext.resource.SaveOptions;

public class CustomSaveOptions extends SaveOptions {

	public CustomSaveOptions(boolean formatting, boolean validating) {
		super(formatting, validating);
	}

}
