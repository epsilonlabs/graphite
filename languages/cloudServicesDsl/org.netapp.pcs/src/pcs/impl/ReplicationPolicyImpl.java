/**
 */
package pcs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pcs.PcsPackage;
import pcs.ReplicationPolicy;
import pcs.SnapMirror;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Replication Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcs.impl.ReplicationPolicyImpl#getReplication_mappings <em>Replication mappings</em>}</li>
 *   <li>{@link pcs.impl.ReplicationPolicyImpl#getReplication_mapping <em>Replication mapping</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReplicationPolicyImpl extends PCSImpl implements ReplicationPolicy {
	/**
	 * The cached value of the '{@link #getReplication_mappings() <em>Replication mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplication_mappings()
	 * @generated
	 * @ordered
	 */
	protected EList<SnapMirror> replication_mappings;

	/**
	 * The default value of the '{@link #getReplication_mapping() <em>Replication mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplication_mapping()
	 * @generated
	 * @ordered
	 */
	protected static final String REPLICATION_MAPPING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplication_mapping() <em>Replication mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplication_mapping()
	 * @generated
	 * @ordered
	 */
	protected String replication_mapping = REPLICATION_MAPPING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplicationPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcsPackage.Literals.REPLICATION_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SnapMirror> getReplication_mappings() {
		if (replication_mappings == null) {
			replication_mappings = new EObjectContainmentEList<SnapMirror>(SnapMirror.class, this, PcsPackage.REPLICATION_POLICY__REPLICATION_MAPPINGS);
		}
		return replication_mappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReplication_mapping() {
		return replication_mapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplication_mapping(String newReplication_mapping) {
		String oldReplication_mapping = replication_mapping;
		replication_mapping = newReplication_mapping;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.REPLICATION_POLICY__REPLICATION_MAPPING, oldReplication_mapping, replication_mapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcsPackage.REPLICATION_POLICY__REPLICATION_MAPPINGS:
				return ((InternalEList<?>)getReplication_mappings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcsPackage.REPLICATION_POLICY__REPLICATION_MAPPINGS:
				return getReplication_mappings();
			case PcsPackage.REPLICATION_POLICY__REPLICATION_MAPPING:
				return getReplication_mapping();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PcsPackage.REPLICATION_POLICY__REPLICATION_MAPPINGS:
				getReplication_mappings().clear();
				getReplication_mappings().addAll((Collection<? extends SnapMirror>)newValue);
				return;
			case PcsPackage.REPLICATION_POLICY__REPLICATION_MAPPING:
				setReplication_mapping((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PcsPackage.REPLICATION_POLICY__REPLICATION_MAPPINGS:
				getReplication_mappings().clear();
				return;
			case PcsPackage.REPLICATION_POLICY__REPLICATION_MAPPING:
				setReplication_mapping(REPLICATION_MAPPING_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PcsPackage.REPLICATION_POLICY__REPLICATION_MAPPINGS:
				return replication_mappings != null && !replication_mappings.isEmpty();
			case PcsPackage.REPLICATION_POLICY__REPLICATION_MAPPING:
				return REPLICATION_MAPPING_EDEFAULT == null ? replication_mapping != null : !REPLICATION_MAPPING_EDEFAULT.equals(replication_mapping);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (replication_mapping: ");
		result.append(replication_mapping);
		result.append(')');
		return result.toString();
	}

} //ReplicationPolicyImpl
