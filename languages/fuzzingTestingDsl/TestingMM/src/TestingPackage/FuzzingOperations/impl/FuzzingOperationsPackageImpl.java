/**
 */
package TestingPackage.FuzzingOperations.impl;

import TestingPackage.FuzzingOperations.Activation;
import TestingPackage.FuzzingOperations.BlackholeNetworkOperation;
import TestingPackage.FuzzingOperations.ComponentOperation;
import TestingPackage.FuzzingOperations.ComponentPropertyOperation;
import TestingPackage.FuzzingOperations.ComponentSubPropertyOperation;
import TestingPackage.FuzzingOperations.ConditionBasedActivation;
import TestingPackage.FuzzingOperations.ConditionBasedTimeLimited;
import TestingPackage.FuzzingOperations.CustomFuzzingOperation;
import TestingPackage.FuzzingOperations.CustomOfflineFuzzingOperation;
import TestingPackage.FuzzingOperations.DoubleRange;
import TestingPackage.FuzzingOperations.ExternalResourceSet;
import TestingPackage.FuzzingOperations.FixedTimeActivation;
import TestingPackage.FuzzingOperations.FuzzTestingOperation;
import TestingPackage.FuzzingOperations.FuzzingOperation;
import TestingPackage.FuzzingOperations.FuzzingOperationsFactory;
import TestingPackage.FuzzingOperations.FuzzingOperationsPackage;
import TestingPackage.FuzzingOperations.IntRange;
import TestingPackage.FuzzingOperations.LatencyNetworkOperation;
import TestingPackage.FuzzingOperations.NetworkFuzzingOperation;
import TestingPackage.FuzzingOperations.OfflineFuzzingOperation;
import TestingPackage.FuzzingOperations.OfflineOperationTime;
import TestingPackage.FuzzingOperations.PacketLossNetworkOperation;
import TestingPackage.FuzzingOperations.Point;
import TestingPackage.FuzzingOperations.PointRange;
import TestingPackage.FuzzingOperations.RandomValueFromSetOperation;
import TestingPackage.FuzzingOperations.RandomValueFuzzingOperation;
import TestingPackage.FuzzingOperations.StringSet;
import TestingPackage.FuzzingOperations.ValueRange;
import TestingPackage.FuzzingOperations.ValueSet;
import TestingPackage.FuzzingOperations.VariableOperation;

import TestingPackage.MRSPackage.MRSPackagePackage;

import TestingPackage.MRSPackage.impl.MRSPackagePackageImpl;

import TestingPackage.Metrics.MetricsPackage;

