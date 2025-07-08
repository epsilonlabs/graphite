/**
 */
package pcs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CVO HA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcs.CVO_HA#getAwsnetworkingha <em>Awsnetworkingha</em>}</li>
 * </ul>
 *
 * @see pcs.PcsPackage#getCVO_HA()
 * @model
 * @generated
 */
public interface CVO_HA extends CVOConfiguration {
	/**
	 * Returns the value of the '<em><b>Awsnetworkingha</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pcs.AWSNetworkingHA#getCvo_ha <em>Cvo ha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Awsnetworkingha</em>' reference.
	 * @see #setAwsnetworkingha(AWSNetworkingHA)
	 * @see pcs.PcsPackage#getCVO_HA_Awsnetworkingha()
	 * @see pcs.AWSNetworkingHA#getCvo_ha
	 * @model opposite="cvo_ha"
	 * @generated
	 */
	AWSNetworkingHA getAwsnetworkingha();

	/**
	 * Sets the value of the '{@link pcs.CVO_HA#getAwsnetworkingha <em>Awsnetworkingha</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Awsnetworkingha</em>' reference.
	 * @see #getAwsnetworkingha()
	 * @generated
	 */
	void setAwsnetworkingha(AWSNetworkingHA value);

} // CVO_HA
