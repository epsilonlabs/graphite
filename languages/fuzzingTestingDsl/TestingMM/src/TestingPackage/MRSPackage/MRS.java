/**
 */
package TestingPackage.MRSPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MRS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.MRSPackage.MRS#getVariables <em>Variables</em>}</li>
 *   <li>{@link TestingPackage.MRSPackage.MRS#getLaunchFileLocation <em>Launch File Location</em>}</li>
 *   <li>{@link TestingPackage.MRSPackage.MRS#getLaunchDelaySeconds <em>Launch Delay Seconds</em>}</li>
 *   <li>{@link TestingPackage.MRSPackage.MRS#getCustomTerminateFileLocation <em>Custom Terminate File Location</em>}</li>
 *   <li>{@link TestingPackage.MRSPackage.MRS#getRecordFileLocation <em>Record File Location</em>}</li>
 *   <li>{@link TestingPackage.MRSPackage.MRS#getNodes <em>Nodes</em>}</li>
 *   <li>{@link TestingPackage.MRSPackage.MRS#getSimulator <em>Simulator</em>}</li>
 *   <li>{@link TestingPackage.MRSPackage.MRS#getPropertyType <em>Property Type</em>}</li>
 * </ul>
 *
 * @see TestingPackage.MRSPackage.MRSPackagePackage#getMRS()
 * @model
 * @generated
 */
public interface MRS extends EObject {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link TestingPackage.MRSPackage.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see TestingPackage.MRSPackage.MRSPackagePackage#getMRS_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Launch File Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launch File Location</em>' attribute.
	 * @see #setLaunchFileLocation(String)
	 * @see TestingPackage.MRSPackage.MRSPackagePackage#getMRS_LaunchFileLocation()
	 * @model
	 * @generated
	 */
	String getLaunchFileLocation();

	/**
	 * Sets the value of the '{@link TestingPackage.MRSPackage.MRS#getLaunchFileLocation <em>Launch File Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Launch File Location</em>' attribute.
	 * @see #getLaunchFileLocation()
	 * @generated
	 */
	void setLaunchFileLocation(String value);

	/**
	 * Returns the value of the '<em><b>Launch Delay Seconds</b></em>' attribute.
	 * The default value is <code>"40"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launch Delay Seconds</em>' attribute.
	 * @see #setLaunchDelaySeconds(int)
	 * @see TestingPackage.MRSPackage.MRSPackagePackage#getMRS_LaunchDelaySeconds()
	 * @model default="40"
	 * @generated
	 */
	int getLaunchDelaySeconds();

	/**
	 * Sets the value of the '{@link TestingPackage.MRSPackage.MRS#getLaunchDelaySeconds <em>Launch Delay Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Launch Delay Seconds</em>' attribute.
	 * @see #getLaunchDelaySeconds()
	 * @generated
	 */
	void setLaunchDelaySeconds(int value);

	/**
	 * Returns the value of the '<em><b>Custom Terminate File Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Terminate File Location</em>' attribute.
	 * @see #setCustomTerminateFileLocation(String)
	 * @see TestingPackage.MRSPackage.MRSPackagePackage#getMRS_CustomTerminateFileLocation()
	 * @model
	 * @generated
	 */
	String getCustomTerminateFileLocation();

	/**
	 * Sets the value of the '{@link TestingPackage.MRSPackage.MRS#getCustomTerminateFileLocation <em>Custom Terminate File Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Terminate File Location</em>' attribute.
	 * @see #getCustomTerminateFileLocation()
	 * @generated
	 */
	void setCustomTerminateFileLocation(String value);

	/**
	 * Returns the value of the '<em><b>Record File Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record File Location</em>' attribute.
	 * @see #setRecordFileLocation(String)
	 * @see TestingPackage.MRSPackage.MRSPackagePackage#getMRS_RecordFileLocation()
	 * @model
	 * @generated
	 */
	String getRecordFileLocation();

	/**
	 * Sets the value of the '{@link TestingPackage.MRSPackage.MRS#getRecordFileLocation <em>Record File Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record File Location</em>' attribute.
	 * @see #getRecordFileLocation()
	 * @generated
	 */
	void setRecordFileLocation(String value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link TestingPackage.MRSPackage.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see TestingPackage.MRSPackage.MRSPackagePackage#getMRS_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Simulator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simulator</em>' containment reference.
	 * @see #setSimulator(Simulator)
	 * @see TestingPackage.MRSPackage.MRSPackagePackage#getMRS_Simulator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Simulator getSimulator();

	/**
	 * Sets the value of the '{@link TestingPackage.MRSPackage.MRS#getSimulator <em>Simulator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simulator</em>' containment reference.
	 * @see #getSimulator()
	 * @generated
	 */
	void setSimulator(Simulator value);

	/**
	 * Returns the value of the '<em><b>Property Type</b></em>' containment reference list.
	 * The list contents are of type {@link TestingPackage.MRSPackage.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Type</em>' containment reference list.
	 * @see TestingPackage.MRSPackage.MRSPackagePackage#getMRS_PropertyType()
	 * @model containment="true"
	 * @generated
	 */
	EList<Type> getPropertyType();

} // MRS
