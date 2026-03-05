/**
 */
package flow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flow.PowerLink#getTarget <em>Target</em>}</li>
 *   <li>{@link flow.PowerLink#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see flow.FlowPackage#getPowerLink()
 * @model
 * @generated
 */
public interface PowerLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(PowerInput)
	 * @see flow.FlowPackage#getPowerLink_Target()
	 * @model
	 * @generated
	 */
	PowerInput getTarget();

	/**
	 * Sets the value of the '{@link flow.PowerLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(PowerInput value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link flow.PowerOutput#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(PowerOutput)
	 * @see flow.FlowPackage#getPowerLink_Source()
	 * @see flow.PowerOutput#getLinks
	 * @model opposite="links" transient="false"
	 * @generated
	 */
	PowerOutput getSource();

	/**
	 * Sets the value of the '{@link flow.PowerLink#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(PowerOutput value);

} // PowerLink
