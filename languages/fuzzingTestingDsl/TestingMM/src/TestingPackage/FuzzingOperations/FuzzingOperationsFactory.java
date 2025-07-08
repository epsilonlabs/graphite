/**
 */
package TestingPackage.FuzzingOperations;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage
 * @generated
 */
public interface FuzzingOperationsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated NOT
	*/
	FuzzingOperationsFactory eINSTANCE = TestingPackage.FuzzingOperations.impl.XtextFuzzingOperationsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Offline Fuzzing Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Offline Fuzzing Operation</em>'.
	 * @generated
	 */
	OfflineFuzzingOperation createOfflineFuzzingOperation();

	/**
	 * Returns a new object of class '<em>Custom Fuzzing Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Fuzzing Operation</em>'.
	 * @generated
	 */
	CustomFuzzingOperation createCustomFuzzingOperation();

	/**
	 * Returns a new object of class '<em>Custom Offline Fuzzing Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Offline Fuzzing Operation</em>'.
	 * @generated
	 */
	CustomOfflineFuzzingOperation createCustomOfflineFuzzingOperation();

	/**
	 * Returns a new object of class '<em>Fixed Time Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fixed Time Activation</em>'.
	 * @generated
	 */
	FixedTimeActivation createFixedTimeActivation();

	/**
	 * Returns a new object of class '<em>Condition Based Activation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Based Activation</em>'.
	 * @generated
	 */
	ConditionBasedActivation createConditionBasedActivation();

	/**
	 * Returns a new object of class '<em>Condition Based Time Limited</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Based Time Limited</em>'.
	 * @generated
	 */
	ConditionBasedTimeLimited createConditionBasedTimeLimited();

	/**
	 * Returns a new object of class '<em>Fuzz Testing Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fuzz Testing Operation</em>'.
	 * @generated
	 */
	FuzzTestingOperation createFuzzTestingOperation();

	/**
	 * Returns a new object of class '<em>Component Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Operation</em>'.
	 * @generated
	 */
	ComponentOperation createComponentOperation();

	/**
	 * Returns a new object of class '<em>Component Property Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Property Operation</em>'.
	 * @generated
	 */
	ComponentPropertyOperation createComponentPropertyOperation();

	/**
	 * Returns a new object of class '<em>Component Sub Property Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Sub Property Operation</em>'.
	 * @generated
	 */
	ComponentSubPropertyOperation createComponentSubPropertyOperation();

	/**
	 * Returns a new object of class '<em>Variable Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Operation</em>'.
	 * @generated
	 */
	VariableOperation createVariableOperation();

	/**
	 * Returns a new object of class '<em>Random Value Fuzzing Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Random Value Fuzzing Operation</em>'.
	 * @generated
	 */
	RandomValueFuzzingOperation createRandomValueFuzzingOperation();

	/**
	 * Returns a new object of class '<em>Random Value From Set Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Random Value From Set Operation</em>'.
	 * @generated
	 */
	RandomValueFromSetOperation createRandomValueFromSetOperation();

	/**
	 * Returns a new object of class '<em>Value Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Set</em>'.
	 * @generated
	 */
	ValueSet createValueSet();

	/**
	 * Returns a new object of class '<em>Int Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Range</em>'.
	 * @generated
	 */
	IntRange createIntRange();

	/**
	 * Returns a new object of class '<em>Double Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Double Range</em>'.
	 * @generated
	 */
	DoubleRange createDoubleRange();

	/**
	 * Returns a new object of class '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point</em>'.
	 * @generated
	 */
	Point createPoint();

	/**
	 * Returns a new object of class '<em>Point Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point Range</em>'.
	 * @generated
	 */
	PointRange createPointRange();

	/**
	 * Returns a new object of class '<em>String Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Set</em>'.
	 * @generated
	 */
	StringSet createStringSet();

	/**
	 * Returns a new object of class '<em>External Resource Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Resource Set</em>'.
	 * @generated
	 */
	ExternalResourceSet createExternalResourceSet();

	/**
	 * Returns a new object of class '<em>Network Fuzzing Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Fuzzing Operation</em>'.
	 * @generated
	 */
	NetworkFuzzingOperation createNetworkFuzzingOperation();

	/**
	 * Returns a new object of class '<em>Blackhole Network Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blackhole Network Operation</em>'.
	 * @generated
	 */
	BlackholeNetworkOperation createBlackholeNetworkOperation();

	/**
	 * Returns a new object of class '<em>Latency Network Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Latency Network Operation</em>'.
	 * @generated
	 */
	LatencyNetworkOperation createLatencyNetworkOperation();

	/**
	 * Returns a new object of class '<em>Packet Loss Network Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Packet Loss Network Operation</em>'.
	 * @generated
	 */
	PacketLossNetworkOperation createPacketLossNetworkOperation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FuzzingOperationsPackage getFuzzingOperationsPackage();

} //FuzzingOperationsFactory (Patched)