import TestingPackage.Metrics.impl.MetricsPackageImpl;

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
public class FuzzingOperationsPackageImpl extends EPackageImpl implements FuzzingOperationsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fuzzingOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass offlineFuzzingOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customFuzzingOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customOfflineFuzzingOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedTimeActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionBasedActivationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionBasedTimeLimitedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fuzzTestingOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentPropertyOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentSubPropertyOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass randomValueFuzzingOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass randomValueFromSetOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalResourceSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkFuzzingOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blackholeNetworkOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latencyNetworkOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packetLossNetworkOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum offlineOperationTimeEEnum = null;

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
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FuzzingOperationsPackageImpl() {
		super(eNS_URI, FuzzingOperationsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FuzzingOperationsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FuzzingOperationsPackage init() {
		if (isInited) return (FuzzingOperationsPackage)EPackage.Registry.INSTANCE.getEPackage(FuzzingOperationsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFuzzingOperationsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FuzzingOperationsPackageImpl theFuzzingOperationsPackage = registeredFuzzingOperationsPackage instanceof FuzzingOperationsPackageImpl ? (FuzzingOperationsPackageImpl)registeredFuzzingOperationsPackage : new FuzzingOperationsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TestingMMPackage.eNS_URI);
		TestingMMPackageImpl theTestingMMPackage = (TestingMMPackageImpl)(registeredPackage instanceof TestingMMPackageImpl ? registeredPackage : TestingMMPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MetricsPackage.eNS_URI);
		MetricsPackageImpl theMetricsPackage = (MetricsPackageImpl)(registeredPackage instanceof MetricsPackageImpl ? registeredPackage : MetricsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResultsPackage.eNS_URI);
		ResultsPackageImpl theResultsPackage = (ResultsPackageImpl)(registeredPackage instanceof ResultsPackageImpl ? registeredPackage : ResultsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(StandardGrammarPackage.eNS_URI);
		StandardGrammarPackageImpl theStandardGrammarPackage = (StandardGrammarPackageImpl)(registeredPackage instanceof StandardGrammarPackageImpl ? registeredPackage : StandardGrammarPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MRSPackagePackage.eNS_URI);
		MRSPackagePackageImpl theMRSPackagePackage = (MRSPackagePackageImpl)(registeredPackage instanceof MRSPackagePackageImpl ? registeredPackage : MRSPackagePackage.eINSTANCE);

		// Create package meta-data objects
		theFuzzingOperationsPackage.createPackageContents();
		theTestingMMPackage.createPackageContents();
		theMetricsPackage.createPackageContents();
		theResultsPackage.createPackageContents();
		theStandardGrammarPackage.createPackageContents();
		theMRSPackagePackage.createPackageContents();

		// Initialize created meta-data
		theFuzzingOperationsPackage.initializePackageContents();
		theTestingMMPackage.initializePackageContents();
		theMetricsPackage.initializePackageContents();
		theResultsPackage.initializePackageContents();
		theStandardGrammarPackage.initializePackageContents();
		theMRSPackagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFuzzingOperationsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FuzzingOperationsPackage.eNS_URI, theFuzzingOperationsPackage);
		return theFuzzingOperationsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuzzingOperation() {
		return fuzzingOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzingOperation_Name() {
		return (EAttribute)fuzzingOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzingOperation_Priority() {
		return (EAttribute)fuzzingOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuzzingOperation_Activation() {
		return (EReference)fuzzingOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuzzingOperation_VariableToAffect() {
		return (EReference)fuzzingOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzingOperation_MessagesFromAllComponenents() {
		return (EAttribute)fuzzingOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuzzingOperation_FromNodes() {
		return (EReference)fuzzingOperationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzingOperation_MessagesToAllComponenents() {
		return (EAttribute)fuzzingOperationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuzzingOperation_ToNodes() {
		return (EReference)fuzzingOperationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuzzingOperation_NodeToFuzz() {
		return (EReference)fuzzingOperationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzingOperation_AllPublishingVars() {
		return (EAttribute)fuzzingOperationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuzzingOperation_PublishingVars() {
		return (EReference)fuzzingOperationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzingOperation_AllSubscribingVars() {
		return (EAttribute)fuzzingOperationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuzzingOperation_SubscribingVars() {
		return (EReference)fuzzingOperationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuzzingOperation_FromTemplate() {
		return (EReference)fuzzingOperationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuzzingOperation_ContainingTest() {
		return (EReference)fuzzingOperationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuzzingOperation_RecordedTimings() {
		return (EReference)fuzzingOperationEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzingOperation_Seed() {
		return (EAttribute)fuzzingOperationEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzingOperation_SequenceNumInTest() {
		return (EAttribute)fuzzingOperationEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOfflineFuzzingOperation() {
		return offlineFuzzingOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOfflineFuzzingOperation_OperationTime() {
		return (EAttribute)offlineFuzzingOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomFuzzingOperation() {
		return customFuzzingOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomFuzzingOperation_Params() {
		return (EReference)customFuzzingOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomOfflineFuzzingOperation() {
		return customOfflineFuzzingOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivation() {
		return activationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedTimeActivation() {
		return fixedTimeActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedTimeActivation_StartTime() {
		return (EAttribute)fixedTimeActivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedTimeActivation_EndTime() {
		return (EAttribute)fixedTimeActivationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionBasedActivation() {
		return conditionBasedActivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionBasedActivation_MaximumActivations() {
		return (EAttribute)conditionBasedActivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionBasedActivation_Starting() {
		return (EReference)conditionBasedActivationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionBasedActivation_Ending() {
		return (EReference)conditionBasedActivationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionBasedActivation_StartingExpression() {
		return (EAttribute)conditionBasedActivationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionBasedActivation_EndingExpression() {
		return (EAttribute)conditionBasedActivationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionBasedTimeLimited() {
		return conditionBasedTimeLimitedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionBasedTimeLimited_Length() {
		return (EAttribute)conditionBasedTimeLimitedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionBasedTimeLimited_MaximumActivations() {
		return (EAttribute)conditionBasedTimeLimitedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionBasedTimeLimited_Starting() {
		return (EReference)conditionBasedTimeLimitedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionBasedTimeLimited_StartingExpression() {
		return (EAttribute)conditionBasedTimeLimitedEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuzzTestingOperation() {
		return fuzzTestingOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentOperation() {
		return componentOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentPropertyOperation() {
		return componentPropertyOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentPropertyOperation_PropertyToAffect() {
		return (EReference)componentPropertyOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentSubPropertyOperation() {
		return componentSubPropertyOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentSubPropertyOperation_PropertyToAffect() {
		return (EReference)componentSubPropertyOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentSubPropertyOperation_SubProperty() {
		return (EReference)componentSubPropertyOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableOperation() {
		return variableOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableOperation_SubParameters() {
		return (EReference)variableOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRandomValueFuzzingOperation() {
		return randomValueFuzzingOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRandomValueFromSetOperation() {
		return randomValueFromSetOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRandomValueFromSetOperation_ValueSet() {
		return (EReference)randomValueFromSetOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRandomValueFromSetOperation_IsRelative() {
		return (EAttribute)randomValueFromSetOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSet() {
		return valueSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSet_PropertyName() {
		return (EAttribute)valueSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueRange() {
		return valueRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntRange() {
		return intRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntRange_LowerBound() {
		return (EAttribute)intRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntRange_UpperBound() {
		return (EAttribute)intRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoubleRange() {
		return doubleRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleRange_LowerBound() {
		return (EAttribute)doubleRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoubleRange_UpperBound() {
		return (EAttribute)doubleRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoint() {
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_X() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_Y() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_Z() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointRange() {
		return pointRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointRange_MinPoint() {
		return (EReference)pointRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointRange_MaxPoint() {
		return (EReference)pointRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringSet() {
		return stringSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringSet_Choices() {
		return (EAttribute)stringSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalResourceSet() {
		return externalResourceSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalResourceSet_Location() {
		return (EAttribute)externalResourceSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkFuzzingOperation() {
		return networkFuzzingOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlackholeNetworkOperation() {
		return blackholeNetworkOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLatencyNetworkOperation() {
		return latencyNetworkOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLatencyNetworkOperation_Latency() {
		return (EReference)latencyNetworkOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPacketLossNetworkOperation() {
		return packetLossNetworkOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPacketLossNetworkOperation_Frequency() {
		return (EReference)packetLossNetworkOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOfflineOperationTime() {
		return offlineOperationTimeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzingOperationsFactory getFuzzingOperationsFactory() {
		return (FuzzingOperationsFactory)getEFactoryInstance();
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
		fuzzingOperationEClass = createEClass(FUZZING_OPERATION);
		createEAttribute(fuzzingOperationEClass, FUZZING_OPERATION__NAME);
		createEAttribute(fuzzingOperationEClass, FUZZING_OPERATION__PRIORITY);
		createEReference(fuzzingOperationEClass, FUZZING_OPERATION__ACTIVATION);
		createEReference(fuzzingOperationEClass, FUZZING_OPERATION__VARIABLE_TO_AFFECT);
		createEAttribute(fuzzingOperationEClass, FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS);
		createEReference(fuzzingOperationEClass, FUZZING_OPERATION__FROM_NODES);
		createEAttribute(fuzzingOperationEClass, FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS);
		createEReference(fuzzingOperationEClass, FUZZING_OPERATION__TO_NODES);
		createEReference(fuzzingOperationEClass, FUZZING_OPERATION__NODE_TO_FUZZ);
		createEAttribute(fuzzingOperationEClass, FUZZING_OPERATION__ALL_PUBLISHING_VARS);
		createEReference(fuzzingOperationEClass, FUZZING_OPERATION__PUBLISHING_VARS);
		createEAttribute(fuzzingOperationEClass, FUZZING_OPERATION__ALL_SUBSCRIBING_VARS);
		createEReference(fuzzingOperationEClass, FUZZING_OPERATION__SUBSCRIBING_VARS);
		createEReference(fuzzingOperationEClass, FUZZING_OPERATION__FROM_TEMPLATE);
		createEReference(fuzzingOperationEClass, FUZZING_OPERATION__CONTAINING_TEST);
		createEReference(fuzzingOperationEClass, FUZZING_OPERATION__RECORDED_TIMINGS);
		createEAttribute(fuzzingOperationEClass, FUZZING_OPERATION__SEED);
		createEAttribute(fuzzingOperationEClass, FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST);

		offlineFuzzingOperationEClass = createEClass(OFFLINE_FUZZING_OPERATION);
		createEAttribute(offlineFuzzingOperationEClass, OFFLINE_FUZZING_OPERATION__OPERATION_TIME);

		customFuzzingOperationEClass = createEClass(CUSTOM_FUZZING_OPERATION);
		createEReference(customFuzzingOperationEClass, CUSTOM_FUZZING_OPERATION__PARAMS);

		customOfflineFuzzingOperationEClass = createEClass(CUSTOM_OFFLINE_FUZZING_OPERATION);

		activationEClass = createEClass(ACTIVATION);

		fixedTimeActivationEClass = createEClass(FIXED_TIME_ACTIVATION);
		createEAttribute(fixedTimeActivationEClass, FIXED_TIME_ACTIVATION__START_TIME);
		createEAttribute(fixedTimeActivationEClass, FIXED_TIME_ACTIVATION__END_TIME);

		conditionBasedActivationEClass = createEClass(CONDITION_BASED_ACTIVATION);
		createEAttribute(conditionBasedActivationEClass, CONDITION_BASED_ACTIVATION__MAXIMUM_ACTIVATIONS);
		createEReference(conditionBasedActivationEClass, CONDITION_BASED_ACTIVATION__STARTING);
		createEReference(conditionBasedActivationEClass, CONDITION_BASED_ACTIVATION__ENDING);
		createEAttribute(conditionBasedActivationEClass, CONDITION_BASED_ACTIVATION__STARTING_EXPRESSION);
		createEAttribute(conditionBasedActivationEClass, CONDITION_BASED_ACTIVATION__ENDING_EXPRESSION);

		conditionBasedTimeLimitedEClass = createEClass(CONDITION_BASED_TIME_LIMITED);
		createEAttribute(conditionBasedTimeLimitedEClass, CONDITION_BASED_TIME_LIMITED__LENGTH);
		createEAttribute(conditionBasedTimeLimitedEClass, CONDITION_BASED_TIME_LIMITED__MAXIMUM_ACTIVATIONS);
		createEReference(conditionBasedTimeLimitedEClass, CONDITION_BASED_TIME_LIMITED__STARTING);
		createEAttribute(conditionBasedTimeLimitedEClass, CONDITION_BASED_TIME_LIMITED__STARTING_EXPRESSION);

		fuzzTestingOperationEClass = createEClass(FUZZ_TESTING_OPERATION);

		componentOperationEClass = createEClass(COMPONENT_OPERATION);

		componentPropertyOperationEClass = createEClass(COMPONENT_PROPERTY_OPERATION);
		createEReference(componentPropertyOperationEClass, COMPONENT_PROPERTY_OPERATION__PROPERTY_TO_AFFECT);

		componentSubPropertyOperationEClass = createEClass(COMPONENT_SUB_PROPERTY_OPERATION);
		createEReference(componentSubPropertyOperationEClass, COMPONENT_SUB_PROPERTY_OPERATION__PROPERTY_TO_AFFECT);
		createEReference(componentSubPropertyOperationEClass, COMPONENT_SUB_PROPERTY_OPERATION__SUB_PROPERTY);

		variableOperationEClass = createEClass(VARIABLE_OPERATION);
		createEReference(variableOperationEClass, VARIABLE_OPERATION__SUB_PARAMETERS);

		randomValueFuzzingOperationEClass = createEClass(RANDOM_VALUE_FUZZING_OPERATION);

		randomValueFromSetOperationEClass = createEClass(RANDOM_VALUE_FROM_SET_OPERATION);
		createEReference(randomValueFromSetOperationEClass, RANDOM_VALUE_FROM_SET_OPERATION__VALUE_SET);
		createEAttribute(randomValueFromSetOperationEClass, RANDOM_VALUE_FROM_SET_OPERATION__IS_RELATIVE);

		valueSetEClass = createEClass(VALUE_SET);
		createEAttribute(valueSetEClass, VALUE_SET__PROPERTY_NAME);

		valueRangeEClass = createEClass(VALUE_RANGE);

		intRangeEClass = createEClass(INT_RANGE);
		createEAttribute(intRangeEClass, INT_RANGE__LOWER_BOUND);
		createEAttribute(intRangeEClass, INT_RANGE__UPPER_BOUND);

		doubleRangeEClass = createEClass(DOUBLE_RANGE);
		createEAttribute(doubleRangeEClass, DOUBLE_RANGE__LOWER_BOUND);
		createEAttribute(doubleRangeEClass, DOUBLE_RANGE__UPPER_BOUND);

		pointEClass = createEClass(POINT);
		createEAttribute(pointEClass, POINT__X);
		createEAttribute(pointEClass, POINT__Y);
		createEAttribute(pointEClass, POINT__Z);

		pointRangeEClass = createEClass(POINT_RANGE);
		createEReference(pointRangeEClass, POINT_RANGE__MIN_POINT);
		createEReference(pointRangeEClass, POINT_RANGE__MAX_POINT);

		stringSetEClass = createEClass(STRING_SET);
		createEAttribute(stringSetEClass, STRING_SET__CHOICES);

		externalResourceSetEClass = createEClass(EXTERNAL_RESOURCE_SET);
		createEAttribute(externalResourceSetEClass, EXTERNAL_RESOURCE_SET__LOCATION);

		networkFuzzingOperationEClass = createEClass(NETWORK_FUZZING_OPERATION);

		blackholeNetworkOperationEClass = createEClass(BLACKHOLE_NETWORK_OPERATION);

		latencyNetworkOperationEClass = createEClass(LATENCY_NETWORK_OPERATION);
		createEReference(latencyNetworkOperationEClass, LATENCY_NETWORK_OPERATION__LATENCY);

		packetLossNetworkOperationEClass = createEClass(PACKET_LOSS_NETWORK_OPERATION);
		createEReference(packetLossNetworkOperationEClass, PACKET_LOSS_NETWORK_OPERATION__FREQUENCY);

		// Create enums
		offlineOperationTimeEEnum = createEEnum(OFFLINE_OPERATION_TIME);
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
		TestingMMPackage theTestingMMPackage = (TestingMMPackage)EPackage.Registry.INSTANCE.getEPackage(TestingMMPackage.eNS_URI);
		StandardGrammarPackage theStandardGrammarPackage = (StandardGrammarPackage)EPackage.Registry.INSTANCE.getEPackage(StandardGrammarPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		offlineFuzzingOperationEClass.getESuperTypes().add(this.getFuzzingOperation());
		customFuzzingOperationEClass.getESuperTypes().add(this.getFuzzingOperation());
		customOfflineFuzzingOperationEClass.getESuperTypes().add(this.getOfflineFuzzingOperation());
		fixedTimeActivationEClass.getESuperTypes().add(this.getActivation());
		conditionBasedActivationEClass.getESuperTypes().add(this.getActivation());
		conditionBasedTimeLimitedEClass.getESuperTypes().add(this.getActivation());
		fuzzTestingOperationEClass.getESuperTypes().add(this.getFuzzingOperation());
		componentOperationEClass.getESuperTypes().add(this.getFuzzTestingOperation());
		componentPropertyOperationEClass.getESuperTypes().add(this.getFuzzTestingOperation());
		componentSubPropertyOperationEClass.getESuperTypes().add(this.getFuzzTestingOperation());
		variableOperationEClass.getESuperTypes().add(this.getFuzzTestingOperation());
		randomValueFuzzingOperationEClass.getESuperTypes().add(this.getComponentOperation());
		randomValueFromSetOperationEClass.getESuperTypes().add(this.getRandomValueFuzzingOperation());
		valueRangeEClass.getESuperTypes().add(this.getValueSet());
		intRangeEClass.getESuperTypes().add(this.getValueRange());
		doubleRangeEClass.getESuperTypes().add(this.getValueRange());
		pointRangeEClass.getESuperTypes().add(this.getValueRange());
		stringSetEClass.getESuperTypes().add(this.getValueSet());
		externalResourceSetEClass.getESuperTypes().add(this.getValueSet());
		networkFuzzingOperationEClass.getESuperTypes().add(this.getFuzzingOperation());
		blackholeNetworkOperationEClass.getESuperTypes().add(this.getNetworkFuzzingOperation());
		latencyNetworkOperationEClass.getESuperTypes().add(this.getNetworkFuzzingOperation());
		packetLossNetworkOperationEClass.getESuperTypes().add(this.getNetworkFuzzingOperation());

		// Initialize classes, features, and operations; add parameters
		initEClass(fuzzingOperationEClass, FuzzingOperation.class, "FuzzingOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFuzzingOperation_Name(), ecorePackage.getEString(), "name", null, 0, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuzzingOperation_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuzzingOperation_Activation(), this.getActivation(), null, "activation", null, 1, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuzzingOperation_VariableToAffect(), theMRSPackagePackage.getVariable(), null, "variableToAffect", null, 0, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuzzingOperation_MessagesFromAllComponenents(), ecorePackage.getEBoolean(), "messagesFromAllComponenents", "true", 0, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuzzingOperation_FromNodes(), theMRSPackagePackage.getNode(), null, "fromNodes", null, 0, -1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuzzingOperation_MessagesToAllComponenents(), ecorePackage.getEBoolean(), "messagesToAllComponenents", "true", 0, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuzzingOperation_ToNodes(), theMRSPackagePackage.getNode(), null, "toNodes", null, 0, -1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuzzingOperation_NodeToFuzz(), theMRSPackagePackage.getNode(), null, "nodeToFuzz", null, 0, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuzzingOperation_AllPublishingVars(), ecorePackage.getEBoolean(), "allPublishingVars", "false", 0, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuzzingOperation_PublishingVars(), theMRSPackagePackage.getVariable(), null, "publishingVars", null, 0, -1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuzzingOperation_AllSubscribingVars(), ecorePackage.getEBoolean(), "allSubscribingVars", "false", 0, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuzzingOperation_SubscribingVars(), theMRSPackagePackage.getVariable(), null, "subscribingVars", null, 0, -1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuzzingOperation_FromTemplate(), this.getFuzzingOperation(), null, "fromTemplate", null, 0, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuzzingOperation_ContainingTest(), theTestingMMPackage.getTest(), theTestingMMPackage.getTest_Operations(), "containingTest", null, 0, 1, FuzzingOperation.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuzzingOperation_RecordedTimings(), this.getFixedTimeActivation(), null, "recordedTimings", null, 0, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuzzingOperation_Seed(), ecorePackage.getEInt(), "seed", null, 0, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuzzingOperation_SequenceNumInTest(), ecorePackage.getEInt(), "sequenceNumInTest", null, 0, 1, FuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(offlineFuzzingOperationEClass, OfflineFuzzingOperation.class, "OfflineFuzzingOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOfflineFuzzingOperation_OperationTime(), this.getOfflineOperationTime(), "operationTime", null, 0, 1, OfflineFuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customFuzzingOperationEClass, CustomFuzzingOperation.class, "CustomFuzzingOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomFuzzingOperation_Params(), this.getValueSet(), null, "params", null, 0, -1, CustomFuzzingOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customOfflineFuzzingOperationEClass, CustomOfflineFuzzingOperation.class, "CustomOfflineFuzzingOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activationEClass, Activation.class, "Activation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fixedTimeActivationEClass, FixedTimeActivation.class, "FixedTimeActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFixedTimeActivation_StartTime(), ecorePackage.getEDouble(), "startTime", null, 0, 1, FixedTimeActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFixedTimeActivation_EndTime(), ecorePackage.getEDouble(), "endTime", null, 0, 1, FixedTimeActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionBasedActivationEClass, ConditionBasedActivation.class, "ConditionBasedActivation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionBasedActivation_MaximumActivations(), ecorePackage.getEInt(), "maximumActivations", "1", 0, 1, ConditionBasedActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionBasedActivation_Starting(), theStandardGrammarPackage.getCondition(), null, "starting", null, 0, 1, ConditionBasedActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionBasedActivation_Ending(), theStandardGrammarPackage.getCondition(), null, "ending", null, 0, 1, ConditionBasedActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionBasedActivation_StartingExpression(), ecorePackage.getEString(), "startingExpression", null, 0, 1, ConditionBasedActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionBasedActivation_EndingExpression(), ecorePackage.getEString(), "endingExpression", null, 0, 1, ConditionBasedActivation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionBasedTimeLimitedEClass, ConditionBasedTimeLimited.class, "ConditionBasedTimeLimited", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionBasedTimeLimited_Length(), ecorePackage.getEDouble(), "length", null, 0, 1, ConditionBasedTimeLimited.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionBasedTimeLimited_MaximumActivations(), ecorePackage.getEInt(), "maximumActivations", "1", 0, 1, ConditionBasedTimeLimited.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionBasedTimeLimited_Starting(), theStandardGrammarPackage.getCondition(), null, "starting", null, 0, 1, ConditionBasedTimeLimited.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionBasedTimeLimited_StartingExpression(), ecorePackage.getEString(), "startingExpression", null, 0, 1, ConditionBasedTimeLimited.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fuzzTestingOperationEClass, FuzzTestingOperation.class, "FuzzTestingOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentOperationEClass, ComponentOperation.class, "ComponentOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentPropertyOperationEClass, ComponentPropertyOperation.class, "ComponentPropertyOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentPropertyOperation_PropertyToAffect(), theMRSPackagePackage.getComponentProperty(), null, "propertyToAffect", null, 0, 1, ComponentPropertyOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentSubPropertyOperationEClass, ComponentSubPropertyOperation.class, "ComponentSubPropertyOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentSubPropertyOperation_PropertyToAffect(), theMRSPackagePackage.getComponentProperty(), null, "propertyToAffect", null, 0, 1, ComponentSubPropertyOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentSubPropertyOperation_SubProperty(), theMRSPackagePackage.getType(), null, "subProperty", null, 0, 1, ComponentSubPropertyOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableOperationEClass, VariableOperation.class, "VariableOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableOperation_SubParameters(), theMRSPackagePackage.getParameter(), null, "subParameters", null, 0, -1, VariableOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(randomValueFuzzingOperationEClass, RandomValueFuzzingOperation.class, "RandomValueFuzzingOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(randomValueFromSetOperationEClass, RandomValueFromSetOperation.class, "RandomValueFromSetOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRandomValueFromSetOperation_ValueSet(), this.getValueSet(), null, "valueSet", null, 0, -1, RandomValueFromSetOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRandomValueFromSetOperation_IsRelative(), ecorePackage.getEBoolean(), "isRelative", "false", 0, 1, RandomValueFromSetOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueSetEClass, ValueSet.class, "ValueSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueSet_PropertyName(), ecorePackage.getEString(), "propertyName", null, 0, 1, ValueSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueRangeEClass, ValueRange.class, "ValueRange", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intRangeEClass, IntRange.class, "IntRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntRange_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 0, 1, IntRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntRange_UpperBound(), ecorePackage.getEInt(), "upperBound", null, 0, 1, IntRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleRangeEClass, DoubleRange.class, "DoubleRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoubleRange_LowerBound(), ecorePackage.getEDouble(), "lowerBound", null, 0, 1, DoubleRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoubleRange_UpperBound(), ecorePackage.getEDouble(), "upperBound", null, 0, 1, DoubleRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoint_X(), ecorePackage.getEDouble(), "x", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_Y(), ecorePackage.getEDouble(), "y", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_Z(), ecorePackage.getEDouble(), "z", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointRangeEClass, PointRange.class, "PointRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPointRange_MinPoint(), this.getPoint(), null, "minPoint", null, 1, 1, PointRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointRange_MaxPoint(), this.getPoint(), null, "maxPoint", null, 1, 1, PointRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringSetEClass, StringSet.class, "StringSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringSet_Choices(), ecorePackage.getEString(), "choices", null, 0, -1, StringSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalResourceSetEClass, ExternalResourceSet.class, "ExternalResourceSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalResourceSet_Location(), ecorePackage.getEString(), "location", null, 0, 1, ExternalResourceSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(networkFuzzingOperationEClass, NetworkFuzzingOperation.class, "NetworkFuzzingOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blackholeNetworkOperationEClass, BlackholeNetworkOperation.class, "BlackholeNetworkOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(latencyNetworkOperationEClass, LatencyNetworkOperation.class, "LatencyNetworkOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLatencyNetworkOperation_Latency(), this.getDoubleRange(), null, "latency", null, 1, 1, LatencyNetworkOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(packetLossNetworkOperationEClass, PacketLossNetworkOperation.class, "PacketLossNetworkOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPacketLossNetworkOperation_Frequency(), this.getDoubleRange(), null, "frequency", null, 1, 1, PacketLossNetworkOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(offlineOperationTimeEEnum, OfflineOperationTime.class, "OfflineOperationTime");
		addEEnumLiteral(offlineOperationTimeEEnum, OfflineOperationTime.PRE);
		addEEnumLiteral(offlineOperationTimeEEnum, OfflineOperationTime.POST);

		// Create annotations
		// syntax
		createSyntaxAnnotations();
	}

	/**
	 * Initializes the annotations for <b>syntax</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSyntaxAnnotations() {
		String source = "syntax";
		addAnnotation
		  (conditionBasedActivationEClass,
		   source,
		   new String[] {
			   "feature", "startingExpression",
			   "derive", "starting",
			   "grammar", "sesame.conditionBasedActivation.startingEndingExpression.ConditionsDsl",
			   "entryRule", "ConditionBasedActivationStarting"
		   });
		addAnnotation
		  (conditionBasedActivationEClass,
		   source,
		   new String[] {
			   "feature", "endingExpression",
			   "derive", "ending",
			   "grammar", "sesame.conditionBasedActivation.startingEndingExpression.ConditionsDsl",
			   "entryRule", "ConditionBasedActivationEnding"
		   });
		addAnnotation
		  (conditionBasedTimeLimitedEClass,
		   source,
		   new String[] {
			   "feature", "startingExpression",
			   "derive", "starting",
			   "grammar", "sesame.conditionBasedTimeLimited.startingExpression.ConditionsDsl",
			   "entryRule", "ConditionBasedTimeLimited"
		   });
	}

} //FuzzingOperationsPackageImpl
