/**
 */
package structurizr.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import structurizr.CompositeCondition;
import structurizr.ConditionLogicalOperation;
import structurizr.FilterCondition;
import structurizr.StructurizrPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structurizr.impl.CompositeConditionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link structurizr.impl.CompositeConditionImpl#getLogicalOperation <em>Logical Operation</em>}</li>
 *   <li>{@link structurizr.impl.CompositeConditionImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeConditionImpl extends FilterConditionImpl implements CompositeCondition {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected FilterCondition left;

	/**
	 * The default value of the '{@link #getLogicalOperation() <em>Logical Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalOperation()
	 * @generated
	 * @ordered
	 */
	protected static final ConditionLogicalOperation LOGICAL_OPERATION_EDEFAULT = ConditionLogicalOperation.AND;

	/**
	 * The cached value of the '{@link #getLogicalOperation() <em>Logical Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogicalOperation()
	 * @generated
	 * @ordered
	 */
	protected ConditionLogicalOperation logicalOperation = LOGICAL_OPERATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected FilterCondition right;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurizrPackage.Literals.COMPOSITE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterCondition getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(FilterCondition newLeft, NotificationChain msgs) {
		FilterCondition oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurizrPackage.COMPOSITE_CONDITION__LEFT, oldLeft, newLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(FilterCondition newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurizrPackage.COMPOSITE_CONDITION__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurizrPackage.COMPOSITE_CONDITION__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.COMPOSITE_CONDITION__LEFT, newLeft, newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionLogicalOperation getLogicalOperation() {
		return logicalOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogicalOperation(ConditionLogicalOperation newLogicalOperation) {
		ConditionLogicalOperation oldLogicalOperation = logicalOperation;
		logicalOperation = newLogicalOperation == null ? LOGICAL_OPERATION_EDEFAULT : newLogicalOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.COMPOSITE_CONDITION__LOGICAL_OPERATION, oldLogicalOperation, logicalOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterCondition getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(FilterCondition newRight, NotificationChain msgs) {
		FilterCondition oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurizrPackage.COMPOSITE_CONDITION__RIGHT, oldRight, newRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(FilterCondition newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurizrPackage.COMPOSITE_CONDITION__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurizrPackage.COMPOSITE_CONDITION__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.COMPOSITE_CONDITION__RIGHT, newRight, newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurizrPackage.COMPOSITE_CONDITION__LEFT:
				return basicSetLeft(null, msgs);
			case StructurizrPackage.COMPOSITE_CONDITION__RIGHT:
				return basicSetRight(null, msgs);
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
			case StructurizrPackage.COMPOSITE_CONDITION__LEFT:
				return getLeft();
			case StructurizrPackage.COMPOSITE_CONDITION__LOGICAL_OPERATION:
				return getLogicalOperation();
			case StructurizrPackage.COMPOSITE_CONDITION__RIGHT:
				return getRight();
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
			case StructurizrPackage.COMPOSITE_CONDITION__LEFT:
				setLeft((FilterCondition)newValue);
				return;
			case StructurizrPackage.COMPOSITE_CONDITION__LOGICAL_OPERATION:
				setLogicalOperation((ConditionLogicalOperation)newValue);
				return;
			case StructurizrPackage.COMPOSITE_CONDITION__RIGHT:
				setRight((FilterCondition)newValue);
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
			case StructurizrPackage.COMPOSITE_CONDITION__LEFT:
				setLeft((FilterCondition)null);
				return;
			case StructurizrPackage.COMPOSITE_CONDITION__LOGICAL_OPERATION:
				setLogicalOperation(LOGICAL_OPERATION_EDEFAULT);
				return;
			case StructurizrPackage.COMPOSITE_CONDITION__RIGHT:
				setRight((FilterCondition)null);
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
			case StructurizrPackage.COMPOSITE_CONDITION__LEFT:
				return left != null;
			case StructurizrPackage.COMPOSITE_CONDITION__LOGICAL_OPERATION:
				return logicalOperation != LOGICAL_OPERATION_EDEFAULT;
			case StructurizrPackage.COMPOSITE_CONDITION__RIGHT:
				return right != null;
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
		result.append(" (logicalOperation: ");
		result.append(logicalOperation);
		result.append(')');
		return result.toString();
	}

} //CompositeConditionImpl
