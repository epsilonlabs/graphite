/**
 */
package TestingPackage.FuzzingOperations;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.FuzzingOperations.DoubleRange#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.DoubleRange#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 *
 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getDoubleRange()
 * @model
 * @generated
 */
public interface DoubleRange extends ValueRange {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(double)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getDoubleRange_LowerBound()
	 * @model
	 * @generated
	 */
	double getLowerBound();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.DoubleRange#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(double value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(double)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getDoubleRange_UpperBound()
	 * @model
	 * @generated
	 */
	double getUpperBound();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.DoubleRange#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(double value);

} // DoubleRange
