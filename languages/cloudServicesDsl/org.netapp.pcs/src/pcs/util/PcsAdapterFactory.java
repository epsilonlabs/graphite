/**
 */
package pcs.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pcs.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pcs.PcsPackage
 * @generated
 */
public class PcsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PcsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PcsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PcsSwitch<Adapter> modelSwitch =
		new PcsSwitch<Adapter>() {
			@Override
			public Adapter caseDeployment(Deployment object) {
				return createDeploymentAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter casePCS(PCS object) {
				return createPCSAdapter();
			}
			@Override
			public Adapter caseCloudStorage(CloudStorage object) {
				return createCloudStorageAdapter();
			}
			@Override
			public Adapter caseDataService(DataService object) {
				return createDataServiceAdapter();
			}
			@Override
			public Adapter caseEnvironment(Environment object) {
				return createEnvironmentAdapter();
			}
			@Override
			public Adapter caseSnapshotPolicy(SnapshotPolicy object) {
				return createSnapshotPolicyAdapter();
			}
			@Override
			public Adapter caseSnapMirror(SnapMirror object) {
				return createSnapMirrorAdapter();
			}
			@Override
			public Adapter caseReplicationPolicy(ReplicationPolicy object) {
				return createReplicationPolicyAdapter();
			}
			@Override
			public Adapter caseCloudTiering(CloudTiering object) {
				return createCloudTieringAdapter();
			}
			@Override
			public Adapter caseCloudBackup(CloudBackup object) {
				return createCloudBackupAdapter();
			}
			@Override
			public Adapter caseCVO(CVO object) {
				return createCVOAdapter();
			}
			@Override
			public Adapter caseCVO_HA(CVO_HA object) {
				return createCVO_HAAdapter();
			}
			@Override
			public Adapter caseAWSNetworking(AWSNetworking object) {
				return createAWSNetworkingAdapter();
			}
			@Override
			public Adapter caseAWSNetworkingHA(AWSNetworkingHA object) {
				return createAWSNetworkingHAAdapter();
			}
			@Override
			public Adapter caseAWSConfiguration(AWSConfiguration object) {
				return createAWSConfigurationAdapter();
			}
			@Override
			public Adapter caseVolume(Volume object) {
				return createVolumeAdapter();
			}
			@Override
			public Adapter caseCVOConfiguration(CVOConfiguration object) {
				return createCVOConfigurationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link pcs.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcs.Deployment
	 * @generated
	 */
	public Adapter createDeploymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcs.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcs.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcs.PCS <em>PCS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcs.PCS
	 * @generated
	 */
	public Adapter createPCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcs.CloudStorage <em>Cloud Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcs.CloudStorage
	 * @generated
	 */
	public Adapter createCloudStorageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcs.DataService <em>Data Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcs.DataService
	 * @generated
	 */
	public Adapter createDataServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcs.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcs.Environment
	 * @generated
	 */
	public Adapter createEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcs.SnapshotPolicy <em>Snapshot Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcs.SnapshotPolicy
	 * @generated
	 */
	public Adapter createSnapshotPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcs.SnapMirror <em>Snap Mirror</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcs.SnapMirror
	 * @generated
	 */
	public Adapter createSnapMirrorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcs.ReplicationPolicy <em>Replication Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcs.ReplicationPolicy
	 * @generated
	 */
	public Adapter createReplicationPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcs.CloudTiering <em>Cloud Tiering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcs.CloudTiering
	 * @generated
	 */
	public Adapter createCloudTieringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcs.CloudBackup <em>Cloud Backup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcs.CloudBackup
	 * @generated
	 */
	public Adapter createCloudBackupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcs.CVO <em>CVO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcs.CVO
	 * @generated
	 */
	public Adapter createCVOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcs.CVO_HA <em>CVO HA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcs.CVO_HA
	 * @generated
	 */
	public Adapter createCVO_HAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcs.AWSNetworking <em>AWS Networking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcs.AWSNetworking
	 * @generated
	 */
	public Adapter createAWSNetworkingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcs.AWSNetworkingHA <em>AWS Networking HA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcs.AWSNetworkingHA
	 * @generated
	 */
	public Adapter createAWSNetworkingHAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcs.AWSConfiguration <em>AWS Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcs.AWSConfiguration
	 * @generated
	 */
	public Adapter createAWSConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcs.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcs.Volume
	 * @generated
	 */
	public Adapter createVolumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pcs.CVOConfiguration <em>CVO Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pcs.CVOConfiguration
	 * @generated
	 */
	public Adapter createCVOConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PcsAdapterFactory
