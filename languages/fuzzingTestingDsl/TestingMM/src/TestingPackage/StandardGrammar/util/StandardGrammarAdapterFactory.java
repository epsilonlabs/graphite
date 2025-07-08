/**
 */
package TestingPackage.StandardGrammar.util;

import TestingPackage.StandardGrammar.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see TestingPackage.StandardGrammar.StandardGrammarPackage
 * @generated
 */
public class StandardGrammarAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StandardGrammarPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardGrammarAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StandardGrammarPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StandardGrammarSwitch<Adapter> modelSwitch =
		new StandardGrammarSwitch<Adapter>() {
			@Override
			public Adapter caseConditionElement(ConditionElement object) {
				return createConditionElementAdapter();
			}
			@Override
			public Adapter caseCompositeCondition(CompositeCondition object) {
				return createCompositeConditionAdapter();
			}
			@Override
			public Adapter caseBasicCondition(BasicCondition object) {
				return createBasicConditionAdapter();
			}
			@Override
			public Adapter caseConditionExpr(ConditionExpr object) {
				return createConditionExprAdapter();
			}
			@Override
			public Adapter caseConditionInteger(ConditionInteger object) {
				return createConditionIntegerAdapter();
			}
			@Override
			public Adapter caseConditionVariable(ConditionVariable object) {
				return createConditionVariableAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link TestingPackage.StandardGrammar.ConditionElement <em>Condition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TestingPackage.StandardGrammar.ConditionElement
	 * @generated
	 */
	public Adapter createConditionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TestingPackage.StandardGrammar.CompositeCondition <em>Composite Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TestingPackage.StandardGrammar.CompositeCondition
	 * @generated
	 */
	public Adapter createCompositeConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TestingPackage.StandardGrammar.BasicCondition <em>Basic Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TestingPackage.StandardGrammar.BasicCondition
	 * @generated
	 */
	public Adapter createBasicConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TestingPackage.StandardGrammar.ConditionExpr <em>Condition Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TestingPackage.StandardGrammar.ConditionExpr
	 * @generated
	 */
	public Adapter createConditionExprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TestingPackage.StandardGrammar.ConditionInteger <em>Condition Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TestingPackage.StandardGrammar.ConditionInteger
	 * @generated
	 */
	public Adapter createConditionIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TestingPackage.StandardGrammar.ConditionVariable <em>Condition Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TestingPackage.StandardGrammar.ConditionVariable
	 * @generated
	 */
	public Adapter createConditionVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TestingPackage.StandardGrammar.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TestingPackage.StandardGrammar.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StandardGrammarAdapterFactory
