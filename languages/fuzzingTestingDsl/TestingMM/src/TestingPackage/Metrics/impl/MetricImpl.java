/**
 */
package TestingPackage.Metrics.impl;

import TestingPackage.MRSPackage.Variable;

import TestingPackage.Metrics.Metric;
import TestingPackage.Metrics.MetricDefault;
import TestingPackage.Metrics.MetricOptimisationDirection;
import TestingPackage.Metrics.MetricsPackage;

import graphite.shared.CustomEObjectImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.Metrics.impl.MetricImpl#getName <em>Name</em>}</li>
 *   <li>{@link TestingPackage.Metrics.impl.MetricImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link TestingPackage.Metrics.impl.MetricImpl#getRelatedVariables <em>Related Variables</em>}</li>
 *   <li>{@link TestingPackage.Metrics.impl.MetricImpl#getValueIfNotReceived <em>Value If Not Received</em>}</li>
 *   <li>{@link TestingPackage.Metrics.impl.MetricImpl#getInitValue <em>Init Value</em>}</li>
 *   <li>{@link TestingPackage.Metrics.impl.MetricImpl#isUseInOptimisation <em>Use In Optimisation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MetricImpl extends CustomEObjectImpl implements Metric {
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
	 * The default value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected static final MetricOptimisationDirection DIR_EDEFAULT = MetricOptimisationDirection.HIGHEST;

	/**
	 * The cached value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected MetricOptimisationDirection dir = DIR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelatedVariables() <em>Related Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> relatedVariables;

	/**
	 * The cached value of the '{@link #getValueIfNotReceived() <em>Value If Not Received</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueIfNotReceived()
	 * @generated
	 * @ordered
	 */
	protected MetricDefault valueIfNotReceived;

	/**
	 * The cached value of the '{@link #getInitValue() <em>Init Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitValue()
	 * @generated
	 * @ordered
	 */
	protected MetricDefault initValue;

	/**
	 * The default value of the '{@link #isUseInOptimisation() <em>Use In Optimisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseInOptimisation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_IN_OPTIMISATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseInOptimisation() <em>Use In Optimisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseInOptimisation()
	 * @generated
	 * @ordered
	 */
	protected boolean useInOptimisation = USE_IN_OPTIMISATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.METRIC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.METRIC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricOptimisationDirection getDir() {
		return dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDir(MetricOptimisationDirection newDir) {
		MetricOptimisationDirection oldDir = dir;
		dir = newDir == null ? DIR_EDEFAULT : newDir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.METRIC__DIR, oldDir, dir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getRelatedVariables() {
		if (relatedVariables == null) {
			relatedVariables = new EObjectResolvingEList<Variable>(Variable.class, this, MetricsPackage.METRIC__RELATED_VARIABLES);
		}
		return relatedVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricDefault getValueIfNotReceived() {
		return valueIfNotReceived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueIfNotReceived(MetricDefault newValueIfNotReceived, NotificationChain msgs) {
		MetricDefault oldValueIfNotReceived = valueIfNotReceived;
		valueIfNotReceived = newValueIfNotReceived;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetricsPackage.METRIC__VALUE_IF_NOT_RECEIVED, oldValueIfNotReceived, newValueIfNotReceived);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueIfNotReceived(MetricDefault newValueIfNotReceived) {
		if (newValueIfNotReceived != valueIfNotReceived) {
			NotificationChain msgs = null;
			if (valueIfNotReceived != null)
				msgs = ((InternalEObject)valueIfNotReceived).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetricsPackage.METRIC__VALUE_IF_NOT_RECEIVED, null, msgs);
			if (newValueIfNotReceived != null)
				msgs = ((InternalEObject)newValueIfNotReceived).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetricsPackage.METRIC__VALUE_IF_NOT_RECEIVED, null, msgs);
			msgs = basicSetValueIfNotReceived(newValueIfNotReceived, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.METRIC__VALUE_IF_NOT_RECEIVED, newValueIfNotReceived, newValueIfNotReceived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetricDefault getInitValue() {
		return initValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitValue(MetricDefault newInitValue, NotificationChain msgs) {
		MetricDefault oldInitValue = initValue;
		initValue = newInitValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetricsPackage.METRIC__INIT_VALUE, oldInitValue, newInitValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitValue(MetricDefault newInitValue) {
		if (newInitValue != initValue) {
			NotificationChain msgs = null;
			if (initValue != null)
				msgs = ((InternalEObject)initValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetricsPackage.METRIC__INIT_VALUE, null, msgs);
			if (newInitValue != null)
				msgs = ((InternalEObject)newInitValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetricsPackage.METRIC__INIT_VALUE, null, msgs);
			msgs = basicSetInitValue(newInitValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.METRIC__INIT_VALUE, newInitValue, newInitValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseInOptimisation() {
		return useInOptimisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseInOptimisation(boolean newUseInOptimisation) {
		boolean oldUseInOptimisation = useInOptimisation;
		useInOptimisation = newUseInOptimisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.METRIC__USE_IN_OPTIMISATION, oldUseInOptimisation, useInOptimisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetricsPackage.METRIC__VALUE_IF_NOT_RECEIVED:
				return basicSetValueIfNotReceived(null, msgs);
			case MetricsPackage.METRIC__INIT_VALUE:
				return basicSetInitValue(null, msgs);
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
			case MetricsPackage.METRIC__NAME:
				return getName();
			case MetricsPackage.METRIC__DIR:
				return getDir();
			case MetricsPackage.METRIC__RELATED_VARIABLES:
				return getRelatedVariables();
			case MetricsPackage.METRIC__VALUE_IF_NOT_RECEIVED:
				return getValueIfNotReceived();
			case MetricsPackage.METRIC__INIT_VALUE:
				return getInitValue();
			case MetricsPackage.METRIC__USE_IN_OPTIMISATION:
				return isUseInOptimisation();
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
			case MetricsPackage.METRIC__NAME:
				setName((String)newValue);
				return;
			case MetricsPackage.METRIC__DIR:
				setDir((MetricOptimisationDirection)newValue);
				return;
			case MetricsPackage.METRIC__RELATED_VARIABLES:
				getRelatedVariables().clear();
				getRelatedVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case MetricsPackage.METRIC__VALUE_IF_NOT_RECEIVED:
				setValueIfNotReceived((MetricDefault)newValue);
				return;
			case MetricsPackage.METRIC__INIT_VALUE:
				setInitValue((MetricDefault)newValue);
				return;
			case MetricsPackage.METRIC__USE_IN_OPTIMISATION:
				setUseInOptimisation((Boolean)newValue);
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
			case MetricsPackage.METRIC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetricsPackage.METRIC__DIR:
				setDir(DIR_EDEFAULT);
				return;
			case MetricsPackage.METRIC__RELATED_VARIABLES:
				getRelatedVariables().clear();
				return;
			case MetricsPackage.METRIC__VALUE_IF_NOT_RECEIVED:
				setValueIfNotReceived((MetricDefault)null);
				return;
			case MetricsPackage.METRIC__INIT_VALUE:
				setInitValue((MetricDefault)null);
				return;
			case MetricsPackage.METRIC__USE_IN_OPTIMISATION:
				setUseInOptimisation(USE_IN_OPTIMISATION_EDEFAULT);
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
			case MetricsPackage.METRIC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetricsPackage.METRIC__DIR:
				return dir != DIR_EDEFAULT;
			case MetricsPackage.METRIC__RELATED_VARIABLES:
				return relatedVariables != null && !relatedVariables.isEmpty();
			case MetricsPackage.METRIC__VALUE_IF_NOT_RECEIVED:
				return valueIfNotReceived != null;
			case MetricsPackage.METRIC__INIT_VALUE:
				return initValue != null;
			case MetricsPackage.METRIC__USE_IN_OPTIMISATION:
				return useInOptimisation != USE_IN_OPTIMISATION_EDEFAULT;
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
		result.append(", dir: ");
		result.append(dir);
		result.append(", useInOptimisation: ");
		result.append(useInOptimisation);
		result.append(')');
		return result.toString();
	}

} //MetricImpl
