/**
 */
package TestingPackage.Metrics.impl;

import TestingPackage.Metrics.MetricsPackage;
import TestingPackage.Metrics.SimStream;
import TestingPackage.Metrics.StreamMetric;
import TestingPackage.Metrics.StreamResult;

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
 * An implementation of the model object '<em><b>Stream Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.Metrics.impl.StreamMetricImpl#getStreams <em>Streams</em>}</li>
 *   <li>{@link TestingPackage.Metrics.impl.StreamMetricImpl#getRes <em>Res</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StreamMetricImpl extends MetricImpl implements StreamMetric {
	/**
	 * The cached value of the '{@link #getStreams() <em>Streams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreams()
	 * @generated
	 * @ordered
	 */
	protected EList<SimStream> streams;

	/**
	 * The cached value of the '{@link #getRes() <em>Res</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRes()
	 * @generated
	 * @ordered
	 */
	protected StreamResult res;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StreamMetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetricsPackage.Literals.STREAM_METRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimStream> getStreams() {
		if (streams == null) {
			streams = new EObjectContainmentEList<SimStream>(SimStream.class, this, MetricsPackage.STREAM_METRIC__STREAMS);
		}
		return streams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StreamResult getRes() {
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRes(StreamResult newRes, NotificationChain msgs) {
		StreamResult oldRes = res;
		res = newRes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetricsPackage.STREAM_METRIC__RES, oldRes, newRes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRes(StreamResult newRes) {
		if (newRes != res) {
			NotificationChain msgs = null;
			if (res != null)
				msgs = ((InternalEObject)res).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetricsPackage.STREAM_METRIC__RES, null, msgs);
			if (newRes != null)
				msgs = ((InternalEObject)newRes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetricsPackage.STREAM_METRIC__RES, null, msgs);
			msgs = basicSetRes(newRes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetricsPackage.STREAM_METRIC__RES, newRes, newRes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetricsPackage.STREAM_METRIC__STREAMS:
				return ((InternalEList<?>)getStreams()).basicRemove(otherEnd, msgs);
			case MetricsPackage.STREAM_METRIC__RES:
				return basicSetRes(null, msgs);
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
			case MetricsPackage.STREAM_METRIC__STREAMS:
				return getStreams();
			case MetricsPackage.STREAM_METRIC__RES:
				return getRes();
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
			case MetricsPackage.STREAM_METRIC__STREAMS:
				getStreams().clear();
				getStreams().addAll((Collection<? extends SimStream>)newValue);
				return;
			case MetricsPackage.STREAM_METRIC__RES:
				setRes((StreamResult)newValue);
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
			case MetricsPackage.STREAM_METRIC__STREAMS:
				getStreams().clear();
				return;
			case MetricsPackage.STREAM_METRIC__RES:
				setRes((StreamResult)null);
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
			case MetricsPackage.STREAM_METRIC__STREAMS:
				return streams != null && !streams.isEmpty();
			case MetricsPackage.STREAM_METRIC__RES:
				return res != null;
		}
		return super.eIsSet(featureID);
	}

} //StreamMetricImpl
