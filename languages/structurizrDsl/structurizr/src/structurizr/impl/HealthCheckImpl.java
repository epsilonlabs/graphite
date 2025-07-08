/**
 */
package structurizr.impl;

import graphite.shared.CustomEObjectImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import structurizr.HealthCheck;
import structurizr.StructurizrPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Health Check</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structurizr.impl.HealthCheckImpl#getName <em>Name</em>}</li>
 *   <li>{@link structurizr.impl.HealthCheckImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link structurizr.impl.HealthCheckImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link structurizr.impl.HealthCheckImpl#getTimeouts <em>Timeouts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HealthCheckImpl extends CustomEObjectImpl implements HealthCheck {
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
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected int interval = INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeouts() <em>Timeouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeouts()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeouts() <em>Timeouts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeouts()
	 * @generated
	 * @ordered
	 */
	protected String timeouts = TIMEOUTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthCheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurizrPackage.Literals.HEALTH_CHECK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.HEALTH_CHECK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.HEALTH_CHECK__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval(int newInterval) {
		int oldInterval = interval;
		interval = newInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.HEALTH_CHECK__INTERVAL, oldInterval, interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeouts() {
		return timeouts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeouts(String newTimeouts) {
		String oldTimeouts = timeouts;
		timeouts = newTimeouts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.HEALTH_CHECK__TIMEOUTS, oldTimeouts, timeouts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurizrPackage.HEALTH_CHECK__NAME:
				return getName();
			case StructurizrPackage.HEALTH_CHECK__URL:
				return getUrl();
			case StructurizrPackage.HEALTH_CHECK__INTERVAL:
				return getInterval();
			case StructurizrPackage.HEALTH_CHECK__TIMEOUTS:
				return getTimeouts();
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
			case StructurizrPackage.HEALTH_CHECK__NAME:
				setName((String)newValue);
				return;
			case StructurizrPackage.HEALTH_CHECK__URL:
				setUrl((String)newValue);
				return;
			case StructurizrPackage.HEALTH_CHECK__INTERVAL:
				setInterval((Integer)newValue);
				return;
			case StructurizrPackage.HEALTH_CHECK__TIMEOUTS:
				setTimeouts((String)newValue);
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
			case StructurizrPackage.HEALTH_CHECK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StructurizrPackage.HEALTH_CHECK__URL:
				setUrl(URL_EDEFAULT);
				return;
			case StructurizrPackage.HEALTH_CHECK__INTERVAL:
				setInterval(INTERVAL_EDEFAULT);
				return;
			case StructurizrPackage.HEALTH_CHECK__TIMEOUTS:
				setTimeouts(TIMEOUTS_EDEFAULT);
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
			case StructurizrPackage.HEALTH_CHECK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StructurizrPackage.HEALTH_CHECK__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case StructurizrPackage.HEALTH_CHECK__INTERVAL:
				return interval != INTERVAL_EDEFAULT;
			case StructurizrPackage.HEALTH_CHECK__TIMEOUTS:
				return TIMEOUTS_EDEFAULT == null ? timeouts != null : !TIMEOUTS_EDEFAULT.equals(timeouts);
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
		result.append(", url: ");
		result.append(url);
		result.append(", interval: ");
		result.append(interval);
		result.append(", timeouts: ");
		result.append(timeouts);
		result.append(')');
		return result.toString();
	}

} //HealthCheckImpl
