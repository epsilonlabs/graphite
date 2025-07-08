/**
 */
package pcs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AWS Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcs.AWSConfiguration#getRegion <em>Region</em>}</li>
 *   <li>{@link pcs.AWSConfiguration#getVpc_id <em>Vpc id</em>}</li>
 * </ul>
 *
 * @see pcs.PcsPackage#getAWSConfiguration()
 * @model abstract="true"
 * @generated
 */
public interface AWSConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Region</em>' attribute.
	 * @see #setRegion(String)
	 * @see pcs.PcsPackage#getAWSConfiguration_Region()
	 * @model
	 * @generated
	 */
	String getRegion();

	/**
	 * Sets the value of the '{@link pcs.AWSConfiguration#getRegion <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region</em>' attribute.
	 * @see #getRegion()
	 * @generated
	 */
	void setRegion(String value);

	/**
	 * Returns the value of the '<em><b>Vpc id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vpc id</em>' attribute.
	 * @see #setVpc_id(String)
	 * @see pcs.PcsPackage#getAWSConfiguration_Vpc_id()
	 * @model
	 * @generated
	 */
	String getVpc_id();

	/**
	 * Sets the value of the '{@link pcs.AWSConfiguration#getVpc_id <em>Vpc id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vpc id</em>' attribute.
	 * @see #getVpc_id()
	 * @generated
	 */
	void setVpc_id(String value);

} // AWSConfiguration
