/**
 */
package fr.obeo.dsl.designer.sample.flow;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Property Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.obeo.dsl.designer.sample.flow.FlowPackage#getPropertyUnit()
 * @model
 * @generated
 */
public enum PropertyUnit implements Enumerator {
	/**
	 * The '<em><b>Celsius</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELSIUS_VALUE
	 * @generated
	 * @ordered
	 */
	CELSIUS(0, "Celsius", "Celsius"),

	/**
	 * The '<em><b>Fahrenheit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAHRENHEIT_VALUE
	 * @generated
	 * @ordered
	 */
	FAHRENHEIT(1, "Fahrenheit", "Fahrenheit"),

	/**
	 * The '<em><b>Kilograms</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KILOGRAMS_VALUE
	 * @generated
	 * @ordered
	 */
	KILOGRAMS(2, "Kilograms", "Kilograms"),

	/**
	 * The '<em><b>Pounds</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POUNDS_VALUE
	 * @generated
	 * @ordered
	 */
	POUNDS(3, "Pounds", "Pounds");

	/**
	 * The '<em><b>Celsius</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CELSIUS
	 * @model name="Celsius"
	 * @generated
	 * @ordered
	 */
	public static final int CELSIUS_VALUE = 0;

	/**
	 * The '<em><b>Fahrenheit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAHRENHEIT
	 * @model name="Fahrenheit"
	 * @generated
	 * @ordered
	 */
	public static final int FAHRENHEIT_VALUE = 1;

	/**
	 * The '<em><b>Kilograms</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KILOGRAMS
	 * @model name="Kilograms"
	 * @generated
	 * @ordered
	 */
	public static final int KILOGRAMS_VALUE = 2;

	/**
	 * The '<em><b>Pounds</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POUNDS
	 * @model name="Pounds"
	 * @generated
	 * @ordered
	 */
	public static final int POUNDS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Property Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PropertyUnit[] VALUES_ARRAY =
		new PropertyUnit[] {
			CELSIUS,
			FAHRENHEIT,
			KILOGRAMS,
			POUNDS,
		};

	/**
	 * A public read-only list of all the '<em><b>Property Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PropertyUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Property Unit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyUnit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropertyUnit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Property Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyUnit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropertyUnit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Property Unit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PropertyUnit get(int value) {
		switch (value) {
			case CELSIUS_VALUE: return CELSIUS;
			case FAHRENHEIT_VALUE: return FAHRENHEIT;
			case KILOGRAMS_VALUE: return KILOGRAMS;
			case POUNDS_VALUE: return POUNDS;
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
	private PropertyUnit(int value, String name, String literal) {
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
	
} //PropertyUnit
