/**
 */
package TestingPackage.MRSPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.MRSPackage.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link TestingPackage.MRSPackage.Parameter#getSubparameters <em>Subparameters</em>}</li>
 *   <li>{@link TestingPackage.MRSPackage.Parameter#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see TestingPackage.MRSPackage.MRSPackagePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TestingPackage.MRSPackage.MRSPackagePackage#getParameter_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TestingPackage.MRSPackage.Parameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Subparameters</b></em>' containment reference list.
	 * The list contents are of type {@link TestingPackage.MRSPackage.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subparameters</em>' containment reference list.
	 * @see TestingPackage.MRSPackage.MRSPackagePackage#getParameter_Subparameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getSubparameters();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see TestingPackage.MRSPackage.MRSPackagePackage#getParameter_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link TestingPackage.MRSPackage.Parameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Parameter
