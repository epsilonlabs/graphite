/**
 */
package structurizr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Property Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structurizr.ElementPropertyCondition#getComparisonOperation <em>Comparison Operation</em>}</li>
 *   <li>{@link structurizr.ElementPropertyCondition#getProperty <em>Property</em>}</li>
 *   <li>{@link structurizr.ElementPropertyCondition#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see structurizr.StructurizrPackage#getElementPropertyCondition()
 * @model
 * @generated
 */
public interface ElementPropertyCondition extends ElementFilterCondition {
	/**
	 * Returns the value of the '<em><b>Comparison Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link structurizr.ConditionComparisonOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Operation</em>' attribute.
	 * @see structurizr.ConditionComparisonOperation
	 * @see #setComparisonOperation(ConditionComparisonOperation)
	 * @see structurizr.StructurizrPackage#getElementPropertyCondition_ComparisonOperation()
	 * @model
	 * @generated
	 */
	ConditionComparisonOperation getComparisonOperation();

	/**
	 * Sets the value of the '{@link structurizr.ElementPropertyCondition#getComparisonOperation <em>Comparison Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Operation</em>' attribute.
	 * @see structurizr.ConditionComparisonOperation
	 * @see #getComparisonOperation()
	 * @generated
	 */
	void setComparisonOperation(ConditionComparisonOperation value);

	/**
	 * Returns the value of the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property</em>' reference.
	 * @see #setProperty(Property)
	 * @see structurizr.StructurizrPackage#getElementPropertyCondition_Property()
	 * @model
	 * @generated
	 */
	Property getProperty();

	/**
	 * Sets the value of the '{@link structurizr.ElementPropertyCondition#getProperty <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property</em>' reference.
	 * @see #getProperty()
	 * @generated
	 */
	void setProperty(Property value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see structurizr.StructurizrPackage#getElementPropertyCondition_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link structurizr.ElementPropertyCondition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // ElementPropertyCondition
