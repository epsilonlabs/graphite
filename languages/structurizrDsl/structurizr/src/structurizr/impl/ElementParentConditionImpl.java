/**
 */
package structurizr.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import structurizr.ConditionComparisonOperation;
import structurizr.ElementParentCondition;
import structurizr.IdentifiableElement;
import structurizr.StructurizrPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Parent Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structurizr.impl.ElementParentConditionImpl#getComparisonOperation <em>Comparison Operation</em>}</li>
 *   <li>{@link structurizr.impl.ElementParentConditionImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementParentConditionImpl extends ElementFilterConditionImpl implements ElementParentCondition {
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
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected IdentifiableElement parent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementParentConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurizrPackage.Literals.ELEMENT_PARENT_CONDITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.ELEMENT_PARENT_CONDITION__COMPARISON_OPERATION, oldComparisonOperation, comparisonOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiableElement getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (IdentifiableElement)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurizrPackage.ELEMENT_PARENT_CONDITION__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiableElement basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(IdentifiableElement newParent) {
		IdentifiableElement oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.ELEMENT_PARENT_CONDITION__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurizrPackage.ELEMENT_PARENT_CONDITION__COMPARISON_OPERATION:
				return getComparisonOperation();
			case StructurizrPackage.ELEMENT_PARENT_CONDITION__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
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
			case StructurizrPackage.ELEMENT_PARENT_CONDITION__COMPARISON_OPERATION:
				setComparisonOperation((ConditionComparisonOperation)newValue);
				return;
			case StructurizrPackage.ELEMENT_PARENT_CONDITION__PARENT:
				setParent((IdentifiableElement)newValue);
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
			case StructurizrPackage.ELEMENT_PARENT_CONDITION__COMPARISON_OPERATION:
				setComparisonOperation(COMPARISON_OPERATION_EDEFAULT);
				return;
			case StructurizrPackage.ELEMENT_PARENT_CONDITION__PARENT:
				setParent((IdentifiableElement)null);
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
			case StructurizrPackage.ELEMENT_PARENT_CONDITION__COMPARISON_OPERATION:
				return comparisonOperation != COMPARISON_OPERATION_EDEFAULT;
			case StructurizrPackage.ELEMENT_PARENT_CONDITION__PARENT:
				return parent != null;
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

} //ElementParentConditionImpl
