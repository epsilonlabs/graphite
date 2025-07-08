/**
 */
package structurizr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Views</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structurizr.Views#getName <em>Name</em>}</li>
 *   <li>{@link structurizr.Views#getViewElements <em>View Elements</em>}</li>
 *   <li>{@link structurizr.Views#getStyles <em>Styles</em>}</li>
 * </ul>
 *
 * @see structurizr.StructurizrPackage#getViews()
 * @model
 * @generated
 */
public interface Views extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see structurizr.StructurizrPackage#getViews_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link structurizr.Views#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>View Elements</b></em>' containment reference list.
	 * The list contents are of type {@link structurizr.ViewElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Elements</em>' containment reference list.
	 * @see structurizr.StructurizrPackage#getViews_ViewElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewElement> getViewElements();

	/**
	 * Returns the value of the '<em><b>Styles</b></em>' containment reference list.
	 * The list contents are of type {@link structurizr.Style}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles</em>' containment reference list.
	 * @see structurizr.StructurizrPackage#getViews_Styles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Style> getStyles();

} // Views
