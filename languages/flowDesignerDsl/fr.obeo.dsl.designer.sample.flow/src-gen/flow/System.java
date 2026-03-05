/**
 */
package flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flow.System#getElements <em>Elements</em>}</li>
 *   <li>{@link flow.System#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link flow.System#getWeight <em>Weight</em>}</li>
 *   <li>{@link flow.System#getPowerOutputs <em>Power Outputs</em>}</li>
 *   <li>{@link flow.System#getPowerInputs <em>Power Inputs</em>}</li>
 *   <li>{@link flow.System#getRoutingRules <em>Routing Rules</em>}</li>
 *   <li>{@link flow.System#getRoutingRulesList <em>Routing Rules List</em>}</li>
 * </ul>
 *
 * @see flow.FlowPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends Powered, FlowSource, Named {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link flow.FlowElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see flow.FlowPackage#getSystem_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<FlowElement> getElements();

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(int)
	 * @see flow.FlowPackage#getSystem_Temperature()
	 * @model default="0"
	 * @generated
	 */
	int getTemperature();

	/**
	 * Sets the value of the '{@link flow.System#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(int value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see flow.FlowPackage#getSystem_Weight()
	 * @model default="0"
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link flow.System#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * Returns the value of the '<em><b>Power Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link flow.PowerOutput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Outputs</em>' containment reference list.
	 * @see flow.FlowPackage#getSystem_PowerOutputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<PowerOutput> getPowerOutputs();

	/**
	 * Returns the value of the '<em><b>Power Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link flow.PowerInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Inputs</em>' containment reference list.
	 * @see flow.FlowPackage#getSystem_PowerInputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<PowerInput> getPowerInputs();

	/**
	 * Returns the value of the '<em><b>Routing Rules</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Rules</em>' attribute.
	 * @see #setRoutingRules(String)
	 * @see flow.FlowPackage#getSystem_RoutingRules()
	 * @model
	 * @generated
	 */
	String getRoutingRules();

	/**
	 * Sets the value of the '{@link flow.System#getRoutingRules <em>Routing Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing Rules</em>' attribute.
	 * @see #getRoutingRules()
	 * @generated
	 */
	void setRoutingRules(String value);

	/**
	 * Returns the value of the '<em><b>Routing Rules List</b></em>' containment reference list.
	 * The list contents are of type {@link flow.RoutingRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Rules List</em>' containment reference list.
	 * @see flow.FlowPackage#getSystem_RoutingRulesList()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoutingRule> getRoutingRulesList();

} // System
