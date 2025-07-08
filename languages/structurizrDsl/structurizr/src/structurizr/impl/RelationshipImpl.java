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

import structurizr.IdentifiableElement;
import structurizr.Perspective;
import structurizr.Property;
import structurizr.Relationship;
import structurizr.StructurizrPackage;
import structurizr.Tag;
import structurizr.Technology;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structurizr.impl.RelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link structurizr.impl.RelationshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link structurizr.impl.RelationshipImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link structurizr.impl.RelationshipImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link structurizr.impl.RelationshipImpl#getTechnology <em>Technology</em>}</li>
 *   <li>{@link structurizr.impl.RelationshipImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link structurizr.impl.RelationshipImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link structurizr.impl.RelationshipImpl#getPerspectives <em>Perspectives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipImpl extends CustomEObjectImpl implements Relationship {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected IdentifiableElement source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected IdentifiableElement target;

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
	 * The cached value of the '{@link #getTechnology() <em>Technology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnology()
	 * @generated
	 * @ordered
	 */
	protected Technology technology;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

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
	 * The cached value of the '{@link #getPerspectives() <em>Perspectives</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerspectives()
	 * @generated
	 * @ordered
	 */
	protected EList<Perspective> perspectives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurizrPackage.Literals.RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiableElement getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (IdentifiableElement)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurizrPackage.RELATIONSHIP__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiableElement basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(IdentifiableElement newSource) {
		IdentifiableElement oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.RELATIONSHIP__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiableElement getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (IdentifiableElement)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurizrPackage.RELATIONSHIP__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiableElement basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(IdentifiableElement newTarget) {
		IdentifiableElement oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.RELATIONSHIP__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.RELATIONSHIP__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.RELATIONSHIP__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Technology getTechnology() {
		return technology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTechnology(Technology newTechnology, NotificationChain msgs) {
		Technology oldTechnology = technology;
		technology = newTechnology;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurizrPackage.RELATIONSHIP__TECHNOLOGY, oldTechnology, newTechnology);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTechnology(Technology newTechnology) {
		if (newTechnology != technology) {
			NotificationChain msgs = null;
			if (technology != null)
				msgs = ((InternalEObject)technology).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurizrPackage.RELATIONSHIP__TECHNOLOGY, null, msgs);
			if (newTechnology != null)
				msgs = ((InternalEObject)newTechnology).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StructurizrPackage.RELATIONSHIP__TECHNOLOGY, null, msgs);
			msgs = basicSetTechnology(newTechnology, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.RELATIONSHIP__TECHNOLOGY, newTechnology, newTechnology));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<Tag>(Tag.class, this, StructurizrPackage.RELATIONSHIP__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, StructurizrPackage.RELATIONSHIP__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Perspective> getPerspectives() {
		if (perspectives == null) {
			perspectives = new EObjectContainmentEList<Perspective>(Perspective.class, this, StructurizrPackage.RELATIONSHIP__PERSPECTIVES);
		}
		return perspectives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurizrPackage.RELATIONSHIP__TECHNOLOGY:
				return basicSetTechnology(null, msgs);
			case StructurizrPackage.RELATIONSHIP__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case StructurizrPackage.RELATIONSHIP__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case StructurizrPackage.RELATIONSHIP__PERSPECTIVES:
				return ((InternalEList<?>)getPerspectives()).basicRemove(otherEnd, msgs);
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
			case StructurizrPackage.RELATIONSHIP__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StructurizrPackage.RELATIONSHIP__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StructurizrPackage.RELATIONSHIP__DESCRIPTION:
				return getDescription();
			case StructurizrPackage.RELATIONSHIP__URL:
				return getUrl();
			case StructurizrPackage.RELATIONSHIP__TECHNOLOGY:
				return getTechnology();
			case StructurizrPackage.RELATIONSHIP__TAGS:
				return getTags();
			case StructurizrPackage.RELATIONSHIP__PROPERTIES:
				return getProperties();
			case StructurizrPackage.RELATIONSHIP__PERSPECTIVES:
				return getPerspectives();
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
			case StructurizrPackage.RELATIONSHIP__SOURCE:
				setSource((IdentifiableElement)newValue);
				return;
			case StructurizrPackage.RELATIONSHIP__TARGET:
				setTarget((IdentifiableElement)newValue);
				return;
			case StructurizrPackage.RELATIONSHIP__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case StructurizrPackage.RELATIONSHIP__URL:
				setUrl((String)newValue);
				return;
			case StructurizrPackage.RELATIONSHIP__TECHNOLOGY:
				setTechnology((Technology)newValue);
				return;
			case StructurizrPackage.RELATIONSHIP__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
				return;
			case StructurizrPackage.RELATIONSHIP__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case StructurizrPackage.RELATIONSHIP__PERSPECTIVES:
				getPerspectives().clear();
				getPerspectives().addAll((Collection<? extends Perspective>)newValue);
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
			case StructurizrPackage.RELATIONSHIP__SOURCE:
				setSource((IdentifiableElement)null);
				return;
			case StructurizrPackage.RELATIONSHIP__TARGET:
				setTarget((IdentifiableElement)null);
				return;
			case StructurizrPackage.RELATIONSHIP__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case StructurizrPackage.RELATIONSHIP__URL:
				setUrl(URL_EDEFAULT);
				return;
			case StructurizrPackage.RELATIONSHIP__TECHNOLOGY:
				setTechnology((Technology)null);
				return;
			case StructurizrPackage.RELATIONSHIP__TAGS:
				getTags().clear();
				return;
			case StructurizrPackage.RELATIONSHIP__PROPERTIES:
				getProperties().clear();
				return;
			case StructurizrPackage.RELATIONSHIP__PERSPECTIVES:
				getPerspectives().clear();
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
			case StructurizrPackage.RELATIONSHIP__SOURCE:
				return source != null;
			case StructurizrPackage.RELATIONSHIP__TARGET:
				return target != null;
			case StructurizrPackage.RELATIONSHIP__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case StructurizrPackage.RELATIONSHIP__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case StructurizrPackage.RELATIONSHIP__TECHNOLOGY:
				return technology != null;
			case StructurizrPackage.RELATIONSHIP__TAGS:
				return tags != null && !tags.isEmpty();
			case StructurizrPackage.RELATIONSHIP__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case StructurizrPackage.RELATIONSHIP__PERSPECTIVES:
				return perspectives != null && !perspectives.isEmpty();
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
		result.append(" (description: ");
		result.append(description);
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

} //RelationshipImpl
