/**
 */
package pcs.impl;

import graphite.shared.CustomEObjectImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pcs.AWSConfiguration;
import pcs.PcsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AWS Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcs.impl.AWSConfigurationImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link pcs.impl.AWSConfigurationImpl#getVpc_id <em>Vpc id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AWSConfigurationImpl extends CustomEObjectImpl implements AWSConfiguration {
	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected String region = REGION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVpc_id() <em>Vpc id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpc_id()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpc_id() <em>Vpc id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpc_id()
	 * @generated
	 * @ordered
	 */
	protected String vpc_id = VPC_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AWSConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcsPackage.Literals.AWS_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(String newRegion) {
		String oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.AWS_CONFIGURATION__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVpc_id() {
		return vpc_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVpc_id(String newVpc_id) {
		String oldVpc_id = vpc_id;
		vpc_id = newVpc_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.AWS_CONFIGURATION__VPC_ID, oldVpc_id, vpc_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcsPackage.AWS_CONFIGURATION__REGION:
				return getRegion();
			case PcsPackage.AWS_CONFIGURATION__VPC_ID:
				return getVpc_id();
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
			case PcsPackage.AWS_CONFIGURATION__REGION:
				setRegion((String)newValue);
				return;
			case PcsPackage.AWS_CONFIGURATION__VPC_ID:
				setVpc_id((String)newValue);
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
			case PcsPackage.AWS_CONFIGURATION__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case PcsPackage.AWS_CONFIGURATION__VPC_ID:
				setVpc_id(VPC_ID_EDEFAULT);
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
			case PcsPackage.AWS_CONFIGURATION__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case PcsPackage.AWS_CONFIGURATION__VPC_ID:
				return VPC_ID_EDEFAULT == null ? vpc_id != null : !VPC_ID_EDEFAULT.equals(vpc_id);
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
		result.append(" (region: ");
		result.append(region);
		result.append(", vpc_id: ");
		result.append(vpc_id);
		result.append(')');
		return result.toString();
	}

} //AWSConfigurationImpl
