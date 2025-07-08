/**
 */
package TestingPackage.MRSPackage;

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
 * @see TestingPackage.MRSPackage.MRSPackageFactory
 * @model kind="package"
 * @generated
 */
public interface MRSPackagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MRSPackage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "MRSPackage";

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
	MRSPackagePackage eINSTANCE = TestingPackage.MRSPackage.impl.MRSPackagePackageImpl.init();

	/**
	 * The meta object id for the '{@link TestingPackage.MRSPackage.impl.MRSImpl <em>MRS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.MRSPackage.impl.MRSImpl
	 * @see TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getMRS()
	 * @generated
	 */
	int MRS = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRS__VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Launch File Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRS__LAUNCH_FILE_LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Launch Delay Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRS__LAUNCH_DELAY_SECONDS = 2;

	/**
	 * The feature id for the '<em><b>Custom Terminate File Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRS__CUSTOM_TERMINATE_FILE_LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Record File Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRS__RECORD_FILE_LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRS__NODES = 5;

	/**
	 * The feature id for the '<em><b>Simulator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRS__SIMULATOR = 6;

	/**
	 * The feature id for the '<em><b>Property Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRS__PROPERTY_TYPE = 7;

	/**
	 * The number of structural features of the '<em>MRS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRS_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>MRS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MRS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.MRSPackage.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.MRSPackage.impl.NodeImpl
	 * @see TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Subscriber</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SUBSCRIBER = 1;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PUBLISHER = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__PROPERTIES = 3;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.MRSPackage.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.MRSPackage.impl.VariableImpl
	 * @see TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.MRSPackage.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.MRSPackage.impl.TypeImpl
	 * @see TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parsing Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__PARSING_METHOD = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__PARAMETERS = 2;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.MRSPackage.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.MRSPackage.impl.ParameterImpl
	 * @see TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Subparameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__SUBPARAMETERS = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.MRSPackage.impl.ComponentPropertyImpl <em>Component Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.MRSPackage.impl.ComponentPropertyImpl
	 * @see TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getComponentProperty()
	 * @generated
	 */
	int COMPONENT_PROPERTY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Component Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Component Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.MRSPackage.impl.SimulatorImpl <em>Simulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.MRSPackage.impl.SimulatorImpl
	 * @see TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getSimulator()
	 * @generated
	 */
	int SIMULATOR = 6;

	/**
	 * The number of structural features of the '<em>Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.MRSPackage.impl.ROSSimulatorImpl <em>ROS Simulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.MRSPackage.impl.ROSSimulatorImpl
	 * @see TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getROSSimulator()
	 * @generated
	 */
	int ROS_SIMULATOR = 7;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SIMULATOR__HOSTNAME = SIMULATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SIMULATOR__PORT = SIMULATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ROS Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SIMULATOR_FEATURE_COUNT = SIMULATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ROS Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROS_SIMULATOR_OPERATION_COUNT = SIMULATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.MRSPackage.impl.MOOSSimulatorImpl <em>MOOS Simulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.MRSPackage.impl.MOOSSimulatorImpl
	 * @see TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getMOOSSimulator()
	 * @generated
	 */
	int MOOS_SIMULATOR = 8;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOOS_SIMULATOR__HOSTNAME = SIMULATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOOS_SIMULATOR__PORT = SIMULATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>MOOS Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOOS_SIMULATOR_FEATURE_COUNT = SIMULATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>MOOS Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOOS_SIMULATOR_OPERATION_COUNT = SIMULATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.MRSPackage.impl.TTSSimulatorImpl <em>TTS Simulator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.MRSPackage.impl.TTSSimulatorImpl
	 * @see TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getTTSSimulator()
	 * @generated
	 */
	int TTS_SIMULATOR = 9;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTS_SIMULATOR__HOSTNAME = SIMULATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTS_SIMULATOR__PORT = SIMULATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>TTS Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTS_SIMULATOR_FEATURE_COUNT = SIMULATOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>TTS Simulator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTS_SIMULATOR_OPERATION_COUNT = SIMULATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.MRSPackage.ParsingMethod <em>Parsing Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.MRSPackage.ParsingMethod
	 * @see TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getParsingMethod()
	 * @generated
	 */
	int PARSING_METHOD = 10;


	/**
	 * Returns the meta object for class '{@link TestingPackage.MRSPackage.MRS <em>MRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MRS</em>'.
	 * @see TestingPackage.MRSPackage.MRS
	 * @generated
	 */
	EClass getMRS();

	/**
	 * Returns the meta object for the containment reference list '{@link TestingPackage.MRSPackage.MRS#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see TestingPackage.MRSPackage.MRS#getVariables()
	 * @see #getMRS()
	 * @generated
	 */
	EReference getMRS_Variables();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.MRSPackage.MRS#getLaunchFileLocation <em>Launch File Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Launch File Location</em>'.
	 * @see TestingPackage.MRSPackage.MRS#getLaunchFileLocation()
	 * @see #getMRS()
	 * @generated
	 */
	EAttribute getMRS_LaunchFileLocation();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.MRSPackage.MRS#getLaunchDelaySeconds <em>Launch Delay Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Launch Delay Seconds</em>'.
	 * @see TestingPackage.MRSPackage.MRS#getLaunchDelaySeconds()
	 * @see #getMRS()
	 * @generated
	 */
	EAttribute getMRS_LaunchDelaySeconds();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.MRSPackage.MRS#getCustomTerminateFileLocation <em>Custom Terminate File Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Terminate File Location</em>'.
	 * @see TestingPackage.MRSPackage.MRS#getCustomTerminateFileLocation()
	 * @see #getMRS()
	 * @generated
	 */
	EAttribute getMRS_CustomTerminateFileLocation();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.MRSPackage.MRS#getRecordFileLocation <em>Record File Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Record File Location</em>'.
	 * @see TestingPackage.MRSPackage.MRS#getRecordFileLocation()
	 * @see #getMRS()
	 * @generated
	 */
	EAttribute getMRS_RecordFileLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link TestingPackage.MRSPackage.MRS#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see TestingPackage.MRSPackage.MRS#getNodes()
	 * @see #getMRS()
	 * @generated
	 */
	EReference getMRS_Nodes();

	/**
	 * Returns the meta object for the containment reference '{@link TestingPackage.MRSPackage.MRS#getSimulator <em>Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simulator</em>'.
	 * @see TestingPackage.MRSPackage.MRS#getSimulator()
	 * @see #getMRS()
	 * @generated
	 */
	EReference getMRS_Simulator();

	/**
	 * Returns the meta object for the containment reference list '{@link TestingPackage.MRSPackage.MRS#getPropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Type</em>'.
	 * @see TestingPackage.MRSPackage.MRS#getPropertyType()
	 * @see #getMRS()
	 * @generated
	 */
	EReference getMRS_PropertyType();

	/**
	 * Returns the meta object for class '{@link TestingPackage.MRSPackage.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see TestingPackage.MRSPackage.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.MRSPackage.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TestingPackage.MRSPackage.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the reference list '{@link TestingPackage.MRSPackage.Node#getSubscriber <em>Subscriber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subscriber</em>'.
	 * @see TestingPackage.MRSPackage.Node#getSubscriber()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Subscriber();

	/**
	 * Returns the meta object for the reference list '{@link TestingPackage.MRSPackage.Node#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Publisher</em>'.
	 * @see TestingPackage.MRSPackage.Node#getPublisher()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Publisher();

	/**
	 * Returns the meta object for the reference list '{@link TestingPackage.MRSPackage.Node#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see TestingPackage.MRSPackage.Node#getProperties()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Properties();

	/**
	 * Returns the meta object for class '{@link TestingPackage.MRSPackage.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see TestingPackage.MRSPackage.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.MRSPackage.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TestingPackage.MRSPackage.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the reference '{@link TestingPackage.MRSPackage.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see TestingPackage.MRSPackage.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Type();

	/**
	 * Returns the meta object for class '{@link TestingPackage.MRSPackage.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see TestingPackage.MRSPackage.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.MRSPackage.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TestingPackage.MRSPackage.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.MRSPackage.Type#getParsingMethod <em>Parsing Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parsing Method</em>'.
	 * @see TestingPackage.MRSPackage.Type#getParsingMethod()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_ParsingMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link TestingPackage.MRSPackage.Type#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see TestingPackage.MRSPackage.Type#getParameters()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Parameters();

	/**
	 * Returns the meta object for class '{@link TestingPackage.MRSPackage.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see TestingPackage.MRSPackage.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.MRSPackage.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TestingPackage.MRSPackage.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link TestingPackage.MRSPackage.Parameter#getSubparameters <em>Subparameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subparameters</em>'.
	 * @see TestingPackage.MRSPackage.Parameter#getSubparameters()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Subparameters();

	/**
	 * Returns the meta object for the reference '{@link TestingPackage.MRSPackage.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see TestingPackage.MRSPackage.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for class '{@link TestingPackage.MRSPackage.ComponentProperty <em>Component Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Property</em>'.
	 * @see TestingPackage.MRSPackage.ComponentProperty
	 * @generated
	 */
	EClass getComponentProperty();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.MRSPackage.ComponentProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TestingPackage.MRSPackage.ComponentProperty#getName()
	 * @see #getComponentProperty()
	 * @generated
	 */
	EAttribute getComponentProperty_Name();

	/**
	 * Returns the meta object for the reference '{@link TestingPackage.MRSPackage.ComponentProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see TestingPackage.MRSPackage.ComponentProperty#getType()
	 * @see #getComponentProperty()
	 * @generated
	 */
	EReference getComponentProperty_Type();

	/**
	 * Returns the meta object for class '{@link TestingPackage.MRSPackage.Simulator <em>Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulator</em>'.
	 * @see TestingPackage.MRSPackage.Simulator
	 * @generated
	 */
	EClass getSimulator();

	/**
	 * Returns the meta object for class '{@link TestingPackage.MRSPackage.ROSSimulator <em>ROS Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROS Simulator</em>'.
	 * @see TestingPackage.MRSPackage.ROSSimulator
	 * @generated
	 */
	EClass getROSSimulator();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.MRSPackage.ROSSimulator#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see TestingPackage.MRSPackage.ROSSimulator#getHostname()
	 * @see #getROSSimulator()
	 * @generated
	 */
	EAttribute getROSSimulator_Hostname();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.MRSPackage.ROSSimulator#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see TestingPackage.MRSPackage.ROSSimulator#getPort()
	 * @see #getROSSimulator()
	 * @generated
	 */
	EAttribute getROSSimulator_Port();

	/**
	 * Returns the meta object for class '{@link TestingPackage.MRSPackage.MOOSSimulator <em>MOOS Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MOOS Simulator</em>'.
	 * @see TestingPackage.MRSPackage.MOOSSimulator
	 * @generated
	 */
	EClass getMOOSSimulator();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.MRSPackage.MOOSSimulator#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see TestingPackage.MRSPackage.MOOSSimulator#getHostname()
	 * @see #getMOOSSimulator()
	 * @generated
	 */
	EAttribute getMOOSSimulator_Hostname();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.MRSPackage.MOOSSimulator#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see TestingPackage.MRSPackage.MOOSSimulator#getPort()
	 * @see #getMOOSSimulator()
	 * @generated
	 */
	EAttribute getMOOSSimulator_Port();

	/**
	 * Returns the meta object for class '{@link TestingPackage.MRSPackage.TTSSimulator <em>TTS Simulator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTS Simulator</em>'.
	 * @see TestingPackage.MRSPackage.TTSSimulator
	 * @generated
	 */
	EClass getTTSSimulator();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.MRSPackage.TTSSimulator#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see TestingPackage.MRSPackage.TTSSimulator#getHostname()
	 * @see #getTTSSimulator()
	 * @generated
	 */
	EAttribute getTTSSimulator_Hostname();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.MRSPackage.TTSSimulator#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see TestingPackage.MRSPackage.TTSSimulator#getPort()
	 * @see #getTTSSimulator()
	 * @generated
	 */
	EAttribute getTTSSimulator_Port();

	/**
	 * Returns the meta object for enum '{@link TestingPackage.MRSPackage.ParsingMethod <em>Parsing Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parsing Method</em>'.
	 * @see TestingPackage.MRSPackage.ParsingMethod
	 * @generated
	 */
	EEnum getParsingMethod();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MRSPackageFactory getMRSPackageFactory();

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
		 * The meta object literal for the '{@link TestingPackage.MRSPackage.impl.MRSImpl <em>MRS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.MRSPackage.impl.MRSImpl
		 * @see TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getMRS()
		 * @generated
		 */
		EClass MRS = eINSTANCE.getMRS();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MRS__VARIABLES = eINSTANCE.getMRS_Variables();

		/**
		 * The meta object literal for the '<em><b>Launch File Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRS__LAUNCH_FILE_LOCATION = eINSTANCE.getMRS_LaunchFileLocation();

		/**
		 * The meta object literal for the '<em><b>Launch Delay Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRS__LAUNCH_DELAY_SECONDS = eINSTANCE.getMRS_LaunchDelaySeconds();

		/**
		 * The meta object literal for the '<em><b>Custom Terminate File Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRS__CUSTOM_TERMINATE_FILE_LOCATION = eINSTANCE.getMRS_CustomTerminateFileLocation();

		/**
		 * The meta object literal for the '<em><b>Record File Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MRS__RECORD_FILE_LOCATION = eINSTANCE.getMRS_RecordFileLocation();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MRS__NODES = eINSTANCE.getMRS_Nodes();

		/**
		 * The meta object literal for the '<em><b>Simulator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MRS__SIMULATOR = eINSTANCE.getMRS_Simulator();

		/**
		 * The meta object literal for the '<em><b>Property Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MRS__PROPERTY_TYPE = eINSTANCE.getMRS_PropertyType();

		/**
		 * The meta object literal for the '{@link TestingPackage.MRSPackage.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.MRSPackage.impl.NodeImpl
		 * @see TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Subscriber</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SUBSCRIBER = eINSTANCE.getNode_Subscriber();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PUBLISHER = eINSTANCE.getNode_Publisher();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__PROPERTIES = eINSTANCE.getNode_Properties();

		/**
		 * The meta object literal for the '{@link TestingPackage.MRSPackage.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.MRSPackage.impl.VariableImpl
		 * @see TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link TestingPackage.MRSPackage.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.MRSPackage.impl.TypeImpl
		 * @see TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '<em><b>Parsing Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__PARSING_METHOD = eINSTANCE.getType_ParsingMethod();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__PARAMETERS = eINSTANCE.getType_Parameters();

		/**
		 * The meta object literal for the '{@link TestingPackage.MRSPackage.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.MRSPackage.impl.ParameterImpl
		 * @see TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Subparameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__SUBPARAMETERS = eINSTANCE.getParameter_Subparameters();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '{@link TestingPackage.MRSPackage.impl.ComponentPropertyImpl <em>Component Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.MRSPackage.impl.ComponentPropertyImpl
		 * @see TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getComponentProperty()
		 * @generated
		 */
		EClass COMPONENT_PROPERTY = eINSTANCE.getComponentProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_PROPERTY__NAME = eINSTANCE.getComponentProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_PROPERTY__TYPE = eINSTANCE.getComponentProperty_Type();

		/**
		 * The meta object literal for the '{@link TestingPackage.MRSPackage.impl.SimulatorImpl <em>Simulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.MRSPackage.impl.SimulatorImpl
		 * @see TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getSimulator()
		 * @generated
		 */
		EClass SIMULATOR = eINSTANCE.getSimulator();

		/**
		 * The meta object literal for the '{@link TestingPackage.MRSPackage.impl.ROSSimulatorImpl <em>ROS Simulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.MRSPackage.impl.ROSSimulatorImpl
		 * @see TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getROSSimulator()
		 * @generated
		 */
		EClass ROS_SIMULATOR = eINSTANCE.getROSSimulator();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_SIMULATOR__HOSTNAME = eINSTANCE.getROSSimulator_Hostname();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROS_SIMULATOR__PORT = eINSTANCE.getROSSimulator_Port();

		/**
		 * The meta object literal for the '{@link TestingPackage.MRSPackage.impl.MOOSSimulatorImpl <em>MOOS Simulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.MRSPackage.impl.MOOSSimulatorImpl
		 * @see TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getMOOSSimulator()
		 * @generated
		 */
		EClass MOOS_SIMULATOR = eINSTANCE.getMOOSSimulator();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOOS_SIMULATOR__HOSTNAME = eINSTANCE.getMOOSSimulator_Hostname();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOOS_SIMULATOR__PORT = eINSTANCE.getMOOSSimulator_Port();

		/**
		 * The meta object literal for the '{@link TestingPackage.MRSPackage.impl.TTSSimulatorImpl <em>TTS Simulator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.MRSPackage.impl.TTSSimulatorImpl
		 * @see TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getTTSSimulator()
		 * @generated
		 */
		EClass TTS_SIMULATOR = eINSTANCE.getTTSSimulator();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTS_SIMULATOR__HOSTNAME = eINSTANCE.getTTSSimulator_Hostname();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TTS_SIMULATOR__PORT = eINSTANCE.getTTSSimulator_Port();

		/**
		 * The meta object literal for the '{@link TestingPackage.MRSPackage.ParsingMethod <em>Parsing Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.MRSPackage.ParsingMethod
		 * @see TestingPackage.MRSPackage.impl.MRSPackagePackageImpl#getParsingMethod()
		 * @generated
		 */
		EEnum PARSING_METHOD = eINSTANCE.getParsingMethod();

	}

} //MRSPackagePackage
