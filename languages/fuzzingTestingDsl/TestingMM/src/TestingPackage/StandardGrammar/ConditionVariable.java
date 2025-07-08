/**
 */
package TestingPackage.StandardGrammar;

import TestingPackage.Metrics.Metric;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.StandardGrammar.ConditionVariable#getMetric <em>Metric</em>}</li>
 * </ul>
 *
 * @see TestingPackage.StandardGrammar.StandardGrammarPackage#getConditionVariable()
 * @model
 * @generated
 */
public interface ConditionVariable extends ConditionExpr {
	/**
	 * Returns the value of the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' reference.
	 * @see #setMetric(Metric)
	 * @see TestingPackage.StandardGrammar.StandardGrammarPackage#getConditionVariable_Metric()
	 * @model required="true"
	 * @generated
	 */
	Metric getMetric();

	/**
	 * Sets the value of the '{@link TestingPackage.StandardGrammar.ConditionVariable#getMetric <em>Metric</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' reference.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(Metric value);

} // ConditionVariable
