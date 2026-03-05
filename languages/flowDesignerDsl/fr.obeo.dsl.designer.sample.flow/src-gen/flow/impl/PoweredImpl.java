/**
 */
package flow.impl;

import flow.FlowPackage;
import flow.Powered;
import flow.PoweredStatus;

import graphite.shared.CustomEObjectImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Powered</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link flow.impl.PoweredImpl#getConsumption <em>Consumption</em>}</li>
 *   <li>{@link flow.impl.PoweredImpl#getPowerStatus <em>Power Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PoweredImpl extends CustomEObjectImpl implements Powered {
	/**
	 * The default value of the '{@link #getConsumption() <em>Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumption()
	 * @generated
	 * @ordered
	 */
	protected static final int CONSUMPTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConsumption() <em>Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumption()
	 * @generated
	 * @ordered
	 */
	protected int consumption = CONSUMPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPowerStatus() <em>Power Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerStatus()
	 * @generated
	 * @ordered
	 */
	protected static final PoweredStatus POWER_STATUS_EDEFAULT = PoweredStatus.NONE;

	/**
	 * The cached value of the '{@link #getPowerStatus() <em>Power Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerStatus()
	 * @generated
	 * @ordered
	 */
	protected PoweredStatus powerStatus = POWER_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoweredImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.POWERED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConsumption() {
		return consumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsumption(int newConsumption) {
		int oldConsumption = consumption;
		consumption = newConsumption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.POWERED__CONSUMPTION, oldConsumption, consumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoweredStatus getPowerStatus() {
		return powerStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerStatus(PoweredStatus newPowerStatus) {
		PoweredStatus oldPowerStatus = powerStatus;
		powerStatus = newPowerStatus == null ? POWER_STATUS_EDEFAULT : newPowerStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.POWERED__POWER_STATUS, oldPowerStatus, powerStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowPackage.POWERED__CONSUMPTION:
				return getConsumption();
			case FlowPackage.POWERED__POWER_STATUS:
				return getPowerStatus();
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
			case FlowPackage.POWERED__CONSUMPTION:
				setConsumption((Integer)newValue);
				return;
			case FlowPackage.POWERED__POWER_STATUS:
				setPowerStatus((PoweredStatus)newValue);
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
			case FlowPackage.POWERED__CONSUMPTION:
				setConsumption(CONSUMPTION_EDEFAULT);
				return;
			case FlowPackage.POWERED__POWER_STATUS:
				setPowerStatus(POWER_STATUS_EDEFAULT);
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
			case FlowPackage.POWERED__CONSUMPTION:
				return consumption != CONSUMPTION_EDEFAULT;
			case FlowPackage.POWERED__POWER_STATUS:
				return powerStatus != POWER_STATUS_EDEFAULT;
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
		result.append(" (consumption: ");
		result.append(consumption);
		result.append(", powerStatus: ");
		result.append(powerStatus);
		result.append(')');
		return result.toString();
	}

} //PoweredImpl
