/**
 */
package structurizr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structurizr.ComponentView#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see structurizr.StructurizrPackage#getComponentView()
 * @model annotation="syntax feature='includeExpression' derive='include' grammar='structurizr.expressions.StructurizrExpressions' entryRule='ComponentView_Include'"
 *        annotation="syntax feature='excludeExpression' derive='exclude' grammar='structurizr.expressions.StructurizrExpressions' entryRule='ComponentView_Exclude'"
 * @generated
 */
public interface ComponentView extends ViewElement {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(Container)
	 * @see structurizr.StructurizrPackage#getComponentView_Container()
	 * @model
	 * @generated
	 */
	Container getContainer();

	/**
	 * Sets the value of the '{@link structurizr.ComponentView#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container value);

} // ComponentView
