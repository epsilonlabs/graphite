/**
 */
package TestingPackage.StandardGrammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.StandardGrammar.BasicCondition#getLeft <em>Left</em>}</li>
 *   <li>{@link TestingPackage.StandardGrammar.BasicCondition#getBincomp <em>Bincomp</em>}</li>
 *   <li>{@link TestingPackage.StandardGrammar.BasicCondition#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see TestingPackage.StandardGrammar.StandardGrammarPackage#getBasicCondition()
 * @model
 * @generated
 */
public interface BasicCondition extends ConditionElement {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(ConditionVariable)
	 * @see TestingPackage.StandardGrammar.StandardGrammarPackage#getBasicCondition_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConditionVariable getLeft();

	/**
	 * Sets the value of the '{@link TestingPackage.StandardGrammar.BasicCondition#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(ConditionVariable value);

	/**
	 * Returns the value of the '<em><b>Bincomp</b></em>' attribute.
	 * The literals are from the enumeration {@link TestingPackage.StandardGrammar.BinaryComparisonOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bincomp</em>' attribute.
	 * @see TestingPackage.StandardGrammar.BinaryComparisonOperation
	 * @see #setBincomp(BinaryComparisonOperation)
	 * @see TestingPackage.StandardGrammar.StandardGrammarPackage#getBasicCondition_Bincomp()
	 * @model required="true"
	 * @generated
	 */
	BinaryComparisonOperation getBincomp();

	/**
	 * Sets the value of the '{@link TestingPackage.StandardGrammar.BasicCondition#getBincomp <em>Bincomp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bincomp</em>' attribute.
	 * @see TestingPackage.StandardGrammar.BinaryComparisonOperation
	 * @see #getBincomp()
	 * @generated
	 */
	void setBincomp(BinaryComparisonOperation value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(ConditionExpr)
	 * @see TestingPackage.StandardGrammar.StandardGrammarPackage#getBasicCondition_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConditionExpr getRight();

	/**
	 * Sets the value of the '{@link TestingPackage.StandardGrammar.BasicCondition#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(ConditionExpr value);

} // BasicCondition
