/**
 */
package TestingPackage.FuzzingOperations;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.FuzzingOperations.ValueSet#getPropertyName <em>Property Name</em>}</li>
 * </ul>
 *
 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getValueSet()
 * @model
 * @generated
 */
public interface ValueSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see #setPropertyName(String)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getValueSet_PropertyName()
	 * @model
	 * @generated
	 */
	String getPropertyName();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.ValueSet#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(String value);

} // ValueSet
