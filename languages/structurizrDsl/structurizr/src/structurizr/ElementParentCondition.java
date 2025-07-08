/**
 */
package structurizr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Parent Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structurizr.ElementParentCondition#getComparisonOperation <em>Comparison Operation</em>}</li>
 *   <li>{@link structurizr.ElementParentCondition#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see structurizr.StructurizrPackage#getElementParentCondition()
 * @model
 * @generated
 */
public interface ElementParentCondition extends ElementFilterCondition {
	/**
	 * Returns the value of the '<em><b>Comparison Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link structurizr.ConditionComparisonOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Operation</em>' attribute.
	 * @see structurizr.ConditionComparisonOperation
	 * @see #setComparisonOperation(ConditionComparisonOperation)
	 * @see structurizr.StructurizrPackage#getElementParentCondition_ComparisonOperation()
	 * @model
	 * @generated
	 */
	ConditionComparisonOperation getComparisonOperation();

	/**
	 * Sets the value of the '{@link structurizr.ElementParentCondition#getComparisonOperation <em>Comparison Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Operation</em>' attribute.
	 * @see structurizr.ConditionComparisonOperation
	 * @see #getComparisonOperation()
	 * @generated
	 */
	void setComparisonOperation(ConditionComparisonOperation value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(IdentifiableElement)
	 * @see structurizr.StructurizrPackage#getElementParentCondition_Parent()
	 * @model
	 * @generated
	 */
	IdentifiableElement getParent();

	/**
	 * Sets the value of the '{@link structurizr.ElementParentCondition#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(IdentifiableElement value);

} // ElementParentCondition
