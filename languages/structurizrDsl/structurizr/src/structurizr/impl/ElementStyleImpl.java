/**
 */
package structurizr.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import structurizr.Border;
import structurizr.ElementStyle;
import structurizr.Property;
import structurizr.Shape;
import structurizr.StructurizrPackage;
import structurizr.Tag;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structurizr.impl.ElementStyleImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link structurizr.impl.ElementStyleImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link structurizr.impl.ElementStyleImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link structurizr.impl.ElementStyleImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link structurizr.impl.ElementStyleImpl#getStrokeWidth <em>Stroke Width</em>}</li>
 *   <li>{@link structurizr.impl.ElementStyleImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link structurizr.impl.ElementStyleImpl#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link structurizr.impl.ElementStyleImpl#isMetadata <em>Metadata</em>}</li>
 *   <li>{@link structurizr.impl.ElementStyleImpl#isDescription <em>Description</em>}</li>
 *   <li>{@link structurizr.impl.ElementStyleImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link structurizr.impl.ElementStyleImpl#getColor <em>Color</em>}</li>
 *   <li>{@link structurizr.impl.ElementStyleImpl#getStroke <em>Stroke</em>}</li>
 *   <li>{@link structurizr.impl.ElementStyleImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link structurizr.impl.ElementStyleImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link structurizr.impl.ElementStyleImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementStyleImpl extends StyleImpl implements ElementStyle {
	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected Tag tag;

	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected String icon = ICON_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStrokeWidth() <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int STROKE_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStrokeWidth() <em>Stroke Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrokeWidth()
	 * @generated
	 * @ordered
	 */
	protected int strokeWidth = STROKE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final int FONT_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected int fontSize = FONT_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final int OPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected int opacity = OPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isMetadata() <em>Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMetadata()
	 * @generated
	 * @ordered
	 */
	protected static final boolean METADATA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMetadata() <em>Metadata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMetadata()
	 * @generated
	 * @ordered
	 */
	protected boolean metadata = METADATA_EDEFAULT;

	/**
	 * The default value of the '{@link #isDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDescription()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DESCRIPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDescription()
	 * @generated
	 * @ordered
	 */
	protected boolean description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected String background = BACKGROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getStroke() <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected static final String STROKE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStroke() <em>Stroke</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStroke()
	 * @generated
	 * @ordered
	 */
	protected String stroke = STROKE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected static final Border BORDER_EDEFAULT = Border.SOLID;

	/**
	 * The cached value of the '{@link #getBorder() <em>Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected Border border = BORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getShape() <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected static final Shape SHAPE_EDEFAULT = Shape.BOX;

	/**
	 * The cached value of the '{@link #getShape() <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected Shape shape = SHAPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurizrPackage.Literals.ELEMENT_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag getTag() {
		if (tag != null && tag.eIsProxy()) {
			InternalEObject oldTag = (InternalEObject)tag;
			tag = (Tag)eResolveProxy(oldTag);
			if (tag != oldTag) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurizrPackage.ELEMENT_STYLE__TAG, oldTag, tag));
			}
		}
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag basicGetTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(Tag newTag) {
		Tag oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.ELEMENT_STYLE__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(String newIcon) {
		String oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.ELEMENT_STYLE__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.ELEMENT_STYLE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.ELEMENT_STYLE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStrokeWidth() {
		return strokeWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStrokeWidth(int newStrokeWidth) {
		int oldStrokeWidth = strokeWidth;
		strokeWidth = newStrokeWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.ELEMENT_STYLE__STROKE_WIDTH, oldStrokeWidth, strokeWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFontSize() {
		return fontSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFontSize(int newFontSize) {
		int oldFontSize = fontSize;
		fontSize = newFontSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.ELEMENT_STYLE__FONT_SIZE, oldFontSize, fontSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOpacity() {
		return opacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpacity(int newOpacity) {
		int oldOpacity = opacity;
		opacity = newOpacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.ELEMENT_STYLE__OPACITY, oldOpacity, opacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata(boolean newMetadata) {
		boolean oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.ELEMENT_STYLE__METADATA, oldMetadata, metadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(boolean newDescription) {
		boolean oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.ELEMENT_STYLE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(String newBackground) {
		String oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.ELEMENT_STYLE__BACKGROUND, oldBackground, background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.ELEMENT_STYLE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStroke() {
		return stroke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStroke(String newStroke) {
		String oldStroke = stroke;
		stroke = newStroke;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.ELEMENT_STYLE__STROKE, oldStroke, stroke));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Border getBorder() {
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorder(Border newBorder) {
		Border oldBorder = border;
		border = newBorder == null ? BORDER_EDEFAULT : newBorder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.ELEMENT_STYLE__BORDER, oldBorder, border));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape getShape() {
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShape(Shape newShape) {
		Shape oldShape = shape;
		shape = newShape == null ? SHAPE_EDEFAULT : newShape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.ELEMENT_STYLE__SHAPE, oldShape, shape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, StructurizrPackage.ELEMENT_STYLE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurizrPackage.ELEMENT_STYLE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case StructurizrPackage.ELEMENT_STYLE__TAG:
				if (resolve) return getTag();
				return basicGetTag();
			case StructurizrPackage.ELEMENT_STYLE__ICON:
				return getIcon();
			case StructurizrPackage.ELEMENT_STYLE__WIDTH:
				return getWidth();
			case StructurizrPackage.ELEMENT_STYLE__HEIGHT:
				return getHeight();
			case StructurizrPackage.ELEMENT_STYLE__STROKE_WIDTH:
				return getStrokeWidth();
			case StructurizrPackage.ELEMENT_STYLE__FONT_SIZE:
				return getFontSize();
			case StructurizrPackage.ELEMENT_STYLE__OPACITY:
				return getOpacity();
			case StructurizrPackage.ELEMENT_STYLE__METADATA:
				return isMetadata();
			case StructurizrPackage.ELEMENT_STYLE__DESCRIPTION:
				return isDescription();
			case StructurizrPackage.ELEMENT_STYLE__BACKGROUND:
				return getBackground();
			case StructurizrPackage.ELEMENT_STYLE__COLOR:
				return getColor();
			case StructurizrPackage.ELEMENT_STYLE__STROKE:
				return getStroke();
			case StructurizrPackage.ELEMENT_STYLE__BORDER:
				return getBorder();
			case StructurizrPackage.ELEMENT_STYLE__SHAPE:
				return getShape();
			case StructurizrPackage.ELEMENT_STYLE__PROPERTIES:
				return getProperties();
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
			case StructurizrPackage.ELEMENT_STYLE__TAG:
				setTag((Tag)newValue);
				return;
			case StructurizrPackage.ELEMENT_STYLE__ICON:
				setIcon((String)newValue);
				return;
			case StructurizrPackage.ELEMENT_STYLE__WIDTH:
				setWidth((Integer)newValue);
				return;
			case StructurizrPackage.ELEMENT_STYLE__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case StructurizrPackage.ELEMENT_STYLE__STROKE_WIDTH:
				setStrokeWidth((Integer)newValue);
				return;
			case StructurizrPackage.ELEMENT_STYLE__FONT_SIZE:
				setFontSize((Integer)newValue);
				return;
			case StructurizrPackage.ELEMENT_STYLE__OPACITY:
				setOpacity((Integer)newValue);
				return;
			case StructurizrPackage.ELEMENT_STYLE__METADATA:
				setMetadata((Boolean)newValue);
				return;
			case StructurizrPackage.ELEMENT_STYLE__DESCRIPTION:
				setDescription((Boolean)newValue);
				return;
			case StructurizrPackage.ELEMENT_STYLE__BACKGROUND:
				setBackground((String)newValue);
				return;
			case StructurizrPackage.ELEMENT_STYLE__COLOR:
				setColor((String)newValue);
				return;
			case StructurizrPackage.ELEMENT_STYLE__STROKE:
				setStroke((String)newValue);
				return;
			case StructurizrPackage.ELEMENT_STYLE__BORDER:
				setBorder((Border)newValue);
				return;
			case StructurizrPackage.ELEMENT_STYLE__SHAPE:
				setShape((Shape)newValue);
				return;
			case StructurizrPackage.ELEMENT_STYLE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
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
			case StructurizrPackage.ELEMENT_STYLE__TAG:
				setTag((Tag)null);
				return;
			case StructurizrPackage.ELEMENT_STYLE__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case StructurizrPackage.ELEMENT_STYLE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case StructurizrPackage.ELEMENT_STYLE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case StructurizrPackage.ELEMENT_STYLE__STROKE_WIDTH:
				setStrokeWidth(STROKE_WIDTH_EDEFAULT);
				return;
			case StructurizrPackage.ELEMENT_STYLE__FONT_SIZE:
				setFontSize(FONT_SIZE_EDEFAULT);
				return;
			case StructurizrPackage.ELEMENT_STYLE__OPACITY:
				setOpacity(OPACITY_EDEFAULT);
				return;
			case StructurizrPackage.ELEMENT_STYLE__METADATA:
				setMetadata(METADATA_EDEFAULT);
				return;
			case StructurizrPackage.ELEMENT_STYLE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case StructurizrPackage.ELEMENT_STYLE__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case StructurizrPackage.ELEMENT_STYLE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case StructurizrPackage.ELEMENT_STYLE__STROKE:
				setStroke(STROKE_EDEFAULT);
				return;
			case StructurizrPackage.ELEMENT_STYLE__BORDER:
				setBorder(BORDER_EDEFAULT);
				return;
			case StructurizrPackage.ELEMENT_STYLE__SHAPE:
				setShape(SHAPE_EDEFAULT);
				return;
			case StructurizrPackage.ELEMENT_STYLE__PROPERTIES:
				getProperties().clear();
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
			case StructurizrPackage.ELEMENT_STYLE__TAG:
				return tag != null;
			case StructurizrPackage.ELEMENT_STYLE__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case StructurizrPackage.ELEMENT_STYLE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case StructurizrPackage.ELEMENT_STYLE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case StructurizrPackage.ELEMENT_STYLE__STROKE_WIDTH:
				return strokeWidth != STROKE_WIDTH_EDEFAULT;
			case StructurizrPackage.ELEMENT_STYLE__FONT_SIZE:
				return fontSize != FONT_SIZE_EDEFAULT;
			case StructurizrPackage.ELEMENT_STYLE__OPACITY:
				return opacity != OPACITY_EDEFAULT;
			case StructurizrPackage.ELEMENT_STYLE__METADATA:
				return metadata != METADATA_EDEFAULT;
			case StructurizrPackage.ELEMENT_STYLE__DESCRIPTION:
				return description != DESCRIPTION_EDEFAULT;
			case StructurizrPackage.ELEMENT_STYLE__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
			case StructurizrPackage.ELEMENT_STYLE__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case StructurizrPackage.ELEMENT_STYLE__STROKE:
				return STROKE_EDEFAULT == null ? stroke != null : !STROKE_EDEFAULT.equals(stroke);
			case StructurizrPackage.ELEMENT_STYLE__BORDER:
				return border != BORDER_EDEFAULT;
			case StructurizrPackage.ELEMENT_STYLE__SHAPE:
				return shape != SHAPE_EDEFAULT;
			case StructurizrPackage.ELEMENT_STYLE__PROPERTIES:
				return properties != null && !properties.isEmpty();
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
		result.append(" (icon: ");
		result.append(icon);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", strokeWidth: ");
		result.append(strokeWidth);
		result.append(", fontSize: ");
		result.append(fontSize);
		result.append(", opacity: ");
		result.append(opacity);
		result.append(", metadata: ");
		result.append(metadata);
		result.append(", description: ");
		result.append(description);
		result.append(", background: ");
		result.append(background);
		result.append(", color: ");
		result.append(color);
		result.append(", stroke: ");
		result.append(stroke);
		result.append(", border: ");
		result.append(border);
		result.append(", shape: ");
		result.append(shape);
		result.append(')');
		return result.toString();
	}

} //ElementStyleImpl
