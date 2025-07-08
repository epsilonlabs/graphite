/**
 */
package TestingPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Based End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.TimeBasedEnd#getTimeLimitSeconds <em>Time Limit Seconds</em>}</li>
 * </ul>
 *
 * @see TestingPackage.TestingMMPackage#getTimeBasedEnd()
 * @model
 * @generated
 */
public interface TimeBasedEnd extends ExecutionEndTrigger {
	/**
	 * Returns the value of the '<em><b>Time Limit Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Limit Seconds</em>' attribute.
	 * @see #setTimeLimitSeconds(long)
	 * @see TestingPackage.TestingMMPackage#getTimeBasedEnd_TimeLimitSeconds()
	 * @model
	 * @generated
	 */
	long getTimeLimitSeconds();

	/**
	 * Sets the value of the '{@link TestingPackage.TimeBasedEnd#getTimeLimitSeconds <em>Time Limit Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Limit Seconds</em>' attribute.
	 * @see #getTimeLimitSeconds()
	 * @generated
	 */
	void setTimeLimitSeconds(long value);

} // TimeBasedEnd
