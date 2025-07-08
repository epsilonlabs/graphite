/**
 */
package structurizr.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import structurizr.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see structurizr.StructurizrPackage
 * @generated
 */
public class StructurizrAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StructurizrPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructurizrAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StructurizrPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructurizrSwitch<Adapter> modelSwitch =
		new StructurizrSwitch<Adapter>() {
			@Override
			public Adapter caseWorkspace(Workspace object) {
				return createWorkspaceAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseIdentifiableElement(IdentifiableElement object) {
				return createIdentifiableElementAdapter();
			}
			@Override
			public Adapter caseC4Element(C4Element object) {
				return createC4ElementAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseTag(Tag object) {
				return createTagAdapter();
			}
			@Override
			public Adapter caseTechnology(Technology object) {
				return createTechnologyAdapter();
			}
			@Override
			public Adapter casePerspective(Perspective object) {
				return createPerspectiveAdapter();
			}
			@Override
			public Adapter caseModel(Model object) {
				return createModelAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter casePerson(Person object) {
				return createPersonAdapter();
			}
			@Override
			public Adapter caseSoftwareSystem(SoftwareSystem object) {
				return createSoftwareSystemAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseDeploymentEnvironment(DeploymentEnvironment object) {
				return createDeploymentEnvironmentAdapter();
			}
			@Override
			public Adapter caseDeploymentGroup(DeploymentGroup object) {
				return createDeploymentGroupAdapter();
			}
			@Override
			public Adapter caseDeploymentNode(DeploymentNode object) {
				return createDeploymentNodeAdapter();
			}
			@Override
			public Adapter caseInfrastructureNode(InfrastructureNode object) {
				return createInfrastructureNodeAdapter();
			}
			@Override
			public Adapter caseSoftwareSystemInstance(SoftwareSystemInstance object) {
				return createSoftwareSystemInstanceAdapter();
			}
			@Override
			public Adapter caseContainerInstance(ContainerInstance object) {
				return createContainerInstanceAdapter();
			}
			@Override
			public Adapter caseHealthCheck(HealthCheck object) {
				return createHealthCheckAdapter();
			}
			@Override
			public Adapter caseViews(Views object) {
				return createViewsAdapter();
			}
			@Override
			public Adapter caseViewElement(ViewElement object) {
				return createViewElementAdapter();
			}
			@Override
			public Adapter caseSystemLandscapeView(SystemLandscapeView object) {
				return createSystemLandscapeViewAdapter();
			}
			@Override
			public Adapter caseSystemContextView(SystemContextView object) {
				return createSystemContextViewAdapter();
			}
			@Override
			public Adapter caseContainerView(ContainerView object) {
				return createContainerViewAdapter();
			}
			@Override
			public Adapter caseComponentView(ComponentView object) {
				return createComponentViewAdapter();
			}
			@Override
			public Adapter caseAutoLayout(AutoLayout object) {
				return createAutoLayoutAdapter();
			}
			@Override
			public Adapter caseStyle(Style object) {
				return createStyleAdapter();
			}
			@Override
			public Adapter caseElementStyle(ElementStyle object) {
				return createElementStyleAdapter();
			}
			@Override
			public Adapter caseRelationshipStyle(RelationshipStyle object) {
				return createRelationshipStyleAdapter();
			}
			@Override
			public Adapter caseConditionElement(ConditionElement object) {
				return createConditionElementAdapter();
			}
			@Override
			public Adapter caseNoFilterCondition(NoFilterCondition object) {
				return createNoFilterConditionAdapter();
			}
			@Override
			public Adapter caseFilterCondition(FilterCondition object) {
				return createFilterConditionAdapter();
			}
			@Override
			public Adapter caseElementFilterCondition(ElementFilterCondition object) {
				return createElementFilterConditionAdapter();
			}
			@Override
			public Adapter caseRelationshipFilterCondition(RelationshipFilterCondition object) {
				return createRelationshipFilterConditionAdapter();
			}
			@Override
			public Adapter caseCompositeCondition(CompositeCondition object) {
				return createCompositeConditionAdapter();
			}
			@Override
			public Adapter caseElementTagCondition(ElementTagCondition object) {
				return createElementTagConditionAdapter();
			}
			@Override
			public Adapter caseElementTechnologyCondition(ElementTechnologyCondition object) {
				return createElementTechnologyConditionAdapter();
			}
			@Override
			public Adapter caseElementTypeCondition(ElementTypeCondition object) {
				return createElementTypeConditionAdapter();
			}
			@Override
			public Adapter caseElementPropertyCondition(ElementPropertyCondition object) {
				return createElementPropertyConditionAdapter();
			}
			@Override
			public Adapter caseElementParentCondition(ElementParentCondition object) {
				return createElementParentConditionAdapter();
			}
			@Override
			public Adapter caseRelationshipTagCondition(RelationshipTagCondition object) {
				return createRelationshipTagConditionAdapter();
			}
			@Override
			public Adapter caseRelationshipPropertyCondition(RelationshipPropertyCondition object) {
				return createRelationshipPropertyConditionAdapter();
			}
			@Override
			public Adapter caseRelationshipSourceCondition(RelationshipSourceCondition object) {
				return createRelationshipSourceConditionAdapter();
			}
			@Override
			public Adapter caseRelationshipDestinationCondition(RelationshipDestinationCondition object) {
				return createRelationshipDestinationConditionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link structurizr.Workspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.Workspace
	 * @generated
	 */
	public Adapter createWorkspaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.IdentifiableElement <em>Identifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.IdentifiableElement
	 * @generated
	 */
	public Adapter createIdentifiableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.C4Element <em>C4 Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.C4Element
	 * @generated
	 */
	public Adapter createC4ElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.Tag
	 * @generated
	 */
	public Adapter createTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.Technology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.Technology
	 * @generated
	 */
	public Adapter createTechnologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.Perspective <em>Perspective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.Perspective
	 * @generated
	 */
	public Adapter createPerspectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.Person
	 * @generated
	 */
	public Adapter createPersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.SoftwareSystem <em>Software System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.SoftwareSystem
	 * @generated
	 */
	public Adapter createSoftwareSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.DeploymentEnvironment <em>Deployment Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.DeploymentEnvironment
	 * @generated
	 */
	public Adapter createDeploymentEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.DeploymentGroup <em>Deployment Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.DeploymentGroup
	 * @generated
	 */
	public Adapter createDeploymentGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.DeploymentNode <em>Deployment Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.DeploymentNode
	 * @generated
	 */
	public Adapter createDeploymentNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.InfrastructureNode <em>Infrastructure Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.InfrastructureNode
	 * @generated
	 */
	public Adapter createInfrastructureNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.SoftwareSystemInstance <em>Software System Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.SoftwareSystemInstance
	 * @generated
	 */
	public Adapter createSoftwareSystemInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.ContainerInstance <em>Container Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.ContainerInstance
	 * @generated
	 */
	public Adapter createContainerInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.HealthCheck <em>Health Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.HealthCheck
	 * @generated
	 */
	public Adapter createHealthCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.Views <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.Views
	 * @generated
	 */
	public Adapter createViewsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.ViewElement <em>View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.ViewElement
	 * @generated
	 */
	public Adapter createViewElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.SystemLandscapeView <em>System Landscape View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.SystemLandscapeView
	 * @generated
	 */
	public Adapter createSystemLandscapeViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.SystemContextView <em>System Context View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.SystemContextView
	 * @generated
	 */
	public Adapter createSystemContextViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.ContainerView <em>Container View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.ContainerView
	 * @generated
	 */
	public Adapter createContainerViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.ComponentView <em>Component View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.ComponentView
	 * @generated
	 */
	public Adapter createComponentViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.AutoLayout <em>Auto Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.AutoLayout
	 * @generated
	 */
	public Adapter createAutoLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.Style <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.Style
	 * @generated
	 */
	public Adapter createStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.ElementStyle <em>Element Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.ElementStyle
	 * @generated
	 */
	public Adapter createElementStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.RelationshipStyle <em>Relationship Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.RelationshipStyle
	 * @generated
	 */
	public Adapter createRelationshipStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.ConditionElement <em>Condition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.ConditionElement
	 * @generated
	 */
	public Adapter createConditionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.NoFilterCondition <em>No Filter Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.NoFilterCondition
	 * @generated
	 */
	public Adapter createNoFilterConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.FilterCondition <em>Filter Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.FilterCondition
	 * @generated
	 */
	public Adapter createFilterConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.ElementFilterCondition <em>Element Filter Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.ElementFilterCondition
	 * @generated
	 */
	public Adapter createElementFilterConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.RelationshipFilterCondition <em>Relationship Filter Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.RelationshipFilterCondition
	 * @generated
	 */
	public Adapter createRelationshipFilterConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.CompositeCondition <em>Composite Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.CompositeCondition
	 * @generated
	 */
	public Adapter createCompositeConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.ElementTagCondition <em>Element Tag Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.ElementTagCondition
	 * @generated
	 */
	public Adapter createElementTagConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.ElementTechnologyCondition <em>Element Technology Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.ElementTechnologyCondition
	 * @generated
	 */
	public Adapter createElementTechnologyConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.ElementTypeCondition <em>Element Type Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.ElementTypeCondition
	 * @generated
	 */
	public Adapter createElementTypeConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.ElementPropertyCondition <em>Element Property Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.ElementPropertyCondition
	 * @generated
	 */
	public Adapter createElementPropertyConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.ElementParentCondition <em>Element Parent Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.ElementParentCondition
	 * @generated
	 */
	public Adapter createElementParentConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.RelationshipTagCondition <em>Relationship Tag Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.RelationshipTagCondition
	 * @generated
	 */
	public Adapter createRelationshipTagConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.RelationshipPropertyCondition <em>Relationship Property Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.RelationshipPropertyCondition
	 * @generated
	 */
	public Adapter createRelationshipPropertyConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.RelationshipSourceCondition <em>Relationship Source Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.RelationshipSourceCondition
	 * @generated
	 */
	public Adapter createRelationshipSourceConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link structurizr.RelationshipDestinationCondition <em>Relationship Destination Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see structurizr.RelationshipDestinationCondition
	 * @generated
	 */
	public Adapter createRelationshipDestinationConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StructurizrAdapterFactory
