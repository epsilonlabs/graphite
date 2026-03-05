/**
 */
package fr.obeo.dsl.designer.sample.flow;

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
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.RoutingRule#getTarget <em>Target</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.RoutingRule#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.RoutingRule#getUnit <em>Unit</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.RoutingRule#getComparisonOperator <em>Comparison Operator</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.RoutingRule#getValue <em>Value</em>}</li>
 *   <li>{@link fr.obeo.dsl.designer.sample.flow.RoutingRule#getSystemStatus <em>System Status</em>}</li>
 * </ul>
 *
 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getRoutingRule()
 * @model
 * @generated
 */
public interface RoutingRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(fr.obeo.dsl.designer.sample.flow.System)
	 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getRoutingRule_Target()
	 * @model
	 * @generated
	 */
	fr.obeo.dsl.designer.sample.flow.System getTarget();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.designer.sample.flow.RoutingRule#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(fr.obeo.dsl.designer.sample.flow.System value);

	/**
	 * Returns the value of the '<em><b>Property Name</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.obeo.dsl.designer.sample.flow.SystemProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Name</em>' attribute.
	 * @see fr.obeo.dsl.designer.sample.flow.SystemProperty
	 * @see #setPropertyName(SystemProperty)
	 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getRoutingRule_PropertyName()
	 * @model
	 * @generated
	 */
	SystemProperty getPropertyName();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.designer.sample.flow.RoutingRule#getPropertyName <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Name</em>' attribute.
	 * @see fr.obeo.dsl.designer.sample.flow.SystemProperty
	 * @see #getPropertyName()
	 * @generated
	 */
	void setPropertyName(SystemProperty value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getRoutingRule_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.designer.sample.flow.RoutingRule#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>System Status</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.obeo.dsl.designer.sample.flow.SystemStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Status</em>' attribute.
	 * @see fr.obeo.dsl.designer.sample.flow.SystemStatus
	 * @see #setSystemStatus(SystemStatus)
	 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getRoutingRule_SystemStatus()
	 * @model
	 * @generated
	 */
	SystemStatus getSystemStatus();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.designer.sample.flow.RoutingRule#getSystemStatus <em>System Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Status</em>' attribute.
	 * @see fr.obeo.dsl.designer.sample.flow.SystemStatus
	 * @see #getSystemStatus()
	 * @generated
	 */
	void setSystemStatus(SystemStatus value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.obeo.dsl.designer.sample.flow.PropertyUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see fr.obeo.dsl.designer.sample.flow.PropertyUnit
	 * @see #setUnit(PropertyUnit)
	 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getRoutingRule_Unit()
	 * @model
	 * @generated
	 */
	PropertyUnit getUnit();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.designer.sample.flow.RoutingRule#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see fr.obeo.dsl.designer.sample.flow.PropertyUnit
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(PropertyUnit value);

	/**
	 * Returns the value of the '<em><b>Comparison Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.obeo.dsl.designer.sample.flow.ComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Operator</em>' attribute.
	 * @see fr.obeo.dsl.designer.sample.flow.ComparisonOperator
	 * @see #setComparisonOperator(ComparisonOperator)
	 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getRoutingRule_ComparisonOperator()
	 * @model
	 * @generated
	 */
	ComparisonOperator getComparisonOperator();

	/**
	 * Sets the value of the '{@link fr.obeo.dsl.designer.sample.flow.RoutingRule#getComparisonOperator <em>Comparison Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Operator</em>' attribute.
	 * @see fr.obeo.dsl.designer.sample.flow.ComparisonOperator
	 * @see #getComparisonOperator()
	 * @generated
	 */
	void setComparisonOperator(ComparisonOperator value);

} // RoutingRule
