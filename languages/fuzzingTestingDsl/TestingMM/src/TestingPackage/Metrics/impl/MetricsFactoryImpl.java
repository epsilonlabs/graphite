/**
 */
package TestingPackage.Metrics.impl;

import TestingPackage.Metrics.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetricsFactoryImpl extends EFactoryImpl implements MetricsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetricsFactory init() {
		try {
			MetricsFactory theMetricsFactory = (MetricsFactory)EPackage.Registry.INSTANCE.getEFactory(MetricsPackage.eNS_URI);
			if (theMetricsFactory != null) {
				return theMetricsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetricsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MetricsPackage.INPUT_STREAM: return createInputStream();
			case MetricsPackage.OUTPUT_STREAM: return createOutputStream();
			case MetricsPackage.METRIC_DEFAULT: return createMetricDefault();
			case MetricsPackage.VARIABLE_METRIC: return createVariableMetric();
			case MetricsPackage.METRIC_INSTANCE: return createMetricInstance();
			case MetricsPackage.STREAM_METRIC: return createStreamMetric();
			case MetricsPackage.START_END_TIMING_METRIC: return createStartEndTimingMetric();
			case MetricsPackage.FUZZING_OPERATION_TIMES_METRIC: return createFuzzingOperationTimesMetric();
			case MetricsPackage.FILE_STREAM_RESULT: return createFileStreamResult();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MetricsPackage.METRIC_OPTIMISATION_DIRECTION:
				return createMetricOptimisationDirectionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MetricsPackage.METRIC_OPTIMISATION_DIRECTION:
				return convertMetricOptimisationDirectionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputStream createInputStream() {
		InputStreamImpl inputStream = new InputStreamImpl();
		return inputStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputStream createOutputStream() {
		OutputStreamImpl outputStream = new OutputStreamImpl();
		return outputStream;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricDefault createMetricDefault() {
		MetricDefaultImpl metricDefault = new MetricDefaultImpl();
		return metricDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableMetric createVariableMetric() {
		VariableMetricImpl variableMetric = new VariableMetricImpl();
		return variableMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricInstance createMetricInstance() {
		MetricInstanceImpl metricInstance = new MetricInstanceImpl();
		return metricInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamMetric createStreamMetric() {
		StreamMetricImpl streamMetric = new StreamMetricImpl();
		return streamMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartEndTimingMetric createStartEndTimingMetric() {
		StartEndTimingMetricImpl startEndTimingMetric = new StartEndTimingMetricImpl();
		return startEndTimingMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzingOperationTimesMetric createFuzzingOperationTimesMetric() {
		FuzzingOperationTimesMetricImpl fuzzingOperationTimesMetric = new FuzzingOperationTimesMetricImpl();
		return fuzzingOperationTimesMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileStreamResult createFileStreamResult() {
		FileStreamResultImpl fileStreamResult = new FileStreamResultImpl();
		return fileStreamResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricOptimisationDirection createMetricOptimisationDirectionFromString(EDataType eDataType, String initialValue) {
		MetricOptimisationDirection result = MetricOptimisationDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMetricOptimisationDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsPackage getMetricsPackage() {
		return (MetricsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetricsPackage getPackage() {
		return MetricsPackage.eINSTANCE;
	}

} //MetricsFactoryImpl
