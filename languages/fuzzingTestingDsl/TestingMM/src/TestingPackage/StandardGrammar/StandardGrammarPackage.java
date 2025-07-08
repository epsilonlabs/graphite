/**
 */
package TestingPackage.StandardGrammar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see TestingPackage.StandardGrammar.StandardGrammarFactory
 * @model kind="package"
 * @generated
 */
public interface StandardGrammarPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "StandardGrammar";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "StandardGrammar";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StandardGrammarPackage eINSTANCE = TestingPackage.StandardGrammar.impl.StandardGrammarPackageImpl.init();

	/**
	 * The meta object id for the '{@link TestingPackage.StandardGrammar.impl.ConditionElementImpl <em>Condition Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.StandardGrammar.impl.ConditionElementImpl
	 * @see TestingPackage.StandardGrammar.impl.StandardGrammarPackageImpl#getConditionElement()
	 * @generated
	 */
	int CONDITION_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Condition Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.StandardGrammar.impl.CompositeConditionImpl <em>Composite Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.StandardGrammar.impl.CompositeConditionImpl
	 * @see TestingPackage.StandardGrammar.impl.StandardGrammarPackageImpl#getCompositeCondition()
	 * @generated
	 */
	int COMPOSITE_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__LEFT = CONDITION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__BINOP = CONDITION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__RIGHT = CONDITION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Composite Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION_FEATURE_COUNT = CONDITION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Composite Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION_OPERATION_COUNT = CONDITION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.StandardGrammar.impl.BasicConditionImpl <em>Basic Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.StandardGrammar.impl.BasicConditionImpl
	 * @see TestingPackage.StandardGrammar.impl.StandardGrammarPackageImpl#getBasicCondition()
	 * @generated
	 */
	int BASIC_CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CONDITION__LEFT = CONDITION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bincomp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CONDITION__BINCOMP = CONDITION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CONDITION__RIGHT = CONDITION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Basic Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CONDITION_FEATURE_COUNT = CONDITION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Basic Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_CONDITION_OPERATION_COUNT = CONDITION_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.StandardGrammar.impl.ConditionExprImpl <em>Condition Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.StandardGrammar.impl.ConditionExprImpl
	 * @see TestingPackage.StandardGrammar.impl.StandardGrammarPackageImpl#getConditionExpr()
	 * @generated
	 */
	int CONDITION_EXPR = 3;

	/**
	 * The number of structural features of the '<em>Condition Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_EXPR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_EXPR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.StandardGrammar.impl.ConditionIntegerImpl <em>Condition Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.StandardGrammar.impl.ConditionIntegerImpl
	 * @see TestingPackage.StandardGrammar.impl.StandardGrammarPackageImpl#getConditionInteger()
	 * @generated
	 */
	int CONDITION_INTEGER = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_INTEGER__VALUE = CONDITION_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Condition Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_INTEGER_FEATURE_COUNT = CONDITION_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Condition Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_INTEGER_OPERATION_COUNT = CONDITION_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.StandardGrammar.impl.ConditionVariableImpl <em>Condition Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.StandardGrammar.impl.ConditionVariableImpl
	 * @see TestingPackage.StandardGrammar.impl.StandardGrammarPackageImpl#getConditionVariable()
	 * @generated
	 */
	int CONDITION_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_VARIABLE__METRIC = CONDITION_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Condition Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_VARIABLE_FEATURE_COUNT = CONDITION_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Condition Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_VARIABLE_OPERATION_COUNT = CONDITION_EXPR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TestingPackage.StandardGrammar.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.StandardGrammar.impl.ConditionImpl
	 * @see TestingPackage.StandardGrammar.impl.StandardGrammarPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>C</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__C = 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TestingPackage.StandardGrammar.BinaryComparisonOperation <em>Binary Comparison Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.StandardGrammar.BinaryComparisonOperation
	 * @see TestingPackage.StandardGrammar.impl.StandardGrammarPackageImpl#getBinaryComparisonOperation()
	 * @generated
	 */
	int BINARY_COMPARISON_OPERATION = 7;

	/**
	 * The meta object id for the '{@link TestingPackage.StandardGrammar.BinaryLogicalOperation <em>Binary Logical Operation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TestingPackage.StandardGrammar.BinaryLogicalOperation
	 * @see TestingPackage.StandardGrammar.impl.StandardGrammarPackageImpl#getBinaryLogicalOperation()
	 * @generated
	 */
	int BINARY_LOGICAL_OPERATION = 8;


	/**
	 * Returns the meta object for class '{@link TestingPackage.StandardGrammar.ConditionElement <em>Condition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Element</em>'.
	 * @see TestingPackage.StandardGrammar.ConditionElement
	 * @generated
	 */
	EClass getConditionElement();

	/**
	 * Returns the meta object for class '{@link TestingPackage.StandardGrammar.CompositeCondition <em>Composite Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Condition</em>'.
	 * @see TestingPackage.StandardGrammar.CompositeCondition
	 * @generated
	 */
	EClass getCompositeCondition();

	/**
	 * Returns the meta object for the containment reference '{@link TestingPackage.StandardGrammar.CompositeCondition#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see TestingPackage.StandardGrammar.CompositeCondition#getLeft()
	 * @see #getCompositeCondition()
	 * @generated
	 */
	EReference getCompositeCondition_Left();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.StandardGrammar.CompositeCondition#getBinop <em>Binop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Binop</em>'.
	 * @see TestingPackage.StandardGrammar.CompositeCondition#getBinop()
	 * @see #getCompositeCondition()
	 * @generated
	 */
	EAttribute getCompositeCondition_Binop();

	/**
	 * Returns the meta object for the containment reference '{@link TestingPackage.StandardGrammar.CompositeCondition#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see TestingPackage.StandardGrammar.CompositeCondition#getRight()
	 * @see #getCompositeCondition()
	 * @generated
	 */
	EReference getCompositeCondition_Right();

	/**
	 * Returns the meta object for class '{@link TestingPackage.StandardGrammar.BasicCondition <em>Basic Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Condition</em>'.
	 * @see TestingPackage.StandardGrammar.BasicCondition
	 * @generated
	 */
	EClass getBasicCondition();

	/**
	 * Returns the meta object for the containment reference '{@link TestingPackage.StandardGrammar.BasicCondition#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see TestingPackage.StandardGrammar.BasicCondition#getLeft()
	 * @see #getBasicCondition()
	 * @generated
	 */
	EReference getBasicCondition_Left();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.StandardGrammar.BasicCondition#getBincomp <em>Bincomp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bincomp</em>'.
	 * @see TestingPackage.StandardGrammar.BasicCondition#getBincomp()
	 * @see #getBasicCondition()
	 * @generated
	 */
	EAttribute getBasicCondition_Bincomp();

	/**
	 * Returns the meta object for the containment reference '{@link TestingPackage.StandardGrammar.BasicCondition#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see TestingPackage.StandardGrammar.BasicCondition#getRight()
	 * @see #getBasicCondition()
	 * @generated
	 */
	EReference getBasicCondition_Right();

	/**
	 * Returns the meta object for class '{@link TestingPackage.StandardGrammar.ConditionExpr <em>Condition Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Expr</em>'.
	 * @see TestingPackage.StandardGrammar.ConditionExpr
	 * @generated
	 */
	EClass getConditionExpr();

	/**
	 * Returns the meta object for class '{@link TestingPackage.StandardGrammar.ConditionInteger <em>Condition Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Integer</em>'.
	 * @see TestingPackage.StandardGrammar.ConditionInteger
	 * @generated
	 */
	EClass getConditionInteger();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.StandardGrammar.ConditionInteger#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see TestingPackage.StandardGrammar.ConditionInteger#getValue()
	 * @see #getConditionInteger()
	 * @generated
	 */
	EAttribute getConditionInteger_Value();

	/**
	 * Returns the meta object for class '{@link TestingPackage.StandardGrammar.ConditionVariable <em>Condition Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Variable</em>'.
	 * @see TestingPackage.StandardGrammar.ConditionVariable
	 * @generated
	 */
	EClass getConditionVariable();

	/**
	 * Returns the meta object for the reference '{@link TestingPackage.StandardGrammar.ConditionVariable#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric</em>'.
	 * @see TestingPackage.StandardGrammar.ConditionVariable#getMetric()
	 * @see #getConditionVariable()
	 * @generated
	 */
	EReference getConditionVariable_Metric();

	/**
	 * Returns the meta object for class '{@link TestingPackage.StandardGrammar.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see TestingPackage.StandardGrammar.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link TestingPackage.StandardGrammar.Condition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see TestingPackage.StandardGrammar.Condition#getName()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Name();

	/**
	 * Returns the meta object for the containment reference '{@link TestingPackage.StandardGrammar.Condition#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>C</em>'.
	 * @see TestingPackage.StandardGrammar.Condition#getC()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_C();

	/**
	 * Returns the meta object for enum '{@link TestingPackage.StandardGrammar.BinaryComparisonOperation <em>Binary Comparison Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Comparison Operation</em>'.
	 * @see TestingPackage.StandardGrammar.BinaryComparisonOperation
	 * @generated
	 */
	EEnum getBinaryComparisonOperation();

	/**
	 * Returns the meta object for enum '{@link TestingPackage.StandardGrammar.BinaryLogicalOperation <em>Binary Logical Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Logical Operation</em>'.
	 * @see TestingPackage.StandardGrammar.BinaryLogicalOperation
	 * @generated
	 */
	EEnum getBinaryLogicalOperation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StandardGrammarFactory getStandardGrammarFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link TestingPackage.StandardGrammar.impl.ConditionElementImpl <em>Condition Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.StandardGrammar.impl.ConditionElementImpl
		 * @see TestingPackage.StandardGrammar.impl.StandardGrammarPackageImpl#getConditionElement()
		 * @generated
		 */
		EClass CONDITION_ELEMENT = eINSTANCE.getConditionElement();

		/**
		 * The meta object literal for the '{@link TestingPackage.StandardGrammar.impl.CompositeConditionImpl <em>Composite Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.StandardGrammar.impl.CompositeConditionImpl
		 * @see TestingPackage.StandardGrammar.impl.StandardGrammarPackageImpl#getCompositeCondition()
		 * @generated
		 */
		EClass COMPOSITE_CONDITION = eINSTANCE.getCompositeCondition();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_CONDITION__LEFT = eINSTANCE.getCompositeCondition_Left();

		/**
		 * The meta object literal for the '<em><b>Binop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_CONDITION__BINOP = eINSTANCE.getCompositeCondition_Binop();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_CONDITION__RIGHT = eINSTANCE.getCompositeCondition_Right();

		/**
		 * The meta object literal for the '{@link TestingPackage.StandardGrammar.impl.BasicConditionImpl <em>Basic Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.StandardGrammar.impl.BasicConditionImpl
		 * @see TestingPackage.StandardGrammar.impl.StandardGrammarPackageImpl#getBasicCondition()
		 * @generated
		 */
		EClass BASIC_CONDITION = eINSTANCE.getBasicCondition();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_CONDITION__LEFT = eINSTANCE.getBasicCondition_Left();

		/**
		 * The meta object literal for the '<em><b>Bincomp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_CONDITION__BINCOMP = eINSTANCE.getBasicCondition_Bincomp();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_CONDITION__RIGHT = eINSTANCE.getBasicCondition_Right();

		/**
		 * The meta object literal for the '{@link TestingPackage.StandardGrammar.impl.ConditionExprImpl <em>Condition Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.StandardGrammar.impl.ConditionExprImpl
		 * @see TestingPackage.StandardGrammar.impl.StandardGrammarPackageImpl#getConditionExpr()
		 * @generated
		 */
		EClass CONDITION_EXPR = eINSTANCE.getConditionExpr();

		/**
		 * The meta object literal for the '{@link TestingPackage.StandardGrammar.impl.ConditionIntegerImpl <em>Condition Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.StandardGrammar.impl.ConditionIntegerImpl
		 * @see TestingPackage.StandardGrammar.impl.StandardGrammarPackageImpl#getConditionInteger()
		 * @generated
		 */
		EClass CONDITION_INTEGER = eINSTANCE.getConditionInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_INTEGER__VALUE = eINSTANCE.getConditionInteger_Value();

		/**
		 * The meta object literal for the '{@link TestingPackage.StandardGrammar.impl.ConditionVariableImpl <em>Condition Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.StandardGrammar.impl.ConditionVariableImpl
		 * @see TestingPackage.StandardGrammar.impl.StandardGrammarPackageImpl#getConditionVariable()
		 * @generated
		 */
		EClass CONDITION_VARIABLE = eINSTANCE.getConditionVariable();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_VARIABLE__METRIC = eINSTANCE.getConditionVariable_Metric();

		/**
		 * The meta object literal for the '{@link TestingPackage.StandardGrammar.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.StandardGrammar.impl.ConditionImpl
		 * @see TestingPackage.StandardGrammar.impl.StandardGrammarPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__NAME = eINSTANCE.getCondition_Name();

		/**
		 * The meta object literal for the '<em><b>C</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__C = eINSTANCE.getCondition_C();

		/**
		 * The meta object literal for the '{@link TestingPackage.StandardGrammar.BinaryComparisonOperation <em>Binary Comparison Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.StandardGrammar.BinaryComparisonOperation
		 * @see TestingPackage.StandardGrammar.impl.StandardGrammarPackageImpl#getBinaryComparisonOperation()
		 * @generated
		 */
		EEnum BINARY_COMPARISON_OPERATION = eINSTANCE.getBinaryComparisonOperation();

		/**
		 * The meta object literal for the '{@link TestingPackage.StandardGrammar.BinaryLogicalOperation <em>Binary Logical Operation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TestingPackage.StandardGrammar.BinaryLogicalOperation
		 * @see TestingPackage.StandardGrammar.impl.StandardGrammarPackageImpl#getBinaryLogicalOperation()
		 * @generated
		 */
		EEnum BINARY_LOGICAL_OPERATION = eINSTANCE.getBinaryLogicalOperation();

	}

} //StandardGrammarPackage
