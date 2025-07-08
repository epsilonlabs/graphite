/**
 */
package structurizr;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software System Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structurizr.SoftwareSystemInstance#getSoftwareSystem <em>Software System</em>}</li>
 *   <li>{@link structurizr.SoftwareSystemInstance#getDeploymentGroups <em>Deployment Groups</em>}</li>
 *   <li>{@link structurizr.SoftwareSystemInstance#getHealthCheck <em>Health Check</em>}</li>
 * </ul>
 *
 * @see structurizr.StructurizrPackage#getSoftwareSystemInstance()
 * @model
 * @generated
 */
public interface SoftwareSystemInstance extends C4Element {
	/**
	 * Returns the value of the '<em><b>Software System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software System</em>' reference.
	 * @see #setSoftwareSystem(SoftwareSystem)
	 * @see structurizr.StructurizrPackage#getSoftwareSystemInstance_SoftwareSystem()
	 * @model
	 * @generated
	 */
	SoftwareSystem getSoftwareSystem();

	/**
	 * Sets the value of the '{@link structurizr.SoftwareSystemInstance#getSoftwareSystem <em>Software System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software System</em>' reference.
	 * @see #getSoftwareSystem()
	 * @generated
	 */
	void setSoftwareSystem(SoftwareSystem value);

	/**
	 * Returns the value of the '<em><b>Deployment Groups</b></em>' reference list.
	 * The list contents are of type {@link structurizr.DeploymentGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Groups</em>' reference list.
	 * @see structurizr.StructurizrPackage#getSoftwareSystemInstance_DeploymentGroups()
	 * @model
	 * @generated
	 */
	EList<DeploymentGroup> getDeploymentGroups();

	/**
	 * Returns the value of the '<em><b>Health Check</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Health Check</em>' containment reference.
	 * @see #setHealthCheck(HealthCheck)
	 * @see structurizr.StructurizrPackage#getSoftwareSystemInstance_HealthCheck()
	 * @model containment="true"
	 * @generated
	 */
	HealthCheck getHealthCheck();

	/**
	 * Sets the value of the '{@link structurizr.SoftwareSystemInstance#getHealthCheck <em>Health Check</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health Check</em>' containment reference.
	 * @see #getHealthCheck()
	 * @generated
	 */
	void setHealthCheck(HealthCheck value);

} // SoftwareSystemInstance
