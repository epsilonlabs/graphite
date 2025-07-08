/**
 */
package structurizr;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see structurizr.StructurizrPackage
 * @generated
 */
public interface StructurizrFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated NOT
	*/
	StructurizrFactory eINSTANCE = structurizr.impl.XtextStructurizrFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Workspace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workspace</em>'.
	 * @generated
	 */
	Workspace createWorkspace();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship</em>'.
	 * @generated
	 */
	Relationship createRelationship();

	/**
	 * Returns a new object of class '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag</em>'.
	 * @generated
	 */
	Tag createTag();

	/**
	 * Returns a new object of class '<em>Technology</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Technology</em>'.
	 * @generated
	 */
	Technology createTechnology();

	/**
	 * Returns a new object of class '<em>Perspective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perspective</em>'.
	 * @generated
	 */
	Perspective createPerspective();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	Element createElement();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Software System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software System</em>'.
	 * @generated
	 */
	SoftwareSystem createSoftwareSystem();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	Container createContainer();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Deployment Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Environment</em>'.
	 * @generated
	 */
	DeploymentEnvironment createDeploymentEnvironment();

	/**
	 * Returns a new object of class '<em>Deployment Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Group</em>'.
	 * @generated
	 */
	DeploymentGroup createDeploymentGroup();

	/**
	 * Returns a new object of class '<em>Deployment Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Deployment Node</em>'.
	 * @generated
	 */
	DeploymentNode createDeploymentNode();

	/**
	 * Returns a new object of class '<em>Infrastructure Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infrastructure Node</em>'.
	 * @generated
	 */
	InfrastructureNode createInfrastructureNode();

	/**
	 * Returns a new object of class '<em>Software System Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software System Instance</em>'.
	 * @generated
	 */
	SoftwareSystemInstance createSoftwareSystemInstance();

	/**
	 * Returns a new object of class '<em>Container Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Instance</em>'.
	 * @generated
	 */
	ContainerInstance createContainerInstance();

	/**
	 * Returns a new object of class '<em>Health Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Health Check</em>'.
	 * @generated
	 */
	HealthCheck createHealthCheck();

	/**
	 * Returns a new object of class '<em>Views</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Views</em>'.
	 * @generated
	 */
	Views createViews();

	/**
	 * Returns a new object of class '<em>System Landscape View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Landscape View</em>'.
	 * @generated
	 */
	SystemLandscapeView createSystemLandscapeView();

	/**
	 * Returns a new object of class '<em>System Context View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Context View</em>'.
	 * @generated
	 */
	SystemContextView createSystemContextView();

	/**
	 * Returns a new object of class '<em>Container View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container View</em>'.
	 * @generated
	 */
	ContainerView createContainerView();

	/**
	 * Returns a new object of class '<em>Component View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component View</em>'.
	 * @generated
	 */
	ComponentView createComponentView();

	/**
	 * Returns a new object of class '<em>Auto Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auto Layout</em>'.
	 * @generated
	 */
	AutoLayout createAutoLayout();

	/**
	 * Returns a new object of class '<em>Element Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Style</em>'.
	 * @generated
	 */
	ElementStyle createElementStyle();

	/**
	 * Returns a new object of class '<em>Relationship Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship Style</em>'.
	 * @generated
	 */
	RelationshipStyle createRelationshipStyle();

	/**
	 * Returns a new object of class '<em>No Filter Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>No Filter Condition</em>'.
	 * @generated
	 */
	NoFilterCondition createNoFilterCondition();

	/**
	 * Returns a new object of class '<em>Composite Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Condition</em>'.
	 * @generated
	 */
	CompositeCondition createCompositeCondition();

	/**
	 * Returns a new object of class '<em>Element Tag Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Tag Condition</em>'.
	 * @generated
	 */
	ElementTagCondition createElementTagCondition();

	/**
	 * Returns a new object of class '<em>Element Technology Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Technology Condition</em>'.
	 * @generated
	 */
	ElementTechnologyCondition createElementTechnologyCondition();

	/**
	 * Returns a new object of class '<em>Element Type Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Type Condition</em>'.
	 * @generated
	 */
	ElementTypeCondition createElementTypeCondition();

	/**
	 * Returns a new object of class '<em>Element Property Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Property Condition</em>'.
	 * @generated
	 */
	ElementPropertyCondition createElementPropertyCondition();

	/**
	 * Returns a new object of class '<em>Element Parent Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Parent Condition</em>'.
	 * @generated
	 */
	ElementParentCondition createElementParentCondition();

	/**
	 * Returns a new object of class '<em>Relationship Tag Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship Tag Condition</em>'.
	 * @generated
	 */
	RelationshipTagCondition createRelationshipTagCondition();

	/**
	 * Returns a new object of class '<em>Relationship Property Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship Property Condition</em>'.
	 * @generated
	 */
	RelationshipPropertyCondition createRelationshipPropertyCondition();

	/**
	 * Returns a new object of class '<em>Relationship Source Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship Source Condition</em>'.
	 * @generated
	 */
	RelationshipSourceCondition createRelationshipSourceCondition();

	/**
	 * Returns a new object of class '<em>Relationship Destination Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relationship Destination Condition</em>'.
	 * @generated
	 */
	RelationshipDestinationCondition createRelationshipDestinationCondition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StructurizrPackage getStructurizrPackage();

} //StructurizrFactory (Patched)