/**
 */
package structurizr.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import structurizr.ConditionComparisonOperation;
import structurizr.Property;
import structurizr.RelationshipPropertyCondition;
import structurizr.StructurizrPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Property Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structurizr.impl.RelationshipPropertyConditionImpl#getComparisonOperation <em>Comparison Operation</em>}</li>
 *   <li>{@link structurizr.impl.RelationshipPropertyConditionImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link structurizr.impl.RelationshipPropertyConditionImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipPropertyConditionImpl extends RelationshipFilterConditionImpl implements RelationshipPropertyCondition {
	/**
	 * The default value of the '{@link #getComparisonOperation() <em>Comparison Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonOperation()
	 * @generated
	 * @ordered
	 */
	protected static final ConditionComparisonOperation COMPARISON_OPERATION_EDEFAULT = ConditionComparisonOperation.EQUALS;

	/**
	 * The cached value of the '{@link #getComparisonOperation() <em>Comparison Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparisonOperation()
	 * @generated
	 * @ordered
	 */
	protected ConditionComparisonOperation comparisonOperation = COMPARISON_OPERATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperty()
	 * @generated
	 * @ordered
	 */
	protected Property property;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipPropertyConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurizrPackage.Literals.RELATIONSHIP_PROPERTY_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionComparisonOperation getComparisonOperation() {
		return comparisonOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparisonOperation(ConditionComparisonOperation newComparisonOperation) {
		ConditionComparisonOperation oldComparisonOperation = comparisonOperation;
		comparisonOperation = newComparisonOperation == null ? COMPARISON_OPERATION_EDEFAULT : newComparisonOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.RELATIONSHIP_PROPERTY_CONDITION__COMPARISON_OPERATION, oldComparisonOperation, comparisonOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getProperty() {
		if (property != null && property.eIsProxy()) {
			InternalEObject oldProperty = (InternalEObject)property;
			property = (Property)eResolveProxy(oldProperty);
			if (property != oldProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurizrPackage.RELATIONSHIP_PROPERTY_CONDITION__PROPERTY, oldProperty, property));
			}
		}
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetProperty() {
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperty(Property newProperty) {
		Property oldProperty = property;
		property = newProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.RELATIONSHIP_PROPERTY_CONDITION__PROPERTY, oldProperty, property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.RELATIONSHIP_PROPERTY_CONDITION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurizrPackage.RELATIONSHIP_PROPERTY_CONDITION__COMPARISON_OPERATION:
				return getComparisonOperation();
			case StructurizrPackage.RELATIONSHIP_PROPERTY_CONDITION__PROPERTY:
				if (resolve) return getProperty();
				return basicGetProperty();
			case StructurizrPackage.RELATIONSHIP_PROPERTY_CONDITION__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StructurizrPackage.RELATIONSHIP_PROPERTY_CONDITION__COMPARISON_OPERATION:
				setComparisonOperation((ConditionComparisonOperation)newValue);
				return;
			case StructurizrPackage.RELATIONSHIP_PROPERTY_CONDITION__PROPERTY:
				setProperty((Property)newValue);
				return;
			case StructurizrPackage.RELATIONSHIP_PROPERTY_CONDITION__VALUE:
				setValue((String)newValue);
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
			case StructurizrPackage.RELATIONSHIP_PROPERTY_CONDITION__COMPARISON_OPERATION:
				setComparisonOperation(COMPARISON_OPERATION_EDEFAULT);
				return;
			case StructurizrPackage.RELATIONSHIP_PROPERTY_CONDITION__PROPERTY:
				setProperty((Property)null);
				return;
			case StructurizrPackage.RELATIONSHIP_PROPERTY_CONDITION__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case StructurizrPackage.RELATIONSHIP_PROPERTY_CONDITION__COMPARISON_OPERATION:
				return comparisonOperation != COMPARISON_OPERATION_EDEFAULT;
			case StructurizrPackage.RELATIONSHIP_PROPERTY_CONDITION__PROPERTY:
				return property != null;
			case StructurizrPackage.RELATIONSHIP_PROPERTY_CONDITION__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (comparisonOperation: ");
		result.append(comparisonOperation);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //RelationshipPropertyConditionImpl
