/**
 */
package TestingPackage.FuzzingOperations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Latency Network Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.FuzzingOperations.LatencyNetworkOperation#getLatency <em>Latency</em>}</li>
 * </ul>
 *
 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getLatencyNetworkOperation()
 * @model
 * @generated
 */
public interface LatencyNetworkOperation extends NetworkFuzzingOperation {
	/**
	 * Returns the value of the '<em><b>Latency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency</em>' containment reference.
	 * @see #setLatency(DoubleRange)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getLatencyNetworkOperation_Latency()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DoubleRange getLatency();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.LatencyNetworkOperation#getLatency <em>Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency</em>' containment reference.
	 * @see #getLatency()
	 * @generated
	 */
	void setLatency(DoubleRange value);

} // LatencyNetworkOperation
