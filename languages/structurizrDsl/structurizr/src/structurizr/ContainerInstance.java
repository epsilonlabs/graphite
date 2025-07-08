/**
 */
package structurizr;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structurizr.ContainerInstance#getContainer <em>Container</em>}</li>
 *   <li>{@link structurizr.ContainerInstance#getDeploymentGroups <em>Deployment Groups</em>}</li>
 *   <li>{@link structurizr.ContainerInstance#getHealthCheck <em>Health Check</em>}</li>
 * </ul>
 *
 * @see structurizr.StructurizrPackage#getContainerInstance()
 * @model
 * @generated
 */
public interface ContainerInstance extends C4Element {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(Container)
	 * @see structurizr.StructurizrPackage#getContainerInstance_Container()
	 * @model
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link structurizr.ContainerInstance#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

	/**
	 * Returns the value of the '<em><b>Deployment Groups</b></em>' reference list.
	 * The list contents are of type {@link structurizr.DeploymentGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Groups</em>' reference list.
	 * @see structurizr.StructurizrPackage#getContainerInstance_DeploymentGroups()
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
	 * @see structurizr.StructurizrPackage#getContainerInstance_HealthCheck()
	 * @model containment="true"
	 * @generated
	 */
	HealthCheck getHealthCheck();

	/**
	 * Sets the value of the '{@link structurizr.ContainerInstance#getHealthCheck <em>Health Check</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health Check</em>' containment reference.
	 * @see #getHealthCheck()
	 * @generated
	 */
	void setHealthCheck(HealthCheck value);

} // ContainerInstance
