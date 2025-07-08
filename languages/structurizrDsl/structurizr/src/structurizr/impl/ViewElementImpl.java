/**
 */
package structurizr.impl;

import graphite.shared.CustomEObjectImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import structurizr.AutoLayout;
import structurizr.ConditionElement;
import structurizr.Property;
import structurizr.StructurizrPackage;
import structurizr.ViewElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structurizr.impl.ViewElementImpl#getKey <em>Key</em>}</li>
 *   <li>{@link structurizr.impl.ViewElementImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link structurizr.impl.ViewElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link structurizr.impl.ViewElementImpl#getAutoLayout <em>Auto Layout</em>}</li>
 *   <li>{@link structurizr.impl.ViewElementImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link structurizr.impl.ViewElementImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link structurizr.impl.ViewElementImpl#getExclude <em>Exclude</em>}</li>
 *   <li>{@link structurizr.impl.ViewElementImpl#getIncludeExpression <em>Include Expression</em>}</li>
 *   <li>{@link structurizr.impl.ViewElementImpl#getExcludeExpression <em>Exclude Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ViewElementImpl extends CustomEObjectImpl implements ViewElement {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAutoLayout() <em>Auto Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoLayout()
	 * @generated
	 * @ordered
	 */
	protected AutoLayout autoLayout;

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
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected ConditionElement include;

	/**
	 * The cached value of the '{@link #getExclude() <em>Exclude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected ConditionElement exclude;

	/**
	 * The default value of the '{@link #getIncludeExpression() <em>Include Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeExpression() <em>Include Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeExpression()
	 * @generated
	 * @ordered
	 */
	protected String includeExpression = INCLUDE_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExcludeExpression() <em>Exclude Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCLUDE_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExcludeExpression() <em>Exclude Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeExpression()
	 * @generated
	 * @ordered
	 */
	protected String excludeExpression = EXCLUDE_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurizrPackage.Literals.VIEW_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.VIEW_ELEMENT__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.VIEW_ELEMENT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.VIEW_ELEMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoLayout getAutoLayout() {
		return autoLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutoLayout(AutoLayout newAutoLayout, NotificationChain msgs) {
		AutoLayout oldAutoLayout = autoLayout;
		autoLayout = newAutoLayout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurizrPackage.VIEW_ELEMENT__AUTO_LAYOUT, oldAutoLayout, newAutoLayout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoLayout(AutoLayout newAutoLayout) {
		if (newAutoLayout != autoLayout) {
			NotificationChain msgs = null;
			if (autoLayout != null)
				msgs = ((InternalEObject)autoLayout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurizrPackage.VIEW_ELEMENT__AUTO_LAYOUT, null, msgs);
			if (newAutoLayout != null)
				msgs = ((InternalEObject)newAutoLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurizrPackage.VIEW_ELEMENT__AUTO_LAYOUT, null, msgs);
			msgs = basicSetAutoLayout(newAutoLayout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.VIEW_ELEMENT__AUTO_LAYOUT, newAutoLayout, newAutoLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, StructurizrPackage.VIEW_ELEMENT__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionElement getInclude() {
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInclude(ConditionElement newInclude, NotificationChain msgs) {
		ConditionElement oldInclude = include;
		include = newInclude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurizrPackage.VIEW_ELEMENT__INCLUDE, oldInclude, newInclude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInclude(ConditionElement newInclude) {
		if (newInclude != include) {
			NotificationChain msgs = null;
			if (include != null)
				msgs = ((InternalEObject)include).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurizrPackage.VIEW_ELEMENT__INCLUDE, null, msgs);
			if (newInclude != null)
				msgs = ((InternalEObject)newInclude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurizrPackage.VIEW_ELEMENT__INCLUDE, null, msgs);
			msgs = basicSetInclude(newInclude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.VIEW_ELEMENT__INCLUDE, newInclude, newInclude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionElement getExclude() {
		return exclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExclude(ConditionElement newExclude, NotificationChain msgs) {
		ConditionElement oldExclude = exclude;
		exclude = newExclude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurizrPackage.VIEW_ELEMENT__EXCLUDE, oldExclude, newExclude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclude(ConditionElement newExclude) {
		if (newExclude != exclude) {
			NotificationChain msgs = null;
			if (exclude != null)
				msgs = ((InternalEObject)exclude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurizrPackage.VIEW_ELEMENT__EXCLUDE, null, msgs);
			if (newExclude != null)
				msgs = ((InternalEObject)newExclude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurizrPackage.VIEW_ELEMENT__EXCLUDE, null, msgs);
			msgs = basicSetExclude(newExclude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.VIEW_ELEMENT__EXCLUDE, newExclude, newExclude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncludeExpression() {
		return includeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeExpression(String newIncludeExpression) {
		String oldIncludeExpression = includeExpression;
		includeExpression = newIncludeExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.VIEW_ELEMENT__INCLUDE_EXPRESSION, oldIncludeExpression, includeExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExcludeExpression() {
		return excludeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeExpression(String newExcludeExpression) {
		String oldExcludeExpression = excludeExpression;
		excludeExpression = newExcludeExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.VIEW_ELEMENT__EXCLUDE_EXPRESSION, oldExcludeExpression, excludeExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurizrPackage.VIEW_ELEMENT__AUTO_LAYOUT:
				return basicSetAutoLayout(null, msgs);
			case StructurizrPackage.VIEW_ELEMENT__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case StructurizrPackage.VIEW_ELEMENT__INCLUDE:
				return basicSetInclude(null, msgs);
			case StructurizrPackage.VIEW_ELEMENT__EXCLUDE:
				return basicSetExclude(null, msgs);
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
			case StructurizrPackage.VIEW_ELEMENT__KEY:
				return getKey();
			case StructurizrPackage.VIEW_ELEMENT__TITLE:
				return getTitle();
			case StructurizrPackage.VIEW_ELEMENT__DESCRIPTION:
				return getDescription();
			case StructurizrPackage.VIEW_ELEMENT__AUTO_LAYOUT:
				return getAutoLayout();
			case StructurizrPackage.VIEW_ELEMENT__PROPERTIES:
				return getProperties();
			case StructurizrPackage.VIEW_ELEMENT__INCLUDE:
				return getInclude();
			case StructurizrPackage.VIEW_ELEMENT__EXCLUDE:
				return getExclude();
			case StructurizrPackage.VIEW_ELEMENT__INCLUDE_EXPRESSION:
				return getIncludeExpression();
			case StructurizrPackage.VIEW_ELEMENT__EXCLUDE_EXPRESSION:
				return getExcludeExpression();
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
			case StructurizrPackage.VIEW_ELEMENT__KEY:
				setKey((String)newValue);
				return;
			case StructurizrPackage.VIEW_ELEMENT__TITLE:
				setTitle((String)newValue);
				return;
			case StructurizrPackage.VIEW_ELEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case StructurizrPackage.VIEW_ELEMENT__AUTO_LAYOUT:
				setAutoLayout((AutoLayout)newValue);
				return;
			case StructurizrPackage.VIEW_ELEMENT__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case StructurizrPackage.VIEW_ELEMENT__INCLUDE:
				setInclude((ConditionElement)newValue);
				return;
			case StructurizrPackage.VIEW_ELEMENT__EXCLUDE:
				setExclude((ConditionElement)newValue);
				return;
			case StructurizrPackage.VIEW_ELEMENT__INCLUDE_EXPRESSION:
				setIncludeExpression((String)newValue);
				return;
			case StructurizrPackage.VIEW_ELEMENT__EXCLUDE_EXPRESSION:
				setExcludeExpression((String)newValue);
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
			case StructurizrPackage.VIEW_ELEMENT__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case StructurizrPackage.VIEW_ELEMENT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case StructurizrPackage.VIEW_ELEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case StructurizrPackage.VIEW_ELEMENT__AUTO_LAYOUT:
				setAutoLayout((AutoLayout)null);
				return;
			case StructurizrPackage.VIEW_ELEMENT__PROPERTIES:
				getProperties().clear();
				return;
			case StructurizrPackage.VIEW_ELEMENT__INCLUDE:
				setInclude((ConditionElement)null);
				return;
			case StructurizrPackage.VIEW_ELEMENT__EXCLUDE:
				setExclude((ConditionElement)null);
				return;
			case StructurizrPackage.VIEW_ELEMENT__INCLUDE_EXPRESSION:
				setIncludeExpression(INCLUDE_EXPRESSION_EDEFAULT);
				return;
			case StructurizrPackage.VIEW_ELEMENT__EXCLUDE_EXPRESSION:
				setExcludeExpression(EXCLUDE_EXPRESSION_EDEFAULT);
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
			case StructurizrPackage.VIEW_ELEMENT__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case StructurizrPackage.VIEW_ELEMENT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case StructurizrPackage.VIEW_ELEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case StructurizrPackage.VIEW_ELEMENT__AUTO_LAYOUT:
				return autoLayout != null;
			case StructurizrPackage.VIEW_ELEMENT__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case StructurizrPackage.VIEW_ELEMENT__INCLUDE:
				return include != null;
			case StructurizrPackage.VIEW_ELEMENT__EXCLUDE:
				return exclude != null;
			case StructurizrPackage.VIEW_ELEMENT__INCLUDE_EXPRESSION:
				return INCLUDE_EXPRESSION_EDEFAULT == null ? includeExpression != null : !INCLUDE_EXPRESSION_EDEFAULT.equals(includeExpression);
			case StructurizrPackage.VIEW_ELEMENT__EXCLUDE_EXPRESSION:
				return EXCLUDE_EXPRESSION_EDEFAULT == null ? excludeExpression != null : !EXCLUDE_EXPRESSION_EDEFAULT.equals(excludeExpression);
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
		result.append(" (key: ");
		result.append(key);
		result.append(", title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", includeExpression: ");
		result.append(includeExpression);
		result.append(", excludeExpression: ");
		result.append(excludeExpression);
		result.append(')');
		return result.toString();
	}

} //ViewElementImpl
