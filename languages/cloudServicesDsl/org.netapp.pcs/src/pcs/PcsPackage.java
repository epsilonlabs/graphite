/**
 */
package pcs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pcs.PcsFactory
 * @model kind="package"
 * @generated
 */
public interface PcsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pcs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "pcs.netapp.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pcs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PcsPackage eINSTANCE = pcs.impl.PcsPackageImpl.init();

	/**
	 * The meta object id for the '{@link pcs.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcs.impl.NamedElementImpl
	 * @see pcs.impl.PcsPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__IDENTIFIER = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pcs.impl.DeploymentImpl <em>Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcs.impl.DeploymentImpl
	 * @see pcs.impl.PcsPackageImpl#getDeployment()
	 * @generated
	 */
	int DEPLOYMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__IDENTIFIER = NAMED_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__ENVIRONMENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Snapshot Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__SNAPSHOT_POLICY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__PCS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Awsconfiguration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__AWSCONFIGURATION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcs.impl.PCSImpl <em>PCS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcs.impl.PCSImpl
	 * @see pcs.impl.PcsPackageImpl#getPCS()
	 * @generated
	 */
	int PCS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCS__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCS__IDENTIFIER = NAMED_ELEMENT__IDENTIFIER;

	/**
	 * The number of structural features of the '<em>PCS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCS_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PCS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PCS_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcs.impl.CloudStorageImpl <em>Cloud Storage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcs.impl.CloudStorageImpl
	 * @see pcs.impl.PcsPackageImpl#getCloudStorage()
	 * @generated
	 */
	int CLOUD_STORAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STORAGE__NAME = PCS__NAME;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STORAGE__IDENTIFIER = PCS__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Backup volumes to cbs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STORAGE__BACKUP_VOLUMES_TO_CBS = PCS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacity tier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STORAGE__CAPACITY_TIER = PCS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cloud Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STORAGE_FEATURE_COUNT = PCS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Cloud Storage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_STORAGE_OPERATION_COUNT = PCS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcs.impl.DataServiceImpl <em>Data Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcs.impl.DataServiceImpl
	 * @see pcs.impl.PcsPackageImpl#getDataService()
	 * @generated
	 */
	int DATA_SERVICE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__NAME = PCS__NAME;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE__IDENTIFIER = PCS__IDENTIFIER;

	/**
	 * The number of structural features of the '<em>Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_FEATURE_COUNT = PCS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SERVICE_OPERATION_COUNT = PCS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcs.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcs.impl.EnvironmentImpl
	 * @see pcs.impl.PcsPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__IDENTIFIER = NAMED_ELEMENT__IDENTIFIER;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcs.impl.SnapshotPolicyImpl <em>Snapshot Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcs.impl.SnapshotPolicyImpl
	 * @see pcs.impl.PcsPackageImpl#getSnapshotPolicy()
	 * @generated
	 */
	int SNAPSHOT_POLICY = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOT_POLICY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOT_POLICY__IDENTIFIER = NAMED_ELEMENT__IDENTIFIER;

	/**
	 * The number of structural features of the '<em>Snapshot Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOT_POLICY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Snapshot Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAPSHOT_POLICY_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcs.impl.SnapMirrorImpl <em>Snap Mirror</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcs.impl.SnapMirrorImpl
	 * @see pcs.impl.PcsPackageImpl#getSnapMirror()
	 * @generated
	 */
	int SNAP_MIRROR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAP_MIRROR__NAME = DATA_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAP_MIRROR__IDENTIFIER = DATA_SERVICE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Source cvo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAP_MIRROR__SOURCE_CVO = DATA_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination cvo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAP_MIRROR__DESTINATION_CVO = DATA_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source volume</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAP_MIRROR__SOURCE_VOLUME = DATA_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Destination volume</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAP_MIRROR__DESTINATION_VOLUME = DATA_SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAP_MIRROR__POLICY = DATA_SERVICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max transfer rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAP_MIRROR__MAX_TRANSFER_RATE = DATA_SERVICE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAP_MIRROR__BIDIRECTIONAL = DATA_SERVICE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Snap Mirror</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAP_MIRROR_FEATURE_COUNT = DATA_SERVICE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Snap Mirror</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAP_MIRROR_OPERATION_COUNT = DATA_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcs.impl.ReplicationPolicyImpl <em>Replication Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcs.impl.ReplicationPolicyImpl
	 * @see pcs.impl.PcsPackageImpl#getReplicationPolicy()
	 * @generated
	 */
	int REPLICATION_POLICY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_POLICY__NAME = PCS__NAME;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_POLICY__IDENTIFIER = PCS__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Replication mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_POLICY__REPLICATION_MAPPINGS = PCS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Replication mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_POLICY__REPLICATION_MAPPING = PCS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Replication Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_POLICY_FEATURE_COUNT = PCS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Replication Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLICATION_POLICY_OPERATION_COUNT = PCS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcs.impl.CloudTieringImpl <em>Cloud Tiering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcs.impl.CloudTieringImpl
	 * @see pcs.impl.PcsPackageImpl#getCloudTiering()
	 * @generated
	 */
	int CLOUD_TIERING = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_TIERING__NAME = DATA_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_TIERING__IDENTIFIER = DATA_SERVICE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Cloudstorage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_TIERING__CLOUDSTORAGE = DATA_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cloud Tiering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_TIERING_FEATURE_COUNT = DATA_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cloud Tiering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_TIERING_OPERATION_COUNT = DATA_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcs.impl.CloudBackupImpl <em>Cloud Backup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcs.impl.CloudBackupImpl
	 * @see pcs.impl.PcsPackageImpl#getCloudBackup()
	 * @generated
	 */
	int CLOUD_BACKUP = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_BACKUP__NAME = DATA_SERVICE__NAME;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_BACKUP__IDENTIFIER = DATA_SERVICE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Cloudstorage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_BACKUP__CLOUDSTORAGE = DATA_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cloud Backup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_BACKUP_FEATURE_COUNT = DATA_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cloud Backup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_BACKUP_OPERATION_COUNT = DATA_SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcs.impl.CVOConfigurationImpl <em>CVO Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcs.impl.CVOConfigurationImpl
	 * @see pcs.impl.PcsPackageImpl#getCVOConfiguration()
	 * @generated
	 */
	int CVO_CONFIGURATION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVO_CONFIGURATION__NAME = CLOUD_STORAGE__NAME;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVO_CONFIGURATION__IDENTIFIER = CLOUD_STORAGE__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Backup volumes to cbs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVO_CONFIGURATION__BACKUP_VOLUMES_TO_CBS = CLOUD_STORAGE__BACKUP_VOLUMES_TO_CBS;

	/**
	 * The feature id for the '<em><b>Capacity tier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVO_CONFIGURATION__CAPACITY_TIER = CLOUD_STORAGE__CAPACITY_TIER;

	/**
	 * The number of structural features of the '<em>CVO Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVO_CONFIGURATION_FEATURE_COUNT = CLOUD_STORAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CVO Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVO_CONFIGURATION_OPERATION_COUNT = CLOUD_STORAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcs.impl.CVOImpl <em>CVO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcs.impl.CVOImpl
	 * @see pcs.impl.PcsPackageImpl#getCVO()
	 * @generated
	 */
	int CVO = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVO__NAME = CVO_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVO__IDENTIFIER = CVO_CONFIGURATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Backup volumes to cbs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVO__BACKUP_VOLUMES_TO_CBS = CVO_CONFIGURATION__BACKUP_VOLUMES_TO_CBS;

	/**
	 * The feature id for the '<em><b>Capacity tier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVO__CAPACITY_TIER = CVO_CONFIGURATION__CAPACITY_TIER;

	/**
	 * The feature id for the '<em><b>Awsnetworking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVO__AWSNETWORKING = CVO_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVO__VOLUMES = CVO_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVO__VOLUME = CVO_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>CVO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVO_FEATURE_COUNT = CVO_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>CVO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVO_OPERATION_COUNT = CVO_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcs.impl.CVO_HAImpl <em>CVO HA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcs.impl.CVO_HAImpl
	 * @see pcs.impl.PcsPackageImpl#getCVO_HA()
	 * @generated
	 */
	int CVO_HA = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVO_HA__NAME = CVO_CONFIGURATION__NAME;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVO_HA__IDENTIFIER = CVO_CONFIGURATION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Backup volumes to cbs</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVO_HA__BACKUP_VOLUMES_TO_CBS = CVO_CONFIGURATION__BACKUP_VOLUMES_TO_CBS;

	/**
	 * The feature id for the '<em><b>Capacity tier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVO_HA__CAPACITY_TIER = CVO_CONFIGURATION__CAPACITY_TIER;

	/**
	 * The feature id for the '<em><b>Awsnetworkingha</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVO_HA__AWSNETWORKINGHA = CVO_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>CVO HA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVO_HA_FEATURE_COUNT = CVO_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>CVO HA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CVO_HA_OPERATION_COUNT = CVO_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcs.impl.AWSConfigurationImpl <em>AWS Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcs.impl.AWSConfigurationImpl
	 * @see pcs.impl.PcsPackageImpl#getAWSConfiguration()
	 * @generated
	 */
	int AWS_CONFIGURATION = 15;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_CONFIGURATION__REGION = 0;

	/**
	 * The feature id for the '<em><b>Vpc id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_CONFIGURATION__VPC_ID = 1;

	/**
	 * The number of structural features of the '<em>AWS Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_CONFIGURATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>AWS Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pcs.impl.AWSNetworkingImpl <em>AWS Networking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcs.impl.AWSNetworkingImpl
	 * @see pcs.impl.PcsPackageImpl#getAWSNetworking()
	 * @generated
	 */
	int AWS_NETWORKING = 13;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_NETWORKING__REGION = AWS_CONFIGURATION__REGION;

	/**
	 * The feature id for the '<em><b>Vpc id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_NETWORKING__VPC_ID = AWS_CONFIGURATION__VPC_ID;

	/**
	 * The feature id for the '<em><b>Subnet id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_NETWORKING__SUBNET_ID = AWS_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cvo</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_NETWORKING__CVO = AWS_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>AWS Networking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_NETWORKING_FEATURE_COUNT = AWS_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>AWS Networking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_NETWORKING_OPERATION_COUNT = AWS_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcs.impl.AWSNetworkingHAImpl <em>AWS Networking HA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcs.impl.AWSNetworkingHAImpl
	 * @see pcs.impl.PcsPackageImpl#getAWSNetworkingHA()
	 * @generated
	 */
	int AWS_NETWORKING_HA = 14;

	/**
	 * The feature id for the '<em><b>Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_NETWORKING_HA__REGION = AWS_CONFIGURATION__REGION;

	/**
	 * The feature id for the '<em><b>Vpc id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_NETWORKING_HA__VPC_ID = AWS_CONFIGURATION__VPC_ID;

	/**
	 * The feature id for the '<em><b>Cvo ha</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_NETWORKING_HA__CVO_HA = AWS_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node1 subnet id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_NETWORKING_HA__NODE1_SUBNET_ID = AWS_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node2 subnet id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_NETWORKING_HA__NODE2_SUBNET_ID = AWS_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Failover mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_NETWORKING_HA__FAILOVER_MODE = AWS_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mediator subnet id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_NETWORKING_HA__MEDIATOR_SUBNET_ID = AWS_CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mediator key pair name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_NETWORKING_HA__MEDIATOR_KEY_PAIR_NAME = AWS_CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cluster floating ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_NETWORKING_HA__CLUSTER_FLOATING_IP = AWS_CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Data floating ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_NETWORKING_HA__DATA_FLOATING_IP = AWS_CONFIGURATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Data floating ip2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_NETWORKING_HA__DATA_FLOATING_IP2 = AWS_CONFIGURATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Svm floating ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_NETWORKING_HA__SVM_FLOATING_IP = AWS_CONFIGURATION_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>AWS Networking HA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_NETWORKING_HA_FEATURE_COUNT = AWS_CONFIGURATION_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>AWS Networking HA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWS_NETWORKING_HA_OPERATION_COUNT = AWS_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pcs.impl.VolumeImpl <em>Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pcs.impl.VolumeImpl
	 * @see pcs.impl.PcsPackageImpl#getVolume()
	 * @generated
	 */
	int VOLUME = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__IDENTIFIER = NAMED_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__ENVIRONMENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Snapshot policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__SNAPSHOT_POLICY = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__STATE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__SIZE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Size unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__SIZE_UNIT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Svm name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__SVM_NAME = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Export policy type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__EXPORT_POLICY_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Export policy ip</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__EXPORT_POLICY_IP = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Export policy nfs version</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__EXPORT_POLICY_NFS_VERSION = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__MULTIPLICITY = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link pcs.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment</em>'.
	 * @see pcs.Deployment
	 * @generated
	 */
	EClass getDeployment();

	/**
	 * Returns the meta object for the containment reference '{@link pcs.Deployment#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment</em>'.
	 * @see pcs.Deployment#getEnvironment()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Environment();

	/**
	 * Returns the meta object for the containment reference '{@link pcs.Deployment#getSnapshotPolicy <em>Snapshot Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Snapshot Policy</em>'.
	 * @see pcs.Deployment#getSnapshotPolicy()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_SnapshotPolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link pcs.Deployment#getPcs <em>Pcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pcs</em>'.
	 * @see pcs.Deployment#getPcs()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Pcs();

	/**
	 * Returns the meta object for the containment reference list '{@link pcs.Deployment#getAwsconfiguration <em>Awsconfiguration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Awsconfiguration</em>'.
	 * @see pcs.Deployment#getAwsconfiguration()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Awsconfiguration();

	/**
	 * Returns the meta object for class '{@link pcs.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see pcs.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link pcs.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pcs.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link pcs.NamedElement#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see pcs.NamedElement#getIdentifier()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Identifier();

	/**
	 * Returns the meta object for class '{@link pcs.PCS <em>PCS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PCS</em>'.
	 * @see pcs.PCS
	 * @generated
	 */
	EClass getPCS();

	/**
	 * Returns the meta object for class '{@link pcs.CloudStorage <em>Cloud Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Storage</em>'.
	 * @see pcs.CloudStorage
	 * @generated
	 */
	EClass getCloudStorage();

	/**
	 * Returns the meta object for the reference '{@link pcs.CloudStorage#getBackup_volumes_to_cbs <em>Backup volumes to cbs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Backup volumes to cbs</em>'.
	 * @see pcs.CloudStorage#getBackup_volumes_to_cbs()
	 * @see #getCloudStorage()
	 * @generated
	 */
	EReference getCloudStorage_Backup_volumes_to_cbs();

	/**
	 * Returns the meta object for the reference '{@link pcs.CloudStorage#getCapacity_tier <em>Capacity tier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capacity tier</em>'.
	 * @see pcs.CloudStorage#getCapacity_tier()
	 * @see #getCloudStorage()
	 * @generated
	 */
	EReference getCloudStorage_Capacity_tier();

	/**
	 * Returns the meta object for class '{@link pcs.DataService <em>Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Service</em>'.
	 * @see pcs.DataService
	 * @generated
	 */
	EClass getDataService();

	/**
	 * Returns the meta object for class '{@link pcs.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see pcs.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for class '{@link pcs.SnapshotPolicy <em>Snapshot Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Snapshot Policy</em>'.
	 * @see pcs.SnapshotPolicy
	 * @generated
	 */
	EClass getSnapshotPolicy();

	/**
	 * Returns the meta object for class '{@link pcs.SnapMirror <em>Snap Mirror</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Snap Mirror</em>'.
	 * @see pcs.SnapMirror
	 * @generated
	 */
	EClass getSnapMirror();

	/**
	 * Returns the meta object for the reference '{@link pcs.SnapMirror#getSource_cvo <em>Source cvo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source cvo</em>'.
	 * @see pcs.SnapMirror#getSource_cvo()
	 * @see #getSnapMirror()
	 * @generated
	 */
	EReference getSnapMirror_Source_cvo();

	/**
	 * Returns the meta object for the reference '{@link pcs.SnapMirror#getDestination_cvo <em>Destination cvo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination cvo</em>'.
	 * @see pcs.SnapMirror#getDestination_cvo()
	 * @see #getSnapMirror()
	 * @generated
	 */
	EReference getSnapMirror_Destination_cvo();

	/**
	 * Returns the meta object for the reference '{@link pcs.SnapMirror#getSource_volume <em>Source volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source volume</em>'.
	 * @see pcs.SnapMirror#getSource_volume()
	 * @see #getSnapMirror()
	 * @generated
	 */
	EReference getSnapMirror_Source_volume();

	/**
	 * Returns the meta object for the reference '{@link pcs.SnapMirror#getDestination_volume <em>Destination volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination volume</em>'.
	 * @see pcs.SnapMirror#getDestination_volume()
	 * @see #getSnapMirror()
	 * @generated
	 */
	EReference getSnapMirror_Destination_volume();

	/**
	 * Returns the meta object for the reference '{@link pcs.SnapMirror#getPolicy <em>Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Policy</em>'.
	 * @see pcs.SnapMirror#getPolicy()
	 * @see #getSnapMirror()
	 * @generated
	 */
	EReference getSnapMirror_Policy();

	/**
	 * Returns the meta object for the attribute '{@link pcs.SnapMirror#getMax_transfer_rate <em>Max transfer rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max transfer rate</em>'.
	 * @see pcs.SnapMirror#getMax_transfer_rate()
	 * @see #getSnapMirror()
	 * @generated
	 */
	EAttribute getSnapMirror_Max_transfer_rate();

	/**
	 * Returns the meta object for the attribute '{@link pcs.SnapMirror#isBidirectional <em>Bidirectional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bidirectional</em>'.
	 * @see pcs.SnapMirror#isBidirectional()
	 * @see #getSnapMirror()
	 * @generated
	 */
	EAttribute getSnapMirror_Bidirectional();

	/**
	 * Returns the meta object for class '{@link pcs.ReplicationPolicy <em>Replication Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replication Policy</em>'.
	 * @see pcs.ReplicationPolicy
	 * @generated
	 */
	EClass getReplicationPolicy();

	/**
	 * Returns the meta object for the containment reference list '{@link pcs.ReplicationPolicy#getReplication_mappings <em>Replication mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Replication mappings</em>'.
	 * @see pcs.ReplicationPolicy#getReplication_mappings()
	 * @see #getReplicationPolicy()
	 * @generated
	 */
	EReference getReplicationPolicy_Replication_mappings();

	/**
	 * Returns the meta object for the attribute '{@link pcs.ReplicationPolicy#getReplication_mapping <em>Replication mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replication mapping</em>'.
	 * @see pcs.ReplicationPolicy#getReplication_mapping()
	 * @see #getReplicationPolicy()
	 * @generated
	 */
	EAttribute getReplicationPolicy_Replication_mapping();

	/**
	 * Returns the meta object for class '{@link pcs.CloudTiering <em>Cloud Tiering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Tiering</em>'.
	 * @see pcs.CloudTiering
	 * @generated
	 */
	EClass getCloudTiering();

	/**
	 * Returns the meta object for the reference '{@link pcs.CloudTiering#getCloudstorage <em>Cloudstorage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cloudstorage</em>'.
	 * @see pcs.CloudTiering#getCloudstorage()
	 * @see #getCloudTiering()
	 * @generated
	 */
	EReference getCloudTiering_Cloudstorage();

	/**
	 * Returns the meta object for class '{@link pcs.CloudBackup <em>Cloud Backup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Backup</em>'.
	 * @see pcs.CloudBackup
	 * @generated
	 */
	EClass getCloudBackup();

	/**
	 * Returns the meta object for the reference '{@link pcs.CloudBackup#getCloudstorage <em>Cloudstorage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cloudstorage</em>'.
	 * @see pcs.CloudBackup#getCloudstorage()
	 * @see #getCloudBackup()
	 * @generated
	 */
	EReference getCloudBackup_Cloudstorage();

	/**
	 * Returns the meta object for class '{@link pcs.CVO <em>CVO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CVO</em>'.
	 * @see pcs.CVO
	 * @generated
	 */
	EClass getCVO();

	/**
	 * Returns the meta object for the reference '{@link pcs.CVO#getAwsnetworking <em>Awsnetworking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Awsnetworking</em>'.
	 * @see pcs.CVO#getAwsnetworking()
	 * @see #getCVO()
	 * @generated
	 */
	EReference getCVO_Awsnetworking();

	/**
	 * Returns the meta object for the containment reference list '{@link pcs.CVO#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Volumes</em>'.
	 * @see pcs.CVO#getVolumes()
	 * @see #getCVO()
	 * @generated
	 */
	EReference getCVO_Volumes();

	/**
	 * Returns the meta object for the attribute '{@link pcs.CVO#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see pcs.CVO#getVolume()
	 * @see #getCVO()
	 * @generated
	 */
	EAttribute getCVO_Volume();

	/**
	 * Returns the meta object for class '{@link pcs.CVO_HA <em>CVO HA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CVO HA</em>'.
	 * @see pcs.CVO_HA
	 * @generated
	 */
	EClass getCVO_HA();

	/**
	 * Returns the meta object for the reference '{@link pcs.CVO_HA#getAwsnetworkingha <em>Awsnetworkingha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Awsnetworkingha</em>'.
	 * @see pcs.CVO_HA#getAwsnetworkingha()
	 * @see #getCVO_HA()
	 * @generated
	 */
	EReference getCVO_HA_Awsnetworkingha();

	/**
	 * Returns the meta object for class '{@link pcs.AWSNetworking <em>AWS Networking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AWS Networking</em>'.
	 * @see pcs.AWSNetworking
	 * @generated
	 */
	EClass getAWSNetworking();

	/**
	 * Returns the meta object for the attribute '{@link pcs.AWSNetworking#getSubnet_id <em>Subnet id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet id</em>'.
	 * @see pcs.AWSNetworking#getSubnet_id()
	 * @see #getAWSNetworking()
	 * @generated
	 */
	EAttribute getAWSNetworking_Subnet_id();

	/**
	 * Returns the meta object for the reference list '{@link pcs.AWSNetworking#getCvo <em>Cvo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cvo</em>'.
	 * @see pcs.AWSNetworking#getCvo()
	 * @see #getAWSNetworking()
	 * @generated
	 */
	EReference getAWSNetworking_Cvo();

	/**
	 * Returns the meta object for class '{@link pcs.AWSNetworkingHA <em>AWS Networking HA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AWS Networking HA</em>'.
	 * @see pcs.AWSNetworkingHA
	 * @generated
	 */
	EClass getAWSNetworkingHA();

	/**
	 * Returns the meta object for the reference list '{@link pcs.AWSNetworkingHA#getCvo_ha <em>Cvo ha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cvo ha</em>'.
	 * @see pcs.AWSNetworkingHA#getCvo_ha()
	 * @see #getAWSNetworkingHA()
	 * @generated
	 */
	EReference getAWSNetworkingHA_Cvo_ha();

	/**
	 * Returns the meta object for the attribute '{@link pcs.AWSNetworkingHA#getNode1_subnet_id <em>Node1 subnet id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node1 subnet id</em>'.
	 * @see pcs.AWSNetworkingHA#getNode1_subnet_id()
	 * @see #getAWSNetworkingHA()
	 * @generated
	 */
	EAttribute getAWSNetworkingHA_Node1_subnet_id();

	/**
	 * Returns the meta object for the attribute '{@link pcs.AWSNetworkingHA#getNode2_subnet_id <em>Node2 subnet id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node2 subnet id</em>'.
	 * @see pcs.AWSNetworkingHA#getNode2_subnet_id()
	 * @see #getAWSNetworkingHA()
	 * @generated
	 */
	EAttribute getAWSNetworkingHA_Node2_subnet_id();

	/**
	 * Returns the meta object for the attribute '{@link pcs.AWSNetworkingHA#getFailover_mode <em>Failover mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failover mode</em>'.
	 * @see pcs.AWSNetworkingHA#getFailover_mode()
	 * @see #getAWSNetworkingHA()
	 * @generated
	 */
	EAttribute getAWSNetworkingHA_Failover_mode();

	/**
	 * Returns the meta object for the attribute '{@link pcs.AWSNetworkingHA#getMediator_subnet_id <em>Mediator subnet id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mediator subnet id</em>'.
	 * @see pcs.AWSNetworkingHA#getMediator_subnet_id()
	 * @see #getAWSNetworkingHA()
	 * @generated
	 */
	EAttribute getAWSNetworkingHA_Mediator_subnet_id();

	/**
	 * Returns the meta object for the attribute '{@link pcs.AWSNetworkingHA#getMediator_key_pair_name <em>Mediator key pair name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mediator key pair name</em>'.
	 * @see pcs.AWSNetworkingHA#getMediator_key_pair_name()
	 * @see #getAWSNetworkingHA()
	 * @generated
	 */
	EAttribute getAWSNetworkingHA_Mediator_key_pair_name();

	/**
	 * Returns the meta object for the attribute '{@link pcs.AWSNetworkingHA#getCluster_floating_ip <em>Cluster floating ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cluster floating ip</em>'.
	 * @see pcs.AWSNetworkingHA#getCluster_floating_ip()
	 * @see #getAWSNetworkingHA()
	 * @generated
	 */
	EAttribute getAWSNetworkingHA_Cluster_floating_ip();

	/**
	 * Returns the meta object for the attribute '{@link pcs.AWSNetworkingHA#getData_floating_ip <em>Data floating ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data floating ip</em>'.
	 * @see pcs.AWSNetworkingHA#getData_floating_ip()
	 * @see #getAWSNetworkingHA()
	 * @generated
	 */
	EAttribute getAWSNetworkingHA_Data_floating_ip();

	/**
	 * Returns the meta object for the attribute '{@link pcs.AWSNetworkingHA#getData_floating_ip2 <em>Data floating ip2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data floating ip2</em>'.
	 * @see pcs.AWSNetworkingHA#getData_floating_ip2()
	 * @see #getAWSNetworkingHA()
	 * @generated
	 */
	EAttribute getAWSNetworkingHA_Data_floating_ip2();

	/**
	 * Returns the meta object for the attribute '{@link pcs.AWSNetworkingHA#getSvm_floating_ip <em>Svm floating ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Svm floating ip</em>'.
	 * @see pcs.AWSNetworkingHA#getSvm_floating_ip()
	 * @see #getAWSNetworkingHA()
	 * @generated
	 */
	EAttribute getAWSNetworkingHA_Svm_floating_ip();

	/**
	 * Returns the meta object for class '{@link pcs.AWSConfiguration <em>AWS Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AWS Configuration</em>'.
	 * @see pcs.AWSConfiguration
	 * @generated
	 */
	EClass getAWSConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link pcs.AWSConfiguration#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region</em>'.
	 * @see pcs.AWSConfiguration#getRegion()
	 * @see #getAWSConfiguration()
	 * @generated
	 */
	EAttribute getAWSConfiguration_Region();

	/**
	 * Returns the meta object for the attribute '{@link pcs.AWSConfiguration#getVpc_id <em>Vpc id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vpc id</em>'.
	 * @see pcs.AWSConfiguration#getVpc_id()
	 * @see #getAWSConfiguration()
	 * @generated
	 */
	EAttribute getAWSConfiguration_Vpc_id();

	/**
	 * Returns the meta object for class '{@link pcs.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume</em>'.
	 * @see pcs.Volume
	 * @generated
	 */
	EClass getVolume();

	/**
	 * Returns the meta object for the reference '{@link pcs.Volume#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Environment</em>'.
	 * @see pcs.Volume#getEnvironment()
	 * @see #getVolume()
	 * @generated
	 */
	EReference getVolume_Environment();

	/**
	 * Returns the meta object for the reference '{@link pcs.Volume#getSnapshot_policy <em>Snapshot policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Snapshot policy</em>'.
	 * @see pcs.Volume#getSnapshot_policy()
	 * @see #getVolume()
	 * @generated
	 */
	EReference getVolume_Snapshot_policy();

	/**
	 * Returns the meta object for the attribute '{@link pcs.Volume#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see pcs.Volume#getState()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_State();

	/**
	 * Returns the meta object for the attribute '{@link pcs.Volume#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see pcs.Volume#getSize()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Size();

	/**
	 * Returns the meta object for the attribute '{@link pcs.Volume#getSize_unit <em>Size unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size unit</em>'.
	 * @see pcs.Volume#getSize_unit()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Size_unit();

	/**
	 * Returns the meta object for the attribute '{@link pcs.Volume#getSvm_name <em>Svm name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Svm name</em>'.
	 * @see pcs.Volume#getSvm_name()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Svm_name();

	/**
	 * Returns the meta object for the attribute '{@link pcs.Volume#getExport_policy_type <em>Export policy type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Export policy type</em>'.
	 * @see pcs.Volume#getExport_policy_type()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Export_policy_type();

	/**
	 * Returns the meta object for the attribute list '{@link pcs.Volume#getExport_policy_ip <em>Export policy ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Export policy ip</em>'.
	 * @see pcs.Volume#getExport_policy_ip()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Export_policy_ip();

	/**
	 * Returns the meta object for the attribute list '{@link pcs.Volume#getExport_policy_nfs_version <em>Export policy nfs version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Export policy nfs version</em>'.
	 * @see pcs.Volume#getExport_policy_nfs_version()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Export_policy_nfs_version();

	/**
	 * Returns the meta object for the attribute '{@link pcs.Volume#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see pcs.Volume#getMultiplicity()
	 * @see #getVolume()
	 * @generated
	 */
	EAttribute getVolume_Multiplicity();

	/**
	 * Returns the meta object for class '{@link pcs.CVOConfiguration <em>CVO Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CVO Configuration</em>'.
	 * @see pcs.CVOConfiguration
	 * @generated
	 */
	EClass getCVOConfiguration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PcsFactory getPcsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pcs.impl.DeploymentImpl <em>Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcs.impl.DeploymentImpl
		 * @see pcs.impl.PcsPackageImpl#getDeployment()
		 * @generated
		 */
		EClass DEPLOYMENT = eINSTANCE.getDeployment();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__ENVIRONMENT = eINSTANCE.getDeployment_Environment();

		/**
		 * The meta object literal for the '<em><b>Snapshot Policy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__SNAPSHOT_POLICY = eINSTANCE.getDeployment_SnapshotPolicy();

		/**
		 * The meta object literal for the '<em><b>Pcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__PCS = eINSTANCE.getDeployment_Pcs();

		/**
		 * The meta object literal for the '<em><b>Awsconfiguration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__AWSCONFIGURATION = eINSTANCE.getDeployment_Awsconfiguration();

		/**
		 * The meta object literal for the '{@link pcs.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcs.impl.NamedElementImpl
		 * @see pcs.impl.PcsPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__IDENTIFIER = eINSTANCE.getNamedElement_Identifier();

		/**
		 * The meta object literal for the '{@link pcs.impl.PCSImpl <em>PCS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcs.impl.PCSImpl
		 * @see pcs.impl.PcsPackageImpl#getPCS()
		 * @generated
		 */
		EClass PCS = eINSTANCE.getPCS();

		/**
		 * The meta object literal for the '{@link pcs.impl.CloudStorageImpl <em>Cloud Storage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcs.impl.CloudStorageImpl
		 * @see pcs.impl.PcsPackageImpl#getCloudStorage()
		 * @generated
		 */
		EClass CLOUD_STORAGE = eINSTANCE.getCloudStorage();

		/**
		 * The meta object literal for the '<em><b>Backup volumes to cbs</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_STORAGE__BACKUP_VOLUMES_TO_CBS = eINSTANCE.getCloudStorage_Backup_volumes_to_cbs();

		/**
		 * The meta object literal for the '<em><b>Capacity tier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_STORAGE__CAPACITY_TIER = eINSTANCE.getCloudStorage_Capacity_tier();

		/**
		 * The meta object literal for the '{@link pcs.impl.DataServiceImpl <em>Data Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcs.impl.DataServiceImpl
		 * @see pcs.impl.PcsPackageImpl#getDataService()
		 * @generated
		 */
		EClass DATA_SERVICE = eINSTANCE.getDataService();

		/**
		 * The meta object literal for the '{@link pcs.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcs.impl.EnvironmentImpl
		 * @see pcs.impl.PcsPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '{@link pcs.impl.SnapshotPolicyImpl <em>Snapshot Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcs.impl.SnapshotPolicyImpl
		 * @see pcs.impl.PcsPackageImpl#getSnapshotPolicy()
		 * @generated
		 */
		EClass SNAPSHOT_POLICY = eINSTANCE.getSnapshotPolicy();

		/**
		 * The meta object literal for the '{@link pcs.impl.SnapMirrorImpl <em>Snap Mirror</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcs.impl.SnapMirrorImpl
		 * @see pcs.impl.PcsPackageImpl#getSnapMirror()
		 * @generated
		 */
		EClass SNAP_MIRROR = eINSTANCE.getSnapMirror();

		/**
		 * The meta object literal for the '<em><b>Source cvo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SNAP_MIRROR__SOURCE_CVO = eINSTANCE.getSnapMirror_Source_cvo();

		/**
		 * The meta object literal for the '<em><b>Destination cvo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SNAP_MIRROR__DESTINATION_CVO = eINSTANCE.getSnapMirror_Destination_cvo();

		/**
		 * The meta object literal for the '<em><b>Source volume</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SNAP_MIRROR__SOURCE_VOLUME = eINSTANCE.getSnapMirror_Source_volume();

		/**
		 * The meta object literal for the '<em><b>Destination volume</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SNAP_MIRROR__DESTINATION_VOLUME = eINSTANCE.getSnapMirror_Destination_volume();

		/**
		 * The meta object literal for the '<em><b>Policy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SNAP_MIRROR__POLICY = eINSTANCE.getSnapMirror_Policy();

		/**
		 * The meta object literal for the '<em><b>Max transfer rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SNAP_MIRROR__MAX_TRANSFER_RATE = eINSTANCE.getSnapMirror_Max_transfer_rate();

		/**
		 * The meta object literal for the '<em><b>Bidirectional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SNAP_MIRROR__BIDIRECTIONAL = eINSTANCE.getSnapMirror_Bidirectional();

		/**
		 * The meta object literal for the '{@link pcs.impl.ReplicationPolicyImpl <em>Replication Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcs.impl.ReplicationPolicyImpl
		 * @see pcs.impl.PcsPackageImpl#getReplicationPolicy()
		 * @generated
		 */
		EClass REPLICATION_POLICY = eINSTANCE.getReplicationPolicy();

		/**
		 * The meta object literal for the '<em><b>Replication mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLICATION_POLICY__REPLICATION_MAPPINGS = eINSTANCE.getReplicationPolicy_Replication_mappings();

		/**
		 * The meta object literal for the '<em><b>Replication mapping</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLICATION_POLICY__REPLICATION_MAPPING = eINSTANCE.getReplicationPolicy_Replication_mapping();

		/**
		 * The meta object literal for the '{@link pcs.impl.CloudTieringImpl <em>Cloud Tiering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcs.impl.CloudTieringImpl
		 * @see pcs.impl.PcsPackageImpl#getCloudTiering()
		 * @generated
		 */
		EClass CLOUD_TIERING = eINSTANCE.getCloudTiering();

		/**
		 * The meta object literal for the '<em><b>Cloudstorage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_TIERING__CLOUDSTORAGE = eINSTANCE.getCloudTiering_Cloudstorage();

		/**
		 * The meta object literal for the '{@link pcs.impl.CloudBackupImpl <em>Cloud Backup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcs.impl.CloudBackupImpl
		 * @see pcs.impl.PcsPackageImpl#getCloudBackup()
		 * @generated
		 */
		EClass CLOUD_BACKUP = eINSTANCE.getCloudBackup();

		/**
		 * The meta object literal for the '<em><b>Cloudstorage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_BACKUP__CLOUDSTORAGE = eINSTANCE.getCloudBackup_Cloudstorage();

		/**
		 * The meta object literal for the '{@link pcs.impl.CVOImpl <em>CVO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcs.impl.CVOImpl
		 * @see pcs.impl.PcsPackageImpl#getCVO()
		 * @generated
		 */
		EClass CVO = eINSTANCE.getCVO();

		/**
		 * The meta object literal for the '<em><b>Awsnetworking</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CVO__AWSNETWORKING = eINSTANCE.getCVO_Awsnetworking();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CVO__VOLUMES = eINSTANCE.getCVO_Volumes();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CVO__VOLUME = eINSTANCE.getCVO_Volume();

		/**
		 * The meta object literal for the '{@link pcs.impl.CVO_HAImpl <em>CVO HA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcs.impl.CVO_HAImpl
		 * @see pcs.impl.PcsPackageImpl#getCVO_HA()
		 * @generated
		 */
		EClass CVO_HA = eINSTANCE.getCVO_HA();

		/**
		 * The meta object literal for the '<em><b>Awsnetworkingha</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CVO_HA__AWSNETWORKINGHA = eINSTANCE.getCVO_HA_Awsnetworkingha();

		/**
		 * The meta object literal for the '{@link pcs.impl.AWSNetworkingImpl <em>AWS Networking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcs.impl.AWSNetworkingImpl
		 * @see pcs.impl.PcsPackageImpl#getAWSNetworking()
		 * @generated
		 */
		EClass AWS_NETWORKING = eINSTANCE.getAWSNetworking();

		/**
		 * The meta object literal for the '<em><b>Subnet id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWS_NETWORKING__SUBNET_ID = eINSTANCE.getAWSNetworking_Subnet_id();

		/**
		 * The meta object literal for the '<em><b>Cvo</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWS_NETWORKING__CVO = eINSTANCE.getAWSNetworking_Cvo();

		/**
		 * The meta object literal for the '{@link pcs.impl.AWSNetworkingHAImpl <em>AWS Networking HA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcs.impl.AWSNetworkingHAImpl
		 * @see pcs.impl.PcsPackageImpl#getAWSNetworkingHA()
		 * @generated
		 */
		EClass AWS_NETWORKING_HA = eINSTANCE.getAWSNetworkingHA();

		/**
		 * The meta object literal for the '<em><b>Cvo ha</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWS_NETWORKING_HA__CVO_HA = eINSTANCE.getAWSNetworkingHA_Cvo_ha();

		/**
		 * The meta object literal for the '<em><b>Node1 subnet id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWS_NETWORKING_HA__NODE1_SUBNET_ID = eINSTANCE.getAWSNetworkingHA_Node1_subnet_id();

		/**
		 * The meta object literal for the '<em><b>Node2 subnet id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWS_NETWORKING_HA__NODE2_SUBNET_ID = eINSTANCE.getAWSNetworkingHA_Node2_subnet_id();

		/**
		 * The meta object literal for the '<em><b>Failover mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWS_NETWORKING_HA__FAILOVER_MODE = eINSTANCE.getAWSNetworkingHA_Failover_mode();

		/**
		 * The meta object literal for the '<em><b>Mediator subnet id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWS_NETWORKING_HA__MEDIATOR_SUBNET_ID = eINSTANCE.getAWSNetworkingHA_Mediator_subnet_id();

		/**
		 * The meta object literal for the '<em><b>Mediator key pair name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWS_NETWORKING_HA__MEDIATOR_KEY_PAIR_NAME = eINSTANCE.getAWSNetworkingHA_Mediator_key_pair_name();

		/**
		 * The meta object literal for the '<em><b>Cluster floating ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWS_NETWORKING_HA__CLUSTER_FLOATING_IP = eINSTANCE.getAWSNetworkingHA_Cluster_floating_ip();

		/**
		 * The meta object literal for the '<em><b>Data floating ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWS_NETWORKING_HA__DATA_FLOATING_IP = eINSTANCE.getAWSNetworkingHA_Data_floating_ip();

		/**
		 * The meta object literal for the '<em><b>Data floating ip2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWS_NETWORKING_HA__DATA_FLOATING_IP2 = eINSTANCE.getAWSNetworkingHA_Data_floating_ip2();

		/**
		 * The meta object literal for the '<em><b>Svm floating ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWS_NETWORKING_HA__SVM_FLOATING_IP = eINSTANCE.getAWSNetworkingHA_Svm_floating_ip();

		/**
		 * The meta object literal for the '{@link pcs.impl.AWSConfigurationImpl <em>AWS Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcs.impl.AWSConfigurationImpl
		 * @see pcs.impl.PcsPackageImpl#getAWSConfiguration()
		 * @generated
		 */
		EClass AWS_CONFIGURATION = eINSTANCE.getAWSConfiguration();

		/**
		 * The meta object literal for the '<em><b>Region</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWS_CONFIGURATION__REGION = eINSTANCE.getAWSConfiguration_Region();

		/**
		 * The meta object literal for the '<em><b>Vpc id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWS_CONFIGURATION__VPC_ID = eINSTANCE.getAWSConfiguration_Vpc_id();

		/**
		 * The meta object literal for the '{@link pcs.impl.VolumeImpl <em>Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcs.impl.VolumeImpl
		 * @see pcs.impl.PcsPackageImpl#getVolume()
		 * @generated
		 */
		EClass VOLUME = eINSTANCE.getVolume();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLUME__ENVIRONMENT = eINSTANCE.getVolume_Environment();

		/**
		 * The meta object literal for the '<em><b>Snapshot policy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLUME__SNAPSHOT_POLICY = eINSTANCE.getVolume_Snapshot_policy();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__STATE = eINSTANCE.getVolume_State();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__SIZE = eINSTANCE.getVolume_Size();

		/**
		 * The meta object literal for the '<em><b>Size unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__SIZE_UNIT = eINSTANCE.getVolume_Size_unit();

		/**
		 * The meta object literal for the '<em><b>Svm name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__SVM_NAME = eINSTANCE.getVolume_Svm_name();

		/**
		 * The meta object literal for the '<em><b>Export policy type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__EXPORT_POLICY_TYPE = eINSTANCE.getVolume_Export_policy_type();

		/**
		 * The meta object literal for the '<em><b>Export policy ip</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__EXPORT_POLICY_IP = eINSTANCE.getVolume_Export_policy_ip();

		/**
		 * The meta object literal for the '<em><b>Export policy nfs version</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__EXPORT_POLICY_NFS_VERSION = eINSTANCE.getVolume_Export_policy_nfs_version();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME__MULTIPLICITY = eINSTANCE.getVolume_Multiplicity();

		/**
		 * The meta object literal for the '{@link pcs.impl.CVOConfigurationImpl <em>CVO Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pcs.impl.CVOConfigurationImpl
		 * @see pcs.impl.PcsPackageImpl#getCVOConfiguration()
		 * @generated
		 */
		EClass CVO_CONFIGURATION = eINSTANCE.getCVOConfiguration();

	}

} //PcsPackage
