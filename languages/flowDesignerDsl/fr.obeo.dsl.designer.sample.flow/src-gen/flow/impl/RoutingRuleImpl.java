/**
 */
package flow.impl;

import flow.ComparisonOperator;
import flow.FlowPackage;
import flow.PropertyUnit;
import flow.RoutingRule;
import flow.SystemProperty;
import flow.SystemStatus;

import graphite.shared.CustomEObjectImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Routing Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link flow.impl.RoutingRuleImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link flow.impl.RoutingRuleImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link flow.impl.RoutingRuleImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link flow.impl.RoutingRuleImpl#getComparisonOperator <em>Comparison Operator</em>}</li>
 *   <li>{@link flow.impl.RoutingRuleImpl#getValue <em>Value</em>}</li>
 *   <li>{@link flow.impl.RoutingRuleImpl#getSystemStatus <em>System Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoutingRuleImpl extends CustomEObjectImpl implements RoutingRule {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected flow.System target;

	/**
	 * The default value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected static final SystemProperty PROPERTY_NAME_EDEFAULT = SystemProperty.TEMPERATURE;

	/**
	 * The cached value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected SystemProperty propertyName = PROPERTY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final PropertyUnit UNIT_EDEFAULT = PropertyUnit.CELSIUS;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected PropertyUnit unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getComparisonOperator() <em>Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonOperator()
	 * @generated
	 * @ordered
	 */
	protected static final ComparisonOperator COMPARISON_OPERATOR_EDEFAULT = ComparisonOperator.LOWER_THAN;

	/**
	 * The cached value of the '{@link #getComparisonOperator() <em>Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonOperator()
	 * @generated
	 * @ordered
	 */
	protected ComparisonOperator comparisonOperator = COMPARISON_OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemStatus() <em>System Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemStatus()
	 * @generated
	 * @ordered
	 */
	protected static final SystemStatus SYSTEM_STATUS_EDEFAULT = SystemStatus.LOW;

	/**
	 * The cached value of the '{@link #getSystemStatus() <em>System Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemStatus()
	 * @generated
	 * @ordered
	 */
	protected SystemStatus systemStatus = SYSTEM_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoutingRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FlowPackage.Literals.ROUTING_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public flow.System getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (flow.System)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FlowPackage.ROUTING_RULE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public flow.System basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(flow.System newTarget) {
		flow.System oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.ROUTING_RULE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemProperty getPropertyName() {
		return propertyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyName(SystemProperty newPropertyName) {
		SystemProperty oldPropertyName = propertyName;
		propertyName = newPropertyName == null ? PROPERTY_NAME_EDEFAULT : newPropertyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.ROUTING_RULE__PROPERTY_NAME, oldPropertyName, propertyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyUnit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(PropertyUnit newUnit) {
		PropertyUnit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.ROUTING_RULE__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperator getComparisonOperator() {
		return comparisonOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparisonOperator(ComparisonOperator newComparisonOperator) {
		ComparisonOperator oldComparisonOperator = comparisonOperator;
		comparisonOperator = newComparisonOperator == null ? COMPARISON_OPERATOR_EDEFAULT : newComparisonOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.ROUTING_RULE__COMPARISON_OPERATOR, oldComparisonOperator, comparisonOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.ROUTING_RULE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemStatus getSystemStatus() {
		return systemStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemStatus(SystemStatus newSystemStatus) {
		SystemStatus oldSystemStatus = systemStatus;
		systemStatus = newSystemStatus == null ? SYSTEM_STATUS_EDEFAULT : newSystemStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FlowPackage.ROUTING_RULE__SYSTEM_STATUS, oldSystemStatus, systemStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FlowPackage.ROUTING_RULE__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case FlowPackage.ROUTING_RULE__PROPERTY_NAME:
				return getPropertyName();
			case FlowPackage.ROUTING_RULE__UNIT:
				return getUnit();
			case FlowPackage.ROUTING_RULE__COMPARISON_OPERATOR:
				return getComparisonOperator();
			case FlowPackage.ROUTING_RULE__VALUE:
				return getValue();
			case FlowPackage.ROUTING_RULE__SYSTEM_STATUS:
				return getSystemStatus();
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
			case FlowPackage.ROUTING_RULE__TARGET:
				setTarget((flow.System)newValue);
				return;
			case FlowPackage.ROUTING_RULE__PROPERTY_NAME:
				setPropertyName((SystemProperty)newValue);
				return;
			case FlowPackage.ROUTING_RULE__UNIT:
				setUnit((PropertyUnit)newValue);
				return;
			case FlowPackage.ROUTING_RULE__COMPARISON_OPERATOR:
				setComparisonOperator((ComparisonOperator)newValue);
				return;
			case FlowPackage.ROUTING_RULE__VALUE:
				setValue((Integer)newValue);
				return;
			case FlowPackage.ROUTING_RULE__SYSTEM_STATUS:
				setSystemStatus((SystemStatus)newValue);
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
			case FlowPackage.ROUTING_RULE__TARGET:
				setTarget((flow.System)null);
				return;
			case FlowPackage.ROUTING_RULE__PROPERTY_NAME:
				setPropertyName(PROPERTY_NAME_EDEFAULT);
				return;
			case FlowPackage.ROUTING_RULE__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case FlowPackage.ROUTING_RULE__COMPARISON_OPERATOR:
				setComparisonOperator(COMPARISON_OPERATOR_EDEFAULT);
				return;
			case FlowPackage.ROUTING_RULE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case FlowPackage.ROUTING_RULE__SYSTEM_STATUS:
				setSystemStatus(SYSTEM_STATUS_EDEFAULT);
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
			case FlowPackage.ROUTING_RULE__TARGET:
				return target != null;
			case FlowPackage.ROUTING_RULE__PROPERTY_NAME:
				return propertyName != PROPERTY_NAME_EDEFAULT;
			case FlowPackage.ROUTING_RULE__UNIT:
				return unit != UNIT_EDEFAULT;
			case FlowPackage.ROUTING_RULE__COMPARISON_OPERATOR:
				return comparisonOperator != COMPARISON_OPERATOR_EDEFAULT;
			case FlowPackage.ROUTING_RULE__VALUE:
				return value != VALUE_EDEFAULT;
			case FlowPackage.ROUTING_RULE__SYSTEM_STATUS:
				return systemStatus != SYSTEM_STATUS_EDEFAULT;
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
		result.append(" (propertyName: ");
		result.append(propertyName);
		result.append(", unit: ");
		result.append(unit);
		result.append(", comparisonOperator: ");
		result.append(comparisonOperator);
		result.append(", value: ");
		result.append(value);
		result.append(", systemStatus: ");
		result.append(systemStatus);
		result.append(')');
		return result.toString();
	}

} //RoutingRuleImpl
