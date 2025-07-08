/**
 */
package TestingPackage.impl;

import TestingPackage.ActivationGenerationMethod;
import TestingPackage.CampaignResultSet;
import TestingPackage.ExecutionEndTrigger;

import TestingPackage.FuzzingOperations.FuzzingOperation;

import TestingPackage.Metrics.Metric;

import TestingPackage.Test;
import TestingPackage.TestCampaign;
import TestingPackage.TestGenerationApproach;
import TestingPackage.TestingMMPackage;

import graphite.shared.CustomEObjectImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Campaign</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.impl.TestCampaignImpl#getName <em>Name</em>}</li>
 *   <li>{@link TestingPackage.impl.TestCampaignImpl#getMetrics <em>Metrics</em>}</li>
 *   <li>{@link TestingPackage.impl.TestCampaignImpl#getConditionMetrics <em>Condition Metrics</em>}</li>
 *   <li>{@link TestingPackage.impl.TestCampaignImpl#getActivationGeneration <em>Activation Generation</em>}</li>
 *   <li>{@link TestingPackage.impl.TestCampaignImpl#getIncludedOperations <em>Included Operations</em>}</li>
 *   <li>{@link TestingPackage.impl.TestCampaignImpl#getApproach <em>Approach</em>}</li>
 *   <li>{@link TestingPackage.impl.TestCampaignImpl#getPerformedTests <em>Performed Tests</em>}</li>
 *   <li>{@link TestingPackage.impl.TestCampaignImpl#getResultSets <em>Result Sets</em>}</li>
 *   <li>{@link TestingPackage.impl.TestCampaignImpl#getEndTrigger <em>End Trigger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestCampaignImpl extends CustomEObjectImpl implements TestCampaign {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetrics() <em>Metrics</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrics()
	 * @generated
	 * @ordered
	 */
	protected EList<Metric> metrics;

	/**
	 * The cached value of the '{@link #getConditionMetrics() <em>Condition Metrics</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionMetrics()
	 * @generated
	 * @ordered
	 */
	protected EList<Metric> conditionMetrics;

	/**
	 * The cached value of the '{@link #getActivationGeneration() <em>Activation Generation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationGeneration()
	 * @generated
	 * @ordered
	 */
	protected ActivationGenerationMethod activationGeneration;

	/**
	 * The cached value of the '{@link #getIncludedOperations() <em>Included Operations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<FuzzingOperation> includedOperations;

	/**
	 * The cached value of the '{@link #getApproach() <em>Approach</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproach()
	 * @generated
	 * @ordered
	 */
	protected TestGenerationApproach approach;

	/**
	 * The cached value of the '{@link #getPerformedTests() <em>Performed Tests</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformedTests()
	 * @generated
	 * @ordered
	 */
	protected EList<Test> performedTests;

	/**
	 * The cached value of the '{@link #getResultSets() <em>Result Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultSets()
	 * @generated
	 * @ordered
	 */
	protected EList<CampaignResultSet> resultSets;

	/**
	 * The cached value of the '{@link #getEndTrigger() <em>End Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTrigger()
	 * @generated
	 * @ordered
	 */
	protected ExecutionEndTrigger endTrigger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestCampaignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestingMMPackage.Literals.TEST_CAMPAIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingMMPackage.TEST_CAMPAIGN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metric> getMetrics() {
		if (metrics == null) {
			metrics = new EObjectResolvingEList<Metric>(Metric.class, this, TestingMMPackage.TEST_CAMPAIGN__METRICS);
		}
		return metrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Metric> getConditionMetrics() {
		if (conditionMetrics == null) {
			conditionMetrics = new EObjectResolvingEList<Metric>(Metric.class, this, TestingMMPackage.TEST_CAMPAIGN__CONDITION_METRICS);
		}
		return conditionMetrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationGenerationMethod getActivationGeneration() {
		return activationGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivationGeneration(ActivationGenerationMethod newActivationGeneration, NotificationChain msgs) {
		ActivationGenerationMethod oldActivationGeneration = activationGeneration;
		activationGeneration = newActivationGeneration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestingMMPackage.TEST_CAMPAIGN__ACTIVATION_GENERATION, oldActivationGeneration, newActivationGeneration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivationGeneration(ActivationGenerationMethod newActivationGeneration) {
		if (newActivationGeneration != activationGeneration) {
			NotificationChain msgs = null;
			if (activationGeneration != null)
				msgs = ((InternalEObject)activationGeneration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestingMMPackage.TEST_CAMPAIGN__ACTIVATION_GENERATION, null, msgs);
			if (newActivationGeneration != null)
				msgs = ((InternalEObject)newActivationGeneration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestingMMPackage.TEST_CAMPAIGN__ACTIVATION_GENERATION, null, msgs);
			msgs = basicSetActivationGeneration(newActivationGeneration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingMMPackage.TEST_CAMPAIGN__ACTIVATION_GENERATION, newActivationGeneration, newActivationGeneration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FuzzingOperation> getIncludedOperations() {
		if (includedOperations == null) {
			includedOperations = new EObjectResolvingEList<FuzzingOperation>(FuzzingOperation.class, this, TestingMMPackage.TEST_CAMPAIGN__INCLUDED_OPERATIONS);
		}
		return includedOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestGenerationApproach getApproach() {
		return approach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApproach(TestGenerationApproach newApproach, NotificationChain msgs) {
		TestGenerationApproach oldApproach = approach;
		approach = newApproach;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestingMMPackage.TEST_CAMPAIGN__APPROACH, oldApproach, newApproach);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApproach(TestGenerationApproach newApproach) {
		if (newApproach != approach) {
			NotificationChain msgs = null;
			if (approach != null)
				msgs = ((InternalEObject)approach).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestingMMPackage.TEST_CAMPAIGN__APPROACH, null, msgs);
			if (newApproach != null)
				msgs = ((InternalEObject)newApproach).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestingMMPackage.TEST_CAMPAIGN__APPROACH, null, msgs);
			msgs = basicSetApproach(newApproach, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingMMPackage.TEST_CAMPAIGN__APPROACH, newApproach, newApproach));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Test> getPerformedTests() {
		if (performedTests == null) {
			performedTests = new EObjectContainmentWithInverseEList<Test>(Test.class, this, TestingMMPackage.TEST_CAMPAIGN__PERFORMED_TESTS, TestingMMPackage.TEST__PARENT_CAMPAIGN);
		}
		return performedTests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CampaignResultSet> getResultSets() {
		if (resultSets == null) {
			resultSets = new EObjectContainmentEList<CampaignResultSet>(CampaignResultSet.class, this, TestingMMPackage.TEST_CAMPAIGN__RESULT_SETS);
		}
		return resultSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionEndTrigger getEndTrigger() {
		return endTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndTrigger(ExecutionEndTrigger newEndTrigger, NotificationChain msgs) {
		ExecutionEndTrigger oldEndTrigger = endTrigger;
		endTrigger = newEndTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestingMMPackage.TEST_CAMPAIGN__END_TRIGGER, oldEndTrigger, newEndTrigger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTrigger(ExecutionEndTrigger newEndTrigger) {
		if (newEndTrigger != endTrigger) {
			NotificationChain msgs = null;
			if (endTrigger != null)
				msgs = ((InternalEObject)endTrigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestingMMPackage.TEST_CAMPAIGN__END_TRIGGER, null, msgs);
			if (newEndTrigger != null)
				msgs = ((InternalEObject)newEndTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestingMMPackage.TEST_CAMPAIGN__END_TRIGGER, null, msgs);
			msgs = basicSetEndTrigger(newEndTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingMMPackage.TEST_CAMPAIGN__END_TRIGGER, newEndTrigger, newEndTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestingMMPackage.TEST_CAMPAIGN__PERFORMED_TESTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPerformedTests()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestingMMPackage.TEST_CAMPAIGN__ACTIVATION_GENERATION:
				return basicSetActivationGeneration(null, msgs);
			case TestingMMPackage.TEST_CAMPAIGN__APPROACH:
				return basicSetApproach(null, msgs);
			case TestingMMPackage.TEST_CAMPAIGN__PERFORMED_TESTS:
				return ((InternalEList<?>)getPerformedTests()).basicRemove(otherEnd, msgs);
			case TestingMMPackage.TEST_CAMPAIGN__RESULT_SETS:
				return ((InternalEList<?>)getResultSets()).basicRemove(otherEnd, msgs);
			case TestingMMPackage.TEST_CAMPAIGN__END_TRIGGER:
				return basicSetEndTrigger(null, msgs);
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
			case TestingMMPackage.TEST_CAMPAIGN__NAME:
				return getName();
			case TestingMMPackage.TEST_CAMPAIGN__METRICS:
				return getMetrics();
			case TestingMMPackage.TEST_CAMPAIGN__CONDITION_METRICS:
				return getConditionMetrics();
			case TestingMMPackage.TEST_CAMPAIGN__ACTIVATION_GENERATION:
				return getActivationGeneration();
			case TestingMMPackage.TEST_CAMPAIGN__INCLUDED_OPERATIONS:
				return getIncludedOperations();
			case TestingMMPackage.TEST_CAMPAIGN__APPROACH:
				return getApproach();
			case TestingMMPackage.TEST_CAMPAIGN__PERFORMED_TESTS:
				return getPerformedTests();
			case TestingMMPackage.TEST_CAMPAIGN__RESULT_SETS:
				return getResultSets();
			case TestingMMPackage.TEST_CAMPAIGN__END_TRIGGER:
				return getEndTrigger();
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
			case TestingMMPackage.TEST_CAMPAIGN__NAME:
				setName((String)newValue);
				return;
			case TestingMMPackage.TEST_CAMPAIGN__METRICS:
				getMetrics().clear();
				getMetrics().addAll((Collection<? extends Metric>)newValue);
				return;
			case TestingMMPackage.TEST_CAMPAIGN__CONDITION_METRICS:
				getConditionMetrics().clear();
				getConditionMetrics().addAll((Collection<? extends Metric>)newValue);
				return;
			case TestingMMPackage.TEST_CAMPAIGN__ACTIVATION_GENERATION:
				setActivationGeneration((ActivationGenerationMethod)newValue);
				return;
			case TestingMMPackage.TEST_CAMPAIGN__INCLUDED_OPERATIONS:
				getIncludedOperations().clear();
				getIncludedOperations().addAll((Collection<? extends FuzzingOperation>)newValue);
				return;
			case TestingMMPackage.TEST_CAMPAIGN__APPROACH:
				setApproach((TestGenerationApproach)newValue);
				return;
			case TestingMMPackage.TEST_CAMPAIGN__PERFORMED_TESTS:
				getPerformedTests().clear();
				getPerformedTests().addAll((Collection<? extends Test>)newValue);
				return;
			case TestingMMPackage.TEST_CAMPAIGN__RESULT_SETS:
				getResultSets().clear();
				getResultSets().addAll((Collection<? extends CampaignResultSet>)newValue);
				return;
			case TestingMMPackage.TEST_CAMPAIGN__END_TRIGGER:
				setEndTrigger((ExecutionEndTrigger)newValue);
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
			case TestingMMPackage.TEST_CAMPAIGN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TestingMMPackage.TEST_CAMPAIGN__METRICS:
				getMetrics().clear();
				return;
			case TestingMMPackage.TEST_CAMPAIGN__CONDITION_METRICS:
				getConditionMetrics().clear();
				return;
			case TestingMMPackage.TEST_CAMPAIGN__ACTIVATION_GENERATION:
				setActivationGeneration((ActivationGenerationMethod)null);
				return;
			case TestingMMPackage.TEST_CAMPAIGN__INCLUDED_OPERATIONS:
				getIncludedOperations().clear();
				return;
			case TestingMMPackage.TEST_CAMPAIGN__APPROACH:
				setApproach((TestGenerationApproach)null);
				return;
			case TestingMMPackage.TEST_CAMPAIGN__PERFORMED_TESTS:
				getPerformedTests().clear();
				return;
			case TestingMMPackage.TEST_CAMPAIGN__RESULT_SETS:
				getResultSets().clear();
				return;
			case TestingMMPackage.TEST_CAMPAIGN__END_TRIGGER:
				setEndTrigger((ExecutionEndTrigger)null);
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
			case TestingMMPackage.TEST_CAMPAIGN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TestingMMPackage.TEST_CAMPAIGN__METRICS:
				return metrics != null && !metrics.isEmpty();
			case TestingMMPackage.TEST_CAMPAIGN__CONDITION_METRICS:
				return conditionMetrics != null && !conditionMetrics.isEmpty();
			case TestingMMPackage.TEST_CAMPAIGN__ACTIVATION_GENERATION:
				return activationGeneration != null;
			case TestingMMPackage.TEST_CAMPAIGN__INCLUDED_OPERATIONS:
				return includedOperations != null && !includedOperations.isEmpty();
			case TestingMMPackage.TEST_CAMPAIGN__APPROACH:
				return approach != null;
			case TestingMMPackage.TEST_CAMPAIGN__PERFORMED_TESTS:
				return performedTests != null && !performedTests.isEmpty();
			case TestingMMPackage.TEST_CAMPAIGN__RESULT_SETS:
				return resultSets != null && !resultSets.isEmpty();
			case TestingMMPackage.TEST_CAMPAIGN__END_TRIGGER:
				return endTrigger != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TestCampaignImpl
