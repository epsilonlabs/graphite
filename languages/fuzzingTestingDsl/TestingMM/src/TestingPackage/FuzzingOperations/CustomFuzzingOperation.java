/**
 */
package TestingPackage.FuzzingOperations;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Fuzzing Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.FuzzingOperations.CustomFuzzingOperation#getParams <em>Params</em>}</li>
 * </ul>
 *
 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getCustomFuzzingOperation()
 * @model
 * @generated
 */
public interface CustomFuzzingOperation extends FuzzingOperation {
	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link TestingPackage.FuzzingOperations.ValueSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getCustomFuzzingOperation_Params()
	 * @model containment="true"
	 * @generated
	 */
	EList<ValueSet> getParams();

} // CustomFuzzingOperation
