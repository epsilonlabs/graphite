/**
 */
package TestingPackage.FuzzingOperations.impl;

import TestingPackage.FuzzingOperations.ComponentSubPropertyOperation;
import TestingPackage.FuzzingOperations.FuzzingOperationsPackage;

import TestingPackage.MRSPackage.ComponentProperty;
import TestingPackage.MRSPackage.Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Sub Property Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.ComponentSubPropertyOperationImpl#getPropertyToAffect <em>Property To Affect</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.ComponentSubPropertyOperationImpl#getSubProperty <em>Sub Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentSubPropertyOperationImpl extends FuzzTestingOperationImpl implements ComponentSubPropertyOperation {
	/**
	 * The cached value of the '{@link #getPropertyToAffect() <em>Property To Affect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyToAffect()
	 * @generated
	 * @ordered
	 */
	protected ComponentProperty propertyToAffect;

	/**
	 * The cached value of the '{@link #getSubProperty() <em>Sub Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubProperty()
	 * @generated
	 * @ordered
	 */
	protected Type subProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentSubPropertyOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FuzzingOperationsPackage.Literals.COMPONENT_SUB_PROPERTY_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentProperty getPropertyToAffect() {
		if (propertyToAffect != null && propertyToAffect.eIsProxy()) {
			InternalEObject oldPropertyToAffect = (InternalEObject)propertyToAffect;
			propertyToAffect = (ComponentProperty)eResolveProxy(oldPropertyToAffect);
			if (propertyToAffect != oldPropertyToAffect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FuzzingOperationsPackage.COMPONENT_SUB_PROPERTY_OPERATION__PROPERTY_TO_AFFECT, oldPropertyToAffect, propertyToAffect));
			}
		}
		return propertyToAffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentProperty basicGetPropertyToAffect() {
		return propertyToAffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyToAffect(ComponentProperty newPropertyToAffect) {
		ComponentProperty oldPropertyToAffect = propertyToAffect;
		propertyToAffect = newPropertyToAffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.COMPONENT_SUB_PROPERTY_OPERATION__PROPERTY_TO_AFFECT, oldPropertyToAffect, propertyToAffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getSubProperty() {
		if (subProperty != null && subProperty.eIsProxy()) {
			InternalEObject oldSubProperty = (InternalEObject)subProperty;
			subProperty = (Type)eResolveProxy(oldSubProperty);
			if (subProperty != oldSubProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FuzzingOperationsPackage.COMPONENT_SUB_PROPERTY_OPERATION__SUB_PROPERTY, oldSubProperty, subProperty));
			}
		}
		return subProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetSubProperty() {
		return subProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubProperty(Type newSubProperty) {
		Type oldSubProperty = subProperty;
		subProperty = newSubProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.COMPONENT_SUB_PROPERTY_OPERATION__SUB_PROPERTY, oldSubProperty, subProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FuzzingOperationsPackage.COMPONENT_SUB_PROPERTY_OPERATION__PROPERTY_TO_AFFECT:
				if (resolve) return getPropertyToAffect();
				return basicGetPropertyToAffect();
			case FuzzingOperationsPackage.COMPONENT_SUB_PROPERTY_OPERATION__SUB_PROPERTY:
				if (resolve) return getSubProperty();
				return basicGetSubProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FuzzingOperationsPackage.COMPONENT_SUB_PROPERTY_OPERATION__PROPERTY_TO_AFFECT:
				setPropertyToAffect((ComponentProperty)newValue);
				return;
			case FuzzingOperationsPackage.COMPONENT_SUB_PROPERTY_OPERATION__SUB_PROPERTY:
				setSubProperty((Type)newValue);
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
			case FuzzingOperationsPackage.COMPONENT_SUB_PROPERTY_OPERATION__PROPERTY_TO_AFFECT:
				setPropertyToAffect((ComponentProperty)null);
				return;
			case FuzzingOperationsPackage.COMPONENT_SUB_PROPERTY_OPERATION__SUB_PROPERTY:
				setSubProperty((Type)null);
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
			case FuzzingOperationsPackage.COMPONENT_SUB_PROPERTY_OPERATION__PROPERTY_TO_AFFECT:
				return propertyToAffect != null;
			case FuzzingOperationsPackage.COMPONENT_SUB_PROPERTY_OPERATION__SUB_PROPERTY:
				return subProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentSubPropertyOperationImpl
