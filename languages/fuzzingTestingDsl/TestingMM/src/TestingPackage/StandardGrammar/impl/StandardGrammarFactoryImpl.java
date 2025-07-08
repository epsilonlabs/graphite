/**
 */
package TestingPackage.StandardGrammar.impl;

import TestingPackage.StandardGrammar.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StandardGrammarFactoryImpl extends EFactoryImpl implements StandardGrammarFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StandardGrammarFactory init() {
		try {
			StandardGrammarFactory theStandardGrammarFactory = (StandardGrammarFactory)EPackage.Registry.INSTANCE.getEFactory(StandardGrammarPackage.eNS_URI);
			if (theStandardGrammarFactory != null) {
				return theStandardGrammarFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StandardGrammarFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardGrammarFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StandardGrammarPackage.COMPOSITE_CONDITION: return createCompositeCondition();
			case StandardGrammarPackage.BASIC_CONDITION: return createBasicCondition();
			case StandardGrammarPackage.CONDITION_INTEGER: return createConditionInteger();
			case StandardGrammarPackage.CONDITION_VARIABLE: return createConditionVariable();
			case StandardGrammarPackage.CONDITION: return createCondition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case StandardGrammarPackage.BINARY_COMPARISON_OPERATION:
				return createBinaryComparisonOperationFromString(eDataType, initialValue);
			case StandardGrammarPackage.BINARY_LOGICAL_OPERATION:
				return createBinaryLogicalOperationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case StandardGrammarPackage.BINARY_COMPARISON_OPERATION:
				return convertBinaryComparisonOperationToString(eDataType, instanceValue);
			case StandardGrammarPackage.BINARY_LOGICAL_OPERATION:
				return convertBinaryLogicalOperationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeCondition createCompositeCondition() {
		CompositeConditionImpl compositeCondition = new CompositeConditionImpl();
		return compositeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicCondition createBasicCondition() {
		BasicConditionImpl basicCondition = new BasicConditionImpl();
		return basicCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionInteger createConditionInteger() {
		ConditionIntegerImpl conditionInteger = new ConditionIntegerImpl();
		return conditionInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionVariable createConditionVariable() {
		ConditionVariableImpl conditionVariable = new ConditionVariableImpl();
		return conditionVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryComparisonOperation createBinaryComparisonOperationFromString(EDataType eDataType, String initialValue) {
		BinaryComparisonOperation result = BinaryComparisonOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryComparisonOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryLogicalOperation createBinaryLogicalOperationFromString(EDataType eDataType, String initialValue) {
		BinaryLogicalOperation result = BinaryLogicalOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBinaryLogicalOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardGrammarPackage getStandardGrammarPackage() {
		return (StandardGrammarPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StandardGrammarPackage getPackage() {
		return StandardGrammarPackage.eINSTANCE;
	}

} //StandardGrammarFactoryImpl
