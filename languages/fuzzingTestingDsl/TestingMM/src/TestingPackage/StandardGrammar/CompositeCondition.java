/**
 */
package TestingPackage.StandardGrammar;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.StandardGrammar.CompositeCondition#getLeft <em>Left</em>}</li>
 *   <li>{@link TestingPackage.StandardGrammar.CompositeCondition#getBinop <em>Binop</em>}</li>
 *   <li>{@link TestingPackage.StandardGrammar.CompositeCondition#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see TestingPackage.StandardGrammar.StandardGrammarPackage#getCompositeCondition()
 * @model
 * @generated
 */
public interface CompositeCondition extends ConditionElement {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(ConditionElement)
	 * @see TestingPackage.StandardGrammar.StandardGrammarPackage#getCompositeCondition_Left()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConditionElement getLeft();

	/**
	 * Sets the value of the '{@link TestingPackage.StandardGrammar.CompositeCondition#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(ConditionElement value);

	/**
	 * Returns the value of the '<em><b>Binop</b></em>' attribute.
	 * The literals are from the enumeration {@link TestingPackage.StandardGrammar.BinaryLogicalOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binop</em>' attribute.
	 * @see TestingPackage.StandardGrammar.BinaryLogicalOperation
	 * @see #setBinop(BinaryLogicalOperation)
	 * @see TestingPackage.StandardGrammar.StandardGrammarPackage#getCompositeCondition_Binop()
	 * @model required="true"
	 * @generated
	 */
	BinaryLogicalOperation getBinop();

	/**
	 * Sets the value of the '{@link TestingPackage.StandardGrammar.CompositeCondition#getBinop <em>Binop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binop</em>' attribute.
	 * @see TestingPackage.StandardGrammar.BinaryLogicalOperation
	 * @see #getBinop()
	 * @generated
	 */
	void setBinop(BinaryLogicalOperation value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(ConditionElement)
	 * @see TestingPackage.StandardGrammar.StandardGrammarPackage#getCompositeCondition_Right()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConditionElement getRight();

	/**
	 * Sets the value of the '{@link TestingPackage.StandardGrammar.CompositeCondition#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(ConditionElement value);

} // CompositeCondition
