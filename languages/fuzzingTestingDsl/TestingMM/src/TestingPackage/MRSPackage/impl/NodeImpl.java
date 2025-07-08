/**
 */
package TestingPackage.MRSPackage.impl;

import TestingPackage.MRSPackage.ComponentProperty;
import TestingPackage.MRSPackage.MRSPackagePackage;
import TestingPackage.MRSPackage.Node;
import TestingPackage.MRSPackage.Variable;

import graphite.shared.CustomEObjectImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.MRSPackage.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link TestingPackage.MRSPackage.impl.NodeImpl#getSubscriber <em>Subscriber</em>}</li>
 *   <li>{@link TestingPackage.MRSPackage.impl.NodeImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link TestingPackage.MRSPackage.impl.NodeImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends CustomEObjectImpl implements Node {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubscriber() <em>Subscriber</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriber()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> subscriber;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> publisher;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentProperty> properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRSPackagePackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRSPackagePackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getSubscriber() {
		if (subscriber == null) {
			subscriber = new EObjectResolvingEList<Variable>(Variable.class, this, MRSPackagePackage.NODE__SUBSCRIBER);
		}
		return subscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getPublisher() {
		if (publisher == null) {
			publisher = new EObjectResolvingEList<Variable>(Variable.class, this, MRSPackagePackage.NODE__PUBLISHER);
		}
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectResolvingEList<ComponentProperty>(ComponentProperty.class, this, MRSPackagePackage.NODE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MRSPackagePackage.NODE__NAME:
				return getName();
			case MRSPackagePackage.NODE__SUBSCRIBER:
				return getSubscriber();
			case MRSPackagePackage.NODE__PUBLISHER:
				return getPublisher();
			case MRSPackagePackage.NODE__PROPERTIES:
				return getProperties();
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
			case MRSPackagePackage.NODE__NAME:
				setName((String)newValue);
				return;
			case MRSPackagePackage.NODE__SUBSCRIBER:
				getSubscriber().clear();
				getSubscriber().addAll((Collection<? extends Variable>)newValue);
				return;
			case MRSPackagePackage.NODE__PUBLISHER:
				getPublisher().clear();
				getPublisher().addAll((Collection<? extends Variable>)newValue);
				return;
			case MRSPackagePackage.NODE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends ComponentProperty>)newValue);
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
			case MRSPackagePackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MRSPackagePackage.NODE__SUBSCRIBER:
				getSubscriber().clear();
				return;
			case MRSPackagePackage.NODE__PUBLISHER:
				getPublisher().clear();
				return;
			case MRSPackagePackage.NODE__PROPERTIES:
				getProperties().clear();
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
			case MRSPackagePackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MRSPackagePackage.NODE__SUBSCRIBER:
				return subscriber != null && !subscriber.isEmpty();
			case MRSPackagePackage.NODE__PUBLISHER:
				return publisher != null && !publisher.isEmpty();
			case MRSPackagePackage.NODE__PROPERTIES:
				return properties != null && !properties.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
