package graphite.textual;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.epsilon.eol.types.EolSequence;
import org.eclipse.epsilon.eol.types.EolTuple;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xtext.wizard.EPackageInfo;
import org.eclipse.xtext.xtext.wizard.Ecore2XtextConfiguration;
import org.eclipse.xtext.xtext.wizard.ecore2xtext.Ecore2XtextExtensions;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

@SuppressWarnings({"rawtypes", "restriction"})
public class CustomEcore2XtextExtensions extends Ecore2XtextExtensions {

	public static Iterable<EClassifier> allConcreteRuleClassifiers(Ecore2XtextConfiguration it, Map<EClass, EolSequence> grammarData) {
		if (it.getRootElementClass() == null) {
			return Iterables.filter(
					IterableExtensions.toSet(Iterables.concat(Iterables.transform(it.getEPackageInfos(),
							(EPackageInfo p) -> allReferencedClassifiers(p.getEPackage(), false)))),
					(EClassifier c) -> needsConcreteRule(c));
		} 
		else {
			ArrayList<EClassifier> c = Lists.newArrayList(EClassifier.class.cast(it.getRootElementClass()));
			allAssignedClassifiers(it.getRootElementClass(), c, grammarData);
			return IterableExtensions.toSet(Iterables.filter(c, (EClassifier cl) -> needsConcreteRule(cl)));
		}
	}
	
	private static void allAssignedClassifiers(EClass eClazz, Collection<EClassifier> acceptor, Map<EClass, EolSequence> grammarData) {
		List<EClassifier> classifiers = IterableExtensions.toList(Iterables.transform(
				Iterables.filter(filterDerivedStructuralFeatures(eClazz.getEAllStructuralFeatures(), eClazz, grammarData), (EStructuralFeature f) -> needsAssignment(f)),
				(EStructuralFeature it) -> it.getEType()));
		Iterables.addAll(classifiers, subClasses(eClazz));
		classifiers.removeAll(acceptor);
		if (classifiers.isEmpty()) {
			return;
		} 
		else {
			Iterables.addAll(acceptor, classifiers);
			Iterables.filter(classifiers, EClass.class).forEach((EClass c) -> allAssignedClassifiers(c, acceptor, grammarData));
		}
	}
		
	public static Collection<EClass> allDispatcherRuleClasses(Ecore2XtextConfiguration it, Map<EClass, EolSequence> grammarData) {
		if (it.getRootElementClass() == null) {
			return IterableExtensions.toSet(Iterables.filter(Iterables.filter(
					IterableExtensions.toSet(Iterables.concat(Iterables.transform(it.getEPackageInfos(),
							(EPackageInfo p) -> allReferencedClassifiers(p.getEPackage(), false)))),
					(EClassifier c) -> needsDispatcherRule(c)), EClass.class));
		} 
		else {
			Function<EClass, ? extends Iterable<EClassifier>> toTypes = (EClass c) -> Iterables.transform(
					Iterables.filter(filterReferences(c.getEAllReferences(), c, grammarData), (EReference r) -> needsAssignment(r)),
					EReference::getEType);
			Collection<EClass> clazzes = IterableExtensions
					.toSet(Iterables.filter(
							Iterables.concat(Iterables.transform(
									Iterables.filter(allConcreteRuleClassifiers(it, grammarData), EClass.class), toTypes)),
							EClass.class));
			return clazzes;
		}
	}
	
	private static EList<EStructuralFeature> filterDerivedStructuralFeatures(EList<EStructuralFeature> structuralFeatures, EClass eClazz, Map<EClass, EolSequence> grammarData) {
		if (grammarData.containsKey(eClazz)) {
			EList<EStructuralFeature> filteredStructuralFeatures = new BasicEList<>();
			EolSequence annotations = grammarData.get(eClazz);
			List<String> derivedAttributes = getAnnotationAttributes(annotations, "derivedAttributeName");
			for(EStructuralFeature structuralFeature: structuralFeatures) {
				if (derivedAttributes.contains(structuralFeature.getName())) {
					filteredStructuralFeatures.add(structuralFeature);
				}
			}
			return filteredStructuralFeatures;
		}
		else {
			return structuralFeatures;
		}
	}
	
	private static EList<EReference> filterReferences(EList<EReference> references, EClass eClazz, Map<EClass, EolSequence> grammarData) {
		if (grammarData.containsKey(eClazz)) {
			EList<EReference> filteredReferences = new BasicEList<>();	
			EolSequence annotations = grammarData.get(eClazz);
			List<String> derivedAttributes = getAnnotationAttributes(annotations, "derivedAttributeName");
			for(EReference reference: references) {
				if (derivedAttributes.contains(reference.getName())) {
					filteredReferences.add(reference);
				}
			}
			return filteredReferences;
		}
		else {
			return references;
		}
	}
	
	private static List<String> getAnnotationAttributes(EolSequence annotations, String annotationAttribute) {
		List<String> derivedAttributes = new ArrayList<>();
		for (Object object : annotations) {
			EolTuple annotation = (EolTuple) object;
			String derivedAttributeName = (String)annotation.get(annotationAttribute);
			derivedAttributes.add(derivedAttributeName);
		}
		return derivedAttributes;
	}
	
}