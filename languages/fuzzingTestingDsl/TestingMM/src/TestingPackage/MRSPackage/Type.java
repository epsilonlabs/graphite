/**
 */
package TestingPackage.MRSPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.MRSPackage.Type#getName <em>Name</em>}</li>
 *   <li>{@link TestingPackage.MRSPackage.Type#getParsingMethod <em>Parsing Method</em>}</li>
 *   <li>{@link TestingPackage.MRSPackage.Type#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see TestingPackage.MRSPackage.MRSPackagePackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TestingPackage.MRSPackage.MRSPackagePackage#getType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TestingPackage.MRSPackage.Type#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parsing Method</b></em>' attribute.
	 * The literals are from the enumeration {@link TestingPackage.MRSPackage.ParsingMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parsing Method</em>' attribute.
	 * @see TestingPackage.MRSPackage.ParsingMethod
	 * @see #setParsingMethod(ParsingMethod)
	 * @see TestingPackage.MRSPackage.MRSPackagePackage#getType_ParsingMethod()
	 * @model required="true"
	 * @generated
	 */
	ParsingMethod getParsingMethod();

	/**
	 * Sets the value of the '{@link TestingPackage.MRSPackage.Type#getParsingMethod <em>Parsing Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parsing Method</em>' attribute.
	 * @see TestingPackage.MRSPackage.ParsingMethod
	 * @see #getParsingMethod()
	 * @generated
	 */
	void setParsingMethod(ParsingMethod value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link TestingPackage.MRSPackage.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see TestingPackage.MRSPackage.MRSPackagePackage#getType_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // Type
