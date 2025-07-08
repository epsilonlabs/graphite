/**
 */
package pcs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Tiering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcs.CloudTiering#getCloudstorage <em>Cloudstorage</em>}</li>
 * </ul>
 *
 * @see pcs.PcsPackage#getCloudTiering()
 * @model
 * @generated
 */
public interface CloudTiering extends DataService {
	/**
	 * Returns the value of the '<em><b>Cloudstorage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pcs.CloudStorage#getCapacity_tier <em>Capacity tier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloudstorage</em>' reference.
	 * @see #setCloudstorage(CloudStorage)
	 * @see pcs.PcsPackage#getCloudTiering_Cloudstorage()
	 * @see pcs.CloudStorage#getCapacity_tier
	 * @model opposite="capacity_tier" required="true"
	 * @generated
	 */
	CloudStorage getCloudstorage();

	/**
	 * Sets the value of the '{@link pcs.CloudTiering#getCloudstorage <em>Cloudstorage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudstorage</em>' reference.
	 * @see #getCloudstorage()
	 * @generated
	 */
	void setCloudstorage(CloudStorage value);

} // CloudTiering
