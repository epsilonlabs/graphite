/**
 */
package TestingPackage.MRSPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.MRSPackage.Node#getName <em>Name</em>}</li>
 *   <li>{@link TestingPackage.MRSPackage.Node#getSubscriber <em>Subscriber</em>}</li>
 *   <li>{@link TestingPackage.MRSPackage.Node#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link TestingPackage.MRSPackage.Node#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see TestingPackage.MRSPackage.MRSPackagePackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TestingPackage.MRSPackage.MRSPackagePackage#getNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TestingPackage.MRSPackage.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Subscriber</b></em>' reference list.
	 * The list contents are of type {@link TestingPackage.MRSPackage.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber</em>' reference list.
	 * @see TestingPackage.MRSPackage.MRSPackagePackage#getNode_Subscriber()
	 * @model
	 * @generated
	 */
	EList<Variable> getSubscriber();

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' reference list.
	 * The list contents are of type {@link TestingPackage.MRSPackage.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' reference list.
	 * @see TestingPackage.MRSPackage.MRSPackagePackage#getNode_Publisher()
	 * @model
	 * @generated
	 */
	EList<Variable> getPublisher();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link TestingPackage.MRSPackage.ComponentProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see TestingPackage.MRSPackage.MRSPackagePackage#getNode_Properties()
	 * @model
	 * @generated
	 */
	EList<ComponentProperty> getProperties();

} // Node
