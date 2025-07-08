/**
 */
package TestingPackage.FuzzingOperations;

import TestingPackage.MRSPackage.Parameter;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.FuzzingOperations.VariableOperation#getSubParameters <em>Sub Parameters</em>}</li>
 * </ul>
 *
 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getVariableOperation()
 * @model
 * @generated
 */
public interface VariableOperation extends FuzzTestingOperation {
	/**
	 * Returns the value of the '<em><b>Sub Parameters</b></em>' reference list.
	 * The list contents are of type {@link TestingPackage.MRSPackage.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Parameters</em>' reference list.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getVariableOperation_SubParameters()
	 * @model
	 * @generated
	 */
	EList<Parameter> getSubParameters();

} // VariableOperation
