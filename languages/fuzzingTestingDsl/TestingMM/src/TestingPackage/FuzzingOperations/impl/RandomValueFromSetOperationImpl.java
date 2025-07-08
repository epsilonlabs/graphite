/**
 */
package TestingPackage.FuzzingOperations.impl;

import TestingPackage.FuzzingOperations.FuzzingOperationsPackage;
import TestingPackage.FuzzingOperations.RandomValueFromSetOperation;
import TestingPackage.FuzzingOperations.ValueSet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Random Value From Set Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.RandomValueFromSetOperationImpl#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.RandomValueFromSetOperationImpl#isIsRelative <em>Is Relative</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RandomValueFromSetOperationImpl extends RandomValueFuzzingOperationImpl implements RandomValueFromSetOperation {
	/**
	 * The cached value of the '{@link #getValueSet() <em>Value Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSet()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSet> valueSet;

	/**
	 * The default value of the '{@link #isIsRelative() <em>Is Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRelative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RELATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsRelative() <em>Is Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsRelative()
	 * @generated
	 * @ordered
	 */
	protected boolean isRelative = IS_RELATIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RandomValueFromSetOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FuzzingOperationsPackage.Literals.RANDOM_VALUE_FROM_SET_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSet> getValueSet() {
		if (valueSet == null) {
			valueSet = new EObjectContainmentEList<ValueSet>(ValueSet.class, this, FuzzingOperationsPackage.RANDOM_VALUE_FROM_SET_OPERATION__VALUE_SET);
		}
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsRelative() {
		return isRelative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRelative(boolean newIsRelative) {
		boolean oldIsRelative = isRelative;
		isRelative = newIsRelative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.RANDOM_VALUE_FROM_SET_OPERATION__IS_RELATIVE, oldIsRelative, isRelative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FuzzingOperationsPackage.RANDOM_VALUE_FROM_SET_OPERATION__VALUE_SET:
				return ((InternalEList<?>)getValueSet()).basicRemove(otherEnd, msgs);
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
			case FuzzingOperationsPackage.RANDOM_VALUE_FROM_SET_OPERATION__VALUE_SET:
				return getValueSet();
			case FuzzingOperationsPackage.RANDOM_VALUE_FROM_SET_OPERATION__IS_RELATIVE:
				return isIsRelative();
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
			case FuzzingOperationsPackage.RANDOM_VALUE_FROM_SET_OPERATION__VALUE_SET:
				getValueSet().clear();
				getValueSet().addAll((Collection<? extends ValueSet>)newValue);
				return;
			case FuzzingOperationsPackage.RANDOM_VALUE_FROM_SET_OPERATION__IS_RELATIVE:
				setIsRelative((Boolean)newValue);
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
			case FuzzingOperationsPackage.RANDOM_VALUE_FROM_SET_OPERATION__VALUE_SET:
				getValueSet().clear();
				return;
			case FuzzingOperationsPackage.RANDOM_VALUE_FROM_SET_OPERATION__IS_RELATIVE:
				setIsRelative(IS_RELATIVE_EDEFAULT);
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
			case FuzzingOperationsPackage.RANDOM_VALUE_FROM_SET_OPERATION__VALUE_SET:
				return valueSet != null && !valueSet.isEmpty();
			case FuzzingOperationsPackage.RANDOM_VALUE_FROM_SET_OPERATION__IS_RELATIVE:
				return isRelative != IS_RELATIVE_EDEFAULT;
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
		result.append(" (isRelative: ");
		result.append(isRelative);
		result.append(')');
		return result.toString();
	}

} //RandomValueFromSetOperationImpl
