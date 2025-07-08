/**
 */
package workload.impl;

import graphite.shared.CustomEObjectImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import workload.Effort;
import workload.Person;
import workload.Task;
import workload.WorkloadPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link workload.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link workload.impl.TaskImpl#getLeader <em>Leader</em>}</li>
 *   <li>{@link workload.impl.TaskImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link workload.impl.TaskImpl#getEfforts <em>Efforts</em>}</li>
 *   <li>{@link workload.impl.TaskImpl#getEffortsExpression <em>Efforts Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends CustomEObjectImpl implements Task {
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
	 * The cached value of the '{@link #getLeader() <em>Leader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeader()
	 * @generated
	 * @ordered
	 */
	protected Person leader;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> dependencies;

	/**
	 * The cached value of the '{@link #getEfforts() <em>Efforts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfforts()
	 * @generated
	 * @ordered
	 */
	protected EList<Effort> efforts;

	/**
	 * The default value of the '{@link #getEffortsExpression() <em>Efforts Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffortsExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFORTS_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEffortsExpression() <em>Efforts Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffortsExpression()
	 * @generated
	 * @ordered
	 */
	protected String effortsExpression = EFFORTS_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkloadPackage.Literals.TASK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkloadPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getLeader() {
		if (leader != null && leader.eIsProxy()) {
			InternalEObject oldLeader = (InternalEObject)leader;
			leader = (Person)eResolveProxy(oldLeader);
			if (leader != oldLeader) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkloadPackage.TASK__LEADER, oldLeader, leader));
			}
		}
		return leader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetLeader() {
		return leader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeader(Person newLeader) {
		Person oldLeader = leader;
		leader = newLeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkloadPackage.TASK__LEADER, oldLeader, leader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectResolvingEList<Task>(Task.class, this, WorkloadPackage.TASK__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Effort> getEfforts() {
		if (efforts == null) {
			efforts = new EObjectContainmentEList<Effort>(Effort.class, this, WorkloadPackage.TASK__EFFORTS);
		}
		return efforts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEffortsExpression() {
		return effortsExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffortsExpression(String newEffortsExpression) {
		String oldEffortsExpression = effortsExpression;
		effortsExpression = newEffortsExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkloadPackage.TASK__EFFORTS_EXPRESSION, oldEffortsExpression, effortsExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkloadPackage.TASK__EFFORTS:
				return ((InternalEList<?>)getEfforts()).basicRemove(otherEnd, msgs);
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
			case WorkloadPackage.TASK__NAME:
				return getName();
			case WorkloadPackage.TASK__LEADER:
				if (resolve) return getLeader();
				return basicGetLeader();
			case WorkloadPackage.TASK__DEPENDENCIES:
				return getDependencies();
			case WorkloadPackage.TASK__EFFORTS:
				return getEfforts();
			case WorkloadPackage.TASK__EFFORTS_EXPRESSION:
				return getEffortsExpression();
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
			case WorkloadPackage.TASK__NAME:
				setName((String)newValue);
				return;
			case WorkloadPackage.TASK__LEADER:
				setLeader((Person)newValue);
				return;
			case WorkloadPackage.TASK__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends Task>)newValue);
				return;
			case WorkloadPackage.TASK__EFFORTS:
				getEfforts().clear();
				getEfforts().addAll((Collection<? extends Effort>)newValue);
				return;
			case WorkloadPackage.TASK__EFFORTS_EXPRESSION:
				setEffortsExpression((String)newValue);
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
			case WorkloadPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkloadPackage.TASK__LEADER:
				setLeader((Person)null);
				return;
			case WorkloadPackage.TASK__DEPENDENCIES:
				getDependencies().clear();
				return;
			case WorkloadPackage.TASK__EFFORTS:
				getEfforts().clear();
				return;
			case WorkloadPackage.TASK__EFFORTS_EXPRESSION:
				setEffortsExpression(EFFORTS_EXPRESSION_EDEFAULT);
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
			case WorkloadPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkloadPackage.TASK__LEADER:
				return leader != null;
			case WorkloadPackage.TASK__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case WorkloadPackage.TASK__EFFORTS:
				return efforts != null && !efforts.isEmpty();
			case WorkloadPackage.TASK__EFFORTS_EXPRESSION:
				return EFFORTS_EXPRESSION_EDEFAULT == null ? effortsExpression != null : !EFFORTS_EXPRESSION_EDEFAULT.equals(effortsExpression);
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
		result.append(", effortsExpression: ");
		result.append(effortsExpression);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
