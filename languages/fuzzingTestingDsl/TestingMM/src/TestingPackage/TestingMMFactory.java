/**
 */
package TestingPackage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see TestingPackage.TestingMMPackage
 * @generated
 */
public interface TestingMMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestingMMFactory eINSTANCE = TestingPackage.impl.TestingMMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Testing Space</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Testing Space</em>'.
	 * @generated
	 */
	TestingSpace createTestingSpace();

	/**
	 * Returns a new object of class '<em>Test Campaign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Campaign</em>'.
	 * @generated
	 */
	TestCampaign createTestCampaign();

	/**
	 * Returns a new object of class '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test</em>'.
	 * @generated
	 */
	Test createTest();

	/**
	 * Returns a new object of class '<em>Passive Monitor Only</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passive Monitor Only</em>'.
	 * @generated
	 */
	PassiveMonitorOnly createPassiveMonitorOnly();

	/**
	 * Returns a new object of class '<em>Time Based Activation Generation Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Based Activation Generation Method</em>'.
	 * @generated
	 */
	TimeBasedActivationGenerationMethod createTimeBasedActivationGenerationMethod();

	/**
	 * Returns a new object of class '<em>Condition Based Activation Generation Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Based Activation Generation Method</em>'.
	 * @generated
	 */
	ConditionBasedActivationGenerationMethod createConditionBasedActivationGenerationMethod();

	/**
	 * Returns a new object of class '<em>Campaign Result Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Campaign Result Set</em>'.
	 * @generated
	 */
	CampaignResultSet createCampaignResultSet();

	/**
	 * Returns a new object of class '<em>Time Based End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Based End</em>'.
	 * @generated
	 */
	TimeBasedEnd createTimeBasedEnd();

	/**
	 * Returns a new object of class '<em>Random Test Generation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Random Test Generation</em>'.
	 * @generated
	 */
	RandomTestGeneration createRandomTestGeneration();

	/**
	 * Returns a new object of class '<em>NSGA Evolutionary Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NSGA Evolutionary Algorithm</em>'.
	 * @generated
	 */
	NSGAEvolutionaryAlgorithm createNSGAEvolutionaryAlgorithm();

	/**
	 * Returns a new object of class '<em>NSGA With Coverage Cells</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NSGA With Coverage Cells</em>'.
	 * @generated
	 */
	NSGAWithCoverageCells createNSGAWithCoverageCells();

	/**
	 * Returns a new object of class '<em>Dimension Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimension Interval</em>'.
	 * @generated
	 */
	DimensionInterval createDimensionInterval();

	/**
	 * Returns a new object of class '<em>Repeated Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repeated Execution</em>'.
	 * @generated
	 */
	RepeatedExecution createRepeatedExecution();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TestingMMPackage getTestingMMPackage();

} //TestingMMFactory
