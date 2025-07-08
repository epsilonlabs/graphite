/**
 */
package structurizr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Type Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structurizr.ElementTypeCondition#getComparisonOperation <em>Comparison Operation</em>}</li>
 *   <li>{@link structurizr.ElementTypeCondition#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see structurizr.StructurizrPackage#getElementTypeCondition()
 * @model
 * @generated
 */
public interface ElementTypeCondition extends ElementFilterCondition {
	/**
	 * Returns the value of the '<em><b>Comparison Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link structurizr.ConditionComparisonOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Operation</em>' attribute.
	 * @see structurizr.ConditionComparisonOperation
	 * @see #setComparisonOperation(ConditionComparisonOperation)
	 * @see structurizr.StructurizrPackage#getElementTypeCondition_ComparisonOperation()
	 * @model
	 * @generated
	 */
	ConditionComparisonOperation getComparisonOperation();

	/**
	 * Sets the value of the '{@link structurizr.ElementTypeCondition#getComparisonOperation <em>Comparison Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Operation</em>' attribute.
	 * @see structurizr.ConditionComparisonOperation
	 * @see #getComparisonOperation()
	 * @generated
	 */
	void setComparisonOperation(ConditionComparisonOperation value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link structurizr.FilterType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see structurizr.FilterType
	 * @see #setType(FilterType)
	 * @see structurizr.StructurizrPackage#getElementTypeCondition_Type()
	 * @model
	 * @generated
	 */
	FilterType getType();

	/**
	 * Sets the value of the '{@link structurizr.ElementTypeCondition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see structurizr.FilterType
	 * @see #getType()
	 * @generated
	 */
	void setType(FilterType value);

} // ElementTypeCondition
