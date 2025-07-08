/**
 */
package TestingPackage.impl;

import TestingPackage.NSGAEvolutionaryAlgorithm;
import TestingPackage.TestingMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NSGA Evolutionary Algorithm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.impl.NSGAEvolutionaryAlgorithmImpl#getPopulationSize <em>Population Size</em>}</li>
 *   <li>{@link TestingPackage.impl.NSGAEvolutionaryAlgorithmImpl#getIterations <em>Iterations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NSGAEvolutionaryAlgorithmImpl extends EvolutionaryAlgorithmImpl implements NSGAEvolutionaryAlgorithm {
	/**
	 * The default value of the '{@link #getPopulationSize() <em>Population Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulationSize()
	 * @generated
	 * @ordered
	 */
	protected static final int POPULATION_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPopulationSize() <em>Population Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPopulationSize()
	 * @generated
	 * @ordered
	 */
	protected int populationSize = POPULATION_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIterations() <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterations()
	 * @generated
	 * @ordered
	 */
	protected static final int ITERATIONS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIterations() <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterations()
	 * @generated
	 * @ordered
	 */
	protected int iterations = ITERATIONS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NSGAEvolutionaryAlgorithmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestingMMPackage.Literals.NSGA_EVOLUTIONARY_ALGORITHM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPopulationSize() {
		return populationSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPopulationSize(int newPopulationSize) {
		int oldPopulationSize = populationSize;
		populationSize = newPopulationSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingMMPackage.NSGA_EVOLUTIONARY_ALGORITHM__POPULATION_SIZE, oldPopulationSize, populationSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIterations() {
		return iterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterations(int newIterations) {
		int oldIterations = iterations;
		iterations = newIterations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestingMMPackage.NSGA_EVOLUTIONARY_ALGORITHM__ITERATIONS, oldIterations, iterations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestingMMPackage.NSGA_EVOLUTIONARY_ALGORITHM__POPULATION_SIZE:
				return getPopulationSize();
			case TestingMMPackage.NSGA_EVOLUTIONARY_ALGORITHM__ITERATIONS:
				return getIterations();
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
			case TestingMMPackage.NSGA_EVOLUTIONARY_ALGORITHM__POPULATION_SIZE:
				setPopulationSize((Integer)newValue);
				return;
			case TestingMMPackage.NSGA_EVOLUTIONARY_ALGORITHM__ITERATIONS:
				setIterations((Integer)newValue);
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
			case TestingMMPackage.NSGA_EVOLUTIONARY_ALGORITHM__POPULATION_SIZE:
				setPopulationSize(POPULATION_SIZE_EDEFAULT);
				return;
			case TestingMMPackage.NSGA_EVOLUTIONARY_ALGORITHM__ITERATIONS:
				setIterations(ITERATIONS_EDEFAULT);
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
			case TestingMMPackage.NSGA_EVOLUTIONARY_ALGORITHM__POPULATION_SIZE:
				return populationSize != POPULATION_SIZE_EDEFAULT;
			case TestingMMPackage.NSGA_EVOLUTIONARY_ALGORITHM__ITERATIONS:
				return iterations != ITERATIONS_EDEFAULT;
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
		result.append(" (populationSize: ");
		result.append(populationSize);
		result.append(", iterations: ");
		result.append(iterations);
		result.append(')');
		return result.toString();
	}

} //NSGAEvolutionaryAlgorithmImpl
