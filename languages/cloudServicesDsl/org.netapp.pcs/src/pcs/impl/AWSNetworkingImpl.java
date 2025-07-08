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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pcs.AWSNetworking;
import pcs.CVO;
import pcs.PcsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AWS Networking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcs.impl.AWSNetworkingImpl#getSubnet_id <em>Subnet id</em>}</li>
 *   <li>{@link pcs.impl.AWSNetworkingImpl#getCvo <em>Cvo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AWSNetworkingImpl extends AWSConfigurationImpl implements AWSNetworking {
	/**
	 * The default value of the '{@link #getSubnet_id() <em>Subnet id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnet_id()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnet_id() <em>Subnet id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnet_id()
	 * @generated
	 * @ordered
	 */
	protected String subnet_id = SUBNET_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCvo() <em>Cvo</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCvo()
	 * @generated
	 * @ordered
	 */
	protected EList<CVO> cvo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AWSNetworkingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcsPackage.Literals.AWS_NETWORKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubnet_id() {
		return subnet_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubnet_id(String newSubnet_id) {
		String oldSubnet_id = subnet_id;
		subnet_id = newSubnet_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.AWS_NETWORKING__SUBNET_ID, oldSubnet_id, subnet_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CVO> getCvo() {
		if (cvo == null) {
			cvo = new EObjectWithInverseResolvingEList<CVO>(CVO.class, this, PcsPackage.AWS_NETWORKING__CVO, PcsPackage.CVO__AWSNETWORKING);
		}
		return cvo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcsPackage.AWS_NETWORKING__CVO:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCvo()).basicAdd(otherEnd, msgs);
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
			case PcsPackage.AWS_NETWORKING__CVO:
				return ((InternalEList<?>)getCvo()).basicRemove(otherEnd, msgs);
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
			case PcsPackage.AWS_NETWORKING__SUBNET_ID:
				return getSubnet_id();
			case PcsPackage.AWS_NETWORKING__CVO:
				return getCvo();
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
			case PcsPackage.AWS_NETWORKING__SUBNET_ID:
				setSubnet_id((String)newValue);
				return;
			case PcsPackage.AWS_NETWORKING__CVO:
				getCvo().clear();
				getCvo().addAll((Collection<? extends CVO>)newValue);
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
			case PcsPackage.AWS_NETWORKING__SUBNET_ID:
				setSubnet_id(SUBNET_ID_EDEFAULT);
				return;
			case PcsPackage.AWS_NETWORKING__CVO:
				getCvo().clear();
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
			case PcsPackage.AWS_NETWORKING__SUBNET_ID:
				return SUBNET_ID_EDEFAULT == null ? subnet_id != null : !SUBNET_ID_EDEFAULT.equals(subnet_id);
			case PcsPackage.AWS_NETWORKING__CVO:
				return cvo != null && !cvo.isEmpty();
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
		result.append(" (subnet_id: ");
		result.append(subnet_id);
		result.append(')');
		return result.toString();
	}

} //AWSNetworkingImpl
