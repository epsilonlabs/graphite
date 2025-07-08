/**
 */
package TestingPackage.FuzzingOperations;

import TestingPackage.StandardGrammar.Condition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Based Activation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.FuzzingOperations.ConditionBasedActivation#getMaximumActivations <em>Maximum Activations</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.ConditionBasedActivation#getStarting <em>Starting</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.ConditionBasedActivation#getEnding <em>Ending</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.ConditionBasedActivation#getStartingExpression <em>Starting Expression</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.ConditionBasedActivation#getEndingExpression <em>Ending Expression</em>}</li>
 * </ul>
 *
 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getConditionBasedActivation()
 * @model annotation="syntax feature='startingExpression' derive='starting' grammar='sesame.conditionBasedActivation.startingEndingExpression.ConditionsDsl' entryRule='ConditionBasedActivationStarting'"
 *        annotation="syntax feature='endingExpression' derive='ending' grammar='sesame.conditionBasedActivation.startingEndingExpression.ConditionsDsl' entryRule='ConditionBasedActivationEnding'"
 * @generated
 */
public interface ConditionBasedActivation extends Activation {
	/**
	 * Returns the value of the '<em><b>Maximum Activations</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Activations</em>' attribute.
	 * @see #setMaximumActivations(int)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getConditionBasedActivation_MaximumActivations()
	 * @model default="1"
	 * @generated
	 */
	int getMaximumActivations();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.ConditionBasedActivation#getMaximumActivations <em>Maximum Activations</em>}' attribute.
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
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getConditionBasedActivation_Starting()
	 * @model containment="true"
	 * @generated
	 */
	Condition getStarting();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.ConditionBasedActivation#getStarting <em>Starting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting</em>' containment reference.
	 * @see #getStarting()
	 * @generated
	 */
	void setStarting(Condition value);

	/**
	 * Returns the value of the '<em><b>Ending</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ending</em>' containment reference.
	 * @see #setEnding(Condition)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getConditionBasedActivation_Ending()
	 * @model containment="true"
	 * @generated
	 */
	Condition getEnding();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.ConditionBasedActivation#getEnding <em>Ending</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ending</em>' containment reference.
	 * @see #getEnding()
	 * @generated
	 */
	void setEnding(Condition value);

	/**
	 * Returns the value of the '<em><b>Starting Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Starting Expression</em>' attribute.
	 * @see #setStartingExpression(String)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getConditionBasedActivation_StartingExpression()
	 * @model
	 * @generated
	 */
	String getStartingExpression();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.ConditionBasedActivation#getStartingExpression <em>Starting Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starting Expression</em>' attribute.
	 * @see #getStartingExpression()
	 * @generated
	 */
	void setStartingExpression(String value);

	/**
	 * Returns the value of the '<em><b>Ending Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ending Expression</em>' attribute.
	 * @see #setEndingExpression(String)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getConditionBasedActivation_EndingExpression()
	 * @model
	 * @generated
	 */
	String getEndingExpression();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.ConditionBasedActivation#getEndingExpression <em>Ending Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ending Expression</em>' attribute.
	 * @see #getEndingExpression()
	 * @generated
	 */
	void setEndingExpression(String value);

} // ConditionBasedActivation
