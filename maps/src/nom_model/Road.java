/**
 */
package nom_model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Road</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link nom_model.Road#getName <em>Name</em>}</li>
 *   <li>{@link nom_model.Road#getLenght <em>Lenght</em>}</li>
 *   <li>{@link nom_model.Road#getBorder <em>Border</em>}</li>
 *   <li>{@link nom_model.Road#getMeet <em>Meet</em>}</li>
 * </ul>
 *
 * @see nom_model.Nom_modelPackage#getRoad()
 * @model
 * @generated
 */
public interface Road extends EObject {
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
	 * @see nom_model.Nom_modelPackage#getRoad_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link nom_model.Road#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lenght</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lenght</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lenght</em>' attribute.
	 * @see #setLenght(int)
	 * @see nom_model.Nom_modelPackage#getRoad_Lenght()
	 * @model
	 * @generated
	 */
	int getLenght();

	/**
	 * Sets the value of the '{@link nom_model.Road#getLenght <em>Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lenght</em>' attribute.
	 * @see #getLenght()
	 * @generated
	 */
	void setLenght(int value);

	/**
	 * Returns the value of the '<em><b>Border</b></em>' reference list.
	 * The list contents are of type {@link nom_model.PublicSpace}.
	 * It is bidirectional and its opposite is '{@link nom_model.PublicSpace#getBorderedBy <em>Bordered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border</em>' reference list.
	 * @see nom_model.Nom_modelPackage#getRoad_Border()
	 * @see nom_model.PublicSpace#getBorderedBy
	 * @model opposite="borderedBy"
	 * @generated
	 */
	EList<PublicSpace> getBorder();

	/**
	 * Returns the value of the '<em><b>Meet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meet</em>' reference.
	 * @see #setMeet(Road)
	 * @see nom_model.Nom_modelPackage#getRoad_Meet()
	 * @model
	 * @generated
	 */
	Road getMeet();

	/**
	 * Sets the value of the '{@link nom_model.Road#getMeet <em>Meet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meet</em>' reference.
	 * @see #getMeet()
	 * @generated
	 */
	void setMeet(Road value);

} // Road
