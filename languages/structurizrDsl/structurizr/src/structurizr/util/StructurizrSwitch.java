/**
 */
package structurizr.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import structurizr.*;

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
 * @see structurizr.StructurizrPackage
 * @generated
 */
public class StructurizrSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StructurizrPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructurizrSwitch() {
		if (modelPackage == null) {
			modelPackage = StructurizrPackage.eINSTANCE;
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
			case StructurizrPackage.WORKSPACE: {
				Workspace workspace = (Workspace)theEObject;
				T result = caseWorkspace(workspace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.IDENTIFIABLE_ELEMENT: {
				IdentifiableElement identifiableElement = (IdentifiableElement)theEObject;
				T result = caseIdentifiableElement(identifiableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.C4_ELEMENT: {
				C4Element c4Element = (C4Element)theEObject;
				T result = caseC4Element(c4Element);
				if (result == null) result = caseIdentifiableElement(c4Element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.TECHNOLOGY: {
				Technology technology = (Technology)theEObject;
				T result = caseTechnology(technology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.PERSPECTIVE: {
				Perspective perspective = (Perspective)theEObject;
				T result = casePerspective(perspective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = caseC4Element(element);
				if (result == null) result = caseIdentifiableElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.PERSON: {
				Person person = (Person)theEObject;
				T result = casePerson(person);
				if (result == null) result = caseC4Element(person);
				if (result == null) result = caseIdentifiableElement(person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.SOFTWARE_SYSTEM: {
				SoftwareSystem softwareSystem = (SoftwareSystem)theEObject;
				T result = caseSoftwareSystem(softwareSystem);
				if (result == null) result = caseC4Element(softwareSystem);
				if (result == null) result = caseIdentifiableElement(softwareSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = caseC4Element(container);
				if (result == null) result = caseIdentifiableElement(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseC4Element(component);
				if (result == null) result = caseIdentifiableElement(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.DEPLOYMENT_ENVIRONMENT: {
				DeploymentEnvironment deploymentEnvironment = (DeploymentEnvironment)theEObject;
				T result = caseDeploymentEnvironment(deploymentEnvironment);
				if (result == null) result = caseIdentifiableElement(deploymentEnvironment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.DEPLOYMENT_GROUP: {
				DeploymentGroup deploymentGroup = (DeploymentGroup)theEObject;
				T result = caseDeploymentGroup(deploymentGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.DEPLOYMENT_NODE: {
				DeploymentNode deploymentNode = (DeploymentNode)theEObject;
				T result = caseDeploymentNode(deploymentNode);
				if (result == null) result = caseC4Element(deploymentNode);
				if (result == null) result = caseIdentifiableElement(deploymentNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.INFRASTRUCTURE_NODE: {
				InfrastructureNode infrastructureNode = (InfrastructureNode)theEObject;
				T result = caseInfrastructureNode(infrastructureNode);
				if (result == null) result = caseC4Element(infrastructureNode);
				if (result == null) result = caseIdentifiableElement(infrastructureNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.SOFTWARE_SYSTEM_INSTANCE: {
				SoftwareSystemInstance softwareSystemInstance = (SoftwareSystemInstance)theEObject;
				T result = caseSoftwareSystemInstance(softwareSystemInstance);
				if (result == null) result = caseC4Element(softwareSystemInstance);
				if (result == null) result = caseIdentifiableElement(softwareSystemInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.CONTAINER_INSTANCE: {
				ContainerInstance containerInstance = (ContainerInstance)theEObject;
				T result = caseContainerInstance(containerInstance);
				if (result == null) result = caseC4Element(containerInstance);
				if (result == null) result = caseIdentifiableElement(containerInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.HEALTH_CHECK: {
				HealthCheck healthCheck = (HealthCheck)theEObject;
				T result = caseHealthCheck(healthCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.VIEWS: {
				Views views = (Views)theEObject;
				T result = caseViews(views);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.VIEW_ELEMENT: {
				ViewElement viewElement = (ViewElement)theEObject;
				T result = caseViewElement(viewElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.SYSTEM_LANDSCAPE_VIEW: {
				SystemLandscapeView systemLandscapeView = (SystemLandscapeView)theEObject;
				T result = caseSystemLandscapeView(systemLandscapeView);
				if (result == null) result = caseViewElement(systemLandscapeView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.SYSTEM_CONTEXT_VIEW: {
				SystemContextView systemContextView = (SystemContextView)theEObject;
				T result = caseSystemContextView(systemContextView);
				if (result == null) result = caseViewElement(systemContextView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.CONTAINER_VIEW: {
				ContainerView containerView = (ContainerView)theEObject;
				T result = caseContainerView(containerView);
				if (result == null) result = caseViewElement(containerView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.COMPONENT_VIEW: {
				ComponentView componentView = (ComponentView)theEObject;
				T result = caseComponentView(componentView);
				if (result == null) result = caseViewElement(componentView);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.AUTO_LAYOUT: {
				AutoLayout autoLayout = (AutoLayout)theEObject;
				T result = caseAutoLayout(autoLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.STYLE: {
				Style style = (Style)theEObject;
				T result = caseStyle(style);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.ELEMENT_STYLE: {
				ElementStyle elementStyle = (ElementStyle)theEObject;
				T result = caseElementStyle(elementStyle);
				if (result == null) result = caseStyle(elementStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.RELATIONSHIP_STYLE: {
				RelationshipStyle relationshipStyle = (RelationshipStyle)theEObject;
				T result = caseRelationshipStyle(relationshipStyle);
				if (result == null) result = caseStyle(relationshipStyle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.CONDITION_ELEMENT: {
				ConditionElement conditionElement = (ConditionElement)theEObject;
				T result = caseConditionElement(conditionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.NO_FILTER_CONDITION: {
				NoFilterCondition noFilterCondition = (NoFilterCondition)theEObject;
				T result = caseNoFilterCondition(noFilterCondition);
				if (result == null) result = caseConditionElement(noFilterCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.FILTER_CONDITION: {
				FilterCondition filterCondition = (FilterCondition)theEObject;
				T result = caseFilterCondition(filterCondition);
				if (result == null) result = caseConditionElement(filterCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.ELEMENT_FILTER_CONDITION: {
				ElementFilterCondition elementFilterCondition = (ElementFilterCondition)theEObject;
				T result = caseElementFilterCondition(elementFilterCondition);
				if (result == null) result = caseFilterCondition(elementFilterCondition);
				if (result == null) result = caseConditionElement(elementFilterCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.RELATIONSHIP_FILTER_CONDITION: {
				RelationshipFilterCondition relationshipFilterCondition = (RelationshipFilterCondition)theEObject;
				T result = caseRelationshipFilterCondition(relationshipFilterCondition);
				if (result == null) result = caseFilterCondition(relationshipFilterCondition);
				if (result == null) result = caseConditionElement(relationshipFilterCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.COMPOSITE_CONDITION: {
				CompositeCondition compositeCondition = (CompositeCondition)theEObject;
				T result = caseCompositeCondition(compositeCondition);
				if (result == null) result = caseFilterCondition(compositeCondition);
				if (result == null) result = caseConditionElement(compositeCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.ELEMENT_TAG_CONDITION: {
				ElementTagCondition elementTagCondition = (ElementTagCondition)theEObject;
				T result = caseElementTagCondition(elementTagCondition);
				if (result == null) result = caseElementFilterCondition(elementTagCondition);
				if (result == null) result = caseFilterCondition(elementTagCondition);
				if (result == null) result = caseConditionElement(elementTagCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.ELEMENT_TECHNOLOGY_CONDITION: {
				ElementTechnologyCondition elementTechnologyCondition = (ElementTechnologyCondition)theEObject;
				T result = caseElementTechnologyCondition(elementTechnologyCondition);
				if (result == null) result = caseElementFilterCondition(elementTechnologyCondition);
				if (result == null) result = caseFilterCondition(elementTechnologyCondition);
				if (result == null) result = caseConditionElement(elementTechnologyCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.ELEMENT_TYPE_CONDITION: {
				ElementTypeCondition elementTypeCondition = (ElementTypeCondition)theEObject;
				T result = caseElementTypeCondition(elementTypeCondition);
				if (result == null) result = caseElementFilterCondition(elementTypeCondition);
				if (result == null) result = caseFilterCondition(elementTypeCondition);
				if (result == null) result = caseConditionElement(elementTypeCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.ELEMENT_PROPERTY_CONDITION: {
				ElementPropertyCondition elementPropertyCondition = (ElementPropertyCondition)theEObject;
				T result = caseElementPropertyCondition(elementPropertyCondition);
				if (result == null) result = caseElementFilterCondition(elementPropertyCondition);
				if (result == null) result = caseFilterCondition(elementPropertyCondition);
				if (result == null) result = caseConditionElement(elementPropertyCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.ELEMENT_PARENT_CONDITION: {
				ElementParentCondition elementParentCondition = (ElementParentCondition)theEObject;
				T result = caseElementParentCondition(elementParentCondition);
				if (result == null) result = caseElementFilterCondition(elementParentCondition);
				if (result == null) result = caseFilterCondition(elementParentCondition);
				if (result == null) result = caseConditionElement(elementParentCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.RELATIONSHIP_TAG_CONDITION: {
				RelationshipTagCondition relationshipTagCondition = (RelationshipTagCondition)theEObject;
				T result = caseRelationshipTagCondition(relationshipTagCondition);
				if (result == null) result = caseRelationshipFilterCondition(relationshipTagCondition);
				if (result == null) result = caseFilterCondition(relationshipTagCondition);
				if (result == null) result = caseConditionElement(relationshipTagCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.RELATIONSHIP_PROPERTY_CONDITION: {
				RelationshipPropertyCondition relationshipPropertyCondition = (RelationshipPropertyCondition)theEObject;
				T result = caseRelationshipPropertyCondition(relationshipPropertyCondition);
				if (result == null) result = caseRelationshipFilterCondition(relationshipPropertyCondition);
				if (result == null) result = caseFilterCondition(relationshipPropertyCondition);
				if (result == null) result = caseConditionElement(relationshipPropertyCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.RELATIONSHIP_SOURCE_CONDITION: {
				RelationshipSourceCondition relationshipSourceCondition = (RelationshipSourceCondition)theEObject;
				T result = caseRelationshipSourceCondition(relationshipSourceCondition);
				if (result == null) result = caseRelationshipFilterCondition(relationshipSourceCondition);
				if (result == null) result = caseFilterCondition(relationshipSourceCondition);
				if (result == null) result = caseConditionElement(relationshipSourceCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StructurizrPackage.RELATIONSHIP_DESTINATION_CONDITION: {
				RelationshipDestinationCondition relationshipDestinationCondition = (RelationshipDestinationCondition)theEObject;
				T result = caseRelationshipDestinationCondition(relationshipDestinationCondition);
				if (result == null) result = caseRelationshipFilterCondition(relationshipDestinationCondition);
				if (result == null) result = caseFilterCondition(relationshipDestinationCondition);
				if (result == null) result = caseConditionElement(relationshipDestinationCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workspace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workspace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkspace(Workspace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifiable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifiable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiableElement(IdentifiableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>C4 Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>C4 Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC4Element(C4Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnology(Technology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perspective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perspective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerspective(Perspective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerson(Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareSystem(SoftwareSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentEnvironment(DeploymentEnvironment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentGroup(DeploymentGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentNode(DeploymentNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureNode(InfrastructureNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software System Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software System Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftwareSystemInstance(SoftwareSystemInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerInstance(ContainerInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Health Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Health Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthCheck(HealthCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Views</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Views</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViews(Views object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewElement(ViewElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Landscape View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Landscape View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemLandscapeView(SystemLandscapeView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Context View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Context View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemContextView(SystemContextView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerView(ContainerView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentView(ComponentView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auto Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auto Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutoLayout(AutoLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyle(Style object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementStyle(ElementStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipStyle(RelationshipStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionElement(ConditionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No Filter Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Filter Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoFilterCondition(NoFilterCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterCondition(FilterCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Filter Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Filter Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementFilterCondition(ElementFilterCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Filter Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Filter Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipFilterCondition(RelationshipFilterCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeCondition(CompositeCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Tag Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Tag Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementTagCondition(ElementTagCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Technology Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Technology Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementTechnologyCondition(ElementTechnologyCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Type Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Type Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementTypeCondition(ElementTypeCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Property Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Property Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementPropertyCondition(ElementPropertyCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Parent Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Parent Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementParentCondition(ElementParentCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Tag Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Tag Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipTagCondition(RelationshipTagCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Property Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Property Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipPropertyCondition(RelationshipPropertyCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Source Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Source Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipSourceCondition(RelationshipSourceCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship Destination Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship Destination Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationshipDestinationCondition(RelationshipDestinationCondition object) {
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

} //StructurizrSwitch
