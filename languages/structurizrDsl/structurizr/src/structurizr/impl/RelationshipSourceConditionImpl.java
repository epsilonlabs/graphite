/**
 */
package structurizr.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import structurizr.ConditionComparisonOperation;
import structurizr.IdentifiableElement;
import structurizr.RelationshipSourceCondition;
import structurizr.StructurizrPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Source Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structurizr.impl.RelationshipSourceConditionImpl#getComparisonOperation <em>Comparison Operation</em>}</li>
 *   <li>{@link structurizr.impl.RelationshipSourceConditionImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationshipSourceConditionImpl extends RelationshipFilterConditionImpl implements RelationshipSourceCondition {
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected IdentifiableElement source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipSourceConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurizrPackage.Literals.RELATIONSHIP_SOURCE_CONDITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.RELATIONSHIP_SOURCE_CONDITION__COMPARISON_OPERATION, oldComparisonOperation, comparisonOperation));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurizrPackage.RELATIONSHIP_SOURCE_CONDITION__SOURCE, oldSource, source));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.RELATIONSHIP_SOURCE_CONDITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurizrPackage.RELATIONSHIP_SOURCE_CONDITION__COMPARISON_OPERATION:
				return getComparisonOperation();
			case StructurizrPackage.RELATIONSHIP_SOURCE_CONDITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
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
			case StructurizrPackage.RELATIONSHIP_SOURCE_CONDITION__COMPARISON_OPERATION:
				setComparisonOperation((ConditionComparisonOperation)newValue);
				return;
			case StructurizrPackage.RELATIONSHIP_SOURCE_CONDITION__SOURCE:
				setSource((IdentifiableElement)newValue);
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
			case StructurizrPackage.RELATIONSHIP_SOURCE_CONDITION__COMPARISON_OPERATION:
				setComparisonOperation(COMPARISON_OPERATION_EDEFAULT);
				return;
			case StructurizrPackage.RELATIONSHIP_SOURCE_CONDITION__SOURCE:
				setSource((IdentifiableElement)null);
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
			case StructurizrPackage.RELATIONSHIP_SOURCE_CONDITION__COMPARISON_OPERATION:
				return comparisonOperation != COMPARISON_OPERATION_EDEFAULT;
			case StructurizrPackage.RELATIONSHIP_SOURCE_CONDITION__SOURCE:
				return source != null;
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
		result.append(')');
		return result.toString();
	}

} //RelationshipSourceConditionImpl
