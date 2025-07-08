/**
 */
package pcs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Storage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcs.CloudStorage#getBackup_volumes_to_cbs <em>Backup volumes to cbs</em>}</li>
 *   <li>{@link pcs.CloudStorage#getCapacity_tier <em>Capacity tier</em>}</li>
 * </ul>
 *
 * @see pcs.PcsPackage#getCloudStorage()
 * @model abstract="true"
 * @generated
 */
public interface CloudStorage extends PCS {
	/**
	 * Returns the value of the '<em><b>Backup volumes to cbs</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pcs.CloudBackup#getCloudstorage <em>Cloudstorage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backup volumes to cbs</em>' reference.
	 * @see #setBackup_volumes_to_cbs(CloudBackup)
	 * @see pcs.PcsPackage#getCloudStorage_Backup_volumes_to_cbs()
	 * @see pcs.CloudBackup#getCloudstorage
	 * @model opposite="cloudstorage"
	 * @generated
	 */
	CloudBackup getBackup_volumes_to_cbs();

	/**
	 * Sets the value of the '{@link pcs.CloudStorage#getBackup_volumes_to_cbs <em>Backup volumes to cbs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backup volumes to cbs</em>' reference.
	 * @see #getBackup_volumes_to_cbs()
	 * @generated
	 */
	void setBackup_volumes_to_cbs(CloudBackup value);

	/**
	 * Returns the value of the '<em><b>Capacity tier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pcs.CloudTiering#getCloudstorage <em>Cloudstorage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity tier</em>' reference.
	 * @see #setCapacity_tier(CloudTiering)
	 * @see pcs.PcsPackage#getCloudStorage_Capacity_tier()
	 * @see pcs.CloudTiering#getCloudstorage
	 * @model opposite="cloudstorage"
	 * @generated
	 */
	CloudTiering getCapacity_tier();

	/**
	 * Sets the value of the '{@link pcs.CloudStorage#getCapacity_tier <em>Capacity tier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity tier</em>' reference.
	 * @see #getCapacity_tier()
	 * @generated
	 */
	void setCapacity_tier(CloudTiering value);

} // CloudStorage
