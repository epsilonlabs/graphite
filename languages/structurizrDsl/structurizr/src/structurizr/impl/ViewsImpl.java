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

import structurizr.StructurizrPackage;
import structurizr.Style;
import structurizr.ViewElement;
import structurizr.Views;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Views</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structurizr.impl.ViewsImpl#getName <em>Name</em>}</li>
 *   <li>{@link structurizr.impl.ViewsImpl#getViewElements <em>View Elements</em>}</li>
 *   <li>{@link structurizr.impl.ViewsImpl#getStyles <em>Styles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewsImpl extends CustomEObjectImpl implements Views {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getViewElements() <em>View Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewElement> viewElements;

	/**
	 * The cached value of the '{@link #getStyles() <em>Styles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<Style> styles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurizrPackage.Literals.VIEWS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.VIEWS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewElement> getViewElements() {
		if (viewElements == null) {
			viewElements = new EObjectContainmentEList<ViewElement>(ViewElement.class, this, StructurizrPackage.VIEWS__VIEW_ELEMENTS);
		}
		return viewElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Style> getStyles() {
		if (styles == null) {
			styles = new EObjectContainmentEList<Style>(Style.class, this, StructurizrPackage.VIEWS__STYLES);
		}
		return styles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurizrPackage.VIEWS__VIEW_ELEMENTS:
				return ((InternalEList<?>)getViewElements()).basicRemove(otherEnd, msgs);
			case StructurizrPackage.VIEWS__STYLES:
				return ((InternalEList<?>)getStyles()).basicRemove(otherEnd, msgs);
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
			case StructurizrPackage.VIEWS__NAME:
				return getName();
			case StructurizrPackage.VIEWS__VIEW_ELEMENTS:
				return getViewElements();
			case StructurizrPackage.VIEWS__STYLES:
				return getStyles();
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
			case StructurizrPackage.VIEWS__NAME:
				setName((String)newValue);
				return;
			case StructurizrPackage.VIEWS__VIEW_ELEMENTS:
				getViewElements().clear();
				getViewElements().addAll((Collection<? extends ViewElement>)newValue);
				return;
			case StructurizrPackage.VIEWS__STYLES:
				getStyles().clear();
				getStyles().addAll((Collection<? extends Style>)newValue);
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
			case StructurizrPackage.VIEWS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StructurizrPackage.VIEWS__VIEW_ELEMENTS:
				getViewElements().clear();
				return;
			case StructurizrPackage.VIEWS__STYLES:
				getStyles().clear();
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
			case StructurizrPackage.VIEWS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StructurizrPackage.VIEWS__VIEW_ELEMENTS:
				return viewElements != null && !viewElements.isEmpty();
			case StructurizrPackage.VIEWS__STYLES:
				return styles != null && !styles.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ViewsImpl
