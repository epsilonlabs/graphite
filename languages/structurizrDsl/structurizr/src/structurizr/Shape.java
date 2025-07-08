/**
 */
package structurizr;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Shape</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see structurizr.StructurizrPackage#getShape()
 * @model
 * @generated
 */
public enum Shape implements Enumerator {
	/**
	 * The '<em><b>Box</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOX_VALUE
	 * @generated
	 * @ordered
	 */
	BOX(1, "Box", "Box"),

	/**
	 * The '<em><b>Rounded Box</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUNDED_BOX_VALUE
	 * @generated
	 * @ordered
	 */
	ROUNDED_BOX(2, "RoundedBox", "RoundedBox"),

	/**
	 * The '<em><b>Circle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIRCLE_VALUE
	 * @generated
	 * @ordered
	 */
	CIRCLE(3, "Circle", "Circle"),

	/**
	 * The '<em><b>Ellipse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELLIPSE_VALUE
	 * @generated
	 * @ordered
	 */
	ELLIPSE(4, "Ellipse", "Ellipse"),

	/**
	 * The '<em><b>Hexagon</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXAGON_VALUE
	 * @generated
	 * @ordered
	 */
	HEXAGON(5, "Hexagon", "Hexagon"),

	/**
	 * The '<em><b>Cylinder</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYLINDER_VALUE
	 * @generated
	 * @ordered
	 */
	CYLINDER(6, "Cylinder", "Cylinder"),

	/**
	 * The '<em><b>Pipe</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIPE_VALUE
	 * @generated
	 * @ordered
	 */
	PIPE(7, "Pipe", "Pipe"),

	/**
	 * The '<em><b>Person</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSON_VALUE
	 * @generated
	 * @ordered
	 */
	PERSON(8, "Person", "Person"),

	/**
	 * The '<em><b>Robot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROBOT_VALUE
	 * @generated
	 * @ordered
	 */
	ROBOT(9, "Robot", "Robot"),

	/**
	 * The '<em><b>Folder</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOLDER_VALUE
	 * @generated
	 * @ordered
	 */
	FOLDER(10, "Folder", "Folder"),

	/**
	 * The '<em><b>Web Browser</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_BROWSER_VALUE
	 * @generated
	 * @ordered
	 */
	WEB_BROWSER(11, "WebBrowser", "WebBrowser"),

	/**
	 * The '<em><b>Mobile Device Portrait</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOBILE_DEVICE_PORTRAIT_VALUE
	 * @generated
	 * @ordered
	 */
	MOBILE_DEVICE_PORTRAIT(12, "MobileDevicePortrait", "MobileDevicePortrait"),

	/**
	 * The '<em><b>Mobile Device Landscape</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOBILE_DEVICE_LANDSCAPE_VALUE
	 * @generated
	 * @ordered
	 */
	MOBILE_DEVICE_LANDSCAPE(13, "MobileDeviceLandscape", "MobileDeviceLandscape"),

	/**
	 * The '<em><b>Component</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPONENT(14, "Component", "Component");

	/**
	 * The '<em><b>Box</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOX
	 * @model name="Box"
	 * @generated
	 * @ordered
	 */
	public static final int BOX_VALUE = 1;

	/**
	 * The '<em><b>Rounded Box</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROUNDED_BOX
	 * @model name="RoundedBox"
	 * @generated
	 * @ordered
	 */
	public static final int ROUNDED_BOX_VALUE = 2;

	/**
	 * The '<em><b>Circle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CIRCLE
	 * @model name="Circle"
	 * @generated
	 * @ordered
	 */
	public static final int CIRCLE_VALUE = 3;

	/**
	 * The '<em><b>Ellipse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELLIPSE
	 * @model name="Ellipse"
	 * @generated
	 * @ordered
	 */
	public static final int ELLIPSE_VALUE = 4;

	/**
	 * The '<em><b>Hexagon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXAGON
	 * @model name="Hexagon"
	 * @generated
	 * @ordered
	 */
	public static final int HEXAGON_VALUE = 5;

	/**
	 * The '<em><b>Cylinder</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYLINDER
	 * @model name="Cylinder"
	 * @generated
	 * @ordered
	 */
	public static final int CYLINDER_VALUE = 6;

	/**
	 * The '<em><b>Pipe</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIPE
	 * @model name="Pipe"
	 * @generated
	 * @ordered
	 */
	public static final int PIPE_VALUE = 7;

	/**
	 * The '<em><b>Person</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSON
	 * @model name="Person"
	 * @generated
	 * @ordered
	 */
	public static final int PERSON_VALUE = 8;

	/**
	 * The '<em><b>Robot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROBOT
	 * @model name="Robot"
	 * @generated
	 * @ordered
	 */
	public static final int ROBOT_VALUE = 9;

	/**
	 * The '<em><b>Folder</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOLDER
	 * @model name="Folder"
	 * @generated
	 * @ordered
	 */
	public static final int FOLDER_VALUE = 10;

	/**
	 * The '<em><b>Web Browser</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEB_BROWSER
	 * @model name="WebBrowser"
	 * @generated
	 * @ordered
	 */
	public static final int WEB_BROWSER_VALUE = 11;

	/**
	 * The '<em><b>Mobile Device Portrait</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOBILE_DEVICE_PORTRAIT
	 * @model name="MobileDevicePortrait"
	 * @generated
	 * @ordered
	 */
	public static final int MOBILE_DEVICE_PORTRAIT_VALUE = 12;

	/**
	 * The '<em><b>Mobile Device Landscape</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOBILE_DEVICE_LANDSCAPE
	 * @model name="MobileDeviceLandscape"
	 * @generated
	 * @ordered
	 */
	public static final int MOBILE_DEVICE_LANDSCAPE_VALUE = 13;

	/**
	 * The '<em><b>Component</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT
	 * @model name="Component"
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_VALUE = 14;

	/**
	 * An array of all the '<em><b>Shape</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Shape[] VALUES_ARRAY =
		new Shape[] {
			BOX,
			ROUNDED_BOX,
			CIRCLE,
			ELLIPSE,
			HEXAGON,
			CYLINDER,
			PIPE,
			PERSON,
			ROBOT,
			FOLDER,
			WEB_BROWSER,
			MOBILE_DEVICE_PORTRAIT,
			MOBILE_DEVICE_LANDSCAPE,
			COMPONENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Shape</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Shape> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Shape</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Shape get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Shape result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Shape</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Shape getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Shape result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Shape</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Shape get(int value) {
		switch (value) {
			case BOX_VALUE: return BOX;
			case ROUNDED_BOX_VALUE: return ROUNDED_BOX;
			case CIRCLE_VALUE: return CIRCLE;
			case ELLIPSE_VALUE: return ELLIPSE;
			case HEXAGON_VALUE: return HEXAGON;
			case CYLINDER_VALUE: return CYLINDER;
			case PIPE_VALUE: return PIPE;
			case PERSON_VALUE: return PERSON;
			case ROBOT_VALUE: return ROBOT;
			case FOLDER_VALUE: return FOLDER;
			case WEB_BROWSER_VALUE: return WEB_BROWSER;
			case MOBILE_DEVICE_PORTRAIT_VALUE: return MOBILE_DEVICE_PORTRAIT;
			case MOBILE_DEVICE_LANDSCAPE_VALUE: return MOBILE_DEVICE_LANDSCAPE;
			case COMPONENT_VALUE: return COMPONENT;
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
	private Shape(int value, String name, String literal) {
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
	
} //Shape
