/**
 */
package flow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flow.PowerOutput#getPower <em>Power</em>}</li>
 *   <li>{@link flow.PowerOutput#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see flow.FlowPackage#getPowerOutput()
 * @model
 * @generated
 */
public interface PowerOutput extends EObject {
	/**
	 * Returns the value of the '<em><b>Power</b></em>' attribute.
	 * The default value is <code>"1000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' attribute.
	 * @see #setPower(int)
	 * @see flow.FlowPackage#getPowerOutput_Power()
	 * @model default="1000" required="true"
	 * @generated
	 */
	int getPower();

	/**
	 * Sets the value of the '{@link flow.PowerOutput#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see #getPower()
	 * @generated
	 */
	void setPower(int value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link flow.PowerLink}.
	 * It is bidirectional and its opposite is '{@link flow.PowerLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see flow.FlowPackage#getPowerOutput_Links()
	 * @see flow.PowerLink#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<PowerLink> getLinks();

} // PowerOutput
