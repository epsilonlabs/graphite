/**
 */
package pcs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pcs.PcsPackage
 * @generated
 */
public interface PcsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated NOT
	*/
	PcsFactory eINSTANCE = pcs.impl.XtextPcsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment</em>'.
	 * @generated
	 */
	Deployment createDeployment();

	/**
	 * Returns a new object of class '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment</em>'.
	 * @generated
	 */
	Environment createEnvironment();

	/**
	 * Returns a new object of class '<em>Snapshot Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Snapshot Policy</em>'.
	 * @generated
	 */
	SnapshotPolicy createSnapshotPolicy();

	/**
	 * Returns a new object of class '<em>Snap Mirror</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Snap Mirror</em>'.
	 * @generated
	 */
	SnapMirror createSnapMirror();

	/**
	 * Returns a new object of class '<em>Replication Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Replication Policy</em>'.
	 * @generated
	 */
	ReplicationPolicy createReplicationPolicy();

	/**
	 * Returns a new object of class '<em>Cloud Tiering</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Tiering</em>'.
	 * @generated
	 */
	CloudTiering createCloudTiering();

	/**
	 * Returns a new object of class '<em>Cloud Backup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Backup</em>'.
	 * @generated
	 */
	CloudBackup createCloudBackup();

	/**
	 * Returns a new object of class '<em>CVO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CVO</em>'.
	 * @generated
	 */
	CVO createCVO();

	/**
	 * Returns a new object of class '<em>CVO HA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CVO HA</em>'.
	 * @generated
	 */
	CVO_HA createCVO_HA();

	/**
	 * Returns a new object of class '<em>AWS Networking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AWS Networking</em>'.
	 * @generated
	 */
	AWSNetworking createAWSNetworking();

	/**
	 * Returns a new object of class '<em>AWS Networking HA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AWS Networking HA</em>'.
	 * @generated
	 */
	AWSNetworkingHA createAWSNetworkingHA();

	/**
	 * Returns a new object of class '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volume</em>'.
	 * @generated
	 */
	Volume createVolume();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PcsPackage getPcsPackage();

} //PcsFactory (Patched)