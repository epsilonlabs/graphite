/**
 */
package structurizr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structurizr.ViewElement#getKey <em>Key</em>}</li>
 *   <li>{@link structurizr.ViewElement#getTitle <em>Title</em>}</li>
 *   <li>{@link structurizr.ViewElement#getDescription <em>Description</em>}</li>
 *   <li>{@link structurizr.ViewElement#getAutoLayout <em>Auto Layout</em>}</li>
 *   <li>{@link structurizr.ViewElement#getProperties <em>Properties</em>}</li>
 *   <li>{@link structurizr.ViewElement#getInclude <em>Include</em>}</li>
 *   <li>{@link structurizr.ViewElement#getExclude <em>Exclude</em>}</li>
 *   <li>{@link structurizr.ViewElement#getIncludeExpression <em>Include Expression</em>}</li>
 *   <li>{@link structurizr.ViewElement#getExcludeExpression <em>Exclude Expression</em>}</li>
 * </ul>
 *
 * @see structurizr.StructurizrPackage#getViewElement()
 * @model abstract="true"
 * @generated
 */
public interface ViewElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see structurizr.StructurizrPackage#getViewElement_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link structurizr.ViewElement#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see structurizr.StructurizrPackage#getViewElement_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link structurizr.ViewElement#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see structurizr.StructurizrPackage#getViewElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link structurizr.ViewElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Auto Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Layout</em>' containment reference.
	 * @see #setAutoLayout(AutoLayout)
	 * @see structurizr.StructurizrPackage#getViewElement_AutoLayout()
	 * @model containment="true"
	 * @generated
	 */
	AutoLayout getAutoLayout();

	/**
	 * Sets the value of the '{@link structurizr.ViewElement#getAutoLayout <em>Auto Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Layout</em>' containment reference.
	 * @see #getAutoLayout()
	 * @generated
	 */
	void setAutoLayout(AutoLayout value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link structurizr.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see structurizr.StructurizrPackage#getViewElement_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' containment reference.
	 * @see #setInclude(ConditionElement)
	 * @see structurizr.StructurizrPackage#getViewElement_Include()
	 * @model containment="true"
	 * @generated
	 */
	ConditionElement getInclude();

	/**
	 * Sets the value of the '{@link structurizr.ViewElement#getInclude <em>Include</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include</em>' containment reference.
	 * @see #getInclude()
	 * @generated
	 */
	void setInclude(ConditionElement value);

	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude</em>' containment reference.
	 * @see #setExclude(ConditionElement)
	 * @see structurizr.StructurizrPackage#getViewElement_Exclude()
	 * @model containment="true"
	 * @generated
	 */
	ConditionElement getExclude();

	/**
	 * Sets the value of the '{@link structurizr.ViewElement#getExclude <em>Exclude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude</em>' containment reference.
	 * @see #getExclude()
	 * @generated
	 */
	void setExclude(ConditionElement value);

	/**
	 * Returns the value of the '<em><b>Include Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Expression</em>' attribute.
	 * @see #setIncludeExpression(String)
	 * @see structurizr.StructurizrPackage#getViewElement_IncludeExpression()
	 * @model
	 * @generated
	 */
	String getIncludeExpression();

	/**
	 * Sets the value of the '{@link structurizr.ViewElement#getIncludeExpression <em>Include Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Expression</em>' attribute.
	 * @see #getIncludeExpression()
	 * @generated
	 */
	void setIncludeExpression(String value);

	/**
	 * Returns the value of the '<em><b>Exclude Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude Expression</em>' attribute.
	 * @see #setExcludeExpression(String)
	 * @see structurizr.StructurizrPackage#getViewElement_ExcludeExpression()
	 * @model
	 * @generated
	 */
	String getExcludeExpression();

	/**
	 * Sets the value of the '{@link structurizr.ViewElement#getExcludeExpression <em>Exclude Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Expression</em>' attribute.
	 * @see #getExcludeExpression()
	 * @generated
	 */
	void setExcludeExpression(String value);

} // ViewElement
