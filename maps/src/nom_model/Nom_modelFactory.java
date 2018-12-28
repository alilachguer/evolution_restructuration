/**
 */
package nom_model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see nom_model.Nom_modelPackage
 * @generated
 */
public interface Nom_modelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Nom_modelFactory eINSTANCE = nom_model.impl.Nom_modelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>map</em>'.
	 * @generated
	 */
	map createmap();

	/**
	 * Returns a new object of class '<em>Road</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Road</em>'.
	 * @generated
	 */
	Road createRoad();

	/**
	 * Returns a new object of class '<em>Public Space</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Public Space</em>'.
	 * @generated
	 */
	PublicSpace createPublicSpace();

	/**
	 * Returns a new object of class '<em>Street</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Street</em>'.
	 * @generated
	 */
	Street createStreet();

	/**
	 * Returns a new object of class '<em>Pedestrian</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pedestrian</em>'.
	 * @generated
	 */
	Pedestrian createPedestrian();

	/**
	 * Returns a new object of class '<em>Square</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Square</em>'.
	 * @generated
	 */
	Square createSquare();

	/**
	 * Returns a new object of class '<em>Garden</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Garden</em>'.
	 * @generated
	 */
	Garden createGarden();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Nom_modelPackage getNom_modelPackage();

} //Nom_modelFactory
