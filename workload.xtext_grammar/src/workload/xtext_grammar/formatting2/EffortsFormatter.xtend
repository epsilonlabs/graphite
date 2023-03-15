/*
 * generated by Xtext 2.30.0
 */
package workload.xtext_grammar.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import workload.Task
import workload.xtext_grammar.services.EffortsGrammarAccess

class EffortsFormatter extends AbstractFormatter2 {
	
	@Inject extension EffortsGrammarAccess

	def dispatch void format(Task task, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (effort : task.efforts) {
			effort.format
		}
	}
	
}
