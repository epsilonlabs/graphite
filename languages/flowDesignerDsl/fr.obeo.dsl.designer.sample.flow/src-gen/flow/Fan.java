/**
 */
package flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flow.Fan#getSpeed <em>Speed</em>}</li>
 *   <li>{@link flow.Fan#getWeight <em>Weight</em>}</li>
 * </ul>
 *
 * @see flow.FlowPackage#getFan()
 * @model
 * @generated
 */
public interface Fan extends FlowElement, Powered {
	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(int)
	 * @see flow.FlowPackage#getFan_Speed()
	 * @model default="100" required="true"
	 * @generated
	 */
	int getSpeed();

	/**
	 * Sets the value of the '{@link flow.Fan#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(int value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see flow.FlowPackage#getFan_Weight()
	 * @model default="3" required="true"
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link flow.Fan#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

} // Fan
