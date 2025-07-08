/**
 */
package structurizr.impl;

import graphite.shared.CustomEObjectImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import structurizr.DeploymentEnvironment;
import structurizr.Element;
import structurizr.Model;
import structurizr.Person;
import structurizr.Relationship;
import structurizr.SoftwareSystem;
import structurizr.StructurizrPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structurizr.impl.ModelImpl#getSoftwareSystem <em>Software System</em>}</li>
 *   <li>{@link structurizr.impl.ModelImpl#getPersons <em>Persons</em>}</li>
 *   <li>{@link structurizr.impl.ModelImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link structurizr.impl.ModelImpl#getDeploymentEnvironments <em>Deployment Environments</em>}</li>
 *   <li>{@link structurizr.impl.ModelImpl#getRelationships <em>Relationships</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends CustomEObjectImpl implements Model {
	/**
	 * The cached value of the '{@link #getSoftwareSystem() <em>Software System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareSystem()
	 * @generated
	 * @ordered
	 */
	protected SoftwareSystem softwareSystem;

	/**
	 * The cached value of the '{@link #getPersons() <em>Persons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> persons;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> elements;

	/**
	 * The cached value of the '{@link #getDeploymentEnvironments() <em>Deployment Environments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentEnvironments()
	 * @generated
	 * @ordered
	 */
	protected EList<DeploymentEnvironment> deploymentEnvironments;

	/**
	 * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationships()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> relationships;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurizrPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoftwareSystem getSoftwareSystem() {
		return softwareSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftwareSystem(SoftwareSystem newSoftwareSystem, NotificationChain msgs) {
		SoftwareSystem oldSoftwareSystem = softwareSystem;
		softwareSystem = newSoftwareSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurizrPackage.MODEL__SOFTWARE_SYSTEM, oldSoftwareSystem, newSoftwareSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareSystem(SoftwareSystem newSoftwareSystem) {
		if (newSoftwareSystem != softwareSystem) {
			NotificationChain msgs = null;
			if (softwareSystem != null)
				msgs = ((InternalEObject)softwareSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurizrPackage.MODEL__SOFTWARE_SYSTEM, null, msgs);
			if (newSoftwareSystem != null)
				msgs = ((InternalEObject)newSoftwareSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurizrPackage.MODEL__SOFTWARE_SYSTEM, null, msgs);
			msgs = basicSetSoftwareSystem(newSoftwareSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.MODEL__SOFTWARE_SYSTEM, newSoftwareSystem, newSoftwareSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getPersons() {
		if (persons == null) {
			persons = new EObjectContainmentEList<Person>(Person.class, this, StructurizrPackage.MODEL__PERSONS);
		}
		return persons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<Element>(Element.class, this, StructurizrPackage.MODEL__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeploymentEnvironment> getDeploymentEnvironments() {
		if (deploymentEnvironments == null) {
			deploymentEnvironments = new EObjectContainmentEList<DeploymentEnvironment>(DeploymentEnvironment.class, this, StructurizrPackage.MODEL__DEPLOYMENT_ENVIRONMENTS);
		}
		return deploymentEnvironments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getRelationships() {
		if (relationships == null) {
			relationships = new EObjectContainmentEList<Relationship>(Relationship.class, this, StructurizrPackage.MODEL__RELATIONSHIPS);
		}
		return relationships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurizrPackage.MODEL__SOFTWARE_SYSTEM:
				return basicSetSoftwareSystem(null, msgs);
			case StructurizrPackage.MODEL__PERSONS:
				return ((InternalEList<?>)getPersons()).basicRemove(otherEnd, msgs);
			case StructurizrPackage.MODEL__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case StructurizrPackage.MODEL__DEPLOYMENT_ENVIRONMENTS:
				return ((InternalEList<?>)getDeploymentEnvironments()).basicRemove(otherEnd, msgs);
			case StructurizrPackage.MODEL__RELATIONSHIPS:
				return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
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
			case StructurizrPackage.MODEL__SOFTWARE_SYSTEM:
				return getSoftwareSystem();
			case StructurizrPackage.MODEL__PERSONS:
				return getPersons();
			case StructurizrPackage.MODEL__ELEMENTS:
				return getElements();
			case StructurizrPackage.MODEL__DEPLOYMENT_ENVIRONMENTS:
				return getDeploymentEnvironments();
			case StructurizrPackage.MODEL__RELATIONSHIPS:
				return getRelationships();
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
			case StructurizrPackage.MODEL__SOFTWARE_SYSTEM:
				setSoftwareSystem((SoftwareSystem)newValue);
				return;
			case StructurizrPackage.MODEL__PERSONS:
				getPersons().clear();
				getPersons().addAll((Collection<? extends Person>)newValue);
				return;
			case StructurizrPackage.MODEL__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Element>)newValue);
				return;
			case StructurizrPackage.MODEL__DEPLOYMENT_ENVIRONMENTS:
				getDeploymentEnvironments().clear();
				getDeploymentEnvironments().addAll((Collection<? extends DeploymentEnvironment>)newValue);
				return;
			case StructurizrPackage.MODEL__RELATIONSHIPS:
				getRelationships().clear();
				getRelationships().addAll((Collection<? extends Relationship>)newValue);
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
			case StructurizrPackage.MODEL__SOFTWARE_SYSTEM:
				setSoftwareSystem((SoftwareSystem)null);
				return;
			case StructurizrPackage.MODEL__PERSONS:
				getPersons().clear();
				return;
			case StructurizrPackage.MODEL__ELEMENTS:
				getElements().clear();
				return;
			case StructurizrPackage.MODEL__DEPLOYMENT_ENVIRONMENTS:
				getDeploymentEnvironments().clear();
				return;
			case StructurizrPackage.MODEL__RELATIONSHIPS:
				getRelationships().clear();
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
			case StructurizrPackage.MODEL__SOFTWARE_SYSTEM:
				return softwareSystem != null;
			case StructurizrPackage.MODEL__PERSONS:
				return persons != null && !persons.isEmpty();
			case StructurizrPackage.MODEL__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case StructurizrPackage.MODEL__DEPLOYMENT_ENVIRONMENTS:
				return deploymentEnvironments != null && !deploymentEnvironments.isEmpty();
			case StructurizrPackage.MODEL__RELATIONSHIPS:
				return relationships != null && !relationships.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl
