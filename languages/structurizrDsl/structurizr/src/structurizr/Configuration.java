/**
 */
package structurizr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structurizr.Configuration#getScope <em>Scope</em>}</li>
 *   <li>{@link structurizr.Configuration#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link structurizr.Configuration#getUsers <em>Users</em>}</li>
 *   <li>{@link structurizr.Configuration#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see structurizr.StructurizrPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends EObject {
	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link structurizr.Scope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see structurizr.Scope
	 * @see #setScope(Scope)
	 * @see structurizr.StructurizrPackage#getConfiguration_Scope()
	 * @model
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link structurizr.Configuration#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see structurizr.Scope
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link structurizr.Visibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see structurizr.Visibility
	 * @see #setVisibility(Visibility)
	 * @see structurizr.StructurizrPackage#getConfiguration_Visibility()
	 * @model
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link structurizr.Configuration#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see structurizr.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link structurizr.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see structurizr.StructurizrPackage#getConfiguration_Users()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link structurizr.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see structurizr.StructurizrPackage#getConfiguration_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

} // Configuration
