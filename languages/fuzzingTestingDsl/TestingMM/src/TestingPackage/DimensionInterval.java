/**
 */
package TestingPackage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.DimensionInterval#getDimID <em>Dim ID</em>}</li>
 *   <li>{@link TestingPackage.DimensionInterval#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link TestingPackage.DimensionInterval#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link TestingPackage.DimensionInterval#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @see TestingPackage.TestingMMPackage#getDimensionInterval()
 * @model
 * @generated
 */
public interface DimensionInterval extends EObject {
	/**
	 * Returns the value of the '<em><b>Dim ID</b></em>' attribute.
	 * The literals are from the enumeration {@link TestingPackage.DimensionID}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dim ID</em>' attribute.
	 * @see TestingPackage.DimensionID
	 * @see #setDimID(DimensionID)
	 * @see TestingPackage.TestingMMPackage#getDimensionInterval_DimID()
	 * @model
	 * @generated
	 */
	DimensionID getDimID();

	/**
	 * Sets the value of the '{@link TestingPackage.DimensionInterval#getDimID <em>Dim ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dim ID</em>' attribute.
	 * @see TestingPackage.DimensionID
	 * @see #getDimID()
	 * @generated
	 */
	void setDimID(DimensionID value);

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(double)
	 * @see TestingPackage.TestingMMPackage#getDimensionInterval_MinValue()
	 * @model
	 * @generated
	 */
	double getMinValue();

	/**
	 * Sets the value of the '{@link TestingPackage.DimensionInterval#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(double value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(double)
	 * @see TestingPackage.TestingMMPackage#getDimensionInterval_MaxValue()
	 * @model
	 * @generated
	 */
	double getMaxValue();

	/**
	 * Sets the value of the '{@link TestingPackage.DimensionInterval#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(double value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(int)
	 * @see TestingPackage.TestingMMPackage#getDimensionInterval_Count()
	 * @model
	 * @generated
	 */
	int getCount();

	/**
	 * Sets the value of the '{@link TestingPackage.DimensionInterval#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(int value);

} // DimensionInterval
