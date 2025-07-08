/**
 */
package TestingPackage.MRSPackage.impl;

import TestingPackage.MRSPackage.MRS;
import TestingPackage.MRSPackage.MRSPackagePackage;
import TestingPackage.MRSPackage.Node;
import TestingPackage.MRSPackage.Simulator;
import TestingPackage.MRSPackage.Type;
import TestingPackage.MRSPackage.Variable;

import graphite.shared.CustomEObjectImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MRS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.MRSPackage.impl.MRSImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link TestingPackage.MRSPackage.impl.MRSImpl#getLaunchFileLocation <em>Launch File Location</em>}</li>
 *   <li>{@link TestingPackage.MRSPackage.impl.MRSImpl#getLaunchDelaySeconds <em>Launch Delay Seconds</em>}</li>
 *   <li>{@link TestingPackage.MRSPackage.impl.MRSImpl#getCustomTerminateFileLocation <em>Custom Terminate File Location</em>}</li>
 *   <li>{@link TestingPackage.MRSPackage.impl.MRSImpl#getRecordFileLocation <em>Record File Location</em>}</li>
 *   <li>{@link TestingPackage.MRSPackage.impl.MRSImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link TestingPackage.MRSPackage.impl.MRSImpl#getSimulator <em>Simulator</em>}</li>
 *   <li>{@link TestingPackage.MRSPackage.impl.MRSImpl#getPropertyType <em>Property Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MRSImpl extends CustomEObjectImpl implements MRS {
	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The default value of the '{@link #getLaunchFileLocation() <em>Launch File Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchFileLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LAUNCH_FILE_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLaunchFileLocation() <em>Launch File Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchFileLocation()
	 * @generated
	 * @ordered
	 */
	protected String launchFileLocation = LAUNCH_FILE_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLaunchDelaySeconds() <em>Launch Delay Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchDelaySeconds()
	 * @generated
	 * @ordered
	 */
	protected static final int LAUNCH_DELAY_SECONDS_EDEFAULT = 40;

	/**
	 * The cached value of the '{@link #getLaunchDelaySeconds() <em>Launch Delay Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchDelaySeconds()
	 * @generated
	 * @ordered
	 */
	protected int launchDelaySeconds = LAUNCH_DELAY_SECONDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomTerminateFileLocation() <em>Custom Terminate File Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomTerminateFileLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_TERMINATE_FILE_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomTerminateFileLocation() <em>Custom Terminate File Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomTerminateFileLocation()
	 * @generated
	 * @ordered
	 */
	protected String customTerminateFileLocation = CUSTOM_TERMINATE_FILE_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecordFileLocation() <em>Record File Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordFileLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String RECORD_FILE_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecordFileLocation() <em>Record File Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordFileLocation()
	 * @generated
	 * @ordered
	 */
	protected String recordFileLocation = RECORD_FILE_LOCATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getSimulator() <em>Simulator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulator()
	 * @generated
	 * @ordered
	 */
	protected Simulator simulator;

	/**
	 * The cached value of the '{@link #getPropertyType() <em>Property Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> propertyType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MRSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MRSPackagePackage.Literals.MRS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, MRSPackagePackage.MRS__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLaunchFileLocation() {
		return launchFileLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLaunchFileLocation(String newLaunchFileLocation) {
		String oldLaunchFileLocation = launchFileLocation;
		launchFileLocation = newLaunchFileLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRSPackagePackage.MRS__LAUNCH_FILE_LOCATION, oldLaunchFileLocation, launchFileLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLaunchDelaySeconds() {
		return launchDelaySeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLaunchDelaySeconds(int newLaunchDelaySeconds) {
		int oldLaunchDelaySeconds = launchDelaySeconds;
		launchDelaySeconds = newLaunchDelaySeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRSPackagePackage.MRS__LAUNCH_DELAY_SECONDS, oldLaunchDelaySeconds, launchDelaySeconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomTerminateFileLocation() {
		return customTerminateFileLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomTerminateFileLocation(String newCustomTerminateFileLocation) {
		String oldCustomTerminateFileLocation = customTerminateFileLocation;
		customTerminateFileLocation = newCustomTerminateFileLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRSPackagePackage.MRS__CUSTOM_TERMINATE_FILE_LOCATION, oldCustomTerminateFileLocation, customTerminateFileLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecordFileLocation() {
		return recordFileLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordFileLocation(String newRecordFileLocation) {
		String oldRecordFileLocation = recordFileLocation;
		recordFileLocation = newRecordFileLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRSPackagePackage.MRS__RECORD_FILE_LOCATION, oldRecordFileLocation, recordFileLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, MRSPackagePackage.MRS__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simulator getSimulator() {
		return simulator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimulator(Simulator newSimulator, NotificationChain msgs) {
		Simulator oldSimulator = simulator;
		simulator = newSimulator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MRSPackagePackage.MRS__SIMULATOR, oldSimulator, newSimulator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulator(Simulator newSimulator) {
		if (newSimulator != simulator) {
			NotificationChain msgs = null;
			if (simulator != null)
				msgs = ((InternalEObject)simulator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MRSPackagePackage.MRS__SIMULATOR, null, msgs);
			if (newSimulator != null)
				msgs = ((InternalEObject)newSimulator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MRSPackagePackage.MRS__SIMULATOR, null, msgs);
			msgs = basicSetSimulator(newSimulator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MRSPackagePackage.MRS__SIMULATOR, newSimulator, newSimulator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getPropertyType() {
		if (propertyType == null) {
			propertyType = new EObjectContainmentEList<Type>(Type.class, this, MRSPackagePackage.MRS__PROPERTY_TYPE);
		}
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MRSPackagePackage.MRS__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case MRSPackagePackage.MRS__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case MRSPackagePackage.MRS__SIMULATOR:
				return basicSetSimulator(null, msgs);
			case MRSPackagePackage.MRS__PROPERTY_TYPE:
				return ((InternalEList<?>)getPropertyType()).basicRemove(otherEnd, msgs);
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
			case MRSPackagePackage.MRS__VARIABLES:
				return getVariables();
			case MRSPackagePackage.MRS__LAUNCH_FILE_LOCATION:
				return getLaunchFileLocation();
			case MRSPackagePackage.MRS__LAUNCH_DELAY_SECONDS:
				return getLaunchDelaySeconds();
			case MRSPackagePackage.MRS__CUSTOM_TERMINATE_FILE_LOCATION:
				return getCustomTerminateFileLocation();
			case MRSPackagePackage.MRS__RECORD_FILE_LOCATION:
				return getRecordFileLocation();
			case MRSPackagePackage.MRS__NODES:
				return getNodes();
			case MRSPackagePackage.MRS__SIMULATOR:
				return getSimulator();
			case MRSPackagePackage.MRS__PROPERTY_TYPE:
				return getPropertyType();
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
			case MRSPackagePackage.MRS__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case MRSPackagePackage.MRS__LAUNCH_FILE_LOCATION:
				setLaunchFileLocation((String)newValue);
				return;
			case MRSPackagePackage.MRS__LAUNCH_DELAY_SECONDS:
				setLaunchDelaySeconds((Integer)newValue);
				return;
			case MRSPackagePackage.MRS__CUSTOM_TERMINATE_FILE_LOCATION:
				setCustomTerminateFileLocation((String)newValue);
				return;
			case MRSPackagePackage.MRS__RECORD_FILE_LOCATION:
				setRecordFileLocation((String)newValue);
				return;
			case MRSPackagePackage.MRS__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case MRSPackagePackage.MRS__SIMULATOR:
				setSimulator((Simulator)newValue);
				return;
			case MRSPackagePackage.MRS__PROPERTY_TYPE:
				getPropertyType().clear();
				getPropertyType().addAll((Collection<? extends Type>)newValue);
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
			case MRSPackagePackage.MRS__VARIABLES:
				getVariables().clear();
				return;
			case MRSPackagePackage.MRS__LAUNCH_FILE_LOCATION:
				setLaunchFileLocation(LAUNCH_FILE_LOCATION_EDEFAULT);
				return;
			case MRSPackagePackage.MRS__LAUNCH_DELAY_SECONDS:
				setLaunchDelaySeconds(LAUNCH_DELAY_SECONDS_EDEFAULT);
				return;
			case MRSPackagePackage.MRS__CUSTOM_TERMINATE_FILE_LOCATION:
				setCustomTerminateFileLocation(CUSTOM_TERMINATE_FILE_LOCATION_EDEFAULT);
				return;
			case MRSPackagePackage.MRS__RECORD_FILE_LOCATION:
				setRecordFileLocation(RECORD_FILE_LOCATION_EDEFAULT);
				return;
			case MRSPackagePackage.MRS__NODES:
				getNodes().clear();
				return;
			case MRSPackagePackage.MRS__SIMULATOR:
				setSimulator((Simulator)null);
				return;
			case MRSPackagePackage.MRS__PROPERTY_TYPE:
				getPropertyType().clear();
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
			case MRSPackagePackage.MRS__VARIABLES:
				return variables != null && !variables.isEmpty();
			case MRSPackagePackage.MRS__LAUNCH_FILE_LOCATION:
				return LAUNCH_FILE_LOCATION_EDEFAULT == null ? launchFileLocation != null : !LAUNCH_FILE_LOCATION_EDEFAULT.equals(launchFileLocation);
			case MRSPackagePackage.MRS__LAUNCH_DELAY_SECONDS:
				return launchDelaySeconds != LAUNCH_DELAY_SECONDS_EDEFAULT;
			case MRSPackagePackage.MRS__CUSTOM_TERMINATE_FILE_LOCATION:
				return CUSTOM_TERMINATE_FILE_LOCATION_EDEFAULT == null ? customTerminateFileLocation != null : !CUSTOM_TERMINATE_FILE_LOCATION_EDEFAULT.equals(customTerminateFileLocation);
			case MRSPackagePackage.MRS__RECORD_FILE_LOCATION:
				return RECORD_FILE_LOCATION_EDEFAULT == null ? recordFileLocation != null : !RECORD_FILE_LOCATION_EDEFAULT.equals(recordFileLocation);
			case MRSPackagePackage.MRS__NODES:
				return nodes != null && !nodes.isEmpty();
			case MRSPackagePackage.MRS__SIMULATOR:
				return simulator != null;
			case MRSPackagePackage.MRS__PROPERTY_TYPE:
				return propertyType != null && !propertyType.isEmpty();
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
		result.append(" (launchFileLocation: ");
		result.append(launchFileLocation);
		result.append(", launchDelaySeconds: ");
		result.append(launchDelaySeconds);
		result.append(", customTerminateFileLocation: ");
		result.append(customTerminateFileLocation);
		result.append(", recordFileLocation: ");
		result.append(recordFileLocation);
		result.append(')');
		return result.toString();
	}

} //MRSImpl
