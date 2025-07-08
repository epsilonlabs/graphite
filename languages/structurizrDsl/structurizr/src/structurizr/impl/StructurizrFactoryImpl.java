/**
 */
package structurizr.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import structurizr.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructurizrFactoryImpl extends EFactoryImpl implements StructurizrFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StructurizrFactory init() {
		try {
			StructurizrFactory theStructurizrFactory = (StructurizrFactory)EPackage.Registry.INSTANCE.getEFactory(StructurizrPackage.eNS_URI);
			if (theStructurizrFactory != null) {
				return theStructurizrFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StructurizrFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructurizrFactoryImpl() {
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
			case StructurizrPackage.WORKSPACE: return createWorkspace();
			case StructurizrPackage.CONFIGURATION: return createConfiguration();
			case StructurizrPackage.PROPERTY: return createProperty();
			case StructurizrPackage.USER: return createUser();
			case StructurizrPackage.RELATIONSHIP: return createRelationship();
			case StructurizrPackage.TAG: return createTag();
			case StructurizrPackage.TECHNOLOGY: return createTechnology();
			case StructurizrPackage.PERSPECTIVE: return createPerspective();
			case StructurizrPackage.MODEL: return createModel();
			case StructurizrPackage.ELEMENT: return createElement();
			case StructurizrPackage.PERSON: return createPerson();
			case StructurizrPackage.SOFTWARE_SYSTEM: return createSoftwareSystem();
			case StructurizrPackage.CONTAINER: return createContainer();
			case StructurizrPackage.COMPONENT: return createComponent();
			case StructurizrPackage.DEPLOYMENT_ENVIRONMENT: return createDeploymentEnvironment();
			case StructurizrPackage.DEPLOYMENT_GROUP: return createDeploymentGroup();
			case StructurizrPackage.DEPLOYMENT_NODE: return createDeploymentNode();
			case StructurizrPackage.INFRASTRUCTURE_NODE: return createInfrastructureNode();
			case StructurizrPackage.SOFTWARE_SYSTEM_INSTANCE: return createSoftwareSystemInstance();
			case StructurizrPackage.CONTAINER_INSTANCE: return createContainerInstance();
			case StructurizrPackage.HEALTH_CHECK: return createHealthCheck();
			case StructurizrPackage.VIEWS: return createViews();
			case StructurizrPackage.SYSTEM_LANDSCAPE_VIEW: return createSystemLandscapeView();
			case StructurizrPackage.SYSTEM_CONTEXT_VIEW: return createSystemContextView();
			case StructurizrPackage.CONTAINER_VIEW: return createContainerView();
			case StructurizrPackage.COMPONENT_VIEW: return createComponentView();
			case StructurizrPackage.AUTO_LAYOUT: return createAutoLayout();
			case StructurizrPackage.ELEMENT_STYLE: return createElementStyle();
			case StructurizrPackage.RELATIONSHIP_STYLE: return createRelationshipStyle();
			case StructurizrPackage.NO_FILTER_CONDITION: return createNoFilterCondition();
			case StructurizrPackage.COMPOSITE_CONDITION: return createCompositeCondition();
			case StructurizrPackage.ELEMENT_TAG_CONDITION: return createElementTagCondition();
			case StructurizrPackage.ELEMENT_TECHNOLOGY_CONDITION: return createElementTechnologyCondition();
			case StructurizrPackage.ELEMENT_TYPE_CONDITION: return createElementTypeCondition();
			case StructurizrPackage.ELEMENT_PROPERTY_CONDITION: return createElementPropertyCondition();
			case StructurizrPackage.ELEMENT_PARENT_CONDITION: return createElementParentCondition();
			case StructurizrPackage.RELATIONSHIP_TAG_CONDITION: return createRelationshipTagCondition();
			case StructurizrPackage.RELATIONSHIP_PROPERTY_CONDITION: return createRelationshipPropertyCondition();
			case StructurizrPackage.RELATIONSHIP_SOURCE_CONDITION: return createRelationshipSourceCondition();
			case StructurizrPackage.RELATIONSHIP_DESTINATION_CONDITION: return createRelationshipDestinationCondition();
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
			case StructurizrPackage.AUTO_LAYOUT_OPTION:
				return createAutoLayoutOptionFromString(eDataType, initialValue);
			case StructurizrPackage.ROUTING:
				return createRoutingFromString(eDataType, initialValue);
			case StructurizrPackage.BORDER:
				return createBorderFromString(eDataType, initialValue);
			case StructurizrPackage.SCOPE:
				return createScopeFromString(eDataType, initialValue);
			case StructurizrPackage.VISIBILITY:
				return createVisibilityFromString(eDataType, initialValue);
			case StructurizrPackage.USER_PERMISSION:
				return createUserPermissionFromString(eDataType, initialValue);
			case StructurizrPackage.SHAPE:
				return createShapeFromString(eDataType, initialValue);
			case StructurizrPackage.CONDITION_COMPARISON_OPERATION:
				return createConditionComparisonOperationFromString(eDataType, initialValue);
			case StructurizrPackage.FILTER_TYPE:
				return createFilterTypeFromString(eDataType, initialValue);
			case StructurizrPackage.CONDITION_LOGICAL_OPERATION:
				return createConditionLogicalOperationFromString(eDataType, initialValue);
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
			case StructurizrPackage.AUTO_LAYOUT_OPTION:
				return convertAutoLayoutOptionToString(eDataType, instanceValue);
			case StructurizrPackage.ROUTING:
				return convertRoutingToString(eDataType, instanceValue);
			case StructurizrPackage.BORDER:
				return convertBorderToString(eDataType, instanceValue);
			case StructurizrPackage.SCOPE:
				return convertScopeToString(eDataType, instanceValue);
			case StructurizrPackage.VISIBILITY:
				return convertVisibilityToString(eDataType, instanceValue);
			case StructurizrPackage.USER_PERMISSION:
				return convertUserPermissionToString(eDataType, instanceValue);
			case StructurizrPackage.SHAPE:
				return convertShapeToString(eDataType, instanceValue);
			case StructurizrPackage.CONDITION_COMPARISON_OPERATION:
				return convertConditionComparisonOperationToString(eDataType, instanceValue);
			case StructurizrPackage.FILTER_TYPE:
				return convertFilterTypeToString(eDataType, instanceValue);
			case StructurizrPackage.CONDITION_LOGICAL_OPERATION:
				return convertConditionLogicalOperationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workspace createWorkspace() {
		WorkspaceImpl workspace = new WorkspaceImpl();
		return workspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship createRelationship() {
		RelationshipImpl relationship = new RelationshipImpl();
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Technology createTechnology() {
		TechnologyImpl technology = new TechnologyImpl();
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Perspective createPerspective() {
		PerspectiveImpl perspective = new PerspectiveImpl();
		return perspective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareSystem createSoftwareSystem() {
		SoftwareSystemImpl softwareSystem = new SoftwareSystemImpl();
		return softwareSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public structurizr.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentEnvironment createDeploymentEnvironment() {
		DeploymentEnvironmentImpl deploymentEnvironment = new DeploymentEnvironmentImpl();
		return deploymentEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentGroup createDeploymentGroup() {
		DeploymentGroupImpl deploymentGroup = new DeploymentGroupImpl();
		return deploymentGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentNode createDeploymentNode() {
		DeploymentNodeImpl deploymentNode = new DeploymentNodeImpl();
		return deploymentNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureNode createInfrastructureNode() {
		InfrastructureNodeImpl infrastructureNode = new InfrastructureNodeImpl();
		return infrastructureNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareSystemInstance createSoftwareSystemInstance() {
		SoftwareSystemInstanceImpl softwareSystemInstance = new SoftwareSystemInstanceImpl();
		return softwareSystemInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerInstance createContainerInstance() {
		ContainerInstanceImpl containerInstance = new ContainerInstanceImpl();
		return containerInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthCheck createHealthCheck() {
		HealthCheckImpl healthCheck = new HealthCheckImpl();
		return healthCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Views createViews() {
		ViewsImpl views = new ViewsImpl();
		return views;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemLandscapeView createSystemLandscapeView() {
		SystemLandscapeViewImpl systemLandscapeView = new SystemLandscapeViewImpl();
		return systemLandscapeView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemContextView createSystemContextView() {
		SystemContextViewImpl systemContextView = new SystemContextViewImpl();
		return systemContextView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerView createContainerView() {
		ContainerViewImpl containerView = new ContainerViewImpl();
		return containerView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentView createComponentView() {
		ComponentViewImpl componentView = new ComponentViewImpl();
		return componentView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoLayout createAutoLayout() {
		AutoLayoutImpl autoLayout = new AutoLayoutImpl();
		return autoLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementStyle createElementStyle() {
		ElementStyleImpl elementStyle = new ElementStyleImpl();
		return elementStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipStyle createRelationshipStyle() {
		RelationshipStyleImpl relationshipStyle = new RelationshipStyleImpl();
		return relationshipStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoFilterCondition createNoFilterCondition() {
		NoFilterConditionImpl noFilterCondition = new NoFilterConditionImpl();
		return noFilterCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeCondition createCompositeCondition() {
		CompositeConditionImpl compositeCondition = new CompositeConditionImpl();
		return compositeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementTagCondition createElementTagCondition() {
		ElementTagConditionImpl elementTagCondition = new ElementTagConditionImpl();
		return elementTagCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementTechnologyCondition createElementTechnologyCondition() {
		ElementTechnologyConditionImpl elementTechnologyCondition = new ElementTechnologyConditionImpl();
		return elementTechnologyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementTypeCondition createElementTypeCondition() {
		ElementTypeConditionImpl elementTypeCondition = new ElementTypeConditionImpl();
		return elementTypeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementPropertyCondition createElementPropertyCondition() {
		ElementPropertyConditionImpl elementPropertyCondition = new ElementPropertyConditionImpl();
		return elementPropertyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementParentCondition createElementParentCondition() {
		ElementParentConditionImpl elementParentCondition = new ElementParentConditionImpl();
		return elementParentCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipTagCondition createRelationshipTagCondition() {
		RelationshipTagConditionImpl relationshipTagCondition = new RelationshipTagConditionImpl();
		return relationshipTagCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipPropertyCondition createRelationshipPropertyCondition() {
		RelationshipPropertyConditionImpl relationshipPropertyCondition = new RelationshipPropertyConditionImpl();
		return relationshipPropertyCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipSourceCondition createRelationshipSourceCondition() {
		RelationshipSourceConditionImpl relationshipSourceCondition = new RelationshipSourceConditionImpl();
		return relationshipSourceCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipDestinationCondition createRelationshipDestinationCondition() {
		RelationshipDestinationConditionImpl relationshipDestinationCondition = new RelationshipDestinationConditionImpl();
		return relationshipDestinationCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoLayoutOption createAutoLayoutOptionFromString(EDataType eDataType, String initialValue) {
		AutoLayoutOption result = AutoLayoutOption.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAutoLayoutOptionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Routing createRoutingFromString(EDataType eDataType, String initialValue) {
		Routing result = Routing.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoutingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Border createBorderFromString(EDataType eDataType, String initialValue) {
		Border result = Border.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBorderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope createScopeFromString(EDataType eDataType, String initialValue) {
		Scope result = Scope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visibility createVisibilityFromString(EDataType eDataType, String initialValue) {
		Visibility result = Visibility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVisibilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserPermission createUserPermissionFromString(EDataType eDataType, String initialValue) {
		UserPermission result = UserPermission.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUserPermissionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape createShapeFromString(EDataType eDataType, String initialValue) {
		Shape result = Shape.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShapeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionComparisonOperation createConditionComparisonOperationFromString(EDataType eDataType, String initialValue) {
		ConditionComparisonOperation result = ConditionComparisonOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionComparisonOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType createFilterTypeFromString(EDataType eDataType, String initialValue) {
		FilterType result = FilterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFilterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionLogicalOperation createConditionLogicalOperationFromString(EDataType eDataType, String initialValue) {
		ConditionLogicalOperation result = ConditionLogicalOperation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionLogicalOperationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructurizrPackage getStructurizrPackage() {
		return (StructurizrPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StructurizrPackage getPackage() {
		return StructurizrPackage.eINSTANCE;
	}

} //StructurizrFactoryImpl
