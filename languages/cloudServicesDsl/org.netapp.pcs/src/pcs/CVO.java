/**
 */
package pcs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CVO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcs.CVO#getAwsnetworking <em>Awsnetworking</em>}</li>
 *   <li>{@link pcs.CVO#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link pcs.CVO#getVolume <em>Volume</em>}</li>
 * </ul>
 *
 * @see pcs.PcsPackage#getCVO()
 * @model annotation="syntax feature='volume' derive='volumes' grammar='org.netapp.pcs.grammarVolumes.Volumes' entryRule='CVO'"
 * @generated
 */
public interface CVO extends CVOConfiguration {
	/**
	 * Returns the value of the '<em><b>Awsnetworking</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link pcs.AWSNetworking#getCvo <em>Cvo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Awsnetworking</em>' reference.
	 * @see #setAwsnetworking(AWSNetworking)
	 * @see pcs.PcsPackage#getCVO_Awsnetworking()
	 * @see pcs.AWSNetworking#getCvo
	 * @model opposite="cvo"
	 * @generated
	 */
	AWSNetworking getAwsnetworking();

	/**
	 * Sets the value of the '{@link pcs.CVO#getAwsnetworking <em>Awsnetworking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Awsnetworking</em>' reference.
	 * @see #getAwsnetworking()
	 * @generated
	 */
	void setAwsnetworking(AWSNetworking value);

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' containment reference list.
	 * The list contents are of type {@link pcs.Volume}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' containment reference list.
	 * @see pcs.PcsPackage#getCVO_Volumes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Volume> getVolumes();

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(String)
	 * @see pcs.PcsPackage#getCVO_Volume()
	 * @model
	 * @generated
	 */
	String getVolume();

	/**
	 * Sets the value of the '{@link pcs.CVO#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(String value);

} // CVO
