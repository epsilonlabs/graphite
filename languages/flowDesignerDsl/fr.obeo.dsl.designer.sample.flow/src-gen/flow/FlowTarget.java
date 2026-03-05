/**
 */
package flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flow.FlowTarget#getIncomingFlows <em>Incoming Flows</em>}</li>
 * </ul>
 *
 * @see flow.FlowPackage#getFlowTarget()
 * @model abstract="true"
 * @generated
 */
public interface FlowTarget extends FlowElement {
	/**
	 * Returns the value of the '<em><b>Incoming Flows</b></em>' reference list.
	 * The list contents are of type {@link flow.DataFlow}.
	 * It is bidirectional and its opposite is '{@link flow.DataFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Flows</em>' reference list.
	 * @see flow.FlowPackage#getFlowTarget_IncomingFlows()
	 * @see flow.DataFlow#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<DataFlow> getIncomingFlows();

} // FlowTarget
