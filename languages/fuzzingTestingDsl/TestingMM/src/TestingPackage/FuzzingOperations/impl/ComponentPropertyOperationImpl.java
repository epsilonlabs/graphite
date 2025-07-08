/**
 */
package TestingPackage.FuzzingOperations.impl;

import TestingPackage.FuzzingOperations.ComponentPropertyOperation;
import TestingPackage.FuzzingOperations.FuzzingOperationsPackage;

import TestingPackage.MRSPackage.ComponentProperty;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Property Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.ComponentPropertyOperationImpl#getPropertyToAffect <em>Property To Affect</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentPropertyOperationImpl extends FuzzTestingOperationImpl implements ComponentPropertyOperation {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentPropertyOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FuzzingOperationsPackage.Literals.COMPONENT_PROPERTY_OPERATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FuzzingOperationsPackage.COMPONENT_PROPERTY_OPERATION__PROPERTY_TO_AFFECT, oldPropertyToAffect, propertyToAffect));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.COMPONENT_PROPERTY_OPERATION__PROPERTY_TO_AFFECT, oldPropertyToAffect, propertyToAffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FuzzingOperationsPackage.COMPONENT_PROPERTY_OPERATION__PROPERTY_TO_AFFECT:
				if (resolve) return getPropertyToAffect();
				return basicGetPropertyToAffect();
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
			case FuzzingOperationsPackage.COMPONENT_PROPERTY_OPERATION__PROPERTY_TO_AFFECT:
				setPropertyToAffect((ComponentProperty)newValue);
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
			case FuzzingOperationsPackage.COMPONENT_PROPERTY_OPERATION__PROPERTY_TO_AFFECT:
				setPropertyToAffect((ComponentProperty)null);
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
			case FuzzingOperationsPackage.COMPONENT_PROPERTY_OPERATION__PROPERTY_TO_AFFECT:
				return propertyToAffect != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentPropertyOperationImpl
