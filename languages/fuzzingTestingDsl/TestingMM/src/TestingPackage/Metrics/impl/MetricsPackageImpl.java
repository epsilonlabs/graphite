/**
 */
package TestingPackage.Metrics.impl;

import TestingPackage.FuzzingOperations.FuzzingOperationsPackage;

import TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl;

import TestingPackage.MRSPackage.MRSPackagePackage;

import TestingPackage.MRSPackage.impl.MRSPackagePackageImpl;

import TestingPackage.Metrics.DirectMessageGenerationMetric;
import TestingPackage.Metrics.FileStreamResult;
import TestingPackage.Metrics.FuzzingOperationTimesMetric;
import TestingPackage.Metrics.InputStream;
import TestingPackage.Metrics.Metric;
import TestingPackage.Metrics.MetricDefault;
import TestingPackage.Metrics.MetricInstance;
import TestingPackage.Metrics.MetricOptimisationDirection;
import TestingPackage.Metrics.MetricsFactory;
import TestingPackage.Metrics.MetricsPackage;
import TestingPackage.Metrics.OutputStream;
import TestingPackage.Metrics.PropertyMetric;
import TestingPackage.Metrics.SimStream;
import TestingPackage.Metrics.SpecialMetric;
import TestingPackage.Metrics.StartEndTimingMetric;
import TestingPackage.Metrics.StreamMetric;
import TestingPackage.Metrics.StreamResult;
import TestingPackage.Metrics.VariableMetric;

import TestingPackage.Results.ResultsPackage;

import TestingPackage.Results.impl.ResultsPackageImpl;

import TestingPackage.StandardGrammar.StandardGrammarPackage;

import TestingPackage.StandardGrammar.impl.StandardGrammarPackageImpl;

import TestingPackage.TestingMMPackage;

