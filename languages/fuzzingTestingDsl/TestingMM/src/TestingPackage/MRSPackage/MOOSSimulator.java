/**
 */
package TestingPackage.MRSPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MOOS Simulator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.MRSPackage.MOOSSimulator#getHostname <em>Hostname</em>}</li>
 *   <li>{@link TestingPackage.MRSPackage.MOOSSimulator#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see TestingPackage.MRSPackage.MRSPackagePackage#getMOOSSimulator()
 * @model
 * @generated
 */
public interface MOOSSimulator extends Simulator {
	/**
	 * Returns the value of the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostname</em>' attribute.
	 * @see #setHostname(String)
	 * @see TestingPackage.MRSPackage.MRSPackagePackage#getMOOSSimulator_Hostname()
	 * @model
	 * @generated
	 */
	String getHostname();

	/**
	 * Sets the value of the '{@link TestingPackage.MRSPackage.MOOSSimulator#getHostname <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostname</em>' attribute.
	 * @see #getHostname()
	 * @generated
	 */
	void setHostname(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(String)
	 * @see TestingPackage.MRSPackage.MRSPackagePackage#getMOOSSimulator_Port()
	 * @model
	 * @generated
	 */
	String getPort();

	/**
	 * Sets the value of the '{@link TestingPackage.MRSPackage.MOOSSimulator#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(String value);

} // MOOSSimulator
