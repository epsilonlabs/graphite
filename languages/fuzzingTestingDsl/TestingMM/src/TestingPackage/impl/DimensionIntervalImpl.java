/**
 */
package TestingPackage.impl;

import TestingPackage.DimensionID;
import TestingPackage.DimensionInterval;
import TestingPackage.TestingMMPackage;

import graphite.shared.CustomEObjectImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.impl.DimensionIntervalImpl#getDimID <em>Dim ID</em>}</li>
 *   <li>{@link TestingPackage.impl.DimensionIntervalImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link TestingPackage.impl.DimensionIntervalImpl#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link TestingPackage.impl.DimensionIntervalImpl#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimensionIntervalImpl extends CustomEObjectImpl implements DimensionInterval {
	/**
	 * The default value of the '{@link #getDimID() <em>Dim ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimID()
	 * @generated
	 * @ordered
	 */
	protected static final DimensionID DIM_ID_EDEFAULT = DimensionID.T1_TIME_MIDPOINT_MEAN;

	/**
	 * The cached value of the '{@link #getDimID() <em>Dim ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimID()
	 * @generated
	 * @ordered
	 */
	protected DimensionID dimID = DIM_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinValue()
	 * @generated
	 * @ordered
	 */
	protected double minValue = MIN_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxValue()
	 * @generated
	 * @ordered
	 */
	protected double maxValue = MAX_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected int count = COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionIntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestingMMPackage.Literals.DIMENSION_INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionID getDimID() {
		return dimID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimID(DimensionID newDimID) {
		DimensionID oldDimID = dimID;
		dimID = newDimID == null ? DIM_ID_EDEFAULT : newDimID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingMMPackage.DIMENSION_INTERVAL__DIM_ID, oldDimID, dimID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinValue() {
		return minValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinValue(double newMinValue) {
		double oldMinValue = minValue;
		minValue = newMinValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingMMPackage.DIMENSION_INTERVAL__MIN_VALUE, oldMinValue, minValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxValue() {
		return maxValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxValue(double newMaxValue) {
		double oldMaxValue = maxValue;
		maxValue = newMaxValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingMMPackage.DIMENSION_INTERVAL__MAX_VALUE, oldMaxValue, maxValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(int newCount) {
		int oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingMMPackage.DIMENSION_INTERVAL__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestingMMPackage.DIMENSION_INTERVAL__DIM_ID:
				return getDimID();
			case TestingMMPackage.DIMENSION_INTERVAL__MIN_VALUE:
				return getMinValue();
			case TestingMMPackage.DIMENSION_INTERVAL__MAX_VALUE:
				return getMaxValue();
			case TestingMMPackage.DIMENSION_INTERVAL__COUNT:
				return getCount();
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
			case TestingMMPackage.DIMENSION_INTERVAL__DIM_ID:
				setDimID((DimensionID)newValue);
				return;
			case TestingMMPackage.DIMENSION_INTERVAL__MIN_VALUE:
				setMinValue((Double)newValue);
				return;
			case TestingMMPackage.DIMENSION_INTERVAL__MAX_VALUE:
				setMaxValue((Double)newValue);
				return;
			case TestingMMPackage.DIMENSION_INTERVAL__COUNT:
				setCount((Integer)newValue);
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
			case TestingMMPackage.DIMENSION_INTERVAL__DIM_ID:
				setDimID(DIM_ID_EDEFAULT);
				return;
			case TestingMMPackage.DIMENSION_INTERVAL__MIN_VALUE:
				setMinValue(MIN_VALUE_EDEFAULT);
				return;
			case TestingMMPackage.DIMENSION_INTERVAL__MAX_VALUE:
				setMaxValue(MAX_VALUE_EDEFAULT);
				return;
			case TestingMMPackage.DIMENSION_INTERVAL__COUNT:
				setCount(COUNT_EDEFAULT);
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
			case TestingMMPackage.DIMENSION_INTERVAL__DIM_ID:
				return dimID != DIM_ID_EDEFAULT;
			case TestingMMPackage.DIMENSION_INTERVAL__MIN_VALUE:
				return minValue != MIN_VALUE_EDEFAULT;
			case TestingMMPackage.DIMENSION_INTERVAL__MAX_VALUE:
				return maxValue != MAX_VALUE_EDEFAULT;
			case TestingMMPackage.DIMENSION_INTERVAL__COUNT:
				return count != COUNT_EDEFAULT;
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
		result.append(" (dimID: ");
		result.append(dimID);
		result.append(", minValue: ");
		result.append(minValue);
		result.append(", maxValue: ");
		result.append(maxValue);
		result.append(", count: ");
		result.append(count);
		result.append(')');
		return result.toString();
	}

} //DimensionIntervalImpl
