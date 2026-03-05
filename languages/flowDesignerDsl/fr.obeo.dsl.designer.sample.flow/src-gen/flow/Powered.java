/**
 */
package flow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Powered</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flow.Powered#getConsumption <em>Consumption</em>}</li>
 *   <li>{@link flow.Powered#getPowerStatus <em>Power Status</em>}</li>
 * </ul>
 *
 * @see flow.FlowPackage#getPowered()
 * @model abstract="true"
 * @generated
 */
public interface Powered extends EObject {
	/**
	 * Returns the value of the '<em><b>Consumption</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumption</em>' attribute.
	 * @see #setConsumption(int)
	 * @see flow.FlowPackage#getPowered_Consumption()
	 * @model default="0"
	 * @generated
	 */
	int getConsumption();

	/**
	 * Sets the value of the '{@link flow.Powered#getConsumption <em>Consumption</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consumption</em>' attribute.
	 * @see #getConsumption()
	 * @generated
	 */
	void setConsumption(int value);

	/**
	 * Returns the value of the '<em><b>Power Status</b></em>' attribute.
	 * The literals are from the enumeration {@link flow.PoweredStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Status</em>' attribute.
	 * @see flow.PoweredStatus
	 * @see #setPowerStatus(PoweredStatus)
	 * @see flow.FlowPackage#getPowered_PowerStatus()
	 * @model required="true"
	 * @generated
	 */
	PoweredStatus getPowerStatus();

	/**
	 * Sets the value of the '{@link flow.Powered#getPowerStatus <em>Power Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Status</em>' attribute.
	 * @see flow.PoweredStatus
	 * @see #getPowerStatus()
	 * @generated
	 */
	void setPowerStatus(PoweredStatus value);

} // Powered
