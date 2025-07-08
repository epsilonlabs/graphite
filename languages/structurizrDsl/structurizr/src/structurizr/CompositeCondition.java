/**
 */
package structurizr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structurizr.CompositeCondition#getLeft <em>Left</em>}</li>
 *   <li>{@link structurizr.CompositeCondition#getLogicalOperation <em>Logical Operation</em>}</li>
 *   <li>{@link structurizr.CompositeCondition#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see structurizr.StructurizrPackage#getCompositeCondition()
 * @model
 * @generated
 */
public interface CompositeCondition extends FilterCondition {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(FilterCondition)
	 * @see structurizr.StructurizrPackage#getCompositeCondition_Left()
	 * @model containment="true"
	 * @generated
	 */
	FilterCondition getLeft();

	/**
	 * Sets the value of the '{@link structurizr.CompositeCondition#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(FilterCondition value);

	/**
	 * Returns the value of the '<em><b>Logical Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link structurizr.ConditionLogicalOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Operation</em>' attribute.
	 * @see structurizr.ConditionLogicalOperation
	 * @see #setLogicalOperation(ConditionLogicalOperation)
	 * @see structurizr.StructurizrPackage#getCompositeCondition_LogicalOperation()
	 * @model
	 * @generated
	 */
	ConditionLogicalOperation getLogicalOperation();

	/**
	 * Sets the value of the '{@link structurizr.CompositeCondition#getLogicalOperation <em>Logical Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logical Operation</em>' attribute.
	 * @see structurizr.ConditionLogicalOperation
	 * @see #getLogicalOperation()
	 * @generated
	 */
	void setLogicalOperation(ConditionLogicalOperation value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(FilterCondition)
	 * @see structurizr.StructurizrPackage#getCompositeCondition_Right()
	 * @model containment="true"
	 * @generated
	 */
	FilterCondition getRight();

	/**
	 * Sets the value of the '{@link structurizr.CompositeCondition#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(FilterCondition value);

} // CompositeCondition
