/**
 */
package TestingPackage.FuzzingOperations.impl;

import TestingPackage.FuzzingOperations.FuzzingOperationsPackage;
import TestingPackage.FuzzingOperations.VariableOperation;

import TestingPackage.MRSPackage.Parameter;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.VariableOperationImpl#getSubParameters <em>Sub Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableOperationImpl extends FuzzTestingOperationImpl implements VariableOperation {
	/**
	 * The cached value of the '{@link #getSubParameters() <em>Sub Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> subParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FuzzingOperationsPackage.Literals.VARIABLE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getSubParameters() {
		if (subParameters == null) {
			subParameters = new EObjectResolvingEList<Parameter>(Parameter.class, this, FuzzingOperationsPackage.VARIABLE_OPERATION__SUB_PARAMETERS);
		}
		return subParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FuzzingOperationsPackage.VARIABLE_OPERATION__SUB_PARAMETERS:
				return getSubParameters();
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
			case FuzzingOperationsPackage.VARIABLE_OPERATION__SUB_PARAMETERS:
				getSubParameters().clear();
				getSubParameters().addAll((Collection<? extends Parameter>)newValue);
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
			case FuzzingOperationsPackage.VARIABLE_OPERATION__SUB_PARAMETERS:
				getSubParameters().clear();
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
			case FuzzingOperationsPackage.VARIABLE_OPERATION__SUB_PARAMETERS:
				return subParameters != null && !subParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VariableOperationImpl
