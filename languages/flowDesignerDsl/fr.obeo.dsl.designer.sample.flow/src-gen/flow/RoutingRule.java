/**
 */
package flow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Routing Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flow.RoutingRule#getTarget <em>Target</em>}</li>
 *   <li>{@link flow.RoutingRule#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link flow.RoutingRule#getUnit <em>Unit</em>}</li>
 *   <li>{@link flow.RoutingRule#getComparisonOperator <em>Comparison Operator</em>}</li>
 *   <li>{@link flow.RoutingRule#getValue <em>Value</em>}</li>
 *   <li>{@link flow.RoutingRule#getSystemStatus <em>System Status</em>}</li>
 * </ul>
 *
 * @see flow.FlowPackage#getRoutingRule()
 * @model
 * @generated
 */
public interface RoutingRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(flow.System)
	 * @see flow.FlowPackage#getRoutingRule_Target()
	 * @model
	 * @generated
	 */
	flow.System getTarget();

	/**
	 * Sets the value of the '{@link flow.RoutingRule#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(flow.System value);

	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * The literals are from the enumeration {@link flow.SystemProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see flow.SystemProperty
	 * @see #setPropertyName(SystemProperty)
	 * @see flow.FlowPackage#getRoutingRule_PropertyName()
	 * @model
	 * @generated
	 */
	SystemProperty getPropertyName();

	/**
	 * Sets the value of the '{@link flow.RoutingRule#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see flow.SystemProperty
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(SystemProperty value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link flow.PropertyUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see flow.PropertyUnit
	 * @see #setUnit(PropertyUnit)
	 * @see flow.FlowPackage#getRoutingRule_Unit()
	 * @model
	 * @generated
	 */
	PropertyUnit getUnit();

	/**
	 * Sets the value of the '{@link flow.RoutingRule#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see flow.PropertyUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(PropertyUnit value);

	/**
	 * Returns the value of the '<em><b>Comparison Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link flow.ComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Operator</em>' attribute.
	 * @see flow.ComparisonOperator
	 * @see #setComparisonOperator(ComparisonOperator)
	 * @see flow.FlowPackage#getRoutingRule_ComparisonOperator()
	 * @model
	 * @generated
	 */
	ComparisonOperator getComparisonOperator();

	/**
	 * Sets the value of the '{@link flow.RoutingRule#getComparisonOperator <em>Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Operator</em>' attribute.
	 * @see flow.ComparisonOperator
	 * @see #getComparisonOperator()
	 * @generated
	 */
	void setComparisonOperator(ComparisonOperator value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see flow.FlowPackage#getRoutingRule_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link flow.RoutingRule#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>System Status</b></em>' attribute.
	 * The literals are from the enumeration {@link flow.SystemStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Status</em>' attribute.
	 * @see flow.SystemStatus
	 * @see #setSystemStatus(SystemStatus)
	 * @see flow.FlowPackage#getRoutingRule_SystemStatus()
	 * @model
	 * @generated
	 */
	SystemStatus getSystemStatus();

	/**
	 * Sets the value of the '{@link flow.RoutingRule#getSystemStatus <em>System Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Status</em>' attribute.
	 * @see flow.SystemStatus
	 * @see #getSystemStatus()
	 * @generated
	 */
	void setSystemStatus(SystemStatus value);

} // RoutingRule
