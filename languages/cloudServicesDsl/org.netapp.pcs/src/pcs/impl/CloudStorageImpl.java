/**
 */
package pcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pcs.CloudBackup;
import pcs.CloudStorage;
import pcs.CloudTiering;
import pcs.PcsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Storage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcs.impl.CloudStorageImpl#getBackup_volumes_to_cbs <em>Backup volumes to cbs</em>}</li>
 *   <li>{@link pcs.impl.CloudStorageImpl#getCapacity_tier <em>Capacity tier</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CloudStorageImpl extends PCSImpl implements CloudStorage {
	/**
	 * The cached value of the '{@link #getBackup_volumes_to_cbs() <em>Backup volumes to cbs</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackup_volumes_to_cbs()
	 * @generated
	 * @ordered
	 */
	protected CloudBackup backup_volumes_to_cbs;

	/**
	 * The cached value of the '{@link #getCapacity_tier() <em>Capacity tier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity_tier()
	 * @generated
	 * @ordered
	 */
	protected CloudTiering capacity_tier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudStorageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcsPackage.Literals.CLOUD_STORAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudBackup getBackup_volumes_to_cbs() {
		if (backup_volumes_to_cbs != null && backup_volumes_to_cbs.eIsProxy()) {
			InternalEObject oldBackup_volumes_to_cbs = (InternalEObject)backup_volumes_to_cbs;
			backup_volumes_to_cbs = (CloudBackup)eResolveProxy(oldBackup_volumes_to_cbs);
			if (backup_volumes_to_cbs != oldBackup_volumes_to_cbs) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PcsPackage.CLOUD_STORAGE__BACKUP_VOLUMES_TO_CBS, oldBackup_volumes_to_cbs, backup_volumes_to_cbs));
			}
		}
		return backup_volumes_to_cbs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudBackup basicGetBackup_volumes_to_cbs() {
		return backup_volumes_to_cbs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackup_volumes_to_cbs(CloudBackup newBackup_volumes_to_cbs, NotificationChain msgs) {
		CloudBackup oldBackup_volumes_to_cbs = backup_volumes_to_cbs;
		backup_volumes_to_cbs = newBackup_volumes_to_cbs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PcsPackage.CLOUD_STORAGE__BACKUP_VOLUMES_TO_CBS, oldBackup_volumes_to_cbs, newBackup_volumes_to_cbs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackup_volumes_to_cbs(CloudBackup newBackup_volumes_to_cbs) {
		if (newBackup_volumes_to_cbs != backup_volumes_to_cbs) {
			NotificationChain msgs = null;
			if (backup_volumes_to_cbs != null)
				msgs = ((InternalEObject)backup_volumes_to_cbs).eInverseRemove(this, PcsPackage.CLOUD_BACKUP__CLOUDSTORAGE, CloudBackup.class, msgs);
			if (newBackup_volumes_to_cbs != null)
				msgs = ((InternalEObject)newBackup_volumes_to_cbs).eInverseAdd(this, PcsPackage.CLOUD_BACKUP__CLOUDSTORAGE, CloudBackup.class, msgs);
			msgs = basicSetBackup_volumes_to_cbs(newBackup_volumes_to_cbs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.CLOUD_STORAGE__BACKUP_VOLUMES_TO_CBS, newBackup_volumes_to_cbs, newBackup_volumes_to_cbs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudTiering getCapacity_tier() {
		if (capacity_tier != null && capacity_tier.eIsProxy()) {
			InternalEObject oldCapacity_tier = (InternalEObject)capacity_tier;
			capacity_tier = (CloudTiering)eResolveProxy(oldCapacity_tier);
			if (capacity_tier != oldCapacity_tier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PcsPackage.CLOUD_STORAGE__CAPACITY_TIER, oldCapacity_tier, capacity_tier));
			}
		}
		return capacity_tier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudTiering basicGetCapacity_tier() {
		return capacity_tier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCapacity_tier(CloudTiering newCapacity_tier, NotificationChain msgs) {
		CloudTiering oldCapacity_tier = capacity_tier;
		capacity_tier = newCapacity_tier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PcsPackage.CLOUD_STORAGE__CAPACITY_TIER, oldCapacity_tier, newCapacity_tier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity_tier(CloudTiering newCapacity_tier) {
		if (newCapacity_tier != capacity_tier) {
			NotificationChain msgs = null;
			if (capacity_tier != null)
				msgs = ((InternalEObject)capacity_tier).eInverseRemove(this, PcsPackage.CLOUD_TIERING__CLOUDSTORAGE, CloudTiering.class, msgs);
			if (newCapacity_tier != null)
				msgs = ((InternalEObject)newCapacity_tier).eInverseAdd(this, PcsPackage.CLOUD_TIERING__CLOUDSTORAGE, CloudTiering.class, msgs);
			msgs = basicSetCapacity_tier(newCapacity_tier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.CLOUD_STORAGE__CAPACITY_TIER, newCapacity_tier, newCapacity_tier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcsPackage.CLOUD_STORAGE__BACKUP_VOLUMES_TO_CBS:
				if (backup_volumes_to_cbs != null)
					msgs = ((InternalEObject)backup_volumes_to_cbs).eInverseRemove(this, PcsPackage.CLOUD_BACKUP__CLOUDSTORAGE, CloudBackup.class, msgs);
				return basicSetBackup_volumes_to_cbs((CloudBackup)otherEnd, msgs);
			case PcsPackage.CLOUD_STORAGE__CAPACITY_TIER:
				if (capacity_tier != null)
					msgs = ((InternalEObject)capacity_tier).eInverseRemove(this, PcsPackage.CLOUD_TIERING__CLOUDSTORAGE, CloudTiering.class, msgs);
				return basicSetCapacity_tier((CloudTiering)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcsPackage.CLOUD_STORAGE__BACKUP_VOLUMES_TO_CBS:
				return basicSetBackup_volumes_to_cbs(null, msgs);
			case PcsPackage.CLOUD_STORAGE__CAPACITY_TIER:
				return basicSetCapacity_tier(null, msgs);
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
			case PcsPackage.CLOUD_STORAGE__BACKUP_VOLUMES_TO_CBS:
				if (resolve) return getBackup_volumes_to_cbs();
				return basicGetBackup_volumes_to_cbs();
			case PcsPackage.CLOUD_STORAGE__CAPACITY_TIER:
				if (resolve) return getCapacity_tier();
				return basicGetCapacity_tier();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PcsPackage.CLOUD_STORAGE__BACKUP_VOLUMES_TO_CBS:
				setBackup_volumes_to_cbs((CloudBackup)newValue);
				return;
			case PcsPackage.CLOUD_STORAGE__CAPACITY_TIER:
				setCapacity_tier((CloudTiering)newValue);
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
			case PcsPackage.CLOUD_STORAGE__BACKUP_VOLUMES_TO_CBS:
				setBackup_volumes_to_cbs((CloudBackup)null);
				return;
			case PcsPackage.CLOUD_STORAGE__CAPACITY_TIER:
				setCapacity_tier((CloudTiering)null);
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
			case PcsPackage.CLOUD_STORAGE__BACKUP_VOLUMES_TO_CBS:
				return backup_volumes_to_cbs != null;
			case PcsPackage.CLOUD_STORAGE__CAPACITY_TIER:
				return capacity_tier != null;
		}
		return super.eIsSet(featureID);
	}

} //CloudStorageImpl
