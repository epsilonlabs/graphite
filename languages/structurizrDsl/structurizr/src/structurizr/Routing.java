/**
 */
package structurizr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Routing</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see structurizr.StructurizrPackage#getRouting()
 * @model
 * @generated
 */
public enum Routing implements Enumerator {
	/**
	 * The '<em><b>Direct</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRECT_VALUE
	 * @generated
	 * @ordered
	 */
	DIRECT(1, "Direct", "Direct"),

	/**
	 * The '<em><b>Orthogonal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORTHOGONAL_VALUE
	 * @generated
	 * @ordered
	 */
	ORTHOGONAL(2, "Orthogonal", "Orthogonal"),

	/**
	 * The '<em><b>Curved</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURVED_VALUE
	 * @generated
	 * @ordered
	 */
	CURVED(3, "Curved", "Curved");

	/**
	 * The '<em><b>Direct</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIRECT
	 * @model name="Direct"
	 * @generated
	 * @ordered
	 */
	public static final int DIRECT_VALUE = 1;

	/**
	 * The '<em><b>Orthogonal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORTHOGONAL
	 * @model name="Orthogonal"
	 * @generated
	 * @ordered
	 */
	public static final int ORTHOGONAL_VALUE = 2;

	/**
	 * The '<em><b>Curved</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURVED
	 * @model name="Curved"
	 * @generated
	 * @ordered
	 */
	public static final int CURVED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Routing</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Routing[] VALUES_ARRAY =
		new Routing[] {
			DIRECT,
			ORTHOGONAL,
			CURVED,
		};

	/**
	 * A public read-only list of all the '<em><b>Routing</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Routing> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Routing</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Routing get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Routing result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Routing</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Routing getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Routing result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Routing</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Routing get(int value) {
		switch (value) {
			case DIRECT_VALUE: return DIRECT;
			case ORTHOGONAL_VALUE: return ORTHOGONAL;
			case CURVED_VALUE: return CURVED;
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
	private Routing(int value, String name, String literal) {
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
	
} //Routing
