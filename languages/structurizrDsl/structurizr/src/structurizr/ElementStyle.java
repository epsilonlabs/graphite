/**
 */
package structurizr;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structurizr.ElementStyle#getTag <em>Tag</em>}</li>
 *   <li>{@link structurizr.ElementStyle#getIcon <em>Icon</em>}</li>
 *   <li>{@link structurizr.ElementStyle#getWidth <em>Width</em>}</li>
 *   <li>{@link structurizr.ElementStyle#getHeight <em>Height</em>}</li>
 *   <li>{@link structurizr.ElementStyle#getStrokeWidth <em>Stroke Width</em>}</li>
 *   <li>{@link structurizr.ElementStyle#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link structurizr.ElementStyle#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link structurizr.ElementStyle#isMetadata <em>Metadata</em>}</li>
 *   <li>{@link structurizr.ElementStyle#isDescription <em>Description</em>}</li>
 *   <li>{@link structurizr.ElementStyle#getBackground <em>Background</em>}</li>
 *   <li>{@link structurizr.ElementStyle#getColor <em>Color</em>}</li>
 *   <li>{@link structurizr.ElementStyle#getStroke <em>Stroke</em>}</li>
 *   <li>{@link structurizr.ElementStyle#getBorder <em>Border</em>}</li>
 *   <li>{@link structurizr.ElementStyle#getShape <em>Shape</em>}</li>
 *   <li>{@link structurizr.ElementStyle#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see structurizr.StructurizrPackage#getElementStyle()
 * @model
 * @generated
 */
public interface ElementStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Tag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' reference.
	 * @see #setTag(Tag)
	 * @see structurizr.StructurizrPackage#getElementStyle_Tag()
	 * @model
	 * @generated
	 */
	Tag getTag();

	/**
	 * Sets the value of the '{@link structurizr.ElementStyle#getTag <em>Tag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' reference.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(Tag value);

	/**
	 * Returns the value of the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon</em>' attribute.
	 * @see #setIcon(String)
	 * @see structurizr.StructurizrPackage#getElementStyle_Icon()
	 * @model
	 * @generated
	 */
	String getIcon();

	/**
	 * Sets the value of the '{@link structurizr.ElementStyle#getIcon <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon</em>' attribute.
	 * @see #getIcon()
	 * @generated
	 */
	void setIcon(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see structurizr.StructurizrPackage#getElementStyle_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link structurizr.ElementStyle#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see structurizr.StructurizrPackage#getElementStyle_Height()
	 * @model
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link structurizr.ElementStyle#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Stroke Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke Width</em>' attribute.
	 * @see #setStrokeWidth(int)
	 * @see structurizr.StructurizrPackage#getElementStyle_StrokeWidth()
	 * @model
	 * @generated
	 */
	int getStrokeWidth();

	/**
	 * Sets the value of the '{@link structurizr.ElementStyle#getStrokeWidth <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke Width</em>' attribute.
	 * @see #getStrokeWidth()
	 * @generated
	 */
	void setStrokeWidth(int value);

	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size</em>' attribute.
	 * @see #setFontSize(int)
	 * @see structurizr.StructurizrPackage#getElementStyle_FontSize()
	 * @model
	 * @generated
	 */
	int getFontSize();

	/**
	 * Sets the value of the '{@link structurizr.ElementStyle#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' attribute.
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(int value);

	/**
	 * Returns the value of the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opacity</em>' attribute.
	 * @see #setOpacity(int)
	 * @see structurizr.StructurizrPackage#getElementStyle_Opacity()
	 * @model
	 * @generated
	 */
	int getOpacity();

	/**
	 * Sets the value of the '{@link structurizr.ElementStyle#getOpacity <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opacity</em>' attribute.
	 * @see #getOpacity()
	 * @generated
	 */
	void setOpacity(int value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' attribute.
	 * @see #setMetadata(boolean)
	 * @see structurizr.StructurizrPackage#getElementStyle_Metadata()
	 * @model
	 * @generated
	 */
	boolean isMetadata();

	/**
	 * Sets the value of the '{@link structurizr.ElementStyle#isMetadata <em>Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' attribute.
	 * @see #isMetadata()
	 * @generated
	 */
	void setMetadata(boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(boolean)
	 * @see structurizr.StructurizrPackage#getElementStyle_Description()
	 * @model
	 * @generated
	 */
	boolean isDescription();

	/**
	 * Sets the value of the '{@link structurizr.ElementStyle#isDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #isDescription()
	 * @generated
	 */
	void setDescription(boolean value);

	/**
	 * Returns the value of the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' attribute.
	 * @see #setBackground(String)
	 * @see structurizr.StructurizrPackage#getElementStyle_Background()
	 * @model
	 * @generated
	 */
	String getBackground();

	/**
	 * Sets the value of the '{@link structurizr.ElementStyle#getBackground <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' attribute.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see structurizr.StructurizrPackage#getElementStyle_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link structurizr.ElementStyle#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Stroke</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke</em>' attribute.
	 * @see #setStroke(String)
	 * @see structurizr.StructurizrPackage#getElementStyle_Stroke()
	 * @model
	 * @generated
	 */
	String getStroke();

	/**
	 * Sets the value of the '{@link structurizr.ElementStyle#getStroke <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke</em>' attribute.
	 * @see #getStroke()
	 * @generated
	 */
	void setStroke(String value);

	/**
	 * Returns the value of the '<em><b>Border</b></em>' attribute.
	 * The literals are from the enumeration {@link structurizr.Border}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border</em>' attribute.
	 * @see structurizr.Border
	 * @see #setBorder(Border)
	 * @see structurizr.StructurizrPackage#getElementStyle_Border()
	 * @model
	 * @generated
	 */
	Border getBorder();

	/**
	 * Sets the value of the '{@link structurizr.ElementStyle#getBorder <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border</em>' attribute.
	 * @see structurizr.Border
	 * @see #getBorder()
	 * @generated
	 */
	void setBorder(Border value);

	/**
	 * Returns the value of the '<em><b>Shape</b></em>' attribute.
	 * The literals are from the enumeration {@link structurizr.Shape}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' attribute.
	 * @see structurizr.Shape
	 * @see #setShape(Shape)
	 * @see structurizr.StructurizrPackage#getElementStyle_Shape()
	 * @model
	 * @generated
	 */
	Shape getShape();

	/**
	 * Sets the value of the '{@link structurizr.ElementStyle#getShape <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' attribute.
	 * @see structurizr.Shape
	 * @see #getShape()
	 * @generated
	 */
	void setShape(Shape value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link structurizr.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see structurizr.StructurizrPackage#getElementStyle_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

} // ElementStyle
