/**
 */
package structurizr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Context View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structurizr.SystemContextView#getSoftwareSystem <em>Software System</em>}</li>
 * </ul>
 *
 * @see structurizr.StructurizrPackage#getSystemContextView()
 * @model annotation="syntax feature='includeExpression' derive='include' grammar='structurizr.expressions.StructurizrExpressions' entryRule='SystemContextView_Include'"
 *        annotation="syntax feature='excludeExpression' derive='exclude' grammar='structurizr.expressions.StructurizrExpressions' entryRule='SystemContextView_Exclude'"
 * @generated
 */
public interface SystemContextView extends ViewElement {
	/**
	 * Returns the value of the '<em><b>Software System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software System</em>' reference.
	 * @see #setSoftwareSystem(SoftwareSystem)
	 * @see structurizr.StructurizrPackage#getSystemContextView_SoftwareSystem()
	 * @model
	 * @generated
	 */
	SoftwareSystem getSoftwareSystem();

	/**
	 * Sets the value of the '{@link structurizr.SystemContextView#getSoftwareSystem <em>Software System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software System</em>' reference.
	 * @see #getSoftwareSystem()
	 * @generated
	 */
	void setSoftwareSystem(SoftwareSystem value);

} // SystemContextView
