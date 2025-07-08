/**
 */
package TestingPackage.FuzzingOperations;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.FuzzingOperations.StringSet#getChoices <em>Choices</em>}</li>
 * </ul>
 *
 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getStringSet()
 * @model
 * @generated
 */
public interface StringSet extends ValueSet {
	/**
	 * Returns the value of the '<em><b>Choices</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choices</em>' attribute list.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getStringSet_Choices()
	 * @model
	 * @generated
	 */
	EList<String> getChoices();

} // StringSet
