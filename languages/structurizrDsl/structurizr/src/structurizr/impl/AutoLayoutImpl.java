/**
 */
package structurizr.impl;

import graphite.shared.CustomEObjectImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import structurizr.AutoLayout;
import structurizr.AutoLayoutOption;
import structurizr.StructurizrPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auto Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structurizr.impl.AutoLayoutImpl#getAutoLayoutOption <em>Auto Layout Option</em>}</li>
 *   <li>{@link structurizr.impl.AutoLayoutImpl#getRankSeparation <em>Rank Separation</em>}</li>
 *   <li>{@link structurizr.impl.AutoLayoutImpl#getNodeSeparation <em>Node Separation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AutoLayoutImpl extends CustomEObjectImpl implements AutoLayout {
	/**
	 * The default value of the '{@link #getAutoLayoutOption() <em>Auto Layout Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoLayoutOption()
	 * @generated
	 * @ordered
	 */
	protected static final AutoLayoutOption AUTO_LAYOUT_OPTION_EDEFAULT = AutoLayoutOption.LEFT_TO_RIGHT;

	/**
	 * The cached value of the '{@link #getAutoLayoutOption() <em>Auto Layout Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoLayoutOption()
	 * @generated
	 * @ordered
	 */
	protected AutoLayoutOption autoLayoutOption = AUTO_LAYOUT_OPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRankSeparation() <em>Rank Separation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRankSeparation()
	 * @generated
	 * @ordered
	 */
	protected static final int RANK_SEPARATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRankSeparation() <em>Rank Separation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRankSeparation()
	 * @generated
	 * @ordered
	 */
	protected int rankSeparation = RANK_SEPARATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeSeparation() <em>Node Separation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeSeparation()
	 * @generated
	 * @ordered
	 */
	protected static final int NODE_SEPARATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNodeSeparation() <em>Node Separation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeSeparation()
	 * @generated
	 * @ordered
	 */
	protected int nodeSeparation = NODE_SEPARATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutoLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurizrPackage.Literals.AUTO_LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoLayoutOption getAutoLayoutOption() {
		return autoLayoutOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoLayoutOption(AutoLayoutOption newAutoLayoutOption) {
		AutoLayoutOption oldAutoLayoutOption = autoLayoutOption;
		autoLayoutOption = newAutoLayoutOption == null ? AUTO_LAYOUT_OPTION_EDEFAULT : newAutoLayoutOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.AUTO_LAYOUT__AUTO_LAYOUT_OPTION, oldAutoLayoutOption, autoLayoutOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRankSeparation() {
		return rankSeparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRankSeparation(int newRankSeparation) {
		int oldRankSeparation = rankSeparation;
		rankSeparation = newRankSeparation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.AUTO_LAYOUT__RANK_SEPARATION, oldRankSeparation, rankSeparation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNodeSeparation() {
		return nodeSeparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeSeparation(int newNodeSeparation) {
		int oldNodeSeparation = nodeSeparation;
		nodeSeparation = newNodeSeparation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurizrPackage.AUTO_LAYOUT__NODE_SEPARATION, oldNodeSeparation, nodeSeparation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurizrPackage.AUTO_LAYOUT__AUTO_LAYOUT_OPTION:
				return getAutoLayoutOption();
			case StructurizrPackage.AUTO_LAYOUT__RANK_SEPARATION:
				return getRankSeparation();
			case StructurizrPackage.AUTO_LAYOUT__NODE_SEPARATION:
				return getNodeSeparation();
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
			case StructurizrPackage.AUTO_LAYOUT__AUTO_LAYOUT_OPTION:
				setAutoLayoutOption((AutoLayoutOption)newValue);
				return;
			case StructurizrPackage.AUTO_LAYOUT__RANK_SEPARATION:
				setRankSeparation((Integer)newValue);
				return;
			case StructurizrPackage.AUTO_LAYOUT__NODE_SEPARATION:
				setNodeSeparation((Integer)newValue);
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
			case StructurizrPackage.AUTO_LAYOUT__AUTO_LAYOUT_OPTION:
				setAutoLayoutOption(AUTO_LAYOUT_OPTION_EDEFAULT);
				return;
			case StructurizrPackage.AUTO_LAYOUT__RANK_SEPARATION:
				setRankSeparation(RANK_SEPARATION_EDEFAULT);
				return;
			case StructurizrPackage.AUTO_LAYOUT__NODE_SEPARATION:
				setNodeSeparation(NODE_SEPARATION_EDEFAULT);
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
			case StructurizrPackage.AUTO_LAYOUT__AUTO_LAYOUT_OPTION:
				return autoLayoutOption != AUTO_LAYOUT_OPTION_EDEFAULT;
			case StructurizrPackage.AUTO_LAYOUT__RANK_SEPARATION:
				return rankSeparation != RANK_SEPARATION_EDEFAULT;
			case StructurizrPackage.AUTO_LAYOUT__NODE_SEPARATION:
				return nodeSeparation != NODE_SEPARATION_EDEFAULT;
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
		result.append(" (autoLayoutOption: ");
		result.append(autoLayoutOption);
		result.append(", rankSeparation: ");
		result.append(rankSeparation);
		result.append(", nodeSeparation: ");
		result.append(nodeSeparation);
		result.append(')');
		return result.toString();
	}

} //AutoLayoutImpl
