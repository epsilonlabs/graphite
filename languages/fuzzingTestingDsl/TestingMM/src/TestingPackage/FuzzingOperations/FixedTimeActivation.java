/**
 */
package TestingPackage.FuzzingOperations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fixed Time Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.FuzzingOperations.FixedTimeActivation#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.FixedTimeActivation#getEndTime <em>End Time</em>}</li>
 * </ul>
 *
 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getFixedTimeActivation()
 * @model
 * @generated
 */
public interface FixedTimeActivation extends Activation {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(double)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getFixedTimeActivation_StartTime()
	 * @model
	 * @generated
	 */
	double getStartTime();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.FixedTimeActivation#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(double value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(double)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getFixedTimeActivation_EndTime()
	 * @model
	 * @generated
	 */
	double getEndTime();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.FixedTimeActivation#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(double value);

} // FixedTimeActivation
