package graphite.shared;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.xtext.ISetup;

@SuppressWarnings({"rawtypes", "unchecked"})
public class DerivedPropertyData {

	protected String derivedObjectName;
	protected String parsedStringName;
	protected String grammarName;
	protected ISetup grammar;
	protected Plugin grammarPlugin;
	protected Class type;
	protected Class clazz;
	protected Class superclazz;
	protected Constructor superclazzConstructor;
	protected Method derivedObjectGetter;
	protected Method derivedObjectSetter;
	protected Method parsedStringGetter;
	protected Method parsedStringSetter;	
	protected Field derivedObjectField;
	protected Field parsedStringField;
	protected ITransformationService transformationService;
	protected boolean isTransformed;
	protected boolean isMany;

	public DerivedPropertyData(String derivedObjectName, String parsedStringName, String grammarName, ISetup grammar, Plugin grammarPlugin, Class clazz, Class type, boolean isMany, ITransformationService transformationService) {
		try {
			this.derivedObjectName = derivedObjectName;
			this.parsedStringName = parsedStringName;
			this.isMany = isMany;
			this.type = type;
			this.clazz = clazz;
			this.superclazz = this.clazz.getSuperclass();
			this.superclazzConstructor = this.superclazz.getDeclaredConstructor();	
			this.derivedObjectField = this.superclazz.getDeclaredField(this.derivedObjectName);
			this.parsedStringField = this.superclazz.getDeclaredField(this.parsedStringName);
			this.derivedObjectGetter = this.clazz.getMethod(ModelUtility.getGetterMethodName(derivedObjectName));
			this.derivedObjectSetter = (this.isMany)? null : this.superclazz.getMethod(ModelUtility.getSetterMethodName(derivedObjectName), type);
			this.parsedStringGetter = this.clazz.getMethod(ModelUtility.getGetterMethodName(parsedStringName));
			this.parsedStringSetter = this.clazz.getMethod(ModelUtility.getSetterMethodName(parsedStringName), String.class);	
			this.grammarName = grammarName;
			this.grammar = grammar;
			this.grammarPlugin = grammarPlugin;
			this.transformationService = transformationService;
			this.isTransformed = (transformationService != null);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getDerivedObjectName() {
		return derivedObjectName;
	}

	public String getParsedStringName() {
		return parsedStringName;
	}

	public String getGrammarName() {
		return grammarName;
	}
	
	public ISetup getGrammar() {
		return grammar;
	}
	
	public Plugin getGrammarPlugin() {
		return grammarPlugin;
	}
	
	public Class getType() {
		return type;
	}

	public Class getClazz() {
		return clazz;
	}

	public Class getSuperclazz() {
		return superclazz;
	}

	public Constructor getSuperclazzConstructor() {
		return superclazzConstructor;
	}

	public Method getDerivedObjectGetter() {
		return derivedObjectGetter;
	}

	public Method getDerivedObjectSetter() {
		return derivedObjectSetter;
	}

	public Method getParsedStringGetter() {
		return parsedStringGetter;
	}

	public Method getParsedStringSetter() {
		return parsedStringSetter;
	}

	public Field getDerivedObjectField() {
		return derivedObjectField;
	}

	public Field getParsedStringField() {
		return parsedStringField;
	}

	public ITransformationService getTransformationService() {
		return transformationService;
	}

	public boolean isTransformed() {
		return isTransformed;
	}

	public boolean isMany() {
		return isMany;
	}
	
}