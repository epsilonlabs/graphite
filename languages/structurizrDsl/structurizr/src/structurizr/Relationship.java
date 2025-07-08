/**
 */
package structurizr;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structurizr.Relationship#getSource <em>Source</em>}</li>
 *   <li>{@link structurizr.Relationship#getTarget <em>Target</em>}</li>
 *   <li>{@link structurizr.Relationship#getDescription <em>Description</em>}</li>
 *   <li>{@link structurizr.Relationship#getUrl <em>Url</em>}</li>
 *   <li>{@link structurizr.Relationship#getTechnology <em>Technology</em>}</li>
 *   <li>{@link structurizr.Relationship#getTags <em>Tags</em>}</li>
 *   <li>{@link structurizr.Relationship#getProperties <em>Properties</em>}</li>
 *   <li>{@link structurizr.Relationship#getPerspectives <em>Perspectives</em>}</li>
 * </ul>
 *
 * @see structurizr.StructurizrPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(IdentifiableElement)
	 * @see structurizr.StructurizrPackage#getRelationship_Source()
	 * @model
	 * @generated
	 */
	IdentifiableElement getSource();

	/**
	 * Sets the value of the '{@link structurizr.Relationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(IdentifiableElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(IdentifiableElement)
	 * @see structurizr.StructurizrPackage#getRelationship_Target()
	 * @model
	 * @generated
	 */
	IdentifiableElement getTarget();

	/**
	 * Sets the value of the '{@link structurizr.Relationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(IdentifiableElement value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see structurizr.StructurizrPackage#getRelationship_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link structurizr.Relationship#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see structurizr.StructurizrPackage#getRelationship_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link structurizr.Relationship#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Technology</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology</em>' containment reference.
	 * @see #setTechnology(Technology)
	 * @see structurizr.StructurizrPackage#getRelationship_Technology()
	 * @model containment="true"
	 * @generated
	 */
	Technology getTechnology();

	/**
	 * Sets the value of the '{@link structurizr.Relationship#getTechnology <em>Technology</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology</em>' containment reference.
	 * @see #getTechnology()
	 * @generated
	 */
	void setTechnology(Technology value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link structurizr.Tag}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see structurizr.StructurizrPackage#getRelationship_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link structurizr.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see structurizr.StructurizrPackage#getRelationship_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Property> getProperties();

	/**
	 * Returns the value of the '<em><b>Perspectives</b></em>' containment reference list.
	 * The list contents are of type {@link structurizr.Perspective}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perspectives</em>' containment reference list.
	 * @see structurizr.StructurizrPackage#getRelationship_Perspectives()
	 * @model containment="true"
	 * @generated
	 */
	EList<Perspective> getPerspectives();

} // Relationship
