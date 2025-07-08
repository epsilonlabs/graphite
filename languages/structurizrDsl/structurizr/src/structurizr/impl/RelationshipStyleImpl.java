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
import structurizr.Property;
import structurizr.RelationshipStyle;
import structurizr.Routing;
import structurizr.StructurizrPackage;
import structurizr.Tag;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structurizr.impl.RelationshipStyleImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link structurizr.impl.RelationshipStyleImpl#getThickness <em>Thickness</em>}</li>
 *   <li>{@link structurizr.impl.RelationshipStyleImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link structurizr.impl.RelationshipStyleImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link structurizr.impl.RelationshipStyleImpl#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link structurizr.impl.RelationshipStyleImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link structurizr.impl.RelationshipStyleImpl#getColor <em>Color</em>}</li>
 *   <li>{@link structurizr.impl.RelationshipStyleImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link structurizr.impl.RelationshipStyleImpl#getRouting <em>Routing</em>}</li>
 *   <li>{@link structurizr.impl.RelationshipStyleImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipStyleImpl extends StyleImpl implements RelationshipStyle {
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
	 * The default value of the '{@link #getThickness() <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThickness()
	 * @generated
	 * @ordered
	 */
	protected static final int THICKNESS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThickness() <em>Thickness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThickness()
	 * @generated
	 * @ordered
	 */
	protected int thickness = THICKNESS_EDEFAULT;

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
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected int position = POSITION_EDEFAULT;

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
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final Border STYLE_EDEFAULT = Border.SOLID;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected Border style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRouting() <em>Routing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouting()
	 * @generated
	 * @ordered
	 */
	protected static final Routing ROUTING_EDEFAULT = Routing.DIRECT;

	/**
	 * The cached value of the '{@link #getRouting() <em>Routing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouting()
	 * @generated
	 * @ordered
	 */
	protected Routing routing = ROUTING_EDEFAULT;

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
	protected RelationshipStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurizrPackage.Literals.RELATIONSHIP_STYLE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurizrPackage.RELATIONSHIP_STYLE__TAG, oldTag, tag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.RELATIONSHIP_STYLE__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getThickness() {
		return thickness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThickness(int newThickness) {
		int oldThickness = thickness;
		thickness = newThickness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.RELATIONSHIP_STYLE__THICKNESS, oldThickness, thickness));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.RELATIONSHIP_STYLE__FONT_SIZE, oldFontSize, fontSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.RELATIONSHIP_STYLE__WIDTH, oldWidth, width));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.RELATIONSHIP_STYLE__OPACITY, oldOpacity, opacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(int newPosition) {
		int oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.RELATIONSHIP_STYLE__POSITION, oldPosition, position));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.RELATIONSHIP_STYLE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Border getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(Border newStyle) {
		Border oldStyle = style;
		style = newStyle == null ? STYLE_EDEFAULT : newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.RELATIONSHIP_STYLE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Routing getRouting() {
		return routing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRouting(Routing newRouting) {
		Routing oldRouting = routing;
		routing = newRouting == null ? ROUTING_EDEFAULT : newRouting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.RELATIONSHIP_STYLE__ROUTING, oldRouting, routing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, StructurizrPackage.RELATIONSHIP_STYLE__PROPERTIES);
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
			case StructurizrPackage.RELATIONSHIP_STYLE__PROPERTIES:
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
			case StructurizrPackage.RELATIONSHIP_STYLE__TAG:
				if (resolve) return getTag();
				return basicGetTag();
			case StructurizrPackage.RELATIONSHIP_STYLE__THICKNESS:
				return getThickness();
			case StructurizrPackage.RELATIONSHIP_STYLE__FONT_SIZE:
				return getFontSize();
			case StructurizrPackage.RELATIONSHIP_STYLE__WIDTH:
				return getWidth();
			case StructurizrPackage.RELATIONSHIP_STYLE__OPACITY:
				return getOpacity();
			case StructurizrPackage.RELATIONSHIP_STYLE__POSITION:
				return getPosition();
			case StructurizrPackage.RELATIONSHIP_STYLE__COLOR:
				return getColor();
			case StructurizrPackage.RELATIONSHIP_STYLE__STYLE:
				return getStyle();
			case StructurizrPackage.RELATIONSHIP_STYLE__ROUTING:
				return getRouting();
			case StructurizrPackage.RELATIONSHIP_STYLE__PROPERTIES:
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
			case StructurizrPackage.RELATIONSHIP_STYLE__TAG:
				setTag((Tag)newValue);
				return;
			case StructurizrPackage.RELATIONSHIP_STYLE__THICKNESS:
				setThickness((Integer)newValue);
				return;
			case StructurizrPackage.RELATIONSHIP_STYLE__FONT_SIZE:
				setFontSize((Integer)newValue);
				return;
			case StructurizrPackage.RELATIONSHIP_STYLE__WIDTH:
				setWidth((Integer)newValue);
				return;
			case StructurizrPackage.RELATIONSHIP_STYLE__OPACITY:
				setOpacity((Integer)newValue);
				return;
			case StructurizrPackage.RELATIONSHIP_STYLE__POSITION:
				setPosition((Integer)newValue);
				return;
			case StructurizrPackage.RELATIONSHIP_STYLE__COLOR:
				setColor((String)newValue);
				return;
			case StructurizrPackage.RELATIONSHIP_STYLE__STYLE:
				setStyle((Border)newValue);
				return;
			case StructurizrPackage.RELATIONSHIP_STYLE__ROUTING:
				setRouting((Routing)newValue);
				return;
			case StructurizrPackage.RELATIONSHIP_STYLE__PROPERTIES:
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
			case StructurizrPackage.RELATIONSHIP_STYLE__TAG:
				setTag((Tag)null);
				return;
			case StructurizrPackage.RELATIONSHIP_STYLE__THICKNESS:
				setThickness(THICKNESS_EDEFAULT);
				return;
			case StructurizrPackage.RELATIONSHIP_STYLE__FONT_SIZE:
				setFontSize(FONT_SIZE_EDEFAULT);
				return;
			case StructurizrPackage.RELATIONSHIP_STYLE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case StructurizrPackage.RELATIONSHIP_STYLE__OPACITY:
				setOpacity(OPACITY_EDEFAULT);
				return;
			case StructurizrPackage.RELATIONSHIP_STYLE__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case StructurizrPackage.RELATIONSHIP_STYLE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case StructurizrPackage.RELATIONSHIP_STYLE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case StructurizrPackage.RELATIONSHIP_STYLE__ROUTING:
				setRouting(ROUTING_EDEFAULT);
				return;
			case StructurizrPackage.RELATIONSHIP_STYLE__PROPERTIES:
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
			case StructurizrPackage.RELATIONSHIP_STYLE__TAG:
				return tag != null;
			case StructurizrPackage.RELATIONSHIP_STYLE__THICKNESS:
				return thickness != THICKNESS_EDEFAULT;
			case StructurizrPackage.RELATIONSHIP_STYLE__FONT_SIZE:
				return fontSize != FONT_SIZE_EDEFAULT;
			case StructurizrPackage.RELATIONSHIP_STYLE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case StructurizrPackage.RELATIONSHIP_STYLE__OPACITY:
				return opacity != OPACITY_EDEFAULT;
			case StructurizrPackage.RELATIONSHIP_STYLE__POSITION:
				return position != POSITION_EDEFAULT;
			case StructurizrPackage.RELATIONSHIP_STYLE__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case StructurizrPackage.RELATIONSHIP_STYLE__STYLE:
				return style != STYLE_EDEFAULT;
			case StructurizrPackage.RELATIONSHIP_STYLE__ROUTING:
				return routing != ROUTING_EDEFAULT;
			case StructurizrPackage.RELATIONSHIP_STYLE__PROPERTIES:
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
		result.append(" (thickness: ");
		result.append(thickness);
		result.append(", fontSize: ");
		result.append(fontSize);
		result.append(", width: ");
		result.append(width);
		result.append(", opacity: ");
		result.append(opacity);
		result.append(", position: ");
		result.append(position);
		result.append(", color: ");
		result.append(color);
		result.append(", style: ");
		result.append(style);
		result.append(", routing: ");
		result.append(routing);
		result.append(')');
		return result.toString();
	}

} //RelationshipStyleImpl
