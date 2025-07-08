/**
 */
package TestingPackage.FuzzingOperations;

import TestingPackage.StandardGrammar.Condition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Based Time Limited</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getLength <em>Length</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getMaximumActivations <em>Maximum Activations</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getStarting <em>Starting</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getStartingExpression <em>Starting Expression</em>}</li>
 * </ul>
 *
 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getConditionBasedTimeLimited()
 * @model annotation="syntax feature='startingExpression' derive='starting' grammar='sesame.conditionBasedTimeLimited.startingExpression.ConditionsDsl' entryRule='ConditionBasedTimeLimited'"
 * @generated
 */
public interface ConditionBasedTimeLimited extends Activation {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(double)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getConditionBasedTimeLimited_Length()
	 * @model
	 * @generated
	 */
	double getLength();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Activations</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Activations</em>' attribute.
	 * @see #setMaximumActivations(int)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getConditionBasedTimeLimited_MaximumActivations()
	 * @model default="1"
	 * @generated
	 */
	int getMaximumActivations();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getMaximumActivations <em>Maximum Activations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Activations</em>' attribute.
	 * @see #getMaximumActivations()
	 * @generated
	 */
	void setMaximumActivations(int value);

	/**
	 * Returns the value of the '<em><b>Starting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting</em>' containment reference.
	 * @see #setStarting(Condition)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getConditionBasedTimeLimited_Starting()
	 * @model containment="true"
	 * @generated
	 */
	Condition getStarting();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getStarting <em>Starting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting</em>' containment reference.
	 * @see #getStarting()
	 * @generated
	 */
	void setStarting(Condition value);

	/**
	 * Returns the value of the '<em><b>Starting Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Expression</em>' attribute.
	 * @see #setStartingExpression(String)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getConditionBasedTimeLimited_StartingExpression()
	 * @model
	 * @generated
	 */
	String getStartingExpression();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.ConditionBasedTimeLimited#getStartingExpression <em>Starting Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Expression</em>' attribute.
	 * @see #getStartingExpression()
	 * @generated
	 */
	void setStartingExpression(String value);

} // ConditionBasedTimeLimited
