package graphite.shared;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ISetup;

import graphite.textual.XtextEObject;

import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

@SuppressWarnings({"rawtypes", "unchecked"})
public class DerivedObjectProperties {
	
	protected DerivedPropertyData derivedPropertyData;
	protected XtextEObject containerObject;
	protected String lastParsedString;
	protected boolean isInvalid;
	protected SimpleLock lock;
	protected Method identifierGetterMethod;
	protected Map<EObject, EList<EObject>> recerencingAndReferencedObjects;
	protected EList<Diagnostic> parseErrors;

	public DerivedObjectProperties(DerivedPropertyData derivedPropertyData, XtextEObject containerObject) {
		try {
			this.derivedPropertyData = derivedPropertyData;
			this.containerObject = containerObject;
			this.lastParsedString = null;
			this.isInvalid = false;
			this.lock = new SimpleLock();
			this.parseErrors = null;
			this.recerencingAndReferencedObjects = new WeakHashMap<EObject, EList<EObject>>();
			this.identifierGetterMethod = Settings.isMergeDerivedModelElements() ? derivedPropertyData.getType().getMethod(ModelUtility.getIdentifierMethodName(derivedPropertyData.getType())) : null;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public XtextEObject getContainerObject() {
		return containerObject;
	}

	public String getLastParsedString() {
		return lastParsedString;
	}

	public void setLastParsedString(String lastParsedString) {
		this.lastParsedString = lastParsedString;
	}

	public boolean isInvalid() {
		return isInvalid;
	}

	public void setInvalid(boolean isInvalid) {
		this.isInvalid = isInvalid;
	}
	
	public SimpleLock getLock() {
		return lock;
	}
	
	public void setParseErrors(EList<Diagnostic> parseErrors) {
		this.parseErrors = parseErrors;
	}
	
	public EList<Diagnostic> getParseErrors() {
		return parseErrors;
	}
	
	public Map<EObject, EList<EObject>> getRecerencingAndReferencedObjects() {
		return recerencingAndReferencedObjects;
	}
		
	public Method getIdentifierGetterMethod() {
		return identifierGetterMethod;
	}
	
	public String getDerivedObjectName() {
		return derivedPropertyData.getDerivedObjectName();
	}
	
	public String getParsedStringName() {
		return derivedPropertyData.getParsedStringName();
	}
	
	public Class getType() {
		return derivedPropertyData.getType();
	}
	
	public Class getClazz() {
		return derivedPropertyData.getClazz();
	}
	
	public Class getSuperclazz() {
		return derivedPropertyData.getSuperclazz();
	}
	
	public Set<EClassifier> getReferencedTypes() {
		return derivedPropertyData.getReferencedTypes();
	}
	
	public Constructor getSuperclazzConstructor() {
		return derivedPropertyData.getSuperclazzConstructor();
	}
	
	public Method getDerivedObjectGetter() {
		return derivedPropertyData.getDerivedObjectGetter();
	}
	
	public Method getDerivedObjectSetter() {
		return derivedPropertyData.getDerivedObjectSetter();
	}
	
	public Method getParsedStringGetter() {
		return derivedPropertyData.getParsedStringGetter();
	}

	public Method getParsedStringSetter() {
		return derivedPropertyData.getParsedStringSetter();
	}
	
	public Field getDerivedObjectField() {
		return derivedPropertyData.getDerivedObjectField();
	}
	
	public Field getParsedStringField() {
		return derivedPropertyData.getParsedStringField();
	}
	
	public String getGrammarName() {
		return derivedPropertyData.getGrammarName();
	}
	
	public String getGrammarEntryRule() {
		return derivedPropertyData.getGrammarEntryRule();
	}
	
	public ISetup getGrammar() {
		return derivedPropertyData.getGrammar();
	}
	
	public Plugin getGrammarPlugin() {
		return derivedPropertyData.getGrammarPlugin();
	}
	
	public boolean isMany() {
		return derivedPropertyData.isMany();
	}
	
}