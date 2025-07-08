/**
 */
package structurizr;

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
 * @see structurizr.StructurizrFactory
 * @model kind="package"
 * @generated
 */
public interface StructurizrPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "structurizr";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "structurizr";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "structurizr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructurizrPackage eINSTANCE = structurizr.impl.StructurizrPackageImpl.init();

	/**
	 * The meta object id for the '{@link structurizr.impl.WorkspaceImpl <em>Workspace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.WorkspaceImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getWorkspace()
	 * @generated
	 */
	int WORKSPACE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__MODEL = 2;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__VIEWS = 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__PROPERTIES = 4;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__CONFIGURATION = 5;

	/**
	 * The number of structural features of the '<em>Workspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Workspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.ConfigurationImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__SCOPE = 0;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__VISIBILITY = 1;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__USERS = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__PROPERTIES = 3;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.PropertyImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.UserImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getUser()
	 * @generated
	 */
	int USER = 3;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USERNAME = 0;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PERMISSION = 1;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.IdentifiableElementImpl <em>Identifiable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.IdentifiableElementImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getIdentifiableElement()
	 * @generated
	 */
	int IDENTIFIABLE_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT__RELATIONSHIPS = 2;

	/**
	 * The number of structural features of the '<em>Identifiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Identifiable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.C4ElementImpl <em>C4 Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.C4ElementImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getC4Element()
	 * @generated
	 */
	int C4_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_ELEMENT__IDENTIFIER = IDENTIFIABLE_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_ELEMENT__NAME = IDENTIFIABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_ELEMENT__RELATIONSHIPS = IDENTIFIABLE_ELEMENT__RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_ELEMENT__DESCRIPTION = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_ELEMENT__URL = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_ELEMENT__TAGS = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_ELEMENT__PROPERTIES = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Perspectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_ELEMENT__PERSPECTIVES = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>C4 Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_ELEMENT_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>C4 Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int C4_ELEMENT_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.RelationshipImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__URL = 3;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TECHNOLOGY = 4;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TAGS = 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__PROPERTIES = 6;

	/**
	 * The feature id for the '<em><b>Perspectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__PERSPECTIVES = 7;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.TagImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = 0;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.TechnologyImpl <em>Technology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.TechnologyImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getTechnology()
	 * @generated
	 */
	int TECHNOLOGY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Technology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Technology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.PerspectiveImpl <em>Perspective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.PerspectiveImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getPerspective()
	 * @generated
	 */
	int PERSPECTIVE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Perspective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Perspective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSPECTIVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.ModelImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 10;

	/**
	 * The feature id for the '<em><b>Software System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__SOFTWARE_SYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Persons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__PERSONS = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Deployment Environments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__DEPLOYMENT_ENVIRONMENTS = 3;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__RELATIONSHIPS = 4;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.ElementImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__IDENTIFIER = C4_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = C4_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__RELATIONSHIPS = C4_ELEMENT__RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DESCRIPTION = C4_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__URL = C4_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TAGS = C4_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PROPERTIES = C4_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Perspectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PERSPECTIVES = C4_ELEMENT__PERSPECTIVES;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__METADATA = C4_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = C4_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = C4_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.PersonImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 12;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__IDENTIFIER = C4_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = C4_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__RELATIONSHIPS = C4_ELEMENT__RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__DESCRIPTION = C4_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__URL = C4_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TAGS = C4_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PROPERTIES = C4_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Perspectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__PERSPECTIVES = C4_ELEMENT__PERSPECTIVES;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = C4_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = C4_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.SoftwareSystemImpl <em>Software System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.SoftwareSystemImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getSoftwareSystem()
	 * @generated
	 */
	int SOFTWARE_SYSTEM = 13;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__IDENTIFIER = C4_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__NAME = C4_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__RELATIONSHIPS = C4_ELEMENT__RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__DESCRIPTION = C4_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__URL = C4_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__TAGS = C4_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__PROPERTIES = C4_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Perspectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__PERSPECTIVES = C4_ELEMENT__PERSPECTIVES;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM__CONTAINERS = C4_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Software System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM_FEATURE_COUNT = C4_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Software System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM_OPERATION_COUNT = C4_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.ContainerImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 14;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IDENTIFIER = C4_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = C4_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__RELATIONSHIPS = C4_ELEMENT__RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DESCRIPTION = C4_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__URL = C4_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TAGS = C4_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PROPERTIES = C4_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Perspectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PERSPECTIVES = C4_ELEMENT__PERSPECTIVES;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TECHNOLOGY = C4_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__COMPONENTS = C4_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = C4_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = C4_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.ComponentImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 15;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IDENTIFIER = C4_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = C4_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__RELATIONSHIPS = C4_ELEMENT__RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DESCRIPTION = C4_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__URL = C4_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TAGS = C4_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PROPERTIES = C4_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Perspectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__PERSPECTIVES = C4_ELEMENT__PERSPECTIVES;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__TECHNOLOGY = C4_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = C4_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = C4_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.DeploymentEnvironmentImpl <em>Deployment Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.DeploymentEnvironmentImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getDeploymentEnvironment()
	 * @generated
	 */
	int DEPLOYMENT_ENVIRONMENT = 16;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_ENVIRONMENT__IDENTIFIER = IDENTIFIABLE_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_ENVIRONMENT__NAME = IDENTIFIABLE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_ENVIRONMENT__RELATIONSHIPS = IDENTIFIABLE_ELEMENT__RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Deployment Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_ENVIRONMENT__DEPLOYMENT_GROUPS = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deployment Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_ENVIRONMENT__DEPLOYMENT_NODES = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Deployment Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_ENVIRONMENT_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Deployment Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_ENVIRONMENT_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.DeploymentGroupImpl <em>Deployment Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.DeploymentGroupImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getDeploymentGroup()
	 * @generated
	 */
	int DEPLOYMENT_GROUP = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_GROUP__NAME = 0;

	/**
	 * The number of structural features of the '<em>Deployment Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_GROUP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Deployment Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.DeploymentNodeImpl <em>Deployment Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.DeploymentNodeImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getDeploymentNode()
	 * @generated
	 */
	int DEPLOYMENT_NODE = 18;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_NODE__IDENTIFIER = C4_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_NODE__NAME = C4_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_NODE__RELATIONSHIPS = C4_ELEMENT__RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_NODE__DESCRIPTION = C4_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_NODE__URL = C4_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_NODE__TAGS = C4_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_NODE__PROPERTIES = C4_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Perspectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_NODE__PERSPECTIVES = C4_ELEMENT__PERSPECTIVES;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_NODE__TECHNOLOGY = C4_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deployment Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_NODE__DEPLOYMENT_NODES = C4_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Infrastructure Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_NODE__INFRASTRUCTURE_NODES = C4_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Software System Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_NODE__SOFTWARE_SYSTEM_INSTANCES = C4_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Container Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_NODE__CONTAINER_INSTANCES = C4_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Deployment Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_NODE_FEATURE_COUNT = C4_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Deployment Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_NODE_OPERATION_COUNT = C4_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.InfrastructureNodeImpl <em>Infrastructure Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.InfrastructureNodeImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getInfrastructureNode()
	 * @generated
	 */
	int INFRASTRUCTURE_NODE = 19;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_NODE__IDENTIFIER = C4_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_NODE__NAME = C4_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_NODE__RELATIONSHIPS = C4_ELEMENT__RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_NODE__DESCRIPTION = C4_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_NODE__URL = C4_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_NODE__TAGS = C4_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_NODE__PROPERTIES = C4_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Perspectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_NODE__PERSPECTIVES = C4_ELEMENT__PERSPECTIVES;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_NODE__TECHNOLOGY = C4_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Infrastructure Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_NODE_FEATURE_COUNT = C4_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Infrastructure Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFRASTRUCTURE_NODE_OPERATION_COUNT = C4_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.SoftwareSystemInstanceImpl <em>Software System Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.SoftwareSystemInstanceImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getSoftwareSystemInstance()
	 * @generated
	 */
	int SOFTWARE_SYSTEM_INSTANCE = 20;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM_INSTANCE__IDENTIFIER = C4_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM_INSTANCE__NAME = C4_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM_INSTANCE__RELATIONSHIPS = C4_ELEMENT__RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM_INSTANCE__DESCRIPTION = C4_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM_INSTANCE__URL = C4_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM_INSTANCE__TAGS = C4_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM_INSTANCE__PROPERTIES = C4_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Perspectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM_INSTANCE__PERSPECTIVES = C4_ELEMENT__PERSPECTIVES;

	/**
	 * The feature id for the '<em><b>Software System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM_INSTANCE__SOFTWARE_SYSTEM = C4_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deployment Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM_INSTANCE__DEPLOYMENT_GROUPS = C4_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Health Check</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM_INSTANCE__HEALTH_CHECK = C4_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Software System Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM_INSTANCE_FEATURE_COUNT = C4_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Software System Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_SYSTEM_INSTANCE_OPERATION_COUNT = C4_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.ContainerInstanceImpl <em>Container Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.ContainerInstanceImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getContainerInstance()
	 * @generated
	 */
	int CONTAINER_INSTANCE = 21;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__IDENTIFIER = C4_ELEMENT__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__NAME = C4_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__RELATIONSHIPS = C4_ELEMENT__RELATIONSHIPS;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__DESCRIPTION = C4_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__URL = C4_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__TAGS = C4_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__PROPERTIES = C4_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Perspectives</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__PERSPECTIVES = C4_ELEMENT__PERSPECTIVES;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__CONTAINER = C4_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deployment Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__DEPLOYMENT_GROUPS = C4_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Health Check</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE__HEALTH_CHECK = C4_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Container Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE_FEATURE_COUNT = C4_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Container Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_INSTANCE_OPERATION_COUNT = C4_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.HealthCheckImpl <em>Health Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.HealthCheckImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getHealthCheck()
	 * @generated
	 */
	int HEALTH_CHECK = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_CHECK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_CHECK__URL = 1;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_CHECK__INTERVAL = 2;

	/**
	 * The feature id for the '<em><b>Timeouts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_CHECK__TIMEOUTS = 3;

	/**
	 * The number of structural features of the '<em>Health Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_CHECK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Health Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_CHECK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.ViewsImpl <em>Views</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.ViewsImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getViews()
	 * @generated
	 */
	int VIEWS = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS__NAME = 0;

	/**
	 * The feature id for the '<em><b>View Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS__VIEW_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS__STYLES = 2;

	/**
	 * The number of structural features of the '<em>Views</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Views</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEWS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.ViewElementImpl <em>View Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.ViewElementImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getViewElement()
	 * @generated
	 */
	int VIEW_ELEMENT = 24;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__KEY = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Auto Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__AUTO_LAYOUT = 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__PROPERTIES = 4;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__INCLUDE = 5;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__EXCLUDE = 6;

	/**
	 * The feature id for the '<em><b>Include Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__INCLUDE_EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Exclude Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__EXCLUDE_EXPRESSION = 8;

	/**
	 * The number of structural features of the '<em>View Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>View Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.SystemLandscapeViewImpl <em>System Landscape View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.SystemLandscapeViewImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getSystemLandscapeView()
	 * @generated
	 */
	int SYSTEM_LANDSCAPE_VIEW = 25;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LANDSCAPE_VIEW__KEY = VIEW_ELEMENT__KEY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LANDSCAPE_VIEW__TITLE = VIEW_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LANDSCAPE_VIEW__DESCRIPTION = VIEW_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Auto Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LANDSCAPE_VIEW__AUTO_LAYOUT = VIEW_ELEMENT__AUTO_LAYOUT;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LANDSCAPE_VIEW__PROPERTIES = VIEW_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LANDSCAPE_VIEW__INCLUDE = VIEW_ELEMENT__INCLUDE;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LANDSCAPE_VIEW__EXCLUDE = VIEW_ELEMENT__EXCLUDE;

	/**
	 * The feature id for the '<em><b>Include Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LANDSCAPE_VIEW__INCLUDE_EXPRESSION = VIEW_ELEMENT__INCLUDE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Exclude Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LANDSCAPE_VIEW__EXCLUDE_EXPRESSION = VIEW_ELEMENT__EXCLUDE_EXPRESSION;

	/**
	 * The number of structural features of the '<em>System Landscape View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LANDSCAPE_VIEW_FEATURE_COUNT = VIEW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>System Landscape View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LANDSCAPE_VIEW_OPERATION_COUNT = VIEW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.SystemContextViewImpl <em>System Context View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.SystemContextViewImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getSystemContextView()
	 * @generated
	 */
	int SYSTEM_CONTEXT_VIEW = 26;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT_VIEW__KEY = VIEW_ELEMENT__KEY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT_VIEW__TITLE = VIEW_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT_VIEW__DESCRIPTION = VIEW_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Auto Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT_VIEW__AUTO_LAYOUT = VIEW_ELEMENT__AUTO_LAYOUT;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT_VIEW__PROPERTIES = VIEW_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT_VIEW__INCLUDE = VIEW_ELEMENT__INCLUDE;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT_VIEW__EXCLUDE = VIEW_ELEMENT__EXCLUDE;

	/**
	 * The feature id for the '<em><b>Include Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT_VIEW__INCLUDE_EXPRESSION = VIEW_ELEMENT__INCLUDE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Exclude Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT_VIEW__EXCLUDE_EXPRESSION = VIEW_ELEMENT__EXCLUDE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Software System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT_VIEW__SOFTWARE_SYSTEM = VIEW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Context View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT_VIEW_FEATURE_COUNT = VIEW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>System Context View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_CONTEXT_VIEW_OPERATION_COUNT = VIEW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.ContainerViewImpl <em>Container View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.ContainerViewImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getContainerView()
	 * @generated
	 */
	int CONTAINER_VIEW = 27;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_VIEW__KEY = VIEW_ELEMENT__KEY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_VIEW__TITLE = VIEW_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_VIEW__DESCRIPTION = VIEW_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Auto Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_VIEW__AUTO_LAYOUT = VIEW_ELEMENT__AUTO_LAYOUT;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_VIEW__PROPERTIES = VIEW_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_VIEW__INCLUDE = VIEW_ELEMENT__INCLUDE;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_VIEW__EXCLUDE = VIEW_ELEMENT__EXCLUDE;

	/**
	 * The feature id for the '<em><b>Include Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_VIEW__INCLUDE_EXPRESSION = VIEW_ELEMENT__INCLUDE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Exclude Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_VIEW__EXCLUDE_EXPRESSION = VIEW_ELEMENT__EXCLUDE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Software System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_VIEW__SOFTWARE_SYSTEM = VIEW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_VIEW_FEATURE_COUNT = VIEW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Container View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_VIEW_OPERATION_COUNT = VIEW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.ComponentViewImpl <em>Component View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.ComponentViewImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getComponentView()
	 * @generated
	 */
	int COMPONENT_VIEW = 28;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VIEW__KEY = VIEW_ELEMENT__KEY;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VIEW__TITLE = VIEW_ELEMENT__TITLE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VIEW__DESCRIPTION = VIEW_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Auto Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VIEW__AUTO_LAYOUT = VIEW_ELEMENT__AUTO_LAYOUT;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VIEW__PROPERTIES = VIEW_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VIEW__INCLUDE = VIEW_ELEMENT__INCLUDE;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VIEW__EXCLUDE = VIEW_ELEMENT__EXCLUDE;

	/**
	 * The feature id for the '<em><b>Include Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VIEW__INCLUDE_EXPRESSION = VIEW_ELEMENT__INCLUDE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Exclude Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VIEW__EXCLUDE_EXPRESSION = VIEW_ELEMENT__EXCLUDE_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VIEW__CONTAINER = VIEW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VIEW_FEATURE_COUNT = VIEW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Component View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_VIEW_OPERATION_COUNT = VIEW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.AutoLayoutImpl <em>Auto Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.AutoLayoutImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getAutoLayout()
	 * @generated
	 */
	int AUTO_LAYOUT = 29;

	/**
	 * The feature id for the '<em><b>Auto Layout Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_LAYOUT__AUTO_LAYOUT_OPTION = 0;

	/**
	 * The feature id for the '<em><b>Rank Separation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_LAYOUT__RANK_SEPARATION = 1;

	/**
	 * The feature id for the '<em><b>Node Separation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_LAYOUT__NODE_SEPARATION = 2;

	/**
	 * The number of structural features of the '<em>Auto Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_LAYOUT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Auto Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_LAYOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.StyleImpl <em>Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.StyleImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getStyle()
	 * @generated
	 */
	int STYLE = 30;

	/**
	 * The number of structural features of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.ElementStyleImpl <em>Element Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.ElementStyleImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getElementStyle()
	 * @generated
	 */
	int ELEMENT_STYLE = 31;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STYLE__TAG = STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STYLE__ICON = STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STYLE__WIDTH = STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STYLE__HEIGHT = STYLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STYLE__STROKE_WIDTH = STYLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STYLE__FONT_SIZE = STYLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STYLE__OPACITY = STYLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STYLE__METADATA = STYLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STYLE__DESCRIPTION = STYLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STYLE__BACKGROUND = STYLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STYLE__COLOR = STYLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STYLE__STROKE = STYLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STYLE__BORDER = STYLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STYLE__SHAPE = STYLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STYLE__PROPERTIES = STYLE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Element Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 15;

	/**
	 * The number of operations of the '<em>Element Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_STYLE_OPERATION_COUNT = STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.RelationshipStyleImpl <em>Relationship Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.RelationshipStyleImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getRelationshipStyle()
	 * @generated
	 */
	int RELATIONSHIP_STYLE = 32;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_STYLE__TAG = STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_STYLE__THICKNESS = STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_STYLE__FONT_SIZE = STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_STYLE__WIDTH = STYLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_STYLE__OPACITY = STYLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_STYLE__POSITION = STYLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_STYLE__COLOR = STYLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_STYLE__STYLE = STYLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Routing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_STYLE__ROUTING = STYLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_STYLE__PROPERTIES = STYLE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Relationship Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Relationship Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_STYLE_OPERATION_COUNT = STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.ConditionElementImpl <em>Condition Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.ConditionElementImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getConditionElement()
	 * @generated
	 */
	int CONDITION_ELEMENT = 33;

	/**
	 * The number of structural features of the '<em>Condition Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.NoFilterConditionImpl <em>No Filter Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.NoFilterConditionImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getNoFilterCondition()
	 * @generated
	 */
	int NO_FILTER_CONDITION = 34;

	/**
	 * The number of structural features of the '<em>No Filter Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_FILTER_CONDITION_FEATURE_COUNT = CONDITION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>No Filter Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_FILTER_CONDITION_OPERATION_COUNT = CONDITION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.FilterConditionImpl <em>Filter Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.FilterConditionImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getFilterCondition()
	 * @generated
	 */
	int FILTER_CONDITION = 35;

	/**
	 * The number of structural features of the '<em>Filter Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONDITION_FEATURE_COUNT = CONDITION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Filter Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CONDITION_OPERATION_COUNT = CONDITION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.ElementFilterConditionImpl <em>Element Filter Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.ElementFilterConditionImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getElementFilterCondition()
	 * @generated
	 */
	int ELEMENT_FILTER_CONDITION = 36;

	/**
	 * The number of structural features of the '<em>Element Filter Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FILTER_CONDITION_FEATURE_COUNT = FILTER_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Element Filter Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FILTER_CONDITION_OPERATION_COUNT = FILTER_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.RelationshipFilterConditionImpl <em>Relationship Filter Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.RelationshipFilterConditionImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getRelationshipFilterCondition()
	 * @generated
	 */
	int RELATIONSHIP_FILTER_CONDITION = 37;

	/**
	 * The number of structural features of the '<em>Relationship Filter Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FILTER_CONDITION_FEATURE_COUNT = FILTER_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relationship Filter Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FILTER_CONDITION_OPERATION_COUNT = FILTER_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.CompositeConditionImpl <em>Composite Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.CompositeConditionImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getCompositeCondition()
	 * @generated
	 */
	int COMPOSITE_CONDITION = 38;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__LEFT = FILTER_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logical Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__LOGICAL_OPERATION = FILTER_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__RIGHT = FILTER_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Composite Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION_FEATURE_COUNT = FILTER_CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Composite Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION_OPERATION_COUNT = FILTER_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.ElementTagConditionImpl <em>Element Tag Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.ElementTagConditionImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getElementTagCondition()
	 * @generated
	 */
	int ELEMENT_TAG_CONDITION = 39;

	/**
	 * The feature id for the '<em><b>Comparison Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TAG_CONDITION__COMPARISON_OPERATION = ELEMENT_FILTER_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TAG_CONDITION__TAGS = ELEMENT_FILTER_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element Tag Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TAG_CONDITION_FEATURE_COUNT = ELEMENT_FILTER_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Element Tag Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TAG_CONDITION_OPERATION_COUNT = ELEMENT_FILTER_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.ElementTechnologyConditionImpl <em>Element Technology Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.ElementTechnologyConditionImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getElementTechnologyCondition()
	 * @generated
	 */
	int ELEMENT_TECHNOLOGY_CONDITION = 40;

	/**
	 * The feature id for the '<em><b>Comparison Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TECHNOLOGY_CONDITION__COMPARISON_OPERATION = ELEMENT_FILTER_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TECHNOLOGY_CONDITION__TECHNOLOGY = ELEMENT_FILTER_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element Technology Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TECHNOLOGY_CONDITION_FEATURE_COUNT = ELEMENT_FILTER_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Element Technology Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TECHNOLOGY_CONDITION_OPERATION_COUNT = ELEMENT_FILTER_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.ElementTypeConditionImpl <em>Element Type Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.ElementTypeConditionImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getElementTypeCondition()
	 * @generated
	 */
	int ELEMENT_TYPE_CONDITION = 41;

	/**
	 * The feature id for the '<em><b>Comparison Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_CONDITION__COMPARISON_OPERATION = ELEMENT_FILTER_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_CONDITION__TYPE = ELEMENT_FILTER_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element Type Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_CONDITION_FEATURE_COUNT = ELEMENT_FILTER_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Element Type Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_CONDITION_OPERATION_COUNT = ELEMENT_FILTER_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.ElementPropertyConditionImpl <em>Element Property Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.ElementPropertyConditionImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getElementPropertyCondition()
	 * @generated
	 */
	int ELEMENT_PROPERTY_CONDITION = 42;

	/**
	 * The feature id for the '<em><b>Comparison Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PROPERTY_CONDITION__COMPARISON_OPERATION = ELEMENT_FILTER_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PROPERTY_CONDITION__PROPERTY = ELEMENT_FILTER_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PROPERTY_CONDITION__VALUE = ELEMENT_FILTER_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Element Property Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PROPERTY_CONDITION_FEATURE_COUNT = ELEMENT_FILTER_CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Element Property Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PROPERTY_CONDITION_OPERATION_COUNT = ELEMENT_FILTER_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.ElementParentConditionImpl <em>Element Parent Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.ElementParentConditionImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getElementParentCondition()
	 * @generated
	 */
	int ELEMENT_PARENT_CONDITION = 43;

	/**
	 * The feature id for the '<em><b>Comparison Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARENT_CONDITION__COMPARISON_OPERATION = ELEMENT_FILTER_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARENT_CONDITION__PARENT = ELEMENT_FILTER_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Element Parent Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARENT_CONDITION_FEATURE_COUNT = ELEMENT_FILTER_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Element Parent Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PARENT_CONDITION_OPERATION_COUNT = ELEMENT_FILTER_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.RelationshipTagConditionImpl <em>Relationship Tag Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.RelationshipTagConditionImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getRelationshipTagCondition()
	 * @generated
	 */
	int RELATIONSHIP_TAG_CONDITION = 44;

	/**
	 * The feature id for the '<em><b>Comparison Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TAG_CONDITION__COMPARISON_OPERATION = RELATIONSHIP_FILTER_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TAG_CONDITION__TAGS = RELATIONSHIP_FILTER_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relationship Tag Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TAG_CONDITION_FEATURE_COUNT = RELATIONSHIP_FILTER_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Relationship Tag Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_TAG_CONDITION_OPERATION_COUNT = RELATIONSHIP_FILTER_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.RelationshipPropertyConditionImpl <em>Relationship Property Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.RelationshipPropertyConditionImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getRelationshipPropertyCondition()
	 * @generated
	 */
	int RELATIONSHIP_PROPERTY_CONDITION = 45;

	/**
	 * The feature id for the '<em><b>Comparison Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PROPERTY_CONDITION__COMPARISON_OPERATION = RELATIONSHIP_FILTER_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PROPERTY_CONDITION__PROPERTY = RELATIONSHIP_FILTER_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PROPERTY_CONDITION__VALUE = RELATIONSHIP_FILTER_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relationship Property Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PROPERTY_CONDITION_FEATURE_COUNT = RELATIONSHIP_FILTER_CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Relationship Property Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PROPERTY_CONDITION_OPERATION_COUNT = RELATIONSHIP_FILTER_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.RelationshipSourceConditionImpl <em>Relationship Source Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.RelationshipSourceConditionImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getRelationshipSourceCondition()
	 * @generated
	 */
	int RELATIONSHIP_SOURCE_CONDITION = 46;

	/**
	 * The feature id for the '<em><b>Comparison Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_SOURCE_CONDITION__COMPARISON_OPERATION = RELATIONSHIP_FILTER_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_SOURCE_CONDITION__SOURCE = RELATIONSHIP_FILTER_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relationship Source Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_SOURCE_CONDITION_FEATURE_COUNT = RELATIONSHIP_FILTER_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Relationship Source Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_SOURCE_CONDITION_OPERATION_COUNT = RELATIONSHIP_FILTER_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.impl.RelationshipDestinationConditionImpl <em>Relationship Destination Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.impl.RelationshipDestinationConditionImpl
	 * @see structurizr.impl.StructurizrPackageImpl#getRelationshipDestinationCondition()
	 * @generated
	 */
	int RELATIONSHIP_DESTINATION_CONDITION = 47;

	/**
	 * The feature id for the '<em><b>Comparison Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_DESTINATION_CONDITION__COMPARISON_OPERATION = RELATIONSHIP_FILTER_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_DESTINATION_CONDITION__DESTINATION = RELATIONSHIP_FILTER_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relationship Destination Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_DESTINATION_CONDITION_FEATURE_COUNT = RELATIONSHIP_FILTER_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Relationship Destination Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_DESTINATION_CONDITION_OPERATION_COUNT = RELATIONSHIP_FILTER_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structurizr.AutoLayoutOption <em>Auto Layout Option</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.AutoLayoutOption
	 * @see structurizr.impl.StructurizrPackageImpl#getAutoLayoutOption()
	 * @generated
	 */
	int AUTO_LAYOUT_OPTION = 48;

	/**
	 * The meta object id for the '{@link structurizr.Routing <em>Routing</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.Routing
	 * @see structurizr.impl.StructurizrPackageImpl#getRouting()
	 * @generated
	 */
	int ROUTING = 49;

	/**
	 * The meta object id for the '{@link structurizr.Border <em>Border</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.Border
	 * @see structurizr.impl.StructurizrPackageImpl#getBorder()
	 * @generated
	 */
	int BORDER = 50;

	/**
	 * The meta object id for the '{@link structurizr.Scope <em>Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.Scope
	 * @see structurizr.impl.StructurizrPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 51;

	/**
	 * The meta object id for the '{@link structurizr.Visibility <em>Visibility</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.Visibility
	 * @see structurizr.impl.StructurizrPackageImpl#getVisibility()
	 * @generated
	 */
	int VISIBILITY = 52;

	/**
	 * The meta object id for the '{@link structurizr.UserPermission <em>User Permission</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.UserPermission
	 * @see structurizr.impl.StructurizrPackageImpl#getUserPermission()
	 * @generated
	 */
	int USER_PERMISSION = 53;

	/**
	 * The meta object id for the '{@link structurizr.Shape <em>Shape</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.Shape
	 * @see structurizr.impl.StructurizrPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 54;

	/**
	 * The meta object id for the '{@link structurizr.ConditionComparisonOperation <em>Condition Comparison Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.ConditionComparisonOperation
	 * @see structurizr.impl.StructurizrPackageImpl#getConditionComparisonOperation()
	 * @generated
	 */
	int CONDITION_COMPARISON_OPERATION = 55;

	/**
	 * The meta object id for the '{@link structurizr.FilterType <em>Filter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.FilterType
	 * @see structurizr.impl.StructurizrPackageImpl#getFilterType()
	 * @generated
	 */
	int FILTER_TYPE = 56;

	/**
	 * The meta object id for the '{@link structurizr.ConditionLogicalOperation <em>Condition Logical Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structurizr.ConditionLogicalOperation
	 * @see structurizr.impl.StructurizrPackageImpl#getConditionLogicalOperation()
	 * @generated
	 */
	int CONDITION_LOGICAL_OPERATION = 57;


	/**
	 * Returns the meta object for class '{@link structurizr.Workspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workspace</em>'.
	 * @see structurizr.Workspace
	 * @generated
	 */
	EClass getWorkspace();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.Workspace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see structurizr.Workspace#getName()
	 * @see #getWorkspace()
	 * @generated
	 */
	EAttribute getWorkspace_Name();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.Workspace#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see structurizr.Workspace#getDescription()
	 * @see #getWorkspace()
	 * @generated
	 */
	EAttribute getWorkspace_Description();

	/**
	 * Returns the meta object for the containment reference '{@link structurizr.Workspace#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see structurizr.Workspace#getModel()
	 * @see #getWorkspace()
	 * @generated
	 */
	EReference getWorkspace_Model();

	/**
	 * Returns the meta object for the containment reference '{@link structurizr.Workspace#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Views</em>'.
	 * @see structurizr.Workspace#getViews()
	 * @see #getWorkspace()
	 * @generated
	 */
	EReference getWorkspace_Views();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.Workspace#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see structurizr.Workspace#getProperties()
	 * @see #getWorkspace()
	 * @generated
	 */
	EReference getWorkspace_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link structurizr.Workspace#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see structurizr.Workspace#getConfiguration()
	 * @see #getWorkspace()
	 * @generated
	 */
	EReference getWorkspace_Configuration();

	/**
	 * Returns the meta object for class '{@link structurizr.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see structurizr.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.Configuration#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see structurizr.Configuration#getScope()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Scope();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.Configuration#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see structurizr.Configuration#getVisibility()
	 * @see #getConfiguration()
	 * @generated
	 */
	EAttribute getConfiguration_Visibility();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.Configuration#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see structurizr.Configuration#getUsers()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Users();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.Configuration#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see structurizr.Configuration#getProperties()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Properties();

	/**
	 * Returns the meta object for class '{@link structurizr.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see structurizr.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.Property#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see structurizr.Property#getName()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Name();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see structurizr.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link structurizr.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see structurizr.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.User#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see structurizr.User#getUsername()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Username();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.User#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permission</em>'.
	 * @see structurizr.User#getPermission()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Permission();

	/**
	 * Returns the meta object for class '{@link structurizr.IdentifiableElement <em>Identifiable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable Element</em>'.
	 * @see structurizr.IdentifiableElement
	 * @generated
	 */
	EClass getIdentifiableElement();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.IdentifiableElement#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see structurizr.IdentifiableElement#getIdentifier()
	 * @see #getIdentifiableElement()
	 * @generated
	 */
	EAttribute getIdentifiableElement_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.IdentifiableElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see structurizr.IdentifiableElement#getName()
	 * @see #getIdentifiableElement()
	 * @generated
	 */
	EAttribute getIdentifiableElement_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.IdentifiableElement#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see structurizr.IdentifiableElement#getRelationships()
	 * @see #getIdentifiableElement()
	 * @generated
	 */
	EReference getIdentifiableElement_Relationships();

	/**
	 * Returns the meta object for class '{@link structurizr.C4Element <em>C4 Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>C4 Element</em>'.
	 * @see structurizr.C4Element
	 * @generated
	 */
	EClass getC4Element();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.C4Element#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see structurizr.C4Element#getDescription()
	 * @see #getC4Element()
	 * @generated
	 */
	EAttribute getC4Element_Description();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.C4Element#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see structurizr.C4Element#getUrl()
	 * @see #getC4Element()
	 * @generated
	 */
	EAttribute getC4Element_Url();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.C4Element#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see structurizr.C4Element#getTags()
	 * @see #getC4Element()
	 * @generated
	 */
	EReference getC4Element_Tags();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.C4Element#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see structurizr.C4Element#getProperties()
	 * @see #getC4Element()
	 * @generated
	 */
	EReference getC4Element_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.C4Element#getPerspectives <em>Perspectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Perspectives</em>'.
	 * @see structurizr.C4Element#getPerspectives()
	 * @see #getC4Element()
	 * @generated
	 */
	EReference getC4Element_Perspectives();

	/**
	 * Returns the meta object for class '{@link structurizr.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see structurizr.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference '{@link structurizr.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see structurizr.Relationship#getSource()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link structurizr.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see structurizr.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.Relationship#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see structurizr.Relationship#getDescription()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Description();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.Relationship#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see structurizr.Relationship#getUrl()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Url();

	/**
	 * Returns the meta object for the containment reference '{@link structurizr.Relationship#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Technology</em>'.
	 * @see structurizr.Relationship#getTechnology()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Technology();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.Relationship#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see structurizr.Relationship#getTags()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Tags();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.Relationship#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see structurizr.Relationship#getProperties()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.Relationship#getPerspectives <em>Perspectives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Perspectives</em>'.
	 * @see structurizr.Relationship#getPerspectives()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Perspectives();

	/**
	 * Returns the meta object for class '{@link structurizr.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see structurizr.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.Tag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see structurizr.Tag#getName()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Name();

	/**
	 * Returns the meta object for class '{@link structurizr.Technology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology</em>'.
	 * @see structurizr.Technology
	 * @generated
	 */
	EClass getTechnology();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.Technology#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see structurizr.Technology#getName()
	 * @see #getTechnology()
	 * @generated
	 */
	EAttribute getTechnology_Name();

	/**
	 * Returns the meta object for class '{@link structurizr.Perspective <em>Perspective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perspective</em>'.
	 * @see structurizr.Perspective
	 * @generated
	 */
	EClass getPerspective();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.Perspective#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see structurizr.Perspective#getName()
	 * @see #getPerspective()
	 * @generated
	 */
	EAttribute getPerspective_Name();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.Perspective#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see structurizr.Perspective#getDescription()
	 * @see #getPerspective()
	 * @generated
	 */
	EAttribute getPerspective_Description();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.Perspective#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see structurizr.Perspective#getValue()
	 * @see #getPerspective()
	 * @generated
	 */
	EAttribute getPerspective_Value();

	/**
	 * Returns the meta object for class '{@link structurizr.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see structurizr.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference '{@link structurizr.Model#getSoftwareSystem <em>Software System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Software System</em>'.
	 * @see structurizr.Model#getSoftwareSystem()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_SoftwareSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.Model#getPersons <em>Persons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persons</em>'.
	 * @see structurizr.Model#getPersons()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Persons();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.Model#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see structurizr.Model#getElements()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.Model#getDeploymentEnvironments <em>Deployment Environments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployment Environments</em>'.
	 * @see structurizr.Model#getDeploymentEnvironments()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_DeploymentEnvironments();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.Model#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see structurizr.Model#getRelationships()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Relationships();

	/**
	 * Returns the meta object for class '{@link structurizr.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see structurizr.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.Element#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see structurizr.Element#getMetadata()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Metadata();

	/**
	 * Returns the meta object for class '{@link structurizr.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see structurizr.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for class '{@link structurizr.SoftwareSystem <em>Software System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software System</em>'.
	 * @see structurizr.SoftwareSystem
	 * @generated
	 */
	EClass getSoftwareSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.SoftwareSystem#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containers</em>'.
	 * @see structurizr.SoftwareSystem#getContainers()
	 * @see #getSoftwareSystem()
	 * @generated
	 */
	EReference getSoftwareSystem_Containers();

	/**
	 * Returns the meta object for class '{@link structurizr.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see structurizr.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference '{@link structurizr.Container#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Technology</em>'.
	 * @see structurizr.Container#getTechnology()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Technology();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.Container#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see structurizr.Container#getComponents()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Components();

	/**
	 * Returns the meta object for class '{@link structurizr.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see structurizr.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference '{@link structurizr.Component#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Technology</em>'.
	 * @see structurizr.Component#getTechnology()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Technology();

	/**
	 * Returns the meta object for class '{@link structurizr.DeploymentEnvironment <em>Deployment Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Environment</em>'.
	 * @see structurizr.DeploymentEnvironment
	 * @generated
	 */
	EClass getDeploymentEnvironment();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.DeploymentEnvironment#getDeploymentGroups <em>Deployment Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployment Groups</em>'.
	 * @see structurizr.DeploymentEnvironment#getDeploymentGroups()
	 * @see #getDeploymentEnvironment()
	 * @generated
	 */
	EReference getDeploymentEnvironment_DeploymentGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.DeploymentEnvironment#getDeploymentNodes <em>Deployment Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployment Nodes</em>'.
	 * @see structurizr.DeploymentEnvironment#getDeploymentNodes()
	 * @see #getDeploymentEnvironment()
	 * @generated
	 */
	EReference getDeploymentEnvironment_DeploymentNodes();

	/**
	 * Returns the meta object for class '{@link structurizr.DeploymentGroup <em>Deployment Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Group</em>'.
	 * @see structurizr.DeploymentGroup
	 * @generated
	 */
	EClass getDeploymentGroup();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.DeploymentGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see structurizr.DeploymentGroup#getName()
	 * @see #getDeploymentGroup()
	 * @generated
	 */
	EAttribute getDeploymentGroup_Name();

	/**
	 * Returns the meta object for class '{@link structurizr.DeploymentNode <em>Deployment Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment Node</em>'.
	 * @see structurizr.DeploymentNode
	 * @generated
	 */
	EClass getDeploymentNode();

	/**
	 * Returns the meta object for the containment reference '{@link structurizr.DeploymentNode#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Technology</em>'.
	 * @see structurizr.DeploymentNode#getTechnology()
	 * @see #getDeploymentNode()
	 * @generated
	 */
	EReference getDeploymentNode_Technology();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.DeploymentNode#getDeploymentNodes <em>Deployment Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployment Nodes</em>'.
	 * @see structurizr.DeploymentNode#getDeploymentNodes()
	 * @see #getDeploymentNode()
	 * @generated
	 */
	EReference getDeploymentNode_DeploymentNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.DeploymentNode#getInfrastructureNodes <em>Infrastructure Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Infrastructure Nodes</em>'.
	 * @see structurizr.DeploymentNode#getInfrastructureNodes()
	 * @see #getDeploymentNode()
	 * @generated
	 */
	EReference getDeploymentNode_InfrastructureNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.DeploymentNode#getSoftwareSystemInstances <em>Software System Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Software System Instances</em>'.
	 * @see structurizr.DeploymentNode#getSoftwareSystemInstances()
	 * @see #getDeploymentNode()
	 * @generated
	 */
	EReference getDeploymentNode_SoftwareSystemInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.DeploymentNode#getContainerInstances <em>Container Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Container Instances</em>'.
	 * @see structurizr.DeploymentNode#getContainerInstances()
	 * @see #getDeploymentNode()
	 * @generated
	 */
	EReference getDeploymentNode_ContainerInstances();

	/**
	 * Returns the meta object for class '{@link structurizr.InfrastructureNode <em>Infrastructure Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Infrastructure Node</em>'.
	 * @see structurizr.InfrastructureNode
	 * @generated
	 */
	EClass getInfrastructureNode();

	/**
	 * Returns the meta object for the containment reference '{@link structurizr.InfrastructureNode#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Technology</em>'.
	 * @see structurizr.InfrastructureNode#getTechnology()
	 * @see #getInfrastructureNode()
	 * @generated
	 */
	EReference getInfrastructureNode_Technology();

	/**
	 * Returns the meta object for class '{@link structurizr.SoftwareSystemInstance <em>Software System Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software System Instance</em>'.
	 * @see structurizr.SoftwareSystemInstance
	 * @generated
	 */
	EClass getSoftwareSystemInstance();

	/**
	 * Returns the meta object for the reference '{@link structurizr.SoftwareSystemInstance#getSoftwareSystem <em>Software System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Software System</em>'.
	 * @see structurizr.SoftwareSystemInstance#getSoftwareSystem()
	 * @see #getSoftwareSystemInstance()
	 * @generated
	 */
	EReference getSoftwareSystemInstance_SoftwareSystem();

	/**
	 * Returns the meta object for the reference list '{@link structurizr.SoftwareSystemInstance#getDeploymentGroups <em>Deployment Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deployment Groups</em>'.
	 * @see structurizr.SoftwareSystemInstance#getDeploymentGroups()
	 * @see #getSoftwareSystemInstance()
	 * @generated
	 */
	EReference getSoftwareSystemInstance_DeploymentGroups();

	/**
	 * Returns the meta object for the containment reference '{@link structurizr.SoftwareSystemInstance#getHealthCheck <em>Health Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Health Check</em>'.
	 * @see structurizr.SoftwareSystemInstance#getHealthCheck()
	 * @see #getSoftwareSystemInstance()
	 * @generated
	 */
	EReference getSoftwareSystemInstance_HealthCheck();

	/**
	 * Returns the meta object for class '{@link structurizr.ContainerInstance <em>Container Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Instance</em>'.
	 * @see structurizr.ContainerInstance
	 * @generated
	 */
	EClass getContainerInstance();

	/**
	 * Returns the meta object for the reference '{@link structurizr.ContainerInstance#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see structurizr.ContainerInstance#getContainer()
	 * @see #getContainerInstance()
	 * @generated
	 */
	EReference getContainerInstance_Container();

	/**
	 * Returns the meta object for the reference list '{@link structurizr.ContainerInstance#getDeploymentGroups <em>Deployment Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Deployment Groups</em>'.
	 * @see structurizr.ContainerInstance#getDeploymentGroups()
	 * @see #getContainerInstance()
	 * @generated
	 */
	EReference getContainerInstance_DeploymentGroups();

	/**
	 * Returns the meta object for the containment reference '{@link structurizr.ContainerInstance#getHealthCheck <em>Health Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Health Check</em>'.
	 * @see structurizr.ContainerInstance#getHealthCheck()
	 * @see #getContainerInstance()
	 * @generated
	 */
	EReference getContainerInstance_HealthCheck();

	/**
	 * Returns the meta object for class '{@link structurizr.HealthCheck <em>Health Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Health Check</em>'.
	 * @see structurizr.HealthCheck
	 * @generated
	 */
	EClass getHealthCheck();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.HealthCheck#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see structurizr.HealthCheck#getName()
	 * @see #getHealthCheck()
	 * @generated
	 */
	EAttribute getHealthCheck_Name();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.HealthCheck#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see structurizr.HealthCheck#getUrl()
	 * @see #getHealthCheck()
	 * @generated
	 */
	EAttribute getHealthCheck_Url();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.HealthCheck#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see structurizr.HealthCheck#getInterval()
	 * @see #getHealthCheck()
	 * @generated
	 */
	EAttribute getHealthCheck_Interval();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.HealthCheck#getTimeouts <em>Timeouts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeouts</em>'.
	 * @see structurizr.HealthCheck#getTimeouts()
	 * @see #getHealthCheck()
	 * @generated
	 */
	EAttribute getHealthCheck_Timeouts();

	/**
	 * Returns the meta object for class '{@link structurizr.Views <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Views</em>'.
	 * @see structurizr.Views
	 * @generated
	 */
	EClass getViews();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.Views#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see structurizr.Views#getName()
	 * @see #getViews()
	 * @generated
	 */
	EAttribute getViews_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.Views#getViewElements <em>View Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Elements</em>'.
	 * @see structurizr.Views#getViewElements()
	 * @see #getViews()
	 * @generated
	 */
	EReference getViews_ViewElements();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.Views#getStyles <em>Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Styles</em>'.
	 * @see structurizr.Views#getStyles()
	 * @see #getViews()
	 * @generated
	 */
	EReference getViews_Styles();

	/**
	 * Returns the meta object for class '{@link structurizr.ViewElement <em>View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Element</em>'.
	 * @see structurizr.ViewElement
	 * @generated
	 */
	EClass getViewElement();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.ViewElement#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see structurizr.ViewElement#getKey()
	 * @see #getViewElement()
	 * @generated
	 */
	EAttribute getViewElement_Key();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.ViewElement#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see structurizr.ViewElement#getTitle()
	 * @see #getViewElement()
	 * @generated
	 */
	EAttribute getViewElement_Title();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.ViewElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see structurizr.ViewElement#getDescription()
	 * @see #getViewElement()
	 * @generated
	 */
	EAttribute getViewElement_Description();

	/**
	 * Returns the meta object for the containment reference '{@link structurizr.ViewElement#getAutoLayout <em>Auto Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auto Layout</em>'.
	 * @see structurizr.ViewElement#getAutoLayout()
	 * @see #getViewElement()
	 * @generated
	 */
	EReference getViewElement_AutoLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.ViewElement#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see structurizr.ViewElement#getProperties()
	 * @see #getViewElement()
	 * @generated
	 */
	EReference getViewElement_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link structurizr.ViewElement#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Include</em>'.
	 * @see structurizr.ViewElement#getInclude()
	 * @see #getViewElement()
	 * @generated
	 */
	EReference getViewElement_Include();

	/**
	 * Returns the meta object for the containment reference '{@link structurizr.ViewElement#getExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exclude</em>'.
	 * @see structurizr.ViewElement#getExclude()
	 * @see #getViewElement()
	 * @generated
	 */
	EReference getViewElement_Exclude();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.ViewElement#getIncludeExpression <em>Include Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Expression</em>'.
	 * @see structurizr.ViewElement#getIncludeExpression()
	 * @see #getViewElement()
	 * @generated
	 */
	EAttribute getViewElement_IncludeExpression();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.ViewElement#getExcludeExpression <em>Exclude Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude Expression</em>'.
	 * @see structurizr.ViewElement#getExcludeExpression()
	 * @see #getViewElement()
	 * @generated
	 */
	EAttribute getViewElement_ExcludeExpression();

	/**
	 * Returns the meta object for class '{@link structurizr.SystemLandscapeView <em>System Landscape View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Landscape View</em>'.
	 * @see structurizr.SystemLandscapeView
	 * @generated
	 */
	EClass getSystemLandscapeView();

	/**
	 * Returns the meta object for class '{@link structurizr.SystemContextView <em>System Context View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Context View</em>'.
	 * @see structurizr.SystemContextView
	 * @generated
	 */
	EClass getSystemContextView();

	/**
	 * Returns the meta object for the reference '{@link structurizr.SystemContextView#getSoftwareSystem <em>Software System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Software System</em>'.
	 * @see structurizr.SystemContextView#getSoftwareSystem()
	 * @see #getSystemContextView()
	 * @generated
	 */
	EReference getSystemContextView_SoftwareSystem();

	/**
	 * Returns the meta object for class '{@link structurizr.ContainerView <em>Container View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container View</em>'.
	 * @see structurizr.ContainerView
	 * @generated
	 */
	EClass getContainerView();

	/**
	 * Returns the meta object for the reference '{@link structurizr.ContainerView#getSoftwareSystem <em>Software System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Software System</em>'.
	 * @see structurizr.ContainerView#getSoftwareSystem()
	 * @see #getContainerView()
	 * @generated
	 */
	EReference getContainerView_SoftwareSystem();

	/**
	 * Returns the meta object for class '{@link structurizr.ComponentView <em>Component View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component View</em>'.
	 * @see structurizr.ComponentView
	 * @generated
	 */
	EClass getComponentView();

	/**
	 * Returns the meta object for the reference '{@link structurizr.ComponentView#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Container</em>'.
	 * @see structurizr.ComponentView#getContainer()
	 * @see #getComponentView()
	 * @generated
	 */
	EReference getComponentView_Container();

	/**
	 * Returns the meta object for class '{@link structurizr.AutoLayout <em>Auto Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto Layout</em>'.
	 * @see structurizr.AutoLayout
	 * @generated
	 */
	EClass getAutoLayout();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.AutoLayout#getAutoLayoutOption <em>Auto Layout Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Layout Option</em>'.
	 * @see structurizr.AutoLayout#getAutoLayoutOption()
	 * @see #getAutoLayout()
	 * @generated
	 */
	EAttribute getAutoLayout_AutoLayoutOption();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.AutoLayout#getRankSeparation <em>Rank Separation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank Separation</em>'.
	 * @see structurizr.AutoLayout#getRankSeparation()
	 * @see #getAutoLayout()
	 * @generated
	 */
	EAttribute getAutoLayout_RankSeparation();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.AutoLayout#getNodeSeparation <em>Node Separation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Separation</em>'.
	 * @see structurizr.AutoLayout#getNodeSeparation()
	 * @see #getAutoLayout()
	 * @generated
	 */
	EAttribute getAutoLayout_NodeSeparation();

	/**
	 * Returns the meta object for class '{@link structurizr.Style <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style</em>'.
	 * @see structurizr.Style
	 * @generated
	 */
	EClass getStyle();

	/**
	 * Returns the meta object for class '{@link structurizr.ElementStyle <em>Element Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Style</em>'.
	 * @see structurizr.ElementStyle
	 * @generated
	 */
	EClass getElementStyle();

	/**
	 * Returns the meta object for the reference '{@link structurizr.ElementStyle#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tag</em>'.
	 * @see structurizr.ElementStyle#getTag()
	 * @see #getElementStyle()
	 * @generated
	 */
	EReference getElementStyle_Tag();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.ElementStyle#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see structurizr.ElementStyle#getIcon()
	 * @see #getElementStyle()
	 * @generated
	 */
	EAttribute getElementStyle_Icon();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.ElementStyle#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see structurizr.ElementStyle#getWidth()
	 * @see #getElementStyle()
	 * @generated
	 */
	EAttribute getElementStyle_Width();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.ElementStyle#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see structurizr.ElementStyle#getHeight()
	 * @see #getElementStyle()
	 * @generated
	 */
	EAttribute getElementStyle_Height();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.ElementStyle#getStrokeWidth <em>Stroke Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke Width</em>'.
	 * @see structurizr.ElementStyle#getStrokeWidth()
	 * @see #getElementStyle()
	 * @generated
	 */
	EAttribute getElementStyle_StrokeWidth();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.ElementStyle#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see structurizr.ElementStyle#getFontSize()
	 * @see #getElementStyle()
	 * @generated
	 */
	EAttribute getElementStyle_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.ElementStyle#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see structurizr.ElementStyle#getOpacity()
	 * @see #getElementStyle()
	 * @generated
	 */
	EAttribute getElementStyle_Opacity();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.ElementStyle#isMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metadata</em>'.
	 * @see structurizr.ElementStyle#isMetadata()
	 * @see #getElementStyle()
	 * @generated
	 */
	EAttribute getElementStyle_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.ElementStyle#isDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see structurizr.ElementStyle#isDescription()
	 * @see #getElementStyle()
	 * @generated
	 */
	EAttribute getElementStyle_Description();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.ElementStyle#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see structurizr.ElementStyle#getBackground()
	 * @see #getElementStyle()
	 * @generated
	 */
	EAttribute getElementStyle_Background();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.ElementStyle#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see structurizr.ElementStyle#getColor()
	 * @see #getElementStyle()
	 * @generated
	 */
	EAttribute getElementStyle_Color();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.ElementStyle#getStroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stroke</em>'.
	 * @see structurizr.ElementStyle#getStroke()
	 * @see #getElementStyle()
	 * @generated
	 */
	EAttribute getElementStyle_Stroke();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.ElementStyle#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border</em>'.
	 * @see structurizr.ElementStyle#getBorder()
	 * @see #getElementStyle()
	 * @generated
	 */
	EAttribute getElementStyle_Border();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.ElementStyle#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see structurizr.ElementStyle#getShape()
	 * @see #getElementStyle()
	 * @generated
	 */
	EAttribute getElementStyle_Shape();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.ElementStyle#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see structurizr.ElementStyle#getProperties()
	 * @see #getElementStyle()
	 * @generated
	 */
	EReference getElementStyle_Properties();

	/**
	 * Returns the meta object for class '{@link structurizr.RelationshipStyle <em>Relationship Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Style</em>'.
	 * @see structurizr.RelationshipStyle
	 * @generated
	 */
	EClass getRelationshipStyle();

	/**
	 * Returns the meta object for the reference '{@link structurizr.RelationshipStyle#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tag</em>'.
	 * @see structurizr.RelationshipStyle#getTag()
	 * @see #getRelationshipStyle()
	 * @generated
	 */
	EReference getRelationshipStyle_Tag();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.RelationshipStyle#getThickness <em>Thickness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thickness</em>'.
	 * @see structurizr.RelationshipStyle#getThickness()
	 * @see #getRelationshipStyle()
	 * @generated
	 */
	EAttribute getRelationshipStyle_Thickness();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.RelationshipStyle#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see structurizr.RelationshipStyle#getFontSize()
	 * @see #getRelationshipStyle()
	 * @generated
	 */
	EAttribute getRelationshipStyle_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.RelationshipStyle#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see structurizr.RelationshipStyle#getWidth()
	 * @see #getRelationshipStyle()
	 * @generated
	 */
	EAttribute getRelationshipStyle_Width();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.RelationshipStyle#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see structurizr.RelationshipStyle#getOpacity()
	 * @see #getRelationshipStyle()
	 * @generated
	 */
	EAttribute getRelationshipStyle_Opacity();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.RelationshipStyle#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see structurizr.RelationshipStyle#getPosition()
	 * @see #getRelationshipStyle()
	 * @generated
	 */
	EAttribute getRelationshipStyle_Position();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.RelationshipStyle#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see structurizr.RelationshipStyle#getColor()
	 * @see #getRelationshipStyle()
	 * @generated
	 */
	EAttribute getRelationshipStyle_Color();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.RelationshipStyle#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see structurizr.RelationshipStyle#getStyle()
	 * @see #getRelationshipStyle()
	 * @generated
	 */
	EAttribute getRelationshipStyle_Style();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.RelationshipStyle#getRouting <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Routing</em>'.
	 * @see structurizr.RelationshipStyle#getRouting()
	 * @see #getRelationshipStyle()
	 * @generated
	 */
	EAttribute getRelationshipStyle_Routing();

	/**
	 * Returns the meta object for the containment reference list '{@link structurizr.RelationshipStyle#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see structurizr.RelationshipStyle#getProperties()
	 * @see #getRelationshipStyle()
	 * @generated
	 */
	EReference getRelationshipStyle_Properties();

	/**
	 * Returns the meta object for class '{@link structurizr.ConditionElement <em>Condition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Element</em>'.
	 * @see structurizr.ConditionElement
	 * @generated
	 */
	EClass getConditionElement();

	/**
	 * Returns the meta object for class '{@link structurizr.NoFilterCondition <em>No Filter Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Filter Condition</em>'.
	 * @see structurizr.NoFilterCondition
	 * @generated
	 */
	EClass getNoFilterCondition();

	/**
	 * Returns the meta object for class '{@link structurizr.FilterCondition <em>Filter Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Condition</em>'.
	 * @see structurizr.FilterCondition
	 * @generated
	 */
	EClass getFilterCondition();

	/**
	 * Returns the meta object for class '{@link structurizr.ElementFilterCondition <em>Element Filter Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Filter Condition</em>'.
	 * @see structurizr.ElementFilterCondition
	 * @generated
	 */
	EClass getElementFilterCondition();

	/**
	 * Returns the meta object for class '{@link structurizr.RelationshipFilterCondition <em>Relationship Filter Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Filter Condition</em>'.
	 * @see structurizr.RelationshipFilterCondition
	 * @generated
	 */
	EClass getRelationshipFilterCondition();

	/**
	 * Returns the meta object for class '{@link structurizr.CompositeCondition <em>Composite Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Condition</em>'.
	 * @see structurizr.CompositeCondition
	 * @generated
	 */
	EClass getCompositeCondition();

	/**
	 * Returns the meta object for the containment reference '{@link structurizr.CompositeCondition#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see structurizr.CompositeCondition#getLeft()
	 * @see #getCompositeCondition()
	 * @generated
	 */
	EReference getCompositeCondition_Left();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.CompositeCondition#getLogicalOperation <em>Logical Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Logical Operation</em>'.
	 * @see structurizr.CompositeCondition#getLogicalOperation()
	 * @see #getCompositeCondition()
	 * @generated
	 */
	EAttribute getCompositeCondition_LogicalOperation();

	/**
	 * Returns the meta object for the containment reference '{@link structurizr.CompositeCondition#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see structurizr.CompositeCondition#getRight()
	 * @see #getCompositeCondition()
	 * @generated
	 */
	EReference getCompositeCondition_Right();

	/**
	 * Returns the meta object for class '{@link structurizr.ElementTagCondition <em>Element Tag Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Tag Condition</em>'.
	 * @see structurizr.ElementTagCondition
	 * @generated
	 */
	EClass getElementTagCondition();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.ElementTagCondition#getComparisonOperation <em>Comparison Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Operation</em>'.
	 * @see structurizr.ElementTagCondition#getComparisonOperation()
	 * @see #getElementTagCondition()
	 * @generated
	 */
	EAttribute getElementTagCondition_ComparisonOperation();

	/**
	 * Returns the meta object for the reference list '{@link structurizr.ElementTagCondition#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see structurizr.ElementTagCondition#getTags()
	 * @see #getElementTagCondition()
	 * @generated
	 */
	EReference getElementTagCondition_Tags();

	/**
	 * Returns the meta object for class '{@link structurizr.ElementTechnologyCondition <em>Element Technology Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Technology Condition</em>'.
	 * @see structurizr.ElementTechnologyCondition
	 * @generated
	 */
	EClass getElementTechnologyCondition();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.ElementTechnologyCondition#getComparisonOperation <em>Comparison Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Operation</em>'.
	 * @see structurizr.ElementTechnologyCondition#getComparisonOperation()
	 * @see #getElementTechnologyCondition()
	 * @generated
	 */
	EAttribute getElementTechnologyCondition_ComparisonOperation();

	/**
	 * Returns the meta object for the reference '{@link structurizr.ElementTechnologyCondition#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Technology</em>'.
	 * @see structurizr.ElementTechnologyCondition#getTechnology()
	 * @see #getElementTechnologyCondition()
	 * @generated
	 */
	EReference getElementTechnologyCondition_Technology();

	/**
	 * Returns the meta object for class '{@link structurizr.ElementTypeCondition <em>Element Type Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Type Condition</em>'.
	 * @see structurizr.ElementTypeCondition
	 * @generated
	 */
	EClass getElementTypeCondition();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.ElementTypeCondition#getComparisonOperation <em>Comparison Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Operation</em>'.
	 * @see structurizr.ElementTypeCondition#getComparisonOperation()
	 * @see #getElementTypeCondition()
	 * @generated
	 */
	EAttribute getElementTypeCondition_ComparisonOperation();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.ElementTypeCondition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see structurizr.ElementTypeCondition#getType()
	 * @see #getElementTypeCondition()
	 * @generated
	 */
	EAttribute getElementTypeCondition_Type();

	/**
	 * Returns the meta object for class '{@link structurizr.ElementPropertyCondition <em>Element Property Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Property Condition</em>'.
	 * @see structurizr.ElementPropertyCondition
	 * @generated
	 */
	EClass getElementPropertyCondition();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.ElementPropertyCondition#getComparisonOperation <em>Comparison Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Operation</em>'.
	 * @see structurizr.ElementPropertyCondition#getComparisonOperation()
	 * @see #getElementPropertyCondition()
	 * @generated
	 */
	EAttribute getElementPropertyCondition_ComparisonOperation();

	/**
	 * Returns the meta object for the reference '{@link structurizr.ElementPropertyCondition#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see structurizr.ElementPropertyCondition#getProperty()
	 * @see #getElementPropertyCondition()
	 * @generated
	 */
	EReference getElementPropertyCondition_Property();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.ElementPropertyCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see structurizr.ElementPropertyCondition#getValue()
	 * @see #getElementPropertyCondition()
	 * @generated
	 */
	EAttribute getElementPropertyCondition_Value();

	/**
	 * Returns the meta object for class '{@link structurizr.ElementParentCondition <em>Element Parent Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Parent Condition</em>'.
	 * @see structurizr.ElementParentCondition
	 * @generated
	 */
	EClass getElementParentCondition();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.ElementParentCondition#getComparisonOperation <em>Comparison Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Operation</em>'.
	 * @see structurizr.ElementParentCondition#getComparisonOperation()
	 * @see #getElementParentCondition()
	 * @generated
	 */
	EAttribute getElementParentCondition_ComparisonOperation();

	/**
	 * Returns the meta object for the reference '{@link structurizr.ElementParentCondition#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see structurizr.ElementParentCondition#getParent()
	 * @see #getElementParentCondition()
	 * @generated
	 */
	EReference getElementParentCondition_Parent();

	/**
	 * Returns the meta object for class '{@link structurizr.RelationshipTagCondition <em>Relationship Tag Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Tag Condition</em>'.
	 * @see structurizr.RelationshipTagCondition
	 * @generated
	 */
	EClass getRelationshipTagCondition();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.RelationshipTagCondition#getComparisonOperation <em>Comparison Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Operation</em>'.
	 * @see structurizr.RelationshipTagCondition#getComparisonOperation()
	 * @see #getRelationshipTagCondition()
	 * @generated
	 */
	EAttribute getRelationshipTagCondition_ComparisonOperation();

	/**
	 * Returns the meta object for the reference list '{@link structurizr.RelationshipTagCondition#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tags</em>'.
	 * @see structurizr.RelationshipTagCondition#getTags()
	 * @see #getRelationshipTagCondition()
	 * @generated
	 */
	EReference getRelationshipTagCondition_Tags();

	/**
	 * Returns the meta object for class '{@link structurizr.RelationshipPropertyCondition <em>Relationship Property Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Property Condition</em>'.
	 * @see structurizr.RelationshipPropertyCondition
	 * @generated
	 */
	EClass getRelationshipPropertyCondition();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.RelationshipPropertyCondition#getComparisonOperation <em>Comparison Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Operation</em>'.
	 * @see structurizr.RelationshipPropertyCondition#getComparisonOperation()
	 * @see #getRelationshipPropertyCondition()
	 * @generated
	 */
	EAttribute getRelationshipPropertyCondition_ComparisonOperation();

	/**
	 * Returns the meta object for the reference '{@link structurizr.RelationshipPropertyCondition#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Property</em>'.
	 * @see structurizr.RelationshipPropertyCondition#getProperty()
	 * @see #getRelationshipPropertyCondition()
	 * @generated
	 */
	EReference getRelationshipPropertyCondition_Property();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.RelationshipPropertyCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see structurizr.RelationshipPropertyCondition#getValue()
	 * @see #getRelationshipPropertyCondition()
	 * @generated
	 */
	EAttribute getRelationshipPropertyCondition_Value();

	/**
	 * Returns the meta object for class '{@link structurizr.RelationshipSourceCondition <em>Relationship Source Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Source Condition</em>'.
	 * @see structurizr.RelationshipSourceCondition
	 * @generated
	 */
	EClass getRelationshipSourceCondition();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.RelationshipSourceCondition#getComparisonOperation <em>Comparison Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Operation</em>'.
	 * @see structurizr.RelationshipSourceCondition#getComparisonOperation()
	 * @see #getRelationshipSourceCondition()
	 * @generated
	 */
	EAttribute getRelationshipSourceCondition_ComparisonOperation();

	/**
	 * Returns the meta object for the reference '{@link structurizr.RelationshipSourceCondition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see structurizr.RelationshipSourceCondition#getSource()
	 * @see #getRelationshipSourceCondition()
	 * @generated
	 */
	EReference getRelationshipSourceCondition_Source();

	/**
	 * Returns the meta object for class '{@link structurizr.RelationshipDestinationCondition <em>Relationship Destination Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Destination Condition</em>'.
	 * @see structurizr.RelationshipDestinationCondition
	 * @generated
	 */
	EClass getRelationshipDestinationCondition();

	/**
	 * Returns the meta object for the attribute '{@link structurizr.RelationshipDestinationCondition#getComparisonOperation <em>Comparison Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Operation</em>'.
	 * @see structurizr.RelationshipDestinationCondition#getComparisonOperation()
	 * @see #getRelationshipDestinationCondition()
	 * @generated
	 */
	EAttribute getRelationshipDestinationCondition_ComparisonOperation();

	/**
	 * Returns the meta object for the reference '{@link structurizr.RelationshipDestinationCondition#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see structurizr.RelationshipDestinationCondition#getDestination()
	 * @see #getRelationshipDestinationCondition()
	 * @generated
	 */
	EReference getRelationshipDestinationCondition_Destination();

	/**
	 * Returns the meta object for enum '{@link structurizr.AutoLayoutOption <em>Auto Layout Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Auto Layout Option</em>'.
	 * @see structurizr.AutoLayoutOption
	 * @generated
	 */
	EEnum getAutoLayoutOption();

	/**
	 * Returns the meta object for enum '{@link structurizr.Routing <em>Routing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Routing</em>'.
	 * @see structurizr.Routing
	 * @generated
	 */
	EEnum getRouting();

	/**
	 * Returns the meta object for enum '{@link structurizr.Border <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Border</em>'.
	 * @see structurizr.Border
	 * @generated
	 */
	EEnum getBorder();

	/**
	 * Returns the meta object for enum '{@link structurizr.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scope</em>'.
	 * @see structurizr.Scope
	 * @generated
	 */
	EEnum getScope();

	/**
	 * Returns the meta object for enum '{@link structurizr.Visibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility</em>'.
	 * @see structurizr.Visibility
	 * @generated
	 */
	EEnum getVisibility();

	/**
	 * Returns the meta object for enum '{@link structurizr.UserPermission <em>User Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>User Permission</em>'.
	 * @see structurizr.UserPermission
	 * @generated
	 */
	EEnum getUserPermission();

	/**
	 * Returns the meta object for enum '{@link structurizr.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shape</em>'.
	 * @see structurizr.Shape
	 * @generated
	 */
	EEnum getShape();

	/**
	 * Returns the meta object for enum '{@link structurizr.ConditionComparisonOperation <em>Condition Comparison Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Comparison Operation</em>'.
	 * @see structurizr.ConditionComparisonOperation
	 * @generated
	 */
	EEnum getConditionComparisonOperation();

	/**
	 * Returns the meta object for enum '{@link structurizr.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Filter Type</em>'.
	 * @see structurizr.FilterType
	 * @generated
	 */
	EEnum getFilterType();

	/**
	 * Returns the meta object for enum '{@link structurizr.ConditionLogicalOperation <em>Condition Logical Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Logical Operation</em>'.
	 * @see structurizr.ConditionLogicalOperation
	 * @generated
	 */
	EEnum getConditionLogicalOperation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StructurizrFactory getStructurizrFactory();

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
		 * The meta object literal for the '{@link structurizr.impl.WorkspaceImpl <em>Workspace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.WorkspaceImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getWorkspace()
		 * @generated
		 */
		EClass WORKSPACE = eINSTANCE.getWorkspace();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSPACE__NAME = eINSTANCE.getWorkspace_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSPACE__DESCRIPTION = eINSTANCE.getWorkspace_Description();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSPACE__MODEL = eINSTANCE.getWorkspace_Model();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSPACE__VIEWS = eINSTANCE.getWorkspace_Views();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSPACE__PROPERTIES = eINSTANCE.getWorkspace_Properties();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSPACE__CONFIGURATION = eINSTANCE.getWorkspace_Configuration();

		/**
		 * The meta object literal for the '{@link structurizr.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.ConfigurationImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__SCOPE = eINSTANCE.getConfiguration_Scope();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIGURATION__VISIBILITY = eINSTANCE.getConfiguration_Visibility();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__USERS = eINSTANCE.getConfiguration_Users();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__PROPERTIES = eINSTANCE.getConfiguration_Properties();

		/**
		 * The meta object literal for the '{@link structurizr.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.PropertyImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link structurizr.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.UserImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USERNAME = eINSTANCE.getUser_Username();

		/**
		 * The meta object literal for the '<em><b>Permission</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PERMISSION = eINSTANCE.getUser_Permission();

		/**
		 * The meta object literal for the '{@link structurizr.impl.IdentifiableElementImpl <em>Identifiable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.IdentifiableElementImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getIdentifiableElement()
		 * @generated
		 */
		EClass IDENTIFIABLE_ELEMENT = eINSTANCE.getIdentifiableElement();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE_ELEMENT__IDENTIFIER = eINSTANCE.getIdentifiableElement_Identifier();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIABLE_ELEMENT__NAME = eINSTANCE.getIdentifiableElement_Name();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIABLE_ELEMENT__RELATIONSHIPS = eINSTANCE.getIdentifiableElement_Relationships();

		/**
		 * The meta object literal for the '{@link structurizr.impl.C4ElementImpl <em>C4 Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.C4ElementImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getC4Element()
		 * @generated
		 */
		EClass C4_ELEMENT = eINSTANCE.getC4Element();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute C4_ELEMENT__DESCRIPTION = eINSTANCE.getC4Element_Description();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute C4_ELEMENT__URL = eINSTANCE.getC4Element_Url();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference C4_ELEMENT__TAGS = eINSTANCE.getC4Element_Tags();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference C4_ELEMENT__PROPERTIES = eINSTANCE.getC4Element_Properties();

		/**
		 * The meta object literal for the '<em><b>Perspectives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference C4_ELEMENT__PERSPECTIVES = eINSTANCE.getC4Element_Perspectives();

		/**
		 * The meta object literal for the '{@link structurizr.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.RelationshipImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__SOURCE = eINSTANCE.getRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__DESCRIPTION = eINSTANCE.getRelationship_Description();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__URL = eINSTANCE.getRelationship_Url();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TECHNOLOGY = eINSTANCE.getRelationship_Technology();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TAGS = eINSTANCE.getRelationship_Tags();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__PROPERTIES = eINSTANCE.getRelationship_Properties();

		/**
		 * The meta object literal for the '<em><b>Perspectives</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__PERSPECTIVES = eINSTANCE.getRelationship_Perspectives();

		/**
		 * The meta object literal for the '{@link structurizr.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.TagImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__NAME = eINSTANCE.getTag_Name();

		/**
		 * The meta object literal for the '{@link structurizr.impl.TechnologyImpl <em>Technology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.TechnologyImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getTechnology()
		 * @generated
		 */
		EClass TECHNOLOGY = eINSTANCE.getTechnology();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY__NAME = eINSTANCE.getTechnology_Name();

		/**
		 * The meta object literal for the '{@link structurizr.impl.PerspectiveImpl <em>Perspective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.PerspectiveImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getPerspective()
		 * @generated
		 */
		EClass PERSPECTIVE = eINSTANCE.getPerspective();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSPECTIVE__NAME = eINSTANCE.getPerspective_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSPECTIVE__DESCRIPTION = eINSTANCE.getPerspective_Description();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSPECTIVE__VALUE = eINSTANCE.getPerspective_Value();

		/**
		 * The meta object literal for the '{@link structurizr.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.ModelImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Software System</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__SOFTWARE_SYSTEM = eINSTANCE.getModel_SoftwareSystem();

		/**
		 * The meta object literal for the '<em><b>Persons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__PERSONS = eINSTANCE.getModel_Persons();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

		/**
		 * The meta object literal for the '<em><b>Deployment Environments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__DEPLOYMENT_ENVIRONMENTS = eINSTANCE.getModel_DeploymentEnvironments();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__RELATIONSHIPS = eINSTANCE.getModel_Relationships();

		/**
		 * The meta object literal for the '{@link structurizr.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.ElementImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__METADATA = eINSTANCE.getElement_Metadata();

		/**
		 * The meta object literal for the '{@link structurizr.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.PersonImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '{@link structurizr.impl.SoftwareSystemImpl <em>Software System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.SoftwareSystemImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getSoftwareSystem()
		 * @generated
		 */
		EClass SOFTWARE_SYSTEM = eINSTANCE.getSoftwareSystem();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_SYSTEM__CONTAINERS = eINSTANCE.getSoftwareSystem_Containers();

		/**
		 * The meta object literal for the '{@link structurizr.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.ContainerImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__TECHNOLOGY = eINSTANCE.getContainer_Technology();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__COMPONENTS = eINSTANCE.getContainer_Components();

		/**
		 * The meta object literal for the '{@link structurizr.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.ComponentImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__TECHNOLOGY = eINSTANCE.getComponent_Technology();

		/**
		 * The meta object literal for the '{@link structurizr.impl.DeploymentEnvironmentImpl <em>Deployment Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.DeploymentEnvironmentImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getDeploymentEnvironment()
		 * @generated
		 */
		EClass DEPLOYMENT_ENVIRONMENT = eINSTANCE.getDeploymentEnvironment();

		/**
		 * The meta object literal for the '<em><b>Deployment Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_ENVIRONMENT__DEPLOYMENT_GROUPS = eINSTANCE.getDeploymentEnvironment_DeploymentGroups();

		/**
		 * The meta object literal for the '<em><b>Deployment Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_ENVIRONMENT__DEPLOYMENT_NODES = eINSTANCE.getDeploymentEnvironment_DeploymentNodes();

		/**
		 * The meta object literal for the '{@link structurizr.impl.DeploymentGroupImpl <em>Deployment Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.DeploymentGroupImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getDeploymentGroup()
		 * @generated
		 */
		EClass DEPLOYMENT_GROUP = eINSTANCE.getDeploymentGroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT_GROUP__NAME = eINSTANCE.getDeploymentGroup_Name();

		/**
		 * The meta object literal for the '{@link structurizr.impl.DeploymentNodeImpl <em>Deployment Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.DeploymentNodeImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getDeploymentNode()
		 * @generated
		 */
		EClass DEPLOYMENT_NODE = eINSTANCE.getDeploymentNode();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_NODE__TECHNOLOGY = eINSTANCE.getDeploymentNode_Technology();

		/**
		 * The meta object literal for the '<em><b>Deployment Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_NODE__DEPLOYMENT_NODES = eINSTANCE.getDeploymentNode_DeploymentNodes();

		/**
		 * The meta object literal for the '<em><b>Infrastructure Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_NODE__INFRASTRUCTURE_NODES = eINSTANCE.getDeploymentNode_InfrastructureNodes();

		/**
		 * The meta object literal for the '<em><b>Software System Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_NODE__SOFTWARE_SYSTEM_INSTANCES = eINSTANCE.getDeploymentNode_SoftwareSystemInstances();

		/**
		 * The meta object literal for the '<em><b>Container Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT_NODE__CONTAINER_INSTANCES = eINSTANCE.getDeploymentNode_ContainerInstances();

		/**
		 * The meta object literal for the '{@link structurizr.impl.InfrastructureNodeImpl <em>Infrastructure Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.InfrastructureNodeImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getInfrastructureNode()
		 * @generated
		 */
		EClass INFRASTRUCTURE_NODE = eINSTANCE.getInfrastructureNode();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFRASTRUCTURE_NODE__TECHNOLOGY = eINSTANCE.getInfrastructureNode_Technology();

		/**
		 * The meta object literal for the '{@link structurizr.impl.SoftwareSystemInstanceImpl <em>Software System Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.SoftwareSystemInstanceImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getSoftwareSystemInstance()
		 * @generated
		 */
		EClass SOFTWARE_SYSTEM_INSTANCE = eINSTANCE.getSoftwareSystemInstance();

		/**
		 * The meta object literal for the '<em><b>Software System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_SYSTEM_INSTANCE__SOFTWARE_SYSTEM = eINSTANCE.getSoftwareSystemInstance_SoftwareSystem();

		/**
		 * The meta object literal for the '<em><b>Deployment Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_SYSTEM_INSTANCE__DEPLOYMENT_GROUPS = eINSTANCE.getSoftwareSystemInstance_DeploymentGroups();

		/**
		 * The meta object literal for the '<em><b>Health Check</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE_SYSTEM_INSTANCE__HEALTH_CHECK = eINSTANCE.getSoftwareSystemInstance_HealthCheck();

		/**
		 * The meta object literal for the '{@link structurizr.impl.ContainerInstanceImpl <em>Container Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.ContainerInstanceImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getContainerInstance()
		 * @generated
		 */
		EClass CONTAINER_INSTANCE = eINSTANCE.getContainerInstance();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_INSTANCE__CONTAINER = eINSTANCE.getContainerInstance_Container();

		/**
		 * The meta object literal for the '<em><b>Deployment Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_INSTANCE__DEPLOYMENT_GROUPS = eINSTANCE.getContainerInstance_DeploymentGroups();

		/**
		 * The meta object literal for the '<em><b>Health Check</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_INSTANCE__HEALTH_CHECK = eINSTANCE.getContainerInstance_HealthCheck();

		/**
		 * The meta object literal for the '{@link structurizr.impl.HealthCheckImpl <em>Health Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.HealthCheckImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getHealthCheck()
		 * @generated
		 */
		EClass HEALTH_CHECK = eINSTANCE.getHealthCheck();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_CHECK__NAME = eINSTANCE.getHealthCheck_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_CHECK__URL = eINSTANCE.getHealthCheck_Url();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_CHECK__INTERVAL = eINSTANCE.getHealthCheck_Interval();

		/**
		 * The meta object literal for the '<em><b>Timeouts</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_CHECK__TIMEOUTS = eINSTANCE.getHealthCheck_Timeouts();

		/**
		 * The meta object literal for the '{@link structurizr.impl.ViewsImpl <em>Views</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.ViewsImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getViews()
		 * @generated
		 */
		EClass VIEWS = eINSTANCE.getViews();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEWS__NAME = eINSTANCE.getViews_Name();

		/**
		 * The meta object literal for the '<em><b>View Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWS__VIEW_ELEMENTS = eINSTANCE.getViews_ViewElements();

		/**
		 * The meta object literal for the '<em><b>Styles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEWS__STYLES = eINSTANCE.getViews_Styles();

		/**
		 * The meta object literal for the '{@link structurizr.impl.ViewElementImpl <em>View Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.ViewElementImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getViewElement()
		 * @generated
		 */
		EClass VIEW_ELEMENT = eINSTANCE.getViewElement();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_ELEMENT__KEY = eINSTANCE.getViewElement_Key();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_ELEMENT__TITLE = eINSTANCE.getViewElement_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_ELEMENT__DESCRIPTION = eINSTANCE.getViewElement_Description();

		/**
		 * The meta object literal for the '<em><b>Auto Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_ELEMENT__AUTO_LAYOUT = eINSTANCE.getViewElement_AutoLayout();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_ELEMENT__PROPERTIES = eINSTANCE.getViewElement_Properties();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_ELEMENT__INCLUDE = eINSTANCE.getViewElement_Include();

		/**
		 * The meta object literal for the '<em><b>Exclude</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_ELEMENT__EXCLUDE = eINSTANCE.getViewElement_Exclude();

		/**
		 * The meta object literal for the '<em><b>Include Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_ELEMENT__INCLUDE_EXPRESSION = eINSTANCE.getViewElement_IncludeExpression();

		/**
		 * The meta object literal for the '<em><b>Exclude Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_ELEMENT__EXCLUDE_EXPRESSION = eINSTANCE.getViewElement_ExcludeExpression();

		/**
		 * The meta object literal for the '{@link structurizr.impl.SystemLandscapeViewImpl <em>System Landscape View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.SystemLandscapeViewImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getSystemLandscapeView()
		 * @generated
		 */
		EClass SYSTEM_LANDSCAPE_VIEW = eINSTANCE.getSystemLandscapeView();

		/**
		 * The meta object literal for the '{@link structurizr.impl.SystemContextViewImpl <em>System Context View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.SystemContextViewImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getSystemContextView()
		 * @generated
		 */
		EClass SYSTEM_CONTEXT_VIEW = eINSTANCE.getSystemContextView();

		/**
		 * The meta object literal for the '<em><b>Software System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_CONTEXT_VIEW__SOFTWARE_SYSTEM = eINSTANCE.getSystemContextView_SoftwareSystem();

		/**
		 * The meta object literal for the '{@link structurizr.impl.ContainerViewImpl <em>Container View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.ContainerViewImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getContainerView()
		 * @generated
		 */
		EClass CONTAINER_VIEW = eINSTANCE.getContainerView();

		/**
		 * The meta object literal for the '<em><b>Software System</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_VIEW__SOFTWARE_SYSTEM = eINSTANCE.getContainerView_SoftwareSystem();

		/**
		 * The meta object literal for the '{@link structurizr.impl.ComponentViewImpl <em>Component View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.ComponentViewImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getComponentView()
		 * @generated
		 */
		EClass COMPONENT_VIEW = eINSTANCE.getComponentView();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_VIEW__CONTAINER = eINSTANCE.getComponentView_Container();

		/**
		 * The meta object literal for the '{@link structurizr.impl.AutoLayoutImpl <em>Auto Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.AutoLayoutImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getAutoLayout()
		 * @generated
		 */
		EClass AUTO_LAYOUT = eINSTANCE.getAutoLayout();

		/**
		 * The meta object literal for the '<em><b>Auto Layout Option</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_LAYOUT__AUTO_LAYOUT_OPTION = eINSTANCE.getAutoLayout_AutoLayoutOption();

		/**
		 * The meta object literal for the '<em><b>Rank Separation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_LAYOUT__RANK_SEPARATION = eINSTANCE.getAutoLayout_RankSeparation();

		/**
		 * The meta object literal for the '<em><b>Node Separation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTO_LAYOUT__NODE_SEPARATION = eINSTANCE.getAutoLayout_NodeSeparation();

		/**
		 * The meta object literal for the '{@link structurizr.impl.StyleImpl <em>Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.StyleImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getStyle()
		 * @generated
		 */
		EClass STYLE = eINSTANCE.getStyle();

		/**
		 * The meta object literal for the '{@link structurizr.impl.ElementStyleImpl <em>Element Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.ElementStyleImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getElementStyle()
		 * @generated
		 */
		EClass ELEMENT_STYLE = eINSTANCE.getElementStyle();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_STYLE__TAG = eINSTANCE.getElementStyle_Tag();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_STYLE__ICON = eINSTANCE.getElementStyle_Icon();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_STYLE__WIDTH = eINSTANCE.getElementStyle_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_STYLE__HEIGHT = eINSTANCE.getElementStyle_Height();

		/**
		 * The meta object literal for the '<em><b>Stroke Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_STYLE__STROKE_WIDTH = eINSTANCE.getElementStyle_StrokeWidth();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_STYLE__FONT_SIZE = eINSTANCE.getElementStyle_FontSize();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_STYLE__OPACITY = eINSTANCE.getElementStyle_Opacity();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_STYLE__METADATA = eINSTANCE.getElementStyle_Metadata();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_STYLE__DESCRIPTION = eINSTANCE.getElementStyle_Description();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_STYLE__BACKGROUND = eINSTANCE.getElementStyle_Background();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_STYLE__COLOR = eINSTANCE.getElementStyle_Color();

		/**
		 * The meta object literal for the '<em><b>Stroke</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_STYLE__STROKE = eINSTANCE.getElementStyle_Stroke();

		/**
		 * The meta object literal for the '<em><b>Border</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_STYLE__BORDER = eINSTANCE.getElementStyle_Border();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_STYLE__SHAPE = eINSTANCE.getElementStyle_Shape();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_STYLE__PROPERTIES = eINSTANCE.getElementStyle_Properties();

		/**
		 * The meta object literal for the '{@link structurizr.impl.RelationshipStyleImpl <em>Relationship Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.RelationshipStyleImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getRelationshipStyle()
		 * @generated
		 */
		EClass RELATIONSHIP_STYLE = eINSTANCE.getRelationshipStyle();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_STYLE__TAG = eINSTANCE.getRelationshipStyle_Tag();

		/**
		 * The meta object literal for the '<em><b>Thickness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_STYLE__THICKNESS = eINSTANCE.getRelationshipStyle_Thickness();

		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_STYLE__FONT_SIZE = eINSTANCE.getRelationshipStyle_FontSize();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_STYLE__WIDTH = eINSTANCE.getRelationshipStyle_Width();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_STYLE__OPACITY = eINSTANCE.getRelationshipStyle_Opacity();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_STYLE__POSITION = eINSTANCE.getRelationshipStyle_Position();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_STYLE__COLOR = eINSTANCE.getRelationshipStyle_Color();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_STYLE__STYLE = eINSTANCE.getRelationshipStyle_Style();

		/**
		 * The meta object literal for the '<em><b>Routing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_STYLE__ROUTING = eINSTANCE.getRelationshipStyle_Routing();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_STYLE__PROPERTIES = eINSTANCE.getRelationshipStyle_Properties();

		/**
		 * The meta object literal for the '{@link structurizr.impl.ConditionElementImpl <em>Condition Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.ConditionElementImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getConditionElement()
		 * @generated
		 */
		EClass CONDITION_ELEMENT = eINSTANCE.getConditionElement();

		/**
		 * The meta object literal for the '{@link structurizr.impl.NoFilterConditionImpl <em>No Filter Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.NoFilterConditionImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getNoFilterCondition()
		 * @generated
		 */
		EClass NO_FILTER_CONDITION = eINSTANCE.getNoFilterCondition();

		/**
		 * The meta object literal for the '{@link structurizr.impl.FilterConditionImpl <em>Filter Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.FilterConditionImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getFilterCondition()
		 * @generated
		 */
		EClass FILTER_CONDITION = eINSTANCE.getFilterCondition();

		/**
		 * The meta object literal for the '{@link structurizr.impl.ElementFilterConditionImpl <em>Element Filter Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.ElementFilterConditionImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getElementFilterCondition()
		 * @generated
		 */
		EClass ELEMENT_FILTER_CONDITION = eINSTANCE.getElementFilterCondition();

		/**
		 * The meta object literal for the '{@link structurizr.impl.RelationshipFilterConditionImpl <em>Relationship Filter Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.RelationshipFilterConditionImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getRelationshipFilterCondition()
		 * @generated
		 */
		EClass RELATIONSHIP_FILTER_CONDITION = eINSTANCE.getRelationshipFilterCondition();

		/**
		 * The meta object literal for the '{@link structurizr.impl.CompositeConditionImpl <em>Composite Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.CompositeConditionImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getCompositeCondition()
		 * @generated
		 */
		EClass COMPOSITE_CONDITION = eINSTANCE.getCompositeCondition();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_CONDITION__LEFT = eINSTANCE.getCompositeCondition_Left();

		/**
		 * The meta object literal for the '<em><b>Logical Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_CONDITION__LOGICAL_OPERATION = eINSTANCE.getCompositeCondition_LogicalOperation();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_CONDITION__RIGHT = eINSTANCE.getCompositeCondition_Right();

		/**
		 * The meta object literal for the '{@link structurizr.impl.ElementTagConditionImpl <em>Element Tag Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.ElementTagConditionImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getElementTagCondition()
		 * @generated
		 */
		EClass ELEMENT_TAG_CONDITION = eINSTANCE.getElementTagCondition();

		/**
		 * The meta object literal for the '<em><b>Comparison Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_TAG_CONDITION__COMPARISON_OPERATION = eINSTANCE.getElementTagCondition_ComparisonOperation();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_TAG_CONDITION__TAGS = eINSTANCE.getElementTagCondition_Tags();

		/**
		 * The meta object literal for the '{@link structurizr.impl.ElementTechnologyConditionImpl <em>Element Technology Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.ElementTechnologyConditionImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getElementTechnologyCondition()
		 * @generated
		 */
		EClass ELEMENT_TECHNOLOGY_CONDITION = eINSTANCE.getElementTechnologyCondition();

		/**
		 * The meta object literal for the '<em><b>Comparison Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_TECHNOLOGY_CONDITION__COMPARISON_OPERATION = eINSTANCE.getElementTechnologyCondition_ComparisonOperation();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_TECHNOLOGY_CONDITION__TECHNOLOGY = eINSTANCE.getElementTechnologyCondition_Technology();

		/**
		 * The meta object literal for the '{@link structurizr.impl.ElementTypeConditionImpl <em>Element Type Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.ElementTypeConditionImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getElementTypeCondition()
		 * @generated
		 */
		EClass ELEMENT_TYPE_CONDITION = eINSTANCE.getElementTypeCondition();

		/**
		 * The meta object literal for the '<em><b>Comparison Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_TYPE_CONDITION__COMPARISON_OPERATION = eINSTANCE.getElementTypeCondition_ComparisonOperation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_TYPE_CONDITION__TYPE = eINSTANCE.getElementTypeCondition_Type();

		/**
		 * The meta object literal for the '{@link structurizr.impl.ElementPropertyConditionImpl <em>Element Property Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.ElementPropertyConditionImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getElementPropertyCondition()
		 * @generated
		 */
		EClass ELEMENT_PROPERTY_CONDITION = eINSTANCE.getElementPropertyCondition();

		/**
		 * The meta object literal for the '<em><b>Comparison Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_PROPERTY_CONDITION__COMPARISON_OPERATION = eINSTANCE.getElementPropertyCondition_ComparisonOperation();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_PROPERTY_CONDITION__PROPERTY = eINSTANCE.getElementPropertyCondition_Property();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_PROPERTY_CONDITION__VALUE = eINSTANCE.getElementPropertyCondition_Value();

		/**
		 * The meta object literal for the '{@link structurizr.impl.ElementParentConditionImpl <em>Element Parent Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.ElementParentConditionImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getElementParentCondition()
		 * @generated
		 */
		EClass ELEMENT_PARENT_CONDITION = eINSTANCE.getElementParentCondition();

		/**
		 * The meta object literal for the '<em><b>Comparison Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_PARENT_CONDITION__COMPARISON_OPERATION = eINSTANCE.getElementParentCondition_ComparisonOperation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_PARENT_CONDITION__PARENT = eINSTANCE.getElementParentCondition_Parent();

		/**
		 * The meta object literal for the '{@link structurizr.impl.RelationshipTagConditionImpl <em>Relationship Tag Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.RelationshipTagConditionImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getRelationshipTagCondition()
		 * @generated
		 */
		EClass RELATIONSHIP_TAG_CONDITION = eINSTANCE.getRelationshipTagCondition();

		/**
		 * The meta object literal for the '<em><b>Comparison Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_TAG_CONDITION__COMPARISON_OPERATION = eINSTANCE.getRelationshipTagCondition_ComparisonOperation();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_TAG_CONDITION__TAGS = eINSTANCE.getRelationshipTagCondition_Tags();

		/**
		 * The meta object literal for the '{@link structurizr.impl.RelationshipPropertyConditionImpl <em>Relationship Property Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.RelationshipPropertyConditionImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getRelationshipPropertyCondition()
		 * @generated
		 */
		EClass RELATIONSHIP_PROPERTY_CONDITION = eINSTANCE.getRelationshipPropertyCondition();

		/**
		 * The meta object literal for the '<em><b>Comparison Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_PROPERTY_CONDITION__COMPARISON_OPERATION = eINSTANCE.getRelationshipPropertyCondition_ComparisonOperation();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_PROPERTY_CONDITION__PROPERTY = eINSTANCE.getRelationshipPropertyCondition_Property();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_PROPERTY_CONDITION__VALUE = eINSTANCE.getRelationshipPropertyCondition_Value();

		/**
		 * The meta object literal for the '{@link structurizr.impl.RelationshipSourceConditionImpl <em>Relationship Source Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.RelationshipSourceConditionImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getRelationshipSourceCondition()
		 * @generated
		 */
		EClass RELATIONSHIP_SOURCE_CONDITION = eINSTANCE.getRelationshipSourceCondition();

		/**
		 * The meta object literal for the '<em><b>Comparison Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_SOURCE_CONDITION__COMPARISON_OPERATION = eINSTANCE.getRelationshipSourceCondition_ComparisonOperation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_SOURCE_CONDITION__SOURCE = eINSTANCE.getRelationshipSourceCondition_Source();

		/**
		 * The meta object literal for the '{@link structurizr.impl.RelationshipDestinationConditionImpl <em>Relationship Destination Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.impl.RelationshipDestinationConditionImpl
		 * @see structurizr.impl.StructurizrPackageImpl#getRelationshipDestinationCondition()
		 * @generated
		 */
		EClass RELATIONSHIP_DESTINATION_CONDITION = eINSTANCE.getRelationshipDestinationCondition();

		/**
		 * The meta object literal for the '<em><b>Comparison Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP_DESTINATION_CONDITION__COMPARISON_OPERATION = eINSTANCE.getRelationshipDestinationCondition_ComparisonOperation();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_DESTINATION_CONDITION__DESTINATION = eINSTANCE.getRelationshipDestinationCondition_Destination();

		/**
		 * The meta object literal for the '{@link structurizr.AutoLayoutOption <em>Auto Layout Option</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.AutoLayoutOption
		 * @see structurizr.impl.StructurizrPackageImpl#getAutoLayoutOption()
		 * @generated
		 */
		EEnum AUTO_LAYOUT_OPTION = eINSTANCE.getAutoLayoutOption();

		/**
		 * The meta object literal for the '{@link structurizr.Routing <em>Routing</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.Routing
		 * @see structurizr.impl.StructurizrPackageImpl#getRouting()
		 * @generated
		 */
		EEnum ROUTING = eINSTANCE.getRouting();

		/**
		 * The meta object literal for the '{@link structurizr.Border <em>Border</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.Border
		 * @see structurizr.impl.StructurizrPackageImpl#getBorder()
		 * @generated
		 */
		EEnum BORDER = eINSTANCE.getBorder();

		/**
		 * The meta object literal for the '{@link structurizr.Scope <em>Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.Scope
		 * @see structurizr.impl.StructurizrPackageImpl#getScope()
		 * @generated
		 */
		EEnum SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '{@link structurizr.Visibility <em>Visibility</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.Visibility
		 * @see structurizr.impl.StructurizrPackageImpl#getVisibility()
		 * @generated
		 */
		EEnum VISIBILITY = eINSTANCE.getVisibility();

		/**
		 * The meta object literal for the '{@link structurizr.UserPermission <em>User Permission</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.UserPermission
		 * @see structurizr.impl.StructurizrPackageImpl#getUserPermission()
		 * @generated
		 */
		EEnum USER_PERMISSION = eINSTANCE.getUserPermission();

		/**
		 * The meta object literal for the '{@link structurizr.Shape <em>Shape</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.Shape
		 * @see structurizr.impl.StructurizrPackageImpl#getShape()
		 * @generated
		 */
		EEnum SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '{@link structurizr.ConditionComparisonOperation <em>Condition Comparison Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.ConditionComparisonOperation
		 * @see structurizr.impl.StructurizrPackageImpl#getConditionComparisonOperation()
		 * @generated
		 */
		EEnum CONDITION_COMPARISON_OPERATION = eINSTANCE.getConditionComparisonOperation();

		/**
		 * The meta object literal for the '{@link structurizr.FilterType <em>Filter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.FilterType
		 * @see structurizr.impl.StructurizrPackageImpl#getFilterType()
		 * @generated
		 */
		EEnum FILTER_TYPE = eINSTANCE.getFilterType();

		/**
		 * The meta object literal for the '{@link structurizr.ConditionLogicalOperation <em>Condition Logical Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structurizr.ConditionLogicalOperation
		 * @see structurizr.impl.StructurizrPackageImpl#getConditionLogicalOperation()
		 * @generated
		 */
		EEnum CONDITION_LOGICAL_OPERATION = eINSTANCE.getConditionLogicalOperation();

	}

} //StructurizrPackage
