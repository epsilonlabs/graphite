/**
 */
package TestingPackage.Metrics.impl;

import TestingPackage.MRSPackage.Variable;

import TestingPackage.Metrics.MetricsPackage;
import TestingPackage.Metrics.VariableMetric;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.Metrics.impl.VariableMetricImpl#getChosenVariables <em>Chosen Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableMetricImpl extends MetricImpl implements VariableMetric {
	/**
	 * The cached value of the '{@link #getChosenVariables() <em>Chosen Variables</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChosenVariables()
	 * @generated
	 * @ordered
	 */
	protected Variable chosenVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.VARIABLE_METRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getChosenVariables() {
		if (chosenVariables != null && chosenVariables.eIsProxy()) {
			InternalEObject oldChosenVariables = (InternalEObject)chosenVariables;
			chosenVariables = (Variable)eResolveProxy(oldChosenVariables);
			if (chosenVariables != oldChosenVariables) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetricsPackage.VARIABLE_METRIC__CHOSEN_VARIABLES, oldChosenVariables, chosenVariables));
			}
		}
		return chosenVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetChosenVariables() {
		return chosenVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChosenVariables(Variable newChosenVariables) {
		Variable oldChosenVariables = chosenVariables;
		chosenVariables = newChosenVariables;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.VARIABLE_METRIC__CHOSEN_VARIABLES, oldChosenVariables, chosenVariables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetricsPackage.VARIABLE_METRIC__CHOSEN_VARIABLES:
				if (resolve) return getChosenVariables();
				return basicGetChosenVariables();
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
			case MetricsPackage.VARIABLE_METRIC__CHOSEN_VARIABLES:
				setChosenVariables((Variable)newValue);
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
			case MetricsPackage.VARIABLE_METRIC__CHOSEN_VARIABLES:
				setChosenVariables((Variable)null);
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
			case MetricsPackage.VARIABLE_METRIC__CHOSEN_VARIABLES:
				return chosenVariables != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableMetricImpl
