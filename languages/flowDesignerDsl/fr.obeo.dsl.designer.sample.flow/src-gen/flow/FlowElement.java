/**
 */
package flow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flow.FlowElement#getStatus <em>Status</em>}</li>
 *   <li>{@link flow.FlowElement#getUsage <em>Usage</em>}</li>
 * </ul>
 *
 * @see flow.FlowPackage#getFlowElement()
 * @model abstract="true"
 * @generated
 */
public interface FlowElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"active"</code>.
	 * The literals are from the enumeration {@link flow.FlowElementStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see flow.FlowElementStatus
	 * @see #setStatus(FlowElementStatus)
	 * @see flow.FlowPackage#getFlowElement_Status()
	 * @model default="active" required="true"
	 * @generated
	 */
	FlowElementStatus getStatus();

	/**
	 * Sets the value of the '{@link flow.FlowElement#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see flow.FlowElementStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(FlowElementStatus value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * The literals are from the enumeration {@link flow.FlowElementUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see flow.FlowElementUsage
	 * @see #setUsage(FlowElementUsage)
	 * @see flow.FlowPackage#getFlowElement_Usage()
	 * @model required="true"
	 * @generated
	 */
	FlowElementUsage getUsage();

	/**
	 * Sets the value of the '{@link flow.FlowElement#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see flow.FlowElementUsage
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(FlowElementUsage value);

} // FlowElement
