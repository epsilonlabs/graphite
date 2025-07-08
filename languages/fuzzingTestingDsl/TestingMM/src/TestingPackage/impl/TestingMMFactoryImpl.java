/**
 */
package TestingPackage.impl;

import TestingPackage.*;

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
public class TestingMMFactoryImpl extends EFactoryImpl implements TestingMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TestingMMFactory init() {
		try {
			TestingMMFactory theTestingMMFactory = (TestingMMFactory)EPackage.Registry.INSTANCE.getEFactory(TestingMMPackage.eNS_URI);
			if (theTestingMMFactory != null) {
				return theTestingMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TestingMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestingMMFactoryImpl() {
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
			case TestingMMPackage.TESTING_SPACE: return createTestingSpace();
			case TestingMMPackage.TEST_CAMPAIGN: return createTestCampaign();
			case TestingMMPackage.TEST: return createTest();
			case TestingMMPackage.PASSIVE_MONITOR_ONLY: return createPassiveMonitorOnly();
			case TestingMMPackage.TIME_BASED_ACTIVATION_GENERATION_METHOD: return createTimeBasedActivationGenerationMethod();
			case TestingMMPackage.CONDITION_BASED_ACTIVATION_GENERATION_METHOD: return createConditionBasedActivationGenerationMethod();
			case TestingMMPackage.CAMPAIGN_RESULT_SET: return createCampaignResultSet();
			case TestingMMPackage.TIME_BASED_END: return createTimeBasedEnd();
			case TestingMMPackage.RANDOM_TEST_GENERATION: return createRandomTestGeneration();
			case TestingMMPackage.NSGA_EVOLUTIONARY_ALGORITHM: return createNSGAEvolutionaryAlgorithm();
			case TestingMMPackage.NSGA_WITH_COVERAGE_CELLS: return createNSGAWithCoverageCells();
			case TestingMMPackage.DIMENSION_INTERVAL: return createDimensionInterval();
			case TestingMMPackage.REPEATED_EXECUTION: return createRepeatedExecution();
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
			case TestingMMPackage.RESULT_SET_STATUS:
				return createResultSetStatusFromString(eDataType, initialValue);
			case TestingMMPackage.DIMENSION_ID:
				return createDimensionIDFromString(eDataType, initialValue);
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
			case TestingMMPackage.RESULT_SET_STATUS:
				return convertResultSetStatusToString(eDataType, instanceValue);
			case TestingMMPackage.DIMENSION_ID:
				return convertDimensionIDToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestingSpace createTestingSpace() {
		TestingSpaceImpl testingSpace = new TestingSpaceImpl();
		return testingSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestCampaign createTestCampaign() {
		TestCampaignImpl testCampaign = new TestCampaignImpl();
		return testCampaign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test createTest() {
		TestImpl test = new TestImpl();
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PassiveMonitorOnly createPassiveMonitorOnly() {
		PassiveMonitorOnlyImpl passiveMonitorOnly = new PassiveMonitorOnlyImpl();
		return passiveMonitorOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBasedActivationGenerationMethod createTimeBasedActivationGenerationMethod() {
		TimeBasedActivationGenerationMethodImpl timeBasedActivationGenerationMethod = new TimeBasedActivationGenerationMethodImpl();
		return timeBasedActivationGenerationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionBasedActivationGenerationMethod createConditionBasedActivationGenerationMethod() {
		ConditionBasedActivationGenerationMethodImpl conditionBasedActivationGenerationMethod = new ConditionBasedActivationGenerationMethodImpl();
		return conditionBasedActivationGenerationMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CampaignResultSet createCampaignResultSet() {
		CampaignResultSetImpl campaignResultSet = new CampaignResultSetImpl();
		return campaignResultSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeBasedEnd createTimeBasedEnd() {
		TimeBasedEndImpl timeBasedEnd = new TimeBasedEndImpl();
		return timeBasedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RandomTestGeneration createRandomTestGeneration() {
		RandomTestGenerationImpl randomTestGeneration = new RandomTestGenerationImpl();
		return randomTestGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NSGAEvolutionaryAlgorithm createNSGAEvolutionaryAlgorithm() {
		NSGAEvolutionaryAlgorithmImpl nsgaEvolutionaryAlgorithm = new NSGAEvolutionaryAlgorithmImpl();
		return nsgaEvolutionaryAlgorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NSGAWithCoverageCells createNSGAWithCoverageCells() {
		NSGAWithCoverageCellsImpl nsgaWithCoverageCells = new NSGAWithCoverageCellsImpl();
		return nsgaWithCoverageCells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionInterval createDimensionInterval() {
		DimensionIntervalImpl dimensionInterval = new DimensionIntervalImpl();
		return dimensionInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepeatedExecution createRepeatedExecution() {
		RepeatedExecutionImpl repeatedExecution = new RepeatedExecutionImpl();
		return repeatedExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultSetStatus createResultSetStatusFromString(EDataType eDataType, String initialValue) {
		ResultSetStatus result = ResultSetStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResultSetStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionID createDimensionIDFromString(EDataType eDataType, String initialValue) {
		DimensionID result = DimensionID.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDimensionIDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestingMMPackage getTestingMMPackage() {
		return (TestingMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TestingMMPackage getPackage() {
		return TestingMMPackage.eINSTANCE;
	}

} //TestingMMFactoryImpl
