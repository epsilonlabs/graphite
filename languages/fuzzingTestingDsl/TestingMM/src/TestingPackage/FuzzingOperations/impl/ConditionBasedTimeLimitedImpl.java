/**
 */
package TestingPackage.FuzzingOperations.impl;

import TestingPackage.FuzzingOperations.ConditionBasedTimeLimited;
import TestingPackage.FuzzingOperations.FuzzingOperationsPackage;

import TestingPackage.StandardGrammar.Condition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Based Time Limited</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.ConditionBasedTimeLimitedImpl#getLength <em>Length</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.ConditionBasedTimeLimitedImpl#getMaximumActivations <em>Maximum Activations</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.ConditionBasedTimeLimitedImpl#getStarting <em>Starting</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.ConditionBasedTimeLimitedImpl#getStartingExpression <em>Starting Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionBasedTimeLimitedImpl extends ActivationImpl implements ConditionBasedTimeLimited {
	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final double LENGTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected double length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumActivations() <em>Maximum Activations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumActivations()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_ACTIVATIONS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMaximumActivations() <em>Maximum Activations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumActivations()
	 * @generated
	 * @ordered
	 */
	protected int maximumActivations = MAXIMUM_ACTIVATIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStarting() <em>Starting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStarting()
	 * @generated
	 * @ordered
	 */
	protected Condition starting;

	/**
	 * The default value of the '{@link #getStartingExpression() <em>Starting Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String STARTING_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartingExpression() <em>Starting Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingExpression()
	 * @generated
	 * @ordered
	 */
	protected String startingExpression = STARTING_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionBasedTimeLimitedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FuzzingOperationsPackage.Literals.CONDITION_BASED_TIME_LIMITED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(double newLength) {
		double oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.CONDITION_BASED_TIME_LIMITED__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaximumActivations() {
		return maximumActivations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumActivations(int newMaximumActivations) {
		int oldMaximumActivations = maximumActivations;
		maximumActivations = newMaximumActivations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.CONDITION_BASED_TIME_LIMITED__MAXIMUM_ACTIVATIONS, oldMaximumActivations, maximumActivations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getStarting() {
		return starting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStarting(Condition newStarting, NotificationChain msgs) {
		Condition oldStarting = starting;
		starting = newStarting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.CONDITION_BASED_TIME_LIMITED__STARTING, oldStarting, newStarting);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStarting(Condition newStarting) {
		if (newStarting != starting) {
			NotificationChain msgs = null;
			if (starting != null)
				msgs = ((InternalEObject)starting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FuzzingOperationsPackage.CONDITION_BASED_TIME_LIMITED__STARTING, null, msgs);
			if (newStarting != null)
				msgs = ((InternalEObject)newStarting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FuzzingOperationsPackage.CONDITION_BASED_TIME_LIMITED__STARTING, null, msgs);
			msgs = basicSetStarting(newStarting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.CONDITION_BASED_TIME_LIMITED__STARTING, newStarting, newStarting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartingExpression() {
		return startingExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartingExpression(String newStartingExpression) {
		String oldStartingExpression = startingExpression;
		startingExpression = newStartingExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.CONDITION_BASED_TIME_LIMITED__STARTING_EXPRESSION, oldStartingExpression, startingExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FuzzingOperationsPackage.CONDITION_BASED_TIME_LIMITED__STARTING:
				return basicSetStarting(null, msgs);
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
			case FuzzingOperationsPackage.CONDITION_BASED_TIME_LIMITED__LENGTH:
				return getLength();
			case FuzzingOperationsPackage.CONDITION_BASED_TIME_LIMITED__MAXIMUM_ACTIVATIONS:
				return getMaximumActivations();
			case FuzzingOperationsPackage.CONDITION_BASED_TIME_LIMITED__STARTING:
				return getStarting();
			case FuzzingOperationsPackage.CONDITION_BASED_TIME_LIMITED__STARTING_EXPRESSION:
				return getStartingExpression();
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
			case FuzzingOperationsPackage.CONDITION_BASED_TIME_LIMITED__LENGTH:
				setLength((Double)newValue);
				return;
			case FuzzingOperationsPackage.CONDITION_BASED_TIME_LIMITED__MAXIMUM_ACTIVATIONS:
				setMaximumActivations((Integer)newValue);
				return;
			case FuzzingOperationsPackage.CONDITION_BASED_TIME_LIMITED__STARTING:
				setStarting((Condition)newValue);
				return;
			case FuzzingOperationsPackage.CONDITION_BASED_TIME_LIMITED__STARTING_EXPRESSION:
				setStartingExpression((String)newValue);
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
			case FuzzingOperationsPackage.CONDITION_BASED_TIME_LIMITED__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case FuzzingOperationsPackage.CONDITION_BASED_TIME_LIMITED__MAXIMUM_ACTIVATIONS:
				setMaximumActivations(MAXIMUM_ACTIVATIONS_EDEFAULT);
				return;
			case FuzzingOperationsPackage.CONDITION_BASED_TIME_LIMITED__STARTING:
				setStarting((Condition)null);
				return;
			case FuzzingOperationsPackage.CONDITION_BASED_TIME_LIMITED__STARTING_EXPRESSION:
				setStartingExpression(STARTING_EXPRESSION_EDEFAULT);
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
			case FuzzingOperationsPackage.CONDITION_BASED_TIME_LIMITED__LENGTH:
				return length != LENGTH_EDEFAULT;
			case FuzzingOperationsPackage.CONDITION_BASED_TIME_LIMITED__MAXIMUM_ACTIVATIONS:
				return maximumActivations != MAXIMUM_ACTIVATIONS_EDEFAULT;
			case FuzzingOperationsPackage.CONDITION_BASED_TIME_LIMITED__STARTING:
				return starting != null;
			case FuzzingOperationsPackage.CONDITION_BASED_TIME_LIMITED__STARTING_EXPRESSION:
				return STARTING_EXPRESSION_EDEFAULT == null ? startingExpression != null : !STARTING_EXPRESSION_EDEFAULT.equals(startingExpression);
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
		result.append(" (length: ");
		result.append(length);
		result.append(", maximumActivations: ");
		result.append(maximumActivations);
		result.append(", startingExpression: ");
		result.append(startingExpression);
		result.append(')');
		return result.toString();
	}

} //ConditionBasedTimeLimitedImpl
