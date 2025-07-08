/**
 */
package TestingPackage.StandardGrammar.impl;

import TestingPackage.StandardGrammar.BinaryLogicalOperation;
import TestingPackage.StandardGrammar.CompositeCondition;
import TestingPackage.StandardGrammar.ConditionElement;
import TestingPackage.StandardGrammar.StandardGrammarPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.StandardGrammar.impl.CompositeConditionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link TestingPackage.StandardGrammar.impl.CompositeConditionImpl#getBinop <em>Binop</em>}</li>
 *   <li>{@link TestingPackage.StandardGrammar.impl.CompositeConditionImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeConditionImpl extends ConditionElementImpl implements CompositeCondition {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected ConditionElement left;

	/**
	 * The default value of the '{@link #getBinop() <em>Binop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinop()
	 * @generated
	 * @ordered
	 */
	protected static final BinaryLogicalOperation BINOP_EDEFAULT = BinaryLogicalOperation.AND;

	/**
	 * The cached value of the '{@link #getBinop() <em>Binop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinop()
	 * @generated
	 * @ordered
	 */
	protected BinaryLogicalOperation binop = BINOP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected ConditionElement right;

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
		return StandardGrammarPackage.Literals.COMPOSITE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionElement getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(ConditionElement newLeft, NotificationChain msgs) {
		ConditionElement oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StandardGrammarPackage.COMPOSITE_CONDITION__LEFT, oldLeft, newLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(ConditionElement newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StandardGrammarPackage.COMPOSITE_CONDITION__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StandardGrammarPackage.COMPOSITE_CONDITION__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StandardGrammarPackage.COMPOSITE_CONDITION__LEFT, newLeft, newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryLogicalOperation getBinop() {
		return binop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinop(BinaryLogicalOperation newBinop) {
		BinaryLogicalOperation oldBinop = binop;
		binop = newBinop == null ? BINOP_EDEFAULT : newBinop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StandardGrammarPackage.COMPOSITE_CONDITION__BINOP, oldBinop, binop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionElement getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(ConditionElement newRight, NotificationChain msgs) {
		ConditionElement oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StandardGrammarPackage.COMPOSITE_CONDITION__RIGHT, oldRight, newRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(ConditionElement newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StandardGrammarPackage.COMPOSITE_CONDITION__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StandardGrammarPackage.COMPOSITE_CONDITION__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StandardGrammarPackage.COMPOSITE_CONDITION__RIGHT, newRight, newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StandardGrammarPackage.COMPOSITE_CONDITION__LEFT:
				return basicSetLeft(null, msgs);
			case StandardGrammarPackage.COMPOSITE_CONDITION__RIGHT:
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
			case StandardGrammarPackage.COMPOSITE_CONDITION__LEFT:
				return getLeft();
			case StandardGrammarPackage.COMPOSITE_CONDITION__BINOP:
				return getBinop();
			case StandardGrammarPackage.COMPOSITE_CONDITION__RIGHT:
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
			case StandardGrammarPackage.COMPOSITE_CONDITION__LEFT:
				setLeft((ConditionElement)newValue);
				return;
			case StandardGrammarPackage.COMPOSITE_CONDITION__BINOP:
				setBinop((BinaryLogicalOperation)newValue);
				return;
			case StandardGrammarPackage.COMPOSITE_CONDITION__RIGHT:
				setRight((ConditionElement)newValue);
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
			case StandardGrammarPackage.COMPOSITE_CONDITION__LEFT:
				setLeft((ConditionElement)null);
				return;
			case StandardGrammarPackage.COMPOSITE_CONDITION__BINOP:
				setBinop(BINOP_EDEFAULT);
				return;
			case StandardGrammarPackage.COMPOSITE_CONDITION__RIGHT:
				setRight((ConditionElement)null);
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
			case StandardGrammarPackage.COMPOSITE_CONDITION__LEFT:
				return left != null;
			case StandardGrammarPackage.COMPOSITE_CONDITION__BINOP:
				return binop != BINOP_EDEFAULT;
			case StandardGrammarPackage.COMPOSITE_CONDITION__RIGHT:
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
		result.append(" (binop: ");
		result.append(binop);
		result.append(')');
		return result.toString();
	}

} //CompositeConditionImpl
