/**
 */
package flow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flow.FlowSource#getOutgoingFlows <em>Outgoing Flows</em>}</li>
 * </ul>
 *
 * @see flow.FlowPackage#getFlowSource()
 * @model abstract="true"
 * @generated
 */
public interface FlowSource extends FlowElement {
	/**
	 * Returns the value of the '<em><b>Outgoing Flows</b></em>' containment reference list.
	 * The list contents are of type {@link flow.DataFlow}.
	 * It is bidirectional and its opposite is '{@link flow.DataFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Flows</em>' containment reference list.
	 * @see flow.FlowPackage#getFlowSource_OutgoingFlows()
	 * @see flow.DataFlow#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<DataFlow> getOutgoingFlows();

} // FlowSource
