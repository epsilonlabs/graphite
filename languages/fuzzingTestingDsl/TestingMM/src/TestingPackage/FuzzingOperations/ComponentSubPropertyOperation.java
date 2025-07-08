/**
 */
package TestingPackage.FuzzingOperations;

import TestingPackage.MRSPackage.ComponentProperty;
import TestingPackage.MRSPackage.Type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Sub Property Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.FuzzingOperations.ComponentSubPropertyOperation#getPropertyToAffect <em>Property To Affect</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.ComponentSubPropertyOperation#getSubProperty <em>Sub Property</em>}</li>
 * </ul>
 *
 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getComponentSubPropertyOperation()
 * @model
 * @generated
 */
public interface ComponentSubPropertyOperation extends FuzzTestingOperation {
	/**
	 * Returns the value of the '<em><b>Property To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property To Affect</em>' reference.
	 * @see #setPropertyToAffect(ComponentProperty)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getComponentSubPropertyOperation_PropertyToAffect()
	 * @model
	 * @generated
	 */
	ComponentProperty getPropertyToAffect();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.ComponentSubPropertyOperation#getPropertyToAffect <em>Property To Affect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property To Affect</em>' reference.
	 * @see #getPropertyToAffect()
	 * @generated
	 */
	void setPropertyToAffect(ComponentProperty value);

	/**
	 * Returns the value of the '<em><b>Sub Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Property</em>' reference.
	 * @see #setSubProperty(Type)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getComponentSubPropertyOperation_SubProperty()
	 * @model
	 * @generated
	 */
	Type getSubProperty();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.ComponentSubPropertyOperation#getSubProperty <em>Sub Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Property</em>' reference.
	 * @see #getSubProperty()
	 * @generated
	 */
	void setSubProperty(Type value);

} // ComponentSubPropertyOperation
