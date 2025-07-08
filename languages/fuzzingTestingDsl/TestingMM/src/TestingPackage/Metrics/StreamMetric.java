/**
 */
package TestingPackage.Metrics;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stream Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.Metrics.StreamMetric#getStreams <em>Streams</em>}</li>
 *   <li>{@link TestingPackage.Metrics.StreamMetric#getRes <em>Res</em>}</li>
 * </ul>
 *
 * @see TestingPackage.Metrics.MetricsPackage#getStreamMetric()
 * @model
 * @generated
 */
public interface StreamMetric extends Metric {
	/**
	 * Returns the value of the '<em><b>Streams</b></em>' containment reference list.
	 * The list contents are of type {@link TestingPackage.Metrics.SimStream}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Streams</em>' containment reference list.
	 * @see TestingPackage.Metrics.MetricsPackage#getStreamMetric_Streams()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimStream> getStreams();

	/**
	 * Returns the value of the '<em><b>Res</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res</em>' containment reference.
	 * @see #setRes(StreamResult)
	 * @see TestingPackage.Metrics.MetricsPackage#getStreamMetric_Res()
	 * @model containment="true"
	 * @generated
	 */
	StreamResult getRes();

	/**
	 * Sets the value of the '{@link TestingPackage.Metrics.StreamMetric#getRes <em>Res</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res</em>' containment reference.
	 * @see #getRes()
	 * @generated
	 */
	void setRes(StreamResult value);

} // StreamMetric
