/**
 */
package TestingPackage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NSGA With Coverage Cells</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.NSGAWithCoverageCells#getCoveragePerCell <em>Coverage Per Cell</em>}</li>
 *   <li>{@link TestingPackage.NSGAWithCoverageCells#getTargetCoverageProportion <em>Target Coverage Proportion</em>}</li>
 *   <li>{@link TestingPackage.NSGAWithCoverageCells#getDimensionRecords <em>Dimension Records</em>}</li>
 *   <li>{@link TestingPackage.NSGAWithCoverageCells#isUseMutationEnhancingCoverage <em>Use Mutation Enhancing Coverage</em>}</li>
 * </ul>
 *
 * @see TestingPackage.TestingMMPackage#getNSGAWithCoverageCells()
 * @model
 * @generated
 */
public interface NSGAWithCoverageCells extends NSGAEvolutionaryAlgorithm {
	/**
	 * Returns the value of the '<em><b>Coverage Per Cell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage Per Cell</em>' attribute.
	 * @see #setCoveragePerCell(int)
	 * @see TestingPackage.TestingMMPackage#getNSGAWithCoverageCells_CoveragePerCell()
	 * @model
	 * @generated
	 */
	int getCoveragePerCell();

	/**
	 * Sets the value of the '{@link TestingPackage.NSGAWithCoverageCells#getCoveragePerCell <em>Coverage Per Cell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage Per Cell</em>' attribute.
	 * @see #getCoveragePerCell()
	 * @generated
	 */
	void setCoveragePerCell(int value);

	/**
	 * Returns the value of the '<em><b>Target Coverage Proportion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Coverage Proportion</em>' attribute.
	 * @see #setTargetCoverageProportion(double)
	 * @see TestingPackage.TestingMMPackage#getNSGAWithCoverageCells_TargetCoverageProportion()
	 * @model
	 * @generated
	 */
	double getTargetCoverageProportion();

	/**
	 * Sets the value of the '{@link TestingPackage.NSGAWithCoverageCells#getTargetCoverageProportion <em>Target Coverage Proportion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Coverage Proportion</em>' attribute.
	 * @see #getTargetCoverageProportion()
	 * @generated
	 */
	void setTargetCoverageProportion(double value);

	/**
	 * Returns the value of the '<em><b>Dimension Records</b></em>' containment reference list.
	 * The list contents are of type {@link TestingPackage.DimensionInterval}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension Records</em>' containment reference list.
	 * @see TestingPackage.TestingMMPackage#getNSGAWithCoverageCells_DimensionRecords()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DimensionInterval> getDimensionRecords();

	/**
	 * Returns the value of the '<em><b>Use Mutation Enhancing Coverage</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Mutation Enhancing Coverage</em>' attribute.
	 * @see #setUseMutationEnhancingCoverage(boolean)
	 * @see TestingPackage.TestingMMPackage#getNSGAWithCoverageCells_UseMutationEnhancingCoverage()
	 * @model default="false"
	 * @generated
	 */
	boolean isUseMutationEnhancingCoverage();

	/**
	 * Sets the value of the '{@link TestingPackage.NSGAWithCoverageCells#isUseMutationEnhancingCoverage <em>Use Mutation Enhancing Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Mutation Enhancing Coverage</em>' attribute.
	 * @see #isUseMutationEnhancingCoverage()
	 * @generated
	 */
	void setUseMutationEnhancingCoverage(boolean value);

} // NSGAWithCoverageCells
