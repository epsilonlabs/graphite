/**
 */
package pcs.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pcs.AWSNetworkingHA;
import pcs.CVO_HA;
import pcs.PcsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CVO HA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcs.impl.CVO_HAImpl#getAwsnetworkingha <em>Awsnetworkingha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CVO_HAImpl extends CVOConfigurationImpl implements CVO_HA {
	/**
	 * The cached value of the '{@link #getAwsnetworkingha() <em>Awsnetworkingha</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwsnetworkingha()
	 * @generated
	 * @ordered
	 */
	protected AWSNetworkingHA awsnetworkingha;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CVO_HAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcsPackage.Literals.CVO_HA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AWSNetworkingHA getAwsnetworkingha() {
		if (awsnetworkingha != null && awsnetworkingha.eIsProxy()) {
			InternalEObject oldAwsnetworkingha = (InternalEObject)awsnetworkingha;
			awsnetworkingha = (AWSNetworkingHA)eResolveProxy(oldAwsnetworkingha);
			if (awsnetworkingha != oldAwsnetworkingha) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PcsPackage.CVO_HA__AWSNETWORKINGHA, oldAwsnetworkingha, awsnetworkingha));
			}
		}
		return awsnetworkingha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AWSNetworkingHA basicGetAwsnetworkingha() {
		return awsnetworkingha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAwsnetworkingha(AWSNetworkingHA newAwsnetworkingha, NotificationChain msgs) {
		AWSNetworkingHA oldAwsnetworkingha = awsnetworkingha;
		awsnetworkingha = newAwsnetworkingha;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PcsPackage.CVO_HA__AWSNETWORKINGHA, oldAwsnetworkingha, newAwsnetworkingha);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAwsnetworkingha(AWSNetworkingHA newAwsnetworkingha) {
		if (newAwsnetworkingha != awsnetworkingha) {
			NotificationChain msgs = null;
			if (awsnetworkingha != null)
				msgs = ((InternalEObject)awsnetworkingha).eInverseRemove(this, PcsPackage.AWS_NETWORKING_HA__CVO_HA, AWSNetworkingHA.class, msgs);
			if (newAwsnetworkingha != null)
				msgs = ((InternalEObject)newAwsnetworkingha).eInverseAdd(this, PcsPackage.AWS_NETWORKING_HA__CVO_HA, AWSNetworkingHA.class, msgs);
			msgs = basicSetAwsnetworkingha(newAwsnetworkingha, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.CVO_HA__AWSNETWORKINGHA, newAwsnetworkingha, newAwsnetworkingha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcsPackage.CVO_HA__AWSNETWORKINGHA:
				if (awsnetworkingha != null)
					msgs = ((InternalEObject)awsnetworkingha).eInverseRemove(this, PcsPackage.AWS_NETWORKING_HA__CVO_HA, AWSNetworkingHA.class, msgs);
				return basicSetAwsnetworkingha((AWSNetworkingHA)otherEnd, msgs);
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
			case PcsPackage.CVO_HA__AWSNETWORKINGHA:
				return basicSetAwsnetworkingha(null, msgs);
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
			case PcsPackage.CVO_HA__AWSNETWORKINGHA:
				if (resolve) return getAwsnetworkingha();
				return basicGetAwsnetworkingha();
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
			case PcsPackage.CVO_HA__AWSNETWORKINGHA:
				setAwsnetworkingha((AWSNetworkingHA)newValue);
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
			case PcsPackage.CVO_HA__AWSNETWORKINGHA:
				setAwsnetworkingha((AWSNetworkingHA)null);
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
			case PcsPackage.CVO_HA__AWSNETWORKINGHA:
				return awsnetworkingha != null;
		}
		return super.eIsSet(featureID);
	}

} //CVO_HAImpl
