/**
 */
package structurizr;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structurizr.DeploymentEnvironment#getDeploymentGroups <em>Deployment Groups</em>}</li>
 *   <li>{@link structurizr.DeploymentEnvironment#getDeploymentNodes <em>Deployment Nodes</em>}</li>
 * </ul>
 *
 * @see structurizr.StructurizrPackage#getDeploymentEnvironment()
 * @model
 * @generated
 */
public interface DeploymentEnvironment extends IdentifiableElement {
	/**
	 * Returns the value of the '<em><b>Deployment Groups</b></em>' containment reference list.
	 * The list contents are of type {@link structurizr.DeploymentGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Groups</em>' containment reference list.
	 * @see structurizr.StructurizrPackage#getDeploymentEnvironment_DeploymentGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeploymentGroup> getDeploymentGroups();

	/**
	 * Returns the value of the '<em><b>Deployment Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link structurizr.DeploymentNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Nodes</em>' containment reference list.
	 * @see structurizr.StructurizrPackage#getDeploymentEnvironment_DeploymentNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeploymentNode> getDeploymentNodes();

} // DeploymentEnvironment
