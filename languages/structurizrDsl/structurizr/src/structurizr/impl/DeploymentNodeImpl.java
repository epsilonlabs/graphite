/**
 */
package structurizr.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import structurizr.ContainerInstance;
import structurizr.DeploymentNode;
import structurizr.InfrastructureNode;
import structurizr.SoftwareSystemInstance;
import structurizr.StructurizrPackage;
import structurizr.Technology;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structurizr.impl.DeploymentNodeImpl#getTechnology <em>Technology</em>}</li>
 *   <li>{@link structurizr.impl.DeploymentNodeImpl#getDeploymentNodes <em>Deployment Nodes</em>}</li>
 *   <li>{@link structurizr.impl.DeploymentNodeImpl#getInfrastructureNodes <em>Infrastructure Nodes</em>}</li>
 *   <li>{@link structurizr.impl.DeploymentNodeImpl#getSoftwareSystemInstances <em>Software System Instances</em>}</li>
 *   <li>{@link structurizr.impl.DeploymentNodeImpl#getContainerInstances <em>Container Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentNodeImpl extends C4ElementImpl implements DeploymentNode {
	/**
	 * The cached value of the '{@link #getTechnology() <em>Technology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected Technology technology;

	/**
	 * The cached value of the '{@link #getDeploymentNodes() <em>Deployment Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<DeploymentNode> deploymentNodes;

	/**
	 * The cached value of the '{@link #getInfrastructureNodes() <em>Infrastructure Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfrastructureNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<InfrastructureNode> infrastructureNodes;

	/**
	 * The cached value of the '{@link #getSoftwareSystemInstances() <em>Software System Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareSystemInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<SoftwareSystemInstance> softwareSystemInstances;

	/**
	 * The cached value of the '{@link #getContainerInstances() <em>Container Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerInstance> containerInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurizrPackage.Literals.DEPLOYMENT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Technology getTechnology() {
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTechnology(Technology newTechnology, NotificationChain msgs) {
		Technology oldTechnology = technology;
		technology = newTechnology;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurizrPackage.DEPLOYMENT_NODE__TECHNOLOGY, oldTechnology, newTechnology);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnology(Technology newTechnology) {
		if (newTechnology != technology) {
			NotificationChain msgs = null;
			if (technology != null)
				msgs = ((InternalEObject)technology).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurizrPackage.DEPLOYMENT_NODE__TECHNOLOGY, null, msgs);
			if (newTechnology != null)
				msgs = ((InternalEObject)newTechnology).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurizrPackage.DEPLOYMENT_NODE__TECHNOLOGY, null, msgs);
			msgs = basicSetTechnology(newTechnology, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.DEPLOYMENT_NODE__TECHNOLOGY, newTechnology, newTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeploymentNode> getDeploymentNodes() {
		if (deploymentNodes == null) {
			deploymentNodes = new EObjectContainmentEList<DeploymentNode>(DeploymentNode.class, this, StructurizrPackage.DEPLOYMENT_NODE__DEPLOYMENT_NODES);
		}
		return deploymentNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InfrastructureNode> getInfrastructureNodes() {
		if (infrastructureNodes == null) {
			infrastructureNodes = new EObjectContainmentEList<InfrastructureNode>(InfrastructureNode.class, this, StructurizrPackage.DEPLOYMENT_NODE__INFRASTRUCTURE_NODES);
		}
		return infrastructureNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoftwareSystemInstance> getSoftwareSystemInstances() {
		if (softwareSystemInstances == null) {
			softwareSystemInstances = new EObjectContainmentEList<SoftwareSystemInstance>(SoftwareSystemInstance.class, this, StructurizrPackage.DEPLOYMENT_NODE__SOFTWARE_SYSTEM_INSTANCES);
		}
		return softwareSystemInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainerInstance> getContainerInstances() {
		if (containerInstances == null) {
			containerInstances = new EObjectContainmentEList<ContainerInstance>(ContainerInstance.class, this, StructurizrPackage.DEPLOYMENT_NODE__CONTAINER_INSTANCES);
		}
		return containerInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurizrPackage.DEPLOYMENT_NODE__TECHNOLOGY:
				return basicSetTechnology(null, msgs);
			case StructurizrPackage.DEPLOYMENT_NODE__DEPLOYMENT_NODES:
				return ((InternalEList<?>)getDeploymentNodes()).basicRemove(otherEnd, msgs);
			case StructurizrPackage.DEPLOYMENT_NODE__INFRASTRUCTURE_NODES:
				return ((InternalEList<?>)getInfrastructureNodes()).basicRemove(otherEnd, msgs);
			case StructurizrPackage.DEPLOYMENT_NODE__SOFTWARE_SYSTEM_INSTANCES:
				return ((InternalEList<?>)getSoftwareSystemInstances()).basicRemove(otherEnd, msgs);
			case StructurizrPackage.DEPLOYMENT_NODE__CONTAINER_INSTANCES:
				return ((InternalEList<?>)getContainerInstances()).basicRemove(otherEnd, msgs);
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
			case StructurizrPackage.DEPLOYMENT_NODE__TECHNOLOGY:
				return getTechnology();
			case StructurizrPackage.DEPLOYMENT_NODE__DEPLOYMENT_NODES:
				return getDeploymentNodes();
			case StructurizrPackage.DEPLOYMENT_NODE__INFRASTRUCTURE_NODES:
				return getInfrastructureNodes();
			case StructurizrPackage.DEPLOYMENT_NODE__SOFTWARE_SYSTEM_INSTANCES:
				return getSoftwareSystemInstances();
			case StructurizrPackage.DEPLOYMENT_NODE__CONTAINER_INSTANCES:
				return getContainerInstances();
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
			case StructurizrPackage.DEPLOYMENT_NODE__TECHNOLOGY:
				setTechnology((Technology)newValue);
				return;
			case StructurizrPackage.DEPLOYMENT_NODE__DEPLOYMENT_NODES:
				getDeploymentNodes().clear();
				getDeploymentNodes().addAll((Collection<? extends DeploymentNode>)newValue);
				return;
			case StructurizrPackage.DEPLOYMENT_NODE__INFRASTRUCTURE_NODES:
				getInfrastructureNodes().clear();
				getInfrastructureNodes().addAll((Collection<? extends InfrastructureNode>)newValue);
				return;
			case StructurizrPackage.DEPLOYMENT_NODE__SOFTWARE_SYSTEM_INSTANCES:
				getSoftwareSystemInstances().clear();
				getSoftwareSystemInstances().addAll((Collection<? extends SoftwareSystemInstance>)newValue);
				return;
			case StructurizrPackage.DEPLOYMENT_NODE__CONTAINER_INSTANCES:
				getContainerInstances().clear();
				getContainerInstances().addAll((Collection<? extends ContainerInstance>)newValue);
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
			case StructurizrPackage.DEPLOYMENT_NODE__TECHNOLOGY:
				setTechnology((Technology)null);
				return;
			case StructurizrPackage.DEPLOYMENT_NODE__DEPLOYMENT_NODES:
				getDeploymentNodes().clear();
				return;
			case StructurizrPackage.DEPLOYMENT_NODE__INFRASTRUCTURE_NODES:
				getInfrastructureNodes().clear();
				return;
			case StructurizrPackage.DEPLOYMENT_NODE__SOFTWARE_SYSTEM_INSTANCES:
				getSoftwareSystemInstances().clear();
				return;
			case StructurizrPackage.DEPLOYMENT_NODE__CONTAINER_INSTANCES:
				getContainerInstances().clear();
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
			case StructurizrPackage.DEPLOYMENT_NODE__TECHNOLOGY:
				return technology != null;
			case StructurizrPackage.DEPLOYMENT_NODE__DEPLOYMENT_NODES:
				return deploymentNodes != null && !deploymentNodes.isEmpty();
			case StructurizrPackage.DEPLOYMENT_NODE__INFRASTRUCTURE_NODES:
				return infrastructureNodes != null && !infrastructureNodes.isEmpty();
			case StructurizrPackage.DEPLOYMENT_NODE__SOFTWARE_SYSTEM_INSTANCES:
				return softwareSystemInstances != null && !softwareSystemInstances.isEmpty();
			case StructurizrPackage.DEPLOYMENT_NODE__CONTAINER_INSTANCES:
				return containerInstances != null && !containerInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeploymentNodeImpl
