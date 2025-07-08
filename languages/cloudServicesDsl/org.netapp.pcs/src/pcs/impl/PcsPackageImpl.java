/**
 */
package pcs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import pcs.AWSConfiguration;
import pcs.AWSNetworking;
import pcs.AWSNetworkingHA;
import pcs.CVOConfiguration;
import pcs.CloudBackup;
import pcs.CloudStorage;
import pcs.CloudTiering;
import pcs.DataService;
import pcs.Deployment;
import pcs.Environment;
import pcs.NamedElement;
import pcs.PcsFactory;
import pcs.PcsPackage;
import pcs.ReplicationPolicy;
import pcs.SnapMirror;
import pcs.SnapshotPolicy;
import pcs.Volume;

import graphite.shared.ModelData;
import graphite.shared.WorkbenchData;

/**
* <!-- begin-user-doc -->
* An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PcsPackageImpl extends EPackageImpl implements PcsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pcsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudStorageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass snapshotPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass snapMirrorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replicationPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudTieringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudBackupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cvoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cvO_HAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awsNetworkingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awsNetworkingHAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awsConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cvoConfigurationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see pcs.PcsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PcsPackageImpl() {
		super(eNS_URI, PcsFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PcsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated NOT
	 */
	public static PcsPackage init() {
		if (isInited) return (PcsPackage)EPackage.Registry.INSTANCE.getEPackage(PcsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPcsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PcsPackageImpl thePcsPackage = registeredPcsPackage instanceof PcsPackageImpl ? (PcsPackageImpl)registeredPcsPackage : new PcsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePcsPackage.createPackageContents();

		// Initialize created meta-data
		thePcsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePcsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PcsPackage.eNS_URI, thePcsPackage);

		ModelData modelData = new ModelData(PropertiesData.derivedPropertiesData, PropertiesData.derivedPairsMappings, PropertiesData.identifierAttributeByType, PropertiesData.resolvers);
		WorkbenchData.setModelData(modelData);

		return thePcsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployment() {
		return deploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_Environment() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_SnapshotPolicy() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_Pcs() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_Awsconfiguration() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Identifier() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPCS() {
		return pcsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudStorage() {
		return cloudStorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudStorage_Backup_volumes_to_cbs() {
		return (EReference)cloudStorageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudStorage_Capacity_tier() {
		return (EReference)cloudStorageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataService() {
		return dataServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironment() {
		return environmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSnapshotPolicy() {
		return snapshotPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSnapMirror() {
		return snapMirrorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSnapMirror_Source_cvo() {
		return (EReference)snapMirrorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSnapMirror_Destination_cvo() {
		return (EReference)snapMirrorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSnapMirror_Source_volume() {
		return (EReference)snapMirrorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSnapMirror_Destination_volume() {
		return (EReference)snapMirrorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSnapMirror_Policy() {
		return (EReference)snapMirrorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSnapMirror_Max_transfer_rate() {
		return (EAttribute)snapMirrorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSnapMirror_Bidirectional() {
		return (EAttribute)snapMirrorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplicationPolicy() {
		return replicationPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplicationPolicy_Replication_mappings() {
		return (EReference)replicationPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplicationPolicy_Replication_mapping() {
		return (EAttribute)replicationPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudTiering() {
		return cloudTieringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudTiering_Cloudstorage() {
		return (EReference)cloudTieringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudBackup() {
		return cloudBackupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudBackup_Cloudstorage() {
		return (EReference)cloudBackupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCVO() {
		return cvoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCVO_Awsnetworking() {
		return (EReference)cvoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCVO_Volumes() {
		return (EReference)cvoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCVO_Volume() {
		return (EAttribute)cvoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCVO_HA() {
		return cvO_HAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCVO_HA_Awsnetworkingha() {
		return (EReference)cvO_HAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAWSNetworking() {
		return awsNetworkingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAWSNetworking_Subnet_id() {
		return (EAttribute)awsNetworkingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAWSNetworking_Cvo() {
		return (EReference)awsNetworkingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAWSNetworkingHA() {
		return awsNetworkingHAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAWSNetworkingHA_Cvo_ha() {
		return (EReference)awsNetworkingHAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAWSNetworkingHA_Node1_subnet_id() {
		return (EAttribute)awsNetworkingHAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAWSNetworkingHA_Node2_subnet_id() {
		return (EAttribute)awsNetworkingHAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAWSNetworkingHA_Failover_mode() {
		return (EAttribute)awsNetworkingHAEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAWSNetworkingHA_Mediator_subnet_id() {
		return (EAttribute)awsNetworkingHAEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAWSNetworkingHA_Mediator_key_pair_name() {
		return (EAttribute)awsNetworkingHAEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAWSNetworkingHA_Cluster_floating_ip() {
		return (EAttribute)awsNetworkingHAEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAWSNetworkingHA_Data_floating_ip() {
		return (EAttribute)awsNetworkingHAEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAWSNetworkingHA_Data_floating_ip2() {
		return (EAttribute)awsNetworkingHAEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAWSNetworkingHA_Svm_floating_ip() {
		return (EAttribute)awsNetworkingHAEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAWSConfiguration() {
		return awsConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAWSConfiguration_Region() {
		return (EAttribute)awsConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAWSConfiguration_Vpc_id() {
		return (EAttribute)awsConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVolume() {
		return volumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVolume_Environment() {
		return (EReference)volumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVolume_Snapshot_policy() {
		return (EReference)volumeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_State() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Size() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Size_unit() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Svm_name() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Export_policy_type() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Export_policy_ip() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Export_policy_nfs_version() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVolume_Multiplicity() {
		return (EAttribute)volumeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCVOConfiguration() {
		return cvoConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcsFactory getPcsFactory() {
		return (PcsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		deploymentEClass = createEClass(DEPLOYMENT);
		createEReference(deploymentEClass, DEPLOYMENT__ENVIRONMENT);
		createEReference(deploymentEClass, DEPLOYMENT__SNAPSHOT_POLICY);
		createEReference(deploymentEClass, DEPLOYMENT__PCS);
		createEReference(deploymentEClass, DEPLOYMENT__AWSCONFIGURATION);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__IDENTIFIER);

		pcsEClass = createEClass(PCS);

		cloudStorageEClass = createEClass(CLOUD_STORAGE);
		createEReference(cloudStorageEClass, CLOUD_STORAGE__BACKUP_VOLUMES_TO_CBS);
		createEReference(cloudStorageEClass, CLOUD_STORAGE__CAPACITY_TIER);

		dataServiceEClass = createEClass(DATA_SERVICE);

		environmentEClass = createEClass(ENVIRONMENT);

		snapshotPolicyEClass = createEClass(SNAPSHOT_POLICY);

		snapMirrorEClass = createEClass(SNAP_MIRROR);
		createEReference(snapMirrorEClass, SNAP_MIRROR__SOURCE_CVO);
		createEReference(snapMirrorEClass, SNAP_MIRROR__DESTINATION_CVO);
		createEReference(snapMirrorEClass, SNAP_MIRROR__SOURCE_VOLUME);
		createEReference(snapMirrorEClass, SNAP_MIRROR__DESTINATION_VOLUME);
		createEReference(snapMirrorEClass, SNAP_MIRROR__POLICY);
		createEAttribute(snapMirrorEClass, SNAP_MIRROR__MAX_TRANSFER_RATE);
		createEAttribute(snapMirrorEClass, SNAP_MIRROR__BIDIRECTIONAL);

		replicationPolicyEClass = createEClass(REPLICATION_POLICY);
		createEReference(replicationPolicyEClass, REPLICATION_POLICY__REPLICATION_MAPPINGS);
		createEAttribute(replicationPolicyEClass, REPLICATION_POLICY__REPLICATION_MAPPING);

		cloudTieringEClass = createEClass(CLOUD_TIERING);
		createEReference(cloudTieringEClass, CLOUD_TIERING__CLOUDSTORAGE);

		cloudBackupEClass = createEClass(CLOUD_BACKUP);
		createEReference(cloudBackupEClass, CLOUD_BACKUP__CLOUDSTORAGE);

		cvoEClass = createEClass(CVO);
		createEReference(cvoEClass, CVO__AWSNETWORKING);
		createEReference(cvoEClass, CVO__VOLUMES);
		createEAttribute(cvoEClass, CVO__VOLUME);

		cvO_HAEClass = createEClass(CVO_HA);
		createEReference(cvO_HAEClass, CVO_HA__AWSNETWORKINGHA);

		awsNetworkingEClass = createEClass(AWS_NETWORKING);
		createEAttribute(awsNetworkingEClass, AWS_NETWORKING__SUBNET_ID);
		createEReference(awsNetworkingEClass, AWS_NETWORKING__CVO);

		awsNetworkingHAEClass = createEClass(AWS_NETWORKING_HA);
		createEReference(awsNetworkingHAEClass, AWS_NETWORKING_HA__CVO_HA);
		createEAttribute(awsNetworkingHAEClass, AWS_NETWORKING_HA__NODE1_SUBNET_ID);
		createEAttribute(awsNetworkingHAEClass, AWS_NETWORKING_HA__NODE2_SUBNET_ID);
		createEAttribute(awsNetworkingHAEClass, AWS_NETWORKING_HA__FAILOVER_MODE);
		createEAttribute(awsNetworkingHAEClass, AWS_NETWORKING_HA__MEDIATOR_SUBNET_ID);
		createEAttribute(awsNetworkingHAEClass, AWS_NETWORKING_HA__MEDIATOR_KEY_PAIR_NAME);
		createEAttribute(awsNetworkingHAEClass, AWS_NETWORKING_HA__CLUSTER_FLOATING_IP);
		createEAttribute(awsNetworkingHAEClass, AWS_NETWORKING_HA__DATA_FLOATING_IP);
		createEAttribute(awsNetworkingHAEClass, AWS_NETWORKING_HA__DATA_FLOATING_IP2);
		createEAttribute(awsNetworkingHAEClass, AWS_NETWORKING_HA__SVM_FLOATING_IP);

		awsConfigurationEClass = createEClass(AWS_CONFIGURATION);
		createEAttribute(awsConfigurationEClass, AWS_CONFIGURATION__REGION);
		createEAttribute(awsConfigurationEClass, AWS_CONFIGURATION__VPC_ID);

		volumeEClass = createEClass(VOLUME);
		createEReference(volumeEClass, VOLUME__ENVIRONMENT);
		createEReference(volumeEClass, VOLUME__SNAPSHOT_POLICY);
		createEAttribute(volumeEClass, VOLUME__STATE);
		createEAttribute(volumeEClass, VOLUME__SIZE);
		createEAttribute(volumeEClass, VOLUME__SIZE_UNIT);
		createEAttribute(volumeEClass, VOLUME__SVM_NAME);
		createEAttribute(volumeEClass, VOLUME__EXPORT_POLICY_TYPE);
		createEAttribute(volumeEClass, VOLUME__EXPORT_POLICY_IP);
		createEAttribute(volumeEClass, VOLUME__EXPORT_POLICY_NFS_VERSION);
		createEAttribute(volumeEClass, VOLUME__MULTIPLICITY);

		cvoConfigurationEClass = createEClass(CVO_CONFIGURATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		deploymentEClass.getESuperTypes().add(this.getNamedElement());
		pcsEClass.getESuperTypes().add(this.getNamedElement());
		cloudStorageEClass.getESuperTypes().add(this.getPCS());
		dataServiceEClass.getESuperTypes().add(this.getPCS());
		environmentEClass.getESuperTypes().add(this.getNamedElement());
		snapshotPolicyEClass.getESuperTypes().add(this.getNamedElement());
		snapMirrorEClass.getESuperTypes().add(this.getDataService());
		replicationPolicyEClass.getESuperTypes().add(this.getPCS());
		cloudTieringEClass.getESuperTypes().add(this.getDataService());
		cloudBackupEClass.getESuperTypes().add(this.getDataService());
		cvoEClass.getESuperTypes().add(this.getCVOConfiguration());
		cvO_HAEClass.getESuperTypes().add(this.getCVOConfiguration());
		awsNetworkingEClass.getESuperTypes().add(this.getAWSConfiguration());
		awsNetworkingHAEClass.getESuperTypes().add(this.getAWSConfiguration());
		volumeEClass.getESuperTypes().add(this.getNamedElement());
		cvoConfigurationEClass.getESuperTypes().add(this.getCloudStorage());

		// Initialize classes, features, and operations; add parameters
		initEClass(deploymentEClass, Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeployment_Environment(), this.getEnvironment(), null, "environment", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_SnapshotPolicy(), this.getSnapshotPolicy(), null, "snapshotPolicy", null, 0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_Pcs(), this.getPCS(), null, "pcs", null, 0, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_Awsconfiguration(), this.getAWSConfiguration(), null, "awsconfiguration", null, 0, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedElement_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pcsEClass, pcs.PCS.class, "PCS", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cloudStorageEClass, CloudStorage.class, "CloudStorage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCloudStorage_Backup_volumes_to_cbs(), this.getCloudBackup(), this.getCloudBackup_Cloudstorage(), "backup_volumes_to_cbs", null, 0, 1, CloudStorage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudStorage_Capacity_tier(), this.getCloudTiering(), this.getCloudTiering_Cloudstorage(), "capacity_tier", null, 0, 1, CloudStorage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataServiceEClass, DataService.class, "DataService", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(snapshotPolicyEClass, SnapshotPolicy.class, "SnapshotPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(snapMirrorEClass, SnapMirror.class, "SnapMirror", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSnapMirror_Source_cvo(), this.getCVO(), null, "source_cvo", null, 0, 1, SnapMirror.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSnapMirror_Destination_cvo(), this.getCVO(), null, "destination_cvo", null, 0, 1, SnapMirror.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSnapMirror_Source_volume(), this.getVolume(), null, "source_volume", null, 0, 1, SnapMirror.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSnapMirror_Destination_volume(), this.getVolume(), null, "destination_volume", null, 0, 1, SnapMirror.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSnapMirror_Policy(), this.getSnapshotPolicy(), null, "policy", null, 0, 1, SnapMirror.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSnapMirror_Max_transfer_rate(), ecorePackage.getEInt(), "max_transfer_rate", null, 0, 1, SnapMirror.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSnapMirror_Bidirectional(), ecorePackage.getEBoolean(), "bidirectional", null, 0, 1, SnapMirror.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(replicationPolicyEClass, ReplicationPolicy.class, "ReplicationPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReplicationPolicy_Replication_mappings(), this.getSnapMirror(), null, "replication_mappings", null, 0, -1, ReplicationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReplicationPolicy_Replication_mapping(), ecorePackage.getEString(), "replication_mapping", null, 0, 1, ReplicationPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudTieringEClass, CloudTiering.class, "CloudTiering", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCloudTiering_Cloudstorage(), this.getCloudStorage(), this.getCloudStorage_Capacity_tier(), "cloudstorage", null, 1, 1, CloudTiering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudBackupEClass, CloudBackup.class, "CloudBackup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCloudBackup_Cloudstorage(), this.getCloudStorage(), this.getCloudStorage_Backup_volumes_to_cbs(), "cloudstorage", null, 1, 1, CloudBackup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cvoEClass, pcs.CVO.class, "CVO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCVO_Awsnetworking(), this.getAWSNetworking(), this.getAWSNetworking_Cvo(), "awsnetworking", null, 0, 1, pcs.CVO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCVO_Volumes(), this.getVolume(), null, "volumes", null, 0, -1, pcs.CVO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCVO_Volume(), ecorePackage.getEString(), "volume", null, 0, 1, pcs.CVO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cvO_HAEClass, pcs.CVO_HA.class, "CVO_HA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCVO_HA_Awsnetworkingha(), this.getAWSNetworkingHA(), this.getAWSNetworkingHA_Cvo_ha(), "awsnetworkingha", null, 0, 1, pcs.CVO_HA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awsNetworkingEClass, AWSNetworking.class, "AWSNetworking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAWSNetworking_Subnet_id(), ecorePackage.getEString(), "subnet_id", null, 0, 1, AWSNetworking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAWSNetworking_Cvo(), this.getCVO(), this.getCVO_Awsnetworking(), "cvo", null, 0, -1, AWSNetworking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awsNetworkingHAEClass, AWSNetworkingHA.class, "AWSNetworkingHA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAWSNetworkingHA_Cvo_ha(), this.getCVO_HA(), this.getCVO_HA_Awsnetworkingha(), "cvo_ha", null, 0, -1, AWSNetworkingHA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAWSNetworkingHA_Node1_subnet_id(), ecorePackage.getEString(), "node1_subnet_id", null, 0, 1, AWSNetworkingHA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAWSNetworkingHA_Node2_subnet_id(), ecorePackage.getEString(), "node2_subnet_id", null, 0, 1, AWSNetworkingHA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAWSNetworkingHA_Failover_mode(), ecorePackage.getEString(), "failover_mode", null, 0, 1, AWSNetworkingHA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAWSNetworkingHA_Mediator_subnet_id(), ecorePackage.getEString(), "mediator_subnet_id", null, 0, 1, AWSNetworkingHA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAWSNetworkingHA_Mediator_key_pair_name(), ecorePackage.getEString(), "mediator_key_pair_name", null, 0, 1, AWSNetworkingHA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAWSNetworkingHA_Cluster_floating_ip(), ecorePackage.getEString(), "cluster_floating_ip", null, 0, 1, AWSNetworkingHA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAWSNetworkingHA_Data_floating_ip(), ecorePackage.getEString(), "data_floating_ip", null, 0, 1, AWSNetworkingHA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAWSNetworkingHA_Data_floating_ip2(), ecorePackage.getEString(), "data_floating_ip2", null, 0, 1, AWSNetworkingHA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAWSNetworkingHA_Svm_floating_ip(), ecorePackage.getEString(), "svm_floating_ip", null, 0, 1, AWSNetworkingHA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awsConfigurationEClass, AWSConfiguration.class, "AWSConfiguration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAWSConfiguration_Region(), ecorePackage.getEString(), "region", null, 0, 1, AWSConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAWSConfiguration_Vpc_id(), ecorePackage.getEString(), "vpc_id", null, 0, 1, AWSConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(volumeEClass, Volume.class, "Volume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVolume_Environment(), this.getEnvironment(), null, "environment", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVolume_Snapshot_policy(), this.getSnapshotPolicy(), null, "snapshot_policy", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_State(), ecorePackage.getEString(), "state", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Size(), ecorePackage.getEDouble(), "size", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Size_unit(), ecorePackage.getEString(), "size_unit", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Svm_name(), ecorePackage.getEString(), "svm_name", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Export_policy_type(), ecorePackage.getEString(), "export_policy_type", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Export_policy_ip(), ecorePackage.getEString(), "export_policy_ip", null, 0, -1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Export_policy_nfs_version(), ecorePackage.getEString(), "export_policy_nfs_version", null, 0, -1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVolume_Multiplicity(), ecorePackage.getEInt(), "multiplicity", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cvoConfigurationEClass, CVOConfiguration.class, "CVOConfiguration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// syntax
		createSyntaxAnnotations();
	}

	/**
	 * Initializes the annotations for <b>syntax</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSyntaxAnnotations() {
		String source = "syntax";
		addAnnotation
		  (replicationPolicyEClass,
		   source,
		   new String[] {
			   "feature", "replication_mapping",
			   "derive", "replication_mappings",
			   "grammar", "org.netapp.pcs.grammarSnapMirror.ReplicationMappings",
			   "entryRule", "ReplicationPolicy"
		   });
		addAnnotation
		  (cvoEClass,
		   source,
		   new String[] {
			   "feature", "volume",
			   "derive", "volumes",
			   "grammar", "org.netapp.pcs.grammarVolumes.Volumes",
			   "entryRule", "CVO"
		   });
	}

} //PcsPackageImpl (Patched)