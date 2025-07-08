/**
 */
package TestingPackage.impl;

import TestingPackage.TestingMMPackage;
import TestingPackage.TimeBasedEnd;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Based End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.impl.TimeBasedEndImpl#getTimeLimitSeconds <em>Time Limit Seconds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeBasedEndImpl extends ExecutionEndTriggerImpl implements TimeBasedEnd {
	/**
	 * The default value of the '{@link #getTimeLimitSeconds() <em>Time Limit Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLimitSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_LIMIT_SECONDS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimeLimitSeconds() <em>Time Limit Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeLimitSeconds()
	 * @generated
	 * @ordered
	 */
	protected long timeLimitSeconds = TIME_LIMIT_SECONDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeBasedEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestingMMPackage.Literals.TIME_BASED_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimeLimitSeconds() {
		return timeLimitSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeLimitSeconds(long newTimeLimitSeconds) {
		long oldTimeLimitSeconds = timeLimitSeconds;
		timeLimitSeconds = newTimeLimitSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingMMPackage.TIME_BASED_END__TIME_LIMIT_SECONDS, oldTimeLimitSeconds, timeLimitSeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestingMMPackage.TIME_BASED_END__TIME_LIMIT_SECONDS:
				return getTimeLimitSeconds();
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
			case TestingMMPackage.TIME_BASED_END__TIME_LIMIT_SECONDS:
				setTimeLimitSeconds((Long)newValue);
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
			case TestingMMPackage.TIME_BASED_END__TIME_LIMIT_SECONDS:
				setTimeLimitSeconds(TIME_LIMIT_SECONDS_EDEFAULT);
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
			case TestingMMPackage.TIME_BASED_END__TIME_LIMIT_SECONDS:
				return timeLimitSeconds != TIME_LIMIT_SECONDS_EDEFAULT;
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
		result.append(" (timeLimitSeconds: ");
		result.append(timeLimitSeconds);
		result.append(')');
		return result.toString();
	}

} //TimeBasedEndImpl
