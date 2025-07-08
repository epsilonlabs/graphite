/**
 */
package TestingPackage.Metrics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Metric Optimisation Direction</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see TestingPackage.Metrics.MetricsPackage#getMetricOptimisationDirection()
 * @model
 * @generated
 */
public enum MetricOptimisationDirection implements Enumerator {
	/**
	 * The '<em><b>HIGHEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGHEST_VALUE
	 * @generated
	 * @ordered
	 */
	HIGHEST(1, "HIGHEST", "HIGHEST"),

	/**
	 * The '<em><b>LOWEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWEST_VALUE
	 * @generated
	 * @ordered
	 */
	LOWEST(2, "LOWEST", "LOWEST");

	/**
	 * The '<em><b>HIGHEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGHEST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIGHEST_VALUE = 1;

	/**
	 * The '<em><b>LOWEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWEST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOWEST_VALUE = 2;

	/**
	 * An array of all the '<em><b>Metric Optimisation Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MetricOptimisationDirection[] VALUES_ARRAY =
		new MetricOptimisationDirection[] {
			HIGHEST,
			LOWEST,
		};

	/**
	 * A public read-only list of all the '<em><b>Metric Optimisation Direction</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MetricOptimisationDirection> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Metric Optimisation Direction</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MetricOptimisationDirection get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MetricOptimisationDirection result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Metric Optimisation Direction</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MetricOptimisationDirection getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MetricOptimisationDirection result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Metric Optimisation Direction</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MetricOptimisationDirection get(int value) {
		switch (value) {
			case HIGHEST_VALUE: return HIGHEST;
			case LOWEST_VALUE: return LOWEST;
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
	private MetricOptimisationDirection(int value, String name, String literal) {
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
	
} //MetricOptimisationDirection
