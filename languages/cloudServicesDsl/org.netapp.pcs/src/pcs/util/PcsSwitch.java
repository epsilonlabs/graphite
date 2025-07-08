/**
 */
package pcs.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import pcs.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see pcs.PcsPackage
 * @generated
 */
public class PcsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PcsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PcsSwitch() {
		if (modelPackage == null) {
			modelPackage = PcsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PcsPackage.DEPLOYMENT: {
				Deployment deployment = (Deployment)theEObject;
				T result = caseDeployment(deployment);
				if (result == null) result = caseNamedElement(deployment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcsPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcsPackage.PCS: {
				PCS pcs = (PCS)theEObject;
				T result = casePCS(pcs);
				if (result == null) result = caseNamedElement(pcs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcsPackage.CLOUD_STORAGE: {
				CloudStorage cloudStorage = (CloudStorage)theEObject;
				T result = caseCloudStorage(cloudStorage);
				if (result == null) result = casePCS(cloudStorage);
				if (result == null) result = caseNamedElement(cloudStorage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcsPackage.DATA_SERVICE: {
				DataService dataService = (DataService)theEObject;
				T result = caseDataService(dataService);
				if (result == null) result = casePCS(dataService);
				if (result == null) result = caseNamedElement(dataService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcsPackage.ENVIRONMENT: {
				Environment environment = (Environment)theEObject;
				T result = caseEnvironment(environment);
				if (result == null) result = caseNamedElement(environment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcsPackage.SNAPSHOT_POLICY: {
				SnapshotPolicy snapshotPolicy = (SnapshotPolicy)theEObject;
				T result = caseSnapshotPolicy(snapshotPolicy);
				if (result == null) result = caseNamedElement(snapshotPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcsPackage.SNAP_MIRROR: {
				SnapMirror snapMirror = (SnapMirror)theEObject;
				T result = caseSnapMirror(snapMirror);
				if (result == null) result = caseDataService(snapMirror);
				if (result == null) result = casePCS(snapMirror);
				if (result == null) result = caseNamedElement(snapMirror);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcsPackage.REPLICATION_POLICY: {
				ReplicationPolicy replicationPolicy = (ReplicationPolicy)theEObject;
				T result = caseReplicationPolicy(replicationPolicy);
				if (result == null) result = casePCS(replicationPolicy);
				if (result == null) result = caseNamedElement(replicationPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcsPackage.CLOUD_TIERING: {
				CloudTiering cloudTiering = (CloudTiering)theEObject;
				T result = caseCloudTiering(cloudTiering);
				if (result == null) result = caseDataService(cloudTiering);
				if (result == null) result = casePCS(cloudTiering);
				if (result == null) result = caseNamedElement(cloudTiering);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcsPackage.CLOUD_BACKUP: {
				CloudBackup cloudBackup = (CloudBackup)theEObject;
				T result = caseCloudBackup(cloudBackup);
				if (result == null) result = caseDataService(cloudBackup);
				if (result == null) result = casePCS(cloudBackup);
				if (result == null) result = caseNamedElement(cloudBackup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcsPackage.CVO: {
				CVO cvo = (CVO)theEObject;
				T result = caseCVO(cvo);
				if (result == null) result = caseCVOConfiguration(cvo);
				if (result == null) result = caseCloudStorage(cvo);
				if (result == null) result = casePCS(cvo);
				if (result == null) result = caseNamedElement(cvo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcsPackage.CVO_HA: {
				CVO_HA cvO_HA = (CVO_HA)theEObject;
				T result = caseCVO_HA(cvO_HA);
				if (result == null) result = caseCVOConfiguration(cvO_HA);
				if (result == null) result = caseCloudStorage(cvO_HA);
				if (result == null) result = casePCS(cvO_HA);
				if (result == null) result = caseNamedElement(cvO_HA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcsPackage.AWS_NETWORKING: {
				AWSNetworking awsNetworking = (AWSNetworking)theEObject;
				T result = caseAWSNetworking(awsNetworking);
				if (result == null) result = caseAWSConfiguration(awsNetworking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcsPackage.AWS_NETWORKING_HA: {
				AWSNetworkingHA awsNetworkingHA = (AWSNetworkingHA)theEObject;
				T result = caseAWSNetworkingHA(awsNetworkingHA);
				if (result == null) result = caseAWSConfiguration(awsNetworkingHA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcsPackage.AWS_CONFIGURATION: {
				AWSConfiguration awsConfiguration = (AWSConfiguration)theEObject;
				T result = caseAWSConfiguration(awsConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcsPackage.VOLUME: {
				Volume volume = (Volume)theEObject;
				T result = caseVolume(volume);
				if (result == null) result = caseNamedElement(volume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PcsPackage.CVO_CONFIGURATION: {
				CVOConfiguration cvoConfiguration = (CVOConfiguration)theEObject;
				T result = caseCVOConfiguration(cvoConfiguration);
				if (result == null) result = caseCloudStorage(cvoConfiguration);
				if (result == null) result = casePCS(cvoConfiguration);
				if (result == null) result = caseNamedElement(cvoConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployment(Deployment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PCS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PCS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePCS(PCS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudStorage(CloudStorage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataService(DataService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironment(Environment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Snapshot Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Snapshot Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSnapshotPolicy(SnapshotPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Snap Mirror</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Snap Mirror</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSnapMirror(SnapMirror object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replication Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replication Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplicationPolicy(ReplicationPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Tiering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Tiering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudTiering(CloudTiering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Backup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Backup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudBackup(CloudBackup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CVO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CVO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCVO(CVO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CVO HA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CVO HA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCVO_HA(CVO_HA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AWS Networking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AWS Networking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAWSNetworking(AWSNetworking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AWS Networking HA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AWS Networking HA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAWSNetworkingHA(AWSNetworkingHA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AWS Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AWS Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAWSConfiguration(AWSConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolume(Volume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CVO Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CVO Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCVOConfiguration(CVOConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PcsSwitch
