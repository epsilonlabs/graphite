/**
 */
package workload;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workload.Task#getName <em>Name</em>}</li>
 *   <li>{@link workload.Task#getLeader <em>Leader</em>}</li>
 *   <li>{@link workload.Task#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link workload.Task#getEfforts <em>Efforts</em>}</li>
 *   <li>{@link workload.Task#getEffortsExpression <em>Efforts Expression</em>}</li>
 * </ul>
 *
 * @see workload.WorkloadPackage#getTask()
 * @model annotation="syntax feature='effortsExpression' derive='efforts' grammar='workload.xtext_grammar.Efforts' entryRule='Main'"
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see workload.WorkloadPackage#getTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link workload.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Leader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader</em>' reference.
	 * @see #setLeader(Person)
	 * @see workload.WorkloadPackage#getTask_Leader()
	 * @model
	 * @generated
	 */
	Person getLeader();

	/**
	 * Sets the value of the '{@link workload.Task#getLeader <em>Leader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader</em>' reference.
	 * @see #getLeader()
	 * @generated
	 */
	void setLeader(Person value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link workload.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see workload.WorkloadPackage#getTask_Dependencies()
	 * @model
	 * @generated
	 */
	EList<Task> getDependencies();

	/**
	 * Returns the value of the '<em><b>Efforts</b></em>' containment reference list.
	 * The list contents are of type {@link workload.Effort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Efforts</em>' containment reference list.
	 * @see workload.WorkloadPackage#getTask_Efforts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Effort> getEfforts();

	/**
	 * Returns the value of the '<em><b>Efforts Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Efforts Expression</em>' attribute.
	 * @see #setEffortsExpression(String)
	 * @see workload.WorkloadPackage#getTask_EffortsExpression()
	 * @model
	 * @generated
	 */
	String getEffortsExpression();

	/**
	 * Sets the value of the '{@link workload.Task#getEffortsExpression <em>Efforts Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Efforts Expression</em>' attribute.
	 * @see #getEffortsExpression()
	 * @generated
	 */
	void setEffortsExpression(String value);

} // Task
