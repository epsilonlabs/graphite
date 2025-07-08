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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pcs.AWSConfiguration;
import pcs.Deployment;
import pcs.Environment;
import pcs.PCS;
import pcs.PcsPackage;
import pcs.SnapshotPolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcs.impl.DeploymentImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link pcs.impl.DeploymentImpl#getSnapshotPolicy <em>Snapshot Policy</em>}</li>
 *   <li>{@link pcs.impl.DeploymentImpl#getPcs <em>Pcs</em>}</li>
 *   <li>{@link pcs.impl.DeploymentImpl#getAwsconfiguration <em>Awsconfiguration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentImpl extends NamedElementImpl implements Deployment {
	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected Environment environment;

	/**
	 * The cached value of the '{@link #getSnapshotPolicy() <em>Snapshot Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnapshotPolicy()
	 * @generated
	 * @ordered
	 */
	protected SnapshotPolicy snapshotPolicy;

	/**
	 * The cached value of the '{@link #getPcs() <em>Pcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcs()
	 * @generated
	 * @ordered
	 */
	protected EList<PCS> pcs;

	/**
	 * The cached value of the '{@link #getAwsconfiguration() <em>Awsconfiguration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAwsconfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<AWSConfiguration> awsconfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcsPackage.Literals.DEPLOYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironment(Environment newEnvironment, NotificationChain msgs) {
		Environment oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PcsPackage.DEPLOYMENT__ENVIRONMENT, oldEnvironment, newEnvironment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(Environment newEnvironment) {
		if (newEnvironment != environment) {
			NotificationChain msgs = null;
			if (environment != null)
				msgs = ((InternalEObject)environment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PcsPackage.DEPLOYMENT__ENVIRONMENT, null, msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject)newEnvironment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PcsPackage.DEPLOYMENT__ENVIRONMENT, null, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.DEPLOYMENT__ENVIRONMENT, newEnvironment, newEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnapshotPolicy getSnapshotPolicy() {
		return snapshotPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSnapshotPolicy(SnapshotPolicy newSnapshotPolicy, NotificationChain msgs) {
		SnapshotPolicy oldSnapshotPolicy = snapshotPolicy;
		snapshotPolicy = newSnapshotPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PcsPackage.DEPLOYMENT__SNAPSHOT_POLICY, oldSnapshotPolicy, newSnapshotPolicy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSnapshotPolicy(SnapshotPolicy newSnapshotPolicy) {
		if (newSnapshotPolicy != snapshotPolicy) {
			NotificationChain msgs = null;
			if (snapshotPolicy != null)
				msgs = ((InternalEObject)snapshotPolicy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PcsPackage.DEPLOYMENT__SNAPSHOT_POLICY, null, msgs);
			if (newSnapshotPolicy != null)
				msgs = ((InternalEObject)newSnapshotPolicy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PcsPackage.DEPLOYMENT__SNAPSHOT_POLICY, null, msgs);
			msgs = basicSetSnapshotPolicy(newSnapshotPolicy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.DEPLOYMENT__SNAPSHOT_POLICY, newSnapshotPolicy, newSnapshotPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCS> getPcs() {
		if (pcs == null) {
			pcs = new EObjectContainmentEList<PCS>(PCS.class, this, PcsPackage.DEPLOYMENT__PCS);
		}
		return pcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AWSConfiguration> getAwsconfiguration() {
		if (awsconfiguration == null) {
			awsconfiguration = new EObjectContainmentEList<AWSConfiguration>(AWSConfiguration.class, this, PcsPackage.DEPLOYMENT__AWSCONFIGURATION);
		}
		return awsconfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PcsPackage.DEPLOYMENT__ENVIRONMENT:
				return basicSetEnvironment(null, msgs);
			case PcsPackage.DEPLOYMENT__SNAPSHOT_POLICY:
				return basicSetSnapshotPolicy(null, msgs);
			case PcsPackage.DEPLOYMENT__PCS:
				return ((InternalEList<?>)getPcs()).basicRemove(otherEnd, msgs);
			case PcsPackage.DEPLOYMENT__AWSCONFIGURATION:
				return ((InternalEList<?>)getAwsconfiguration()).basicRemove(otherEnd, msgs);
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
			case PcsPackage.DEPLOYMENT__ENVIRONMENT:
				return getEnvironment();
			case PcsPackage.DEPLOYMENT__SNAPSHOT_POLICY:
				return getSnapshotPolicy();
			case PcsPackage.DEPLOYMENT__PCS:
				return getPcs();
			case PcsPackage.DEPLOYMENT__AWSCONFIGURATION:
				return getAwsconfiguration();
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
			case PcsPackage.DEPLOYMENT__ENVIRONMENT:
				setEnvironment((Environment)newValue);
				return;
			case PcsPackage.DEPLOYMENT__SNAPSHOT_POLICY:
				setSnapshotPolicy((SnapshotPolicy)newValue);
				return;
			case PcsPackage.DEPLOYMENT__PCS:
				getPcs().clear();
				getPcs().addAll((Collection<? extends PCS>)newValue);
				return;
			case PcsPackage.DEPLOYMENT__AWSCONFIGURATION:
				getAwsconfiguration().clear();
				getAwsconfiguration().addAll((Collection<? extends AWSConfiguration>)newValue);
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
			case PcsPackage.DEPLOYMENT__ENVIRONMENT:
				setEnvironment((Environment)null);
				return;
			case PcsPackage.DEPLOYMENT__SNAPSHOT_POLICY:
				setSnapshotPolicy((SnapshotPolicy)null);
				return;
			case PcsPackage.DEPLOYMENT__PCS:
				getPcs().clear();
				return;
			case PcsPackage.DEPLOYMENT__AWSCONFIGURATION:
				getAwsconfiguration().clear();
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
			case PcsPackage.DEPLOYMENT__ENVIRONMENT:
				return environment != null;
			case PcsPackage.DEPLOYMENT__SNAPSHOT_POLICY:
				return snapshotPolicy != null;
			case PcsPackage.DEPLOYMENT__PCS:
				return pcs != null && !pcs.isEmpty();
			case PcsPackage.DEPLOYMENT__AWSCONFIGURATION:
				return awsconfiguration != null && !awsconfiguration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DeploymentImpl
