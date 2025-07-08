/**
 */
package TestingPackage.StandardGrammar;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see TestingPackage.StandardGrammar.StandardGrammarPackage
 * @generated
 */
public interface StandardGrammarFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StandardGrammarFactory eINSTANCE = TestingPackage.StandardGrammar.impl.StandardGrammarFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Composite Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Condition</em>'.
	 * @generated
	 */
	CompositeCondition createCompositeCondition();

	/**
	 * Returns a new object of class '<em>Basic Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Condition</em>'.
	 * @generated
	 */
	BasicCondition createBasicCondition();

	/**
	 * Returns a new object of class '<em>Condition Integer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Integer</em>'.
	 * @generated
	 */
	ConditionInteger createConditionInteger();

	/**
	 * Returns a new object of class '<em>Condition Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Variable</em>'.
	 * @generated
	 */
	ConditionVariable createConditionVariable();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StandardGrammarPackage getStandardGrammarPackage();

} //StandardGrammarFactory
