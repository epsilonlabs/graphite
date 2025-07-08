/**
 */
package pcs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pcs.AWSNetworkingHA;
import pcs.CVO_HA;
import pcs.PcsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AWS Networking HA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcs.impl.AWSNetworkingHAImpl#getCvo_ha <em>Cvo ha</em>}</li>
 *   <li>{@link pcs.impl.AWSNetworkingHAImpl#getNode1_subnet_id <em>Node1 subnet id</em>}</li>
 *   <li>{@link pcs.impl.AWSNetworkingHAImpl#getNode2_subnet_id <em>Node2 subnet id</em>}</li>
 *   <li>{@link pcs.impl.AWSNetworkingHAImpl#getFailover_mode <em>Failover mode</em>}</li>
 *   <li>{@link pcs.impl.AWSNetworkingHAImpl#getMediator_subnet_id <em>Mediator subnet id</em>}</li>
 *   <li>{@link pcs.impl.AWSNetworkingHAImpl#getMediator_key_pair_name <em>Mediator key pair name</em>}</li>
 *   <li>{@link pcs.impl.AWSNetworkingHAImpl#getCluster_floating_ip <em>Cluster floating ip</em>}</li>
 *   <li>{@link pcs.impl.AWSNetworkingHAImpl#getData_floating_ip <em>Data floating ip</em>}</li>
 *   <li>{@link pcs.impl.AWSNetworkingHAImpl#getData_floating_ip2 <em>Data floating ip2</em>}</li>
 *   <li>{@link pcs.impl.AWSNetworkingHAImpl#getSvm_floating_ip <em>Svm floating ip</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AWSNetworkingHAImpl extends AWSConfigurationImpl implements AWSNetworkingHA {
	/**
	 * The cached value of the '{@link #getCvo_ha() <em>Cvo ha</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCvo_ha()
	 * @generated
	 * @ordered
	 */
	protected EList<CVO_HA> cvo_ha;

	/**
	 * The default value of the '{@link #getNode1_subnet_id() <em>Node1 subnet id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode1_subnet_id()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE1_SUBNET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNode1_subnet_id() <em>Node1 subnet id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode1_subnet_id()
	 * @generated
	 * @ordered
	 */
	protected String node1_subnet_id = NODE1_SUBNET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNode2_subnet_id() <em>Node2 subnet id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode2_subnet_id()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE2_SUBNET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNode2_subnet_id() <em>Node2 subnet id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode2_subnet_id()
	 * @generated
	 * @ordered
	 */
	protected String node2_subnet_id = NODE2_SUBNET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailover_mode() <em>Failover mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailover_mode()
	 * @generated
	 * @ordered
	 */
	protected static final String FAILOVER_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFailover_mode() <em>Failover mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailover_mode()
	 * @generated
	 * @ordered
	 */
	protected String failover_mode = FAILOVER_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediator_subnet_id() <em>Mediator subnet id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediator_subnet_id()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIATOR_SUBNET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMediator_subnet_id() <em>Mediator subnet id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediator_subnet_id()
	 * @generated
	 * @ordered
	 */
	protected String mediator_subnet_id = MEDIATOR_SUBNET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMediator_key_pair_name() <em>Mediator key pair name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediator_key_pair_name()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDIATOR_KEY_PAIR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMediator_key_pair_name() <em>Mediator key pair name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMediator_key_pair_name()
	 * @generated
	 * @ordered
	 */
	protected String mediator_key_pair_name = MEDIATOR_KEY_PAIR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCluster_floating_ip() <em>Cluster floating ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCluster_floating_ip()
	 * @generated
	 * @ordered
	 */
	protected static final String CLUSTER_FLOATING_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCluster_floating_ip() <em>Cluster floating ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCluster_floating_ip()
	 * @generated
	 * @ordered
	 */
	protected String cluster_floating_ip = CLUSTER_FLOATING_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getData_floating_ip() <em>Data floating ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_floating_ip()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_FLOATING_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData_floating_ip() <em>Data floating ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_floating_ip()
	 * @generated
	 * @ordered
	 */
	protected String data_floating_ip = DATA_FLOATING_IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getData_floating_ip2() <em>Data floating ip2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_floating_ip2()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_FLOATING_IP2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData_floating_ip2() <em>Data floating ip2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData_floating_ip2()
	 * @generated
	 * @ordered
	 */
	protected String data_floating_ip2 = DATA_FLOATING_IP2_EDEFAULT;

	/**
	 * The default value of the '{@link #getSvm_floating_ip() <em>Svm floating ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvm_floating_ip()
	 * @generated
	 * @ordered
	 */
	protected static final String SVM_FLOATING_IP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSvm_floating_ip() <em>Svm floating ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvm_floating_ip()
	 * @generated
	 * @ordered
	 */
	protected String svm_floating_ip = SVM_FLOATING_IP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AWSNetworkingHAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcsPackage.Literals.AWS_NETWORKING_HA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CVO_HA> getCvo_ha() {
		if (cvo_ha == null) {
			cvo_ha = new EObjectWithInverseResolvingEList<CVO_HA>(CVO_HA.class, this, PcsPackage.AWS_NETWORKING_HA__CVO_HA, PcsPackage.CVO_HA__AWSNETWORKINGHA);
		}
		return cvo_ha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNode1_subnet_id() {
		return node1_subnet_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode1_subnet_id(String newNode1_subnet_id) {
		String oldNode1_subnet_id = node1_subnet_id;
		node1_subnet_id = newNode1_subnet_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.AWS_NETWORKING_HA__NODE1_SUBNET_ID, oldNode1_subnet_id, node1_subnet_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNode2_subnet_id() {
		return node2_subnet_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode2_subnet_id(String newNode2_subnet_id) {
		String oldNode2_subnet_id = node2_subnet_id;
		node2_subnet_id = newNode2_subnet_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.AWS_NETWORKING_HA__NODE2_SUBNET_ID, oldNode2_subnet_id, node2_subnet_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFailover_mode() {
		return failover_mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailover_mode(String newFailover_mode) {
		String oldFailover_mode = failover_mode;
		failover_mode = newFailover_mode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.AWS_NETWORKING_HA__FAILOVER_MODE, oldFailover_mode, failover_mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMediator_subnet_id() {
		return mediator_subnet_id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediator_subnet_id(String newMediator_subnet_id) {
		String oldMediator_subnet_id = mediator_subnet_id;
		mediator_subnet_id = newMediator_subnet_id;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.AWS_NETWORKING_HA__MEDIATOR_SUBNET_ID, oldMediator_subnet_id, mediator_subnet_id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMediator_key_pair_name() {
		return mediator_key_pair_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMediator_key_pair_name(String newMediator_key_pair_name) {
		String oldMediator_key_pair_name = mediator_key_pair_name;
		mediator_key_pair_name = newMediator_key_pair_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.AWS_NETWORKING_HA__MEDIATOR_KEY_PAIR_NAME, oldMediator_key_pair_name, mediator_key_pair_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCluster_floating_ip() {
		return cluster_floating_ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCluster_floating_ip(String newCluster_floating_ip) {
		String oldCluster_floating_ip = cluster_floating_ip;
		cluster_floating_ip = newCluster_floating_ip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.AWS_NETWORKING_HA__CLUSTER_FLOATING_IP, oldCluster_floating_ip, cluster_floating_ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getData_floating_ip() {
		return data_floating_ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData_floating_ip(String newData_floating_ip) {
		String oldData_floating_ip = data_floating_ip;
		data_floating_ip = newData_floating_ip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.AWS_NETWORKING_HA__DATA_FLOATING_IP, oldData_floating_ip, data_floating_ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getData_floating_ip2() {
		return data_floating_ip2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData_floating_ip2(String newData_floating_ip2) {
		String oldData_floating_ip2 = data_floating_ip2;
		data_floating_ip2 = newData_floating_ip2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.AWS_NETWORKING_HA__DATA_FLOATING_IP2, oldData_floating_ip2, data_floating_ip2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSvm_floating_ip() {
		return svm_floating_ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSvm_floating_ip(String newSvm_floating_ip) {
		String oldSvm_floating_ip = svm_floating_ip;
		svm_floating_ip = newSvm_floating_ip;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.AWS_NETWORKING_HA__SVM_FLOATING_IP, oldSvm_floating_ip, svm_floating_ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcsPackage.AWS_NETWORKING_HA__CVO_HA:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCvo_ha()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcsPackage.AWS_NETWORKING_HA__CVO_HA:
				return ((InternalEList<?>)getCvo_ha()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcsPackage.AWS_NETWORKING_HA__CVO_HA:
				return getCvo_ha();
			case PcsPackage.AWS_NETWORKING_HA__NODE1_SUBNET_ID:
				return getNode1_subnet_id();
			case PcsPackage.AWS_NETWORKING_HA__NODE2_SUBNET_ID:
				return getNode2_subnet_id();
			case PcsPackage.AWS_NETWORKING_HA__FAILOVER_MODE:
				return getFailover_mode();
			case PcsPackage.AWS_NETWORKING_HA__MEDIATOR_SUBNET_ID:
				return getMediator_subnet_id();
			case PcsPackage.AWS_NETWORKING_HA__MEDIATOR_KEY_PAIR_NAME:
				return getMediator_key_pair_name();
			case PcsPackage.AWS_NETWORKING_HA__CLUSTER_FLOATING_IP:
				return getCluster_floating_ip();
			case PcsPackage.AWS_NETWORKING_HA__DATA_FLOATING_IP:
				return getData_floating_ip();
			case PcsPackage.AWS_NETWORKING_HA__DATA_FLOATING_IP2:
				return getData_floating_ip2();
			case PcsPackage.AWS_NETWORKING_HA__SVM_FLOATING_IP:
				return getSvm_floating_ip();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PcsPackage.AWS_NETWORKING_HA__CVO_HA:
				getCvo_ha().clear();
				getCvo_ha().addAll((Collection<? extends CVO_HA>)newValue);
				return;
			case PcsPackage.AWS_NETWORKING_HA__NODE1_SUBNET_ID:
				setNode1_subnet_id((String)newValue);
				return;
			case PcsPackage.AWS_NETWORKING_HA__NODE2_SUBNET_ID:
				setNode2_subnet_id((String)newValue);
				return;
			case PcsPackage.AWS_NETWORKING_HA__FAILOVER_MODE:
				setFailover_mode((String)newValue);
				return;
			case PcsPackage.AWS_NETWORKING_HA__MEDIATOR_SUBNET_ID:
				setMediator_subnet_id((String)newValue);
				return;
			case PcsPackage.AWS_NETWORKING_HA__MEDIATOR_KEY_PAIR_NAME:
				setMediator_key_pair_name((String)newValue);
				return;
			case PcsPackage.AWS_NETWORKING_HA__CLUSTER_FLOATING_IP:
				setCluster_floating_ip((String)newValue);
				return;
			case PcsPackage.AWS_NETWORKING_HA__DATA_FLOATING_IP:
				setData_floating_ip((String)newValue);
				return;
			case PcsPackage.AWS_NETWORKING_HA__DATA_FLOATING_IP2:
				setData_floating_ip2((String)newValue);
				return;
			case PcsPackage.AWS_NETWORKING_HA__SVM_FLOATING_IP:
				setSvm_floating_ip((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PcsPackage.AWS_NETWORKING_HA__CVO_HA:
				getCvo_ha().clear();
				return;
			case PcsPackage.AWS_NETWORKING_HA__NODE1_SUBNET_ID:
				setNode1_subnet_id(NODE1_SUBNET_ID_EDEFAULT);
				return;
			case PcsPackage.AWS_NETWORKING_HA__NODE2_SUBNET_ID:
				setNode2_subnet_id(NODE2_SUBNET_ID_EDEFAULT);
				return;
			case PcsPackage.AWS_NETWORKING_HA__FAILOVER_MODE:
				setFailover_mode(FAILOVER_MODE_EDEFAULT);
				return;
			case PcsPackage.AWS_NETWORKING_HA__MEDIATOR_SUBNET_ID:
				setMediator_subnet_id(MEDIATOR_SUBNET_ID_EDEFAULT);
				return;
			case PcsPackage.AWS_NETWORKING_HA__MEDIATOR_KEY_PAIR_NAME:
				setMediator_key_pair_name(MEDIATOR_KEY_PAIR_NAME_EDEFAULT);
				return;
			case PcsPackage.AWS_NETWORKING_HA__CLUSTER_FLOATING_IP:
				setCluster_floating_ip(CLUSTER_FLOATING_IP_EDEFAULT);
				return;
			case PcsPackage.AWS_NETWORKING_HA__DATA_FLOATING_IP:
				setData_floating_ip(DATA_FLOATING_IP_EDEFAULT);
				return;
			case PcsPackage.AWS_NETWORKING_HA__DATA_FLOATING_IP2:
				setData_floating_ip2(DATA_FLOATING_IP2_EDEFAULT);
				return;
			case PcsPackage.AWS_NETWORKING_HA__SVM_FLOATING_IP:
				setSvm_floating_ip(SVM_FLOATING_IP_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PcsPackage.AWS_NETWORKING_HA__CVO_HA:
				return cvo_ha != null && !cvo_ha.isEmpty();
			case PcsPackage.AWS_NETWORKING_HA__NODE1_SUBNET_ID:
				return NODE1_SUBNET_ID_EDEFAULT == null ? node1_subnet_id != null : !NODE1_SUBNET_ID_EDEFAULT.equals(node1_subnet_id);
			case PcsPackage.AWS_NETWORKING_HA__NODE2_SUBNET_ID:
				return NODE2_SUBNET_ID_EDEFAULT == null ? node2_subnet_id != null : !NODE2_SUBNET_ID_EDEFAULT.equals(node2_subnet_id);
			case PcsPackage.AWS_NETWORKING_HA__FAILOVER_MODE:
				return FAILOVER_MODE_EDEFAULT == null ? failover_mode != null : !FAILOVER_MODE_EDEFAULT.equals(failover_mode);
			case PcsPackage.AWS_NETWORKING_HA__MEDIATOR_SUBNET_ID:
				return MEDIATOR_SUBNET_ID_EDEFAULT == null ? mediator_subnet_id != null : !MEDIATOR_SUBNET_ID_EDEFAULT.equals(mediator_subnet_id);
			case PcsPackage.AWS_NETWORKING_HA__MEDIATOR_KEY_PAIR_NAME:
				return MEDIATOR_KEY_PAIR_NAME_EDEFAULT == null ? mediator_key_pair_name != null : !MEDIATOR_KEY_PAIR_NAME_EDEFAULT.equals(mediator_key_pair_name);
			case PcsPackage.AWS_NETWORKING_HA__CLUSTER_FLOATING_IP:
				return CLUSTER_FLOATING_IP_EDEFAULT == null ? cluster_floating_ip != null : !CLUSTER_FLOATING_IP_EDEFAULT.equals(cluster_floating_ip);
			case PcsPackage.AWS_NETWORKING_HA__DATA_FLOATING_IP:
				return DATA_FLOATING_IP_EDEFAULT == null ? data_floating_ip != null : !DATA_FLOATING_IP_EDEFAULT.equals(data_floating_ip);
			case PcsPackage.AWS_NETWORKING_HA__DATA_FLOATING_IP2:
				return DATA_FLOATING_IP2_EDEFAULT == null ? data_floating_ip2 != null : !DATA_FLOATING_IP2_EDEFAULT.equals(data_floating_ip2);
			case PcsPackage.AWS_NETWORKING_HA__SVM_FLOATING_IP:
				return SVM_FLOATING_IP_EDEFAULT == null ? svm_floating_ip != null : !SVM_FLOATING_IP_EDEFAULT.equals(svm_floating_ip);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (node1_subnet_id: ");
		result.append(node1_subnet_id);
		result.append(", node2_subnet_id: ");
		result.append(node2_subnet_id);
		result.append(", failover_mode: ");
		result.append(failover_mode);
		result.append(", mediator_subnet_id: ");
		result.append(mediator_subnet_id);
		result.append(", mediator_key_pair_name: ");
		result.append(mediator_key_pair_name);
		result.append(", cluster_floating_ip: ");
		result.append(cluster_floating_ip);
		result.append(", data_floating_ip: ");
		result.append(data_floating_ip);
		result.append(", data_floating_ip2: ");
		result.append(data_floating_ip2);
		result.append(", svm_floating_ip: ");
		result.append(svm_floating_ip);
		result.append(')');
		return result.toString();
	}

} //AWSNetworkingHAImpl
