/**
 */
package structurizr;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structurizr.User#getUsername <em>Username</em>}</li>
 *   <li>{@link structurizr.User#getPermission <em>Permission</em>}</li>
 * </ul>
 *
 * @see structurizr.StructurizrPackage#getUser()
 * @model
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see structurizr.StructurizrPackage#getUser_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link structurizr.User#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Permission</b></em>' attribute.
	 * The literals are from the enumeration {@link structurizr.UserPermission}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permission</em>' attribute.
	 * @see structurizr.UserPermission
	 * @see #setPermission(UserPermission)
	 * @see structurizr.StructurizrPackage#getUser_Permission()
	 * @model
	 * @generated
	 */
	UserPermission getPermission();

	/**
	 * Sets the value of the '{@link structurizr.User#getPermission <em>Permission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permission</em>' attribute.
	 * @see structurizr.UserPermission
	 * @see #getPermission()
	 * @generated
	 */
	void setPermission(UserPermission value);

} // User
