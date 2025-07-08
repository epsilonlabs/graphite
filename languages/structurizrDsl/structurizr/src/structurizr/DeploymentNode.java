/**
 */
package structurizr;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structurizr.DeploymentNode#getTechnology <em>Technology</em>}</li>
 *   <li>{@link structurizr.DeploymentNode#getDeploymentNodes <em>Deployment Nodes</em>}</li>
 *   <li>{@link structurizr.DeploymentNode#getInfrastructureNodes <em>Infrastructure Nodes</em>}</li>
 *   <li>{@link structurizr.DeploymentNode#getSoftwareSystemInstances <em>Software System Instances</em>}</li>
 *   <li>{@link structurizr.DeploymentNode#getContainerInstances <em>Container Instances</em>}</li>
 * </ul>
 *
 * @see structurizr.StructurizrPackage#getDeploymentNode()
 * @model
 * @generated
 */
public interface DeploymentNode extends C4Element {
	/**
	 * Returns the value of the '<em><b>Technology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology</em>' containment reference.
	 * @see #setTechnology(Technology)
	 * @see structurizr.StructurizrPackage#getDeploymentNode_Technology()
	 * @model containment="true"
	 * @generated
	 */
	Technology getTechnology();

	/**
	 * Sets the value of the '{@link structurizr.DeploymentNode#getTechnology <em>Technology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology</em>' containment reference.
	 * @see #getTechnology()
	 * @generated
	 */
	void setTechnology(Technology value);

	/**
	 * Returns the value of the '<em><b>Deployment Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link structurizr.DeploymentNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Nodes</em>' containment reference list.
	 * @see structurizr.StructurizrPackage#getDeploymentNode_DeploymentNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeploymentNode> getDeploymentNodes();

	/**
	 * Returns the value of the '<em><b>Infrastructure Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link structurizr.InfrastructureNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infrastructure Nodes</em>' containment reference list.
	 * @see structurizr.StructurizrPackage#getDeploymentNode_InfrastructureNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<InfrastructureNode> getInfrastructureNodes();

	/**
	 * Returns the value of the '<em><b>Software System Instances</b></em>' containment reference list.
	 * The list contents are of type {@link structurizr.SoftwareSystemInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software System Instances</em>' containment reference list.
	 * @see structurizr.StructurizrPackage#getDeploymentNode_SoftwareSystemInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<SoftwareSystemInstance> getSoftwareSystemInstances();

	/**
	 * Returns the value of the '<em><b>Container Instances</b></em>' containment reference list.
	 * The list contents are of type {@link structurizr.ContainerInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Instances</em>' containment reference list.
	 * @see structurizr.StructurizrPackage#getDeploymentNode_ContainerInstances()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainerInstance> getContainerInstances();

} // DeploymentNode
