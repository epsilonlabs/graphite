/**
 */
package structurizr;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Tag Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structurizr.RelationshipTagCondition#getComparisonOperation <em>Comparison Operation</em>}</li>
 *   <li>{@link structurizr.RelationshipTagCondition#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see structurizr.StructurizrPackage#getRelationshipTagCondition()
 * @model
 * @generated
 */
public interface RelationshipTagCondition extends RelationshipFilterCondition {
	/**
	 * Returns the value of the '<em><b>Comparison Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link structurizr.ConditionComparisonOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Operation</em>' attribute.
	 * @see structurizr.ConditionComparisonOperation
	 * @see #setComparisonOperation(ConditionComparisonOperation)
	 * @see structurizr.StructurizrPackage#getRelationshipTagCondition_ComparisonOperation()
	 * @model
	 * @generated
	 */
	ConditionComparisonOperation getComparisonOperation();

	/**
	 * Sets the value of the '{@link structurizr.RelationshipTagCondition#getComparisonOperation <em>Comparison Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Operation</em>' attribute.
	 * @see structurizr.ConditionComparisonOperation
	 * @see #getComparisonOperation()
	 * @generated
	 */
	void setComparisonOperation(ConditionComparisonOperation value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' reference list.
	 * The list contents are of type {@link structurizr.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' reference list.
	 * @see structurizr.StructurizrPackage#getRelationshipTagCondition_Tags()
	 * @model
	 * @generated
	 */
	EList<Tag> getTags();

} // RelationshipTagCondition
