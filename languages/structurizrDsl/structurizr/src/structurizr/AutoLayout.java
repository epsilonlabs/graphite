/**
 */
package structurizr;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Auto Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structurizr.AutoLayout#getAutoLayoutOption <em>Auto Layout Option</em>}</li>
 *   <li>{@link structurizr.AutoLayout#getRankSeparation <em>Rank Separation</em>}</li>
 *   <li>{@link structurizr.AutoLayout#getNodeSeparation <em>Node Separation</em>}</li>
 * </ul>
 *
 * @see structurizr.StructurizrPackage#getAutoLayout()
 * @model
 * @generated
 */
public interface AutoLayout extends EObject {
	/**
	 * Returns the value of the '<em><b>Auto Layout Option</b></em>' attribute.
	 * The literals are from the enumeration {@link structurizr.AutoLayoutOption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Layout Option</em>' attribute.
	 * @see structurizr.AutoLayoutOption
	 * @see #setAutoLayoutOption(AutoLayoutOption)
	 * @see structurizr.StructurizrPackage#getAutoLayout_AutoLayoutOption()
	 * @model
	 * @generated
	 */
	AutoLayoutOption getAutoLayoutOption();

	/**
	 * Sets the value of the '{@link structurizr.AutoLayout#getAutoLayoutOption <em>Auto Layout Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Layout Option</em>' attribute.
	 * @see structurizr.AutoLayoutOption
	 * @see #getAutoLayoutOption()
	 * @generated
	 */
	void setAutoLayoutOption(AutoLayoutOption value);

	/**
	 * Returns the value of the '<em><b>Rank Separation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rank Separation</em>' attribute.
	 * @see #setRankSeparation(int)
	 * @see structurizr.StructurizrPackage#getAutoLayout_RankSeparation()
	 * @model
	 * @generated
	 */
	int getRankSeparation();

	/**
	 * Sets the value of the '{@link structurizr.AutoLayout#getRankSeparation <em>Rank Separation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rank Separation</em>' attribute.
	 * @see #getRankSeparation()
	 * @generated
	 */
	void setRankSeparation(int value);

	/**
	 * Returns the value of the '<em><b>Node Separation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Separation</em>' attribute.
	 * @see #setNodeSeparation(int)
	 * @see structurizr.StructurizrPackage#getAutoLayout_NodeSeparation()
	 * @model
	 * @generated
	 */
	int getNodeSeparation();

	/**
	 * Sets the value of the '{@link structurizr.AutoLayout#getNodeSeparation <em>Node Separation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Separation</em>' attribute.
	 * @see #getNodeSeparation()
	 * @generated
	 */
	void setNodeSeparation(int value);

} // AutoLayout
