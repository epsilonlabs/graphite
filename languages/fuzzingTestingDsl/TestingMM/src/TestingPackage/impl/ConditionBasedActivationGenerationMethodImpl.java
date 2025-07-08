/**
 */
package TestingPackage.impl;

import TestingPackage.ConditionBasedActivationGenerationMethod;
import TestingPackage.TestingMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Based Activation Generation Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.impl.ConditionBasedActivationGenerationMethodImpl#getConditionDepth <em>Condition Depth</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionBasedActivationGenerationMethodImpl extends ActivationGenerationMethodImpl implements ConditionBasedActivationGenerationMethod {
	/**
	 * The default value of the '{@link #getConditionDepth() <em>Condition Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionDepth()
	 * @generated
	 * @ordered
	 */
	protected static final int CONDITION_DEPTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConditionDepth() <em>Condition Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionDepth()
	 * @generated
	 * @ordered
	 */
	protected int conditionDepth = CONDITION_DEPTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionBasedActivationGenerationMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestingMMPackage.Literals.CONDITION_BASED_ACTIVATION_GENERATION_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConditionDepth() {
		return conditionDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionDepth(int newConditionDepth) {
		int oldConditionDepth = conditionDepth;
		conditionDepth = newConditionDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingMMPackage.CONDITION_BASED_ACTIVATION_GENERATION_METHOD__CONDITION_DEPTH, oldConditionDepth, conditionDepth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestingMMPackage.CONDITION_BASED_ACTIVATION_GENERATION_METHOD__CONDITION_DEPTH:
				return getConditionDepth();
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
			case TestingMMPackage.CONDITION_BASED_ACTIVATION_GENERATION_METHOD__CONDITION_DEPTH:
				setConditionDepth((Integer)newValue);
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
			case TestingMMPackage.CONDITION_BASED_ACTIVATION_GENERATION_METHOD__CONDITION_DEPTH:
				setConditionDepth(CONDITION_DEPTH_EDEFAULT);
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
			case TestingMMPackage.CONDITION_BASED_ACTIVATION_GENERATION_METHOD__CONDITION_DEPTH:
				return conditionDepth != CONDITION_DEPTH_EDEFAULT;
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
		result.append(" (conditionDepth: ");
		result.append(conditionDepth);
		result.append(')');
		return result.toString();
	}

} //ConditionBasedActivationGenerationMethodImpl
