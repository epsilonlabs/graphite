/**
 */
package pcs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Backup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcs.CloudBackup#getCloudstorage <em>Cloudstorage</em>}</li>
 * </ul>
 *
 * @see pcs.PcsPackage#getCloudBackup()
 * @model
 * @generated
 */
public interface CloudBackup extends DataService {
	/**
	 * Returns the value of the '<em><b>Cloudstorage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pcs.CloudStorage#getBackup_volumes_to_cbs <em>Backup volumes to cbs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloudstorage</em>' reference.
	 * @see #setCloudstorage(CloudStorage)
	 * @see pcs.PcsPackage#getCloudBackup_Cloudstorage()
	 * @see pcs.CloudStorage#getBackup_volumes_to_cbs
	 * @model opposite="backup_volumes_to_cbs" required="true"
	 * @generated
	 */
	CloudStorage getCloudstorage();

	/**
	 * Sets the value of the '{@link pcs.CloudBackup#getCloudstorage <em>Cloudstorage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloudstorage</em>' reference.
	 * @see #getCloudstorage()
	 * @generated
	 */
	void setCloudstorage(CloudStorage value);

} // CloudBackup
