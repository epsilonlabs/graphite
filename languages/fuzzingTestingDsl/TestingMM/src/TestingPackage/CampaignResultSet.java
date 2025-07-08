/**
 */
package TestingPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Campaign Result Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.CampaignResultSet#getName <em>Name</em>}</li>
 *   <li>{@link TestingPackage.CampaignResultSet#getStatus <em>Status</em>}</li>
 *   <li>{@link TestingPackage.CampaignResultSet#getResults <em>Results</em>}</li>
 * </ul>
 *
 * @see TestingPackage.TestingMMPackage#getCampaignResultSet()
 * @model
 * @generated
 */
public interface CampaignResultSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TestingPackage.TestingMMPackage#getCampaignResultSet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TestingPackage.CampaignResultSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link TestingPackage.ResultSetStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see TestingPackage.ResultSetStatus
	 * @see #setStatus(ResultSetStatus)
	 * @see TestingPackage.TestingMMPackage#getCampaignResultSet_Status()
	 * @model
	 * @generated
	 */
	ResultSetStatus getStatus();

	/**
	 * Sets the value of the '{@link TestingPackage.CampaignResultSet#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see TestingPackage.ResultSetStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ResultSetStatus value);

	/**
	 * Returns the value of the '<em><b>Results</b></em>' reference list.
	 * The list contents are of type {@link TestingPackage.Test}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' reference list.
	 * @see TestingPackage.TestingMMPackage#getCampaignResultSet_Results()
	 * @model
	 * @generated
	 */
	EList<Test> getResults();

} // CampaignResultSet
