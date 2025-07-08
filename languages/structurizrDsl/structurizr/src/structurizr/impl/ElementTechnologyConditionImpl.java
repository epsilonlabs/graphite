/**
 */
package structurizr.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import structurizr.ConditionComparisonOperation;
import structurizr.ElementTechnologyCondition;
import structurizr.StructurizrPackage;
import structurizr.Technology;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Technology Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structurizr.impl.ElementTechnologyConditionImpl#getComparisonOperation <em>Comparison Operation</em>}</li>
 *   <li>{@link structurizr.impl.ElementTechnologyConditionImpl#getTechnology <em>Technology</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementTechnologyConditionImpl extends ElementFilterConditionImpl implements ElementTechnologyCondition {
	/**
	 * The default value of the '{@link #getComparisonOperation() <em>Comparison Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonOperation()
	 * @generated
	 * @ordered
	 */
	protected static final ConditionComparisonOperation COMPARISON_OPERATION_EDEFAULT = ConditionComparisonOperation.EQUALS;

	/**
	 * The cached value of the '{@link #getComparisonOperation() <em>Comparison Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonOperation()
	 * @generated
	 * @ordered
	 */
	protected ConditionComparisonOperation comparisonOperation = COMPARISON_OPERATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTechnology() <em>Technology</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected Technology technology;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementTechnologyConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurizrPackage.Literals.ELEMENT_TECHNOLOGY_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionComparisonOperation getComparisonOperation() {
		return comparisonOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparisonOperation(ConditionComparisonOperation newComparisonOperation) {
		ConditionComparisonOperation oldComparisonOperation = comparisonOperation;
		comparisonOperation = newComparisonOperation == null ? COMPARISON_OPERATION_EDEFAULT : newComparisonOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.ELEMENT_TECHNOLOGY_CONDITION__COMPARISON_OPERATION, oldComparisonOperation, comparisonOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Technology getTechnology() {
		if (technology != null && technology.eIsProxy()) {
			InternalEObject oldTechnology = (InternalEObject)technology;
			technology = (Technology)eResolveProxy(oldTechnology);
			if (technology != oldTechnology) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurizrPackage.ELEMENT_TECHNOLOGY_CONDITION__TECHNOLOGY, oldTechnology, technology));
			}
		}
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Technology basicGetTechnology() {
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnology(Technology newTechnology) {
		Technology oldTechnology = technology;
		technology = newTechnology;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.ELEMENT_TECHNOLOGY_CONDITION__TECHNOLOGY, oldTechnology, technology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurizrPackage.ELEMENT_TECHNOLOGY_CONDITION__COMPARISON_OPERATION:
				return getComparisonOperation();
			case StructurizrPackage.ELEMENT_TECHNOLOGY_CONDITION__TECHNOLOGY:
				if (resolve) return getTechnology();
				return basicGetTechnology();
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
			case StructurizrPackage.ELEMENT_TECHNOLOGY_CONDITION__COMPARISON_OPERATION:
				setComparisonOperation((ConditionComparisonOperation)newValue);
				return;
			case StructurizrPackage.ELEMENT_TECHNOLOGY_CONDITION__TECHNOLOGY:
				setTechnology((Technology)newValue);
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
			case StructurizrPackage.ELEMENT_TECHNOLOGY_CONDITION__COMPARISON_OPERATION:
				setComparisonOperation(COMPARISON_OPERATION_EDEFAULT);
				return;
			case StructurizrPackage.ELEMENT_TECHNOLOGY_CONDITION__TECHNOLOGY:
				setTechnology((Technology)null);
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
			case StructurizrPackage.ELEMENT_TECHNOLOGY_CONDITION__COMPARISON_OPERATION:
				return comparisonOperation != COMPARISON_OPERATION_EDEFAULT;
			case StructurizrPackage.ELEMENT_TECHNOLOGY_CONDITION__TECHNOLOGY:
				return technology != null;
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
		result.append(" (comparisonOperation: ");
		result.append(comparisonOperation);
		result.append(')');
		return result.toString();
	}

} //ElementTechnologyConditionImpl
