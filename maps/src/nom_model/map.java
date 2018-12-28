/**
 */
package nom_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nom_model.map#getName <em>Name</em>}</li>
 *   <li>{@link nom_model.map#getSpaces <em>Spaces</em>}</li>
 *   <li>{@link nom_model.map#getRoads <em>Roads</em>}</li>
 * </ul>
 *
 * @see nom_model.Nom_modelPackage#getmap()
 * @model
 * @generated
 */
public interface map extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see nom_model.Nom_modelPackage#getmap_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nom_model.map#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Spaces</b></em>' containment reference list.
	 * The list contents are of type {@link nom_model.PublicSpace}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spaces</em>' containment reference list.
	 * @see nom_model.Nom_modelPackage#getmap_Spaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<PublicSpace> getSpaces();

	/**
	 * Returns the value of the '<em><b>Roads</b></em>' containment reference list.
	 * The list contents are of type {@link nom_model.Road}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roads</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roads</em>' containment reference list.
	 * @see nom_model.Nom_modelPackage#getmap_Roads()
	 * @model containment="true"
	 * @generated
	 */
	EList<Road> getRoads();

} // map
