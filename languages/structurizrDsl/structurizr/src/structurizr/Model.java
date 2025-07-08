/**
 */
package structurizr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structurizr.Model#getSoftwareSystem <em>Software System</em>}</li>
 *   <li>{@link structurizr.Model#getPersons <em>Persons</em>}</li>
 *   <li>{@link structurizr.Model#getElements <em>Elements</em>}</li>
 *   <li>{@link structurizr.Model#getDeploymentEnvironments <em>Deployment Environments</em>}</li>
 *   <li>{@link structurizr.Model#getRelationships <em>Relationships</em>}</li>
 * </ul>
 *
 * @see structurizr.StructurizrPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Software System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software System</em>' containment reference.
	 * @see #setSoftwareSystem(SoftwareSystem)
	 * @see structurizr.StructurizrPackage#getModel_SoftwareSystem()
	 * @model containment="true"
	 * @generated
	 */
	SoftwareSystem getSoftwareSystem();

	/**
	 * Sets the value of the '{@link structurizr.Model#getSoftwareSystem <em>Software System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software System</em>' containment reference.
	 * @see #getSoftwareSystem()
	 * @generated
	 */
	void setSoftwareSystem(SoftwareSystem value);

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link structurizr.Person}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see structurizr.StructurizrPackage#getModel_Persons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPersons();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link structurizr.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see structurizr.StructurizrPackage#getModel_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Deployment Environments</b></em>' containment reference list.
	 * The list contents are of type {@link structurizr.DeploymentEnvironment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Environments</em>' containment reference list.
	 * @see structurizr.StructurizrPackage#getModel_DeploymentEnvironments()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeploymentEnvironment> getDeploymentEnvironments();

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link structurizr.Relationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see structurizr.StructurizrPackage#getModel_Relationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relationship> getRelationships();

} // Model
