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

import pcs.AWSNetworking;
import pcs.CVO;
import pcs.PcsPackage;
import pcs.Volume;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CVO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcs.impl.CVOImpl#getAwsnetworking <em>Awsnetworking</em>}</li>
 *   <li>{@link pcs.impl.CVOImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link pcs.impl.CVOImpl#getVolume <em>Volume</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CVOImpl extends CVOConfigurationImpl implements CVO {
	/**
	 * The cached value of the '{@link #getAwsnetworking() <em>Awsnetworking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwsnetworking()
	 * @generated
	 * @ordered
	 */
	protected AWSNetworking awsnetworking;

	/**
	 * The cached value of the '{@link #getVolumes() <em>Volumes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes()
	 * @generated
	 * @ordered
	 */
	protected EList<Volume> volumes;

	/**
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected static final String VOLUME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected String volume = VOLUME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CVOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcsPackage.Literals.CVO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AWSNetworking getAwsnetworking() {
		if (awsnetworking != null && awsnetworking.eIsProxy()) {
			InternalEObject oldAwsnetworking = (InternalEObject)awsnetworking;
			awsnetworking = (AWSNetworking)eResolveProxy(oldAwsnetworking);
			if (awsnetworking != oldAwsnetworking) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PcsPackage.CVO__AWSNETWORKING, oldAwsnetworking, awsnetworking));
			}
		}
		return awsnetworking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AWSNetworking basicGetAwsnetworking() {
		return awsnetworking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAwsnetworking(AWSNetworking newAwsnetworking, NotificationChain msgs) {
		AWSNetworking oldAwsnetworking = awsnetworking;
		awsnetworking = newAwsnetworking;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PcsPackage.CVO__AWSNETWORKING, oldAwsnetworking, newAwsnetworking);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwsnetworking(AWSNetworking newAwsnetworking) {
		if (newAwsnetworking != awsnetworking) {
			NotificationChain msgs = null;
			if (awsnetworking != null)
				msgs = ((InternalEObject)awsnetworking).eInverseRemove(this, PcsPackage.AWS_NETWORKING__CVO, AWSNetworking.class, msgs);
			if (newAwsnetworking != null)
				msgs = ((InternalEObject)newAwsnetworking).eInverseAdd(this, PcsPackage.AWS_NETWORKING__CVO, AWSNetworking.class, msgs);
			msgs = basicSetAwsnetworking(newAwsnetworking, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.CVO__AWSNETWORKING, newAwsnetworking, newAwsnetworking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Volume> getVolumes() {
		if (volumes == null) {
			volumes = new EObjectContainmentEList<Volume>(Volume.class, this, PcsPackage.CVO__VOLUMES);
		}
		return volumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(String newVolume) {
		String oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.CVO__VOLUME, oldVolume, volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcsPackage.CVO__AWSNETWORKING:
				if (awsnetworking != null)
					msgs = ((InternalEObject)awsnetworking).eInverseRemove(this, PcsPackage.AWS_NETWORKING__CVO, AWSNetworking.class, msgs);
				return basicSetAwsnetworking((AWSNetworking)otherEnd, msgs);
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
			case PcsPackage.CVO__AWSNETWORKING:
				return basicSetAwsnetworking(null, msgs);
			case PcsPackage.CVO__VOLUMES:
				return ((InternalEList<?>)getVolumes()).basicRemove(otherEnd, msgs);
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
			case PcsPackage.CVO__AWSNETWORKING:
				if (resolve) return getAwsnetworking();
				return basicGetAwsnetworking();
			case PcsPackage.CVO__VOLUMES:
				return getVolumes();
			case PcsPackage.CVO__VOLUME:
				return getVolume();
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
			case PcsPackage.CVO__AWSNETWORKING:
				setAwsnetworking((AWSNetworking)newValue);
				return;
			case PcsPackage.CVO__VOLUMES:
				getVolumes().clear();
				getVolumes().addAll((Collection<? extends Volume>)newValue);
				return;
			case PcsPackage.CVO__VOLUME:
				setVolume((String)newValue);
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
			case PcsPackage.CVO__AWSNETWORKING:
				setAwsnetworking((AWSNetworking)null);
				return;
			case PcsPackage.CVO__VOLUMES:
				getVolumes().clear();
				return;
			case PcsPackage.CVO__VOLUME:
				setVolume(VOLUME_EDEFAULT);
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
			case PcsPackage.CVO__AWSNETWORKING:
				return awsnetworking != null;
			case PcsPackage.CVO__VOLUMES:
				return volumes != null && !volumes.isEmpty();
			case PcsPackage.CVO__VOLUME:
				return VOLUME_EDEFAULT == null ? volume != null : !VOLUME_EDEFAULT.equals(volume);
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
		result.append(" (volume: ");
		result.append(volume);
		result.append(')');
		return result.toString();
	}

} //CVOImpl
