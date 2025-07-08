/**
 */
package TestingPackage.FuzzingOperations.impl;

import TestingPackage.FuzzingOperations.ConditionBasedActivation;
import TestingPackage.FuzzingOperations.FuzzingOperationsPackage;

import TestingPackage.StandardGrammar.Condition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Based Activation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.ConditionBasedActivationImpl#getMaximumActivations <em>Maximum Activations</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.ConditionBasedActivationImpl#getStarting <em>Starting</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.ConditionBasedActivationImpl#getEnding <em>Ending</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.ConditionBasedActivationImpl#getStartingExpression <em>Starting Expression</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.ConditionBasedActivationImpl#getEndingExpression <em>Ending Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionBasedActivationImpl extends ActivationImpl implements ConditionBasedActivation {
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
	 * The cached value of the '{@link #getEnding() <em>Ending</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnding()
	 * @generated
	 * @ordered
	 */
	protected Condition ending;

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
	 * The default value of the '{@link #getEndingExpression() <em>Ending Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDING_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndingExpression() <em>Ending Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingExpression()
	 * @generated
	 * @ordered
	 */
	protected String endingExpression = ENDING_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionBasedActivationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FuzzingOperationsPackage.Literals.CONDITION_BASED_ACTIVATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__MAXIMUM_ACTIVATIONS, oldMaximumActivations, maximumActivations));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__STARTING, oldStarting, newStarting);
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
				msgs = ((InternalEObject)starting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__STARTING, null, msgs);
			if (newStarting != null)
				msgs = ((InternalEObject)newStarting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__STARTING, null, msgs);
			msgs = basicSetStarting(newStarting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__STARTING, newStarting, newStarting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getEnding() {
		return ending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnding(Condition newEnding, NotificationChain msgs) {
		Condition oldEnding = ending;
		ending = newEnding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__ENDING, oldEnding, newEnding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnding(Condition newEnding) {
		if (newEnding != ending) {
			NotificationChain msgs = null;
			if (ending != null)
				msgs = ((InternalEObject)ending).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__ENDING, null, msgs);
			if (newEnding != null)
				msgs = ((InternalEObject)newEnding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__ENDING, null, msgs);
			msgs = basicSetEnding(newEnding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__ENDING, newEnding, newEnding));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__STARTING_EXPRESSION, oldStartingExpression, startingExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndingExpression() {
		return endingExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndingExpression(String newEndingExpression) {
		String oldEndingExpression = endingExpression;
		endingExpression = newEndingExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__ENDING_EXPRESSION, oldEndingExpression, endingExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__STARTING:
				return basicSetStarting(null, msgs);
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__ENDING:
				return basicSetEnding(null, msgs);
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
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__MAXIMUM_ACTIVATIONS:
				return getMaximumActivations();
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__STARTING:
				return getStarting();
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__ENDING:
				return getEnding();
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__STARTING_EXPRESSION:
				return getStartingExpression();
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__ENDING_EXPRESSION:
				return getEndingExpression();
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
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__MAXIMUM_ACTIVATIONS:
				setMaximumActivations((Integer)newValue);
				return;
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__STARTING:
				setStarting((Condition)newValue);
				return;
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__ENDING:
				setEnding((Condition)newValue);
				return;
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__STARTING_EXPRESSION:
				setStartingExpression((String)newValue);
				return;
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__ENDING_EXPRESSION:
				setEndingExpression((String)newValue);
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
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__MAXIMUM_ACTIVATIONS:
				setMaximumActivations(MAXIMUM_ACTIVATIONS_EDEFAULT);
				return;
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__STARTING:
				setStarting((Condition)null);
				return;
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__ENDING:
				setEnding((Condition)null);
				return;
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__STARTING_EXPRESSION:
				setStartingExpression(STARTING_EXPRESSION_EDEFAULT);
				return;
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__ENDING_EXPRESSION:
				setEndingExpression(ENDING_EXPRESSION_EDEFAULT);
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
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__MAXIMUM_ACTIVATIONS:
				return maximumActivations != MAXIMUM_ACTIVATIONS_EDEFAULT;
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__STARTING:
				return starting != null;
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__ENDING:
				return ending != null;
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__STARTING_EXPRESSION:
				return STARTING_EXPRESSION_EDEFAULT == null ? startingExpression != null : !STARTING_EXPRESSION_EDEFAULT.equals(startingExpression);
			case FuzzingOperationsPackage.CONDITION_BASED_ACTIVATION__ENDING_EXPRESSION:
				return ENDING_EXPRESSION_EDEFAULT == null ? endingExpression != null : !ENDING_EXPRESSION_EDEFAULT.equals(endingExpression);
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
		result.append(" (maximumActivations: ");
		result.append(maximumActivations);
		result.append(", startingExpression: ");
		result.append(startingExpression);
		result.append(", endingExpression: ");
		result.append(endingExpression);
		result.append(')');
		return result.toString();
	}

} //ConditionBasedActivationImpl
