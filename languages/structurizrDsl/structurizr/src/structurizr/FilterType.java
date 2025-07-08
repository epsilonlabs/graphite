/**
 */
package structurizr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Filter Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see structurizr.StructurizrPackage#getFilterType()
 * @model
 * @generated
 */
public enum FilterType implements Enumerator {
	/**
	 * The '<em><b>Person</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSON_VALUE
	 * @generated
	 * @ordered
	 */
	PERSON(1, "Person", "Person"),

	/**
	 * The '<em><b>Software System</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_SYSTEM_VALUE
	 * @generated
	 * @ordered
	 */
	SOFTWARE_SYSTEM(2, "SoftwareSystem", "SoftwareSystem"),

	/**
	 * The '<em><b>Container</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINER_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINER(3, "Container", "Container"),

	/**
	 * The '<em><b>Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPONENT(4, "Component", "Component"),

	/**
	 * The '<em><b>Deployment Node</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOYMENT_NODE_VALUE
	 * @generated
	 * @ordered
	 */
	DEPLOYMENT_NODE(5, "DeploymentNode", "DeploymentNode");

	/**
	 * The '<em><b>Person</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSON
	 * @model name="Person"
	 * @generated
	 * @ordered
	 */
	public static final int PERSON_VALUE = 1;

	/**
	 * The '<em><b>Software System</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFTWARE_SYSTEM
	 * @model name="SoftwareSystem"
	 * @generated
	 * @ordered
	 */
	public static final int SOFTWARE_SYSTEM_VALUE = 2;

	/**
	 * The '<em><b>Container</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINER
	 * @model name="Container"
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINER_VALUE = 3;

	/**
	 * The '<em><b>Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT
	 * @model name="Component"
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_VALUE = 4;

	/**
	 * The '<em><b>Deployment Node</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEPLOYMENT_NODE
	 * @model name="DeploymentNode"
	 * @generated
	 * @ordered
	 */
	public static final int DEPLOYMENT_NODE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Filter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FilterType[] VALUES_ARRAY =
		new FilterType[] {
			PERSON,
			SOFTWARE_SYSTEM,
			CONTAINER,
			COMPONENT,
			DEPLOYMENT_NODE,
		};

	/**
	 * A public read-only list of all the '<em><b>Filter Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FilterType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Filter Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FilterType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FilterType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Filter Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FilterType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FilterType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Filter Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FilterType get(int value) {
		switch (value) {
			case PERSON_VALUE: return PERSON;
			case SOFTWARE_SYSTEM_VALUE: return SOFTWARE_SYSTEM;
			case CONTAINER_VALUE: return CONTAINER;
			case COMPONENT_VALUE: return COMPONENT;
			case DEPLOYMENT_NODE_VALUE: return DEPLOYMENT_NODE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FilterType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //FilterType
