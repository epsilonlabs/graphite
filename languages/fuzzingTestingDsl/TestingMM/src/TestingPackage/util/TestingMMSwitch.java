/**
 */
package TestingPackage.util;

import TestingPackage.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see TestingPackage.TestingMMPackage
 * @generated
 */
public class TestingMMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TestingMMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestingMMSwitch() {
		if (modelPackage == null) {
			modelPackage = TestingMMPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TestingMMPackage.TESTING_SPACE: {
				TestingSpace testingSpace = (TestingSpace)theEObject;
				T result = caseTestingSpace(testingSpace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestingMMPackage.TEST_CAMPAIGN: {
				TestCampaign testCampaign = (TestCampaign)theEObject;
				T result = caseTestCampaign(testCampaign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestingMMPackage.TEST: {
				Test test = (Test)theEObject;
				T result = caseTest(test);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestingMMPackage.TEST_DEBUGGING_FLAGS: {
				TestDebuggingFlags testDebuggingFlags = (TestDebuggingFlags)theEObject;
				T result = caseTestDebuggingFlags(testDebuggingFlags);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestingMMPackage.PASSIVE_MONITOR_ONLY: {
				PassiveMonitorOnly passiveMonitorOnly = (PassiveMonitorOnly)theEObject;
				T result = casePassiveMonitorOnly(passiveMonitorOnly);
				if (result == null) result = caseTestDebuggingFlags(passiveMonitorOnly);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestingMMPackage.ACTIVATION_GENERATION_METHOD: {
				ActivationGenerationMethod activationGenerationMethod = (ActivationGenerationMethod)theEObject;
				T result = caseActivationGenerationMethod(activationGenerationMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestingMMPackage.TIME_BASED_ACTIVATION_GENERATION_METHOD: {
				TimeBasedActivationGenerationMethod timeBasedActivationGenerationMethod = (TimeBasedActivationGenerationMethod)theEObject;
				T result = caseTimeBasedActivationGenerationMethod(timeBasedActivationGenerationMethod);
				if (result == null) result = caseActivationGenerationMethod(timeBasedActivationGenerationMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestingMMPackage.CONDITION_BASED_ACTIVATION_GENERATION_METHOD: {
				ConditionBasedActivationGenerationMethod conditionBasedActivationGenerationMethod = (ConditionBasedActivationGenerationMethod)theEObject;
				T result = caseConditionBasedActivationGenerationMethod(conditionBasedActivationGenerationMethod);
				if (result == null) result = caseActivationGenerationMethod(conditionBasedActivationGenerationMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestingMMPackage.CAMPAIGN_RESULT_SET: {
				CampaignResultSet campaignResultSet = (CampaignResultSet)theEObject;
				T result = caseCampaignResultSet(campaignResultSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestingMMPackage.EXECUTION_END_TRIGGER: {
				ExecutionEndTrigger executionEndTrigger = (ExecutionEndTrigger)theEObject;
				T result = caseExecutionEndTrigger(executionEndTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestingMMPackage.TIME_BASED_END: {
				TimeBasedEnd timeBasedEnd = (TimeBasedEnd)theEObject;
				T result = caseTimeBasedEnd(timeBasedEnd);
				if (result == null) result = caseExecutionEndTrigger(timeBasedEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestingMMPackage.TEST_GENERATION_APPROACH: {
				TestGenerationApproach testGenerationApproach = (TestGenerationApproach)theEObject;
				T result = caseTestGenerationApproach(testGenerationApproach);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestingMMPackage.RANDOM_TEST_GENERATION: {
				RandomTestGeneration randomTestGeneration = (RandomTestGeneration)theEObject;
				T result = caseRandomTestGeneration(randomTestGeneration);
				if (result == null) result = caseTestGenerationApproach(randomTestGeneration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestingMMPackage.EVOLUTIONARY_ALGORITHM: {
				EvolutionaryAlgorithm evolutionaryAlgorithm = (EvolutionaryAlgorithm)theEObject;
				T result = caseEvolutionaryAlgorithm(evolutionaryAlgorithm);
				if (result == null) result = caseTestGenerationApproach(evolutionaryAlgorithm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestingMMPackage.NSGA_EVOLUTIONARY_ALGORITHM: {
				NSGAEvolutionaryAlgorithm nsgaEvolutionaryAlgorithm = (NSGAEvolutionaryAlgorithm)theEObject;
				T result = caseNSGAEvolutionaryAlgorithm(nsgaEvolutionaryAlgorithm);
				if (result == null) result = caseEvolutionaryAlgorithm(nsgaEvolutionaryAlgorithm);
				if (result == null) result = caseTestGenerationApproach(nsgaEvolutionaryAlgorithm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestingMMPackage.NSGA_WITH_COVERAGE_CELLS: {
				NSGAWithCoverageCells nsgaWithCoverageCells = (NSGAWithCoverageCells)theEObject;
				T result = caseNSGAWithCoverageCells(nsgaWithCoverageCells);
				if (result == null) result = caseNSGAEvolutionaryAlgorithm(nsgaWithCoverageCells);
				if (result == null) result = caseEvolutionaryAlgorithm(nsgaWithCoverageCells);
				if (result == null) result = caseTestGenerationApproach(nsgaWithCoverageCells);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestingMMPackage.DIMENSION_INTERVAL: {
				DimensionInterval dimensionInterval = (DimensionInterval)theEObject;
				T result = caseDimensionInterval(dimensionInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TestingMMPackage.REPEATED_EXECUTION: {
				RepeatedExecution repeatedExecution = (RepeatedExecution)theEObject;
				T result = caseRepeatedExecution(repeatedExecution);
				if (result == null) result = caseTestGenerationApproach(repeatedExecution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Testing Space</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Testing Space</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestingSpace(TestingSpace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Campaign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Campaign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestCampaign(TestCampaign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTest(Test object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Debugging Flags</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Debugging Flags</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestDebuggingFlags(TestDebuggingFlags object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passive Monitor Only</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passive Monitor Only</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassiveMonitorOnly(PassiveMonitorOnly object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activation Generation Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activation Generation Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivationGenerationMethod(ActivationGenerationMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Based Activation Generation Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Based Activation Generation Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeBasedActivationGenerationMethod(TimeBasedActivationGenerationMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Based Activation Generation Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Based Activation Generation Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionBasedActivationGenerationMethod(ConditionBasedActivationGenerationMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Campaign Result Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Campaign Result Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCampaignResultSet(CampaignResultSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution End Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution End Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionEndTrigger(ExecutionEndTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Based End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Based End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeBasedEnd(TimeBasedEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Generation Approach</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Generation Approach</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestGenerationApproach(TestGenerationApproach object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Random Test Generation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Random Test Generation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRandomTestGeneration(RandomTestGeneration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evolutionary Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evolutionary Algorithm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvolutionaryAlgorithm(EvolutionaryAlgorithm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NSGA Evolutionary Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NSGA Evolutionary Algorithm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNSGAEvolutionaryAlgorithm(NSGAEvolutionaryAlgorithm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NSGA With Coverage Cells</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NSGA With Coverage Cells</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNSGAWithCoverageCells(NSGAWithCoverageCells object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension Interval</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDimensionInterval(DimensionInterval object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeated Execution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeated Execution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeatedExecution(RepeatedExecution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TestingMMSwitch
