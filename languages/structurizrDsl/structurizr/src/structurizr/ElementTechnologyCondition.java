/**
 */
package structurizr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Technology Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structurizr.ElementTechnologyCondition#getComparisonOperation <em>Comparison Operation</em>}</li>
 *   <li>{@link structurizr.ElementTechnologyCondition#getTechnology <em>Technology</em>}</li>
 * </ul>
 *
 * @see structurizr.StructurizrPackage#getElementTechnologyCondition()
 * @model
 * @generated
 */
public interface ElementTechnologyCondition extends ElementFilterCondition {
	/**
	 * Returns the value of the '<em><b>Comparison Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link structurizr.ConditionComparisonOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Operation</em>' attribute.
	 * @see structurizr.ConditionComparisonOperation
	 * @see #setComparisonOperation(ConditionComparisonOperation)
	 * @see structurizr.StructurizrPackage#getElementTechnologyCondition_ComparisonOperation()
	 * @model
	 * @generated
	 */
	ConditionComparisonOperation getComparisonOperation();

	/**
	 * Sets the value of the '{@link structurizr.ElementTechnologyCondition#getComparisonOperation <em>Comparison Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Operation</em>' attribute.
	 * @see structurizr.ConditionComparisonOperation
	 * @see #getComparisonOperation()
	 * @generated
	 */
	void setComparisonOperation(ConditionComparisonOperation value);

	/**
	 * Returns the value of the '<em><b>Technology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology</em>' reference.
	 * @see #setTechnology(Technology)
	 * @see structurizr.StructurizrPackage#getElementTechnologyCondition_Technology()
	 * @model
	 * @generated
	 */
	Technology getTechnology();

	/**
	 * Sets the value of the '{@link structurizr.ElementTechnologyCondition#getTechnology <em>Technology</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology</em>' reference.
	 * @see #getTechnology()
	 * @generated
	 */
	void setTechnology(Technology value);

} // ElementTechnologyCondition
