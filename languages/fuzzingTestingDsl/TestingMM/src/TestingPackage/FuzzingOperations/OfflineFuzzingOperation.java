/**
 */
package TestingPackage.FuzzingOperations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offline Fuzzing Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.FuzzingOperations.OfflineFuzzingOperation#getOperationTime <em>Operation Time</em>}</li>
 * </ul>
 *
 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getOfflineFuzzingOperation()
 * @model
 * @generated
 */
public interface OfflineFuzzingOperation extends FuzzingOperation {
	/**
	 * Returns the value of the '<em><b>Operation Time</b></em>' attribute.
	 * The literals are from the enumeration {@link TestingPackage.FuzzingOperations.OfflineOperationTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Time</em>' attribute.
	 * @see TestingPackage.FuzzingOperations.OfflineOperationTime
	 * @see #setOperationTime(OfflineOperationTime)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getOfflineFuzzingOperation_OperationTime()
	 * @model
	 * @generated
	 */
	OfflineOperationTime getOperationTime();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.OfflineFuzzingOperation#getOperationTime <em>Operation Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Time</em>' attribute.
	 * @see TestingPackage.FuzzingOperations.OfflineOperationTime
	 * @see #getOperationTime()
	 * @generated
	 */
	void setOperationTime(OfflineOperationTime value);

} // OfflineFuzzingOperation
