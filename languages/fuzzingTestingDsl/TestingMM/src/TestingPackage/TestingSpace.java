/**
 */
package TestingPackage;

import TestingPackage.FuzzingOperations.FuzzingOperation;

import TestingPackage.MRSPackage.MRS;

import TestingPackage.Metrics.Metric;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Testing Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.TestingSpace#getName <em>Name</em>}</li>
 *   <li>{@link TestingPackage.TestingSpace#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link TestingPackage.TestingSpace#getPossibleFuzzingOperations <em>Possible Fuzzing Operations</em>}</li>
 *   <li>{@link TestingPackage.TestingSpace#getCampaigns <em>Campaigns</em>}</li>
 *   <li>{@link TestingPackage.TestingSpace#getMrs <em>Mrs</em>}</li>
 * </ul>
 *
 * @see TestingPackage.TestingMMPackage#getTestingSpace()
 * @model
 * @generated
 */
public interface TestingSpace extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TestingPackage.TestingMMPackage#getTestingSpace_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TestingPackage.TestingSpace#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Metrics</b></em>' containment reference list.
	 * The list contents are of type {@link TestingPackage.Metrics.Metric}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics</em>' containment reference list.
	 * @see TestingPackage.TestingMMPackage#getTestingSpace_Metrics()
	 * @model containment="true"
	 * @generated
	 */
	EList<Metric> getMetrics();

	/**
	 * Returns the value of the '<em><b>Possible Fuzzing Operations</b></em>' containment reference list.
	 * The list contents are of type {@link TestingPackage.FuzzingOperations.FuzzingOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Possible Fuzzing Operations</em>' containment reference list.
	 * @see TestingPackage.TestingMMPackage#getTestingSpace_PossibleFuzzingOperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<FuzzingOperation> getPossibleFuzzingOperations();

	/**
	 * Returns the value of the '<em><b>Campaigns</b></em>' containment reference list.
	 * The list contents are of type {@link TestingPackage.TestCampaign}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Campaigns</em>' containment reference list.
	 * @see TestingPackage.TestingMMPackage#getTestingSpace_Campaigns()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestCampaign> getCampaigns();

	/**
	 * Returns the value of the '<em><b>Mrs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mrs</em>' containment reference.
	 * @see #setMrs(MRS)
	 * @see TestingPackage.TestingMMPackage#getTestingSpace_Mrs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MRS getMrs();

	/**
	 * Sets the value of the '{@link TestingPackage.TestingSpace#getMrs <em>Mrs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mrs</em>' containment reference.
	 * @see #getMrs()
	 * @generated
	 */
	void setMrs(MRS value);

} // TestingSpace
