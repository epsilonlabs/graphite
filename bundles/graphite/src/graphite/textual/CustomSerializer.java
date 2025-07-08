package graphite.textual;

import static com.google.common.base.Preconditions.checkNotNull;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parsetree.reconstr.impl.TokenStringBuffer;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.serializer.impl.Serializer;

@SuppressWarnings("restriction")
public class CustomSerializer extends Serializer {

	@Override
	public String serialize(EObject obj, SaveOptions options) {
		checkNotNull(obj, "obj must not be null.");
		checkNotNull(options, "options must not be null.");
		try {	
			TokenStringBuffer tokenStringBuffer = new TokenStringBuffer();
			serialize(obj, tokenStringBuffer, options);
			String formattedString = Arrays.stream(tokenStringBuffer.toString().split("\\R")).map(line -> line.replaceAll("\\s+", " ").trim()).collect(Collectors.joining("\n"));
			return formattedString;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}