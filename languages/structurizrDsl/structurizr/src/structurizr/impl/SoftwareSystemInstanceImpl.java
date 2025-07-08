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

import structurizr.DeploymentGroup;
import structurizr.HealthCheck;
import structurizr.SoftwareSystem;
import structurizr.SoftwareSystemInstance;
import structurizr.StructurizrPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software System Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structurizr.impl.SoftwareSystemInstanceImpl#getSoftwareSystem <em>Software System</em>}</li>
 *   <li>{@link structurizr.impl.SoftwareSystemInstanceImpl#getDeploymentGroups <em>Deployment Groups</em>}</li>
 *   <li>{@link structurizr.impl.SoftwareSystemInstanceImpl#getHealthCheck <em>Health Check</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftwareSystemInstanceImpl extends C4ElementImpl implements SoftwareSystemInstance {
	/**
	 * The cached value of the '{@link #getSoftwareSystem() <em>Software System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareSystem()
	 * @generated
	 * @ordered
	 */
	protected SoftwareSystem softwareSystem;

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
	protected SoftwareSystemInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurizrPackage.Literals.SOFTWARE_SYSTEM_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareSystem getSoftwareSystem() {
		if (softwareSystem != null && softwareSystem.eIsProxy()) {
			InternalEObject oldSoftwareSystem = (InternalEObject)softwareSystem;
			softwareSystem = (SoftwareSystem)eResolveProxy(oldSoftwareSystem);
			if (softwareSystem != oldSoftwareSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurizrPackage.SOFTWARE_SYSTEM_INSTANCE__SOFTWARE_SYSTEM, oldSoftwareSystem, softwareSystem));
			}
		}
		return softwareSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareSystem basicGetSoftwareSystem() {
		return softwareSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareSystem(SoftwareSystem newSoftwareSystem) {
		SoftwareSystem oldSoftwareSystem = softwareSystem;
		softwareSystem = newSoftwareSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.SOFTWARE_SYSTEM_INSTANCE__SOFTWARE_SYSTEM, oldSoftwareSystem, softwareSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeploymentGroup> getDeploymentGroups() {
		if (deploymentGroups == null) {
			deploymentGroups = new EObjectResolvingEList<DeploymentGroup>(DeploymentGroup.class, this, StructurizrPackage.SOFTWARE_SYSTEM_INSTANCE__DEPLOYMENT_GROUPS);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurizrPackage.SOFTWARE_SYSTEM_INSTANCE__HEALTH_CHECK, oldHealthCheck, newHealthCheck);
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
				msgs = ((InternalEObject)healthCheck).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurizrPackage.SOFTWARE_SYSTEM_INSTANCE__HEALTH_CHECK, null, msgs);
			if (newHealthCheck != null)
				msgs = ((InternalEObject)newHealthCheck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurizrPackage.SOFTWARE_SYSTEM_INSTANCE__HEALTH_CHECK, null, msgs);
			msgs = basicSetHealthCheck(newHealthCheck, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.SOFTWARE_SYSTEM_INSTANCE__HEALTH_CHECK, newHealthCheck, newHealthCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurizrPackage.SOFTWARE_SYSTEM_INSTANCE__HEALTH_CHECK:
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
			case StructurizrPackage.SOFTWARE_SYSTEM_INSTANCE__SOFTWARE_SYSTEM:
				if (resolve) return getSoftwareSystem();
				return basicGetSoftwareSystem();
			case StructurizrPackage.SOFTWARE_SYSTEM_INSTANCE__DEPLOYMENT_GROUPS:
				return getDeploymentGroups();
			case StructurizrPackage.SOFTWARE_SYSTEM_INSTANCE__HEALTH_CHECK:
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
			case StructurizrPackage.SOFTWARE_SYSTEM_INSTANCE__SOFTWARE_SYSTEM:
				setSoftwareSystem((SoftwareSystem)newValue);
				return;
			case StructurizrPackage.SOFTWARE_SYSTEM_INSTANCE__DEPLOYMENT_GROUPS:
				getDeploymentGroups().clear();
				getDeploymentGroups().addAll((Collection<? extends DeploymentGroup>)newValue);
				return;
			case StructurizrPackage.SOFTWARE_SYSTEM_INSTANCE__HEALTH_CHECK:
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
			case StructurizrPackage.SOFTWARE_SYSTEM_INSTANCE__SOFTWARE_SYSTEM:
				setSoftwareSystem((SoftwareSystem)null);
				return;
			case StructurizrPackage.SOFTWARE_SYSTEM_INSTANCE__DEPLOYMENT_GROUPS:
				getDeploymentGroups().clear();
				return;
			case StructurizrPackage.SOFTWARE_SYSTEM_INSTANCE__HEALTH_CHECK:
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
			case StructurizrPackage.SOFTWARE_SYSTEM_INSTANCE__SOFTWARE_SYSTEM:
				return softwareSystem != null;
			case StructurizrPackage.SOFTWARE_SYSTEM_INSTANCE__DEPLOYMENT_GROUPS:
				return deploymentGroups != null && !deploymentGroups.isEmpty();
			case StructurizrPackage.SOFTWARE_SYSTEM_INSTANCE__HEALTH_CHECK:
				return healthCheck != null;
		}
		return super.eIsSet(featureID);
	}

} //SoftwareSystemInstanceImpl
