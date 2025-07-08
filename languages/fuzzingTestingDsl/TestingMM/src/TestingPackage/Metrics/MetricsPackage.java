/**
 */
package TestingPackage.Metrics;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see TestingPackage.Metrics.MetricsFactory
 * @model kind="package"
 * @generated
 */
public interface MetricsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Metrics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "Metrics";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetricsPackage eINSTANCE = TestingPackage.Metrics.impl.MetricsPackageImpl.init();

	/**
	 * The meta object id for the '{@link TestingPackage.Metrics.impl.SimStreamImpl <em>Sim Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.Metrics.impl.SimStreamImpl
	 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getSimStream()
	 * @generated
	 */
	int SIM_STREAM = 0;

	/**
	 * The number of structural features of the '<em>Sim Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_STREAM_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Sim Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIM_STREAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.Metrics.impl.InputStreamImpl <em>Input Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.Metrics.impl.InputStreamImpl
	 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getInputStream()
	 * @generated
	 */
	int INPUT_STREAM = 1;

	/**
	 * The number of structural features of the '<em>Input Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_STREAM_FEATURE_COUNT = SIM_STREAM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_STREAM_OPERATION_COUNT = SIM_STREAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.Metrics.impl.OutputStreamImpl <em>Output Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.Metrics.impl.OutputStreamImpl
	 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getOutputStream()
	 * @generated
	 */
	int OUTPUT_STREAM = 2;

	/**
	 * The number of structural features of the '<em>Output Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_STREAM_FEATURE_COUNT = SIM_STREAM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_STREAM_OPERATION_COUNT = SIM_STREAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.Metrics.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.Metrics.impl.MetricImpl
	 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__NAME = 0;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__DIR = 1;

	/**
	 * The feature id for the '<em><b>Related Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__RELATED_VARIABLES = 2;

	/**
	 * The feature id for the '<em><b>Value If Not Received</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__VALUE_IF_NOT_RECEIVED = 3;

	/**
	 * The feature id for the '<em><b>Init Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__INIT_VALUE = 4;

	/**
	 * The feature id for the '<em><b>Use In Optimisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__USE_IN_OPTIMISATION = 5;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.Metrics.impl.MetricDefaultImpl <em>Metric Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.Metrics.impl.MetricDefaultImpl
	 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getMetricDefault()
	 * @generated
	 */
	int METRIC_DEFAULT = 4;

	/**
	 * The feature id for the '<em><b>Default Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_DEFAULT__DEFAULT_VAL = 0;

	/**
	 * The number of structural features of the '<em>Metric Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_DEFAULT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Metric Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_DEFAULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.Metrics.impl.VariableMetricImpl <em>Variable Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.Metrics.impl.VariableMetricImpl
	 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getVariableMetric()
	 * @generated
	 */
	int VARIABLE_METRIC = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_METRIC__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_METRIC__DIR = METRIC__DIR;

	/**
	 * The feature id for the '<em><b>Related Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_METRIC__RELATED_VARIABLES = METRIC__RELATED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Value If Not Received</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_METRIC__VALUE_IF_NOT_RECEIVED = METRIC__VALUE_IF_NOT_RECEIVED;

	/**
	 * The feature id for the '<em><b>Init Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_METRIC__INIT_VALUE = METRIC__INIT_VALUE;

	/**
	 * The feature id for the '<em><b>Use In Optimisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_METRIC__USE_IN_OPTIMISATION = METRIC__USE_IN_OPTIMISATION;

	/**
	 * The feature id for the '<em><b>Chosen Variables</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_METRIC__CHOSEN_VARIABLES = METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_METRIC_FEATURE_COUNT = METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_METRIC_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.Metrics.impl.MetricInstanceImpl <em>Metric Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.Metrics.impl.MetricInstanceImpl
	 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getMetricInstance()
	 * @generated
	 */
	int METRIC_INSTANCE = 6;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_INSTANCE__METRIC = 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_INSTANCE__RESULT = 1;

	/**
	 * The feature id for the '<em><b>Result String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_INSTANCE__RESULT_STRING = 2;

	/**
	 * The number of structural features of the '<em>Metric Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_INSTANCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Metric Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.Metrics.impl.PropertyMetricImpl <em>Property Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.Metrics.impl.PropertyMetricImpl
	 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getPropertyMetric()
	 * @generated
	 */
	int PROPERTY_METRIC = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_METRIC__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_METRIC__DIR = METRIC__DIR;

	/**
	 * The feature id for the '<em><b>Related Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_METRIC__RELATED_VARIABLES = METRIC__RELATED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Value If Not Received</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_METRIC__VALUE_IF_NOT_RECEIVED = METRIC__VALUE_IF_NOT_RECEIVED;

	/**
	 * The feature id for the '<em><b>Init Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_METRIC__INIT_VALUE = METRIC__INIT_VALUE;

	/**
	 * The feature id for the '<em><b>Use In Optimisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_METRIC__USE_IN_OPTIMISATION = METRIC__USE_IN_OPTIMISATION;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_METRIC__PROPERTY = METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_METRIC_FEATURE_COUNT = METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_METRIC_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.Metrics.impl.StreamMetricImpl <em>Stream Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.Metrics.impl.StreamMetricImpl
	 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getStreamMetric()
	 * @generated
	 */
	int STREAM_METRIC = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_METRIC__NAME = METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_METRIC__DIR = METRIC__DIR;

	/**
	 * The feature id for the '<em><b>Related Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_METRIC__RELATED_VARIABLES = METRIC__RELATED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Value If Not Received</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_METRIC__VALUE_IF_NOT_RECEIVED = METRIC__VALUE_IF_NOT_RECEIVED;

	/**
	 * The feature id for the '<em><b>Init Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_METRIC__INIT_VALUE = METRIC__INIT_VALUE;

	/**
	 * The feature id for the '<em><b>Use In Optimisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_METRIC__USE_IN_OPTIMISATION = METRIC__USE_IN_OPTIMISATION;

	/**
	 * The feature id for the '<em><b>Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_METRIC__STREAMS = METRIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Res</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_METRIC__RES = METRIC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stream Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_METRIC_FEATURE_COUNT = METRIC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Stream Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_METRIC_OPERATION_COUNT = METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.Metrics.impl.SpecialMetricImpl <em>Special Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.Metrics.impl.SpecialMetricImpl
	 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getSpecialMetric()
	 * @generated
	 */
	int SPECIAL_METRIC = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_METRIC__NAME = STREAM_METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_METRIC__DIR = STREAM_METRIC__DIR;

	/**
	 * The feature id for the '<em><b>Related Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_METRIC__RELATED_VARIABLES = STREAM_METRIC__RELATED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Value If Not Received</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_METRIC__VALUE_IF_NOT_RECEIVED = STREAM_METRIC__VALUE_IF_NOT_RECEIVED;

	/**
	 * The feature id for the '<em><b>Init Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_METRIC__INIT_VALUE = STREAM_METRIC__INIT_VALUE;

	/**
	 * The feature id for the '<em><b>Use In Optimisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_METRIC__USE_IN_OPTIMISATION = STREAM_METRIC__USE_IN_OPTIMISATION;

	/**
	 * The feature id for the '<em><b>Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_METRIC__STREAMS = STREAM_METRIC__STREAMS;

	/**
	 * The feature id for the '<em><b>Res</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_METRIC__RES = STREAM_METRIC__RES;

	/**
	 * The number of structural features of the '<em>Special Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_METRIC_FEATURE_COUNT = STREAM_METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Special Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_METRIC_OPERATION_COUNT = STREAM_METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.Metrics.impl.DirectMessageGenerationMetricImpl <em>Direct Message Generation Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.Metrics.impl.DirectMessageGenerationMetricImpl
	 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getDirectMessageGenerationMetric()
	 * @generated
	 */
	int DIRECT_MESSAGE_GENERATION_METRIC = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MESSAGE_GENERATION_METRIC__NAME = STREAM_METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MESSAGE_GENERATION_METRIC__DIR = STREAM_METRIC__DIR;

	/**
	 * The feature id for the '<em><b>Related Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MESSAGE_GENERATION_METRIC__RELATED_VARIABLES = STREAM_METRIC__RELATED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Value If Not Received</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MESSAGE_GENERATION_METRIC__VALUE_IF_NOT_RECEIVED = STREAM_METRIC__VALUE_IF_NOT_RECEIVED;

	/**
	 * The feature id for the '<em><b>Init Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MESSAGE_GENERATION_METRIC__INIT_VALUE = STREAM_METRIC__INIT_VALUE;

	/**
	 * The feature id for the '<em><b>Use In Optimisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MESSAGE_GENERATION_METRIC__USE_IN_OPTIMISATION = STREAM_METRIC__USE_IN_OPTIMISATION;

	/**
	 * The feature id for the '<em><b>Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MESSAGE_GENERATION_METRIC__STREAMS = STREAM_METRIC__STREAMS;

	/**
	 * The feature id for the '<em><b>Res</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MESSAGE_GENERATION_METRIC__RES = STREAM_METRIC__RES;

	/**
	 * The number of structural features of the '<em>Direct Message Generation Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MESSAGE_GENERATION_METRIC_FEATURE_COUNT = STREAM_METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Direct Message Generation Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MESSAGE_GENERATION_METRIC_OPERATION_COUNT = STREAM_METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.Metrics.impl.StartEndTimingMetricImpl <em>Start End Timing Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.Metrics.impl.StartEndTimingMetricImpl
	 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getStartEndTimingMetric()
	 * @generated
	 */
	int START_END_TIMING_METRIC = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_END_TIMING_METRIC__NAME = DIRECT_MESSAGE_GENERATION_METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_END_TIMING_METRIC__DIR = DIRECT_MESSAGE_GENERATION_METRIC__DIR;

	/**
	 * The feature id for the '<em><b>Related Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_END_TIMING_METRIC__RELATED_VARIABLES = DIRECT_MESSAGE_GENERATION_METRIC__RELATED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Value If Not Received</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_END_TIMING_METRIC__VALUE_IF_NOT_RECEIVED = DIRECT_MESSAGE_GENERATION_METRIC__VALUE_IF_NOT_RECEIVED;

	/**
	 * The feature id for the '<em><b>Init Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_END_TIMING_METRIC__INIT_VALUE = DIRECT_MESSAGE_GENERATION_METRIC__INIT_VALUE;

	/**
	 * The feature id for the '<em><b>Use In Optimisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_END_TIMING_METRIC__USE_IN_OPTIMISATION = DIRECT_MESSAGE_GENERATION_METRIC__USE_IN_OPTIMISATION;

	/**
	 * The feature id for the '<em><b>Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_END_TIMING_METRIC__STREAMS = DIRECT_MESSAGE_GENERATION_METRIC__STREAMS;

	/**
	 * The feature id for the '<em><b>Res</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_END_TIMING_METRIC__RES = DIRECT_MESSAGE_GENERATION_METRIC__RES;

	/**
	 * The number of structural features of the '<em>Start End Timing Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_END_TIMING_METRIC_FEATURE_COUNT = DIRECT_MESSAGE_GENERATION_METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start End Timing Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_END_TIMING_METRIC_OPERATION_COUNT = DIRECT_MESSAGE_GENERATION_METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.Metrics.impl.FuzzingOperationTimesMetricImpl <em>Fuzzing Operation Times Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.Metrics.impl.FuzzingOperationTimesMetricImpl
	 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getFuzzingOperationTimesMetric()
	 * @generated
	 */
	int FUZZING_OPERATION_TIMES_METRIC = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION_TIMES_METRIC__NAME = SPECIAL_METRIC__NAME;

	/**
	 * The feature id for the '<em><b>Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION_TIMES_METRIC__DIR = SPECIAL_METRIC__DIR;

	/**
	 * The feature id for the '<em><b>Related Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION_TIMES_METRIC__RELATED_VARIABLES = SPECIAL_METRIC__RELATED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Value If Not Received</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION_TIMES_METRIC__VALUE_IF_NOT_RECEIVED = SPECIAL_METRIC__VALUE_IF_NOT_RECEIVED;

	/**
	 * The feature id for the '<em><b>Init Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION_TIMES_METRIC__INIT_VALUE = SPECIAL_METRIC__INIT_VALUE;

	/**
	 * The feature id for the '<em><b>Use In Optimisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION_TIMES_METRIC__USE_IN_OPTIMISATION = SPECIAL_METRIC__USE_IN_OPTIMISATION;

	/**
	 * The feature id for the '<em><b>Streams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION_TIMES_METRIC__STREAMS = SPECIAL_METRIC__STREAMS;

	/**
	 * The feature id for the '<em><b>Res</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION_TIMES_METRIC__RES = SPECIAL_METRIC__RES;

	/**
	 * The number of structural features of the '<em>Fuzzing Operation Times Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION_TIMES_METRIC_FEATURE_COUNT = SPECIAL_METRIC_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuzzing Operation Times Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION_TIMES_METRIC_OPERATION_COUNT = SPECIAL_METRIC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.Metrics.impl.StreamResultImpl <em>Stream Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.Metrics.impl.StreamResultImpl
	 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getStreamResult()
	 * @generated
	 */
	int STREAM_RESULT = 13;

	/**
	 * The number of structural features of the '<em>Stream Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RESULT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Stream Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_RESULT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.Metrics.impl.FileStreamResultImpl <em>File Stream Result</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.Metrics.impl.FileStreamResultImpl
	 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getFileStreamResult()
	 * @generated
	 */
	int FILE_STREAM_RESULT = 14;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STREAM_RESULT__FILENAME = STREAM_RESULT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Stream Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STREAM_RESULT_FEATURE_COUNT = STREAM_RESULT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>File Stream Result</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_STREAM_RESULT_OPERATION_COUNT = STREAM_RESULT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.Metrics.MetricOptimisationDirection <em>Metric Optimisation Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.Metrics.MetricOptimisationDirection
	 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getMetricOptimisationDirection()
	 * @generated
	 */
	int METRIC_OPTIMISATION_DIRECTION = 15;


	/**
	 * Returns the meta object for class '{@link TestingPackage.Metrics.SimStream <em>Sim Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sim Stream</em>'.
	 * @see TestingPackage.Metrics.SimStream
	 * @generated
	 */
	EClass getSimStream();

	/**
	 * Returns the meta object for class '{@link TestingPackage.Metrics.InputStream <em>Input Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Stream</em>'.
	 * @see TestingPackage.Metrics.InputStream
	 * @generated
	 */
	EClass getInputStream();

	/**
	 * Returns the meta object for class '{@link TestingPackage.Metrics.OutputStream <em>Output Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Stream</em>'.
	 * @see TestingPackage.Metrics.OutputStream
	 * @generated
	 */
	EClass getOutputStream();

	/**
	 * Returns the meta object for class '{@link TestingPackage.Metrics.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see TestingPackage.Metrics.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.Metrics.Metric#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TestingPackage.Metrics.Metric#getName()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Name();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.Metrics.Metric#getDir <em>Dir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dir</em>'.
	 * @see TestingPackage.Metrics.Metric#getDir()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Dir();

	/**
	 * Returns the meta object for the reference list '{@link TestingPackage.Metrics.Metric#getRelatedVariables <em>Related Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Variables</em>'.
	 * @see TestingPackage.Metrics.Metric#getRelatedVariables()
	 * @see #getMetric()
	 * @generated
	 */
	EReference getMetric_RelatedVariables();

	/**
	 * Returns the meta object for the containment reference '{@link TestingPackage.Metrics.Metric#getValueIfNotReceived <em>Value If Not Received</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value If Not Received</em>'.
	 * @see TestingPackage.Metrics.Metric#getValueIfNotReceived()
	 * @see #getMetric()
	 * @generated
	 */
	EReference getMetric_ValueIfNotReceived();

	/**
	 * Returns the meta object for the containment reference '{@link TestingPackage.Metrics.Metric#getInitValue <em>Init Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Value</em>'.
	 * @see TestingPackage.Metrics.Metric#getInitValue()
	 * @see #getMetric()
	 * @generated
	 */
	EReference getMetric_InitValue();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.Metrics.Metric#isUseInOptimisation <em>Use In Optimisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use In Optimisation</em>'.
	 * @see TestingPackage.Metrics.Metric#isUseInOptimisation()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_UseInOptimisation();

	/**
	 * Returns the meta object for class '{@link TestingPackage.Metrics.MetricDefault <em>Metric Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric Default</em>'.
	 * @see TestingPackage.Metrics.MetricDefault
	 * @generated
	 */
	EClass getMetricDefault();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.Metrics.MetricDefault#getDefaultVal <em>Default Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Val</em>'.
	 * @see TestingPackage.Metrics.MetricDefault#getDefaultVal()
	 * @see #getMetricDefault()
	 * @generated
	 */
	EAttribute getMetricDefault_DefaultVal();

	/**
	 * Returns the meta object for class '{@link TestingPackage.Metrics.VariableMetric <em>Variable Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Metric</em>'.
	 * @see TestingPackage.Metrics.VariableMetric
	 * @generated
	 */
	EClass getVariableMetric();

	/**
	 * Returns the meta object for the reference '{@link TestingPackage.Metrics.VariableMetric#getChosenVariables <em>Chosen Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Chosen Variables</em>'.
	 * @see TestingPackage.Metrics.VariableMetric#getChosenVariables()
	 * @see #getVariableMetric()
	 * @generated
	 */
	EReference getVariableMetric_ChosenVariables();

	/**
	 * Returns the meta object for class '{@link TestingPackage.Metrics.MetricInstance <em>Metric Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric Instance</em>'.
	 * @see TestingPackage.Metrics.MetricInstance
	 * @generated
	 */
	EClass getMetricInstance();

	/**
	 * Returns the meta object for the reference '{@link TestingPackage.Metrics.MetricInstance#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric</em>'.
	 * @see TestingPackage.Metrics.MetricInstance#getMetric()
	 * @see #getMetricInstance()
	 * @generated
	 */
	EReference getMetricInstance_Metric();

	/**
	 * Returns the meta object for the containment reference '{@link TestingPackage.Metrics.MetricInstance#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see TestingPackage.Metrics.MetricInstance#getResult()
	 * @see #getMetricInstance()
	 * @generated
	 */
	EReference getMetricInstance_Result();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.Metrics.MetricInstance#getResultString <em>Result String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result String</em>'.
	 * @see TestingPackage.Metrics.MetricInstance#getResultString()
	 * @see #getMetricInstance()
	 * @generated
	 */
	EAttribute getMetricInstance_ResultString();

	/**
	 * Returns the meta object for class '{@link TestingPackage.Metrics.PropertyMetric <em>Property Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Metric</em>'.
	 * @see TestingPackage.Metrics.PropertyMetric
	 * @generated
	 */
	EClass getPropertyMetric();

	/**
	 * Returns the meta object for the reference '{@link TestingPackage.Metrics.PropertyMetric#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see TestingPackage.Metrics.PropertyMetric#getProperty()
	 * @see #getPropertyMetric()
	 * @generated
	 */
	EReference getPropertyMetric_Property();

	/**
	 * Returns the meta object for class '{@link TestingPackage.Metrics.StreamMetric <em>Stream Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream Metric</em>'.
	 * @see TestingPackage.Metrics.StreamMetric
	 * @generated
	 */
	EClass getStreamMetric();

	/**
	 * Returns the meta object for the containment reference list '{@link TestingPackage.Metrics.StreamMetric#getStreams <em>Streams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Streams</em>'.
	 * @see TestingPackage.Metrics.StreamMetric#getStreams()
	 * @see #getStreamMetric()
	 * @generated
	 */
	EReference getStreamMetric_Streams();

	/**
	 * Returns the meta object for the containment reference '{@link TestingPackage.Metrics.StreamMetric#getRes <em>Res</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Res</em>'.
	 * @see TestingPackage.Metrics.StreamMetric#getRes()
	 * @see #getStreamMetric()
	 * @generated
	 */
	EReference getStreamMetric_Res();

	/**
	 * Returns the meta object for class '{@link TestingPackage.Metrics.SpecialMetric <em>Special Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special Metric</em>'.
	 * @see TestingPackage.Metrics.SpecialMetric
	 * @generated
	 */
	EClass getSpecialMetric();

	/**
	 * Returns the meta object for class '{@link TestingPackage.Metrics.DirectMessageGenerationMetric <em>Direct Message Generation Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Message Generation Metric</em>'.
	 * @see TestingPackage.Metrics.DirectMessageGenerationMetric
	 * @generated
	 */
	EClass getDirectMessageGenerationMetric();

	/**
	 * Returns the meta object for class '{@link TestingPackage.Metrics.StartEndTimingMetric <em>Start End Timing Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start End Timing Metric</em>'.
	 * @see TestingPackage.Metrics.StartEndTimingMetric
	 * @generated
	 */
	EClass getStartEndTimingMetric();

	/**
	 * Returns the meta object for class '{@link TestingPackage.Metrics.FuzzingOperationTimesMetric <em>Fuzzing Operation Times Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuzzing Operation Times Metric</em>'.
	 * @see TestingPackage.Metrics.FuzzingOperationTimesMetric
	 * @generated
	 */
	EClass getFuzzingOperationTimesMetric();

	/**
	 * Returns the meta object for class '{@link TestingPackage.Metrics.StreamResult <em>Stream Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream Result</em>'.
	 * @see TestingPackage.Metrics.StreamResult
	 * @generated
	 */
	EClass getStreamResult();

	/**
	 * Returns the meta object for class '{@link TestingPackage.Metrics.FileStreamResult <em>File Stream Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Stream Result</em>'.
	 * @see TestingPackage.Metrics.FileStreamResult
	 * @generated
	 */
	EClass getFileStreamResult();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.Metrics.FileStreamResult#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see TestingPackage.Metrics.FileStreamResult#getFilename()
	 * @see #getFileStreamResult()
	 * @generated
	 */
	EAttribute getFileStreamResult_Filename();

	/**
	 * Returns the meta object for enum '{@link TestingPackage.Metrics.MetricOptimisationDirection <em>Metric Optimisation Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Metric Optimisation Direction</em>'.
	 * @see TestingPackage.Metrics.MetricOptimisationDirection
	 * @generated
	 */
	EEnum getMetricOptimisationDirection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetricsFactory getMetricsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link TestingPackage.Metrics.impl.SimStreamImpl <em>Sim Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.Metrics.impl.SimStreamImpl
		 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getSimStream()
		 * @generated
		 */
		EClass SIM_STREAM = eINSTANCE.getSimStream();

		/**
		 * The meta object literal for the '{@link TestingPackage.Metrics.impl.InputStreamImpl <em>Input Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.Metrics.impl.InputStreamImpl
		 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getInputStream()
		 * @generated
		 */
		EClass INPUT_STREAM = eINSTANCE.getInputStream();

		/**
		 * The meta object literal for the '{@link TestingPackage.Metrics.impl.OutputStreamImpl <em>Output Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.Metrics.impl.OutputStreamImpl
		 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getOutputStream()
		 * @generated
		 */
		EClass OUTPUT_STREAM = eINSTANCE.getOutputStream();

		/**
		 * The meta object literal for the '{@link TestingPackage.Metrics.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.Metrics.impl.MetricImpl
		 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__NAME = eINSTANCE.getMetric_Name();

		/**
		 * The meta object literal for the '<em><b>Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__DIR = eINSTANCE.getMetric_Dir();

		/**
		 * The meta object literal for the '<em><b>Related Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC__RELATED_VARIABLES = eINSTANCE.getMetric_RelatedVariables();

		/**
		 * The meta object literal for the '<em><b>Value If Not Received</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC__VALUE_IF_NOT_RECEIVED = eINSTANCE.getMetric_ValueIfNotReceived();

		/**
		 * The meta object literal for the '<em><b>Init Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC__INIT_VALUE = eINSTANCE.getMetric_InitValue();

		/**
		 * The meta object literal for the '<em><b>Use In Optimisation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__USE_IN_OPTIMISATION = eINSTANCE.getMetric_UseInOptimisation();

		/**
		 * The meta object literal for the '{@link TestingPackage.Metrics.impl.MetricDefaultImpl <em>Metric Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.Metrics.impl.MetricDefaultImpl
		 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getMetricDefault()
		 * @generated
		 */
		EClass METRIC_DEFAULT = eINSTANCE.getMetricDefault();

		/**
		 * The meta object literal for the '<em><b>Default Val</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC_DEFAULT__DEFAULT_VAL = eINSTANCE.getMetricDefault_DefaultVal();

		/**
		 * The meta object literal for the '{@link TestingPackage.Metrics.impl.VariableMetricImpl <em>Variable Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.Metrics.impl.VariableMetricImpl
		 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getVariableMetric()
		 * @generated
		 */
		EClass VARIABLE_METRIC = eINSTANCE.getVariableMetric();

		/**
		 * The meta object literal for the '<em><b>Chosen Variables</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_METRIC__CHOSEN_VARIABLES = eINSTANCE.getVariableMetric_ChosenVariables();

		/**
		 * The meta object literal for the '{@link TestingPackage.Metrics.impl.MetricInstanceImpl <em>Metric Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.Metrics.impl.MetricInstanceImpl
		 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getMetricInstance()
		 * @generated
		 */
		EClass METRIC_INSTANCE = eINSTANCE.getMetricInstance();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_INSTANCE__METRIC = eINSTANCE.getMetricInstance_Metric();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METRIC_INSTANCE__RESULT = eINSTANCE.getMetricInstance_Result();

		/**
		 * The meta object literal for the '<em><b>Result String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC_INSTANCE__RESULT_STRING = eINSTANCE.getMetricInstance_ResultString();

		/**
		 * The meta object literal for the '{@link TestingPackage.Metrics.impl.PropertyMetricImpl <em>Property Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.Metrics.impl.PropertyMetricImpl
		 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getPropertyMetric()
		 * @generated
		 */
		EClass PROPERTY_METRIC = eINSTANCE.getPropertyMetric();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_METRIC__PROPERTY = eINSTANCE.getPropertyMetric_Property();

		/**
		 * The meta object literal for the '{@link TestingPackage.Metrics.impl.StreamMetricImpl <em>Stream Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.Metrics.impl.StreamMetricImpl
		 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getStreamMetric()
		 * @generated
		 */
		EClass STREAM_METRIC = eINSTANCE.getStreamMetric();

		/**
		 * The meta object literal for the '<em><b>Streams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAM_METRIC__STREAMS = eINSTANCE.getStreamMetric_Streams();

		/**
		 * The meta object literal for the '<em><b>Res</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STREAM_METRIC__RES = eINSTANCE.getStreamMetric_Res();

		/**
		 * The meta object literal for the '{@link TestingPackage.Metrics.impl.SpecialMetricImpl <em>Special Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.Metrics.impl.SpecialMetricImpl
		 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getSpecialMetric()
		 * @generated
		 */
		EClass SPECIAL_METRIC = eINSTANCE.getSpecialMetric();

		/**
		 * The meta object literal for the '{@link TestingPackage.Metrics.impl.DirectMessageGenerationMetricImpl <em>Direct Message Generation Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.Metrics.impl.DirectMessageGenerationMetricImpl
		 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getDirectMessageGenerationMetric()
		 * @generated
		 */
		EClass DIRECT_MESSAGE_GENERATION_METRIC = eINSTANCE.getDirectMessageGenerationMetric();

		/**
		 * The meta object literal for the '{@link TestingPackage.Metrics.impl.StartEndTimingMetricImpl <em>Start End Timing Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.Metrics.impl.StartEndTimingMetricImpl
		 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getStartEndTimingMetric()
		 * @generated
		 */
		EClass START_END_TIMING_METRIC = eINSTANCE.getStartEndTimingMetric();

		/**
		 * The meta object literal for the '{@link TestingPackage.Metrics.impl.FuzzingOperationTimesMetricImpl <em>Fuzzing Operation Times Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.Metrics.impl.FuzzingOperationTimesMetricImpl
		 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getFuzzingOperationTimesMetric()
		 * @generated
		 */
		EClass FUZZING_OPERATION_TIMES_METRIC = eINSTANCE.getFuzzingOperationTimesMetric();

		/**
		 * The meta object literal for the '{@link TestingPackage.Metrics.impl.StreamResultImpl <em>Stream Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.Metrics.impl.StreamResultImpl
		 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getStreamResult()
		 * @generated
		 */
		EClass STREAM_RESULT = eINSTANCE.getStreamResult();

		/**
		 * The meta object literal for the '{@link TestingPackage.Metrics.impl.FileStreamResultImpl <em>File Stream Result</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.Metrics.impl.FileStreamResultImpl
		 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getFileStreamResult()
		 * @generated
		 */
		EClass FILE_STREAM_RESULT = eINSTANCE.getFileStreamResult();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_STREAM_RESULT__FILENAME = eINSTANCE.getFileStreamResult_Filename();

		/**
		 * The meta object literal for the '{@link TestingPackage.Metrics.MetricOptimisationDirection <em>Metric Optimisation Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.Metrics.MetricOptimisationDirection
		 * @see TestingPackage.Metrics.impl.MetricsPackageImpl#getMetricOptimisationDirection()
		 * @generated
		 */
		EEnum METRIC_OPTIMISATION_DIRECTION = eINSTANCE.getMetricOptimisationDirection();

	}

} //MetricsPackage
