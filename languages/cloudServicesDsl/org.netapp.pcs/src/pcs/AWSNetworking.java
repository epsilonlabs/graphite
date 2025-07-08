/**
 */
package pcs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AWS Networking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcs.AWSNetworking#getSubnet_id <em>Subnet id</em>}</li>
 *   <li>{@link pcs.AWSNetworking#getCvo <em>Cvo</em>}</li>
 * </ul>
 *
 * @see pcs.PcsPackage#getAWSNetworking()
 * @model
 * @generated
 */
public interface AWSNetworking extends AWSConfiguration {
	/**
	 * Returns the value of the '<em><b>Subnet id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subnet id</em>' attribute.
	 * @see #setSubnet_id(String)
	 * @see pcs.PcsPackage#getAWSNetworking_Subnet_id()
	 * @model
	 * @generated
	 */
	String getSubnet_id();

	/**
	 * Sets the value of the '{@link pcs.AWSNetworking#getSubnet_id <em>Subnet id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subnet id</em>' attribute.
	 * @see #getSubnet_id()
	 * @generated
	 */
	void setSubnet_id(String value);

	/**
	 * Returns the value of the '<em><b>Cvo</b></em>' reference list.
	 * The list contents are of type {@link pcs.CVO}.
	 * It is bidirectional and its opposite is '{@link pcs.CVO#getAwsnetworking <em>Awsnetworking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cvo</em>' reference list.
	 * @see pcs.PcsPackage#getAWSNetworking_Cvo()
	 * @see pcs.CVO#getAwsnetworking
	 * @model opposite="awsnetworking"
	 * @generated
	 */
	EList<CVO> getCvo();

} // AWSNetworking
