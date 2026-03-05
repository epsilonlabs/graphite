/**
 */
package flow;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see flow.FlowFactory
 * @model kind="package"
 * @generated
 */
public interface FlowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "flow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.obeo.fr/dsl/designer/sample/flow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "flow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FlowPackage eINSTANCE = flow.impl.FlowPackageImpl.init();

	/**
	 * The meta object id for the '{@link flow.impl.FlowElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.FlowElementImpl
	 * @see flow.impl.FlowPackageImpl#getFlowElement()
	 * @generated
	 */
	int FLOW_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT__USAGE = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link flow.impl.FanImpl <em>Fan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.FanImpl
	 * @see flow.impl.FlowPackageImpl#getFan()
	 * @generated
	 */
	int FAN = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAN__STATUS = FLOW_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAN__USAGE = FLOW_ELEMENT__USAGE;

	/**
	 * The feature id for the '<em><b>Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAN__CONSUMPTION = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Power Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAN__POWER_STATUS = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAN__SPEED = FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAN__WEIGHT = FLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Fan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAN_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link flow.impl.PhysicalImpl <em>Physical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.PhysicalImpl
	 * @see flow.impl.FlowPackageImpl#getPhysical()
	 * @generated
	 */
	int PHYSICAL = 1;

	/**
	 * The number of structural features of the '<em>Physical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link flow.impl.PoweredImpl <em>Powered</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.PoweredImpl
	 * @see flow.impl.FlowPackageImpl#getPowered()
	 * @generated
	 */
	int POWERED = 8;

	/**
	 * The feature id for the '<em><b>Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWERED__CONSUMPTION = 0;

	/**
	 * The feature id for the '<em><b>Power Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWERED__POWER_STATUS = 1;

	/**
	 * The number of structural features of the '<em>Powered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWERED_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link flow.impl.SystemImpl <em>System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.SystemImpl
	 * @see flow.impl.FlowPackageImpl#getSystem()
	 * @generated
	 */
	int SYSTEM = 5;

	/**
	 * The feature id for the '<em><b>Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__CONSUMPTION = POWERED__CONSUMPTION;

	/**
	 * The feature id for the '<em><b>Power Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__POWER_STATUS = POWERED__POWER_STATUS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__STATUS = POWERED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__USAGE = POWERED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__OUTGOING_FLOWS = POWERED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__NAME = POWERED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ELEMENTS = POWERED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__TEMPERATURE = POWERED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__WEIGHT = POWERED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Power Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__POWER_OUTPUTS = POWERED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Power Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__POWER_INPUTS = POWERED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Routing Rules</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ROUTING_RULES = POWERED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Routing Rules List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM__ROUTING_RULES_LIST = POWERED_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_FEATURE_COUNT = POWERED_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link flow.impl.CompositeProcessorImpl <em>Composite Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.CompositeProcessorImpl
	 * @see flow.impl.FlowPackageImpl#getCompositeProcessor()
	 * @generated
	 */
	int COMPOSITE_PROCESSOR = 2;

	/**
	 * The feature id for the '<em><b>Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESSOR__CONSUMPTION = SYSTEM__CONSUMPTION;

	/**
	 * The feature id for the '<em><b>Power Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESSOR__POWER_STATUS = SYSTEM__POWER_STATUS;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESSOR__STATUS = SYSTEM__STATUS;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESSOR__USAGE = SYSTEM__USAGE;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESSOR__OUTGOING_FLOWS = SYSTEM__OUTGOING_FLOWS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESSOR__NAME = SYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESSOR__ELEMENTS = SYSTEM__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESSOR__TEMPERATURE = SYSTEM__TEMPERATURE;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESSOR__WEIGHT = SYSTEM__WEIGHT;

	/**
	 * The feature id for the '<em><b>Power Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESSOR__POWER_OUTPUTS = SYSTEM__POWER_OUTPUTS;

	/**
	 * The feature id for the '<em><b>Power Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESSOR__POWER_INPUTS = SYSTEM__POWER_INPUTS;

	/**
	 * The feature id for the '<em><b>Routing Rules</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESSOR__ROUTING_RULES = SYSTEM__ROUTING_RULES;

	/**
	 * The feature id for the '<em><b>Routing Rules List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESSOR__ROUTING_RULES_LIST = SYSTEM__ROUTING_RULES_LIST;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESSOR__INCOMING_FLOWS = SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESSOR__CAPACITY = SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESSOR__LOAD = SYSTEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Composite Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_PROCESSOR_FEATURE_COUNT = SYSTEM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link flow.impl.CapacityBoundImpl <em>Capacity Bound</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.CapacityBoundImpl
	 * @see flow.impl.FlowPackageImpl#getCapacityBound()
	 * @generated
	 */
	int CAPACITY_BOUND = 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_BOUND__STATUS = FLOW_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_BOUND__USAGE = FLOW_ELEMENT__USAGE;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_BOUND__CAPACITY = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_BOUND__LOAD = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Capacity Bound</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_BOUND_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link flow.impl.DataFlowImpl <em>Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.DataFlowImpl
	 * @see flow.impl.FlowPackageImpl#getDataFlow()
	 * @generated
	 */
	int DATA_FLOW = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__STATUS = CAPACITY_BOUND__STATUS;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__USAGE = CAPACITY_BOUND__USAGE;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__CAPACITY = CAPACITY_BOUND__CAPACITY;

	/**
	 * The feature id for the '<em><b>Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__LOAD = CAPACITY_BOUND__LOAD;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__TARGET = CAPACITY_BOUND_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__SOURCE = CAPACITY_BOUND_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_FEATURE_COUNT = CAPACITY_BOUND_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link flow.impl.RoutingRuleImpl <em>Routing Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.RoutingRuleImpl
	 * @see flow.impl.FlowPackageImpl#getRoutingRule()
	 * @generated
	 */
	int ROUTING_RULE = 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_RULE__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_RULE__PROPERTY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_RULE__UNIT = 2;

	/**
	 * The feature id for the '<em><b>Comparison Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_RULE__COMPARISON_OPERATOR = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_RULE__VALUE = 4;

	/**
	 * The feature id for the '<em><b>System Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_RULE__SYSTEM_STATUS = 5;

	/**
	 * The number of structural features of the '<em>Routing Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTING_RULE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link flow.impl.PowerOutputImpl <em>Power Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.PowerOutputImpl
	 * @see flow.impl.FlowPackageImpl#getPowerOutput()
	 * @generated
	 */
	int POWER_OUTPUT = 7;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_OUTPUT__POWER = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_OUTPUT__LINKS = 1;

	/**
	 * The number of structural features of the '<em>Power Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_OUTPUT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link flow.impl.PowerInputImpl <em>Power Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.PowerInputImpl
	 * @see flow.impl.FlowPackageImpl#getPowerInput()
	 * @generated
	 */
	int POWER_INPUT = 9;

	/**
	 * The number of structural features of the '<em>Power Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_INPUT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link flow.impl.PowerLinkImpl <em>Power Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.PowerLinkImpl
	 * @see flow.impl.FlowPackageImpl#getPowerLink()
	 * @generated
	 */
	int POWER_LINK = 10;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_LINK__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_LINK__SOURCE = 1;

	/**
	 * The number of structural features of the '<em>Power Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_LINK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link flow.impl.FlowSourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.FlowSourceImpl
	 * @see flow.impl.FlowPackageImpl#getFlowSource()
	 * @generated
	 */
	int FLOW_SOURCE = 11;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SOURCE__STATUS = FLOW_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SOURCE__USAGE = FLOW_ELEMENT__USAGE;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SOURCE__OUTGOING_FLOWS = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_SOURCE_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link flow.impl.FlowTargetImpl <em>Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.FlowTargetImpl
	 * @see flow.impl.FlowPackageImpl#getFlowTarget()
	 * @generated
	 */
	int FLOW_TARGET = 13;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TARGET__STATUS = FLOW_ELEMENT__STATUS;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TARGET__USAGE = FLOW_ELEMENT__USAGE;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TARGET__INCOMING_FLOWS = FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_TARGET_FEATURE_COUNT = FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link flow.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.ProcessorImpl
	 * @see flow.impl.FlowPackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 12;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__STATUS = FLOW_TARGET__STATUS;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__USAGE = FLOW_TARGET__USAGE;

	/**
	 * The feature id for the '<em><b>Incoming Flows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__INCOMING_FLOWS = FLOW_TARGET__INCOMING_FLOWS;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__CAPACITY = FLOW_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Load</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__LOAD = FLOW_TARGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__OUTGOING_FLOWS = FLOW_TARGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Consumption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__CONSUMPTION = FLOW_TARGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Power Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__POWER_STATUS = FLOW_TARGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__NAME = FLOW_TARGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__VOLUME = FLOW_TARGET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__WEIGHT = FLOW_TARGET_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = FLOW_TARGET_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link flow.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.DataSourceImpl
	 * @see flow.impl.FlowPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 14;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__STATUS = FLOW_SOURCE__STATUS;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__USAGE = FLOW_SOURCE__USAGE;

	/**
	 * The feature id for the '<em><b>Outgoing Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__OUTGOING_FLOWS = FLOW_SOURCE__OUTGOING_FLOWS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__NAME = FLOW_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__VOLUME = FLOW_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = FLOW_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link flow.impl.NamedImpl <em>Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.impl.NamedImpl
	 * @see flow.impl.FlowPackageImpl#getNamed()
	 * @generated
	 */
	int NAMED = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link flow.SystemStatus <em>System Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.SystemStatus
	 * @see flow.impl.FlowPackageImpl#getSystemStatus()
	 * @generated
	 */
	int SYSTEM_STATUS = 17;

	/**
	 * The meta object id for the '{@link flow.ComparisonOperator <em>Comparison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.ComparisonOperator
	 * @see flow.impl.FlowPackageImpl#getComparisonOperator()
	 * @generated
	 */
	int COMPARISON_OPERATOR = 18;

	/**
	 * The meta object id for the '{@link flow.SystemProperty <em>System Property</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.SystemProperty
	 * @see flow.impl.FlowPackageImpl#getSystemProperty()
	 * @generated
	 */
	int SYSTEM_PROPERTY = 19;

	/**
	 * The meta object id for the '{@link flow.PropertyUnit <em>Property Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.PropertyUnit
	 * @see flow.impl.FlowPackageImpl#getPropertyUnit()
	 * @generated
	 */
	int PROPERTY_UNIT = 20;

	/**
	 * The meta object id for the '{@link flow.PoweredStatus <em>Powered Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.PoweredStatus
	 * @see flow.impl.FlowPackageImpl#getPoweredStatus()
	 * @generated
	 */
	int POWERED_STATUS = 21;

	/**
	 * The meta object id for the '{@link flow.FlowElementStatus <em>Element Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.FlowElementStatus
	 * @see flow.impl.FlowPackageImpl#getFlowElementStatus()
	 * @generated
	 */
	int FLOW_ELEMENT_STATUS = 22;

	/**
	 * The meta object id for the '{@link flow.FlowElementUsage <em>Element Usage</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see flow.FlowElementUsage
	 * @see flow.impl.FlowPackageImpl#getFlowElementUsage()
	 * @generated
	 */
	int FLOW_ELEMENT_USAGE = 23;


	/**
	 * Returns the meta object for class '{@link flow.Fan <em>Fan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fan</em>'.
	 * @see flow.Fan
	 * @generated
	 */
	EClass getFan();

	/**
	 * Returns the meta object for the attribute '{@link flow.Fan#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see flow.Fan#getSpeed()
	 * @see #getFan()
	 * @generated
	 */
	EAttribute getFan_Speed();

	/**
	 * Returns the meta object for the attribute '{@link flow.Fan#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see flow.Fan#getWeight()
	 * @see #getFan()
	 * @generated
	 */
	EAttribute getFan_Weight();

	/**
	 * Returns the meta object for class '{@link flow.Physical <em>Physical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical</em>'.
	 * @see flow.Physical
	 * @generated
	 */
	EClass getPhysical();

	/**
	 * Returns the meta object for class '{@link flow.CompositeProcessor <em>Composite Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Processor</em>'.
	 * @see flow.CompositeProcessor
	 * @generated
	 */
	EClass getCompositeProcessor();

	/**
	 * Returns the meta object for class '{@link flow.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow</em>'.
	 * @see flow.DataFlow
	 * @generated
	 */
	EClass getDataFlow();

	/**
	 * Returns the meta object for the reference '{@link flow.DataFlow#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see flow.DataFlow#getTarget()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Target();

	/**
	 * Returns the meta object for the container reference '{@link flow.DataFlow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see flow.DataFlow#getSource()
	 * @see #getDataFlow()
	 * @generated
	 */
	EReference getDataFlow_Source();

	/**
	 * Returns the meta object for class '{@link flow.CapacityBound <em>Capacity Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capacity Bound</em>'.
	 * @see flow.CapacityBound
	 * @generated
	 */
	EClass getCapacityBound();

	/**
	 * Returns the meta object for the attribute '{@link flow.CapacityBound#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see flow.CapacityBound#getCapacity()
	 * @see #getCapacityBound()
	 * @generated
	 */
	EAttribute getCapacityBound_Capacity();

	/**
	 * Returns the meta object for the attribute '{@link flow.CapacityBound#getLoad <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Load</em>'.
	 * @see flow.CapacityBound#getLoad()
	 * @see #getCapacityBound()
	 * @generated
	 */
	EAttribute getCapacityBound_Load();

	/**
	 * Returns the meta object for class '{@link flow.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System</em>'.
	 * @see flow.System
	 * @generated
	 */
	EClass getSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link flow.System#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see flow.System#getElements()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_Elements();

	/**
	 * Returns the meta object for the attribute '{@link flow.System#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see flow.System#getTemperature()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Temperature();

	/**
	 * Returns the meta object for the attribute '{@link flow.System#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see flow.System#getWeight()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_Weight();

	/**
	 * Returns the meta object for the containment reference list '{@link flow.System#getPowerOutputs <em>Power Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Power Outputs</em>'.
	 * @see flow.System#getPowerOutputs()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_PowerOutputs();

	/**
	 * Returns the meta object for the containment reference list '{@link flow.System#getPowerInputs <em>Power Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Power Inputs</em>'.
	 * @see flow.System#getPowerInputs()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_PowerInputs();

	/**
	 * Returns the meta object for the attribute '{@link flow.System#getRoutingRules <em>Routing Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Routing Rules</em>'.
	 * @see flow.System#getRoutingRules()
	 * @see #getSystem()
	 * @generated
	 */
	EAttribute getSystem_RoutingRules();

	/**
	 * Returns the meta object for the containment reference list '{@link flow.System#getRoutingRulesList <em>Routing Rules List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Routing Rules List</em>'.
	 * @see flow.System#getRoutingRulesList()
	 * @see #getSystem()
	 * @generated
	 */
	EReference getSystem_RoutingRulesList();

	/**
	 * Returns the meta object for class '{@link flow.RoutingRule <em>Routing Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Routing Rule</em>'.
	 * @see flow.RoutingRule
	 * @generated
	 */
	EClass getRoutingRule();

	/**
	 * Returns the meta object for the reference '{@link flow.RoutingRule#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see flow.RoutingRule#getTarget()
	 * @see #getRoutingRule()
	 * @generated
	 */
	EReference getRoutingRule_Target();

	/**
	 * Returns the meta object for the attribute '{@link flow.RoutingRule#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see flow.RoutingRule#getPropertyName()
	 * @see #getRoutingRule()
	 * @generated
	 */
	EAttribute getRoutingRule_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link flow.RoutingRule#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see flow.RoutingRule#getUnit()
	 * @see #getRoutingRule()
	 * @generated
	 */
	EAttribute getRoutingRule_Unit();

	/**
	 * Returns the meta object for the attribute '{@link flow.RoutingRule#getComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Operator</em>'.
	 * @see flow.RoutingRule#getComparisonOperator()
	 * @see #getRoutingRule()
	 * @generated
	 */
	EAttribute getRoutingRule_ComparisonOperator();

	/**
	 * Returns the meta object for the attribute '{@link flow.RoutingRule#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see flow.RoutingRule#getValue()
	 * @see #getRoutingRule()
	 * @generated
	 */
	EAttribute getRoutingRule_Value();

	/**
	 * Returns the meta object for the attribute '{@link flow.RoutingRule#getSystemStatus <em>System Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Status</em>'.
	 * @see flow.RoutingRule#getSystemStatus()
	 * @see #getRoutingRule()
	 * @generated
	 */
	EAttribute getRoutingRule_SystemStatus();

	/**
	 * Returns the meta object for class '{@link flow.PowerOutput <em>Power Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Output</em>'.
	 * @see flow.PowerOutput
	 * @generated
	 */
	EClass getPowerOutput();

	/**
	 * Returns the meta object for the attribute '{@link flow.PowerOutput#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see flow.PowerOutput#getPower()
	 * @see #getPowerOutput()
	 * @generated
	 */
	EAttribute getPowerOutput_Power();

	/**
	 * Returns the meta object for the containment reference list '{@link flow.PowerOutput#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see flow.PowerOutput#getLinks()
	 * @see #getPowerOutput()
	 * @generated
	 */
	EReference getPowerOutput_Links();

	/**
	 * Returns the meta object for class '{@link flow.Powered <em>Powered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Powered</em>'.
	 * @see flow.Powered
	 * @generated
	 */
	EClass getPowered();

	/**
	 * Returns the meta object for the attribute '{@link flow.Powered#getConsumption <em>Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumption</em>'.
	 * @see flow.Powered#getConsumption()
	 * @see #getPowered()
	 * @generated
	 */
	EAttribute getPowered_Consumption();

	/**
	 * Returns the meta object for the attribute '{@link flow.Powered#getPowerStatus <em>Power Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power Status</em>'.
	 * @see flow.Powered#getPowerStatus()
	 * @see #getPowered()
	 * @generated
	 */
	EAttribute getPowered_PowerStatus();

	/**
	 * Returns the meta object for class '{@link flow.PowerInput <em>Power Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Input</em>'.
	 * @see flow.PowerInput
	 * @generated
	 */
	EClass getPowerInput();

	/**
	 * Returns the meta object for class '{@link flow.PowerLink <em>Power Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Link</em>'.
	 * @see flow.PowerLink
	 * @generated
	 */
	EClass getPowerLink();

	/**
	 * Returns the meta object for the reference '{@link flow.PowerLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see flow.PowerLink#getTarget()
	 * @see #getPowerLink()
	 * @generated
	 */
	EReference getPowerLink_Target();

	/**
	 * Returns the meta object for the container reference '{@link flow.PowerLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see flow.PowerLink#getSource()
	 * @see #getPowerLink()
	 * @generated
	 */
	EReference getPowerLink_Source();

	/**
	 * Returns the meta object for class '{@link flow.FlowSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see flow.FlowSource
	 * @generated
	 */
	EClass getFlowSource();

	/**
	 * Returns the meta object for the containment reference list '{@link flow.FlowSource#getOutgoingFlows <em>Outgoing Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Flows</em>'.
	 * @see flow.FlowSource#getOutgoingFlows()
	 * @see #getFlowSource()
	 * @generated
	 */
	EReference getFlowSource_OutgoingFlows();

	/**
	 * Returns the meta object for class '{@link flow.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see flow.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the attribute '{@link flow.Processor#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see flow.Processor#getVolume()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Volume();

	/**
	 * Returns the meta object for the attribute '{@link flow.Processor#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see flow.Processor#getWeight()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Weight();

	/**
	 * Returns the meta object for class '{@link flow.FlowTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target</em>'.
	 * @see flow.FlowTarget
	 * @generated
	 */
	EClass getFlowTarget();

	/**
	 * Returns the meta object for the reference list '{@link flow.FlowTarget#getIncomingFlows <em>Incoming Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Flows</em>'.
	 * @see flow.FlowTarget#getIncomingFlows()
	 * @see #getFlowTarget()
	 * @generated
	 */
	EReference getFlowTarget_IncomingFlows();

	/**
	 * Returns the meta object for class '{@link flow.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see flow.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for the attribute '{@link flow.DataSource#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see flow.DataSource#getVolume()
	 * @see #getDataSource()
	 * @generated
	 */
	EAttribute getDataSource_Volume();

	/**
	 * Returns the meta object for class '{@link flow.FlowElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see flow.FlowElement
	 * @generated
	 */
	EClass getFlowElement();

	/**
	 * Returns the meta object for the attribute '{@link flow.FlowElement#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see flow.FlowElement#getStatus()
	 * @see #getFlowElement()
	 * @generated
	 */
	EAttribute getFlowElement_Status();

	/**
	 * Returns the meta object for the attribute '{@link flow.FlowElement#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see flow.FlowElement#getUsage()
	 * @see #getFlowElement()
	 * @generated
	 */
	EAttribute getFlowElement_Usage();

	/**
	 * Returns the meta object for class '{@link flow.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named</em>'.
	 * @see flow.Named
	 * @generated
	 */
	EClass getNamed();

	/**
	 * Returns the meta object for the attribute '{@link flow.Named#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see flow.Named#getName()
	 * @see #getNamed()
	 * @generated
	 */
	EAttribute getNamed_Name();

	/**
	 * Returns the meta object for enum '{@link flow.SystemStatus <em>System Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>System Status</em>'.
	 * @see flow.SystemStatus
	 * @generated
	 */
	EEnum getSystemStatus();

	/**
	 * Returns the meta object for enum '{@link flow.ComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Operator</em>'.
	 * @see flow.ComparisonOperator
	 * @generated
	 */
	EEnum getComparisonOperator();

	/**
	 * Returns the meta object for enum '{@link flow.SystemProperty <em>System Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>System Property</em>'.
	 * @see flow.SystemProperty
	 * @generated
	 */
	EEnum getSystemProperty();

	/**
	 * Returns the meta object for enum '{@link flow.PropertyUnit <em>Property Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Property Unit</em>'.
	 * @see flow.PropertyUnit
	 * @generated
	 */
	EEnum getPropertyUnit();

	/**
	 * Returns the meta object for enum '{@link flow.PoweredStatus <em>Powered Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Powered Status</em>'.
	 * @see flow.PoweredStatus
	 * @generated
	 */
	EEnum getPoweredStatus();

	/**
	 * Returns the meta object for enum '{@link flow.FlowElementStatus <em>Element Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Status</em>'.
	 * @see flow.FlowElementStatus
	 * @generated
	 */
	EEnum getFlowElementStatus();

	/**
	 * Returns the meta object for enum '{@link flow.FlowElementUsage <em>Element Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Usage</em>'.
	 * @see flow.FlowElementUsage
	 * @generated
	 */
	EEnum getFlowElementUsage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FlowFactory getFlowFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link flow.impl.FanImpl <em>Fan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.FanImpl
		 * @see flow.impl.FlowPackageImpl#getFan()
		 * @generated
		 */
		EClass FAN = eINSTANCE.getFan();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAN__SPEED = eINSTANCE.getFan_Speed();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FAN__WEIGHT = eINSTANCE.getFan_Weight();

		/**
		 * The meta object literal for the '{@link flow.impl.PhysicalImpl <em>Physical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.PhysicalImpl
		 * @see flow.impl.FlowPackageImpl#getPhysical()
		 * @generated
		 */
		EClass PHYSICAL = eINSTANCE.getPhysical();

		/**
		 * The meta object literal for the '{@link flow.impl.CompositeProcessorImpl <em>Composite Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.CompositeProcessorImpl
		 * @see flow.impl.FlowPackageImpl#getCompositeProcessor()
		 * @generated
		 */
		EClass COMPOSITE_PROCESSOR = eINSTANCE.getCompositeProcessor();

		/**
		 * The meta object literal for the '{@link flow.impl.DataFlowImpl <em>Data Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.DataFlowImpl
		 * @see flow.impl.FlowPackageImpl#getDataFlow()
		 * @generated
		 */
		EClass DATA_FLOW = eINSTANCE.getDataFlow();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__TARGET = eINSTANCE.getDataFlow_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FLOW__SOURCE = eINSTANCE.getDataFlow_Source();

		/**
		 * The meta object literal for the '{@link flow.impl.CapacityBoundImpl <em>Capacity Bound</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.CapacityBoundImpl
		 * @see flow.impl.FlowPackageImpl#getCapacityBound()
		 * @generated
		 */
		EClass CAPACITY_BOUND = eINSTANCE.getCapacityBound();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPACITY_BOUND__CAPACITY = eINSTANCE.getCapacityBound_Capacity();

		/**
		 * The meta object literal for the '<em><b>Load</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPACITY_BOUND__LOAD = eINSTANCE.getCapacityBound_Load();

		/**
		 * The meta object literal for the '{@link flow.impl.SystemImpl <em>System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.SystemImpl
		 * @see flow.impl.FlowPackageImpl#getSystem()
		 * @generated
		 */
		EClass SYSTEM = eINSTANCE.getSystem();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ELEMENTS = eINSTANCE.getSystem_Elements();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__TEMPERATURE = eINSTANCE.getSystem_Temperature();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__WEIGHT = eINSTANCE.getSystem_Weight();

		/**
		 * The meta object literal for the '<em><b>Power Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__POWER_OUTPUTS = eINSTANCE.getSystem_PowerOutputs();

		/**
		 * The meta object literal for the '<em><b>Power Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__POWER_INPUTS = eINSTANCE.getSystem_PowerInputs();

		/**
		 * The meta object literal for the '<em><b>Routing Rules</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM__ROUTING_RULES = eINSTANCE.getSystem_RoutingRules();

		/**
		 * The meta object literal for the '<em><b>Routing Rules List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM__ROUTING_RULES_LIST = eINSTANCE.getSystem_RoutingRulesList();

		/**
		 * The meta object literal for the '{@link flow.impl.RoutingRuleImpl <em>Routing Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.RoutingRuleImpl
		 * @see flow.impl.FlowPackageImpl#getRoutingRule()
		 * @generated
		 */
		EClass ROUTING_RULE = eINSTANCE.getRoutingRule();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTING_RULE__TARGET = eINSTANCE.getRoutingRule_Target();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTING_RULE__PROPERTY_NAME = eINSTANCE.getRoutingRule_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTING_RULE__UNIT = eINSTANCE.getRoutingRule_Unit();

		/**
		 * The meta object literal for the '<em><b>Comparison Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTING_RULE__COMPARISON_OPERATOR = eINSTANCE.getRoutingRule_ComparisonOperator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTING_RULE__VALUE = eINSTANCE.getRoutingRule_Value();

		/**
		 * The meta object literal for the '<em><b>System Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTING_RULE__SYSTEM_STATUS = eINSTANCE.getRoutingRule_SystemStatus();

		/**
		 * The meta object literal for the '{@link flow.impl.PowerOutputImpl <em>Power Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.PowerOutputImpl
		 * @see flow.impl.FlowPackageImpl#getPowerOutput()
		 * @generated
		 */
		EClass POWER_OUTPUT = eINSTANCE.getPowerOutput();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWER_OUTPUT__POWER = eINSTANCE.getPowerOutput_Power();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_OUTPUT__LINKS = eINSTANCE.getPowerOutput_Links();

		/**
		 * The meta object literal for the '{@link flow.impl.PoweredImpl <em>Powered</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.PoweredImpl
		 * @see flow.impl.FlowPackageImpl#getPowered()
		 * @generated
		 */
		EClass POWERED = eINSTANCE.getPowered();

		/**
		 * The meta object literal for the '<em><b>Consumption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWERED__CONSUMPTION = eINSTANCE.getPowered_Consumption();

		/**
		 * The meta object literal for the '<em><b>Power Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POWERED__POWER_STATUS = eINSTANCE.getPowered_PowerStatus();

		/**
		 * The meta object literal for the '{@link flow.impl.PowerInputImpl <em>Power Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.PowerInputImpl
		 * @see flow.impl.FlowPackageImpl#getPowerInput()
		 * @generated
		 */
		EClass POWER_INPUT = eINSTANCE.getPowerInput();

		/**
		 * The meta object literal for the '{@link flow.impl.PowerLinkImpl <em>Power Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.PowerLinkImpl
		 * @see flow.impl.FlowPackageImpl#getPowerLink()
		 * @generated
		 */
		EClass POWER_LINK = eINSTANCE.getPowerLink();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_LINK__TARGET = eINSTANCE.getPowerLink_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_LINK__SOURCE = eINSTANCE.getPowerLink_Source();

		/**
		 * The meta object literal for the '{@link flow.impl.FlowSourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.FlowSourceImpl
		 * @see flow.impl.FlowPackageImpl#getFlowSource()
		 * @generated
		 */
		EClass FLOW_SOURCE = eINSTANCE.getFlowSource();

		/**
		 * The meta object literal for the '<em><b>Outgoing Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_SOURCE__OUTGOING_FLOWS = eINSTANCE.getFlowSource_OutgoingFlows();

		/**
		 * The meta object literal for the '{@link flow.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.ProcessorImpl
		 * @see flow.impl.FlowPackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__VOLUME = eINSTANCE.getProcessor_Volume();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__WEIGHT = eINSTANCE.getProcessor_Weight();

		/**
		 * The meta object literal for the '{@link flow.impl.FlowTargetImpl <em>Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.FlowTargetImpl
		 * @see flow.impl.FlowPackageImpl#getFlowTarget()
		 * @generated
		 */
		EClass FLOW_TARGET = eINSTANCE.getFlowTarget();

		/**
		 * The meta object literal for the '<em><b>Incoming Flows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW_TARGET__INCOMING_FLOWS = eINSTANCE.getFlowTarget_IncomingFlows();

		/**
		 * The meta object literal for the '{@link flow.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.DataSourceImpl
		 * @see flow.impl.FlowPackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_SOURCE__VOLUME = eINSTANCE.getDataSource_Volume();

		/**
		 * The meta object literal for the '{@link flow.impl.FlowElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.FlowElementImpl
		 * @see flow.impl.FlowPackageImpl#getFlowElement()
		 * @generated
		 */
		EClass FLOW_ELEMENT = eINSTANCE.getFlowElement();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_ELEMENT__STATUS = eINSTANCE.getFlowElement_Status();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW_ELEMENT__USAGE = eINSTANCE.getFlowElement_Usage();

		/**
		 * The meta object literal for the '{@link flow.impl.NamedImpl <em>Named</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.impl.NamedImpl
		 * @see flow.impl.FlowPackageImpl#getNamed()
		 * @generated
		 */
		EClass NAMED = eINSTANCE.getNamed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED__NAME = eINSTANCE.getNamed_Name();

		/**
		 * The meta object literal for the '{@link flow.SystemStatus <em>System Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.SystemStatus
		 * @see flow.impl.FlowPackageImpl#getSystemStatus()
		 * @generated
		 */
		EEnum SYSTEM_STATUS = eINSTANCE.getSystemStatus();

		/**
		 * The meta object literal for the '{@link flow.ComparisonOperator <em>Comparison Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.ComparisonOperator
		 * @see flow.impl.FlowPackageImpl#getComparisonOperator()
		 * @generated
		 */
		EEnum COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

		/**
		 * The meta object literal for the '{@link flow.SystemProperty <em>System Property</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.SystemProperty
		 * @see flow.impl.FlowPackageImpl#getSystemProperty()
		 * @generated
		 */
		EEnum SYSTEM_PROPERTY = eINSTANCE.getSystemProperty();

		/**
		 * The meta object literal for the '{@link flow.PropertyUnit <em>Property Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.PropertyUnit
		 * @see flow.impl.FlowPackageImpl#getPropertyUnit()
		 * @generated
		 */
		EEnum PROPERTY_UNIT = eINSTANCE.getPropertyUnit();

		/**
		 * The meta object literal for the '{@link flow.PoweredStatus <em>Powered Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.PoweredStatus
		 * @see flow.impl.FlowPackageImpl#getPoweredStatus()
		 * @generated
		 */
		EEnum POWERED_STATUS = eINSTANCE.getPoweredStatus();

		/**
		 * The meta object literal for the '{@link flow.FlowElementStatus <em>Element Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.FlowElementStatus
		 * @see flow.impl.FlowPackageImpl#getFlowElementStatus()
		 * @generated
		 */
		EEnum FLOW_ELEMENT_STATUS = eINSTANCE.getFlowElementStatus();

		/**
		 * The meta object literal for the '{@link flow.FlowElementUsage <em>Element Usage</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see flow.FlowElementUsage
		 * @see flow.impl.FlowPackageImpl#getFlowElementUsage()
		 * @generated
		 */
		EEnum FLOW_ELEMENT_USAGE = eINSTANCE.getFlowElementUsage();

	}

} //FlowPackage
