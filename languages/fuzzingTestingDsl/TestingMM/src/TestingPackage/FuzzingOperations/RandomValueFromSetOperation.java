/**
 */
package TestingPackage.FuzzingOperations;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Random Value From Set Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.FuzzingOperations.RandomValueFromSetOperation#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.RandomValueFromSetOperation#isIsRelative <em>Is Relative</em>}</li>
 * </ul>
 *
 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getRandomValueFromSetOperation()
 * @model
 * @generated
 */
public interface RandomValueFromSetOperation extends RandomValueFuzzingOperation {
	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference list.
	 * The list contents are of type {@link TestingPackage.FuzzingOperations.ValueSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Set</em>' containment reference list.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getRandomValueFromSetOperation_ValueSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSet> getValueSet();

	/**
	 * Returns the value of the '<em><b>Is Relative</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Relative</em>' attribute.
	 * @see #setIsRelative(boolean)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getRandomValueFromSetOperation_IsRelative()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsRelative();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.RandomValueFromSetOperation#isIsRelative <em>Is Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Relative</em>' attribute.
	 * @see #isIsRelative()
	 * @generated
	 */
	void setIsRelative(boolean value);

} // RandomValueFromSetOperation
