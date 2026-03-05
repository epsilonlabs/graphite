/**
 */
package flow.impl;

import flow.CapacityBound;
import flow.ComparisonOperator;
import flow.CompositeProcessor;
import flow.DataFlow;
import flow.DataSource;
import flow.Fan;
import flow.FlowElement;
import flow.FlowElementStatus;
import flow.FlowElementUsage;
import flow.FlowFactory;
import flow.FlowPackage;
import flow.FlowSource;
import flow.FlowTarget;
import flow.Named;
import flow.Physical;
import flow.PowerInput;
import flow.PowerLink;
import flow.PowerOutput;
import flow.Powered;
import flow.PoweredStatus;
import flow.Processor;
import flow.PropertyUnit;
import flow.RoutingRule;
import flow.SystemProperty;
import flow.SystemStatus;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import graphite.shared.ModelData;
import graphite.shared.WorkbenchData;

/**
 * <!-- begin-user-doc -->
* An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowPackageImpl extends EPackageImpl implements FlowPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeProcessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capacityBoundEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poweredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum systemStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisonOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum systemPropertyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum propertyUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum poweredStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flowElementStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum flowElementUsageEEnum = null;

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
	 * @see flow.FlowPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FlowPackageImpl() {
		super(eNS_URI, FlowFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FlowPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated NOT
	 */
	public static FlowPackage init() {
		if (isInited) return (FlowPackage)EPackage.Registry.INSTANCE.getEPackage(FlowPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFlowPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FlowPackageImpl theFlowPackage = registeredFlowPackage instanceof FlowPackageImpl ? (FlowPackageImpl)registeredFlowPackage : new FlowPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theFlowPackage.createPackageContents();

		// Initialize created meta-data
		theFlowPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFlowPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FlowPackage.eNS_URI, theFlowPackage);

		ModelData modelData = new ModelData(PropertiesData.derivedPropertiesData, PropertiesData.derivedPairsMappings, PropertiesData.identifierAttributeByType, PropertiesData.resolvers);
		WorkbenchData.setModelData(modelData);

		return theFlowPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFan() {
		return fanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFan_Speed() {
		return (EAttribute)fanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFan_Weight() {
		return (EAttribute)fanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysical() {
		return physicalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeProcessor() {
		return compositeProcessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFlow() {
		return dataFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFlow_Target() {
		return (EReference)dataFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataFlow_Source() {
		return (EReference)dataFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapacityBound() {
		return capacityBoundEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapacityBound_Capacity() {
		return (EAttribute)capacityBoundEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapacityBound_Load() {
		return (EAttribute)capacityBoundEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystem() {
		return systemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_Elements() {
		return (EReference)systemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Temperature() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_Weight() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_PowerOutputs() {
		return (EReference)systemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_PowerInputs() {
		return (EReference)systemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystem_RoutingRules() {
		return (EAttribute)systemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystem_RoutingRulesList() {
		return (EReference)systemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoutingRule() {
		return routingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoutingRule_Target() {
		return (EReference)routingRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingRule_PropertyName() {
		return (EAttribute)routingRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingRule_Unit() {
		return (EAttribute)routingRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingRule_ComparisonOperator() {
		return (EAttribute)routingRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingRule_Value() {
		return (EAttribute)routingRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoutingRule_SystemStatus() {
		return (EAttribute)routingRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerOutput() {
		return powerOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowerOutput_Power() {
		return (EAttribute)powerOutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerOutput_Links() {
		return (EReference)powerOutputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowered() {
		return poweredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowered_Consumption() {
		return (EAttribute)poweredEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPowered_PowerStatus() {
		return (EAttribute)poweredEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerInput() {
		return powerInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerLink() {
		return powerLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerLink_Target() {
		return (EReference)powerLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPowerLink_Source() {
		return (EReference)powerLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowSource() {
		return flowSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowSource_OutgoingFlows() {
		return (EReference)flowSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessor() {
		return processorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Volume() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Weight() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowTarget() {
		return flowTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowTarget_IncomingFlows() {
		return (EReference)flowTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSource() {
		return dataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataSource_Volume() {
		return (EAttribute)dataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowElement() {
		return flowElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowElement_Status() {
		return (EAttribute)flowElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlowElement_Usage() {
		return (EAttribute)flowElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamed() {
		return namedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamed_Name() {
		return (EAttribute)namedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSystemStatus() {
		return systemStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparisonOperator() {
		return comparisonOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSystemProperty() {
		return systemPropertyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPropertyUnit() {
		return propertyUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPoweredStatus() {
		return poweredStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFlowElementStatus() {
		return flowElementStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFlowElementUsage() {
		return flowElementUsageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowFactory getFlowFactory() {
		return (FlowFactory)getEFactoryInstance();
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
		fanEClass = createEClass(FAN);
		createEAttribute(fanEClass, FAN__SPEED);
		createEAttribute(fanEClass, FAN__WEIGHT);

		physicalEClass = createEClass(PHYSICAL);

		compositeProcessorEClass = createEClass(COMPOSITE_PROCESSOR);

		dataFlowEClass = createEClass(DATA_FLOW);
		createEReference(dataFlowEClass, DATA_FLOW__TARGET);
		createEReference(dataFlowEClass, DATA_FLOW__SOURCE);

		capacityBoundEClass = createEClass(CAPACITY_BOUND);
		createEAttribute(capacityBoundEClass, CAPACITY_BOUND__CAPACITY);
		createEAttribute(capacityBoundEClass, CAPACITY_BOUND__LOAD);

		systemEClass = createEClass(SYSTEM);
		createEReference(systemEClass, SYSTEM__ELEMENTS);
		createEAttribute(systemEClass, SYSTEM__TEMPERATURE);
		createEAttribute(systemEClass, SYSTEM__WEIGHT);
		createEReference(systemEClass, SYSTEM__POWER_OUTPUTS);
		createEReference(systemEClass, SYSTEM__POWER_INPUTS);
		createEAttribute(systemEClass, SYSTEM__ROUTING_RULES);
		createEReference(systemEClass, SYSTEM__ROUTING_RULES_LIST);

		routingRuleEClass = createEClass(ROUTING_RULE);
		createEReference(routingRuleEClass, ROUTING_RULE__TARGET);
		createEAttribute(routingRuleEClass, ROUTING_RULE__PROPERTY_NAME);
		createEAttribute(routingRuleEClass, ROUTING_RULE__UNIT);
		createEAttribute(routingRuleEClass, ROUTING_RULE__COMPARISON_OPERATOR);
		createEAttribute(routingRuleEClass, ROUTING_RULE__VALUE);
		createEAttribute(routingRuleEClass, ROUTING_RULE__SYSTEM_STATUS);

		powerOutputEClass = createEClass(POWER_OUTPUT);
		createEAttribute(powerOutputEClass, POWER_OUTPUT__POWER);
		createEReference(powerOutputEClass, POWER_OUTPUT__LINKS);

		poweredEClass = createEClass(POWERED);
		createEAttribute(poweredEClass, POWERED__CONSUMPTION);
		createEAttribute(poweredEClass, POWERED__POWER_STATUS);

		powerInputEClass = createEClass(POWER_INPUT);

		powerLinkEClass = createEClass(POWER_LINK);
		createEReference(powerLinkEClass, POWER_LINK__TARGET);
		createEReference(powerLinkEClass, POWER_LINK__SOURCE);

		flowSourceEClass = createEClass(FLOW_SOURCE);
		createEReference(flowSourceEClass, FLOW_SOURCE__OUTGOING_FLOWS);

		processorEClass = createEClass(PROCESSOR);
		createEAttribute(processorEClass, PROCESSOR__VOLUME);
		createEAttribute(processorEClass, PROCESSOR__WEIGHT);

		flowTargetEClass = createEClass(FLOW_TARGET);
		createEReference(flowTargetEClass, FLOW_TARGET__INCOMING_FLOWS);

		dataSourceEClass = createEClass(DATA_SOURCE);
		createEAttribute(dataSourceEClass, DATA_SOURCE__VOLUME);

		flowElementEClass = createEClass(FLOW_ELEMENT);
		createEAttribute(flowElementEClass, FLOW_ELEMENT__STATUS);
		createEAttribute(flowElementEClass, FLOW_ELEMENT__USAGE);

		namedEClass = createEClass(NAMED);
		createEAttribute(namedEClass, NAMED__NAME);

		// Create enums
		systemStatusEEnum = createEEnum(SYSTEM_STATUS);
		comparisonOperatorEEnum = createEEnum(COMPARISON_OPERATOR);
		systemPropertyEEnum = createEEnum(SYSTEM_PROPERTY);
		propertyUnitEEnum = createEEnum(PROPERTY_UNIT);
		poweredStatusEEnum = createEEnum(POWERED_STATUS);
		flowElementStatusEEnum = createEEnum(FLOW_ELEMENT_STATUS);
		flowElementUsageEEnum = createEEnum(FLOW_ELEMENT_USAGE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fanEClass.getESuperTypes().add(this.getFlowElement());
		fanEClass.getESuperTypes().add(this.getPowered());
		compositeProcessorEClass.getESuperTypes().add(this.getSystem());
		compositeProcessorEClass.getESuperTypes().add(this.getFlowTarget());
		compositeProcessorEClass.getESuperTypes().add(this.getCapacityBound());
		compositeProcessorEClass.getESuperTypes().add(this.getFlowSource());
		dataFlowEClass.getESuperTypes().add(this.getCapacityBound());
		capacityBoundEClass.getESuperTypes().add(this.getFlowElement());
		systemEClass.getESuperTypes().add(this.getPowered());
		systemEClass.getESuperTypes().add(this.getFlowSource());
		systemEClass.getESuperTypes().add(this.getNamed());
		flowSourceEClass.getESuperTypes().add(this.getFlowElement());
		processorEClass.getESuperTypes().add(this.getFlowTarget());
		processorEClass.getESuperTypes().add(this.getCapacityBound());
		processorEClass.getESuperTypes().add(this.getFlowSource());
		processorEClass.getESuperTypes().add(this.getPowered());
		processorEClass.getESuperTypes().add(this.getNamed());
		flowTargetEClass.getESuperTypes().add(this.getFlowElement());
		dataSourceEClass.getESuperTypes().add(this.getFlowSource());
		dataSourceEClass.getESuperTypes().add(this.getNamed());

		// Initialize classes and features; add operations and parameters
		initEClass(fanEClass, Fan.class, "Fan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFan_Speed(), ecorePackage.getEInt(), "speed", "100", 1, 1, Fan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFan_Weight(), ecorePackage.getEInt(), "weight", "3", 1, 1, Fan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalEClass, Physical.class, "Physical", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeProcessorEClass, CompositeProcessor.class, "CompositeProcessor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataFlowEClass, DataFlow.class, "DataFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataFlow_Target(), this.getFlowTarget(), this.getFlowTarget_IncomingFlows(), "target", null, 1, 1, DataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataFlow_Source(), this.getFlowSource(), this.getFlowSource_OutgoingFlows(), "source", null, 1, 1, DataFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capacityBoundEClass, CapacityBound.class, "CapacityBound", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCapacityBound_Capacity(), ecorePackage.getEInt(), "capacity", "10", 1, 1, CapacityBound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapacityBound_Load(), ecorePackage.getEInt(), "load", "0", 1, 1, CapacityBound.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemEClass, flow.System.class, "System", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystem_Elements(), this.getFlowElement(), null, "elements", null, 0, -1, flow.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Temperature(), ecorePackage.getEInt(), "temperature", "0", 0, 1, flow.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_Weight(), ecorePackage.getEInt(), "weight", "0", 0, 1, flow.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_PowerOutputs(), this.getPowerOutput(), null, "powerOutputs", null, 0, -1, flow.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_PowerInputs(), this.getPowerInput(), null, "powerInputs", null, 0, -1, flow.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystem_RoutingRules(), ecorePackage.getEString(), "routingRules", null, 0, 1, flow.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystem_RoutingRulesList(), this.getRoutingRule(), null, "routingRulesList", null, 0, -1, flow.System.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routingRuleEClass, RoutingRule.class, "RoutingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoutingRule_Target(), this.getSystem(), null, "target", null, 0, 1, RoutingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoutingRule_PropertyName(), this.getSystemProperty(), "propertyName", null, 0, 1, RoutingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoutingRule_Unit(), this.getPropertyUnit(), "unit", null, 0, 1, RoutingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoutingRule_ComparisonOperator(), this.getComparisonOperator(), "comparisonOperator", null, 0, 1, RoutingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoutingRule_Value(), ecorePackage.getEInt(), "value", null, 0, 1, RoutingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRoutingRule_SystemStatus(), this.getSystemStatus(), "systemStatus", null, 0, 1, RoutingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerOutputEClass, PowerOutput.class, "PowerOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPowerOutput_Power(), ecorePackage.getEInt(), "power", "1000", 1, 1, PowerOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPowerOutput_Links(), this.getPowerLink(), this.getPowerLink_Source(), "links", null, 0, -1, PowerOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poweredEClass, Powered.class, "Powered", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPowered_Consumption(), ecorePackage.getEInt(), "consumption", "0", 0, 1, Powered.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPowered_PowerStatus(), this.getPoweredStatus(), "powerStatus", null, 1, 1, Powered.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerInputEClass, PowerInput.class, "PowerInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(powerLinkEClass, PowerLink.class, "PowerLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPowerLink_Target(), this.getPowerInput(), null, "target", null, 0, 1, PowerLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPowerLink_Source(), this.getPowerOutput(), this.getPowerOutput_Links(), "source", null, 0, 1, PowerLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowSourceEClass, FlowSource.class, "FlowSource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowSource_OutgoingFlows(), this.getDataFlow(), this.getDataFlow_Source(), "outgoingFlows", null, 0, -1, FlowSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processorEClass, Processor.class, "Processor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessor_Volume(), ecorePackage.getEInt(), "volume", "2", 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessor_Weight(), ecorePackage.getEInt(), "weight", "10", 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowTargetEClass, FlowTarget.class, "FlowTarget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowTarget_IncomingFlows(), this.getDataFlow(), this.getDataFlow_Target(), "incomingFlows", null, 0, -1, FlowTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSourceEClass, DataSource.class, "DataSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataSource_Volume(), ecorePackage.getEInt(), "volume", "2", 1, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowElementEClass, FlowElement.class, "FlowElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlowElement_Status(), this.getFlowElementStatus(), "status", "active", 1, 1, FlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlowElement_Usage(), this.getFlowElementUsage(), "usage", null, 1, 1, FlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedEClass, Named.class, "Named", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamed_Name(), ecorePackage.getEString(), "name", null, 0, 1, Named.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(systemStatusEEnum, SystemStatus.class, "SystemStatus");
		addEEnumLiteral(systemStatusEEnum, SystemStatus.LOW);
		addEEnumLiteral(systemStatusEEnum, SystemStatus.MEDIUM);
		addEEnumLiteral(systemStatusEEnum, SystemStatus.HIGH);
		addEEnumLiteral(systemStatusEEnum, SystemStatus.NON_CRITICAL);
		addEEnumLiteral(systemStatusEEnum, SystemStatus.CRITICAL);
		addEEnumLiteral(systemStatusEEnum, SystemStatus.BLOCKER);

		initEEnum(comparisonOperatorEEnum, ComparisonOperator.class, "ComparisonOperator");
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.LOWER_THAN);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.GREATHER_THAN);
		addEEnumLiteral(comparisonOperatorEEnum, ComparisonOperator.EQUALS);

		initEEnum(systemPropertyEEnum, SystemProperty.class, "SystemProperty");
		addEEnumLiteral(systemPropertyEEnum, SystemProperty.TEMPERATURE);
		addEEnumLiteral(systemPropertyEEnum, SystemProperty.WEIGHT);

		initEEnum(propertyUnitEEnum, PropertyUnit.class, "PropertyUnit");
		addEEnumLiteral(propertyUnitEEnum, PropertyUnit.CELSIUS);
		addEEnumLiteral(propertyUnitEEnum, PropertyUnit.FAHRENHEIT);
		addEEnumLiteral(propertyUnitEEnum, PropertyUnit.KILOGRAMS);
		addEEnumLiteral(propertyUnitEEnum, PropertyUnit.POUNDS);

		initEEnum(poweredStatusEEnum, PoweredStatus.class, "PoweredStatus");
		addEEnumLiteral(poweredStatusEEnum, PoweredStatus.NONE);
		addEEnumLiteral(poweredStatusEEnum, PoweredStatus.LOW);
		addEEnumLiteral(poweredStatusEEnum, PoweredStatus.OK);

		initEEnum(flowElementStatusEEnum, FlowElementStatus.class, "FlowElementStatus");
		addEEnumLiteral(flowElementStatusEEnum, FlowElementStatus.INACTIVE);
		addEEnumLiteral(flowElementStatusEEnum, FlowElementStatus.ACTIVE);

		initEEnum(flowElementUsageEEnum, FlowElementUsage.class, "FlowElementUsage");
		addEEnumLiteral(flowElementUsageEEnum, FlowElementUsage.UNUSED);
		addEEnumLiteral(flowElementUsageEEnum, FlowElementUsage.LOW);
		addEEnumLiteral(flowElementUsageEEnum, FlowElementUsage.STANDARD);
		addEEnumLiteral(flowElementUsageEEnum, FlowElementUsage.HIGH);
		addEEnumLiteral(flowElementUsageEEnum, FlowElementUsage.OVER);

		// Create resource
		createResource(eNS_URI);

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
		  (compositeProcessorEClass,
		   source,
		   new String[] {
			   "feature", "routingRules",
			   "derive", "routingRulesList",
			   "grammar", "fr.obeo.dsl.designer.sample.flow.xtext.FlowDesigner",
			   "entryRule", "Main"
		   });
	}

} //FlowPackageImpl (Patched)