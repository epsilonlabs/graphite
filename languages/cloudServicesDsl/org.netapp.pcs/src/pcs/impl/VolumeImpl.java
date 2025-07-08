/**
 */
package pcs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import pcs.Environment;
import pcs.PcsPackage;
import pcs.SnapshotPolicy;
import pcs.Volume;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcs.impl.VolumeImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link pcs.impl.VolumeImpl#getSnapshot_policy <em>Snapshot policy</em>}</li>
 *   <li>{@link pcs.impl.VolumeImpl#getState <em>State</em>}</li>
 *   <li>{@link pcs.impl.VolumeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link pcs.impl.VolumeImpl#getSize_unit <em>Size unit</em>}</li>
 *   <li>{@link pcs.impl.VolumeImpl#getSvm_name <em>Svm name</em>}</li>
 *   <li>{@link pcs.impl.VolumeImpl#getExport_policy_type <em>Export policy type</em>}</li>
 *   <li>{@link pcs.impl.VolumeImpl#getExport_policy_ip <em>Export policy ip</em>}</li>
 *   <li>{@link pcs.impl.VolumeImpl#getExport_policy_nfs_version <em>Export policy nfs version</em>}</li>
 *   <li>{@link pcs.impl.VolumeImpl#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VolumeImpl extends NamedElementImpl implements Volume {
	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected Environment environment;

	/**
	 * The cached value of the '{@link #getSnapshot_policy() <em>Snapshot policy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnapshot_policy()
	 * @generated
	 * @ordered
	 */
	protected SnapshotPolicy snapshot_policy;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final double SIZE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected double size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize_unit() <em>Size unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize_unit()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize_unit() <em>Size unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize_unit()
	 * @generated
	 * @ordered
	 */
	protected String size_unit = SIZE_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSvm_name() <em>Svm name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvm_name()
	 * @generated
	 * @ordered
	 */
	protected static final String SVM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSvm_name() <em>Svm name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvm_name()
	 * @generated
	 * @ordered
	 */
	protected String svm_name = SVM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExport_policy_type() <em>Export policy type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExport_policy_type()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPORT_POLICY_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExport_policy_type() <em>Export policy type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExport_policy_type()
	 * @generated
	 * @ordered
	 */
	protected String export_policy_type = EXPORT_POLICY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExport_policy_ip() <em>Export policy ip</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExport_policy_ip()
	 * @generated
	 * @ordered
	 */
	protected EList<String> export_policy_ip;

	/**
	 * The cached value of the '{@link #getExport_policy_nfs_version() <em>Export policy nfs version</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExport_policy_nfs_version()
	 * @generated
	 * @ordered
	 */
	protected EList<String> export_policy_nfs_version;

	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final int MULTIPLICITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected int multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VolumeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcsPackage.Literals.VOLUME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getEnvironment() {
		if (environment != null && environment.eIsProxy()) {
			InternalEObject oldEnvironment = (InternalEObject)environment;
			environment = (Environment)eResolveProxy(oldEnvironment);
			if (environment != oldEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PcsPackage.VOLUME__ENVIRONMENT, oldEnvironment, environment));
			}
		}
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment basicGetEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(Environment newEnvironment) {
		Environment oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.VOLUME__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnapshotPolicy getSnapshot_policy() {
		if (snapshot_policy != null && snapshot_policy.eIsProxy()) {
			InternalEObject oldSnapshot_policy = (InternalEObject)snapshot_policy;
			snapshot_policy = (SnapshotPolicy)eResolveProxy(oldSnapshot_policy);
			if (snapshot_policy != oldSnapshot_policy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PcsPackage.VOLUME__SNAPSHOT_POLICY, oldSnapshot_policy, snapshot_policy));
			}
		}
		return snapshot_policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnapshotPolicy basicGetSnapshot_policy() {
		return snapshot_policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSnapshot_policy(SnapshotPolicy newSnapshot_policy) {
		SnapshotPolicy oldSnapshot_policy = snapshot_policy;
		snapshot_policy = newSnapshot_policy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.VOLUME__SNAPSHOT_POLICY, oldSnapshot_policy, snapshot_policy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.VOLUME__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(double newSize) {
		double oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.VOLUME__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSize_unit() {
		return size_unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize_unit(String newSize_unit) {
		String oldSize_unit = size_unit;
		size_unit = newSize_unit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.VOLUME__SIZE_UNIT, oldSize_unit, size_unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSvm_name() {
		return svm_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSvm_name(String newSvm_name) {
		String oldSvm_name = svm_name;
		svm_name = newSvm_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.VOLUME__SVM_NAME, oldSvm_name, svm_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExport_policy_type() {
		return export_policy_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExport_policy_type(String newExport_policy_type) {
		String oldExport_policy_type = export_policy_type;
		export_policy_type = newExport_policy_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.VOLUME__EXPORT_POLICY_TYPE, oldExport_policy_type, export_policy_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExport_policy_ip() {
		if (export_policy_ip == null) {
			export_policy_ip = new EDataTypeUniqueEList<String>(String.class, this, PcsPackage.VOLUME__EXPORT_POLICY_IP);
		}
		return export_policy_ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExport_policy_nfs_version() {
		if (export_policy_nfs_version == null) {
			export_policy_nfs_version = new EDataTypeUniqueEList<String>(String.class, this, PcsPackage.VOLUME__EXPORT_POLICY_NFS_VERSION);
		}
		return export_policy_nfs_version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(int newMultiplicity) {
		int oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.VOLUME__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcsPackage.VOLUME__ENVIRONMENT:
				if (resolve) return getEnvironment();
				return basicGetEnvironment();
			case PcsPackage.VOLUME__SNAPSHOT_POLICY:
				if (resolve) return getSnapshot_policy();
				return basicGetSnapshot_policy();
			case PcsPackage.VOLUME__STATE:
				return getState();
			case PcsPackage.VOLUME__SIZE:
				return getSize();
			case PcsPackage.VOLUME__SIZE_UNIT:
				return getSize_unit();
			case PcsPackage.VOLUME__SVM_NAME:
				return getSvm_name();
			case PcsPackage.VOLUME__EXPORT_POLICY_TYPE:
				return getExport_policy_type();
			case PcsPackage.VOLUME__EXPORT_POLICY_IP:
				return getExport_policy_ip();
			case PcsPackage.VOLUME__EXPORT_POLICY_NFS_VERSION:
				return getExport_policy_nfs_version();
			case PcsPackage.VOLUME__MULTIPLICITY:
				return getMultiplicity();
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
			case PcsPackage.VOLUME__ENVIRONMENT:
				setEnvironment((Environment)newValue);
				return;
			case PcsPackage.VOLUME__SNAPSHOT_POLICY:
				setSnapshot_policy((SnapshotPolicy)newValue);
				return;
			case PcsPackage.VOLUME__STATE:
				setState((String)newValue);
				return;
			case PcsPackage.VOLUME__SIZE:
				setSize((Double)newValue);
				return;
			case PcsPackage.VOLUME__SIZE_UNIT:
				setSize_unit((String)newValue);
				return;
			case PcsPackage.VOLUME__SVM_NAME:
				setSvm_name((String)newValue);
				return;
			case PcsPackage.VOLUME__EXPORT_POLICY_TYPE:
				setExport_policy_type((String)newValue);
				return;
			case PcsPackage.VOLUME__EXPORT_POLICY_IP:
				getExport_policy_ip().clear();
				getExport_policy_ip().addAll((Collection<? extends String>)newValue);
				return;
			case PcsPackage.VOLUME__EXPORT_POLICY_NFS_VERSION:
				getExport_policy_nfs_version().clear();
				getExport_policy_nfs_version().addAll((Collection<? extends String>)newValue);
				return;
			case PcsPackage.VOLUME__MULTIPLICITY:
				setMultiplicity((Integer)newValue);
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
			case PcsPackage.VOLUME__ENVIRONMENT:
				setEnvironment((Environment)null);
				return;
			case PcsPackage.VOLUME__SNAPSHOT_POLICY:
				setSnapshot_policy((SnapshotPolicy)null);
				return;
			case PcsPackage.VOLUME__STATE:
				setState(STATE_EDEFAULT);
				return;
			case PcsPackage.VOLUME__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case PcsPackage.VOLUME__SIZE_UNIT:
				setSize_unit(SIZE_UNIT_EDEFAULT);
				return;
			case PcsPackage.VOLUME__SVM_NAME:
				setSvm_name(SVM_NAME_EDEFAULT);
				return;
			case PcsPackage.VOLUME__EXPORT_POLICY_TYPE:
				setExport_policy_type(EXPORT_POLICY_TYPE_EDEFAULT);
				return;
			case PcsPackage.VOLUME__EXPORT_POLICY_IP:
				getExport_policy_ip().clear();
				return;
			case PcsPackage.VOLUME__EXPORT_POLICY_NFS_VERSION:
				getExport_policy_nfs_version().clear();
				return;
			case PcsPackage.VOLUME__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
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
			case PcsPackage.VOLUME__ENVIRONMENT:
				return environment != null;
			case PcsPackage.VOLUME__SNAPSHOT_POLICY:
				return snapshot_policy != null;
			case PcsPackage.VOLUME__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case PcsPackage.VOLUME__SIZE:
				return size != SIZE_EDEFAULT;
			case PcsPackage.VOLUME__SIZE_UNIT:
				return SIZE_UNIT_EDEFAULT == null ? size_unit != null : !SIZE_UNIT_EDEFAULT.equals(size_unit);
			case PcsPackage.VOLUME__SVM_NAME:
				return SVM_NAME_EDEFAULT == null ? svm_name != null : !SVM_NAME_EDEFAULT.equals(svm_name);
			case PcsPackage.VOLUME__EXPORT_POLICY_TYPE:
				return EXPORT_POLICY_TYPE_EDEFAULT == null ? export_policy_type != null : !EXPORT_POLICY_TYPE_EDEFAULT.equals(export_policy_type);
			case PcsPackage.VOLUME__EXPORT_POLICY_IP:
				return export_policy_ip != null && !export_policy_ip.isEmpty();
			case PcsPackage.VOLUME__EXPORT_POLICY_NFS_VERSION:
				return export_policy_nfs_version != null && !export_policy_nfs_version.isEmpty();
			case PcsPackage.VOLUME__MULTIPLICITY:
				return multiplicity != MULTIPLICITY_EDEFAULT;
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
		result.append(" (state: ");
		result.append(state);
		result.append(", size: ");
		result.append(size);
		result.append(", size_unit: ");
		result.append(size_unit);
		result.append(", svm_name: ");
		result.append(svm_name);
		result.append(", export_policy_type: ");
		result.append(export_policy_type);
		result.append(", export_policy_ip: ");
		result.append(export_policy_ip);
		result.append(", export_policy_nfs_version: ");
		result.append(export_policy_nfs_version);
		result.append(", multiplicity: ");
		result.append(multiplicity);
		result.append(')');
		return result.toString();
	}

} //VolumeImpl
