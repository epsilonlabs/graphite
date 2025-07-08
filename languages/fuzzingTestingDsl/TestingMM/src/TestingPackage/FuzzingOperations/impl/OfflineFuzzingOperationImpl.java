/**
 */
package TestingPackage.FuzzingOperations.impl;

import TestingPackage.FuzzingOperations.FuzzingOperationsPackage;
import TestingPackage.FuzzingOperations.OfflineFuzzingOperation;
import TestingPackage.FuzzingOperations.OfflineOperationTime;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Offline Fuzzing Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.OfflineFuzzingOperationImpl#getOperationTime <em>Operation Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OfflineFuzzingOperationImpl extends FuzzingOperationImpl implements OfflineFuzzingOperation {
	/**
	 * The default value of the '{@link #getOperationTime() <em>Operation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationTime()
	 * @generated
	 * @ordered
	 */
	protected static final OfflineOperationTime OPERATION_TIME_EDEFAULT = OfflineOperationTime.PRE;

	/**
	 * The cached value of the '{@link #getOperationTime() <em>Operation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationTime()
	 * @generated
	 * @ordered
	 */
	protected OfflineOperationTime operationTime = OPERATION_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OfflineFuzzingOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FuzzingOperationsPackage.Literals.OFFLINE_FUZZING_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OfflineOperationTime getOperationTime() {
		return operationTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationTime(OfflineOperationTime newOperationTime) {
		OfflineOperationTime oldOperationTime = operationTime;
		operationTime = newOperationTime == null ? OPERATION_TIME_EDEFAULT : newOperationTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.OFFLINE_FUZZING_OPERATION__OPERATION_TIME, oldOperationTime, operationTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FuzzingOperationsPackage.OFFLINE_FUZZING_OPERATION__OPERATION_TIME:
				return getOperationTime();
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
			case FuzzingOperationsPackage.OFFLINE_FUZZING_OPERATION__OPERATION_TIME:
				setOperationTime((OfflineOperationTime)newValue);
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
			case FuzzingOperationsPackage.OFFLINE_FUZZING_OPERATION__OPERATION_TIME:
				setOperationTime(OPERATION_TIME_EDEFAULT);
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
			case FuzzingOperationsPackage.OFFLINE_FUZZING_OPERATION__OPERATION_TIME:
				return operationTime != OPERATION_TIME_EDEFAULT;
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
		result.append(" (operationTime: ");
		result.append(operationTime);
		result.append(')');
		return result.toString();
	}

} //OfflineFuzzingOperationImpl
