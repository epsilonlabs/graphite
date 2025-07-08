/**
 */
package TestingPackage.StandardGrammar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.StandardGrammar.Condition#getName <em>Name</em>}</li>
 *   <li>{@link TestingPackage.StandardGrammar.Condition#getC <em>C</em>}</li>
 * </ul>
 *
 * @see TestingPackage.StandardGrammar.StandardGrammarPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TestingPackage.StandardGrammar.StandardGrammarPackage#getCondition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TestingPackage.StandardGrammar.Condition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>C</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C</em>' containment reference.
	 * @see #setC(ConditionElement)
	 * @see TestingPackage.StandardGrammar.StandardGrammarPackage#getCondition_C()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConditionElement getC();

	/**
	 * Sets the value of the '{@link TestingPackage.StandardGrammar.Condition#getC <em>C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C</em>' containment reference.
	 * @see #getC()
	 * @generated
	 */
	void setC(ConditionElement value);

} // Condition
