/**
 */
package pcs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AWS Networking HA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pcs.AWSNetworkingHA#getCvo_ha <em>Cvo ha</em>}</li>
 *   <li>{@link pcs.AWSNetworkingHA#getNode1_subnet_id <em>Node1 subnet id</em>}</li>
 *   <li>{@link pcs.AWSNetworkingHA#getNode2_subnet_id <em>Node2 subnet id</em>}</li>
 *   <li>{@link pcs.AWSNetworkingHA#getFailover_mode <em>Failover mode</em>}</li>
 *   <li>{@link pcs.AWSNetworkingHA#getMediator_subnet_id <em>Mediator subnet id</em>}</li>
 *   <li>{@link pcs.AWSNetworkingHA#getMediator_key_pair_name <em>Mediator key pair name</em>}</li>
 *   <li>{@link pcs.AWSNetworkingHA#getCluster_floating_ip <em>Cluster floating ip</em>}</li>
 *   <li>{@link pcs.AWSNetworkingHA#getData_floating_ip <em>Data floating ip</em>}</li>
 *   <li>{@link pcs.AWSNetworkingHA#getData_floating_ip2 <em>Data floating ip2</em>}</li>
 *   <li>{@link pcs.AWSNetworkingHA#getSvm_floating_ip <em>Svm floating ip</em>}</li>
 * </ul>
 *
 * @see pcs.PcsPackage#getAWSNetworkingHA()
 * @model
 * @generated
 */
public interface AWSNetworkingHA extends AWSConfiguration {
	/**
	 * Returns the value of the '<em><b>Cvo ha</b></em>' reference list.
	 * The list contents are of type {@link pcs.CVO_HA}.
	 * It is bidirectional and its opposite is '{@link pcs.CVO_HA#getAwsnetworkingha <em>Awsnetworkingha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cvo ha</em>' reference list.
	 * @see pcs.PcsPackage#getAWSNetworkingHA_Cvo_ha()
	 * @see pcs.CVO_HA#getAwsnetworkingha
	 * @model opposite="awsnetworkingha"
	 * @generated
	 */
	EList<CVO_HA> getCvo_ha();

	/**
	 * Returns the value of the '<em><b>Node1 subnet id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node1 subnet id</em>' attribute.
	 * @see #setNode1_subnet_id(String)
	 * @see pcs.PcsPackage#getAWSNetworkingHA_Node1_subnet_id()
	 * @model
	 * @generated
	 */
	String getNode1_subnet_id();

	/**
	 * Sets the value of the '{@link pcs.AWSNetworkingHA#getNode1_subnet_id <em>Node1 subnet id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node1 subnet id</em>' attribute.
	 * @see #getNode1_subnet_id()
	 * @generated
	 */
	void setNode1_subnet_id(String value);

	/**
	 * Returns the value of the '<em><b>Node2 subnet id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node2 subnet id</em>' attribute.
	 * @see #setNode2_subnet_id(String)
	 * @see pcs.PcsPackage#getAWSNetworkingHA_Node2_subnet_id()
	 * @model
	 * @generated
	 */
	String getNode2_subnet_id();

	/**
	 * Sets the value of the '{@link pcs.AWSNetworkingHA#getNode2_subnet_id <em>Node2 subnet id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node2 subnet id</em>' attribute.
	 * @see #getNode2_subnet_id()
	 * @generated
	 */
	void setNode2_subnet_id(String value);

	/**
	 * Returns the value of the '<em><b>Failover mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failover mode</em>' attribute.
	 * @see #setFailover_mode(String)
	 * @see pcs.PcsPackage#getAWSNetworkingHA_Failover_mode()
	 * @model
	 * @generated
	 */
	String getFailover_mode();

	/**
	 * Sets the value of the '{@link pcs.AWSNetworkingHA#getFailover_mode <em>Failover mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failover mode</em>' attribute.
	 * @see #getFailover_mode()
	 * @generated
	 */
	void setFailover_mode(String value);

	/**
	 * Returns the value of the '<em><b>Mediator subnet id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediator subnet id</em>' attribute.
	 * @see #setMediator_subnet_id(String)
	 * @see pcs.PcsPackage#getAWSNetworkingHA_Mediator_subnet_id()
	 * @model
	 * @generated
	 */
	String getMediator_subnet_id();

	/**
	 * Sets the value of the '{@link pcs.AWSNetworkingHA#getMediator_subnet_id <em>Mediator subnet id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mediator subnet id</em>' attribute.
	 * @see #getMediator_subnet_id()
	 * @generated
	 */
	void setMediator_subnet_id(String value);

	/**
	 * Returns the value of the '<em><b>Mediator key pair name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mediator key pair name</em>' attribute.
	 * @see #setMediator_key_pair_name(String)
	 * @see pcs.PcsPackage#getAWSNetworkingHA_Mediator_key_pair_name()
	 * @model
	 * @generated
	 */
	String getMediator_key_pair_name();

	/**
	 * Sets the value of the '{@link pcs.AWSNetworkingHA#getMediator_key_pair_name <em>Mediator key pair name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mediator key pair name</em>' attribute.
	 * @see #getMediator_key_pair_name()
	 * @generated
	 */
	void setMediator_key_pair_name(String value);

	/**
	 * Returns the value of the '<em><b>Cluster floating ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster floating ip</em>' attribute.
	 * @see #setCluster_floating_ip(String)
	 * @see pcs.PcsPackage#getAWSNetworkingHA_Cluster_floating_ip()
	 * @model
	 * @generated
	 */
	String getCluster_floating_ip();

	/**
	 * Sets the value of the '{@link pcs.AWSNetworkingHA#getCluster_floating_ip <em>Cluster floating ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster floating ip</em>' attribute.
	 * @see #getCluster_floating_ip()
	 * @generated
	 */
	void setCluster_floating_ip(String value);

	/**
	 * Returns the value of the '<em><b>Data floating ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data floating ip</em>' attribute.
	 * @see #setData_floating_ip(String)
	 * @see pcs.PcsPackage#getAWSNetworkingHA_Data_floating_ip()
	 * @model
	 * @generated
	 */
	String getData_floating_ip();

	/**
	 * Sets the value of the '{@link pcs.AWSNetworkingHA#getData_floating_ip <em>Data floating ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data floating ip</em>' attribute.
	 * @see #getData_floating_ip()
	 * @generated
	 */
	void setData_floating_ip(String value);

	/**
	 * Returns the value of the '<em><b>Data floating ip2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data floating ip2</em>' attribute.
	 * @see #setData_floating_ip2(String)
	 * @see pcs.PcsPackage#getAWSNetworkingHA_Data_floating_ip2()
	 * @model
	 * @generated
	 */
	String getData_floating_ip2();

	/**
	 * Sets the value of the '{@link pcs.AWSNetworkingHA#getData_floating_ip2 <em>Data floating ip2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data floating ip2</em>' attribute.
	 * @see #getData_floating_ip2()
	 * @generated
	 */
	void setData_floating_ip2(String value);

	/**
	 * Returns the value of the '<em><b>Svm floating ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Svm floating ip</em>' attribute.
	 * @see #setSvm_floating_ip(String)
	 * @see pcs.PcsPackage#getAWSNetworkingHA_Svm_floating_ip()
	 * @model
	 * @generated
	 */
	String getSvm_floating_ip();

	/**
	 * Sets the value of the '{@link pcs.AWSNetworkingHA#getSvm_floating_ip <em>Svm floating ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Svm floating ip</em>' attribute.
	 * @see #getSvm_floating_ip()
	 * @generated
	 */
	void setSvm_floating_ip(String value);

} // AWSNetworkingHA
