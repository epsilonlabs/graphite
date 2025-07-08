/**
 */
package pcs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pcs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PcsFactoryImpl extends EFactoryImpl implements PcsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PcsFactory init() {
		try {
			PcsFactory thePcsFactory = (PcsFactory)EPackage.Registry.INSTANCE.getEFactory(PcsPackage.eNS_URI);
			if (thePcsFactory != null) {
				return thePcsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PcsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PcsPackage.DEPLOYMENT: return createDeployment();
			case PcsPackage.ENVIRONMENT: return createEnvironment();
			case PcsPackage.SNAPSHOT_POLICY: return createSnapshotPolicy();
			case PcsPackage.SNAP_MIRROR: return createSnapMirror();
			case PcsPackage.REPLICATION_POLICY: return createReplicationPolicy();
			case PcsPackage.CLOUD_TIERING: return createCloudTiering();
			case PcsPackage.CLOUD_BACKUP: return createCloudBackup();
			case PcsPackage.CVO: return createCVO();
			case PcsPackage.CVO_HA: return createCVO_HA();
			case PcsPackage.AWS_NETWORKING: return createAWSNetworking();
			case PcsPackage.AWS_NETWORKING_HA: return createAWSNetworkingHA();
			case PcsPackage.VOLUME: return createVolume();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment createDeployment() {
		DeploymentImpl deployment = new DeploymentImpl();
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment createEnvironment() {
		EnvironmentImpl environment = new EnvironmentImpl();
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnapshotPolicy createSnapshotPolicy() {
		SnapshotPolicyImpl snapshotPolicy = new SnapshotPolicyImpl();
		return snapshotPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnapMirror createSnapMirror() {
		SnapMirrorImpl snapMirror = new SnapMirrorImpl();
		return snapMirror;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplicationPolicy createReplicationPolicy() {
		ReplicationPolicyImpl replicationPolicy = new ReplicationPolicyImpl();
		return replicationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudTiering createCloudTiering() {
		CloudTieringImpl cloudTiering = new CloudTieringImpl();
		return cloudTiering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudBackup createCloudBackup() {
		CloudBackupImpl cloudBackup = new CloudBackupImpl();
		return cloudBackup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVO createCVO() {
		CVOImpl cvo = new CVOImpl();
		return cvo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVO_HA createCVO_HA() {
		CVO_HAImpl cvO_HA = new CVO_HAImpl();
		return cvO_HA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AWSNetworking createAWSNetworking() {
		AWSNetworkingImpl awsNetworking = new AWSNetworkingImpl();
		return awsNetworking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AWSNetworkingHA createAWSNetworkingHA() {
		AWSNetworkingHAImpl awsNetworkingHA = new AWSNetworkingHAImpl();
		return awsNetworkingHA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volume createVolume() {
		VolumeImpl volume = new VolumeImpl();
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcsPackage getPcsPackage() {
		return (PcsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PcsPackage getPackage() {
		return PcsPackage.eINSTANCE;
	}

} //PcsFactoryImpl