import TestingPackage.impl.TestingMMPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetricsPackageImpl extends EPackageImpl implements MetricsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simStreamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputStreamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputStreamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streamMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specialMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directMessageGenerationMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEndTimingMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fuzzingOperationTimesMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass streamResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileStreamResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum metricOptimisationDirectionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see TestingPackage.Metrics.MetricsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetricsPackageImpl() {
		super(eNS_URI, MetricsFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MetricsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MetricsPackage init() {
		if (isInited) return (MetricsPackage)EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMetricsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MetricsPackageImpl theMetricsPackage = registeredMetricsPackage instanceof MetricsPackageImpl ? (MetricsPackageImpl)registeredMetricsPackage : new MetricsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestingMMPackage.eNS_URI);
		TestingMMPackageImpl theTestingMMPackage = (TestingMMPackageImpl)(registeredPackage instanceof TestingMMPackageImpl ? registeredPackage : TestingMMPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FuzzingOperationsPackage.eNS_URI);
		FuzzingOperationsPackageImpl theFuzzingOperationsPackage = (FuzzingOperationsPackageImpl)(registeredPackage instanceof FuzzingOperationsPackageImpl ? registeredPackage : FuzzingOperationsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResultsPackage.eNS_URI);
		ResultsPackageImpl theResultsPackage = (ResultsPackageImpl)(registeredPackage instanceof ResultsPackageImpl ? registeredPackage : ResultsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StandardGrammarPackage.eNS_URI);
		StandardGrammarPackageImpl theStandardGrammarPackage = (StandardGrammarPackageImpl)(registeredPackage instanceof StandardGrammarPackageImpl ? registeredPackage : StandardGrammarPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MRSPackagePackage.eNS_URI);
		MRSPackagePackageImpl theMRSPackagePackage = (MRSPackagePackageImpl)(registeredPackage instanceof MRSPackagePackageImpl ? registeredPackage : MRSPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theMetricsPackage.createPackageContents();
		theTestingMMPackage.createPackageContents();
		theFuzzingOperationsPackage.createPackageContents();
		theResultsPackage.createPackageContents();
		theStandardGrammarPackage.createPackageContents();
		theMRSPackagePackage.createPackageContents();

		// Initialize created meta-data
		theMetricsPackage.initializePackageContents();
		theTestingMMPackage.initializePackageContents();
		theFuzzingOperationsPackage.initializePackageContents();
		theResultsPackage.initializePackageContents();
		theStandardGrammarPackage.initializePackageContents();
		theMRSPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetricsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetricsPackage.eNS_URI, theMetricsPackage);
		return theMetricsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimStream() {
		return simStreamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputStream() {
		return inputStreamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputStream() {
		return outputStreamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetric() {
		return metricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_Name() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_Dir() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetric_RelatedVariables() {
		return (EReference)metricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetric_ValueIfNotReceived() {
		return (EReference)metricEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetric_InitValue() {
		return (EReference)metricEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetric_UseInOptimisation() {
		return (EAttribute)metricEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetricDefault() {
		return metricDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetricDefault_DefaultVal() {
		return (EAttribute)metricDefaultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableMetric() {
		return variableMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableMetric_ChosenVariables() {
		return (EReference)variableMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetricInstance() {
		return metricInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricInstance_Metric() {
		return (EReference)metricInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetricInstance_Result() {
		return (EReference)metricInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetricInstance_ResultString() {
		return (EAttribute)metricInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyMetric() {
		return propertyMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyMetric_Property() {
		return (EReference)propertyMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStreamMetric() {
		return streamMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStreamMetric_Streams() {
		return (EReference)streamMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStreamMetric_Res() {
		return (EReference)streamMetricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecialMetric() {
		return specialMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectMessageGenerationMetric() {
		return directMessageGenerationMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartEndTimingMetric() {
		return startEndTimingMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuzzingOperationTimesMetric() {
		return fuzzingOperationTimesMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStreamResult() {
		return streamResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileStreamResult() {
		return fileStreamResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileStreamResult_Filename() {
		return (EAttribute)fileStreamResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMetricOptimisationDirection() {
		return metricOptimisationDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsFactory getMetricsFactory() {
		return (MetricsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		simStreamEClass = createEClass(SIM_STREAM);

		inputStreamEClass = createEClass(INPUT_STREAM);

		outputStreamEClass = createEClass(OUTPUT_STREAM);

		metricEClass = createEClass(METRIC);
		createEAttribute(metricEClass, METRIC__NAME);
		createEAttribute(metricEClass, METRIC__DIR);
		createEReference(metricEClass, METRIC__RELATED_VARIABLES);
		createEReference(metricEClass, METRIC__VALUE_IF_NOT_RECEIVED);
		createEReference(metricEClass, METRIC__INIT_VALUE);
		createEAttribute(metricEClass, METRIC__USE_IN_OPTIMISATION);

		metricDefaultEClass = createEClass(METRIC_DEFAULT);
		createEAttribute(metricDefaultEClass, METRIC_DEFAULT__DEFAULT_VAL);

		variableMetricEClass = createEClass(VARIABLE_METRIC);
		createEReference(variableMetricEClass, VARIABLE_METRIC__CHOSEN_VARIABLES);

		metricInstanceEClass = createEClass(METRIC_INSTANCE);
		createEReference(metricInstanceEClass, METRIC_INSTANCE__METRIC);
		createEReference(metricInstanceEClass, METRIC_INSTANCE__RESULT);
		createEAttribute(metricInstanceEClass, METRIC_INSTANCE__RESULT_STRING);

		propertyMetricEClass = createEClass(PROPERTY_METRIC);
		createEReference(propertyMetricEClass, PROPERTY_METRIC__PROPERTY);

		streamMetricEClass = createEClass(STREAM_METRIC);
		createEReference(streamMetricEClass, STREAM_METRIC__STREAMS);
		createEReference(streamMetricEClass, STREAM_METRIC__RES);

		specialMetricEClass = createEClass(SPECIAL_METRIC);

		directMessageGenerationMetricEClass = createEClass(DIRECT_MESSAGE_GENERATION_METRIC);

		startEndTimingMetricEClass = createEClass(START_END_TIMING_METRIC);

		fuzzingOperationTimesMetricEClass = createEClass(FUZZING_OPERATION_TIMES_METRIC);

		streamResultEClass = createEClass(STREAM_RESULT);

		fileStreamResultEClass = createEClass(FILE_STREAM_RESULT);
		createEAttribute(fileStreamResultEClass, FILE_STREAM_RESULT__FILENAME);

		// Create enums
		metricOptimisationDirectionEEnum = createEEnum(METRIC_OPTIMISATION_DIRECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		MRSPackagePackage theMRSPackagePackage = (MRSPackagePackage)EPackage.Registry.INSTANCE.getEPackage(MRSPackagePackage.eNS_URI);
		ResultsPackage theResultsPackage = (ResultsPackage)EPackage.Registry.INSTANCE.getEPackage(ResultsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		inputStreamEClass.getESuperTypes().add(this.getSimStream());
		outputStreamEClass.getESuperTypes().add(this.getSimStream());
		variableMetricEClass.getESuperTypes().add(this.getMetric());
		propertyMetricEClass.getESuperTypes().add(this.getMetric());
		streamMetricEClass.getESuperTypes().add(this.getMetric());
		specialMetricEClass.getESuperTypes().add(this.getStreamMetric());
		directMessageGenerationMetricEClass.getESuperTypes().add(this.getStreamMetric());
		startEndTimingMetricEClass.getESuperTypes().add(this.getDirectMessageGenerationMetric());
		fuzzingOperationTimesMetricEClass.getESuperTypes().add(this.getSpecialMetric());
		fileStreamResultEClass.getESuperTypes().add(this.getStreamResult());

		// Initialize classes, features, and operations; add parameters
		initEClass(simStreamEClass, SimStream.class, "SimStream", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputStreamEClass, InputStream.class, "InputStream", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outputStreamEClass, OutputStream.class, "OutputStream", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metricEClass, Metric.class, "Metric", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetric_Name(), ecorePackage.getEString(), "name", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_Dir(), this.getMetricOptimisationDirection(), "dir", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetric_RelatedVariables(), theMRSPackagePackage.getVariable(), null, "relatedVariables", null, 0, -1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetric_ValueIfNotReceived(), this.getMetricDefault(), null, "valueIfNotReceived", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetric_InitValue(), this.getMetricDefault(), null, "initValue", null, 1, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetric_UseInOptimisation(), ecorePackage.getEBoolean(), "useInOptimisation", null, 0, 1, Metric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricDefaultEClass, MetricDefault.class, "MetricDefault", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetricDefault_DefaultVal(), ecorePackage.getEDouble(), "defaultVal", null, 0, 1, MetricDefault.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableMetricEClass, VariableMetric.class, "VariableMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableMetric_ChosenVariables(), theMRSPackagePackage.getVariable(), null, "chosenVariables", null, 1, 1, VariableMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metricInstanceEClass, MetricInstance.class, "MetricInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetricInstance_Metric(), this.getMetric(), null, "metric", null, 1, 1, MetricInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetricInstance_Result(), theResultsPackage.getResult(), null, "result", null, 1, 1, MetricInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetricInstance_ResultString(), ecorePackage.getEString(), "resultString", null, 0, 1, MetricInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyMetricEClass, PropertyMetric.class, "PropertyMetric", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyMetric_Property(), theMRSPackagePackage.getComponentProperty(), null, "property", null, 1, 1, PropertyMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(streamMetricEClass, StreamMetric.class, "StreamMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStreamMetric_Streams(), this.getSimStream(), null, "streams", null, 0, -1, StreamMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStreamMetric_Res(), this.getStreamResult(), null, "res", null, 0, 1, StreamMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specialMetricEClass, SpecialMetric.class, "SpecialMetric", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(directMessageGenerationMetricEClass, DirectMessageGenerationMetric.class, "DirectMessageGenerationMetric", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(startEndTimingMetricEClass, StartEndTimingMetric.class, "StartEndTimingMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fuzzingOperationTimesMetricEClass, FuzzingOperationTimesMetric.class, "FuzzingOperationTimesMetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(streamResultEClass, StreamResult.class, "StreamResult", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fileStreamResultEClass, FileStreamResult.class, "FileStreamResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileStreamResult_Filename(), ecorePackage.getEString(), "filename", null, 0, 1, FileStreamResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(metricOptimisationDirectionEEnum, MetricOptimisationDirection.class, "MetricOptimisationDirection");
		addEEnumLiteral(metricOptimisationDirectionEEnum, MetricOptimisationDirection.HIGHEST);
		addEEnumLiteral(metricOptimisationDirectionEEnum, MetricOptimisationDirection.LOWEST);
	}

} //MetricsPackageImpl
