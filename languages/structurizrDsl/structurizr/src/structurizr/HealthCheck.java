/**
 */
package structurizr;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Health Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structurizr.HealthCheck#getName <em>Name</em>}</li>
 *   <li>{@link structurizr.HealthCheck#getUrl <em>Url</em>}</li>
 *   <li>{@link structurizr.HealthCheck#getInterval <em>Interval</em>}</li>
 *   <li>{@link structurizr.HealthCheck#getTimeouts <em>Timeouts</em>}</li>
 * </ul>
 *
 * @see structurizr.StructurizrPackage#getHealthCheck()
 * @model
 * @generated
 */
public interface HealthCheck extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see structurizr.StructurizrPackage#getHealthCheck_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link structurizr.HealthCheck#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see structurizr.StructurizrPackage#getHealthCheck_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link structurizr.HealthCheck#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #setInterval(int)
	 * @see structurizr.StructurizrPackage#getHealthCheck_Interval()
	 * @model
	 * @generated
	 */
	int getInterval();

	/**
	 * Sets the value of the '{@link structurizr.HealthCheck#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(int value);

	/**
	 * Returns the value of the '<em><b>Timeouts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeouts</em>' attribute.
	 * @see #setTimeouts(String)
	 * @see structurizr.StructurizrPackage#getHealthCheck_Timeouts()
	 * @model
	 * @generated
	 */
	String getTimeouts();

	/**
	 * Sets the value of the '{@link structurizr.HealthCheck#getTimeouts <em>Timeouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeouts</em>' attribute.
	 * @see #getTimeouts()
	 * @generated
	 */
	void setTimeouts(String value);

} // HealthCheck
