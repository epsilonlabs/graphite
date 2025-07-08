package graphite.textual;

import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;

public class CustomDefaultResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {

	public CustomDefaultResourceDescriptionStrategy() {
		super.setQualifiedNameProvider(new CustomQualifiedNameProvider());
	}
	
}