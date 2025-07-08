/**
 */
package pcs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcs.Deployment#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link pcs.Deployment#getSnapshotPolicy <em>Snapshot Policy</em>}</li>
 *   <li>{@link pcs.Deployment#getPcs <em>Pcs</em>}</li>
 *   <li>{@link pcs.Deployment#getAwsconfiguration <em>Awsconfiguration</em>}</li>
 * </ul>
 *
 * @see pcs.PcsPackage#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(Environment)
	 * @see pcs.PcsPackage#getDeployment_Environment()
	 * @model containment="true"
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link pcs.Deployment#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

	/**
	 * Returns the value of the '<em><b>Snapshot Policy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snapshot Policy</em>' containment reference.
	 * @see #setSnapshotPolicy(SnapshotPolicy)
	 * @see pcs.PcsPackage#getDeployment_SnapshotPolicy()
	 * @model containment="true"
	 * @generated
	 */
	SnapshotPolicy getSnapshotPolicy();

	/**
	 * Sets the value of the '{@link pcs.Deployment#getSnapshotPolicy <em>Snapshot Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snapshot Policy</em>' containment reference.
	 * @see #getSnapshotPolicy()
	 * @generated
	 */
	void setSnapshotPolicy(SnapshotPolicy value);

	/**
	 * Returns the value of the '<em><b>Pcs</b></em>' containment reference list.
	 * The list contents are of type {@link pcs.PCS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcs</em>' containment reference list.
	 * @see pcs.PcsPackage#getDeployment_Pcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<PCS> getPcs();

	/**
	 * Returns the value of the '<em><b>Awsconfiguration</b></em>' containment reference list.
	 * The list contents are of type {@link pcs.AWSConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Awsconfiguration</em>' containment reference list.
	 * @see pcs.PcsPackage#getDeployment_Awsconfiguration()
	 * @model containment="true"
	 * @generated
	 */
	EList<AWSConfiguration> getAwsconfiguration();

} // Deployment
