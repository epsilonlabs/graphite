/**
 */
package pcs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pcs.CVO;
import pcs.PcsPackage;
import pcs.SnapMirror;
import pcs.SnapshotPolicy;
import pcs.Volume;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Snap Mirror</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pcs.impl.SnapMirrorImpl#getSource_cvo <em>Source cvo</em>}</li>
 *   <li>{@link pcs.impl.SnapMirrorImpl#getDestination_cvo <em>Destination cvo</em>}</li>
 *   <li>{@link pcs.impl.SnapMirrorImpl#getSource_volume <em>Source volume</em>}</li>
 *   <li>{@link pcs.impl.SnapMirrorImpl#getDestination_volume <em>Destination volume</em>}</li>
 *   <li>{@link pcs.impl.SnapMirrorImpl#getPolicy <em>Policy</em>}</li>
 *   <li>{@link pcs.impl.SnapMirrorImpl#getMax_transfer_rate <em>Max transfer rate</em>}</li>
 *   <li>{@link pcs.impl.SnapMirrorImpl#isBidirectional <em>Bidirectional</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SnapMirrorImpl extends DataServiceImpl implements SnapMirror {
	/**
	 * The cached value of the '{@link #getSource_cvo() <em>Source cvo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource_cvo()
	 * @generated
	 * @ordered
	 */
	protected CVO source_cvo;

	/**
	 * The cached value of the '{@link #getDestination_cvo() <em>Destination cvo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination_cvo()
	 * @generated
	 * @ordered
	 */
	protected CVO destination_cvo;

	/**
	 * The cached value of the '{@link #getSource_volume() <em>Source volume</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource_volume()
	 * @generated
	 * @ordered
	 */
	protected Volume source_volume;

	/**
	 * The cached value of the '{@link #getDestination_volume() <em>Destination volume</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination_volume()
	 * @generated
	 * @ordered
	 */
	protected Volume destination_volume;

	/**
	 * The cached value of the '{@link #getPolicy() <em>Policy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicy()
	 * @generated
	 * @ordered
	 */
	protected SnapshotPolicy policy;

	/**
	 * The default value of the '{@link #getMax_transfer_rate() <em>Max transfer rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_transfer_rate()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_TRANSFER_RATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMax_transfer_rate() <em>Max transfer rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_transfer_rate()
	 * @generated
	 * @ordered
	 */
	protected int max_transfer_rate = MAX_TRANSFER_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isBidirectional() <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBidirectional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIDIRECTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBidirectional() <em>Bidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBidirectional()
	 * @generated
	 * @ordered
	 */
	protected boolean bidirectional = BIDIRECTIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SnapMirrorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PcsPackage.Literals.SNAP_MIRROR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVO getSource_cvo() {
		if (source_cvo != null && source_cvo.eIsProxy()) {
			InternalEObject oldSource_cvo = (InternalEObject)source_cvo;
			source_cvo = (CVO)eResolveProxy(oldSource_cvo);
			if (source_cvo != oldSource_cvo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PcsPackage.SNAP_MIRROR__SOURCE_CVO, oldSource_cvo, source_cvo));
			}
		}
		return source_cvo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVO basicGetSource_cvo() {
		return source_cvo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource_cvo(CVO newSource_cvo) {
		CVO oldSource_cvo = source_cvo;
		source_cvo = newSource_cvo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.SNAP_MIRROR__SOURCE_CVO, oldSource_cvo, source_cvo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVO getDestination_cvo() {
		if (destination_cvo != null && destination_cvo.eIsProxy()) {
			InternalEObject oldDestination_cvo = (InternalEObject)destination_cvo;
			destination_cvo = (CVO)eResolveProxy(oldDestination_cvo);
			if (destination_cvo != oldDestination_cvo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PcsPackage.SNAP_MIRROR__DESTINATION_CVO, oldDestination_cvo, destination_cvo));
			}
		}
		return destination_cvo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CVO basicGetDestination_cvo() {
		return destination_cvo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination_cvo(CVO newDestination_cvo) {
		CVO oldDestination_cvo = destination_cvo;
		destination_cvo = newDestination_cvo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.SNAP_MIRROR__DESTINATION_CVO, oldDestination_cvo, destination_cvo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volume getSource_volume() {
		if (source_volume != null && source_volume.eIsProxy()) {
			InternalEObject oldSource_volume = (InternalEObject)source_volume;
			source_volume = (Volume)eResolveProxy(oldSource_volume);
			if (source_volume != oldSource_volume) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PcsPackage.SNAP_MIRROR__SOURCE_VOLUME, oldSource_volume, source_volume));
			}
		}
		return source_volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volume basicGetSource_volume() {
		return source_volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource_volume(Volume newSource_volume) {
		Volume oldSource_volume = source_volume;
		source_volume = newSource_volume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.SNAP_MIRROR__SOURCE_VOLUME, oldSource_volume, source_volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volume getDestination_volume() {
		if (destination_volume != null && destination_volume.eIsProxy()) {
			InternalEObject oldDestination_volume = (InternalEObject)destination_volume;
			destination_volume = (Volume)eResolveProxy(oldDestination_volume);
			if (destination_volume != oldDestination_volume) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PcsPackage.SNAP_MIRROR__DESTINATION_VOLUME, oldDestination_volume, destination_volume));
			}
		}
		return destination_volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Volume basicGetDestination_volume() {
		return destination_volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination_volume(Volume newDestination_volume) {
		Volume oldDestination_volume = destination_volume;
		destination_volume = newDestination_volume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.SNAP_MIRROR__DESTINATION_VOLUME, oldDestination_volume, destination_volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnapshotPolicy getPolicy() {
		if (policy != null && policy.eIsProxy()) {
			InternalEObject oldPolicy = (InternalEObject)policy;
			policy = (SnapshotPolicy)eResolveProxy(oldPolicy);
			if (policy != oldPolicy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PcsPackage.SNAP_MIRROR__POLICY, oldPolicy, policy));
			}
		}
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SnapshotPolicy basicGetPolicy() {
		return policy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicy(SnapshotPolicy newPolicy) {
		SnapshotPolicy oldPolicy = policy;
		policy = newPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.SNAP_MIRROR__POLICY, oldPolicy, policy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMax_transfer_rate() {
		return max_transfer_rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_transfer_rate(int newMax_transfer_rate) {
		int oldMax_transfer_rate = max_transfer_rate;
		max_transfer_rate = newMax_transfer_rate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.SNAP_MIRROR__MAX_TRANSFER_RATE, oldMax_transfer_rate, max_transfer_rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBidirectional() {
		return bidirectional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBidirectional(boolean newBidirectional) {
		boolean oldBidirectional = bidirectional;
		bidirectional = newBidirectional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PcsPackage.SNAP_MIRROR__BIDIRECTIONAL, oldBidirectional, bidirectional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PcsPackage.SNAP_MIRROR__SOURCE_CVO:
				if (resolve) return getSource_cvo();
				return basicGetSource_cvo();
			case PcsPackage.SNAP_MIRROR__DESTINATION_CVO:
				if (resolve) return getDestination_cvo();
				return basicGetDestination_cvo();
			case PcsPackage.SNAP_MIRROR__SOURCE_VOLUME:
				if (resolve) return getSource_volume();
				return basicGetSource_volume();
			case PcsPackage.SNAP_MIRROR__DESTINATION_VOLUME:
				if (resolve) return getDestination_volume();
				return basicGetDestination_volume();
			case PcsPackage.SNAP_MIRROR__POLICY:
				if (resolve) return getPolicy();
				return basicGetPolicy();
			case PcsPackage.SNAP_MIRROR__MAX_TRANSFER_RATE:
				return getMax_transfer_rate();
			case PcsPackage.SNAP_MIRROR__BIDIRECTIONAL:
				return isBidirectional();
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
			case PcsPackage.SNAP_MIRROR__SOURCE_CVO:
				setSource_cvo((CVO)newValue);
				return;
			case PcsPackage.SNAP_MIRROR__DESTINATION_CVO:
				setDestination_cvo((CVO)newValue);
				return;
			case PcsPackage.SNAP_MIRROR__SOURCE_VOLUME:
				setSource_volume((Volume)newValue);
				return;
			case PcsPackage.SNAP_MIRROR__DESTINATION_VOLUME:
				setDestination_volume((Volume)newValue);
				return;
			case PcsPackage.SNAP_MIRROR__POLICY:
				setPolicy((SnapshotPolicy)newValue);
				return;
			case PcsPackage.SNAP_MIRROR__MAX_TRANSFER_RATE:
				setMax_transfer_rate((Integer)newValue);
				return;
			case PcsPackage.SNAP_MIRROR__BIDIRECTIONAL:
				setBidirectional((Boolean)newValue);
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
			case PcsPackage.SNAP_MIRROR__SOURCE_CVO:
				setSource_cvo((CVO)null);
				return;
			case PcsPackage.SNAP_MIRROR__DESTINATION_CVO:
				setDestination_cvo((CVO)null);
				return;
			case PcsPackage.SNAP_MIRROR__SOURCE_VOLUME:
				setSource_volume((Volume)null);
				return;
			case PcsPackage.SNAP_MIRROR__DESTINATION_VOLUME:
				setDestination_volume((Volume)null);
				return;
			case PcsPackage.SNAP_MIRROR__POLICY:
				setPolicy((SnapshotPolicy)null);
				return;
			case PcsPackage.SNAP_MIRROR__MAX_TRANSFER_RATE:
				setMax_transfer_rate(MAX_TRANSFER_RATE_EDEFAULT);
				return;
			case PcsPackage.SNAP_MIRROR__BIDIRECTIONAL:
				setBidirectional(BIDIRECTIONAL_EDEFAULT);
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
			case PcsPackage.SNAP_MIRROR__SOURCE_CVO:
				return source_cvo != null;
			case PcsPackage.SNAP_MIRROR__DESTINATION_CVO:
				return destination_cvo != null;
			case PcsPackage.SNAP_MIRROR__SOURCE_VOLUME:
				return source_volume != null;
			case PcsPackage.SNAP_MIRROR__DESTINATION_VOLUME:
				return destination_volume != null;
			case PcsPackage.SNAP_MIRROR__POLICY:
				return policy != null;
			case PcsPackage.SNAP_MIRROR__MAX_TRANSFER_RATE:
				return max_transfer_rate != MAX_TRANSFER_RATE_EDEFAULT;
			case PcsPackage.SNAP_MIRROR__BIDIRECTIONAL:
				return bidirectional != BIDIRECTIONAL_EDEFAULT;
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
		result.append(" (max_transfer_rate: ");
		result.append(max_transfer_rate);
		result.append(", bidirectional: ");
		result.append(bidirectional);
		result.append(')');
		return result.toString();
	}

} //SnapMirrorImpl
