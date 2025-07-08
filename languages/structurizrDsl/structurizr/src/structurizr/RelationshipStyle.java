/**
 */
package structurizr;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structurizr.RelationshipStyle#getTag <em>Tag</em>}</li>
 *   <li>{@link structurizr.RelationshipStyle#getThickness <em>Thickness</em>}</li>
 *   <li>{@link structurizr.RelationshipStyle#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link structurizr.RelationshipStyle#getWidth <em>Width</em>}</li>
 *   <li>{@link structurizr.RelationshipStyle#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link structurizr.RelationshipStyle#getPosition <em>Position</em>}</li>
 *   <li>{@link structurizr.RelationshipStyle#getColor <em>Color</em>}</li>
 *   <li>{@link structurizr.RelationshipStyle#getStyle <em>Style</em>}</li>
 *   <li>{@link structurizr.RelationshipStyle#getRouting <em>Routing</em>}</li>
 *   <li>{@link structurizr.RelationshipStyle#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see structurizr.StructurizrPackage#getRelationshipStyle()
 * @model
 * @generated
 */
public interface RelationshipStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' reference.
	 * @see #setTag(Tag)
	 * @see structurizr.StructurizrPackage#getRelationshipStyle_Tag()
	 * @model
	 * @generated
	 */
	Tag getTag();

	/**
	 * Sets the value of the '{@link structurizr.RelationshipStyle#getTag <em>Tag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' reference.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(Tag value);

	/**
	 * Returns the value of the '<em><b>Thickness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thickness</em>' attribute.
	 * @see #setThickness(int)
	 * @see structurizr.StructurizrPackage#getRelationshipStyle_Thickness()
	 * @model
	 * @generated
	 */
	int getThickness();

	/**
	 * Sets the value of the '{@link structurizr.RelationshipStyle#getThickness <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thickness</em>' attribute.
	 * @see #getThickness()
	 * @generated
	 */
	void setThickness(int value);

	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size</em>' attribute.
	 * @see #setFontSize(int)
	 * @see structurizr.StructurizrPackage#getRelationshipStyle_FontSize()
	 * @model
	 * @generated
	 */
	int getFontSize();

	/**
	 * Sets the value of the '{@link structurizr.RelationshipStyle#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' attribute.
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see structurizr.StructurizrPackage#getRelationshipStyle_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link structurizr.RelationshipStyle#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opacity</em>' attribute.
	 * @see #setOpacity(int)
	 * @see structurizr.StructurizrPackage#getRelationshipStyle_Opacity()
	 * @model
	 * @generated
	 */
	int getOpacity();

	/**
	 * Sets the value of the '{@link structurizr.RelationshipStyle#getOpacity <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opacity</em>' attribute.
	 * @see #getOpacity()
	 * @generated
	 */
	void setOpacity(int value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see structurizr.StructurizrPackage#getRelationshipStyle_Position()
	 * @model
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link structurizr.RelationshipStyle#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see structurizr.StructurizrPackage#getRelationshipStyle_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link structurizr.RelationshipStyle#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * The literals are from the enumeration {@link structurizr.Border}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see structurizr.Border
	 * @see #setStyle(Border)
	 * @see structurizr.StructurizrPackage#getRelationshipStyle_Style()
	 * @model
	 * @generated
	 */
	Border getStyle();

	/**
	 * Sets the value of the '{@link structurizr.RelationshipStyle#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see structurizr.Border
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(Border value);

	/**
	 * Returns the value of the '<em><b>Routing</b></em>' attribute.
	 * The literals are from the enumeration {@link structurizr.Routing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing</em>' attribute.
	 * @see structurizr.Routing
	 * @see #setRouting(Routing)
	 * @see structurizr.StructurizrPackage#getRelationshipStyle_Routing()
	 * @model
	 * @generated
	 */
	Routing getRouting();

	/**
	 * Sets the value of the '{@link structurizr.RelationshipStyle#getRouting <em>Routing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing</em>' attribute.
	 * @see structurizr.Routing
	 * @see #getRouting()
	 * @generated
	 */
	void setRouting(Routing value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link structurizr.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see structurizr.StructurizrPackage#getRelationshipStyle_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

} // RelationshipStyle
