/**
 */
package flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flow.Processor#getVolume <em>Volume</em>}</li>
 *   <li>{@link flow.Processor#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @see flow.FlowPackage#getProcessor()
 * @model
 * @generated
 */
public interface Processor extends FlowTarget, CapacityBound, FlowSource, Powered, Named {
	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(int)
	 * @see flow.FlowPackage#getProcessor_Volume()
	 * @model default="2" required="true"
	 * @generated
	 */
	int getVolume();

	/**
	 * Sets the value of the '{@link flow.Processor#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(int value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see flow.FlowPackage#getProcessor_Weight()
	 * @model default="10" required="true"
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link flow.Processor#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

} // Processor
