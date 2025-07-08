/**
 */
package structurizr.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import structurizr.AutoLayout;
import structurizr.AutoLayoutOption;
import structurizr.Border;
import structurizr.C4Element;
import structurizr.Component;
import structurizr.ComponentView;
import structurizr.CompositeCondition;
import structurizr.ConditionComparisonOperation;
import structurizr.ConditionElement;
import structurizr.ConditionLogicalOperation;
import structurizr.Configuration;
import structurizr.ContainerInstance;
import structurizr.ContainerView;
import structurizr.DeploymentEnvironment;
import structurizr.DeploymentGroup;
import structurizr.DeploymentNode;
import structurizr.Element;
import structurizr.ElementFilterCondition;
import structurizr.ElementParentCondition;
import structurizr.ElementPropertyCondition;
import structurizr.ElementStyle;
import structurizr.ElementTagCondition;
import structurizr.ElementTechnologyCondition;
import structurizr.ElementTypeCondition;
import structurizr.FilterCondition;
import structurizr.FilterType;
import structurizr.HealthCheck;
import structurizr.IdentifiableElement;
import structurizr.InfrastructureNode;
import structurizr.Model;
import structurizr.NoFilterCondition;
import structurizr.Person;
import structurizr.Perspective;
import structurizr.Property;
import structurizr.Relationship;
import structurizr.RelationshipDestinationCondition;
import structurizr.RelationshipFilterCondition;
import structurizr.RelationshipPropertyCondition;
import structurizr.RelationshipSourceCondition;
import structurizr.RelationshipStyle;
import structurizr.RelationshipTagCondition;
import structurizr.Routing;
import structurizr.Scope;
import structurizr.Shape;
import structurizr.SoftwareSystem;
import structurizr.SoftwareSystemInstance;
import structurizr.StructurizrFactory;
import structurizr.StructurizrPackage;
import structurizr.Style;
import structurizr.SystemContextView;
import structurizr.SystemLandscapeView;
import structurizr.Tag;
import structurizr.Technology;
import structurizr.User;
import structurizr.UserPermission;
import structurizr.ViewElement;
import structurizr.Views;
import structurizr.Visibility;
import structurizr.Workspace;

import graphite.shared.ModelData;
import graphite.shared.WorkbenchData;

