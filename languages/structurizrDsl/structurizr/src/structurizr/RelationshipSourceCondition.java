/**
 */
package structurizr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Source Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structurizr.RelationshipSourceCondition#getComparisonOperation <em>Comparison Operation</em>}</li>
 *   <li>{@link structurizr.RelationshipSourceCondition#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see structurizr.StructurizrPackage#getRelationshipSourceCondition()
 * @model
 * @generated
 */
public interface RelationshipSourceCondition extends RelationshipFilterCondition {
	/**
	 * Returns the value of the '<em><b>Comparison Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link structurizr.ConditionComparisonOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Operation</em>' attribute.
	 * @see structurizr.ConditionComparisonOperation
	 * @see #setComparisonOperation(ConditionComparisonOperation)
	 * @see structurizr.StructurizrPackage#getRelationshipSourceCondition_ComparisonOperation()
	 * @model
	 * @generated
	 */
	ConditionComparisonOperation getComparisonOperation();

	/**
	 * Sets the value of the '{@link structurizr.RelationshipSourceCondition#getComparisonOperation <em>Comparison Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Operation</em>' attribute.
	 * @see structurizr.ConditionComparisonOperation
	 * @see #getComparisonOperation()
	 * @generated
	 */
	void setComparisonOperation(ConditionComparisonOperation value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(IdentifiableElement)
	 * @see structurizr.StructurizrPackage#getRelationshipSourceCondition_Source()
	 * @model
	 * @generated
	 */
	IdentifiableElement getSource();

	/**
	 * Sets the value of the '{@link structurizr.RelationshipSourceCondition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(IdentifiableElement value);

} // RelationshipSourceCondition
