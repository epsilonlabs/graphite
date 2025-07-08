/**
 */
package TestingPackage.FuzzingOperations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.FuzzingOperations.PointRange#getMinPoint <em>Min Point</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.PointRange#getMaxPoint <em>Max Point</em>}</li>
 * </ul>
 *
 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getPointRange()
 * @model
 * @generated
 */
public interface PointRange extends ValueRange {
	/**
	 * Returns the value of the '<em><b>Min Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Point</em>' containment reference.
	 * @see #setMinPoint(Point)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getPointRange_MinPoint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Point getMinPoint();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.PointRange#getMinPoint <em>Min Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Point</em>' containment reference.
	 * @see #getMinPoint()
	 * @generated
	 */
	void setMinPoint(Point value);

	/**
	 * Returns the value of the '<em><b>Max Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Point</em>' containment reference.
	 * @see #setMaxPoint(Point)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getPointRange_MaxPoint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Point getMaxPoint();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.PointRange#getMaxPoint <em>Max Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Point</em>' containment reference.
	 * @see #getMaxPoint()
	 * @generated
	 */
	void setMaxPoint(Point value);

} // PointRange
