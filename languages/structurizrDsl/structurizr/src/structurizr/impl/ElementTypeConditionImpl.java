/**
 */
package structurizr.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import structurizr.ConditionComparisonOperation;
import structurizr.ElementTypeCondition;
import structurizr.FilterType;
import structurizr.StructurizrPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Type Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structurizr.impl.ElementTypeConditionImpl#getComparisonOperation <em>Comparison Operation</em>}</li>
 *   <li>{@link structurizr.impl.ElementTypeConditionImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementTypeConditionImpl extends ElementFilterConditionImpl implements ElementTypeCondition {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final FilterType TYPE_EDEFAULT = FilterType.PERSON;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected FilterType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementTypeConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurizrPackage.Literals.ELEMENT_TYPE_CONDITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.ELEMENT_TYPE_CONDITION__COMPARISON_OPERATION, oldComparisonOperation, comparisonOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(FilterType newType) {
		FilterType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.ELEMENT_TYPE_CONDITION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurizrPackage.ELEMENT_TYPE_CONDITION__COMPARISON_OPERATION:
				return getComparisonOperation();
			case StructurizrPackage.ELEMENT_TYPE_CONDITION__TYPE:
				return getType();
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
			case StructurizrPackage.ELEMENT_TYPE_CONDITION__COMPARISON_OPERATION:
				setComparisonOperation((ConditionComparisonOperation)newValue);
				return;
			case StructurizrPackage.ELEMENT_TYPE_CONDITION__TYPE:
				setType((FilterType)newValue);
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
			case StructurizrPackage.ELEMENT_TYPE_CONDITION__COMPARISON_OPERATION:
				setComparisonOperation(COMPARISON_OPERATION_EDEFAULT);
				return;
			case StructurizrPackage.ELEMENT_TYPE_CONDITION__TYPE:
				setType(TYPE_EDEFAULT);
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
			case StructurizrPackage.ELEMENT_TYPE_CONDITION__COMPARISON_OPERATION:
				return comparisonOperation != COMPARISON_OPERATION_EDEFAULT;
			case StructurizrPackage.ELEMENT_TYPE_CONDITION__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ElementTypeConditionImpl
