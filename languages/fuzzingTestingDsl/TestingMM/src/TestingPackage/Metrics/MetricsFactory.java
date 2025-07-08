/**
 */
package TestingPackage.Metrics;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see TestingPackage.Metrics.MetricsPackage
 * @generated
 */
public interface MetricsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetricsFactory eINSTANCE = TestingPackage.Metrics.impl.MetricsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Input Stream</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Stream</em>'.
	 * @generated
	 */
	InputStream createInputStream();

	/**
	 * Returns a new object of class '<em>Output Stream</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Stream</em>'.
	 * @generated
	 */
	OutputStream createOutputStream();

	/**
	 * Returns a new object of class '<em>Metric Default</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metric Default</em>'.
	 * @generated
	 */
	MetricDefault createMetricDefault();

	/**
	 * Returns a new object of class '<em>Variable Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Metric</em>'.
	 * @generated
	 */
	VariableMetric createVariableMetric();

	/**
	 * Returns a new object of class '<em>Metric Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metric Instance</em>'.
	 * @generated
	 */
	MetricInstance createMetricInstance();

	/**
	 * Returns a new object of class '<em>Stream Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stream Metric</em>'.
	 * @generated
	 */
	StreamMetric createStreamMetric();

	/**
	 * Returns a new object of class '<em>Start End Timing Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start End Timing Metric</em>'.
	 * @generated
	 */
	StartEndTimingMetric createStartEndTimingMetric();

	/**
	 * Returns a new object of class '<em>Fuzzing Operation Times Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fuzzing Operation Times Metric</em>'.
	 * @generated
	 */
	FuzzingOperationTimesMetric createFuzzingOperationTimesMetric();

	/**
	 * Returns a new object of class '<em>File Stream Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Stream Result</em>'.
	 * @generated
	 */
	FileStreamResult createFileStreamResult();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetricsPackage getMetricsPackage();

} //MetricsFactory
