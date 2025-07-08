/**
 */
package structurizr;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structurizr.SoftwareSystem#getContainers <em>Containers</em>}</li>
 * </ul>
 *
 * @see structurizr.StructurizrPackage#getSoftwareSystem()
 * @model
 * @generated
 */
public interface SoftwareSystem extends C4Element {
	/**
	 * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
	 * The list contents are of type {@link structurizr.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' containment reference list.
	 * @see structurizr.StructurizrPackage#getSoftwareSystem_Containers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Container> getContainers();

} // SoftwareSystem
