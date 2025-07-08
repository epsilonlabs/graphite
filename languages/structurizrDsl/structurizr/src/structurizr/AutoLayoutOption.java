/**
 */
package structurizr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Auto Layout Option</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see structurizr.StructurizrPackage#getAutoLayoutOption()
 * @model
 * @generated
 */
public enum AutoLayoutOption implements Enumerator {
	/**
	 * The '<em><b>Left To Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_TO_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT_TO_RIGHT(1, "LeftToRight", "LeftToRight"),

	/**
	 * The '<em><b>Right To Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_TO_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT_TO_LEFT(2, "RightToLeft", "RightToLeft"),

	/**
	 * The '<em><b>Bottom To Top</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_TO_TOP_VALUE
	 * @generated
	 * @ordered
	 */
	BOTTOM_TO_TOP(3, "BottomToTop", "BottomToTop"),

	/**
	 * The '<em><b>Top To Bottom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP_TO_BOTTOM_VALUE
	 * @generated
	 * @ordered
	 */
	TOP_TO_BOTTOM(4, "TopToBottom", "TopToBottom");

	/**
	 * The '<em><b>Left To Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_TO_RIGHT
	 * @model name="LeftToRight"
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_TO_RIGHT_VALUE = 1;

	/**
	 * The '<em><b>Right To Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_TO_LEFT
	 * @model name="RightToLeft"
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_TO_LEFT_VALUE = 2;

	/**
	 * The '<em><b>Bottom To Top</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_TO_TOP
	 * @model name="BottomToTop"
	 * @generated
	 * @ordered
	 */
	public static final int BOTTOM_TO_TOP_VALUE = 3;

	/**
	 * The '<em><b>Top To Bottom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP_TO_BOTTOM
	 * @model name="TopToBottom"
	 * @generated
	 * @ordered
	 */
	public static final int TOP_TO_BOTTOM_VALUE = 4;

	/**
	 * An array of all the '<em><b>Auto Layout Option</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AutoLayoutOption[] VALUES_ARRAY =
		new AutoLayoutOption[] {
			LEFT_TO_RIGHT,
			RIGHT_TO_LEFT,
			BOTTOM_TO_TOP,
			TOP_TO_BOTTOM,
		};

	/**
	 * A public read-only list of all the '<em><b>Auto Layout Option</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AutoLayoutOption> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Auto Layout Option</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AutoLayoutOption get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AutoLayoutOption result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Auto Layout Option</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AutoLayoutOption getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AutoLayoutOption result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Auto Layout Option</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AutoLayoutOption get(int value) {
		switch (value) {
			case LEFT_TO_RIGHT_VALUE: return LEFT_TO_RIGHT;
			case RIGHT_TO_LEFT_VALUE: return RIGHT_TO_LEFT;
			case BOTTOM_TO_TOP_VALUE: return BOTTOM_TO_TOP;
			case TOP_TO_BOTTOM_VALUE: return TOP_TO_BOTTOM;
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
	private AutoLayoutOption(int value, String name, String literal) {
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
	
} //AutoLayoutOption
