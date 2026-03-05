/**
 */
package flow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link flow.DataSource#getVolume <em>Volume</em>}</li>
 * </ul>
 *
 * @see flow.FlowPackage#getDataSource()
 * @model
 * @generated
 */
public interface DataSource extends FlowSource, Named {
	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(int)
	 * @see flow.FlowPackage#getDataSource_Volume()
	 * @model default="2" required="true"
	 * @generated
	 */
	int getVolume();

	/**
	 * Sets the value of the '{@link flow.DataSource#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(int value);

} // DataSource
