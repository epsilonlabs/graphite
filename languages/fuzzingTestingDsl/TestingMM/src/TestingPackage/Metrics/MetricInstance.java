/**
 */
package TestingPackage.Metrics;

import TestingPackage.Results.Result;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.Metrics.MetricInstance#getMetric <em>Metric</em>}</li>
 *   <li>{@link TestingPackage.Metrics.MetricInstance#getResult <em>Result</em>}</li>
 *   <li>{@link TestingPackage.Metrics.MetricInstance#getResultString <em>Result String</em>}</li>
 * </ul>
 *
 * @see TestingPackage.Metrics.MetricsPackage#getMetricInstance()
 * @model
 * @generated
 */
public interface MetricInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' reference.
	 * @see #setMetric(Metric)
	 * @see TestingPackage.Metrics.MetricsPackage#getMetricInstance_Metric()
	 * @model required="true"
	 * @generated
	 */
	Metric getMetric();

	/**
	 * Sets the value of the '{@link TestingPackage.Metrics.MetricInstance#getMetric <em>Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' reference.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(Metric value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(Result)
	 * @see TestingPackage.Metrics.MetricsPackage#getMetricInstance_Result()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Result getResult();

	/**
	 * Sets the value of the '{@link TestingPackage.Metrics.MetricInstance#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(Result value);

	/**
	 * Returns the value of the '<em><b>Result String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result String</em>' attribute.
	 * @see #setResultString(String)
	 * @see TestingPackage.Metrics.MetricsPackage#getMetricInstance_ResultString()
	 * @model
	 * @generated
	 */
	String getResultString();

	/**
	 * Sets the value of the '{@link TestingPackage.Metrics.MetricInstance#getResultString <em>Result String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result String</em>' attribute.
	 * @see #getResultString()
	 * @generated
	 */
	void setResultString(String value);

} // MetricInstance
