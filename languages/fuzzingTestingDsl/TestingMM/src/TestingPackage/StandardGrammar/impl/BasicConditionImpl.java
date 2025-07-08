/**
 */
package TestingPackage.StandardGrammar.impl;

import TestingPackage.StandardGrammar.BasicCondition;
import TestingPackage.StandardGrammar.BinaryComparisonOperation;
import TestingPackage.StandardGrammar.ConditionExpr;
import TestingPackage.StandardGrammar.ConditionVariable;
import TestingPackage.StandardGrammar.StandardGrammarPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.StandardGrammar.impl.BasicConditionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link TestingPackage.StandardGrammar.impl.BasicConditionImpl#getBincomp <em>Bincomp</em>}</li>
 *   <li>{@link TestingPackage.StandardGrammar.impl.BasicConditionImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicConditionImpl extends ConditionElementImpl implements BasicCondition {
	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected ConditionVariable left;

	/**
	 * The default value of the '{@link #getBincomp() <em>Bincomp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBincomp()
	 * @generated
	 * @ordered
	 */
	protected static final BinaryComparisonOperation BINCOMP_EDEFAULT = BinaryComparisonOperation.LESS_THAN;

	/**
	 * The cached value of the '{@link #getBincomp() <em>Bincomp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBincomp()
	 * @generated
	 * @ordered
	 */
	protected BinaryComparisonOperation bincomp = BINCOMP_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected ConditionExpr right;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StandardGrammarPackage.Literals.BASIC_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionVariable getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(ConditionVariable newLeft, NotificationChain msgs) {
		ConditionVariable oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StandardGrammarPackage.BASIC_CONDITION__LEFT, oldLeft, newLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(ConditionVariable newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StandardGrammarPackage.BASIC_CONDITION__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StandardGrammarPackage.BASIC_CONDITION__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StandardGrammarPackage.BASIC_CONDITION__LEFT, newLeft, newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryComparisonOperation getBincomp() {
		return bincomp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBincomp(BinaryComparisonOperation newBincomp) {
		BinaryComparisonOperation oldBincomp = bincomp;
		bincomp = newBincomp == null ? BINCOMP_EDEFAULT : newBincomp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StandardGrammarPackage.BASIC_CONDITION__BINCOMP, oldBincomp, bincomp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionExpr getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(ConditionExpr newRight, NotificationChain msgs) {
		ConditionExpr oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StandardGrammarPackage.BASIC_CONDITION__RIGHT, oldRight, newRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(ConditionExpr newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StandardGrammarPackage.BASIC_CONDITION__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StandardGrammarPackage.BASIC_CONDITION__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StandardGrammarPackage.BASIC_CONDITION__RIGHT, newRight, newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StandardGrammarPackage.BASIC_CONDITION__LEFT:
				return basicSetLeft(null, msgs);
			case StandardGrammarPackage.BASIC_CONDITION__RIGHT:
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
			case StandardGrammarPackage.BASIC_CONDITION__LEFT:
				return getLeft();
			case StandardGrammarPackage.BASIC_CONDITION__BINCOMP:
				return getBincomp();
			case StandardGrammarPackage.BASIC_CONDITION__RIGHT:
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
			case StandardGrammarPackage.BASIC_CONDITION__LEFT:
				setLeft((ConditionVariable)newValue);
				return;
			case StandardGrammarPackage.BASIC_CONDITION__BINCOMP:
				setBincomp((BinaryComparisonOperation)newValue);
				return;
			case StandardGrammarPackage.BASIC_CONDITION__RIGHT:
				setRight((ConditionExpr)newValue);
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
			case StandardGrammarPackage.BASIC_CONDITION__LEFT:
				setLeft((ConditionVariable)null);
				return;
			case StandardGrammarPackage.BASIC_CONDITION__BINCOMP:
				setBincomp(BINCOMP_EDEFAULT);
				return;
			case StandardGrammarPackage.BASIC_CONDITION__RIGHT:
				setRight((ConditionExpr)null);
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
			case StandardGrammarPackage.BASIC_CONDITION__LEFT:
				return left != null;
			case StandardGrammarPackage.BASIC_CONDITION__BINCOMP:
				return bincomp != BINCOMP_EDEFAULT;
			case StandardGrammarPackage.BASIC_CONDITION__RIGHT:
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
		result.append(" (bincomp: ");
		result.append(bincomp);
		result.append(')');
		return result.toString();
	}

} //BasicConditionImpl
