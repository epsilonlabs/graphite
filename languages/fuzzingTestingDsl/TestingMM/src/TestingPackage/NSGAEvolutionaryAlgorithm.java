/**
 */
package TestingPackage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NSGA Evolutionary Algorithm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.NSGAEvolutionaryAlgorithm#getPopulationSize <em>Population Size</em>}</li>
 *   <li>{@link TestingPackage.NSGAEvolutionaryAlgorithm#getIterations <em>Iterations</em>}</li>
 * </ul>
 *
 * @see TestingPackage.TestingMMPackage#getNSGAEvolutionaryAlgorithm()
 * @model
 * @generated
 */
public interface NSGAEvolutionaryAlgorithm extends EvolutionaryAlgorithm {
	/**
	 * Returns the value of the '<em><b>Population Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Population Size</em>' attribute.
	 * @see #setPopulationSize(int)
	 * @see TestingPackage.TestingMMPackage#getNSGAEvolutionaryAlgorithm_PopulationSize()
	 * @model
	 * @generated
	 */
	int getPopulationSize();

	/**
	 * Sets the value of the '{@link TestingPackage.NSGAEvolutionaryAlgorithm#getPopulationSize <em>Population Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Population Size</em>' attribute.
	 * @see #getPopulationSize()
	 * @generated
	 */
	void setPopulationSize(int value);

	/**
	 * Returns the value of the '<em><b>Iterations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterations</em>' attribute.
	 * @see #setIterations(int)
	 * @see TestingPackage.TestingMMPackage#getNSGAEvolutionaryAlgorithm_Iterations()
	 * @model
	 * @generated
	 */
	int getIterations();

	/**
	 * Sets the value of the '{@link TestingPackage.NSGAEvolutionaryAlgorithm#getIterations <em>Iterations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterations</em>' attribute.
	 * @see #getIterations()
	 * @generated
	 */
	void setIterations(int value);

} // NSGAEvolutionaryAlgorithm
