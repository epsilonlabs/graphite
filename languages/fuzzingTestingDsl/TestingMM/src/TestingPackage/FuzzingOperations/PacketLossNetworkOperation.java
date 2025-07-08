/**
 */
package TestingPackage.FuzzingOperations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packet Loss Network Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.FuzzingOperations.PacketLossNetworkOperation#getFrequency <em>Frequency</em>}</li>
 * </ul>
 *
 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getPacketLossNetworkOperation()
 * @model
 * @generated
 */
public interface PacketLossNetworkOperation extends NetworkFuzzingOperation {
	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' containment reference.
	 * @see #setFrequency(DoubleRange)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getPacketLossNetworkOperation_Frequency()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DoubleRange getFrequency();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.PacketLossNetworkOperation#getFrequency <em>Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' containment reference.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(DoubleRange value);

} // PacketLossNetworkOperation
