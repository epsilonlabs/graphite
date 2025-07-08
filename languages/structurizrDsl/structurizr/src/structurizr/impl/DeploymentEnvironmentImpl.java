/**
 */
package structurizr.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import structurizr.DeploymentEnvironment;
import structurizr.DeploymentGroup;
import structurizr.DeploymentNode;
import structurizr.StructurizrPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Environment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structurizr.impl.DeploymentEnvironmentImpl#getDeploymentGroups <em>Deployment Groups</em>}</li>
 *   <li>{@link structurizr.impl.DeploymentEnvironmentImpl#getDeploymentNodes <em>Deployment Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentEnvironmentImpl extends IdentifiableElementImpl implements DeploymentEnvironment {
	/**
	 * The cached value of the '{@link #getDeploymentGroups() <em>Deployment Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<DeploymentGroup> deploymentGroups;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentEnvironmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurizrPackage.Literals.DEPLOYMENT_ENVIRONMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeploymentGroup> getDeploymentGroups() {
		if (deploymentGroups == null) {
			deploymentGroups = new EObjectContainmentEList<DeploymentGroup>(DeploymentGroup.class, this, StructurizrPackage.DEPLOYMENT_ENVIRONMENT__DEPLOYMENT_GROUPS);
		}
		return deploymentGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeploymentNode> getDeploymentNodes() {
		if (deploymentNodes == null) {
			deploymentNodes = new EObjectContainmentEList<DeploymentNode>(DeploymentNode.class, this, StructurizrPackage.DEPLOYMENT_ENVIRONMENT__DEPLOYMENT_NODES);
		}
		return deploymentNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurizrPackage.DEPLOYMENT_ENVIRONMENT__DEPLOYMENT_GROUPS:
				return ((InternalEList<?>)getDeploymentGroups()).basicRemove(otherEnd, msgs);
			case StructurizrPackage.DEPLOYMENT_ENVIRONMENT__DEPLOYMENT_NODES:
				return ((InternalEList<?>)getDeploymentNodes()).basicRemove(otherEnd, msgs);
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
			case StructurizrPackage.DEPLOYMENT_ENVIRONMENT__DEPLOYMENT_GROUPS:
				return getDeploymentGroups();
			case StructurizrPackage.DEPLOYMENT_ENVIRONMENT__DEPLOYMENT_NODES:
				return getDeploymentNodes();
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
			case StructurizrPackage.DEPLOYMENT_ENVIRONMENT__DEPLOYMENT_GROUPS:
				getDeploymentGroups().clear();
				getDeploymentGroups().addAll((Collection<? extends DeploymentGroup>)newValue);
				return;
			case StructurizrPackage.DEPLOYMENT_ENVIRONMENT__DEPLOYMENT_NODES:
				getDeploymentNodes().clear();
				getDeploymentNodes().addAll((Collection<? extends DeploymentNode>)newValue);
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
			case StructurizrPackage.DEPLOYMENT_ENVIRONMENT__DEPLOYMENT_GROUPS:
				getDeploymentGroups().clear();
				return;
			case StructurizrPackage.DEPLOYMENT_ENVIRONMENT__DEPLOYMENT_NODES:
				getDeploymentNodes().clear();
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
			case StructurizrPackage.DEPLOYMENT_ENVIRONMENT__DEPLOYMENT_GROUPS:
				return deploymentGroups != null && !deploymentGroups.isEmpty();
			case StructurizrPackage.DEPLOYMENT_ENVIRONMENT__DEPLOYMENT_NODES:
				return deploymentNodes != null && !deploymentNodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeploymentEnvironmentImpl
