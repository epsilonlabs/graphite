/**
 */
package structurizr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Infrastructure Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structurizr.InfrastructureNode#getTechnology <em>Technology</em>}</li>
 * </ul>
 *
 * @see structurizr.StructurizrPackage#getInfrastructureNode()
 * @model
 * @generated
 */
public interface InfrastructureNode extends C4Element {
	/**
	 * Returns the value of the '<em><b>Technology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology</em>' containment reference.
	 * @see #setTechnology(Technology)
	 * @see structurizr.StructurizrPackage#getInfrastructureNode_Technology()
	 * @model containment="true"
	 * @generated
	 */
	Technology getTechnology();

	/**
	 * Sets the value of the '{@link structurizr.InfrastructureNode#getTechnology <em>Technology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology</em>' containment reference.
	 * @see #getTechnology()
	 * @generated
	 */
	void setTechnology(Technology value);

} // InfrastructureNode
