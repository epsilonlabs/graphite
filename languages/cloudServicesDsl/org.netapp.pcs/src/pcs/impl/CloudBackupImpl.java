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
import pcs.PcsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Backup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcs.impl.CloudBackupImpl#getCloudstorage <em>Cloudstorage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloudBackupImpl extends DataServiceImpl implements CloudBackup {
	/**
	 * The cached value of the '{@link #getCloudstorage() <em>Cloudstorage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudstorage()
	 * @generated
	 * @ordered
	 */
	protected CloudStorage cloudstorage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudBackupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcsPackage.Literals.CLOUD_BACKUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudStorage getCloudstorage() {
		if (cloudstorage != null && cloudstorage.eIsProxy()) {
			InternalEObject oldCloudstorage = (InternalEObject)cloudstorage;
			cloudstorage = (CloudStorage)eResolveProxy(oldCloudstorage);
			if (cloudstorage != oldCloudstorage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PcsPackage.CLOUD_BACKUP__CLOUDSTORAGE, oldCloudstorage, cloudstorage));
			}
		}
		return cloudstorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudStorage basicGetCloudstorage() {
		return cloudstorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCloudstorage(CloudStorage newCloudstorage, NotificationChain msgs) {
		CloudStorage oldCloudstorage = cloudstorage;
		cloudstorage = newCloudstorage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PcsPackage.CLOUD_BACKUP__CLOUDSTORAGE, oldCloudstorage, newCloudstorage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCloudstorage(CloudStorage newCloudstorage) {
		if (newCloudstorage != cloudstorage) {
			NotificationChain msgs = null;
			if (cloudstorage != null)
				msgs = ((InternalEObject)cloudstorage).eInverseRemove(this, PcsPackage.CLOUD_STORAGE__BACKUP_VOLUMES_TO_CBS, CloudStorage.class, msgs);
			if (newCloudstorage != null)
				msgs = ((InternalEObject)newCloudstorage).eInverseAdd(this, PcsPackage.CLOUD_STORAGE__BACKUP_VOLUMES_TO_CBS, CloudStorage.class, msgs);
			msgs = basicSetCloudstorage(newCloudstorage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.CLOUD_BACKUP__CLOUDSTORAGE, newCloudstorage, newCloudstorage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcsPackage.CLOUD_BACKUP__CLOUDSTORAGE:
				if (cloudstorage != null)
					msgs = ((InternalEObject)cloudstorage).eInverseRemove(this, PcsPackage.CLOUD_STORAGE__BACKUP_VOLUMES_TO_CBS, CloudStorage.class, msgs);
				return basicSetCloudstorage((CloudStorage)otherEnd, msgs);
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
			case PcsPackage.CLOUD_BACKUP__CLOUDSTORAGE:
				return basicSetCloudstorage(null, msgs);
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
			case PcsPackage.CLOUD_BACKUP__CLOUDSTORAGE:
				if (resolve) return getCloudstorage();
				return basicGetCloudstorage();
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
			case PcsPackage.CLOUD_BACKUP__CLOUDSTORAGE:
				setCloudstorage((CloudStorage)newValue);
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
			case PcsPackage.CLOUD_BACKUP__CLOUDSTORAGE:
				setCloudstorage((CloudStorage)null);
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
			case PcsPackage.CLOUD_BACKUP__CLOUDSTORAGE:
				return cloudstorage != null;
		}
		return super.eIsSet(featureID);
	}

} //CloudBackupImpl
