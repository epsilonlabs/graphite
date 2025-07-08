/**
 */
package TestingPackage.Metrics.util;

import TestingPackage.Metrics.*;

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
 * @see TestingPackage.Metrics.MetricsPackage
 * @generated
 */
public class MetricsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetricsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricsSwitch() {
		if (modelPackage == null) {
			modelPackage = MetricsPackage.eINSTANCE;
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
			case MetricsPackage.SIM_STREAM: {
				SimStream simStream = (SimStream)theEObject;
				T result = caseSimStream(simStream);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.INPUT_STREAM: {
				InputStream inputStream = (InputStream)theEObject;
				T result = caseInputStream(inputStream);
				if (result == null) result = caseSimStream(inputStream);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.OUTPUT_STREAM: {
				OutputStream outputStream = (OutputStream)theEObject;
				T result = caseOutputStream(outputStream);
				if (result == null) result = caseSimStream(outputStream);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.METRIC: {
				Metric metric = (Metric)theEObject;
				T result = caseMetric(metric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.METRIC_DEFAULT: {
				MetricDefault metricDefault = (MetricDefault)theEObject;
				T result = caseMetricDefault(metricDefault);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.VARIABLE_METRIC: {
				VariableMetric variableMetric = (VariableMetric)theEObject;
				T result = caseVariableMetric(variableMetric);
				if (result == null) result = caseMetric(variableMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.METRIC_INSTANCE: {
				MetricInstance metricInstance = (MetricInstance)theEObject;
				T result = caseMetricInstance(metricInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.PROPERTY_METRIC: {
				PropertyMetric propertyMetric = (PropertyMetric)theEObject;
				T result = casePropertyMetric(propertyMetric);
				if (result == null) result = caseMetric(propertyMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.STREAM_METRIC: {
				StreamMetric streamMetric = (StreamMetric)theEObject;
				T result = caseStreamMetric(streamMetric);
				if (result == null) result = caseMetric(streamMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.SPECIAL_METRIC: {
				SpecialMetric specialMetric = (SpecialMetric)theEObject;
				T result = caseSpecialMetric(specialMetric);
				if (result == null) result = caseStreamMetric(specialMetric);
				if (result == null) result = caseMetric(specialMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.DIRECT_MESSAGE_GENERATION_METRIC: {
				DirectMessageGenerationMetric directMessageGenerationMetric = (DirectMessageGenerationMetric)theEObject;
				T result = caseDirectMessageGenerationMetric(directMessageGenerationMetric);
				if (result == null) result = caseStreamMetric(directMessageGenerationMetric);
				if (result == null) result = caseMetric(directMessageGenerationMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.START_END_TIMING_METRIC: {
				StartEndTimingMetric startEndTimingMetric = (StartEndTimingMetric)theEObject;
				T result = caseStartEndTimingMetric(startEndTimingMetric);
				if (result == null) result = caseDirectMessageGenerationMetric(startEndTimingMetric);
				if (result == null) result = caseStreamMetric(startEndTimingMetric);
				if (result == null) result = caseMetric(startEndTimingMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.FUZZING_OPERATION_TIMES_METRIC: {
				FuzzingOperationTimesMetric fuzzingOperationTimesMetric = (FuzzingOperationTimesMetric)theEObject;
				T result = caseFuzzingOperationTimesMetric(fuzzingOperationTimesMetric);
				if (result == null) result = caseSpecialMetric(fuzzingOperationTimesMetric);
				if (result == null) result = caseStreamMetric(fuzzingOperationTimesMetric);
				if (result == null) result = caseMetric(fuzzingOperationTimesMetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.STREAM_RESULT: {
				StreamResult streamResult = (StreamResult)theEObject;
				T result = caseStreamResult(streamResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MetricsPackage.FILE_STREAM_RESULT: {
				FileStreamResult fileStreamResult = (FileStreamResult)theEObject;
				T result = caseFileStreamResult(fileStreamResult);
				if (result == null) result = caseStreamResult(fileStreamResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sim Stream</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sim Stream</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimStream(SimStream object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Stream</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Stream</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputStream(InputStream object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Stream</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Stream</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputStream(OutputStream object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetric(Metric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric Default</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric Default</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricDefault(MetricDefault object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableMetric(VariableMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetricInstance(MetricInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyMetric(PropertyMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stream Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stream Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStreamMetric(StreamMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Special Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Special Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecialMetric(SpecialMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Direct Message Generation Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Message Generation Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectMessageGenerationMetric(DirectMessageGenerationMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start End Timing Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start End Timing Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartEndTimingMetric(StartEndTimingMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fuzzing Operation Times Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fuzzing Operation Times Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuzzingOperationTimesMetric(FuzzingOperationTimesMetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stream Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stream Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStreamResult(StreamResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Stream Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Stream Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileStreamResult(FileStreamResult object) {
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

} //MetricsSwitch
