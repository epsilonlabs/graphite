/**
 */
package pcs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replication Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcs.ReplicationPolicy#getReplication_mappings <em>Replication mappings</em>}</li>
 *   <li>{@link pcs.ReplicationPolicy#getReplication_mapping <em>Replication mapping</em>}</li>
 * </ul>
 *
 * @see pcs.PcsPackage#getReplicationPolicy()
 * @model annotation="syntax feature='replication_mapping' derive='replication_mappings' grammar='org.netapp.pcs.grammarSnapMirror.ReplicationMappings' entryRule='ReplicationPolicy'"
 * @generated
 */
public interface ReplicationPolicy extends PCS {
	/**
	 * Returns the value of the '<em><b>Replication mappings</b></em>' containment reference list.
	 * The list contents are of type {@link pcs.SnapMirror}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replication mappings</em>' containment reference list.
	 * @see pcs.PcsPackage#getReplicationPolicy_Replication_mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<SnapMirror> getReplication_mappings();

	/**
	 * Returns the value of the '<em><b>Replication mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replication mapping</em>' attribute.
	 * @see #setReplication_mapping(String)
	 * @see pcs.PcsPackage#getReplicationPolicy_Replication_mapping()
	 * @model
	 * @generated
	 */
	String getReplication_mapping();

	/**
	 * Sets the value of the '{@link pcs.ReplicationPolicy#getReplication_mapping <em>Replication mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replication mapping</em>' attribute.
	 * @see #getReplication_mapping()
	 * @generated
	 */
	void setReplication_mapping(String value);

} // ReplicationPolicy
