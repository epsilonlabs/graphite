/**
 */
package flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flow.DataFlow#getTarget <em>Target</em>}</li>
 *   <li>{@link flow.DataFlow#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see flow.FlowPackage#getDataFlow()
 * @model
 * @generated
 */
public interface DataFlow extends CapacityBound {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link flow.FlowTarget#getIncomingFlows <em>Incoming Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(FlowTarget)
	 * @see flow.FlowPackage#getDataFlow_Target()
	 * @see flow.FlowTarget#getIncomingFlows
	 * @model opposite="incomingFlows" required="true"
	 * @generated
	 */
	FlowTarget getTarget();

	/**
	 * Sets the value of the '{@link flow.DataFlow#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(FlowTarget value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link flow.FlowSource#getOutgoingFlows <em>Outgoing Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(FlowSource)
	 * @see flow.FlowPackage#getDataFlow_Source()
	 * @see flow.FlowSource#getOutgoingFlows
	 * @model opposite="outgoingFlows" required="true" transient="false"
	 * @generated
	 */
	FlowSource getSource();

	/**
	 * Sets the value of the '{@link flow.DataFlow#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(FlowSource value);

} // DataFlow
