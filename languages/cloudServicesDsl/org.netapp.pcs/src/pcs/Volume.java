/**
 */
package pcs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcs.Volume#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link pcs.Volume#getSnapshot_policy <em>Snapshot policy</em>}</li>
 *   <li>{@link pcs.Volume#getState <em>State</em>}</li>
 *   <li>{@link pcs.Volume#getSize <em>Size</em>}</li>
 *   <li>{@link pcs.Volume#getSize_unit <em>Size unit</em>}</li>
 *   <li>{@link pcs.Volume#getSvm_name <em>Svm name</em>}</li>
 *   <li>{@link pcs.Volume#getExport_policy_type <em>Export policy type</em>}</li>
 *   <li>{@link pcs.Volume#getExport_policy_ip <em>Export policy ip</em>}</li>
 *   <li>{@link pcs.Volume#getExport_policy_nfs_version <em>Export policy nfs version</em>}</li>
 *   <li>{@link pcs.Volume#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see pcs.PcsPackage#getVolume()
 * @model
 * @generated
 */
public interface Volume extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' reference.
	 * @see #setEnvironment(Environment)
	 * @see pcs.PcsPackage#getVolume_Environment()
	 * @model
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link pcs.Volume#getEnvironment <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

	/**
	 * Returns the value of the '<em><b>Snapshot policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Snapshot policy</em>' reference.
	 * @see #setSnapshot_policy(SnapshotPolicy)
	 * @see pcs.PcsPackage#getVolume_Snapshot_policy()
	 * @model
	 * @generated
	 */
	SnapshotPolicy getSnapshot_policy();

	/**
	 * Sets the value of the '{@link pcs.Volume#getSnapshot_policy <em>Snapshot policy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Snapshot policy</em>' reference.
	 * @see #getSnapshot_policy()
	 * @generated
	 */
	void setSnapshot_policy(SnapshotPolicy value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see pcs.PcsPackage#getVolume_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link pcs.Volume#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(double)
	 * @see pcs.PcsPackage#getVolume_Size()
	 * @model
	 * @generated
	 */
	double getSize();

	/**
	 * Sets the value of the '{@link pcs.Volume#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(double value);

	/**
	 * Returns the value of the '<em><b>Size unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size unit</em>' attribute.
	 * @see #setSize_unit(String)
	 * @see pcs.PcsPackage#getVolume_Size_unit()
	 * @model
	 * @generated
	 */
	String getSize_unit();

	/**
	 * Sets the value of the '{@link pcs.Volume#getSize_unit <em>Size unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size unit</em>' attribute.
	 * @see #getSize_unit()
	 * @generated
	 */
	void setSize_unit(String value);

	/**
	 * Returns the value of the '<em><b>Svm name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Svm name</em>' attribute.
	 * @see #setSvm_name(String)
	 * @see pcs.PcsPackage#getVolume_Svm_name()
	 * @model
	 * @generated
	 */
	String getSvm_name();

	/**
	 * Sets the value of the '{@link pcs.Volume#getSvm_name <em>Svm name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Svm name</em>' attribute.
	 * @see #getSvm_name()
	 * @generated
	 */
	void setSvm_name(String value);

	/**
	 * Returns the value of the '<em><b>Export policy type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export policy type</em>' attribute.
	 * @see #setExport_policy_type(String)
	 * @see pcs.PcsPackage#getVolume_Export_policy_type()
	 * @model
	 * @generated
	 */
	String getExport_policy_type();

	/**
	 * Sets the value of the '{@link pcs.Volume#getExport_policy_type <em>Export policy type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Export policy type</em>' attribute.
	 * @see #getExport_policy_type()
	 * @generated
	 */
	void setExport_policy_type(String value);

	/**
	 * Returns the value of the '<em><b>Export policy ip</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export policy ip</em>' attribute list.
	 * @see pcs.PcsPackage#getVolume_Export_policy_ip()
	 * @model
	 * @generated
	 */
	EList<String> getExport_policy_ip();

	/**
	 * Returns the value of the '<em><b>Export policy nfs version</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Export policy nfs version</em>' attribute list.
	 * @see pcs.PcsPackage#getVolume_Export_policy_nfs_version()
	 * @model
	 * @generated
	 */
	EList<String> getExport_policy_nfs_version();

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see #setMultiplicity(int)
	 * @see pcs.PcsPackage#getVolume_Multiplicity()
	 * @model
	 * @generated
	 */
	int getMultiplicity();

	/**
	 * Sets the value of the '{@link pcs.Volume#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(int value);

} // Volume
