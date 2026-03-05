/**
 */
package flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capacity Bound</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flow.CapacityBound#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link flow.CapacityBound#getLoad <em>Load</em>}</li>
 * </ul>
 *
 * @see flow.FlowPackage#getCapacityBound()
 * @model abstract="true"
 * @generated
 */
public interface CapacityBound extends FlowElement {
	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see flow.FlowPackage#getCapacityBound_Capacity()
	 * @model default="10" required="true"
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link flow.CapacityBound#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Load</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load</em>' attribute.
	 * @see #setLoad(int)
	 * @see flow.FlowPackage#getCapacityBound_Load()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getLoad();

	/**
	 * Sets the value of the '{@link flow.CapacityBound#getLoad <em>Load</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load</em>' attribute.
	 * @see #getLoad()
	 * @generated
	 */
	void setLoad(int value);

} // CapacityBound
