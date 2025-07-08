/**
 */
package TestingPackage.FuzzingOperations;

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
 * @see TestingPackage.FuzzingOperations.FuzzingOperationsFactory
 * @model kind="package"
 * @generated
 */
public interface FuzzingOperationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "FuzzingOperations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "FuzzingOperations";

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
	FuzzingOperationsPackage eINSTANCE = TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.FuzzingOperationImpl <em>Fuzzing Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getFuzzingOperation()
	 * @generated
	 */
	int FUZZING_OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__PRIORITY = 1;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__ACTIVATION = 2;

	/**
	 * The feature id for the '<em><b>Variable To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__VARIABLE_TO_AFFECT = 3;

	/**
	 * The feature id for the '<em><b>Messages From All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = 4;

	/**
	 * The feature id for the '<em><b>From Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__FROM_NODES = 5;

	/**
	 * The feature id for the '<em><b>Messages To All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = 6;

	/**
	 * The feature id for the '<em><b>To Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__TO_NODES = 7;

	/**
	 * The feature id for the '<em><b>Node To Fuzz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__NODE_TO_FUZZ = 8;

	/**
	 * The feature id for the '<em><b>All Publishing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__ALL_PUBLISHING_VARS = 9;

	/**
	 * The feature id for the '<em><b>Publishing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__PUBLISHING_VARS = 10;

	/**
	 * The feature id for the '<em><b>All Subscribing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__ALL_SUBSCRIBING_VARS = 11;

	/**
	 * The feature id for the '<em><b>Subscribing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__SUBSCRIBING_VARS = 12;

	/**
	 * The feature id for the '<em><b>From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__FROM_TEMPLATE = 13;

	/**
	 * The feature id for the '<em><b>Containing Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__CONTAINING_TEST = 14;

	/**
	 * The feature id for the '<em><b>Recorded Timings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__RECORDED_TIMINGS = 15;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__SEED = 16;

	/**
	 * The feature id for the '<em><b>Sequence Num In Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST = 17;

	/**
	 * The number of structural features of the '<em>Fuzzing Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Fuzzing Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZING_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.OfflineFuzzingOperationImpl <em>Offline Fuzzing Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.OfflineFuzzingOperationImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getOfflineFuzzingOperation()
	 * @generated
	 */
	int OFFLINE_FUZZING_OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_FUZZING_OPERATION__NAME = FUZZING_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_FUZZING_OPERATION__PRIORITY = FUZZING_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_FUZZING_OPERATION__ACTIVATION = FUZZING_OPERATION__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Variable To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_FUZZING_OPERATION__VARIABLE_TO_AFFECT = FUZZING_OPERATION__VARIABLE_TO_AFFECT;

	/**
	 * The feature id for the '<em><b>Messages From All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>From Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_FUZZING_OPERATION__FROM_NODES = FUZZING_OPERATION__FROM_NODES;

	/**
	 * The feature id for the '<em><b>Messages To All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>To Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_FUZZING_OPERATION__TO_NODES = FUZZING_OPERATION__TO_NODES;

	/**
	 * The feature id for the '<em><b>Node To Fuzz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_FUZZING_OPERATION__NODE_TO_FUZZ = FUZZING_OPERATION__NODE_TO_FUZZ;

	/**
	 * The feature id for the '<em><b>All Publishing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_FUZZING_OPERATION__ALL_PUBLISHING_VARS = FUZZING_OPERATION__ALL_PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>Publishing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_FUZZING_OPERATION__PUBLISHING_VARS = FUZZING_OPERATION__PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>All Subscribing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_FUZZING_OPERATION__ALL_SUBSCRIBING_VARS = FUZZING_OPERATION__ALL_SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>Subscribing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_FUZZING_OPERATION__SUBSCRIBING_VARS = FUZZING_OPERATION__SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_FUZZING_OPERATION__FROM_TEMPLATE = FUZZING_OPERATION__FROM_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Containing Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_FUZZING_OPERATION__CONTAINING_TEST = FUZZING_OPERATION__CONTAINING_TEST;

	/**
	 * The feature id for the '<em><b>Recorded Timings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_FUZZING_OPERATION__RECORDED_TIMINGS = FUZZING_OPERATION__RECORDED_TIMINGS;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_FUZZING_OPERATION__SEED = FUZZING_OPERATION__SEED;

	/**
	 * The feature id for the '<em><b>Sequence Num In Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST = FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST;

	/**
	 * The feature id for the '<em><b>Operation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_FUZZING_OPERATION__OPERATION_TIME = FUZZING_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Offline Fuzzing Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_FUZZING_OPERATION_FEATURE_COUNT = FUZZING_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Offline Fuzzing Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OFFLINE_FUZZING_OPERATION_OPERATION_COUNT = FUZZING_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.CustomFuzzingOperationImpl <em>Custom Fuzzing Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.CustomFuzzingOperationImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getCustomFuzzingOperation()
	 * @generated
	 */
	int CUSTOM_FUZZING_OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__NAME = FUZZING_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__PRIORITY = FUZZING_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__ACTIVATION = FUZZING_OPERATION__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Variable To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__VARIABLE_TO_AFFECT = FUZZING_OPERATION__VARIABLE_TO_AFFECT;

	/**
	 * The feature id for the '<em><b>Messages From All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>From Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__FROM_NODES = FUZZING_OPERATION__FROM_NODES;

	/**
	 * The feature id for the '<em><b>Messages To All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>To Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__TO_NODES = FUZZING_OPERATION__TO_NODES;

	/**
	 * The feature id for the '<em><b>Node To Fuzz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__NODE_TO_FUZZ = FUZZING_OPERATION__NODE_TO_FUZZ;

	/**
	 * The feature id for the '<em><b>All Publishing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__ALL_PUBLISHING_VARS = FUZZING_OPERATION__ALL_PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>Publishing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__PUBLISHING_VARS = FUZZING_OPERATION__PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>All Subscribing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__ALL_SUBSCRIBING_VARS = FUZZING_OPERATION__ALL_SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>Subscribing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__SUBSCRIBING_VARS = FUZZING_OPERATION__SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__FROM_TEMPLATE = FUZZING_OPERATION__FROM_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Containing Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__CONTAINING_TEST = FUZZING_OPERATION__CONTAINING_TEST;

	/**
	 * The feature id for the '<em><b>Recorded Timings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__RECORDED_TIMINGS = FUZZING_OPERATION__RECORDED_TIMINGS;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__SEED = FUZZING_OPERATION__SEED;

	/**
	 * The feature id for the '<em><b>Sequence Num In Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST = FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION__PARAMS = FUZZING_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Fuzzing Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION_FEATURE_COUNT = FUZZING_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Custom Fuzzing Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_FUZZING_OPERATION_OPERATION_COUNT = FUZZING_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.CustomOfflineFuzzingOperationImpl <em>Custom Offline Fuzzing Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.CustomOfflineFuzzingOperationImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getCustomOfflineFuzzingOperation()
	 * @generated
	 */
	int CUSTOM_OFFLINE_FUZZING_OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OFFLINE_FUZZING_OPERATION__NAME = OFFLINE_FUZZING_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OFFLINE_FUZZING_OPERATION__PRIORITY = OFFLINE_FUZZING_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OFFLINE_FUZZING_OPERATION__ACTIVATION = OFFLINE_FUZZING_OPERATION__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Variable To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OFFLINE_FUZZING_OPERATION__VARIABLE_TO_AFFECT = OFFLINE_FUZZING_OPERATION__VARIABLE_TO_AFFECT;

	/**
	 * The feature id for the '<em><b>Messages From All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OFFLINE_FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = OFFLINE_FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>From Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OFFLINE_FUZZING_OPERATION__FROM_NODES = OFFLINE_FUZZING_OPERATION__FROM_NODES;

	/**
	 * The feature id for the '<em><b>Messages To All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OFFLINE_FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = OFFLINE_FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>To Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OFFLINE_FUZZING_OPERATION__TO_NODES = OFFLINE_FUZZING_OPERATION__TO_NODES;

	/**
	 * The feature id for the '<em><b>Node To Fuzz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OFFLINE_FUZZING_OPERATION__NODE_TO_FUZZ = OFFLINE_FUZZING_OPERATION__NODE_TO_FUZZ;

	/**
	 * The feature id for the '<em><b>All Publishing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OFFLINE_FUZZING_OPERATION__ALL_PUBLISHING_VARS = OFFLINE_FUZZING_OPERATION__ALL_PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>Publishing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OFFLINE_FUZZING_OPERATION__PUBLISHING_VARS = OFFLINE_FUZZING_OPERATION__PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>All Subscribing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OFFLINE_FUZZING_OPERATION__ALL_SUBSCRIBING_VARS = OFFLINE_FUZZING_OPERATION__ALL_SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>Subscribing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OFFLINE_FUZZING_OPERATION__SUBSCRIBING_VARS = OFFLINE_FUZZING_OPERATION__SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OFFLINE_FUZZING_OPERATION__FROM_TEMPLATE = OFFLINE_FUZZING_OPERATION__FROM_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Containing Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OFFLINE_FUZZING_OPERATION__CONTAINING_TEST = OFFLINE_FUZZING_OPERATION__CONTAINING_TEST;

	/**
	 * The feature id for the '<em><b>Recorded Timings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OFFLINE_FUZZING_OPERATION__RECORDED_TIMINGS = OFFLINE_FUZZING_OPERATION__RECORDED_TIMINGS;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OFFLINE_FUZZING_OPERATION__SEED = OFFLINE_FUZZING_OPERATION__SEED;

	/**
	 * The feature id for the '<em><b>Sequence Num In Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OFFLINE_FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST = OFFLINE_FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST;

	/**
	 * The feature id for the '<em><b>Operation Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OFFLINE_FUZZING_OPERATION__OPERATION_TIME = OFFLINE_FUZZING_OPERATION__OPERATION_TIME;

	/**
	 * The number of structural features of the '<em>Custom Offline Fuzzing Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OFFLINE_FUZZING_OPERATION_FEATURE_COUNT = OFFLINE_FUZZING_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Custom Offline Fuzzing Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_OFFLINE_FUZZING_OPERATION_OPERATION_COUNT = OFFLINE_FUZZING_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.ActivationImpl <em>Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.ActivationImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getActivation()
	 * @generated
	 */
	int ACTIVATION = 4;

	/**
	 * The number of structural features of the '<em>Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.FixedTimeActivationImpl <em>Fixed Time Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.FixedTimeActivationImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getFixedTimeActivation()
	 * @generated
	 */
	int FIXED_TIME_ACTIVATION = 5;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TIME_ACTIVATION__START_TIME = ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TIME_ACTIVATION__END_TIME = ACTIVATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fixed Time Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TIME_ACTIVATION_FEATURE_COUNT = ACTIVATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fixed Time Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIXED_TIME_ACTIVATION_OPERATION_COUNT = ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.ConditionBasedActivationImpl <em>Condition Based Activation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.ConditionBasedActivationImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getConditionBasedActivation()
	 * @generated
	 */
	int CONDITION_BASED_ACTIVATION = 6;

	/**
	 * The feature id for the '<em><b>Maximum Activations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_ACTIVATION__MAXIMUM_ACTIVATIONS = ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Starting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_ACTIVATION__STARTING = ACTIVATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ending</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_ACTIVATION__ENDING = ACTIVATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Starting Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_ACTIVATION__STARTING_EXPRESSION = ACTIVATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ending Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_ACTIVATION__ENDING_EXPRESSION = ACTIVATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Condition Based Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_ACTIVATION_FEATURE_COUNT = ACTIVATION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Condition Based Activation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_ACTIVATION_OPERATION_COUNT = ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.ConditionBasedTimeLimitedImpl <em>Condition Based Time Limited</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.ConditionBasedTimeLimitedImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getConditionBasedTimeLimited()
	 * @generated
	 */
	int CONDITION_BASED_TIME_LIMITED = 7;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_TIME_LIMITED__LENGTH = ACTIVATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum Activations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_TIME_LIMITED__MAXIMUM_ACTIVATIONS = ACTIVATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Starting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_TIME_LIMITED__STARTING = ACTIVATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Starting Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_TIME_LIMITED__STARTING_EXPRESSION = ACTIVATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Condition Based Time Limited</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_TIME_LIMITED_FEATURE_COUNT = ACTIVATION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Condition Based Time Limited</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_BASED_TIME_LIMITED_OPERATION_COUNT = ACTIVATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.FuzzTestingOperationImpl <em>Fuzz Testing Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.FuzzTestingOperationImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getFuzzTestingOperation()
	 * @generated
	 */
	int FUZZ_TESTING_OPERATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZ_TESTING_OPERATION__NAME = FUZZING_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZ_TESTING_OPERATION__PRIORITY = FUZZING_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZ_TESTING_OPERATION__ACTIVATION = FUZZING_OPERATION__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Variable To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZ_TESTING_OPERATION__VARIABLE_TO_AFFECT = FUZZING_OPERATION__VARIABLE_TO_AFFECT;

	/**
	 * The feature id for the '<em><b>Messages From All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZ_TESTING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>From Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZ_TESTING_OPERATION__FROM_NODES = FUZZING_OPERATION__FROM_NODES;

	/**
	 * The feature id for the '<em><b>Messages To All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZ_TESTING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>To Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZ_TESTING_OPERATION__TO_NODES = FUZZING_OPERATION__TO_NODES;

	/**
	 * The feature id for the '<em><b>Node To Fuzz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZ_TESTING_OPERATION__NODE_TO_FUZZ = FUZZING_OPERATION__NODE_TO_FUZZ;

	/**
	 * The feature id for the '<em><b>All Publishing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZ_TESTING_OPERATION__ALL_PUBLISHING_VARS = FUZZING_OPERATION__ALL_PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>Publishing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZ_TESTING_OPERATION__PUBLISHING_VARS = FUZZING_OPERATION__PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>All Subscribing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZ_TESTING_OPERATION__ALL_SUBSCRIBING_VARS = FUZZING_OPERATION__ALL_SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>Subscribing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZ_TESTING_OPERATION__SUBSCRIBING_VARS = FUZZING_OPERATION__SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZ_TESTING_OPERATION__FROM_TEMPLATE = FUZZING_OPERATION__FROM_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Containing Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZ_TESTING_OPERATION__CONTAINING_TEST = FUZZING_OPERATION__CONTAINING_TEST;

	/**
	 * The feature id for the '<em><b>Recorded Timings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZ_TESTING_OPERATION__RECORDED_TIMINGS = FUZZING_OPERATION__RECORDED_TIMINGS;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZ_TESTING_OPERATION__SEED = FUZZING_OPERATION__SEED;

	/**
	 * The feature id for the '<em><b>Sequence Num In Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZ_TESTING_OPERATION__SEQUENCE_NUM_IN_TEST = FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST;

	/**
	 * The number of structural features of the '<em>Fuzz Testing Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZ_TESTING_OPERATION_FEATURE_COUNT = FUZZING_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fuzz Testing Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZ_TESTING_OPERATION_OPERATION_COUNT = FUZZING_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.ComponentOperationImpl <em>Component Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.ComponentOperationImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getComponentOperation()
	 * @generated
	 */
	int COMPONENT_OPERATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION__NAME = FUZZ_TESTING_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION__PRIORITY = FUZZ_TESTING_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION__ACTIVATION = FUZZ_TESTING_OPERATION__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Variable To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION__VARIABLE_TO_AFFECT = FUZZ_TESTING_OPERATION__VARIABLE_TO_AFFECT;

	/**
	 * The feature id for the '<em><b>Messages From All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = FUZZ_TESTING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>From Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION__FROM_NODES = FUZZ_TESTING_OPERATION__FROM_NODES;

	/**
	 * The feature id for the '<em><b>Messages To All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = FUZZ_TESTING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>To Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION__TO_NODES = FUZZ_TESTING_OPERATION__TO_NODES;

	/**
	 * The feature id for the '<em><b>Node To Fuzz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION__NODE_TO_FUZZ = FUZZ_TESTING_OPERATION__NODE_TO_FUZZ;

	/**
	 * The feature id for the '<em><b>All Publishing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION__ALL_PUBLISHING_VARS = FUZZ_TESTING_OPERATION__ALL_PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>Publishing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION__PUBLISHING_VARS = FUZZ_TESTING_OPERATION__PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>All Subscribing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION__ALL_SUBSCRIBING_VARS = FUZZ_TESTING_OPERATION__ALL_SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>Subscribing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION__SUBSCRIBING_VARS = FUZZ_TESTING_OPERATION__SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION__FROM_TEMPLATE = FUZZ_TESTING_OPERATION__FROM_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Containing Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION__CONTAINING_TEST = FUZZ_TESTING_OPERATION__CONTAINING_TEST;

	/**
	 * The feature id for the '<em><b>Recorded Timings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION__RECORDED_TIMINGS = FUZZ_TESTING_OPERATION__RECORDED_TIMINGS;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION__SEED = FUZZ_TESTING_OPERATION__SEED;

	/**
	 * The feature id for the '<em><b>Sequence Num In Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION__SEQUENCE_NUM_IN_TEST = FUZZ_TESTING_OPERATION__SEQUENCE_NUM_IN_TEST;

	/**
	 * The number of structural features of the '<em>Component Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_FEATURE_COUNT = FUZZ_TESTING_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Component Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_OPERATION_COUNT = FUZZ_TESTING_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.ComponentPropertyOperationImpl <em>Component Property Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.ComponentPropertyOperationImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getComponentPropertyOperation()
	 * @generated
	 */
	int COMPONENT_PROPERTY_OPERATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_OPERATION__NAME = FUZZ_TESTING_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_OPERATION__PRIORITY = FUZZ_TESTING_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_OPERATION__ACTIVATION = FUZZ_TESTING_OPERATION__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Variable To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_OPERATION__VARIABLE_TO_AFFECT = FUZZ_TESTING_OPERATION__VARIABLE_TO_AFFECT;

	/**
	 * The feature id for the '<em><b>Messages From All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = FUZZ_TESTING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>From Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_OPERATION__FROM_NODES = FUZZ_TESTING_OPERATION__FROM_NODES;

	/**
	 * The feature id for the '<em><b>Messages To All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = FUZZ_TESTING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>To Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_OPERATION__TO_NODES = FUZZ_TESTING_OPERATION__TO_NODES;

	/**
	 * The feature id for the '<em><b>Node To Fuzz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_OPERATION__NODE_TO_FUZZ = FUZZ_TESTING_OPERATION__NODE_TO_FUZZ;

	/**
	 * The feature id for the '<em><b>All Publishing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_OPERATION__ALL_PUBLISHING_VARS = FUZZ_TESTING_OPERATION__ALL_PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>Publishing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_OPERATION__PUBLISHING_VARS = FUZZ_TESTING_OPERATION__PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>All Subscribing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_OPERATION__ALL_SUBSCRIBING_VARS = FUZZ_TESTING_OPERATION__ALL_SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>Subscribing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_OPERATION__SUBSCRIBING_VARS = FUZZ_TESTING_OPERATION__SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_OPERATION__FROM_TEMPLATE = FUZZ_TESTING_OPERATION__FROM_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Containing Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_OPERATION__CONTAINING_TEST = FUZZ_TESTING_OPERATION__CONTAINING_TEST;

	/**
	 * The feature id for the '<em><b>Recorded Timings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_OPERATION__RECORDED_TIMINGS = FUZZ_TESTING_OPERATION__RECORDED_TIMINGS;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_OPERATION__SEED = FUZZ_TESTING_OPERATION__SEED;

	/**
	 * The feature id for the '<em><b>Sequence Num In Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_OPERATION__SEQUENCE_NUM_IN_TEST = FUZZ_TESTING_OPERATION__SEQUENCE_NUM_IN_TEST;

	/**
	 * The feature id for the '<em><b>Property To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_OPERATION__PROPERTY_TO_AFFECT = FUZZ_TESTING_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Property Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_OPERATION_FEATURE_COUNT = FUZZ_TESTING_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component Property Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_OPERATION_OPERATION_COUNT = FUZZ_TESTING_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.ComponentSubPropertyOperationImpl <em>Component Sub Property Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.ComponentSubPropertyOperationImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getComponentSubPropertyOperation()
	 * @generated
	 */
	int COMPONENT_SUB_PROPERTY_OPERATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_PROPERTY_OPERATION__NAME = FUZZ_TESTING_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_PROPERTY_OPERATION__PRIORITY = FUZZ_TESTING_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_PROPERTY_OPERATION__ACTIVATION = FUZZ_TESTING_OPERATION__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Variable To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_PROPERTY_OPERATION__VARIABLE_TO_AFFECT = FUZZ_TESTING_OPERATION__VARIABLE_TO_AFFECT;

	/**
	 * The feature id for the '<em><b>Messages From All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_PROPERTY_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = FUZZ_TESTING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>From Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_PROPERTY_OPERATION__FROM_NODES = FUZZ_TESTING_OPERATION__FROM_NODES;

	/**
	 * The feature id for the '<em><b>Messages To All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_PROPERTY_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = FUZZ_TESTING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>To Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_PROPERTY_OPERATION__TO_NODES = FUZZ_TESTING_OPERATION__TO_NODES;

	/**
	 * The feature id for the '<em><b>Node To Fuzz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_PROPERTY_OPERATION__NODE_TO_FUZZ = FUZZ_TESTING_OPERATION__NODE_TO_FUZZ;

	/**
	 * The feature id for the '<em><b>All Publishing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_PROPERTY_OPERATION__ALL_PUBLISHING_VARS = FUZZ_TESTING_OPERATION__ALL_PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>Publishing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_PROPERTY_OPERATION__PUBLISHING_VARS = FUZZ_TESTING_OPERATION__PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>All Subscribing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_PROPERTY_OPERATION__ALL_SUBSCRIBING_VARS = FUZZ_TESTING_OPERATION__ALL_SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>Subscribing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_PROPERTY_OPERATION__SUBSCRIBING_VARS = FUZZ_TESTING_OPERATION__SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_PROPERTY_OPERATION__FROM_TEMPLATE = FUZZ_TESTING_OPERATION__FROM_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Containing Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_PROPERTY_OPERATION__CONTAINING_TEST = FUZZ_TESTING_OPERATION__CONTAINING_TEST;

	/**
	 * The feature id for the '<em><b>Recorded Timings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_PROPERTY_OPERATION__RECORDED_TIMINGS = FUZZ_TESTING_OPERATION__RECORDED_TIMINGS;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_PROPERTY_OPERATION__SEED = FUZZ_TESTING_OPERATION__SEED;

	/**
	 * The feature id for the '<em><b>Sequence Num In Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_PROPERTY_OPERATION__SEQUENCE_NUM_IN_TEST = FUZZ_TESTING_OPERATION__SEQUENCE_NUM_IN_TEST;

	/**
	 * The feature id for the '<em><b>Property To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_PROPERTY_OPERATION__PROPERTY_TO_AFFECT = FUZZ_TESTING_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_PROPERTY_OPERATION__SUB_PROPERTY = FUZZ_TESTING_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component Sub Property Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_PROPERTY_OPERATION_FEATURE_COUNT = FUZZ_TESTING_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Component Sub Property Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_SUB_PROPERTY_OPERATION_OPERATION_COUNT = FUZZ_TESTING_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.VariableOperationImpl <em>Variable Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.VariableOperationImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getVariableOperation()
	 * @generated
	 */
	int VARIABLE_OPERATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__NAME = FUZZ_TESTING_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__PRIORITY = FUZZ_TESTING_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__ACTIVATION = FUZZ_TESTING_OPERATION__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Variable To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__VARIABLE_TO_AFFECT = FUZZ_TESTING_OPERATION__VARIABLE_TO_AFFECT;

	/**
	 * The feature id for the '<em><b>Messages From All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = FUZZ_TESTING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>From Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__FROM_NODES = FUZZ_TESTING_OPERATION__FROM_NODES;

	/**
	 * The feature id for the '<em><b>Messages To All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = FUZZ_TESTING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>To Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__TO_NODES = FUZZ_TESTING_OPERATION__TO_NODES;

	/**
	 * The feature id for the '<em><b>Node To Fuzz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__NODE_TO_FUZZ = FUZZ_TESTING_OPERATION__NODE_TO_FUZZ;

	/**
	 * The feature id for the '<em><b>All Publishing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__ALL_PUBLISHING_VARS = FUZZ_TESTING_OPERATION__ALL_PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>Publishing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__PUBLISHING_VARS = FUZZ_TESTING_OPERATION__PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>All Subscribing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__ALL_SUBSCRIBING_VARS = FUZZ_TESTING_OPERATION__ALL_SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>Subscribing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__SUBSCRIBING_VARS = FUZZ_TESTING_OPERATION__SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__FROM_TEMPLATE = FUZZ_TESTING_OPERATION__FROM_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Containing Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__CONTAINING_TEST = FUZZ_TESTING_OPERATION__CONTAINING_TEST;

	/**
	 * The feature id for the '<em><b>Recorded Timings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__RECORDED_TIMINGS = FUZZ_TESTING_OPERATION__RECORDED_TIMINGS;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__SEED = FUZZ_TESTING_OPERATION__SEED;

	/**
	 * The feature id for the '<em><b>Sequence Num In Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__SEQUENCE_NUM_IN_TEST = FUZZ_TESTING_OPERATION__SEQUENCE_NUM_IN_TEST;

	/**
	 * The feature id for the '<em><b>Sub Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION__SUB_PARAMETERS = FUZZ_TESTING_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_FEATURE_COUNT = FUZZ_TESTING_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_OPERATION_COUNT = FUZZ_TESTING_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.RandomValueFuzzingOperationImpl <em>Random Value Fuzzing Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.RandomValueFuzzingOperationImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getRandomValueFuzzingOperation()
	 * @generated
	 */
	int RANDOM_VALUE_FUZZING_OPERATION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__NAME = COMPONENT_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__PRIORITY = COMPONENT_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__ACTIVATION = COMPONENT_OPERATION__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Variable To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__VARIABLE_TO_AFFECT = COMPONENT_OPERATION__VARIABLE_TO_AFFECT;

	/**
	 * The feature id for the '<em><b>Messages From All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = COMPONENT_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>From Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__FROM_NODES = COMPONENT_OPERATION__FROM_NODES;

	/**
	 * The feature id for the '<em><b>Messages To All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = COMPONENT_OPERATION__MESSAGES_TO_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>To Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__TO_NODES = COMPONENT_OPERATION__TO_NODES;

	/**
	 * The feature id for the '<em><b>Node To Fuzz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__NODE_TO_FUZZ = COMPONENT_OPERATION__NODE_TO_FUZZ;

	/**
	 * The feature id for the '<em><b>All Publishing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__ALL_PUBLISHING_VARS = COMPONENT_OPERATION__ALL_PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>Publishing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__PUBLISHING_VARS = COMPONENT_OPERATION__PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>All Subscribing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__ALL_SUBSCRIBING_VARS = COMPONENT_OPERATION__ALL_SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>Subscribing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__SUBSCRIBING_VARS = COMPONENT_OPERATION__SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__FROM_TEMPLATE = COMPONENT_OPERATION__FROM_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Containing Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__CONTAINING_TEST = COMPONENT_OPERATION__CONTAINING_TEST;

	/**
	 * The feature id for the '<em><b>Recorded Timings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__RECORDED_TIMINGS = COMPONENT_OPERATION__RECORDED_TIMINGS;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__SEED = COMPONENT_OPERATION__SEED;

	/**
	 * The feature id for the '<em><b>Sequence Num In Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST = COMPONENT_OPERATION__SEQUENCE_NUM_IN_TEST;

	/**
	 * The number of structural features of the '<em>Random Value Fuzzing Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION_FEATURE_COUNT = COMPONENT_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Random Value Fuzzing Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FUZZING_OPERATION_OPERATION_COUNT = COMPONENT_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.RandomValueFromSetOperationImpl <em>Random Value From Set Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.RandomValueFromSetOperationImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getRandomValueFromSetOperation()
	 * @generated
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__NAME = RANDOM_VALUE_FUZZING_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__PRIORITY = RANDOM_VALUE_FUZZING_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__ACTIVATION = RANDOM_VALUE_FUZZING_OPERATION__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Variable To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__VARIABLE_TO_AFFECT = RANDOM_VALUE_FUZZING_OPERATION__VARIABLE_TO_AFFECT;

	/**
	 * The feature id for the '<em><b>Messages From All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = RANDOM_VALUE_FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>From Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__FROM_NODES = RANDOM_VALUE_FUZZING_OPERATION__FROM_NODES;

	/**
	 * The feature id for the '<em><b>Messages To All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = RANDOM_VALUE_FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>To Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__TO_NODES = RANDOM_VALUE_FUZZING_OPERATION__TO_NODES;

	/**
	 * The feature id for the '<em><b>Node To Fuzz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__NODE_TO_FUZZ = RANDOM_VALUE_FUZZING_OPERATION__NODE_TO_FUZZ;

	/**
	 * The feature id for the '<em><b>All Publishing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__ALL_PUBLISHING_VARS = RANDOM_VALUE_FUZZING_OPERATION__ALL_PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>Publishing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__PUBLISHING_VARS = RANDOM_VALUE_FUZZING_OPERATION__PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>All Subscribing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__ALL_SUBSCRIBING_VARS = RANDOM_VALUE_FUZZING_OPERATION__ALL_SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>Subscribing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__SUBSCRIBING_VARS = RANDOM_VALUE_FUZZING_OPERATION__SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__FROM_TEMPLATE = RANDOM_VALUE_FUZZING_OPERATION__FROM_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Containing Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__CONTAINING_TEST = RANDOM_VALUE_FUZZING_OPERATION__CONTAINING_TEST;

	/**
	 * The feature id for the '<em><b>Recorded Timings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__RECORDED_TIMINGS = RANDOM_VALUE_FUZZING_OPERATION__RECORDED_TIMINGS;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__SEED = RANDOM_VALUE_FUZZING_OPERATION__SEED;

	/**
	 * The feature id for the '<em><b>Sequence Num In Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__SEQUENCE_NUM_IN_TEST = RANDOM_VALUE_FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST;

	/**
	 * The feature id for the '<em><b>Value Set</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__VALUE_SET = RANDOM_VALUE_FUZZING_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Relative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION__IS_RELATIVE = RANDOM_VALUE_FUZZING_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Random Value From Set Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION_FEATURE_COUNT = RANDOM_VALUE_FUZZING_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Random Value From Set Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FROM_SET_OPERATION_OPERATION_COUNT = RANDOM_VALUE_FUZZING_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.ValueSetImpl <em>Value Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.ValueSetImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getValueSet()
	 * @generated
	 */
	int VALUE_SET = 15;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET__PROPERTY_NAME = 0;

	/**
	 * The number of structural features of the '<em>Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.ValueRangeImpl <em>Value Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.ValueRangeImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getValueRange()
	 * @generated
	 */
	int VALUE_RANGE = 16;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE__PROPERTY_NAME = VALUE_SET__PROPERTY_NAME;

	/**
	 * The number of structural features of the '<em>Value Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_FEATURE_COUNT = VALUE_SET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Value Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_RANGE_OPERATION_COUNT = VALUE_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.IntRangeImpl <em>Int Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.IntRangeImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getIntRange()
	 * @generated
	 */
	int INT_RANGE = 17;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_RANGE__PROPERTY_NAME = VALUE_RANGE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_RANGE__LOWER_BOUND = VALUE_RANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_RANGE__UPPER_BOUND = VALUE_RANGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Int Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_RANGE_FEATURE_COUNT = VALUE_RANGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Int Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_RANGE_OPERATION_COUNT = VALUE_RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.DoubleRangeImpl <em>Double Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.DoubleRangeImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getDoubleRange()
	 * @generated
	 */
	int DOUBLE_RANGE = 18;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_RANGE__PROPERTY_NAME = VALUE_RANGE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_RANGE__LOWER_BOUND = VALUE_RANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_RANGE__UPPER_BOUND = VALUE_RANGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Double Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_RANGE_FEATURE_COUNT = VALUE_RANGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Double Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_RANGE_OPERATION_COUNT = VALUE_RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.PointImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 19;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Z = 2;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.PointRangeImpl <em>Point Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.PointRangeImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getPointRange()
	 * @generated
	 */
	int POINT_RANGE = 20;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_RANGE__PROPERTY_NAME = VALUE_RANGE__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Min Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_RANGE__MIN_POINT = VALUE_RANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_RANGE__MAX_POINT = VALUE_RANGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Point Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_RANGE_FEATURE_COUNT = VALUE_RANGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Point Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_RANGE_OPERATION_COUNT = VALUE_RANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.StringSetImpl <em>String Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.StringSetImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getStringSet()
	 * @generated
	 */
	int STRING_SET = 21;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SET__PROPERTY_NAME = VALUE_SET__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Choices</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SET__CHOICES = VALUE_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SET_FEATURE_COUNT = VALUE_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SET_OPERATION_COUNT = VALUE_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.ExternalResourceSetImpl <em>External Resource Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.ExternalResourceSetImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getExternalResourceSet()
	 * @generated
	 */
	int EXTERNAL_RESOURCE_SET = 22;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RESOURCE_SET__PROPERTY_NAME = VALUE_SET__PROPERTY_NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RESOURCE_SET__LOCATION = VALUE_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Resource Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RESOURCE_SET_FEATURE_COUNT = VALUE_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>External Resource Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_RESOURCE_SET_OPERATION_COUNT = VALUE_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.NetworkFuzzingOperationImpl <em>Network Fuzzing Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.NetworkFuzzingOperationImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getNetworkFuzzingOperation()
	 * @generated
	 */
	int NETWORK_FUZZING_OPERATION = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__NAME = FUZZING_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__PRIORITY = FUZZING_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__ACTIVATION = FUZZING_OPERATION__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Variable To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__VARIABLE_TO_AFFECT = FUZZING_OPERATION__VARIABLE_TO_AFFECT;

	/**
	 * The feature id for the '<em><b>Messages From All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>From Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__FROM_NODES = FUZZING_OPERATION__FROM_NODES;

	/**
	 * The feature id for the '<em><b>Messages To All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>To Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__TO_NODES = FUZZING_OPERATION__TO_NODES;

	/**
	 * The feature id for the '<em><b>Node To Fuzz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__NODE_TO_FUZZ = FUZZING_OPERATION__NODE_TO_FUZZ;

	/**
	 * The feature id for the '<em><b>All Publishing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__ALL_PUBLISHING_VARS = FUZZING_OPERATION__ALL_PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>Publishing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__PUBLISHING_VARS = FUZZING_OPERATION__PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>All Subscribing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__ALL_SUBSCRIBING_VARS = FUZZING_OPERATION__ALL_SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>Subscribing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__SUBSCRIBING_VARS = FUZZING_OPERATION__SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__FROM_TEMPLATE = FUZZING_OPERATION__FROM_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Containing Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__CONTAINING_TEST = FUZZING_OPERATION__CONTAINING_TEST;

	/**
	 * The feature id for the '<em><b>Recorded Timings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__RECORDED_TIMINGS = FUZZING_OPERATION__RECORDED_TIMINGS;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__SEED = FUZZING_OPERATION__SEED;

	/**
	 * The feature id for the '<em><b>Sequence Num In Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST = FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST;

	/**
	 * The number of structural features of the '<em>Network Fuzzing Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION_FEATURE_COUNT = FUZZING_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Network Fuzzing Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FUZZING_OPERATION_OPERATION_COUNT = FUZZING_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.BlackholeNetworkOperationImpl <em>Blackhole Network Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.BlackholeNetworkOperationImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getBlackholeNetworkOperation()
	 * @generated
	 */
	int BLACKHOLE_NETWORK_OPERATION = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__NAME = NETWORK_FUZZING_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__PRIORITY = NETWORK_FUZZING_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__ACTIVATION = NETWORK_FUZZING_OPERATION__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Variable To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__VARIABLE_TO_AFFECT = NETWORK_FUZZING_OPERATION__VARIABLE_TO_AFFECT;

	/**
	 * The feature id for the '<em><b>Messages From All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = NETWORK_FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>From Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__FROM_NODES = NETWORK_FUZZING_OPERATION__FROM_NODES;

	/**
	 * The feature id for the '<em><b>Messages To All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = NETWORK_FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>To Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__TO_NODES = NETWORK_FUZZING_OPERATION__TO_NODES;

	/**
	 * The feature id for the '<em><b>Node To Fuzz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__NODE_TO_FUZZ = NETWORK_FUZZING_OPERATION__NODE_TO_FUZZ;

	/**
	 * The feature id for the '<em><b>All Publishing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__ALL_PUBLISHING_VARS = NETWORK_FUZZING_OPERATION__ALL_PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>Publishing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__PUBLISHING_VARS = NETWORK_FUZZING_OPERATION__PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>All Subscribing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__ALL_SUBSCRIBING_VARS = NETWORK_FUZZING_OPERATION__ALL_SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>Subscribing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__SUBSCRIBING_VARS = NETWORK_FUZZING_OPERATION__SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__FROM_TEMPLATE = NETWORK_FUZZING_OPERATION__FROM_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Containing Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__CONTAINING_TEST = NETWORK_FUZZING_OPERATION__CONTAINING_TEST;

	/**
	 * The feature id for the '<em><b>Recorded Timings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__RECORDED_TIMINGS = NETWORK_FUZZING_OPERATION__RECORDED_TIMINGS;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__SEED = NETWORK_FUZZING_OPERATION__SEED;

	/**
	 * The feature id for the '<em><b>Sequence Num In Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION__SEQUENCE_NUM_IN_TEST = NETWORK_FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST;

	/**
	 * The number of structural features of the '<em>Blackhole Network Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION_FEATURE_COUNT = NETWORK_FUZZING_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Blackhole Network Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLACKHOLE_NETWORK_OPERATION_OPERATION_COUNT = NETWORK_FUZZING_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.LatencyNetworkOperationImpl <em>Latency Network Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.LatencyNetworkOperationImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getLatencyNetworkOperation()
	 * @generated
	 */
	int LATENCY_NETWORK_OPERATION = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__NAME = NETWORK_FUZZING_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__PRIORITY = NETWORK_FUZZING_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__ACTIVATION = NETWORK_FUZZING_OPERATION__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Variable To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__VARIABLE_TO_AFFECT = NETWORK_FUZZING_OPERATION__VARIABLE_TO_AFFECT;

	/**
	 * The feature id for the '<em><b>Messages From All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = NETWORK_FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>From Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__FROM_NODES = NETWORK_FUZZING_OPERATION__FROM_NODES;

	/**
	 * The feature id for the '<em><b>Messages To All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = NETWORK_FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>To Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__TO_NODES = NETWORK_FUZZING_OPERATION__TO_NODES;

	/**
	 * The feature id for the '<em><b>Node To Fuzz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__NODE_TO_FUZZ = NETWORK_FUZZING_OPERATION__NODE_TO_FUZZ;

	/**
	 * The feature id for the '<em><b>All Publishing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__ALL_PUBLISHING_VARS = NETWORK_FUZZING_OPERATION__ALL_PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>Publishing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__PUBLISHING_VARS = NETWORK_FUZZING_OPERATION__PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>All Subscribing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__ALL_SUBSCRIBING_VARS = NETWORK_FUZZING_OPERATION__ALL_SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>Subscribing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__SUBSCRIBING_VARS = NETWORK_FUZZING_OPERATION__SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__FROM_TEMPLATE = NETWORK_FUZZING_OPERATION__FROM_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Containing Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__CONTAINING_TEST = NETWORK_FUZZING_OPERATION__CONTAINING_TEST;

	/**
	 * The feature id for the '<em><b>Recorded Timings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__RECORDED_TIMINGS = NETWORK_FUZZING_OPERATION__RECORDED_TIMINGS;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__SEED = NETWORK_FUZZING_OPERATION__SEED;

	/**
	 * The feature id for the '<em><b>Sequence Num In Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__SEQUENCE_NUM_IN_TEST = NETWORK_FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION__LATENCY = NETWORK_FUZZING_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Latency Network Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION_FEATURE_COUNT = NETWORK_FUZZING_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Latency Network Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LATENCY_NETWORK_OPERATION_OPERATION_COUNT = NETWORK_FUZZING_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.impl.PacketLossNetworkOperationImpl <em>Packet Loss Network Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.impl.PacketLossNetworkOperationImpl
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getPacketLossNetworkOperation()
	 * @generated
	 */
	int PACKET_LOSS_NETWORK_OPERATION = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__NAME = NETWORK_FUZZING_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__PRIORITY = NETWORK_FUZZING_OPERATION__PRIORITY;

	/**
	 * The feature id for the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__ACTIVATION = NETWORK_FUZZING_OPERATION__ACTIVATION;

	/**
	 * The feature id for the '<em><b>Variable To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__VARIABLE_TO_AFFECT = NETWORK_FUZZING_OPERATION__VARIABLE_TO_AFFECT;

	/**
	 * The feature id for the '<em><b>Messages From All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = NETWORK_FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>From Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__FROM_NODES = NETWORK_FUZZING_OPERATION__FROM_NODES;

	/**
	 * The feature id for the '<em><b>Messages To All Componenents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = NETWORK_FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS;

	/**
	 * The feature id for the '<em><b>To Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__TO_NODES = NETWORK_FUZZING_OPERATION__TO_NODES;

	/**
	 * The feature id for the '<em><b>Node To Fuzz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__NODE_TO_FUZZ = NETWORK_FUZZING_OPERATION__NODE_TO_FUZZ;

	/**
	 * The feature id for the '<em><b>All Publishing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__ALL_PUBLISHING_VARS = NETWORK_FUZZING_OPERATION__ALL_PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>Publishing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__PUBLISHING_VARS = NETWORK_FUZZING_OPERATION__PUBLISHING_VARS;

	/**
	 * The feature id for the '<em><b>All Subscribing Vars</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__ALL_SUBSCRIBING_VARS = NETWORK_FUZZING_OPERATION__ALL_SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>Subscribing Vars</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__SUBSCRIBING_VARS = NETWORK_FUZZING_OPERATION__SUBSCRIBING_VARS;

	/**
	 * The feature id for the '<em><b>From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__FROM_TEMPLATE = NETWORK_FUZZING_OPERATION__FROM_TEMPLATE;

	/**
	 * The feature id for the '<em><b>Containing Test</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__CONTAINING_TEST = NETWORK_FUZZING_OPERATION__CONTAINING_TEST;

	/**
	 * The feature id for the '<em><b>Recorded Timings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__RECORDED_TIMINGS = NETWORK_FUZZING_OPERATION__RECORDED_TIMINGS;

	/**
	 * The feature id for the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__SEED = NETWORK_FUZZING_OPERATION__SEED;

	/**
	 * The feature id for the '<em><b>Sequence Num In Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__SEQUENCE_NUM_IN_TEST = NETWORK_FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION__FREQUENCY = NETWORK_FUZZING_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Packet Loss Network Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION_FEATURE_COUNT = NETWORK_FUZZING_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Packet Loss Network Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKET_LOSS_NETWORK_OPERATION_OPERATION_COUNT = NETWORK_FUZZING_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.FuzzingOperations.OfflineOperationTime <em>Offline Operation Time</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.FuzzingOperations.OfflineOperationTime
	 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getOfflineOperationTime()
	 * @generated
	 */
	int OFFLINE_OPERATION_TIME = 27;


	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.FuzzingOperation <em>Fuzzing Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuzzing Operation</em>'.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperation
	 * @generated
	 */
	EClass getFuzzingOperation();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.FuzzingOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperation#getName()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EAttribute getFuzzingOperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.FuzzingOperation#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperation#getPriority()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EAttribute getFuzzingOperation_Priority();

	/**
	 * Returns the meta object for the containment reference '{@link TestingPackage.FuzzingOperations.FuzzingOperation#getActivation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activation</em>'.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperation#getActivation()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EReference getFuzzingOperation_Activation();

	/**
	 * Returns the meta object for the reference '{@link TestingPackage.FuzzingOperations.FuzzingOperation#getVariableToAffect <em>Variable To Affect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable To Affect</em>'.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperation#getVariableToAffect()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EReference getFuzzingOperation_VariableToAffect();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.FuzzingOperation#isMessagesFromAllComponenents <em>Messages From All Componenents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Messages From All Componenents</em>'.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperation#isMessagesFromAllComponenents()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EAttribute getFuzzingOperation_MessagesFromAllComponenents();

	/**
	 * Returns the meta object for the reference list '{@link TestingPackage.FuzzingOperations.FuzzingOperation#getFromNodes <em>From Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Nodes</em>'.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperation#getFromNodes()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EReference getFuzzingOperation_FromNodes();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.FuzzingOperation#isMessagesToAllComponenents <em>Messages To All Componenents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Messages To All Componenents</em>'.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperation#isMessagesToAllComponenents()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EAttribute getFuzzingOperation_MessagesToAllComponenents();

	/**
	 * Returns the meta object for the reference list '{@link TestingPackage.FuzzingOperations.FuzzingOperation#getToNodes <em>To Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Nodes</em>'.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperation#getToNodes()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EReference getFuzzingOperation_ToNodes();

	/**
	 * Returns the meta object for the reference '{@link TestingPackage.FuzzingOperations.FuzzingOperation#getNodeToFuzz <em>Node To Fuzz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node To Fuzz</em>'.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperation#getNodeToFuzz()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EReference getFuzzingOperation_NodeToFuzz();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.FuzzingOperation#isAllPublishingVars <em>All Publishing Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Publishing Vars</em>'.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperation#isAllPublishingVars()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EAttribute getFuzzingOperation_AllPublishingVars();

	/**
	 * Returns the meta object for the reference list '{@link TestingPackage.FuzzingOperations.FuzzingOperation#getPublishingVars <em>Publishing Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Publishing Vars</em>'.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperation#getPublishingVars()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EReference getFuzzingOperation_PublishingVars();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.FuzzingOperation#isAllSubscribingVars <em>All Subscribing Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Subscribing Vars</em>'.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperation#isAllSubscribingVars()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EAttribute getFuzzingOperation_AllSubscribingVars();

	/**
	 * Returns the meta object for the reference list '{@link TestingPackage.FuzzingOperations.FuzzingOperation#getSubscribingVars <em>Subscribing Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subscribing Vars</em>'.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperation#getSubscribingVars()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EReference getFuzzingOperation_SubscribingVars();

	/**
	 * Returns the meta object for the reference '{@link TestingPackage.FuzzingOperations.FuzzingOperation#getFromTemplate <em>From Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Template</em>'.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperation#getFromTemplate()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EReference getFuzzingOperation_FromTemplate();

	/**
	 * Returns the meta object for the container reference '{@link TestingPackage.FuzzingOperations.FuzzingOperation#getContainingTest <em>Containing Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Containing Test</em>'.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperation#getContainingTest()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EReference getFuzzingOperation_ContainingTest();

	/**
	 * Returns the meta object for the containment reference '{@link TestingPackage.FuzzingOperations.FuzzingOperation#getRecordedTimings <em>Recorded Timings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Recorded Timings</em>'.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperation#getRecordedTimings()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EReference getFuzzingOperation_RecordedTimings();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.FuzzingOperation#getSeed <em>Seed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seed</em>'.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperation#getSeed()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EAttribute getFuzzingOperation_Seed();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.FuzzingOperation#getSequenceNumInTest <em>Sequence Num In Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sequence Num In Test</em>'.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperation#getSequenceNumInTest()
	 * @see #getFuzzingOperation()
	 * @generated
	 */
	EAttribute getFuzzingOperation_SequenceNumInTest();

	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.OfflineFuzzingOperation <em>Offline Fuzzing Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Offline Fuzzing Operation</em>'.
	 * @see TestingPackage.FuzzingOperations.OfflineFuzzingOperation
	 * @generated
	 */
	EClass getOfflineFuzzingOperation();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.OfflineFuzzingOperation#getOperationTime <em>Operation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Time</em>'.
	 * @see TestingPackage.FuzzingOperations.OfflineFuzzingOperation#getOperationTime()
	 * @see #getOfflineFuzzingOperation()
	 * @generated
	 */
	EAttribute getOfflineFuzzingOperation_OperationTime();

	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.CustomFuzzingOperation <em>Custom Fuzzing Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Fuzzing Operation</em>'.
	 * @see TestingPackage.FuzzingOperations.CustomFuzzingOperation
	 * @generated
	 */
	EClass getCustomFuzzingOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link TestingPackage.FuzzingOperations.CustomFuzzingOperation#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see TestingPackage.FuzzingOperations.CustomFuzzingOperation#getParams()
	 * @see #getCustomFuzzingOperation()
	 * @generated
	 */
	EReference getCustomFuzzingOperation_Params();

	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.CustomOfflineFuzzingOperation <em>Custom Offline Fuzzing Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Offline Fuzzing Operation</em>'.
	 * @see TestingPackage.FuzzingOperations.CustomOfflineFuzzingOperation
	 * @generated
	 */
	EClass getCustomOfflineFuzzingOperation();

	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.Activation <em>Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activation</em>'.
	 * @see TestingPackage.FuzzingOperations.Activation
	 * @generated
	 */
	EClass getActivation();

	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.FixedTimeActivation <em>Fixed Time Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fixed Time Activation</em>'.
	 * @see TestingPackage.FuzzingOperations.FixedTimeActivation
	 * @generated
	 */
	EClass getFixedTimeActivation();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.FixedTimeActivation#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see TestingPackage.FuzzingOperations.FixedTimeActivation#getStartTime()
	 * @see #getFixedTimeActivation()
	 * @generated
	 */
	EAttribute getFixedTimeActivation_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.FixedTimeActivation#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see TestingPackage.FuzzingOperations.FixedTimeActivation#getEndTime()
	 * @see #getFixedTimeActivation()
	 * @generated
	 */
	EAttribute getFixedTimeActivation_EndTime();

	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.ConditionBasedActivation <em>Condition Based Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Based Activation</em>'.
	 * @see TestingPackage.FuzzingOperations.ConditionBasedActivation
	 * @generated
	 */
	EClass getConditionBasedActivation();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.ConditionBasedActivation#getMaximumActivations <em>Maximum Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Activations</em>'.
	 * @see TestingPackage.FuzzingOperations.ConditionBasedActivation#getMaximumActivations()
	 * @see #getConditionBasedActivation()
	 * @generated
	 */
	EAttribute getConditionBasedActivation_MaximumActivations();

	/**
	 * Returns the meta object for the containment reference '{@link TestingPackage.FuzzingOperations.ConditionBasedActivation#getStarting <em>Starting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Starting</em>'.
	 * @see TestingPackage.FuzzingOperations.ConditionBasedActivation#getStarting()
	 * @see #getConditionBasedActivation()
	 * @generated
	 */
	EReference getConditionBasedActivation_Starting();

	/**
	 * Returns the meta object for the containment reference '{@link TestingPackage.FuzzingOperations.ConditionBasedActivation#getEnding <em>Ending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ending</em>'.
	 * @see TestingPackage.FuzzingOperations.ConditionBasedActivation#getEnding()
	 * @see #getConditionBasedActivation()
	 * @generated
	 */
	EReference getConditionBasedActivation_Ending();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.ConditionBasedActivation#getStartingExpression <em>Starting Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Starting Expression</em>'.
	 * @see TestingPackage.FuzzingOperations.ConditionBasedActivation#getStartingExpression()
	 * @see #getConditionBasedActivation()
	 * @generated
	 */
	EAttribute getConditionBasedActivation_StartingExpression();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.ConditionBasedActivation#getEndingExpression <em>Ending Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ending Expression</em>'.
	 * @see TestingPackage.FuzzingOperations.ConditionBasedActivation#getEndingExpression()
	 * @see #getConditionBasedActivation()
	 * @generated
	 */
	EAttribute getConditionBasedActivation_EndingExpression();

	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.ConditionBasedTimeLimited <em>Condition Based Time Limited</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Based Time Limited</em>'.
	 * @see TestingPackage.FuzzingOperations.ConditionBasedTimeLimited
	 * @generated
	 */
	EClass getConditionBasedTimeLimited();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getLength()
	 * @see #getConditionBasedTimeLimited()
	 * @generated
	 */
	EAttribute getConditionBasedTimeLimited_Length();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getMaximumActivations <em>Maximum Activations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Activations</em>'.
	 * @see TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getMaximumActivations()
	 * @see #getConditionBasedTimeLimited()
	 * @generated
	 */
	EAttribute getConditionBasedTimeLimited_MaximumActivations();

	/**
	 * Returns the meta object for the containment reference '{@link TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getStarting <em>Starting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Starting</em>'.
	 * @see TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getStarting()
	 * @see #getConditionBasedTimeLimited()
	 * @generated
	 */
	EReference getConditionBasedTimeLimited_Starting();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getStartingExpression <em>Starting Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Starting Expression</em>'.
	 * @see TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getStartingExpression()
	 * @see #getConditionBasedTimeLimited()
	 * @generated
	 */
	EAttribute getConditionBasedTimeLimited_StartingExpression();

	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.FuzzTestingOperation <em>Fuzz Testing Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuzz Testing Operation</em>'.
	 * @see TestingPackage.FuzzingOperations.FuzzTestingOperation
	 * @generated
	 */
	EClass getFuzzTestingOperation();

	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.ComponentOperation <em>Component Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Operation</em>'.
	 * @see TestingPackage.FuzzingOperations.ComponentOperation
	 * @generated
	 */
	EClass getComponentOperation();

	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.ComponentPropertyOperation <em>Component Property Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Property Operation</em>'.
	 * @see TestingPackage.FuzzingOperations.ComponentPropertyOperation
	 * @generated
	 */
	EClass getComponentPropertyOperation();

	/**
	 * Returns the meta object for the reference '{@link TestingPackage.FuzzingOperations.ComponentPropertyOperation#getPropertyToAffect <em>Property To Affect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property To Affect</em>'.
	 * @see TestingPackage.FuzzingOperations.ComponentPropertyOperation#getPropertyToAffect()
	 * @see #getComponentPropertyOperation()
	 * @generated
	 */
	EReference getComponentPropertyOperation_PropertyToAffect();

	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.ComponentSubPropertyOperation <em>Component Sub Property Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Sub Property Operation</em>'.
	 * @see TestingPackage.FuzzingOperations.ComponentSubPropertyOperation
	 * @generated
	 */
	EClass getComponentSubPropertyOperation();

	/**
	 * Returns the meta object for the reference '{@link TestingPackage.FuzzingOperations.ComponentSubPropertyOperation#getPropertyToAffect <em>Property To Affect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property To Affect</em>'.
	 * @see TestingPackage.FuzzingOperations.ComponentSubPropertyOperation#getPropertyToAffect()
	 * @see #getComponentSubPropertyOperation()
	 * @generated
	 */
	EReference getComponentSubPropertyOperation_PropertyToAffect();

	/**
	 * Returns the meta object for the reference '{@link TestingPackage.FuzzingOperations.ComponentSubPropertyOperation#getSubProperty <em>Sub Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Property</em>'.
	 * @see TestingPackage.FuzzingOperations.ComponentSubPropertyOperation#getSubProperty()
	 * @see #getComponentSubPropertyOperation()
	 * @generated
	 */
	EReference getComponentSubPropertyOperation_SubProperty();

	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.VariableOperation <em>Variable Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Operation</em>'.
	 * @see TestingPackage.FuzzingOperations.VariableOperation
	 * @generated
	 */
	EClass getVariableOperation();

	/**
	 * Returns the meta object for the reference list '{@link TestingPackage.FuzzingOperations.VariableOperation#getSubParameters <em>Sub Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Parameters</em>'.
	 * @see TestingPackage.FuzzingOperations.VariableOperation#getSubParameters()
	 * @see #getVariableOperation()
	 * @generated
	 */
	EReference getVariableOperation_SubParameters();

	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.RandomValueFuzzingOperation <em>Random Value Fuzzing Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random Value Fuzzing Operation</em>'.
	 * @see TestingPackage.FuzzingOperations.RandomValueFuzzingOperation
	 * @generated
	 */
	EClass getRandomValueFuzzingOperation();

	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.RandomValueFromSetOperation <em>Random Value From Set Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random Value From Set Operation</em>'.
	 * @see TestingPackage.FuzzingOperations.RandomValueFromSetOperation
	 * @generated
	 */
	EClass getRandomValueFromSetOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link TestingPackage.FuzzingOperations.RandomValueFromSetOperation#getValueSet <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Set</em>'.
	 * @see TestingPackage.FuzzingOperations.RandomValueFromSetOperation#getValueSet()
	 * @see #getRandomValueFromSetOperation()
	 * @generated
	 */
	EReference getRandomValueFromSetOperation_ValueSet();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.RandomValueFromSetOperation#isIsRelative <em>Is Relative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Relative</em>'.
	 * @see TestingPackage.FuzzingOperations.RandomValueFromSetOperation#isIsRelative()
	 * @see #getRandomValueFromSetOperation()
	 * @generated
	 */
	EAttribute getRandomValueFromSetOperation_IsRelative();

	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.ValueSet <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Set</em>'.
	 * @see TestingPackage.FuzzingOperations.ValueSet
	 * @generated
	 */
	EClass getValueSet();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.ValueSet#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see TestingPackage.FuzzingOperations.ValueSet#getPropertyName()
	 * @see #getValueSet()
	 * @generated
	 */
	EAttribute getValueSet_PropertyName();

	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.ValueRange <em>Value Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Range</em>'.
	 * @see TestingPackage.FuzzingOperations.ValueRange
	 * @generated
	 */
	EClass getValueRange();

	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.IntRange <em>Int Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Range</em>'.
	 * @see TestingPackage.FuzzingOperations.IntRange
	 * @generated
	 */
	EClass getIntRange();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.IntRange#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see TestingPackage.FuzzingOperations.IntRange#getLowerBound()
	 * @see #getIntRange()
	 * @generated
	 */
	EAttribute getIntRange_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.IntRange#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see TestingPackage.FuzzingOperations.IntRange#getUpperBound()
	 * @see #getIntRange()
	 * @generated
	 */
	EAttribute getIntRange_UpperBound();

	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.DoubleRange <em>Double Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Double Range</em>'.
	 * @see TestingPackage.FuzzingOperations.DoubleRange
	 * @generated
	 */
	EClass getDoubleRange();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.DoubleRange#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see TestingPackage.FuzzingOperations.DoubleRange#getLowerBound()
	 * @see #getDoubleRange()
	 * @generated
	 */
	EAttribute getDoubleRange_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.DoubleRange#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see TestingPackage.FuzzingOperations.DoubleRange#getUpperBound()
	 * @see #getDoubleRange()
	 * @generated
	 */
	EAttribute getDoubleRange_UpperBound();

	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see TestingPackage.FuzzingOperations.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see TestingPackage.FuzzingOperations.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see TestingPackage.FuzzingOperations.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.Point#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see TestingPackage.FuzzingOperations.Point#getZ()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Z();

	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.PointRange <em>Point Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Range</em>'.
	 * @see TestingPackage.FuzzingOperations.PointRange
	 * @generated
	 */
	EClass getPointRange();

	/**
	 * Returns the meta object for the containment reference '{@link TestingPackage.FuzzingOperations.PointRange#getMinPoint <em>Min Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Min Point</em>'.
	 * @see TestingPackage.FuzzingOperations.PointRange#getMinPoint()
	 * @see #getPointRange()
	 * @generated
	 */
	EReference getPointRange_MinPoint();

	/**
	 * Returns the meta object for the containment reference '{@link TestingPackage.FuzzingOperations.PointRange#getMaxPoint <em>Max Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Max Point</em>'.
	 * @see TestingPackage.FuzzingOperations.PointRange#getMaxPoint()
	 * @see #getPointRange()
	 * @generated
	 */
	EReference getPointRange_MaxPoint();

	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.StringSet <em>String Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Set</em>'.
	 * @see TestingPackage.FuzzingOperations.StringSet
	 * @generated
	 */
	EClass getStringSet();

	/**
	 * Returns the meta object for the attribute list '{@link TestingPackage.FuzzingOperations.StringSet#getChoices <em>Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Choices</em>'.
	 * @see TestingPackage.FuzzingOperations.StringSet#getChoices()
	 * @see #getStringSet()
	 * @generated
	 */
	EAttribute getStringSet_Choices();

	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.ExternalResourceSet <em>External Resource Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Resource Set</em>'.
	 * @see TestingPackage.FuzzingOperations.ExternalResourceSet
	 * @generated
	 */
	EClass getExternalResourceSet();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.FuzzingOperations.ExternalResourceSet#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see TestingPackage.FuzzingOperations.ExternalResourceSet#getLocation()
	 * @see #getExternalResourceSet()
	 * @generated
	 */
	EAttribute getExternalResourceSet_Location();

	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.NetworkFuzzingOperation <em>Network Fuzzing Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Fuzzing Operation</em>'.
	 * @see TestingPackage.FuzzingOperations.NetworkFuzzingOperation
	 * @generated
	 */
	EClass getNetworkFuzzingOperation();

	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.BlackholeNetworkOperation <em>Blackhole Network Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blackhole Network Operation</em>'.
	 * @see TestingPackage.FuzzingOperations.BlackholeNetworkOperation
	 * @generated
	 */
	EClass getBlackholeNetworkOperation();

	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.LatencyNetworkOperation <em>Latency Network Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Latency Network Operation</em>'.
	 * @see TestingPackage.FuzzingOperations.LatencyNetworkOperation
	 * @generated
	 */
	EClass getLatencyNetworkOperation();

	/**
	 * Returns the meta object for the containment reference '{@link TestingPackage.FuzzingOperations.LatencyNetworkOperation#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Latency</em>'.
	 * @see TestingPackage.FuzzingOperations.LatencyNetworkOperation#getLatency()
	 * @see #getLatencyNetworkOperation()
	 * @generated
	 */
	EReference getLatencyNetworkOperation_Latency();

	/**
	 * Returns the meta object for class '{@link TestingPackage.FuzzingOperations.PacketLossNetworkOperation <em>Packet Loss Network Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packet Loss Network Operation</em>'.
	 * @see TestingPackage.FuzzingOperations.PacketLossNetworkOperation
	 * @generated
	 */
	EClass getPacketLossNetworkOperation();

	/**
	 * Returns the meta object for the containment reference '{@link TestingPackage.FuzzingOperations.PacketLossNetworkOperation#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Frequency</em>'.
	 * @see TestingPackage.FuzzingOperations.PacketLossNetworkOperation#getFrequency()
	 * @see #getPacketLossNetworkOperation()
	 * @generated
	 */
	EReference getPacketLossNetworkOperation_Frequency();

	/**
	 * Returns the meta object for enum '{@link TestingPackage.FuzzingOperations.OfflineOperationTime <em>Offline Operation Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Offline Operation Time</em>'.
	 * @see TestingPackage.FuzzingOperations.OfflineOperationTime
	 * @generated
	 */
	EEnum getOfflineOperationTime();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FuzzingOperationsFactory getFuzzingOperationsFactory();

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
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.FuzzingOperationImpl <em>Fuzzing Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getFuzzingOperation()
		 * @generated
		 */
		EClass FUZZING_OPERATION = eINSTANCE.getFuzzingOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZING_OPERATION__NAME = eINSTANCE.getFuzzingOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZING_OPERATION__PRIORITY = eINSTANCE.getFuzzingOperation_Priority();

		/**
		 * The meta object literal for the '<em><b>Activation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZING_OPERATION__ACTIVATION = eINSTANCE.getFuzzingOperation_Activation();

		/**
		 * The meta object literal for the '<em><b>Variable To Affect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZING_OPERATION__VARIABLE_TO_AFFECT = eINSTANCE.getFuzzingOperation_VariableToAffect();

		/**
		 * The meta object literal for the '<em><b>Messages From All Componenents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS = eINSTANCE.getFuzzingOperation_MessagesFromAllComponenents();

		/**
		 * The meta object literal for the '<em><b>From Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZING_OPERATION__FROM_NODES = eINSTANCE.getFuzzingOperation_FromNodes();

		/**
		 * The meta object literal for the '<em><b>Messages To All Componenents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS = eINSTANCE.getFuzzingOperation_MessagesToAllComponenents();

		/**
		 * The meta object literal for the '<em><b>To Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZING_OPERATION__TO_NODES = eINSTANCE.getFuzzingOperation_ToNodes();

		/**
		 * The meta object literal for the '<em><b>Node To Fuzz</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZING_OPERATION__NODE_TO_FUZZ = eINSTANCE.getFuzzingOperation_NodeToFuzz();

		/**
		 * The meta object literal for the '<em><b>All Publishing Vars</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZING_OPERATION__ALL_PUBLISHING_VARS = eINSTANCE.getFuzzingOperation_AllPublishingVars();

		/**
		 * The meta object literal for the '<em><b>Publishing Vars</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZING_OPERATION__PUBLISHING_VARS = eINSTANCE.getFuzzingOperation_PublishingVars();

		/**
		 * The meta object literal for the '<em><b>All Subscribing Vars</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZING_OPERATION__ALL_SUBSCRIBING_VARS = eINSTANCE.getFuzzingOperation_AllSubscribingVars();

		/**
		 * The meta object literal for the '<em><b>Subscribing Vars</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZING_OPERATION__SUBSCRIBING_VARS = eINSTANCE.getFuzzingOperation_SubscribingVars();

		/**
		 * The meta object literal for the '<em><b>From Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZING_OPERATION__FROM_TEMPLATE = eINSTANCE.getFuzzingOperation_FromTemplate();

		/**
		 * The meta object literal for the '<em><b>Containing Test</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZING_OPERATION__CONTAINING_TEST = eINSTANCE.getFuzzingOperation_ContainingTest();

		/**
		 * The meta object literal for the '<em><b>Recorded Timings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZING_OPERATION__RECORDED_TIMINGS = eINSTANCE.getFuzzingOperation_RecordedTimings();

		/**
		 * The meta object literal for the '<em><b>Seed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZING_OPERATION__SEED = eINSTANCE.getFuzzingOperation_Seed();

		/**
		 * The meta object literal for the '<em><b>Sequence Num In Test</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST = eINSTANCE.getFuzzingOperation_SequenceNumInTest();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.OfflineFuzzingOperationImpl <em>Offline Fuzzing Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.OfflineFuzzingOperationImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getOfflineFuzzingOperation()
		 * @generated
		 */
		EClass OFFLINE_FUZZING_OPERATION = eINSTANCE.getOfflineFuzzingOperation();

		/**
		 * The meta object literal for the '<em><b>Operation Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OFFLINE_FUZZING_OPERATION__OPERATION_TIME = eINSTANCE.getOfflineFuzzingOperation_OperationTime();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.CustomFuzzingOperationImpl <em>Custom Fuzzing Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.CustomFuzzingOperationImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getCustomFuzzingOperation()
		 * @generated
		 */
		EClass CUSTOM_FUZZING_OPERATION = eINSTANCE.getCustomFuzzingOperation();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOM_FUZZING_OPERATION__PARAMS = eINSTANCE.getCustomFuzzingOperation_Params();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.CustomOfflineFuzzingOperationImpl <em>Custom Offline Fuzzing Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.CustomOfflineFuzzingOperationImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getCustomOfflineFuzzingOperation()
		 * @generated
		 */
		EClass CUSTOM_OFFLINE_FUZZING_OPERATION = eINSTANCE.getCustomOfflineFuzzingOperation();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.ActivationImpl <em>Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.ActivationImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getActivation()
		 * @generated
		 */
		EClass ACTIVATION = eINSTANCE.getActivation();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.FixedTimeActivationImpl <em>Fixed Time Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.FixedTimeActivationImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getFixedTimeActivation()
		 * @generated
		 */
		EClass FIXED_TIME_ACTIVATION = eINSTANCE.getFixedTimeActivation();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_TIME_ACTIVATION__START_TIME = eINSTANCE.getFixedTimeActivation_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIXED_TIME_ACTIVATION__END_TIME = eINSTANCE.getFixedTimeActivation_EndTime();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.ConditionBasedActivationImpl <em>Condition Based Activation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.ConditionBasedActivationImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getConditionBasedActivation()
		 * @generated
		 */
		EClass CONDITION_BASED_ACTIVATION = eINSTANCE.getConditionBasedActivation();

		/**
		 * The meta object literal for the '<em><b>Maximum Activations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_BASED_ACTIVATION__MAXIMUM_ACTIVATIONS = eINSTANCE.getConditionBasedActivation_MaximumActivations();

		/**
		 * The meta object literal for the '<em><b>Starting</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_BASED_ACTIVATION__STARTING = eINSTANCE.getConditionBasedActivation_Starting();

		/**
		 * The meta object literal for the '<em><b>Ending</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_BASED_ACTIVATION__ENDING = eINSTANCE.getConditionBasedActivation_Ending();

		/**
		 * The meta object literal for the '<em><b>Starting Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_BASED_ACTIVATION__STARTING_EXPRESSION = eINSTANCE.getConditionBasedActivation_StartingExpression();

		/**
		 * The meta object literal for the '<em><b>Ending Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_BASED_ACTIVATION__ENDING_EXPRESSION = eINSTANCE.getConditionBasedActivation_EndingExpression();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.ConditionBasedTimeLimitedImpl <em>Condition Based Time Limited</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.ConditionBasedTimeLimitedImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getConditionBasedTimeLimited()
		 * @generated
		 */
		EClass CONDITION_BASED_TIME_LIMITED = eINSTANCE.getConditionBasedTimeLimited();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_BASED_TIME_LIMITED__LENGTH = eINSTANCE.getConditionBasedTimeLimited_Length();

		/**
		 * The meta object literal for the '<em><b>Maximum Activations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_BASED_TIME_LIMITED__MAXIMUM_ACTIVATIONS = eINSTANCE.getConditionBasedTimeLimited_MaximumActivations();

		/**
		 * The meta object literal for the '<em><b>Starting</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_BASED_TIME_LIMITED__STARTING = eINSTANCE.getConditionBasedTimeLimited_Starting();

		/**
		 * The meta object literal for the '<em><b>Starting Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_BASED_TIME_LIMITED__STARTING_EXPRESSION = eINSTANCE.getConditionBasedTimeLimited_StartingExpression();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.FuzzTestingOperationImpl <em>Fuzz Testing Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.FuzzTestingOperationImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getFuzzTestingOperation()
		 * @generated
		 */
		EClass FUZZ_TESTING_OPERATION = eINSTANCE.getFuzzTestingOperation();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.ComponentOperationImpl <em>Component Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.ComponentOperationImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getComponentOperation()
		 * @generated
		 */
		EClass COMPONENT_OPERATION = eINSTANCE.getComponentOperation();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.ComponentPropertyOperationImpl <em>Component Property Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.ComponentPropertyOperationImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getComponentPropertyOperation()
		 * @generated
		 */
		EClass COMPONENT_PROPERTY_OPERATION = eINSTANCE.getComponentPropertyOperation();

		/**
		 * The meta object literal for the '<em><b>Property To Affect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PROPERTY_OPERATION__PROPERTY_TO_AFFECT = eINSTANCE.getComponentPropertyOperation_PropertyToAffect();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.ComponentSubPropertyOperationImpl <em>Component Sub Property Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.ComponentSubPropertyOperationImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getComponentSubPropertyOperation()
		 * @generated
		 */
		EClass COMPONENT_SUB_PROPERTY_OPERATION = eINSTANCE.getComponentSubPropertyOperation();

		/**
		 * The meta object literal for the '<em><b>Property To Affect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SUB_PROPERTY_OPERATION__PROPERTY_TO_AFFECT = eINSTANCE.getComponentSubPropertyOperation_PropertyToAffect();

		/**
		 * The meta object literal for the '<em><b>Sub Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_SUB_PROPERTY_OPERATION__SUB_PROPERTY = eINSTANCE.getComponentSubPropertyOperation_SubProperty();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.VariableOperationImpl <em>Variable Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.VariableOperationImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getVariableOperation()
		 * @generated
		 */
		EClass VARIABLE_OPERATION = eINSTANCE.getVariableOperation();

		/**
		 * The meta object literal for the '<em><b>Sub Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_OPERATION__SUB_PARAMETERS = eINSTANCE.getVariableOperation_SubParameters();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.RandomValueFuzzingOperationImpl <em>Random Value Fuzzing Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.RandomValueFuzzingOperationImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getRandomValueFuzzingOperation()
		 * @generated
		 */
		EClass RANDOM_VALUE_FUZZING_OPERATION = eINSTANCE.getRandomValueFuzzingOperation();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.RandomValueFromSetOperationImpl <em>Random Value From Set Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.RandomValueFromSetOperationImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getRandomValueFromSetOperation()
		 * @generated
		 */
		EClass RANDOM_VALUE_FROM_SET_OPERATION = eINSTANCE.getRandomValueFromSetOperation();

		/**
		 * The meta object literal for the '<em><b>Value Set</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANDOM_VALUE_FROM_SET_OPERATION__VALUE_SET = eINSTANCE.getRandomValueFromSetOperation_ValueSet();

		/**
		 * The meta object literal for the '<em><b>Is Relative</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANDOM_VALUE_FROM_SET_OPERATION__IS_RELATIVE = eINSTANCE.getRandomValueFromSetOperation_IsRelative();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.ValueSetImpl <em>Value Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.ValueSetImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getValueSet()
		 * @generated
		 */
		EClass VALUE_SET = eINSTANCE.getValueSet();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SET__PROPERTY_NAME = eINSTANCE.getValueSet_PropertyName();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.ValueRangeImpl <em>Value Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.ValueRangeImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getValueRange()
		 * @generated
		 */
		EClass VALUE_RANGE = eINSTANCE.getValueRange();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.IntRangeImpl <em>Int Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.IntRangeImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getIntRange()
		 * @generated
		 */
		EClass INT_RANGE = eINSTANCE.getIntRange();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_RANGE__LOWER_BOUND = eINSTANCE.getIntRange_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_RANGE__UPPER_BOUND = eINSTANCE.getIntRange_UpperBound();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.DoubleRangeImpl <em>Double Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.DoubleRangeImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getDoubleRange()
		 * @generated
		 */
		EClass DOUBLE_RANGE = eINSTANCE.getDoubleRange();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_RANGE__LOWER_BOUND = eINSTANCE.getDoubleRange_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_RANGE__UPPER_BOUND = eINSTANCE.getDoubleRange_UpperBound();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.PointImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__X = eINSTANCE.getPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Y = eINSTANCE.getPoint_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Z = eINSTANCE.getPoint_Z();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.PointRangeImpl <em>Point Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.PointRangeImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getPointRange()
		 * @generated
		 */
		EClass POINT_RANGE = eINSTANCE.getPointRange();

		/**
		 * The meta object literal for the '<em><b>Min Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_RANGE__MIN_POINT = eINSTANCE.getPointRange_MinPoint();

		/**
		 * The meta object literal for the '<em><b>Max Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POINT_RANGE__MAX_POINT = eINSTANCE.getPointRange_MaxPoint();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.StringSetImpl <em>String Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.StringSetImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getStringSet()
		 * @generated
		 */
		EClass STRING_SET = eINSTANCE.getStringSet();

		/**
		 * The meta object literal for the '<em><b>Choices</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_SET__CHOICES = eINSTANCE.getStringSet_Choices();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.ExternalResourceSetImpl <em>External Resource Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.ExternalResourceSetImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getExternalResourceSet()
		 * @generated
		 */
		EClass EXTERNAL_RESOURCE_SET = eINSTANCE.getExternalResourceSet();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_RESOURCE_SET__LOCATION = eINSTANCE.getExternalResourceSet_Location();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.NetworkFuzzingOperationImpl <em>Network Fuzzing Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.NetworkFuzzingOperationImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getNetworkFuzzingOperation()
		 * @generated
		 */
		EClass NETWORK_FUZZING_OPERATION = eINSTANCE.getNetworkFuzzingOperation();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.BlackholeNetworkOperationImpl <em>Blackhole Network Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.BlackholeNetworkOperationImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getBlackholeNetworkOperation()
		 * @generated
		 */
		EClass BLACKHOLE_NETWORK_OPERATION = eINSTANCE.getBlackholeNetworkOperation();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.LatencyNetworkOperationImpl <em>Latency Network Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.LatencyNetworkOperationImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getLatencyNetworkOperation()
		 * @generated
		 */
		EClass LATENCY_NETWORK_OPERATION = eINSTANCE.getLatencyNetworkOperation();

		/**
		 * The meta object literal for the '<em><b>Latency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LATENCY_NETWORK_OPERATION__LATENCY = eINSTANCE.getLatencyNetworkOperation_Latency();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.impl.PacketLossNetworkOperationImpl <em>Packet Loss Network Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.impl.PacketLossNetworkOperationImpl
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getPacketLossNetworkOperation()
		 * @generated
		 */
		EClass PACKET_LOSS_NETWORK_OPERATION = eINSTANCE.getPacketLossNetworkOperation();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKET_LOSS_NETWORK_OPERATION__FREQUENCY = eINSTANCE.getPacketLossNetworkOperation_Frequency();

		/**
		 * The meta object literal for the '{@link TestingPackage.FuzzingOperations.OfflineOperationTime <em>Offline Operation Time</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.FuzzingOperations.OfflineOperationTime
		 * @see TestingPackage.FuzzingOperations.impl.FuzzingOperationsPackageImpl#getOfflineOperationTime()
		 * @generated
		 */
		EEnum OFFLINE_OPERATION_TIME = eINSTANCE.getOfflineOperationTime();

	}

} //FuzzingOperationsPackage
