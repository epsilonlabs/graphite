/**
 */
package workload;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cost Centre</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link workload.CostCentre#getName <em>Name</em>}</li>
 *   <li>{@link workload.CostCentre#getEfforts <em>Efforts</em>}</li>
 * </ul>
 *
 * @see workload.WorkloadPackage#getCostCentre()
 * @model
 * @generated
 */
public interface CostCentre extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see workload.WorkloadPackage#getCostCentre_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link workload.CostCentre#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Efforts</b></em>' reference list.
	 * The list contents are of type {@link workload.Effort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Efforts</em>' reference list.
	 * @see workload.WorkloadPackage#getCostCentre_Efforts()
	 * @model
	 * @generated
	 */
	EList<Effort> getEfforts();

} // CostCentre
