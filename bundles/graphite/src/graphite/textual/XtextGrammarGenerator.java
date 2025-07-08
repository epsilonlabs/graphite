package graphite.textual;

import org.eclipse.xtext.xtext.wizard.EPackageInfo;
import org.eclipse.xtext.xtext.wizard.Ecore2XtextConfiguration;
import org.eclipse.xtext.xtext.wizard.LanguageDescriptor;
import org.eclipse.xtext.xtext.wizard.LanguageDescriptor.FileExtensions;

import org.eclipse.xtext.xtext.wizard.WizardConfiguration;

import java.io.File;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.xtext.ui.wizard.project.XtextProjectInfo;
import org.eclipse.epsilon.eol.types.EolSequence;


@SuppressWarnings({"restriction", "rawtypes"})
public class XtextGrammarGenerator {
	
	public static boolean generateGrammar(String languageName, EPackage packageImpl, Map<EClass, EolSequence> grammarData, String generatedGrammarsDirectory, String metamodelUri) {
		
		try {
			EPackageInfo ePackageInfo = new EPackageInfo(packageImpl, URI.createPlatformResourceURI("", false), URI.createPlatformResourceURI("", false), "", "");
			XtextProjectInfo xtextProjectInfo = new XtextProjectInfo();
	        FileExtensions fileExtensions = new FileExtensions(Arrays.asList(""));
	        LanguageDescriptor language = new LanguageDescriptor();
	        language.setName(languageName);
	        language.setFileExtensions(fileExtensions);
	        Field languageField = WizardConfiguration.class.getDeclaredField("language");
	        languageField.setAccessible(true);
	        languageField.set(xtextProjectInfo, language);
	           
	        Set<EClass> classList = grammarData.keySet();
			EClass[] classArray = classList.toArray(new EClass[classList.size()]);
			Map<EClass, List<EClass>> classesByParent = ClassHierarchy.ClusterByRootParents(classArray);
			EClass rootElementClass = classesByParent.keySet().stream().findFirst().orElse(null);
			List<EClass> childElementClasses = classesByParent.values().stream().findFirst().orElse(null);
			int numberOfAlternativeRules = (childElementClasses.size() == 1) ? grammarData.get(childElementClasses.get(0)).size() - 1 : childElementClasses.size();
			
	        Ecore2XtextConfiguration rootElementConfiguration = xtextProjectInfo.getEcore2Xtext();
	        rootElementConfiguration.getEPackageInfos().add(ePackageInfo);
	        rootElementConfiguration.setDefaultEPackageInfo(ePackageInfo);
	        rootElementConfiguration.setRootElementClass(rootElementClass);
    
	        CustomEcore2XtextGrammarCreator ecore2XtextGrammarCreator = new CustomEcore2XtextGrammarCreator();
	        CharSequence grammarContent = ecore2XtextGrammarCreator.grammar(xtextProjectInfo, grammarData, numberOfAlternativeRules, metamodelUri, packageImpl);
	        
			File directory = new File(generatedGrammarsDirectory);
			directory.mkdirs();
	        File file = new File(directory, "generated_" + languageName + ".xtext");
			try (PrintWriter out = new PrintWriter(file)) {
			    out.println(grammarContent);
			}
			return true;		
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	
	}
	
}