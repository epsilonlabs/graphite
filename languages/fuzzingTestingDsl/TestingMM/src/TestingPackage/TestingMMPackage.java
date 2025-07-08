/**
 */
package TestingPackage;

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
 * @see TestingPackage.TestingMMFactory
 * @model kind="package"
 * @generated
 */
public interface TestingMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TestingPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "TestingMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TestingMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestingMMPackage eINSTANCE = TestingPackage.impl.TestingMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link TestingPackage.impl.TestingSpaceImpl <em>Testing Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.impl.TestingSpaceImpl
	 * @see TestingPackage.impl.TestingMMPackageImpl#getTestingSpace()
	 * @generated
	 */
	int TESTING_SPACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SPACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SPACE__METRICS = 1;

	/**
	 * The feature id for the '<em><b>Possible Fuzzing Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SPACE__POSSIBLE_FUZZING_OPERATIONS = 2;

	/**
	 * The feature id for the '<em><b>Campaigns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SPACE__CAMPAIGNS = 3;

	/**
	 * The feature id for the '<em><b>Mrs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SPACE__MRS = 4;

	/**
	 * The number of structural features of the '<em>Testing Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SPACE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Testing Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTING_SPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.impl.TestCampaignImpl <em>Test Campaign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.impl.TestCampaignImpl
	 * @see TestingPackage.impl.TestingMMPackageImpl#getTestCampaign()
	 * @generated
	 */
	int TEST_CAMPAIGN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CAMPAIGN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CAMPAIGN__METRICS = 1;

	/**
	 * The feature id for the '<em><b>Condition Metrics</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CAMPAIGN__CONDITION_METRICS = 2;

	/**
	 * The feature id for the '<em><b>Activation Generation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CAMPAIGN__ACTIVATION_GENERATION = 3;

	/**
	 * The feature id for the '<em><b>Included Operations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CAMPAIGN__INCLUDED_OPERATIONS = 4;

	/**
	 * The feature id for the '<em><b>Approach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CAMPAIGN__APPROACH = 5;

	/**
	 * The feature id for the '<em><b>Performed Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CAMPAIGN__PERFORMED_TESTS = 6;

	/**
	 * The feature id for the '<em><b>Result Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CAMPAIGN__RESULT_SETS = 7;

	/**
	 * The feature id for the '<em><b>End Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CAMPAIGN__END_TRIGGER = 8;

	/**
	 * The number of structural features of the '<em>Test Campaign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CAMPAIGN_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Test Campaign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CAMPAIGN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.impl.TestImpl <em>Test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.impl.TestImpl
	 * @see TestingPackage.impl.TestingMMPackageImpl#getTest()
	 * @generated
	 */
	int TEST = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__NAME = 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__OPERATIONS = 1;

	/**
	 * The feature id for the '<em><b>Metrics</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__METRICS = 2;

	/**
	 * The feature id for the '<em><b>Developed From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__DEVELOPED_FROM = 3;

	/**
	 * The feature id for the '<em><b>Parent Campaign</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__PARENT_CAMPAIGN = 4;

	/**
	 * The feature id for the '<em><b>Debug Flags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__DEBUG_FLAGS = 5;

	/**
	 * The number of structural features of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.impl.TestDebuggingFlagsImpl <em>Test Debugging Flags</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.impl.TestDebuggingFlagsImpl
	 * @see TestingPackage.impl.TestingMMPackageImpl#getTestDebuggingFlags()
	 * @generated
	 */
	int TEST_DEBUGGING_FLAGS = 3;

	/**
	 * The number of structural features of the '<em>Test Debugging Flags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DEBUGGING_FLAGS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Test Debugging Flags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_DEBUGGING_FLAGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.impl.PassiveMonitorOnlyImpl <em>Passive Monitor Only</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.impl.PassiveMonitorOnlyImpl
	 * @see TestingPackage.impl.TestingMMPackageImpl#getPassiveMonitorOnly()
	 * @generated
	 */
	int PASSIVE_MONITOR_ONLY = 4;

	/**
	 * The number of structural features of the '<em>Passive Monitor Only</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_MONITOR_ONLY_FEATURE_COUNT = TEST_DEBUGGING_FLAGS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Passive Monitor Only</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_MONITOR_ONLY_OPERATION_COUNT = TEST_DEBUGGING_FLAGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.impl.ActivationGenerationMethodImpl <em>Activation Generation Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.impl.ActivationGenerationMethodImpl
	 * @see TestingPackage.impl.TestingMMPackageImpl#getActivationGenerationMethod()
	 * @generated
	 */
	int ACTIVATION_GENERATION_METHOD = 5;

	/**
	 * The number of structural features of the '<em>Activation Generation Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_GENERATION_METHOD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Activation Generation Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_GENERATION_METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.impl.TimeBasedActivationGenerationMethodImpl <em>Time Based Activation Generation Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.impl.TimeBasedActivationGenerationMethodImpl
	 * @see TestingPackage.impl.TestingMMPackageImpl#getTimeBasedActivationGenerationMethod()
	 * @generated
	 */
	int TIME_BASED_ACTIVATION_GENERATION_METHOD = 6;

	/**
	 * The number of structural features of the '<em>Time Based Activation Generation Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASED_ACTIVATION_GENERATION_METHOD_FEATURE_COUNT = ACTIVATION_GENERATION_METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Based Activation Generation Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASED_ACTIVATION_GENERATION_METHOD_OPERATION_COUNT = ACTIVATION_GENERATION_METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.impl.ConditionBasedActivationGenerationMethodImpl <em>Condition Based Activation Generation Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.impl.ConditionBasedActivationGenerationMethodImpl
	 * @see TestingPackage.impl.TestingMMPackageImpl#getConditionBasedActivationGenerationMethod()
	 * @generated
	 */
	int CONDITION_BASED_ACTIVATION_GENERATION_METHOD = 7;

	/**
	 * The feature id for the '<em><b>Condition Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_ACTIVATION_GENERATION_METHOD__CONDITION_DEPTH = ACTIVATION_GENERATION_METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Condition Based Activation Generation Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_ACTIVATION_GENERATION_METHOD_FEATURE_COUNT = ACTIVATION_GENERATION_METHOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Condition Based Activation Generation Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_ACTIVATION_GENERATION_METHOD_OPERATION_COUNT = ACTIVATION_GENERATION_METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.impl.CampaignResultSetImpl <em>Campaign Result Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.impl.CampaignResultSetImpl
	 * @see TestingPackage.impl.TestingMMPackageImpl#getCampaignResultSet()
	 * @generated
	 */
	int CAMPAIGN_RESULT_SET = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN_RESULT_SET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN_RESULT_SET__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Results</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN_RESULT_SET__RESULTS = 2;

	/**
	 * The number of structural features of the '<em>Campaign Result Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN_RESULT_SET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Campaign Result Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMPAIGN_RESULT_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.impl.ExecutionEndTriggerImpl <em>Execution End Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.impl.ExecutionEndTriggerImpl
	 * @see TestingPackage.impl.TestingMMPackageImpl#getExecutionEndTrigger()
	 * @generated
	 */
	int EXECUTION_END_TRIGGER = 9;

	/**
	 * The number of structural features of the '<em>Execution End Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_END_TRIGGER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Execution End Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_END_TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.impl.TimeBasedEndImpl <em>Time Based End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.impl.TimeBasedEndImpl
	 * @see TestingPackage.impl.TestingMMPackageImpl#getTimeBasedEnd()
	 * @generated
	 */
	int TIME_BASED_END = 10;

	/**
	 * The feature id for the '<em><b>Time Limit Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASED_END__TIME_LIMIT_SECONDS = EXECUTION_END_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Based End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASED_END_FEATURE_COUNT = EXECUTION_END_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Time Based End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_BASED_END_OPERATION_COUNT = EXECUTION_END_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.impl.TestGenerationApproachImpl <em>Test Generation Approach</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.impl.TestGenerationApproachImpl
	 * @see TestingPackage.impl.TestingMMPackageImpl#getTestGenerationApproach()
	 * @generated
	 */
	int TEST_GENERATION_APPROACH = 11;

	/**
	 * The number of structural features of the '<em>Test Generation Approach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_GENERATION_APPROACH_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Test Generation Approach</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_GENERATION_APPROACH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.impl.RandomTestGenerationImpl <em>Random Test Generation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.impl.RandomTestGenerationImpl
	 * @see TestingPackage.impl.TestingMMPackageImpl#getRandomTestGeneration()
	 * @generated
	 */
	int RANDOM_TEST_GENERATION = 12;

	/**
	 * The number of structural features of the '<em>Random Test Generation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_TEST_GENERATION_FEATURE_COUNT = TEST_GENERATION_APPROACH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Random Test Generation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_TEST_GENERATION_OPERATION_COUNT = TEST_GENERATION_APPROACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.impl.EvolutionaryAlgorithmImpl <em>Evolutionary Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.impl.EvolutionaryAlgorithmImpl
	 * @see TestingPackage.impl.TestingMMPackageImpl#getEvolutionaryAlgorithm()
	 * @generated
	 */
	int EVOLUTIONARY_ALGORITHM = 13;

	/**
	 * The number of structural features of the '<em>Evolutionary Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTIONARY_ALGORITHM_FEATURE_COUNT = TEST_GENERATION_APPROACH_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Evolutionary Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTIONARY_ALGORITHM_OPERATION_COUNT = TEST_GENERATION_APPROACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.impl.NSGAEvolutionaryAlgorithmImpl <em>NSGA Evolutionary Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.impl.NSGAEvolutionaryAlgorithmImpl
	 * @see TestingPackage.impl.TestingMMPackageImpl#getNSGAEvolutionaryAlgorithm()
	 * @generated
	 */
	int NSGA_EVOLUTIONARY_ALGORITHM = 14;

	/**
	 * The feature id for the '<em><b>Population Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSGA_EVOLUTIONARY_ALGORITHM__POPULATION_SIZE = EVOLUTIONARY_ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSGA_EVOLUTIONARY_ALGORITHM__ITERATIONS = EVOLUTIONARY_ALGORITHM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>NSGA Evolutionary Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSGA_EVOLUTIONARY_ALGORITHM_FEATURE_COUNT = EVOLUTIONARY_ALGORITHM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>NSGA Evolutionary Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSGA_EVOLUTIONARY_ALGORITHM_OPERATION_COUNT = EVOLUTIONARY_ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.impl.NSGAWithCoverageCellsImpl <em>NSGA With Coverage Cells</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.impl.NSGAWithCoverageCellsImpl
	 * @see TestingPackage.impl.TestingMMPackageImpl#getNSGAWithCoverageCells()
	 * @generated
	 */
	int NSGA_WITH_COVERAGE_CELLS = 15;

	/**
	 * The feature id for the '<em><b>Population Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSGA_WITH_COVERAGE_CELLS__POPULATION_SIZE = NSGA_EVOLUTIONARY_ALGORITHM__POPULATION_SIZE;

	/**
	 * The feature id for the '<em><b>Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSGA_WITH_COVERAGE_CELLS__ITERATIONS = NSGA_EVOLUTIONARY_ALGORITHM__ITERATIONS;

	/**
	 * The feature id for the '<em><b>Coverage Per Cell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSGA_WITH_COVERAGE_CELLS__COVERAGE_PER_CELL = NSGA_EVOLUTIONARY_ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Coverage Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSGA_WITH_COVERAGE_CELLS__TARGET_COVERAGE_PROPORTION = NSGA_EVOLUTIONARY_ALGORITHM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dimension Records</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSGA_WITH_COVERAGE_CELLS__DIMENSION_RECORDS = NSGA_EVOLUTIONARY_ALGORITHM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Use Mutation Enhancing Coverage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSGA_WITH_COVERAGE_CELLS__USE_MUTATION_ENHANCING_COVERAGE = NSGA_EVOLUTIONARY_ALGORITHM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>NSGA With Coverage Cells</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSGA_WITH_COVERAGE_CELLS_FEATURE_COUNT = NSGA_EVOLUTIONARY_ALGORITHM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>NSGA With Coverage Cells</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NSGA_WITH_COVERAGE_CELLS_OPERATION_COUNT = NSGA_EVOLUTIONARY_ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.impl.DimensionIntervalImpl <em>Dimension Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.impl.DimensionIntervalImpl
	 * @see TestingPackage.impl.TestingMMPackageImpl#getDimensionInterval()
	 * @generated
	 */
	int DIMENSION_INTERVAL = 16;

	/**
	 * The feature id for the '<em><b>Dim ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_INTERVAL__DIM_ID = 0;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_INTERVAL__MIN_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_INTERVAL__MAX_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_INTERVAL__COUNT = 3;

	/**
	 * The number of structural features of the '<em>Dimension Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_INTERVAL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Dimension Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_INTERVAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.impl.RepeatedExecutionImpl <em>Repeated Execution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.impl.RepeatedExecutionImpl
	 * @see TestingPackage.impl.TestingMMPackageImpl#getRepeatedExecution()
	 * @generated
	 */
	int REPEATED_EXECUTION = 17;

	/**
	 * The feature id for the '<em><b>Test To Repeat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATED_EXECUTION__TEST_TO_REPEAT = TEST_GENERATION_APPROACH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Repeat Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATED_EXECUTION__REPEAT_COUNT = TEST_GENERATION_APPROACH_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Repeated Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATED_EXECUTION_FEATURE_COUNT = TEST_GENERATION_APPROACH_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Repeated Execution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEATED_EXECUTION_OPERATION_COUNT = TEST_GENERATION_APPROACH_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.ResultSetStatus <em>Result Set Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.ResultSetStatus
	 * @see TestingPackage.impl.TestingMMPackageImpl#getResultSetStatus()
	 * @generated
	 */
	int RESULT_SET_STATUS = 18;

	/**
	 * The meta object id for the '{@link TestingPackage.DimensionID <em>Dimension ID</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.DimensionID
	 * @see TestingPackage.impl.TestingMMPackageImpl#getDimensionID()
	 * @generated
	 */
	int DIMENSION_ID = 19;


	/**
	 * Returns the meta object for class '{@link TestingPackage.TestingSpace <em>Testing Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Testing Space</em>'.
	 * @see TestingPackage.TestingSpace
	 * @generated
	 */
	EClass getTestingSpace();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.TestingSpace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TestingPackage.TestingSpace#getName()
	 * @see #getTestingSpace()
	 * @generated
	 */
	EAttribute getTestingSpace_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link TestingPackage.TestingSpace#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metrics</em>'.
	 * @see TestingPackage.TestingSpace#getMetrics()
	 * @see #getTestingSpace()
	 * @generated
	 */
	EReference getTestingSpace_Metrics();

	/**
	 * Returns the meta object for the containment reference list '{@link TestingPackage.TestingSpace#getPossibleFuzzingOperations <em>Possible Fuzzing Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Possible Fuzzing Operations</em>'.
	 * @see TestingPackage.TestingSpace#getPossibleFuzzingOperations()
	 * @see #getTestingSpace()
	 * @generated
	 */
	EReference getTestingSpace_PossibleFuzzingOperations();

	/**
	 * Returns the meta object for the containment reference list '{@link TestingPackage.TestingSpace#getCampaigns <em>Campaigns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Campaigns</em>'.
	 * @see TestingPackage.TestingSpace#getCampaigns()
	 * @see #getTestingSpace()
	 * @generated
	 */
	EReference getTestingSpace_Campaigns();

	/**
	 * Returns the meta object for the containment reference '{@link TestingPackage.TestingSpace#getMrs <em>Mrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mrs</em>'.
	 * @see TestingPackage.TestingSpace#getMrs()
	 * @see #getTestingSpace()
	 * @generated
	 */
	EReference getTestingSpace_Mrs();

	/**
	 * Returns the meta object for class '{@link TestingPackage.TestCampaign <em>Test Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Campaign</em>'.
	 * @see TestingPackage.TestCampaign
	 * @generated
	 */
	EClass getTestCampaign();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.TestCampaign#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TestingPackage.TestCampaign#getName()
	 * @see #getTestCampaign()
	 * @generated
	 */
	EAttribute getTestCampaign_Name();

	/**
	 * Returns the meta object for the reference list '{@link TestingPackage.TestCampaign#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Metrics</em>'.
	 * @see TestingPackage.TestCampaign#getMetrics()
	 * @see #getTestCampaign()
	 * @generated
	 */
	EReference getTestCampaign_Metrics();

	/**
	 * Returns the meta object for the reference list '{@link TestingPackage.TestCampaign#getConditionMetrics <em>Condition Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Condition Metrics</em>'.
	 * @see TestingPackage.TestCampaign#getConditionMetrics()
	 * @see #getTestCampaign()
	 * @generated
	 */
	EReference getTestCampaign_ConditionMetrics();

	/**
	 * Returns the meta object for the containment reference '{@link TestingPackage.TestCampaign#getActivationGeneration <em>Activation Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation Generation</em>'.
	 * @see TestingPackage.TestCampaign#getActivationGeneration()
	 * @see #getTestCampaign()
	 * @generated
	 */
	EReference getTestCampaign_ActivationGeneration();

	/**
	 * Returns the meta object for the reference list '{@link TestingPackage.TestCampaign#getIncludedOperations <em>Included Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included Operations</em>'.
	 * @see TestingPackage.TestCampaign#getIncludedOperations()
	 * @see #getTestCampaign()
	 * @generated
	 */
	EReference getTestCampaign_IncludedOperations();

	/**
	 * Returns the meta object for the containment reference '{@link TestingPackage.TestCampaign#getApproach <em>Approach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Approach</em>'.
	 * @see TestingPackage.TestCampaign#getApproach()
	 * @see #getTestCampaign()
	 * @generated
	 */
	EReference getTestCampaign_Approach();

	/**
	 * Returns the meta object for the containment reference list '{@link TestingPackage.TestCampaign#getPerformedTests <em>Performed Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Performed Tests</em>'.
	 * @see TestingPackage.TestCampaign#getPerformedTests()
	 * @see #getTestCampaign()
	 * @generated
	 */
	EReference getTestCampaign_PerformedTests();

	/**
	 * Returns the meta object for the containment reference list '{@link TestingPackage.TestCampaign#getResultSets <em>Result Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Result Sets</em>'.
	 * @see TestingPackage.TestCampaign#getResultSets()
	 * @see #getTestCampaign()
	 * @generated
	 */
	EReference getTestCampaign_ResultSets();

	/**
	 * Returns the meta object for the containment reference '{@link TestingPackage.TestCampaign#getEndTrigger <em>End Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>End Trigger</em>'.
	 * @see TestingPackage.TestCampaign#getEndTrigger()
	 * @see #getTestCampaign()
	 * @generated
	 */
	EReference getTestCampaign_EndTrigger();

	/**
	 * Returns the meta object for class '{@link TestingPackage.Test <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test</em>'.
	 * @see TestingPackage.Test
	 * @generated
	 */
	EClass getTest();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.Test#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TestingPackage.Test#getName()
	 * @see #getTest()
	 * @generated
	 */
	EAttribute getTest_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link TestingPackage.Test#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see TestingPackage.Test#getOperations()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link TestingPackage.Test#getMetrics <em>Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metrics</em>'.
	 * @see TestingPackage.Test#getMetrics()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_Metrics();

	/**
	 * Returns the meta object for the reference list '{@link TestingPackage.Test#getDevelopedFrom <em>Developed From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Developed From</em>'.
	 * @see TestingPackage.Test#getDevelopedFrom()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_DevelopedFrom();

	/**
	 * Returns the meta object for the container reference '{@link TestingPackage.Test#getParentCampaign <em>Parent Campaign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Campaign</em>'.
	 * @see TestingPackage.Test#getParentCampaign()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_ParentCampaign();

	/**
	 * Returns the meta object for the containment reference list '{@link TestingPackage.Test#getDebugFlags <em>Debug Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Debug Flags</em>'.
	 * @see TestingPackage.Test#getDebugFlags()
	 * @see #getTest()
	 * @generated
	 */
	EReference getTest_DebugFlags();

	/**
	 * Returns the meta object for class '{@link TestingPackage.TestDebuggingFlags <em>Test Debugging Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Debugging Flags</em>'.
	 * @see TestingPackage.TestDebuggingFlags
	 * @generated
	 */
	EClass getTestDebuggingFlags();

	/**
	 * Returns the meta object for class '{@link TestingPackage.PassiveMonitorOnly <em>Passive Monitor Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passive Monitor Only</em>'.
	 * @see TestingPackage.PassiveMonitorOnly
	 * @generated
	 */
	EClass getPassiveMonitorOnly();

	/**
	 * Returns the meta object for class '{@link TestingPackage.ActivationGenerationMethod <em>Activation Generation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation Generation Method</em>'.
	 * @see TestingPackage.ActivationGenerationMethod
	 * @generated
	 */
	EClass getActivationGenerationMethod();

	/**
	 * Returns the meta object for class '{@link TestingPackage.TimeBasedActivationGenerationMethod <em>Time Based Activation Generation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Based Activation Generation Method</em>'.
	 * @see TestingPackage.TimeBasedActivationGenerationMethod
	 * @generated
	 */
	EClass getTimeBasedActivationGenerationMethod();

	/**
	 * Returns the meta object for class '{@link TestingPackage.ConditionBasedActivationGenerationMethod <em>Condition Based Activation Generation Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Based Activation Generation Method</em>'.
	 * @see TestingPackage.ConditionBasedActivationGenerationMethod
	 * @generated
	 */
	EClass getConditionBasedActivationGenerationMethod();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.ConditionBasedActivationGenerationMethod#getConditionDepth <em>Condition Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Depth</em>'.
	 * @see TestingPackage.ConditionBasedActivationGenerationMethod#getConditionDepth()
	 * @see #getConditionBasedActivationGenerationMethod()
	 * @generated
	 */
	EAttribute getConditionBasedActivationGenerationMethod_ConditionDepth();

	/**
	 * Returns the meta object for class '{@link TestingPackage.CampaignResultSet <em>Campaign Result Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Campaign Result Set</em>'.
	 * @see TestingPackage.CampaignResultSet
	 * @generated
	 */
	EClass getCampaignResultSet();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.CampaignResultSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TestingPackage.CampaignResultSet#getName()
	 * @see #getCampaignResultSet()
	 * @generated
	 */
	EAttribute getCampaignResultSet_Name();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.CampaignResultSet#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see TestingPackage.CampaignResultSet#getStatus()
	 * @see #getCampaignResultSet()
	 * @generated
	 */
	EAttribute getCampaignResultSet_Status();

	/**
	 * Returns the meta object for the reference list '{@link TestingPackage.CampaignResultSet#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Results</em>'.
	 * @see TestingPackage.CampaignResultSet#getResults()
	 * @see #getCampaignResultSet()
	 * @generated
	 */
	EReference getCampaignResultSet_Results();

	/**
	 * Returns the meta object for class '{@link TestingPackage.ExecutionEndTrigger <em>Execution End Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution End Trigger</em>'.
	 * @see TestingPackage.ExecutionEndTrigger
	 * @generated
	 */
	EClass getExecutionEndTrigger();

	/**
	 * Returns the meta object for class '{@link TestingPackage.TimeBasedEnd <em>Time Based End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Based End</em>'.
	 * @see TestingPackage.TimeBasedEnd
	 * @generated
	 */
	EClass getTimeBasedEnd();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.TimeBasedEnd#getTimeLimitSeconds <em>Time Limit Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Limit Seconds</em>'.
	 * @see TestingPackage.TimeBasedEnd#getTimeLimitSeconds()
	 * @see #getTimeBasedEnd()
	 * @generated
	 */
	EAttribute getTimeBasedEnd_TimeLimitSeconds();

	/**
	 * Returns the meta object for class '{@link TestingPackage.TestGenerationApproach <em>Test Generation Approach</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Generation Approach</em>'.
	 * @see TestingPackage.TestGenerationApproach
	 * @generated
	 */
	EClass getTestGenerationApproach();

	/**
	 * Returns the meta object for class '{@link TestingPackage.RandomTestGeneration <em>Random Test Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random Test Generation</em>'.
	 * @see TestingPackage.RandomTestGeneration
	 * @generated
	 */
	EClass getRandomTestGeneration();

	/**
	 * Returns the meta object for class '{@link TestingPackage.EvolutionaryAlgorithm <em>Evolutionary Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evolutionary Algorithm</em>'.
	 * @see TestingPackage.EvolutionaryAlgorithm
	 * @generated
	 */
	EClass getEvolutionaryAlgorithm();

	/**
	 * Returns the meta object for class '{@link TestingPackage.NSGAEvolutionaryAlgorithm <em>NSGA Evolutionary Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NSGA Evolutionary Algorithm</em>'.
	 * @see TestingPackage.NSGAEvolutionaryAlgorithm
	 * @generated
	 */
	EClass getNSGAEvolutionaryAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.NSGAEvolutionaryAlgorithm#getPopulationSize <em>Population Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Population Size</em>'.
	 * @see TestingPackage.NSGAEvolutionaryAlgorithm#getPopulationSize()
	 * @see #getNSGAEvolutionaryAlgorithm()
	 * @generated
	 */
	EAttribute getNSGAEvolutionaryAlgorithm_PopulationSize();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.NSGAEvolutionaryAlgorithm#getIterations <em>Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterations</em>'.
	 * @see TestingPackage.NSGAEvolutionaryAlgorithm#getIterations()
	 * @see #getNSGAEvolutionaryAlgorithm()
	 * @generated
	 */
	EAttribute getNSGAEvolutionaryAlgorithm_Iterations();

	/**
	 * Returns the meta object for class '{@link TestingPackage.NSGAWithCoverageCells <em>NSGA With Coverage Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NSGA With Coverage Cells</em>'.
	 * @see TestingPackage.NSGAWithCoverageCells
	 * @generated
	 */
	EClass getNSGAWithCoverageCells();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.NSGAWithCoverageCells#getCoveragePerCell <em>Coverage Per Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coverage Per Cell</em>'.
	 * @see TestingPackage.NSGAWithCoverageCells#getCoveragePerCell()
	 * @see #getNSGAWithCoverageCells()
	 * @generated
	 */
	EAttribute getNSGAWithCoverageCells_CoveragePerCell();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.NSGAWithCoverageCells#getTargetCoverageProportion <em>Target Coverage Proportion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Coverage Proportion</em>'.
	 * @see TestingPackage.NSGAWithCoverageCells#getTargetCoverageProportion()
	 * @see #getNSGAWithCoverageCells()
	 * @generated
	 */
	EAttribute getNSGAWithCoverageCells_TargetCoverageProportion();

	/**
	 * Returns the meta object for the containment reference list '{@link TestingPackage.NSGAWithCoverageCells#getDimensionRecords <em>Dimension Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimension Records</em>'.
	 * @see TestingPackage.NSGAWithCoverageCells#getDimensionRecords()
	 * @see #getNSGAWithCoverageCells()
	 * @generated
	 */
	EReference getNSGAWithCoverageCells_DimensionRecords();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.NSGAWithCoverageCells#isUseMutationEnhancingCoverage <em>Use Mutation Enhancing Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Mutation Enhancing Coverage</em>'.
	 * @see TestingPackage.NSGAWithCoverageCells#isUseMutationEnhancingCoverage()
	 * @see #getNSGAWithCoverageCells()
	 * @generated
	 */
	EAttribute getNSGAWithCoverageCells_UseMutationEnhancingCoverage();

	/**
	 * Returns the meta object for class '{@link TestingPackage.DimensionInterval <em>Dimension Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension Interval</em>'.
	 * @see TestingPackage.DimensionInterval
	 * @generated
	 */
	EClass getDimensionInterval();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.DimensionInterval#getDimID <em>Dim ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dim ID</em>'.
	 * @see TestingPackage.DimensionInterval#getDimID()
	 * @see #getDimensionInterval()
	 * @generated
	 */
	EAttribute getDimensionInterval_DimID();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.DimensionInterval#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see TestingPackage.DimensionInterval#getMinValue()
	 * @see #getDimensionInterval()
	 * @generated
	 */
	EAttribute getDimensionInterval_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.DimensionInterval#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see TestingPackage.DimensionInterval#getMaxValue()
	 * @see #getDimensionInterval()
	 * @generated
	 */
	EAttribute getDimensionInterval_MaxValue();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.DimensionInterval#getCount <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Count</em>'.
	 * @see TestingPackage.DimensionInterval#getCount()
	 * @see #getDimensionInterval()
	 * @generated
	 */
	EAttribute getDimensionInterval_Count();

	/**
	 * Returns the meta object for class '{@link TestingPackage.RepeatedExecution <em>Repeated Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeated Execution</em>'.
	 * @see TestingPackage.RepeatedExecution
	 * @generated
	 */
	EClass getRepeatedExecution();

	/**
	 * Returns the meta object for the reference '{@link TestingPackage.RepeatedExecution#getTestToRepeat <em>Test To Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Test To Repeat</em>'.
	 * @see TestingPackage.RepeatedExecution#getTestToRepeat()
	 * @see #getRepeatedExecution()
	 * @generated
	 */
	EReference getRepeatedExecution_TestToRepeat();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.RepeatedExecution#getRepeatCount <em>Repeat Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repeat Count</em>'.
	 * @see TestingPackage.RepeatedExecution#getRepeatCount()
	 * @see #getRepeatedExecution()
	 * @generated
	 */
	EAttribute getRepeatedExecution_RepeatCount();

	/**
	 * Returns the meta object for enum '{@link TestingPackage.ResultSetStatus <em>Result Set Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Result Set Status</em>'.
	 * @see TestingPackage.ResultSetStatus
	 * @generated
	 */
	EEnum getResultSetStatus();

	/**
	 * Returns the meta object for enum '{@link TestingPackage.DimensionID <em>Dimension ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dimension ID</em>'.
	 * @see TestingPackage.DimensionID
	 * @generated
	 */
	EEnum getDimensionID();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestingMMFactory getTestingMMFactory();

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
		 * The meta object literal for the '{@link TestingPackage.impl.TestingSpaceImpl <em>Testing Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.impl.TestingSpaceImpl
		 * @see TestingPackage.impl.TestingMMPackageImpl#getTestingSpace()
		 * @generated
		 */
		EClass TESTING_SPACE = eINSTANCE.getTestingSpace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTING_SPACE__NAME = eINSTANCE.getTestingSpace_Name();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTING_SPACE__METRICS = eINSTANCE.getTestingSpace_Metrics();

		/**
		 * The meta object literal for the '<em><b>Possible Fuzzing Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTING_SPACE__POSSIBLE_FUZZING_OPERATIONS = eINSTANCE.getTestingSpace_PossibleFuzzingOperations();

		/**
		 * The meta object literal for the '<em><b>Campaigns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTING_SPACE__CAMPAIGNS = eINSTANCE.getTestingSpace_Campaigns();

		/**
		 * The meta object literal for the '<em><b>Mrs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTING_SPACE__MRS = eINSTANCE.getTestingSpace_Mrs();

		/**
		 * The meta object literal for the '{@link TestingPackage.impl.TestCampaignImpl <em>Test Campaign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.impl.TestCampaignImpl
		 * @see TestingPackage.impl.TestingMMPackageImpl#getTestCampaign()
		 * @generated
		 */
		EClass TEST_CAMPAIGN = eINSTANCE.getTestCampaign();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_CAMPAIGN__NAME = eINSTANCE.getTestCampaign_Name();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CAMPAIGN__METRICS = eINSTANCE.getTestCampaign_Metrics();

		/**
		 * The meta object literal for the '<em><b>Condition Metrics</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CAMPAIGN__CONDITION_METRICS = eINSTANCE.getTestCampaign_ConditionMetrics();

		/**
		 * The meta object literal for the '<em><b>Activation Generation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CAMPAIGN__ACTIVATION_GENERATION = eINSTANCE.getTestCampaign_ActivationGeneration();

		/**
		 * The meta object literal for the '<em><b>Included Operations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CAMPAIGN__INCLUDED_OPERATIONS = eINSTANCE.getTestCampaign_IncludedOperations();

		/**
		 * The meta object literal for the '<em><b>Approach</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CAMPAIGN__APPROACH = eINSTANCE.getTestCampaign_Approach();

		/**
		 * The meta object literal for the '<em><b>Performed Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CAMPAIGN__PERFORMED_TESTS = eINSTANCE.getTestCampaign_PerformedTests();

		/**
		 * The meta object literal for the '<em><b>Result Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CAMPAIGN__RESULT_SETS = eINSTANCE.getTestCampaign_ResultSets();

		/**
		 * The meta object literal for the '<em><b>End Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CAMPAIGN__END_TRIGGER = eINSTANCE.getTestCampaign_EndTrigger();

		/**
		 * The meta object literal for the '{@link TestingPackage.impl.TestImpl <em>Test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.impl.TestImpl
		 * @see TestingPackage.impl.TestingMMPackageImpl#getTest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.getTest();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST__NAME = eINSTANCE.getTest_Name();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__OPERATIONS = eINSTANCE.getTest_Operations();

		/**
		 * The meta object literal for the '<em><b>Metrics</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__METRICS = eINSTANCE.getTest_Metrics();

		/**
		 * The meta object literal for the '<em><b>Developed From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__DEVELOPED_FROM = eINSTANCE.getTest_DevelopedFrom();

		/**
		 * The meta object literal for the '<em><b>Parent Campaign</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__PARENT_CAMPAIGN = eINSTANCE.getTest_ParentCampaign();

		/**
		 * The meta object literal for the '<em><b>Debug Flags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__DEBUG_FLAGS = eINSTANCE.getTest_DebugFlags();

		/**
		 * The meta object literal for the '{@link TestingPackage.impl.TestDebuggingFlagsImpl <em>Test Debugging Flags</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.impl.TestDebuggingFlagsImpl
		 * @see TestingPackage.impl.TestingMMPackageImpl#getTestDebuggingFlags()
		 * @generated
		 */
		EClass TEST_DEBUGGING_FLAGS = eINSTANCE.getTestDebuggingFlags();

		/**
		 * The meta object literal for the '{@link TestingPackage.impl.PassiveMonitorOnlyImpl <em>Passive Monitor Only</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.impl.PassiveMonitorOnlyImpl
		 * @see TestingPackage.impl.TestingMMPackageImpl#getPassiveMonitorOnly()
		 * @generated
		 */
		EClass PASSIVE_MONITOR_ONLY = eINSTANCE.getPassiveMonitorOnly();

		/**
		 * The meta object literal for the '{@link TestingPackage.impl.ActivationGenerationMethodImpl <em>Activation Generation Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.impl.ActivationGenerationMethodImpl
		 * @see TestingPackage.impl.TestingMMPackageImpl#getActivationGenerationMethod()
		 * @generated
		 */
		EClass ACTIVATION_GENERATION_METHOD = eINSTANCE.getActivationGenerationMethod();

		/**
		 * The meta object literal for the '{@link TestingPackage.impl.TimeBasedActivationGenerationMethodImpl <em>Time Based Activation Generation Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.impl.TimeBasedActivationGenerationMethodImpl
		 * @see TestingPackage.impl.TestingMMPackageImpl#getTimeBasedActivationGenerationMethod()
		 * @generated
		 */
		EClass TIME_BASED_ACTIVATION_GENERATION_METHOD = eINSTANCE.getTimeBasedActivationGenerationMethod();

		/**
		 * The meta object literal for the '{@link TestingPackage.impl.ConditionBasedActivationGenerationMethodImpl <em>Condition Based Activation Generation Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.impl.ConditionBasedActivationGenerationMethodImpl
		 * @see TestingPackage.impl.TestingMMPackageImpl#getConditionBasedActivationGenerationMethod()
		 * @generated
		 */
		EClass CONDITION_BASED_ACTIVATION_GENERATION_METHOD = eINSTANCE.getConditionBasedActivationGenerationMethod();

		/**
		 * The meta object literal for the '<em><b>Condition Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_BASED_ACTIVATION_GENERATION_METHOD__CONDITION_DEPTH = eINSTANCE.getConditionBasedActivationGenerationMethod_ConditionDepth();

		/**
		 * The meta object literal for the '{@link TestingPackage.impl.CampaignResultSetImpl <em>Campaign Result Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.impl.CampaignResultSetImpl
		 * @see TestingPackage.impl.TestingMMPackageImpl#getCampaignResultSet()
		 * @generated
		 */
		EClass CAMPAIGN_RESULT_SET = eINSTANCE.getCampaignResultSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPAIGN_RESULT_SET__NAME = eINSTANCE.getCampaignResultSet_Name();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMPAIGN_RESULT_SET__STATUS = eINSTANCE.getCampaignResultSet_Status();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAMPAIGN_RESULT_SET__RESULTS = eINSTANCE.getCampaignResultSet_Results();

		/**
		 * The meta object literal for the '{@link TestingPackage.impl.ExecutionEndTriggerImpl <em>Execution End Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.impl.ExecutionEndTriggerImpl
		 * @see TestingPackage.impl.TestingMMPackageImpl#getExecutionEndTrigger()
		 * @generated
		 */
		EClass EXECUTION_END_TRIGGER = eINSTANCE.getExecutionEndTrigger();

		/**
		 * The meta object literal for the '{@link TestingPackage.impl.TimeBasedEndImpl <em>Time Based End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.impl.TimeBasedEndImpl
		 * @see TestingPackage.impl.TestingMMPackageImpl#getTimeBasedEnd()
		 * @generated
		 */
		EClass TIME_BASED_END = eINSTANCE.getTimeBasedEnd();

		/**
		 * The meta object literal for the '<em><b>Time Limit Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_BASED_END__TIME_LIMIT_SECONDS = eINSTANCE.getTimeBasedEnd_TimeLimitSeconds();

		/**
		 * The meta object literal for the '{@link TestingPackage.impl.TestGenerationApproachImpl <em>Test Generation Approach</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.impl.TestGenerationApproachImpl
		 * @see TestingPackage.impl.TestingMMPackageImpl#getTestGenerationApproach()
		 * @generated
		 */
		EClass TEST_GENERATION_APPROACH = eINSTANCE.getTestGenerationApproach();

		/**
		 * The meta object literal for the '{@link TestingPackage.impl.RandomTestGenerationImpl <em>Random Test Generation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.impl.RandomTestGenerationImpl
		 * @see TestingPackage.impl.TestingMMPackageImpl#getRandomTestGeneration()
		 * @generated
		 */
		EClass RANDOM_TEST_GENERATION = eINSTANCE.getRandomTestGeneration();

		/**
		 * The meta object literal for the '{@link TestingPackage.impl.EvolutionaryAlgorithmImpl <em>Evolutionary Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.impl.EvolutionaryAlgorithmImpl
		 * @see TestingPackage.impl.TestingMMPackageImpl#getEvolutionaryAlgorithm()
		 * @generated
		 */
		EClass EVOLUTIONARY_ALGORITHM = eINSTANCE.getEvolutionaryAlgorithm();

		/**
		 * The meta object literal for the '{@link TestingPackage.impl.NSGAEvolutionaryAlgorithmImpl <em>NSGA Evolutionary Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.impl.NSGAEvolutionaryAlgorithmImpl
		 * @see TestingPackage.impl.TestingMMPackageImpl#getNSGAEvolutionaryAlgorithm()
		 * @generated
		 */
		EClass NSGA_EVOLUTIONARY_ALGORITHM = eINSTANCE.getNSGAEvolutionaryAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Population Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NSGA_EVOLUTIONARY_ALGORITHM__POPULATION_SIZE = eINSTANCE.getNSGAEvolutionaryAlgorithm_PopulationSize();

		/**
		 * The meta object literal for the '<em><b>Iterations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NSGA_EVOLUTIONARY_ALGORITHM__ITERATIONS = eINSTANCE.getNSGAEvolutionaryAlgorithm_Iterations();

		/**
		 * The meta object literal for the '{@link TestingPackage.impl.NSGAWithCoverageCellsImpl <em>NSGA With Coverage Cells</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.impl.NSGAWithCoverageCellsImpl
		 * @see TestingPackage.impl.TestingMMPackageImpl#getNSGAWithCoverageCells()
		 * @generated
		 */
		EClass NSGA_WITH_COVERAGE_CELLS = eINSTANCE.getNSGAWithCoverageCells();

		/**
		 * The meta object literal for the '<em><b>Coverage Per Cell</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NSGA_WITH_COVERAGE_CELLS__COVERAGE_PER_CELL = eINSTANCE.getNSGAWithCoverageCells_CoveragePerCell();

		/**
		 * The meta object literal for the '<em><b>Target Coverage Proportion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NSGA_WITH_COVERAGE_CELLS__TARGET_COVERAGE_PROPORTION = eINSTANCE.getNSGAWithCoverageCells_TargetCoverageProportion();

		/**
		 * The meta object literal for the '<em><b>Dimension Records</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NSGA_WITH_COVERAGE_CELLS__DIMENSION_RECORDS = eINSTANCE.getNSGAWithCoverageCells_DimensionRecords();

		/**
		 * The meta object literal for the '<em><b>Use Mutation Enhancing Coverage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NSGA_WITH_COVERAGE_CELLS__USE_MUTATION_ENHANCING_COVERAGE = eINSTANCE.getNSGAWithCoverageCells_UseMutationEnhancingCoverage();

		/**
		 * The meta object literal for the '{@link TestingPackage.impl.DimensionIntervalImpl <em>Dimension Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.impl.DimensionIntervalImpl
		 * @see TestingPackage.impl.TestingMMPackageImpl#getDimensionInterval()
		 * @generated
		 */
		EClass DIMENSION_INTERVAL = eINSTANCE.getDimensionInterval();

		/**
		 * The meta object literal for the '<em><b>Dim ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_INTERVAL__DIM_ID = eINSTANCE.getDimensionInterval_DimID();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_INTERVAL__MIN_VALUE = eINSTANCE.getDimensionInterval_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_INTERVAL__MAX_VALUE = eINSTANCE.getDimensionInterval_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION_INTERVAL__COUNT = eINSTANCE.getDimensionInterval_Count();

		/**
		 * The meta object literal for the '{@link TestingPackage.impl.RepeatedExecutionImpl <em>Repeated Execution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.impl.RepeatedExecutionImpl
		 * @see TestingPackage.impl.TestingMMPackageImpl#getRepeatedExecution()
		 * @generated
		 */
		EClass REPEATED_EXECUTION = eINSTANCE.getRepeatedExecution();

		/**
		 * The meta object literal for the '<em><b>Test To Repeat</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPEATED_EXECUTION__TEST_TO_REPEAT = eINSTANCE.getRepeatedExecution_TestToRepeat();

		/**
		 * The meta object literal for the '<em><b>Repeat Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPEATED_EXECUTION__REPEAT_COUNT = eINSTANCE.getRepeatedExecution_RepeatCount();

		/**
		 * The meta object literal for the '{@link TestingPackage.ResultSetStatus <em>Result Set Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.ResultSetStatus
		 * @see TestingPackage.impl.TestingMMPackageImpl#getResultSetStatus()
		 * @generated
		 */
		EEnum RESULT_SET_STATUS = eINSTANCE.getResultSetStatus();

		/**
		 * The meta object literal for the '{@link TestingPackage.DimensionID <em>Dimension ID</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.DimensionID
		 * @see TestingPackage.impl.TestingMMPackageImpl#getDimensionID()
		 * @generated
		 */
		EEnum DIMENSION_ID = eINSTANCE.getDimensionID();

	}

} //TestingMMPackage
