/**
 */
package TestingPackage.impl;

import TestingPackage.RepeatedExecution;
import TestingPackage.Test;
import TestingPackage.TestingMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Repeated Execution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.impl.RepeatedExecutionImpl#getTestToRepeat <em>Test To Repeat</em>}</li>
 *   <li>{@link TestingPackage.impl.RepeatedExecutionImpl#getRepeatCount <em>Repeat Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RepeatedExecutionImpl extends TestGenerationApproachImpl implements RepeatedExecution {
	/**
	 * The cached value of the '{@link #getTestToRepeat() <em>Test To Repeat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestToRepeat()
	 * @generated
	 * @ordered
	 */
	protected Test testToRepeat;

	/**
	 * The default value of the '{@link #getRepeatCount() <em>Repeat Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatCount()
	 * @generated
	 * @ordered
	 */
	protected static final int REPEAT_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRepeatCount() <em>Repeat Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepeatCount()
	 * @generated
	 * @ordered
	 */
	protected int repeatCount = REPEAT_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RepeatedExecutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestingMMPackage.Literals.REPEATED_EXECUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test getTestToRepeat() {
		if (testToRepeat != null && testToRepeat.eIsProxy()) {
			InternalEObject oldTestToRepeat = (InternalEObject)testToRepeat;
			testToRepeat = (Test)eResolveProxy(oldTestToRepeat);
			if (testToRepeat != oldTestToRepeat) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestingMMPackage.REPEATED_EXECUTION__TEST_TO_REPEAT, oldTestToRepeat, testToRepeat));
			}
		}
		return testToRepeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test basicGetTestToRepeat() {
		return testToRepeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestToRepeat(Test newTestToRepeat) {
		Test oldTestToRepeat = testToRepeat;
		testToRepeat = newTestToRepeat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingMMPackage.REPEATED_EXECUTION__TEST_TO_REPEAT, oldTestToRepeat, testToRepeat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRepeatCount() {
		return repeatCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepeatCount(int newRepeatCount) {
		int oldRepeatCount = repeatCount;
		repeatCount = newRepeatCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingMMPackage.REPEATED_EXECUTION__REPEAT_COUNT, oldRepeatCount, repeatCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestingMMPackage.REPEATED_EXECUTION__TEST_TO_REPEAT:
				if (resolve) return getTestToRepeat();
				return basicGetTestToRepeat();
			case TestingMMPackage.REPEATED_EXECUTION__REPEAT_COUNT:
				return getRepeatCount();
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
			case TestingMMPackage.REPEATED_EXECUTION__TEST_TO_REPEAT:
				setTestToRepeat((Test)newValue);
				return;
			case TestingMMPackage.REPEATED_EXECUTION__REPEAT_COUNT:
				setRepeatCount((Integer)newValue);
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
			case TestingMMPackage.REPEATED_EXECUTION__TEST_TO_REPEAT:
				setTestToRepeat((Test)null);
				return;
			case TestingMMPackage.REPEATED_EXECUTION__REPEAT_COUNT:
				setRepeatCount(REPEAT_COUNT_EDEFAULT);
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
			case TestingMMPackage.REPEATED_EXECUTION__TEST_TO_REPEAT:
				return testToRepeat != null;
			case TestingMMPackage.REPEATED_EXECUTION__REPEAT_COUNT:
				return repeatCount != REPEAT_COUNT_EDEFAULT;
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
		result.append(" (repeatCount: ");
		result.append(repeatCount);
		result.append(')');
		return result.toString();
	}

} //RepeatedExecutionImpl
