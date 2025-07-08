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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import structurizr.ContainerInstance;
import structurizr.DeploymentGroup;
import structurizr.HealthCheck;
import structurizr.StructurizrPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structurizr.impl.ContainerInstanceImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link structurizr.impl.ContainerInstanceImpl#getDeploymentGroups <em>Deployment Groups</em>}</li>
 *   <li>{@link structurizr.impl.ContainerInstanceImpl#getHealthCheck <em>Health Check</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerInstanceImpl extends C4ElementImpl implements ContainerInstance {
	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected structurizr.Container container;

	/**
	 * The cached value of the '{@link #getDeploymentGroups() <em>Deployment Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<DeploymentGroup> deploymentGroups;

	/**
	 * The cached value of the '{@link #getHealthCheck() <em>Health Check</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthCheck()
	 * @generated
	 * @ordered
	 */
	protected HealthCheck healthCheck;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurizrPackage.Literals.CONTAINER_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public structurizr.Container getContainer() {
		if (container != null && container.eIsProxy()) {
			InternalEObject oldContainer = (InternalEObject)container;
			container = (structurizr.Container)eResolveProxy(oldContainer);
			if (container != oldContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurizrPackage.CONTAINER_INSTANCE__CONTAINER, oldContainer, container));
			}
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public structurizr.Container basicGetContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(structurizr.Container newContainer) {
		structurizr.Container oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.CONTAINER_INSTANCE__CONTAINER, oldContainer, container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeploymentGroup> getDeploymentGroups() {
		if (deploymentGroups == null) {
			deploymentGroups = new EObjectResolvingEList<DeploymentGroup>(DeploymentGroup.class, this, StructurizrPackage.CONTAINER_INSTANCE__DEPLOYMENT_GROUPS);
		}
		return deploymentGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthCheck getHealthCheck() {
		return healthCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHealthCheck(HealthCheck newHealthCheck, NotificationChain msgs) {
		HealthCheck oldHealthCheck = healthCheck;
		healthCheck = newHealthCheck;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurizrPackage.CONTAINER_INSTANCE__HEALTH_CHECK, oldHealthCheck, newHealthCheck);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHealthCheck(HealthCheck newHealthCheck) {
		if (newHealthCheck != healthCheck) {
			NotificationChain msgs = null;
			if (healthCheck != null)
				msgs = ((InternalEObject)healthCheck).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurizrPackage.CONTAINER_INSTANCE__HEALTH_CHECK, null, msgs);
			if (newHealthCheck != null)
				msgs = ((InternalEObject)newHealthCheck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurizrPackage.CONTAINER_INSTANCE__HEALTH_CHECK, null, msgs);
			msgs = basicSetHealthCheck(newHealthCheck, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.CONTAINER_INSTANCE__HEALTH_CHECK, newHealthCheck, newHealthCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurizrPackage.CONTAINER_INSTANCE__HEALTH_CHECK:
				return basicSetHealthCheck(null, msgs);
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
			case StructurizrPackage.CONTAINER_INSTANCE__CONTAINER:
				if (resolve) return getContainer();
				return basicGetContainer();
			case StructurizrPackage.CONTAINER_INSTANCE__DEPLOYMENT_GROUPS:
				return getDeploymentGroups();
			case StructurizrPackage.CONTAINER_INSTANCE__HEALTH_CHECK:
				return getHealthCheck();
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
			case StructurizrPackage.CONTAINER_INSTANCE__CONTAINER:
				setContainer((structurizr.Container)newValue);
				return;
			case StructurizrPackage.CONTAINER_INSTANCE__DEPLOYMENT_GROUPS:
				getDeploymentGroups().clear();
				getDeploymentGroups().addAll((Collection<? extends DeploymentGroup>)newValue);
				return;
			case StructurizrPackage.CONTAINER_INSTANCE__HEALTH_CHECK:
				setHealthCheck((HealthCheck)newValue);
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
			case StructurizrPackage.CONTAINER_INSTANCE__CONTAINER:
				setContainer((structurizr.Container)null);
				return;
			case StructurizrPackage.CONTAINER_INSTANCE__DEPLOYMENT_GROUPS:
				getDeploymentGroups().clear();
				return;
			case StructurizrPackage.CONTAINER_INSTANCE__HEALTH_CHECK:
				setHealthCheck((HealthCheck)null);
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
			case StructurizrPackage.CONTAINER_INSTANCE__CONTAINER:
				return container != null;
			case StructurizrPackage.CONTAINER_INSTANCE__DEPLOYMENT_GROUPS:
				return deploymentGroups != null && !deploymentGroups.isEmpty();
			case StructurizrPackage.CONTAINER_INSTANCE__HEALTH_CHECK:
				return healthCheck != null;
		}
		return super.eIsSet(featureID);
	}

} //ContainerInstanceImpl
