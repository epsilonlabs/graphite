/**
 */
package pcs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Snap Mirror</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcs.SnapMirror#getSource_cvo <em>Source cvo</em>}</li>
 *   <li>{@link pcs.SnapMirror#getDestination_cvo <em>Destination cvo</em>}</li>
 *   <li>{@link pcs.SnapMirror#getSource_volume <em>Source volume</em>}</li>
 *   <li>{@link pcs.SnapMirror#getDestination_volume <em>Destination volume</em>}</li>
 *   <li>{@link pcs.SnapMirror#getPolicy <em>Policy</em>}</li>
 *   <li>{@link pcs.SnapMirror#getMax_transfer_rate <em>Max transfer rate</em>}</li>
 *   <li>{@link pcs.SnapMirror#isBidirectional <em>Bidirectional</em>}</li>
 * </ul>
 *
 * @see pcs.PcsPackage#getSnapMirror()
 * @model
 * @generated
 */
public interface SnapMirror extends DataService {
	/**
	 * Returns the value of the '<em><b>Source cvo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source cvo</em>' reference.
	 * @see #setSource_cvo(CVO)
	 * @see pcs.PcsPackage#getSnapMirror_Source_cvo()
	 * @model
	 * @generated
	 */
	CVO getSource_cvo();

	/**
	 * Sets the value of the '{@link pcs.SnapMirror#getSource_cvo <em>Source cvo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source cvo</em>' reference.
	 * @see #getSource_cvo()
	 * @generated
	 */
	void setSource_cvo(CVO value);

	/**
	 * Returns the value of the '<em><b>Destination cvo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination cvo</em>' reference.
	 * @see #setDestination_cvo(CVO)
	 * @see pcs.PcsPackage#getSnapMirror_Destination_cvo()
	 * @model
	 * @generated
	 */
	CVO getDestination_cvo();

	/**
	 * Sets the value of the '{@link pcs.SnapMirror#getDestination_cvo <em>Destination cvo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination cvo</em>' reference.
	 * @see #getDestination_cvo()
	 * @generated
	 */
	void setDestination_cvo(CVO value);

	/**
	 * Returns the value of the '<em><b>Source volume</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source volume</em>' reference.
	 * @see #setSource_volume(Volume)
	 * @see pcs.PcsPackage#getSnapMirror_Source_volume()
	 * @model
	 * @generated
	 */
	Volume getSource_volume();

	/**
	 * Sets the value of the '{@link pcs.SnapMirror#getSource_volume <em>Source volume</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source volume</em>' reference.
	 * @see #getSource_volume()
	 * @generated
	 */
	void setSource_volume(Volume value);

	/**
	 * Returns the value of the '<em><b>Destination volume</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination volume</em>' reference.
	 * @see #setDestination_volume(Volume)
	 * @see pcs.PcsPackage#getSnapMirror_Destination_volume()
	 * @model
	 * @generated
	 */
	Volume getDestination_volume();

	/**
	 * Sets the value of the '{@link pcs.SnapMirror#getDestination_volume <em>Destination volume</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination volume</em>' reference.
	 * @see #getDestination_volume()
	 * @generated
	 */
	void setDestination_volume(Volume value);

	/**
	 * Returns the value of the '<em><b>Policy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy</em>' reference.
	 * @see #setPolicy(SnapshotPolicy)
	 * @see pcs.PcsPackage#getSnapMirror_Policy()
	 * @model
	 * @generated
	 */
	SnapshotPolicy getPolicy();

	/**
	 * Sets the value of the '{@link pcs.SnapMirror#getPolicy <em>Policy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Policy</em>' reference.
	 * @see #getPolicy()
	 * @generated
	 */
	void setPolicy(SnapshotPolicy value);

	/**
	 * Returns the value of the '<em><b>Max transfer rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max transfer rate</em>' attribute.
	 * @see #setMax_transfer_rate(int)
	 * @see pcs.PcsPackage#getSnapMirror_Max_transfer_rate()
	 * @model
	 * @generated
	 */
	int getMax_transfer_rate();

	/**
	 * Sets the value of the '{@link pcs.SnapMirror#getMax_transfer_rate <em>Max transfer rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max transfer rate</em>' attribute.
	 * @see #getMax_transfer_rate()
	 * @generated
	 */
	void setMax_transfer_rate(int value);

	/**
	 * Returns the value of the '<em><b>Bidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bidirectional</em>' attribute.
	 * @see #setBidirectional(boolean)
	 * @see pcs.PcsPackage#getSnapMirror_Bidirectional()
	 * @model
	 * @generated
	 */
	boolean isBidirectional();

	/**
	 * Sets the value of the '{@link pcs.SnapMirror#isBidirectional <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bidirectional</em>' attribute.
	 * @see #isBidirectional()
	 * @generated
	 */
	void setBidirectional(boolean value);

} // SnapMirror
