/**
 */
package TestingPackage.Metrics.impl;

import TestingPackage.Metrics.MetricDefault;
import TestingPackage.Metrics.MetricsPackage;

import graphite.shared.CustomEObjectImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metric Default</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.Metrics.impl.MetricDefaultImpl#getDefaultVal <em>Default Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetricDefaultImpl extends CustomEObjectImpl implements MetricDefault {
	/**
	 * The default value of the '{@link #getDefaultVal() <em>Default Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultVal()
	 * @generated
	 * @ordered
	 */
	protected static final double DEFAULT_VAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDefaultVal() <em>Default Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultVal()
	 * @generated
	 * @ordered
	 */
	protected double defaultVal = DEFAULT_VAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricDefaultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.METRIC_DEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDefaultVal() {
		return defaultVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultVal(double newDefaultVal) {
		double oldDefaultVal = defaultVal;
		defaultVal = newDefaultVal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.METRIC_DEFAULT__DEFAULT_VAL, oldDefaultVal, defaultVal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetricsPackage.METRIC_DEFAULT__DEFAULT_VAL:
				return getDefaultVal();
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
			case MetricsPackage.METRIC_DEFAULT__DEFAULT_VAL:
				setDefaultVal((Double)newValue);
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
			case MetricsPackage.METRIC_DEFAULT__DEFAULT_VAL:
				setDefaultVal(DEFAULT_VAL_EDEFAULT);
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
			case MetricsPackage.METRIC_DEFAULT__DEFAULT_VAL:
				return defaultVal != DEFAULT_VAL_EDEFAULT;
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
		result.append(" (defaultVal: ");
		result.append(defaultVal);
		result.append(')');
		return result.toString();
	}

} //MetricDefaultImpl