/**
* <!-- begin-user-doc -->
* An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructurizrPackageImpl extends EPackageImpl implements StructurizrPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workspaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass c4ElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass perspectiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infrastructureNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareSystemInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healthCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemLandscapeViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemContextViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autoLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noFilterConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementFilterConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipFilterConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementTagConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementTechnologyConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementTypeConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementPropertyConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementParentConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipTagConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipPropertyConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipSourceConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipDestinationConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum autoLayoutOptionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum routingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum borderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scopeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum userPermissionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shapeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionComparisonOperationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum filterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionLogicalOperationEEnum = null;

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
	 * @see structurizr.StructurizrPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StructurizrPackageImpl() {
		super(eNS_URI, StructurizrFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StructurizrPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated NOT
	 */
	public static StructurizrPackage init() {
		if (isInited) return (StructurizrPackage)EPackage.Registry.INSTANCE.getEPackage(StructurizrPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStructurizrPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StructurizrPackageImpl theStructurizrPackage = registeredStructurizrPackage instanceof StructurizrPackageImpl ? (StructurizrPackageImpl)registeredStructurizrPackage : new StructurizrPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theStructurizrPackage.createPackageContents();

		// Initialize created meta-data
		theStructurizrPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStructurizrPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StructurizrPackage.eNS_URI, theStructurizrPackage);

		ModelData modelData = new ModelData(PropertiesData.derivedPropertiesData, PropertiesData.derivedPairsMappings, PropertiesData.identifierAttributeByType, PropertiesData.resolvers);
		WorkbenchData.setModelData(modelData);

		return theStructurizrPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkspace() {
		return workspaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkspace_Name() {
		return (EAttribute)workspaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkspace_Description() {
		return (EAttribute)workspaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkspace_Model() {
		return (EReference)workspaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkspace_Views() {
		return (EReference)workspaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkspace_Properties() {
		return (EReference)workspaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkspace_Configuration() {
		return (EReference)workspaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Scope() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_Visibility() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Users() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Properties() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Username() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Permission() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiableElement() {
		return identifiableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiableElement_Identifier() {
		return (EAttribute)identifiableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiableElement_Name() {
		return (EAttribute)identifiableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentifiableElement_Relationships() {
		return (EReference)identifiableElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getC4Element() {
		return c4ElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4Element_Description() {
		return (EAttribute)c4ElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getC4Element_Url() {
		return (EAttribute)c4ElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getC4Element_Tags() {
		return (EReference)c4ElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getC4Element_Properties() {
		return (EReference)c4ElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getC4Element_Perspectives() {
		return (EReference)c4ElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Source() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Target() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_Description() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_Url() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Technology() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Tags() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Properties() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Perspectives() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTag_Name() {
		return (EAttribute)tagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTechnology() {
		return technologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTechnology_Name() {
		return (EAttribute)technologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerspective() {
		return perspectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerspective_Name() {
		return (EAttribute)perspectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerspective_Description() {
		return (EAttribute)perspectiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerspective_Value() {
		return (EAttribute)perspectiveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_SoftwareSystem() {
		return (EReference)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Persons() {
		return (EReference)modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Elements() {
		return (EReference)modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_DeploymentEnvironments() {
		return (EReference)modelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Relationships() {
		return (EReference)modelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElement_Metadata() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareSystem() {
		return softwareSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareSystem_Containers() {
		return (EReference)softwareSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Technology() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Components() {
		return (EReference)containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Technology() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentEnvironment() {
		return deploymentEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentEnvironment_DeploymentGroups() {
		return (EReference)deploymentEnvironmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentEnvironment_DeploymentNodes() {
		return (EReference)deploymentEnvironmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentGroup() {
		return deploymentGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentGroup_Name() {
		return (EAttribute)deploymentGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentNode() {
		return deploymentNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentNode_Technology() {
		return (EReference)deploymentNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentNode_DeploymentNodes() {
		return (EReference)deploymentNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentNode_InfrastructureNodes() {
		return (EReference)deploymentNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentNode_SoftwareSystemInstances() {
		return (EReference)deploymentNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentNode_ContainerInstances() {
		return (EReference)deploymentNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfrastructureNode() {
		return infrastructureNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfrastructureNode_Technology() {
		return (EReference)infrastructureNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftwareSystemInstance() {
		return softwareSystemInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareSystemInstance_SoftwareSystem() {
		return (EReference)softwareSystemInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareSystemInstance_DeploymentGroups() {
		return (EReference)softwareSystemInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftwareSystemInstance_HealthCheck() {
		return (EReference)softwareSystemInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerInstance() {
		return containerInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerInstance_Container() {
		return (EReference)containerInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerInstance_DeploymentGroups() {
		return (EReference)containerInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerInstance_HealthCheck() {
		return (EReference)containerInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealthCheck() {
		return healthCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthCheck_Name() {
		return (EAttribute)healthCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthCheck_Url() {
		return (EAttribute)healthCheckEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthCheck_Interval() {
		return (EAttribute)healthCheckEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHealthCheck_Timeouts() {
		return (EAttribute)healthCheckEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViews() {
		return viewsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViews_Name() {
		return (EAttribute)viewsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViews_ViewElements() {
		return (EReference)viewsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViews_Styles() {
		return (EReference)viewsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewElement() {
		return viewElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewElement_Key() {
		return (EAttribute)viewElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewElement_Title() {
		return (EAttribute)viewElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewElement_Description() {
		return (EAttribute)viewElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewElement_AutoLayout() {
		return (EReference)viewElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewElement_Properties() {
		return (EReference)viewElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewElement_Include() {
		return (EReference)viewElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewElement_Exclude() {
		return (EReference)viewElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewElement_IncludeExpression() {
		return (EAttribute)viewElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewElement_ExcludeExpression() {
		return (EAttribute)viewElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemLandscapeView() {
		return systemLandscapeViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemContextView() {
		return systemContextViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemContextView_SoftwareSystem() {
		return (EReference)systemContextViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerView() {
		return containerViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerView_SoftwareSystem() {
		return (EReference)containerViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentView() {
		return componentViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentView_Container() {
		return (EReference)componentViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutoLayout() {
		return autoLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutoLayout_AutoLayoutOption() {
		return (EAttribute)autoLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutoLayout_RankSeparation() {
		return (EAttribute)autoLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutoLayout_NodeSeparation() {
		return (EAttribute)autoLayoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyle() {
		return styleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementStyle() {
		return elementStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementStyle_Tag() {
		return (EReference)elementStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementStyle_Icon() {
		return (EAttribute)elementStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementStyle_Width() {
		return (EAttribute)elementStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementStyle_Height() {
		return (EAttribute)elementStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementStyle_StrokeWidth() {
		return (EAttribute)elementStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementStyle_FontSize() {
		return (EAttribute)elementStyleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementStyle_Opacity() {
		return (EAttribute)elementStyleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementStyle_Metadata() {
		return (EAttribute)elementStyleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementStyle_Description() {
		return (EAttribute)elementStyleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementStyle_Background() {
		return (EAttribute)elementStyleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementStyle_Color() {
		return (EAttribute)elementStyleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementStyle_Stroke() {
		return (EAttribute)elementStyleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementStyle_Border() {
		return (EAttribute)elementStyleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementStyle_Shape() {
		return (EAttribute)elementStyleEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementStyle_Properties() {
		return (EReference)elementStyleEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipStyle() {
		return relationshipStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipStyle_Tag() {
		return (EReference)relationshipStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipStyle_Thickness() {
		return (EAttribute)relationshipStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipStyle_FontSize() {
		return (EAttribute)relationshipStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipStyle_Width() {
		return (EAttribute)relationshipStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipStyle_Opacity() {
		return (EAttribute)relationshipStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipStyle_Position() {
		return (EAttribute)relationshipStyleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipStyle_Color() {
		return (EAttribute)relationshipStyleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipStyle_Style() {
		return (EAttribute)relationshipStyleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipStyle_Routing() {
		return (EAttribute)relationshipStyleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipStyle_Properties() {
		return (EReference)relationshipStyleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionElement() {
		return conditionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoFilterCondition() {
		return noFilterConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterCondition() {
		return filterConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementFilterCondition() {
		return elementFilterConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipFilterCondition() {
		return relationshipFilterConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeCondition() {
		return compositeConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeCondition_Left() {
		return (EReference)compositeConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeCondition_LogicalOperation() {
		return (EAttribute)compositeConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeCondition_Right() {
		return (EReference)compositeConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementTagCondition() {
		return elementTagConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementTagCondition_ComparisonOperation() {
		return (EAttribute)elementTagConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementTagCondition_Tags() {
		return (EReference)elementTagConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementTechnologyCondition() {
		return elementTechnologyConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementTechnologyCondition_ComparisonOperation() {
		return (EAttribute)elementTechnologyConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementTechnologyCondition_Technology() {
		return (EReference)elementTechnologyConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementTypeCondition() {
		return elementTypeConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementTypeCondition_ComparisonOperation() {
		return (EAttribute)elementTypeConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementTypeCondition_Type() {
		return (EAttribute)elementTypeConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementPropertyCondition() {
		return elementPropertyConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementPropertyCondition_ComparisonOperation() {
		return (EAttribute)elementPropertyConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementPropertyCondition_Property() {
		return (EReference)elementPropertyConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementPropertyCondition_Value() {
		return (EAttribute)elementPropertyConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementParentCondition() {
		return elementParentConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementParentCondition_ComparisonOperation() {
		return (EAttribute)elementParentConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementParentCondition_Parent() {
		return (EReference)elementParentConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipTagCondition() {
		return relationshipTagConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipTagCondition_ComparisonOperation() {
		return (EAttribute)relationshipTagConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipTagCondition_Tags() {
		return (EReference)relationshipTagConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipPropertyCondition() {
		return relationshipPropertyConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipPropertyCondition_ComparisonOperation() {
		return (EAttribute)relationshipPropertyConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipPropertyCondition_Property() {
		return (EReference)relationshipPropertyConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipPropertyCondition_Value() {
		return (EAttribute)relationshipPropertyConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipSourceCondition() {
		return relationshipSourceConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipSourceCondition_ComparisonOperation() {
		return (EAttribute)relationshipSourceConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipSourceCondition_Source() {
		return (EReference)relationshipSourceConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationshipDestinationCondition() {
		return relationshipDestinationConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationshipDestinationCondition_ComparisonOperation() {
		return (EAttribute)relationshipDestinationConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationshipDestinationCondition_Destination() {
		return (EReference)relationshipDestinationConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAutoLayoutOption() {
		return autoLayoutOptionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRouting() {
		return routingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBorder() {
		return borderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScope() {
		return scopeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibility() {
		return visibilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUserPermission() {
		return userPermissionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getShape() {
		return shapeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionComparisonOperation() {
		return conditionComparisonOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFilterType() {
		return filterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionLogicalOperation() {
		return conditionLogicalOperationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructurizrFactory getStructurizrFactory() {
		return (StructurizrFactory)getEFactoryInstance();
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
		workspaceEClass = createEClass(WORKSPACE);
		createEAttribute(workspaceEClass, WORKSPACE__NAME);
		createEAttribute(workspaceEClass, WORKSPACE__DESCRIPTION);
		createEReference(workspaceEClass, WORKSPACE__MODEL);
		createEReference(workspaceEClass, WORKSPACE__VIEWS);
		createEReference(workspaceEClass, WORKSPACE__PROPERTIES);
		createEReference(workspaceEClass, WORKSPACE__CONFIGURATION);

		configurationEClass = createEClass(CONFIGURATION);
		createEAttribute(configurationEClass, CONFIGURATION__SCOPE);
		createEAttribute(configurationEClass, CONFIGURATION__VISIBILITY);
		createEReference(configurationEClass, CONFIGURATION__USERS);
		createEReference(configurationEClass, CONFIGURATION__PROPERTIES);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEAttribute(propertyEClass, PROPERTY__VALUE);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__USERNAME);
		createEAttribute(userEClass, USER__PERMISSION);

		identifiableElementEClass = createEClass(IDENTIFIABLE_ELEMENT);
		createEAttribute(identifiableElementEClass, IDENTIFIABLE_ELEMENT__IDENTIFIER);
		createEAttribute(identifiableElementEClass, IDENTIFIABLE_ELEMENT__NAME);
		createEReference(identifiableElementEClass, IDENTIFIABLE_ELEMENT__RELATIONSHIPS);

		c4ElementEClass = createEClass(C4_ELEMENT);
		createEAttribute(c4ElementEClass, C4_ELEMENT__DESCRIPTION);
		createEAttribute(c4ElementEClass, C4_ELEMENT__URL);
		createEReference(c4ElementEClass, C4_ELEMENT__TAGS);
		createEReference(c4ElementEClass, C4_ELEMENT__PROPERTIES);
		createEReference(c4ElementEClass, C4_ELEMENT__PERSPECTIVES);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__SOURCE);
		createEReference(relationshipEClass, RELATIONSHIP__TARGET);
		createEAttribute(relationshipEClass, RELATIONSHIP__DESCRIPTION);
		createEAttribute(relationshipEClass, RELATIONSHIP__URL);
		createEReference(relationshipEClass, RELATIONSHIP__TECHNOLOGY);
		createEReference(relationshipEClass, RELATIONSHIP__TAGS);
		createEReference(relationshipEClass, RELATIONSHIP__PROPERTIES);
		createEReference(relationshipEClass, RELATIONSHIP__PERSPECTIVES);

		tagEClass = createEClass(TAG);
		createEAttribute(tagEClass, TAG__NAME);

		technologyEClass = createEClass(TECHNOLOGY);
		createEAttribute(technologyEClass, TECHNOLOGY__NAME);

		perspectiveEClass = createEClass(PERSPECTIVE);
		createEAttribute(perspectiveEClass, PERSPECTIVE__NAME);
		createEAttribute(perspectiveEClass, PERSPECTIVE__DESCRIPTION);
		createEAttribute(perspectiveEClass, PERSPECTIVE__VALUE);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__SOFTWARE_SYSTEM);
		createEReference(modelEClass, MODEL__PERSONS);
		createEReference(modelEClass, MODEL__ELEMENTS);
		createEReference(modelEClass, MODEL__DEPLOYMENT_ENVIRONMENTS);
		createEReference(modelEClass, MODEL__RELATIONSHIPS);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__METADATA);

		personEClass = createEClass(PERSON);

		softwareSystemEClass = createEClass(SOFTWARE_SYSTEM);
		createEReference(softwareSystemEClass, SOFTWARE_SYSTEM__CONTAINERS);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__TECHNOLOGY);
		createEReference(containerEClass, CONTAINER__COMPONENTS);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__TECHNOLOGY);

		deploymentEnvironmentEClass = createEClass(DEPLOYMENT_ENVIRONMENT);
		createEReference(deploymentEnvironmentEClass, DEPLOYMENT_ENVIRONMENT__DEPLOYMENT_GROUPS);
		createEReference(deploymentEnvironmentEClass, DEPLOYMENT_ENVIRONMENT__DEPLOYMENT_NODES);

		deploymentGroupEClass = createEClass(DEPLOYMENT_GROUP);
		createEAttribute(deploymentGroupEClass, DEPLOYMENT_GROUP__NAME);

		deploymentNodeEClass = createEClass(DEPLOYMENT_NODE);
		createEReference(deploymentNodeEClass, DEPLOYMENT_NODE__TECHNOLOGY);
		createEReference(deploymentNodeEClass, DEPLOYMENT_NODE__DEPLOYMENT_NODES);
		createEReference(deploymentNodeEClass, DEPLOYMENT_NODE__INFRASTRUCTURE_NODES);
		createEReference(deploymentNodeEClass, DEPLOYMENT_NODE__SOFTWARE_SYSTEM_INSTANCES);
		createEReference(deploymentNodeEClass, DEPLOYMENT_NODE__CONTAINER_INSTANCES);

		infrastructureNodeEClass = createEClass(INFRASTRUCTURE_NODE);
		createEReference(infrastructureNodeEClass, INFRASTRUCTURE_NODE__TECHNOLOGY);

		softwareSystemInstanceEClass = createEClass(SOFTWARE_SYSTEM_INSTANCE);
		createEReference(softwareSystemInstanceEClass, SOFTWARE_SYSTEM_INSTANCE__SOFTWARE_SYSTEM);
		createEReference(softwareSystemInstanceEClass, SOFTWARE_SYSTEM_INSTANCE__DEPLOYMENT_GROUPS);
		createEReference(softwareSystemInstanceEClass, SOFTWARE_SYSTEM_INSTANCE__HEALTH_CHECK);

		containerInstanceEClass = createEClass(CONTAINER_INSTANCE);
		createEReference(containerInstanceEClass, CONTAINER_INSTANCE__CONTAINER);
		createEReference(containerInstanceEClass, CONTAINER_INSTANCE__DEPLOYMENT_GROUPS);
		createEReference(containerInstanceEClass, CONTAINER_INSTANCE__HEALTH_CHECK);

		healthCheckEClass = createEClass(HEALTH_CHECK);
		createEAttribute(healthCheckEClass, HEALTH_CHECK__NAME);
		createEAttribute(healthCheckEClass, HEALTH_CHECK__URL);
		createEAttribute(healthCheckEClass, HEALTH_CHECK__INTERVAL);
		createEAttribute(healthCheckEClass, HEALTH_CHECK__TIMEOUTS);

		viewsEClass = createEClass(VIEWS);
		createEAttribute(viewsEClass, VIEWS__NAME);
		createEReference(viewsEClass, VIEWS__VIEW_ELEMENTS);
		createEReference(viewsEClass, VIEWS__STYLES);

		viewElementEClass = createEClass(VIEW_ELEMENT);
		createEAttribute(viewElementEClass, VIEW_ELEMENT__KEY);
		createEAttribute(viewElementEClass, VIEW_ELEMENT__TITLE);
		createEAttribute(viewElementEClass, VIEW_ELEMENT__DESCRIPTION);
		createEReference(viewElementEClass, VIEW_ELEMENT__AUTO_LAYOUT);
		createEReference(viewElementEClass, VIEW_ELEMENT__PROPERTIES);
		createEReference(viewElementEClass, VIEW_ELEMENT__INCLUDE);
		createEReference(viewElementEClass, VIEW_ELEMENT__EXCLUDE);
		createEAttribute(viewElementEClass, VIEW_ELEMENT__INCLUDE_EXPRESSION);
		createEAttribute(viewElementEClass, VIEW_ELEMENT__EXCLUDE_EXPRESSION);

		systemLandscapeViewEClass = createEClass(SYSTEM_LANDSCAPE_VIEW);

		systemContextViewEClass = createEClass(SYSTEM_CONTEXT_VIEW);
		createEReference(systemContextViewEClass, SYSTEM_CONTEXT_VIEW__SOFTWARE_SYSTEM);

		containerViewEClass = createEClass(CONTAINER_VIEW);
		createEReference(containerViewEClass, CONTAINER_VIEW__SOFTWARE_SYSTEM);

		componentViewEClass = createEClass(COMPONENT_VIEW);
		createEReference(componentViewEClass, COMPONENT_VIEW__CONTAINER);

		autoLayoutEClass = createEClass(AUTO_LAYOUT);
		createEAttribute(autoLayoutEClass, AUTO_LAYOUT__AUTO_LAYOUT_OPTION);
		createEAttribute(autoLayoutEClass, AUTO_LAYOUT__RANK_SEPARATION);
		createEAttribute(autoLayoutEClass, AUTO_LAYOUT__NODE_SEPARATION);

		styleEClass = createEClass(STYLE);

		elementStyleEClass = createEClass(ELEMENT_STYLE);
		createEReference(elementStyleEClass, ELEMENT_STYLE__TAG);
		createEAttribute(elementStyleEClass, ELEMENT_STYLE__ICON);
		createEAttribute(elementStyleEClass, ELEMENT_STYLE__WIDTH);
		createEAttribute(elementStyleEClass, ELEMENT_STYLE__HEIGHT);
		createEAttribute(elementStyleEClass, ELEMENT_STYLE__STROKE_WIDTH);
		createEAttribute(elementStyleEClass, ELEMENT_STYLE__FONT_SIZE);
		createEAttribute(elementStyleEClass, ELEMENT_STYLE__OPACITY);
		createEAttribute(elementStyleEClass, ELEMENT_STYLE__METADATA);
		createEAttribute(elementStyleEClass, ELEMENT_STYLE__DESCRIPTION);
		createEAttribute(elementStyleEClass, ELEMENT_STYLE__BACKGROUND);
		createEAttribute(elementStyleEClass, ELEMENT_STYLE__COLOR);
		createEAttribute(elementStyleEClass, ELEMENT_STYLE__STROKE);
		createEAttribute(elementStyleEClass, ELEMENT_STYLE__BORDER);
		createEAttribute(elementStyleEClass, ELEMENT_STYLE__SHAPE);
		createEReference(elementStyleEClass, ELEMENT_STYLE__PROPERTIES);

		relationshipStyleEClass = createEClass(RELATIONSHIP_STYLE);
		createEReference(relationshipStyleEClass, RELATIONSHIP_STYLE__TAG);
		createEAttribute(relationshipStyleEClass, RELATIONSHIP_STYLE__THICKNESS);
		createEAttribute(relationshipStyleEClass, RELATIONSHIP_STYLE__FONT_SIZE);
		createEAttribute(relationshipStyleEClass, RELATIONSHIP_STYLE__WIDTH);
		createEAttribute(relationshipStyleEClass, RELATIONSHIP_STYLE__OPACITY);
		createEAttribute(relationshipStyleEClass, RELATIONSHIP_STYLE__POSITION);
		createEAttribute(relationshipStyleEClass, RELATIONSHIP_STYLE__COLOR);
		createEAttribute(relationshipStyleEClass, RELATIONSHIP_STYLE__STYLE);
		createEAttribute(relationshipStyleEClass, RELATIONSHIP_STYLE__ROUTING);
		createEReference(relationshipStyleEClass, RELATIONSHIP_STYLE__PROPERTIES);

		conditionElementEClass = createEClass(CONDITION_ELEMENT);

		noFilterConditionEClass = createEClass(NO_FILTER_CONDITION);

		filterConditionEClass = createEClass(FILTER_CONDITION);

		elementFilterConditionEClass = createEClass(ELEMENT_FILTER_CONDITION);

		relationshipFilterConditionEClass = createEClass(RELATIONSHIP_FILTER_CONDITION);

		compositeConditionEClass = createEClass(COMPOSITE_CONDITION);
		createEReference(compositeConditionEClass, COMPOSITE_CONDITION__LEFT);
		createEAttribute(compositeConditionEClass, COMPOSITE_CONDITION__LOGICAL_OPERATION);
		createEReference(compositeConditionEClass, COMPOSITE_CONDITION__RIGHT);

		elementTagConditionEClass = createEClass(ELEMENT_TAG_CONDITION);
		createEAttribute(elementTagConditionEClass, ELEMENT_TAG_CONDITION__COMPARISON_OPERATION);
		createEReference(elementTagConditionEClass, ELEMENT_TAG_CONDITION__TAGS);

		elementTechnologyConditionEClass = createEClass(ELEMENT_TECHNOLOGY_CONDITION);
		createEAttribute(elementTechnologyConditionEClass, ELEMENT_TECHNOLOGY_CONDITION__COMPARISON_OPERATION);
		createEReference(elementTechnologyConditionEClass, ELEMENT_TECHNOLOGY_CONDITION__TECHNOLOGY);

		elementTypeConditionEClass = createEClass(ELEMENT_TYPE_CONDITION);
		createEAttribute(elementTypeConditionEClass, ELEMENT_TYPE_CONDITION__COMPARISON_OPERATION);
		createEAttribute(elementTypeConditionEClass, ELEMENT_TYPE_CONDITION__TYPE);

		elementPropertyConditionEClass = createEClass(ELEMENT_PROPERTY_CONDITION);
		createEAttribute(elementPropertyConditionEClass, ELEMENT_PROPERTY_CONDITION__COMPARISON_OPERATION);
		createEReference(elementPropertyConditionEClass, ELEMENT_PROPERTY_CONDITION__PROPERTY);
		createEAttribute(elementPropertyConditionEClass, ELEMENT_PROPERTY_CONDITION__VALUE);

		elementParentConditionEClass = createEClass(ELEMENT_PARENT_CONDITION);
		createEAttribute(elementParentConditionEClass, ELEMENT_PARENT_CONDITION__COMPARISON_OPERATION);
		createEReference(elementParentConditionEClass, ELEMENT_PARENT_CONDITION__PARENT);

		relationshipTagConditionEClass = createEClass(RELATIONSHIP_TAG_CONDITION);
		createEAttribute(relationshipTagConditionEClass, RELATIONSHIP_TAG_CONDITION__COMPARISON_OPERATION);
		createEReference(relationshipTagConditionEClass, RELATIONSHIP_TAG_CONDITION__TAGS);

		relationshipPropertyConditionEClass = createEClass(RELATIONSHIP_PROPERTY_CONDITION);
		createEAttribute(relationshipPropertyConditionEClass, RELATIONSHIP_PROPERTY_CONDITION__COMPARISON_OPERATION);
		createEReference(relationshipPropertyConditionEClass, RELATIONSHIP_PROPERTY_CONDITION__PROPERTY);
		createEAttribute(relationshipPropertyConditionEClass, RELATIONSHIP_PROPERTY_CONDITION__VALUE);

		relationshipSourceConditionEClass = createEClass(RELATIONSHIP_SOURCE_CONDITION);
		createEAttribute(relationshipSourceConditionEClass, RELATIONSHIP_SOURCE_CONDITION__COMPARISON_OPERATION);
		createEReference(relationshipSourceConditionEClass, RELATIONSHIP_SOURCE_CONDITION__SOURCE);

		relationshipDestinationConditionEClass = createEClass(RELATIONSHIP_DESTINATION_CONDITION);
		createEAttribute(relationshipDestinationConditionEClass, RELATIONSHIP_DESTINATION_CONDITION__COMPARISON_OPERATION);
		createEReference(relationshipDestinationConditionEClass, RELATIONSHIP_DESTINATION_CONDITION__DESTINATION);

		// Create enums
		autoLayoutOptionEEnum = createEEnum(AUTO_LAYOUT_OPTION);
		routingEEnum = createEEnum(ROUTING);
		borderEEnum = createEEnum(BORDER);
		scopeEEnum = createEEnum(SCOPE);
		visibilityEEnum = createEEnum(VISIBILITY);
		userPermissionEEnum = createEEnum(USER_PERMISSION);
		shapeEEnum = createEEnum(SHAPE);
		conditionComparisonOperationEEnum = createEEnum(CONDITION_COMPARISON_OPERATION);
		filterTypeEEnum = createEEnum(FILTER_TYPE);
		conditionLogicalOperationEEnum = createEEnum(CONDITION_LOGICAL_OPERATION);
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
		c4ElementEClass.getESuperTypes().add(this.getIdentifiableElement());
		elementEClass.getESuperTypes().add(this.getC4Element());
		personEClass.getESuperTypes().add(this.getC4Element());
		softwareSystemEClass.getESuperTypes().add(this.getC4Element());
		containerEClass.getESuperTypes().add(this.getC4Element());
		componentEClass.getESuperTypes().add(this.getC4Element());
		deploymentEnvironmentEClass.getESuperTypes().add(this.getIdentifiableElement());
		deploymentNodeEClass.getESuperTypes().add(this.getC4Element());
		infrastructureNodeEClass.getESuperTypes().add(this.getC4Element());
		softwareSystemInstanceEClass.getESuperTypes().add(this.getC4Element());
		containerInstanceEClass.getESuperTypes().add(this.getC4Element());
		systemLandscapeViewEClass.getESuperTypes().add(this.getViewElement());
		systemContextViewEClass.getESuperTypes().add(this.getViewElement());
		containerViewEClass.getESuperTypes().add(this.getViewElement());
		componentViewEClass.getESuperTypes().add(this.getViewElement());
		elementStyleEClass.getESuperTypes().add(this.getStyle());
		relationshipStyleEClass.getESuperTypes().add(this.getStyle());
		noFilterConditionEClass.getESuperTypes().add(this.getConditionElement());
		filterConditionEClass.getESuperTypes().add(this.getConditionElement());
		elementFilterConditionEClass.getESuperTypes().add(this.getFilterCondition());
		relationshipFilterConditionEClass.getESuperTypes().add(this.getFilterCondition());
		compositeConditionEClass.getESuperTypes().add(this.getFilterCondition());
		elementTagConditionEClass.getESuperTypes().add(this.getElementFilterCondition());
		elementTechnologyConditionEClass.getESuperTypes().add(this.getElementFilterCondition());
		elementTypeConditionEClass.getESuperTypes().add(this.getElementFilterCondition());
		elementPropertyConditionEClass.getESuperTypes().add(this.getElementFilterCondition());
		elementParentConditionEClass.getESuperTypes().add(this.getElementFilterCondition());
		relationshipTagConditionEClass.getESuperTypes().add(this.getRelationshipFilterCondition());
		relationshipPropertyConditionEClass.getESuperTypes().add(this.getRelationshipFilterCondition());
		relationshipSourceConditionEClass.getESuperTypes().add(this.getRelationshipFilterCondition());
		relationshipDestinationConditionEClass.getESuperTypes().add(this.getRelationshipFilterCondition());

		// Initialize classes, features, and operations; add parameters
		initEClass(workspaceEClass, Workspace.class, "Workspace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkspace_Name(), ecorePackage.getEString(), "name", null, 0, 1, Workspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWorkspace_Description(), ecorePackage.getEString(), "description", null, 0, 1, Workspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkspace_Model(), this.getModel(), null, "model", null, 0, 1, Workspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkspace_Views(), this.getViews(), null, "views", null, 0, 1, Workspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkspace_Properties(), this.getProperty(), null, "properties", null, 0, -1, Workspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWorkspace_Configuration(), this.getConfiguration(), null, "configuration", null, 0, 1, Workspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfiguration_Scope(), this.getScope(), "scope", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_Visibility(), this.getVisibility(), "visibility", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Users(), this.getUser(), null, "users", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_Properties(), this.getProperty(), null, "properties", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Username(), ecorePackage.getEString(), "username", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Permission(), this.getUserPermission(), "permission", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiableElementEClass, IdentifiableElement.class, "IdentifiableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiableElement_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, IdentifiableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiableElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, IdentifiableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifiableElement_Relationships(), this.getRelationship(), null, "relationships", null, 0, -1, IdentifiableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(c4ElementEClass, C4Element.class, "C4Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getC4Element_Description(), ecorePackage.getEString(), "description", null, 0, 1, C4Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getC4Element_Url(), ecorePackage.getEString(), "url", null, 0, 1, C4Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getC4Element_Tags(), this.getTag(), null, "tags", null, 0, -1, C4Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getC4Element_Properties(), this.getProperty(), null, "properties", null, 0, -1, C4Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getC4Element_Perspectives(), this.getPerspective(), null, "perspectives", null, 0, -1, C4Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_Source(), this.getIdentifiableElement(), null, "source", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Target(), this.getIdentifiableElement(), null, "target", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_Description(), ecorePackage.getEString(), "description", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_Url(), ecorePackage.getEString(), "url", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Technology(), this.getTechnology(), null, "technology", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Tags(), this.getTag(), null, "tags", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Properties(), this.getProperty(), null, "properties", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Perspectives(), this.getPerspective(), null, "perspectives", null, 0, -1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTag_Name(), ecorePackage.getEString(), "name", null, 0, 1, Tag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technologyEClass, Technology.class, "Technology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTechnology_Name(), ecorePackage.getEString(), "name", null, 0, 1, Technology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(perspectiveEClass, Perspective.class, "Perspective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerspective_Name(), ecorePackage.getEString(), "name", null, 0, 1, Perspective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerspective_Description(), ecorePackage.getEString(), "description", null, 0, 1, Perspective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerspective_Value(), ecorePackage.getEString(), "value", null, 0, 1, Perspective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_SoftwareSystem(), this.getSoftwareSystem(), null, "softwareSystem", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Persons(), this.getPerson(), null, "persons", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Elements(), this.getElement(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_DeploymentEnvironments(), this.getDeploymentEnvironment(), null, "deploymentEnvironments", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Relationships(), this.getRelationship(), null, "relationships", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Metadata(), ecorePackage.getEString(), "metadata", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(softwareSystemEClass, SoftwareSystem.class, "SoftwareSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoftwareSystem_Containers(), this.getContainer(), null, "containers", null, 0, -1, SoftwareSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, structurizr.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Technology(), this.getTechnology(), null, "technology", null, 0, 1, structurizr.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Components(), this.getComponent(), null, "components", null, 0, -1, structurizr.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Technology(), this.getTechnology(), null, "technology", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentEnvironmentEClass, DeploymentEnvironment.class, "DeploymentEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeploymentEnvironment_DeploymentGroups(), this.getDeploymentGroup(), null, "deploymentGroups", null, 0, -1, DeploymentEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentEnvironment_DeploymentNodes(), this.getDeploymentNode(), null, "deploymentNodes", null, 0, -1, DeploymentEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentGroupEClass, DeploymentGroup.class, "DeploymentGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentGroup_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeploymentGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentNodeEClass, DeploymentNode.class, "DeploymentNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeploymentNode_Technology(), this.getTechnology(), null, "technology", null, 0, 1, DeploymentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentNode_DeploymentNodes(), this.getDeploymentNode(), null, "deploymentNodes", null, 0, -1, DeploymentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentNode_InfrastructureNodes(), this.getInfrastructureNode(), null, "infrastructureNodes", null, 0, -1, DeploymentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentNode_SoftwareSystemInstances(), this.getSoftwareSystemInstance(), null, "softwareSystemInstances", null, 0, -1, DeploymentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeploymentNode_ContainerInstances(), this.getContainerInstance(), null, "containerInstances", null, 0, -1, DeploymentNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infrastructureNodeEClass, InfrastructureNode.class, "InfrastructureNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInfrastructureNode_Technology(), this.getTechnology(), null, "technology", null, 0, 1, InfrastructureNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareSystemInstanceEClass, SoftwareSystemInstance.class, "SoftwareSystemInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoftwareSystemInstance_SoftwareSystem(), this.getSoftwareSystem(), null, "softwareSystem", null, 0, 1, SoftwareSystemInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareSystemInstance_DeploymentGroups(), this.getDeploymentGroup(), null, "deploymentGroups", null, 0, -1, SoftwareSystemInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftwareSystemInstance_HealthCheck(), this.getHealthCheck(), null, "healthCheck", null, 0, 1, SoftwareSystemInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerInstanceEClass, ContainerInstance.class, "ContainerInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerInstance_Container(), this.getContainer(), null, "container", null, 0, 1, ContainerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerInstance_DeploymentGroups(), this.getDeploymentGroup(), null, "deploymentGroups", null, 0, -1, ContainerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerInstance_HealthCheck(), this.getHealthCheck(), null, "healthCheck", null, 0, 1, ContainerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(healthCheckEClass, HealthCheck.class, "HealthCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHealthCheck_Name(), ecorePackage.getEString(), "name", null, 0, 1, HealthCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthCheck_Url(), ecorePackage.getEString(), "url", null, 0, 1, HealthCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthCheck_Interval(), ecorePackage.getEInt(), "interval", null, 0, 1, HealthCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealthCheck_Timeouts(), ecorePackage.getEString(), "timeouts", null, 0, 1, HealthCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewsEClass, Views.class, "Views", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViews_Name(), ecorePackage.getEString(), "name", null, 0, 1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViews_ViewElements(), this.getViewElement(), null, "viewElements", null, 0, -1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViews_Styles(), this.getStyle(), null, "styles", null, 0, -1, Views.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewElementEClass, ViewElement.class, "ViewElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getViewElement_Key(), ecorePackage.getEString(), "key", null, 0, 1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewElement_Title(), ecorePackage.getEString(), "title", null, 0, 1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewElement_AutoLayout(), this.getAutoLayout(), null, "autoLayout", null, 0, 1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewElement_Properties(), this.getProperty(), null, "properties", null, 0, -1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewElement_Include(), this.getConditionElement(), null, "include", null, 0, 1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewElement_Exclude(), this.getConditionElement(), null, "exclude", null, 0, 1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewElement_IncludeExpression(), ecorePackage.getEString(), "includeExpression", null, 0, 1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewElement_ExcludeExpression(), ecorePackage.getEString(), "excludeExpression", null, 0, 1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemLandscapeViewEClass, SystemLandscapeView.class, "SystemLandscapeView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemContextViewEClass, SystemContextView.class, "SystemContextView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemContextView_SoftwareSystem(), this.getSoftwareSystem(), null, "softwareSystem", null, 0, 1, SystemContextView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerViewEClass, ContainerView.class, "ContainerView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerView_SoftwareSystem(), this.getSoftwareSystem(), null, "softwareSystem", null, 0, 1, ContainerView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentViewEClass, ComponentView.class, "ComponentView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentView_Container(), this.getContainer(), null, "container", null, 0, 1, ComponentView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(autoLayoutEClass, AutoLayout.class, "AutoLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutoLayout_AutoLayoutOption(), this.getAutoLayoutOption(), "autoLayoutOption", null, 0, 1, AutoLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutoLayout_RankSeparation(), ecorePackage.getEInt(), "rankSeparation", null, 0, 1, AutoLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutoLayout_NodeSeparation(), ecorePackage.getEInt(), "nodeSeparation", null, 0, 1, AutoLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleEClass, Style.class, "Style", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementStyleEClass, ElementStyle.class, "ElementStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementStyle_Tag(), this.getTag(), null, "tag", null, 0, 1, ElementStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementStyle_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, ElementStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementStyle_Width(), ecorePackage.getEInt(), "width", null, 0, 1, ElementStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementStyle_Height(), ecorePackage.getEInt(), "height", null, 0, 1, ElementStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementStyle_StrokeWidth(), ecorePackage.getEInt(), "strokeWidth", null, 0, 1, ElementStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementStyle_FontSize(), ecorePackage.getEInt(), "fontSize", null, 0, 1, ElementStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementStyle_Opacity(), ecorePackage.getEInt(), "opacity", null, 0, 1, ElementStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementStyle_Metadata(), ecorePackage.getEBoolean(), "metadata", null, 0, 1, ElementStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementStyle_Description(), ecorePackage.getEBoolean(), "description", null, 0, 1, ElementStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementStyle_Background(), ecorePackage.getEString(), "background", null, 0, 1, ElementStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementStyle_Color(), ecorePackage.getEString(), "color", null, 0, 1, ElementStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementStyle_Stroke(), ecorePackage.getEString(), "stroke", null, 0, 1, ElementStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementStyle_Border(), this.getBorder(), "border", null, 0, 1, ElementStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementStyle_Shape(), this.getShape(), "shape", null, 0, 1, ElementStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementStyle_Properties(), this.getProperty(), null, "properties", null, 0, -1, ElementStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipStyleEClass, RelationshipStyle.class, "RelationshipStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationshipStyle_Tag(), this.getTag(), null, "tag", null, 0, 1, RelationshipStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipStyle_Thickness(), ecorePackage.getEInt(), "thickness", null, 0, 1, RelationshipStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipStyle_FontSize(), ecorePackage.getEInt(), "fontSize", null, 0, 1, RelationshipStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipStyle_Width(), ecorePackage.getEInt(), "width", null, 0, 1, RelationshipStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipStyle_Opacity(), ecorePackage.getEInt(), "opacity", null, 0, 1, RelationshipStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipStyle_Position(), ecorePackage.getEInt(), "position", null, 0, 1, RelationshipStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipStyle_Color(), ecorePackage.getEString(), "color", null, 0, 1, RelationshipStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipStyle_Style(), this.getBorder(), "style", null, 0, 1, RelationshipStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipStyle_Routing(), this.getRouting(), "routing", null, 0, 1, RelationshipStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipStyle_Properties(), this.getProperty(), null, "properties", null, 0, -1, RelationshipStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionElementEClass, ConditionElement.class, "ConditionElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noFilterConditionEClass, NoFilterCondition.class, "NoFilterCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(filterConditionEClass, FilterCondition.class, "FilterCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementFilterConditionEClass, ElementFilterCondition.class, "ElementFilterCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationshipFilterConditionEClass, RelationshipFilterCondition.class, "RelationshipFilterCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeConditionEClass, CompositeCondition.class, "CompositeCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeCondition_Left(), this.getFilterCondition(), null, "left", null, 0, 1, CompositeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeCondition_LogicalOperation(), this.getConditionLogicalOperation(), "logicalOperation", null, 0, 1, CompositeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeCondition_Right(), this.getFilterCondition(), null, "right", null, 0, 1, CompositeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementTagConditionEClass, ElementTagCondition.class, "ElementTagCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementTagCondition_ComparisonOperation(), this.getConditionComparisonOperation(), "comparisonOperation", null, 0, 1, ElementTagCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementTagCondition_Tags(), this.getTag(), null, "tags", null, 0, -1, ElementTagCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementTechnologyConditionEClass, ElementTechnologyCondition.class, "ElementTechnologyCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementTechnologyCondition_ComparisonOperation(), this.getConditionComparisonOperation(), "comparisonOperation", null, 0, 1, ElementTechnologyCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementTechnologyCondition_Technology(), this.getTechnology(), null, "technology", null, 0, 1, ElementTechnologyCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementTypeConditionEClass, ElementTypeCondition.class, "ElementTypeCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementTypeCondition_ComparisonOperation(), this.getConditionComparisonOperation(), "comparisonOperation", null, 0, 1, ElementTypeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementTypeCondition_Type(), this.getFilterType(), "type", null, 0, 1, ElementTypeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementPropertyConditionEClass, ElementPropertyCondition.class, "ElementPropertyCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementPropertyCondition_ComparisonOperation(), this.getConditionComparisonOperation(), "comparisonOperation", null, 0, 1, ElementPropertyCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementPropertyCondition_Property(), this.getProperty(), null, "property", null, 0, 1, ElementPropertyCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementPropertyCondition_Value(), ecorePackage.getEString(), "value", null, 0, 1, ElementPropertyCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementParentConditionEClass, ElementParentCondition.class, "ElementParentCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementParentCondition_ComparisonOperation(), this.getConditionComparisonOperation(), "comparisonOperation", null, 0, 1, ElementParentCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementParentCondition_Parent(), this.getIdentifiableElement(), null, "parent", null, 0, 1, ElementParentCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipTagConditionEClass, RelationshipTagCondition.class, "RelationshipTagCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationshipTagCondition_ComparisonOperation(), this.getConditionComparisonOperation(), "comparisonOperation", null, 0, 1, RelationshipTagCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipTagCondition_Tags(), this.getTag(), null, "tags", null, 0, -1, RelationshipTagCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipPropertyConditionEClass, RelationshipPropertyCondition.class, "RelationshipPropertyCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationshipPropertyCondition_ComparisonOperation(), this.getConditionComparisonOperation(), "comparisonOperation", null, 0, 1, RelationshipPropertyCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipPropertyCondition_Property(), this.getProperty(), null, "property", null, 0, 1, RelationshipPropertyCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationshipPropertyCondition_Value(), ecorePackage.getEString(), "value", null, 0, 1, RelationshipPropertyCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipSourceConditionEClass, RelationshipSourceCondition.class, "RelationshipSourceCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationshipSourceCondition_ComparisonOperation(), this.getConditionComparisonOperation(), "comparisonOperation", null, 0, 1, RelationshipSourceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipSourceCondition_Source(), this.getIdentifiableElement(), null, "source", null, 0, 1, RelationshipSourceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipDestinationConditionEClass, RelationshipDestinationCondition.class, "RelationshipDestinationCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationshipDestinationCondition_ComparisonOperation(), this.getConditionComparisonOperation(), "comparisonOperation", null, 0, 1, RelationshipDestinationCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationshipDestinationCondition_Destination(), this.getIdentifiableElement(), null, "destination", null, 0, 1, RelationshipDestinationCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(autoLayoutOptionEEnum, AutoLayoutOption.class, "AutoLayoutOption");
		addEEnumLiteral(autoLayoutOptionEEnum, AutoLayoutOption.LEFT_TO_RIGHT);
		addEEnumLiteral(autoLayoutOptionEEnum, AutoLayoutOption.RIGHT_TO_LEFT);
		addEEnumLiteral(autoLayoutOptionEEnum, AutoLayoutOption.BOTTOM_TO_TOP);
		addEEnumLiteral(autoLayoutOptionEEnum, AutoLayoutOption.TOP_TO_BOTTOM);

		initEEnum(routingEEnum, Routing.class, "Routing");
		addEEnumLiteral(routingEEnum, Routing.DIRECT);
		addEEnumLiteral(routingEEnum, Routing.ORTHOGONAL);
		addEEnumLiteral(routingEEnum, Routing.CURVED);

		initEEnum(borderEEnum, Border.class, "Border");
		addEEnumLiteral(borderEEnum, Border.SOLID);
		addEEnumLiteral(borderEEnum, Border.DASHED);
		addEEnumLiteral(borderEEnum, Border.DOTTED);

		initEEnum(scopeEEnum, Scope.class, "Scope");
		addEEnumLiteral(scopeEEnum, Scope.LANDSCAPE);
		addEEnumLiteral(scopeEEnum, Scope.SOFTWARE_SYSTEM);
		addEEnumLiteral(scopeEEnum, Scope.NONE);

		initEEnum(visibilityEEnum, Visibility.class, "Visibility");
		addEEnumLiteral(visibilityEEnum, Visibility.PRIVATE);
		addEEnumLiteral(visibilityEEnum, Visibility.PUBLIC);

		initEEnum(userPermissionEEnum, UserPermission.class, "UserPermission");
		addEEnumLiteral(userPermissionEEnum, UserPermission.READ);
		addEEnumLiteral(userPermissionEEnum, UserPermission.WRITE);

		initEEnum(shapeEEnum, Shape.class, "Shape");
		addEEnumLiteral(shapeEEnum, Shape.BOX);
		addEEnumLiteral(shapeEEnum, Shape.ROUNDED_BOX);
		addEEnumLiteral(shapeEEnum, Shape.CIRCLE);
		addEEnumLiteral(shapeEEnum, Shape.ELLIPSE);
		addEEnumLiteral(shapeEEnum, Shape.HEXAGON);
		addEEnumLiteral(shapeEEnum, Shape.CYLINDER);
		addEEnumLiteral(shapeEEnum, Shape.PIPE);
		addEEnumLiteral(shapeEEnum, Shape.PERSON);
		addEEnumLiteral(shapeEEnum, Shape.ROBOT);
		addEEnumLiteral(shapeEEnum, Shape.FOLDER);
		addEEnumLiteral(shapeEEnum, Shape.WEB_BROWSER);
		addEEnumLiteral(shapeEEnum, Shape.MOBILE_DEVICE_PORTRAIT);
		addEEnumLiteral(shapeEEnum, Shape.MOBILE_DEVICE_LANDSCAPE);
		addEEnumLiteral(shapeEEnum, Shape.COMPONENT);

		initEEnum(conditionComparisonOperationEEnum, ConditionComparisonOperation.class, "ConditionComparisonOperation");
		addEEnumLiteral(conditionComparisonOperationEEnum, ConditionComparisonOperation.EQUALS);
		addEEnumLiteral(conditionComparisonOperationEEnum, ConditionComparisonOperation.NOT_EQUALS);

		initEEnum(filterTypeEEnum, FilterType.class, "FilterType");
		addEEnumLiteral(filterTypeEEnum, FilterType.PERSON);
		addEEnumLiteral(filterTypeEEnum, FilterType.SOFTWARE_SYSTEM);
		addEEnumLiteral(filterTypeEEnum, FilterType.CONTAINER);
		addEEnumLiteral(filterTypeEEnum, FilterType.COMPONENT);
		addEEnumLiteral(filterTypeEEnum, FilterType.DEPLOYMENT_NODE);

		initEEnum(conditionLogicalOperationEEnum, ConditionLogicalOperation.class, "ConditionLogicalOperation");
		addEEnumLiteral(conditionLogicalOperationEEnum, ConditionLogicalOperation.AND);
		addEEnumLiteral(conditionLogicalOperationEEnum, ConditionLogicalOperation.OR);

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
		  (systemLandscapeViewEClass,
		   source,
		   new String[] {
			   "feature", "includeExpression",
			   "derive", "include",
			   "grammar", "structurizr.expressions.StructurizrExpressions",
			   "entryRule", "SystemLandscapeView_Include"
		   });
		addAnnotation
		  (systemLandscapeViewEClass,
		   source,
		   new String[] {
			   "feature", "excludeExpression",
			   "derive", "exclude",
			   "grammar", "structurizr.expressions.StructurizrExpressions",
			   "entryRule", "SystemLandscapeView_Exclude"
		   });
		addAnnotation
		  (systemContextViewEClass,
		   source,
		   new String[] {
			   "feature", "includeExpression",
			   "derive", "include",
			   "grammar", "structurizr.expressions.StructurizrExpressions",
			   "entryRule", "SystemContextView_Include"
		   });
		addAnnotation
		  (systemContextViewEClass,
		   source,
		   new String[] {
			   "feature", "excludeExpression",
			   "derive", "exclude",
			   "grammar", "structurizr.expressions.StructurizrExpressions",
			   "entryRule", "SystemContextView_Exclude"
		   });
		addAnnotation
		  (containerViewEClass,
		   source,
		   new String[] {
			   "feature", "includeExpression",
			   "derive", "include",
			   "grammar", "structurizr.expressions.StructurizrExpressions",
			   "entryRule", "ContainerView_Include"
		   });
		addAnnotation
		  (containerViewEClass,
		   source,
		   new String[] {
			   "feature", "excludeExpression",
			   "derive", "exclude",
			   "grammar", "structurizr.expressions.StructurizrExpressions",
			   "entryRule", "ContainerView_Exclude"
		   });
		addAnnotation
		  (componentViewEClass,
		   source,
		   new String[] {
			   "feature", "includeExpression",
			   "derive", "include",
			   "grammar", "structurizr.expressions.StructurizrExpressions",
			   "entryRule", "ComponentView_Include"
		   });
		addAnnotation
		  (componentViewEClass,
		   source,
		   new String[] {
			   "feature", "excludeExpression",
			   "derive", "exclude",
			   "grammar", "structurizr.expressions.StructurizrExpressions",
			   "entryRule", "ComponentView_Exclude"
		   });
	}

} //StructurizrPackageImpl (Patched)