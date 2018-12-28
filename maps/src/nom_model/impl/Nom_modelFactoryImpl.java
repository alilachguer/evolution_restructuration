/**
 */
package nom_model.impl;

import nom_model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Nom_modelFactoryImpl extends EFactoryImpl implements Nom_modelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Nom_modelFactory init() {
		try {
			Nom_modelFactory theNom_modelFactory = (Nom_modelFactory)EPackage.Registry.INSTANCE.getEFactory(Nom_modelPackage.eNS_URI);
			if (theNom_modelFactory != null) {
				return theNom_modelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Nom_modelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nom_modelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Nom_modelPackage.MAP: return createmap();
			case Nom_modelPackage.ROAD: return createRoad();
			case Nom_modelPackage.PUBLIC_SPACE: return createPublicSpace();
			case Nom_modelPackage.STREET: return createStreet();
			case Nom_modelPackage.PEDESTRIAN: return createPedestrian();
			case Nom_modelPackage.SQUARE: return createSquare();
			case Nom_modelPackage.GARDEN: return createGarden();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public map createmap() {
		mapImpl map = new mapImpl();
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Road createRoad() {
		RoadImpl road = new RoadImpl();
		return road;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicSpace createPublicSpace() {
		PublicSpaceImpl publicSpace = new PublicSpaceImpl();
		return publicSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Street createStreet() {
		StreetImpl street = new StreetImpl();
		return street;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pedestrian createPedestrian() {
		PedestrianImpl pedestrian = new PedestrianImpl();
		return pedestrian;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Square createSquare() {
		SquareImpl square = new SquareImpl();
		return square;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Garden createGarden() {
		GardenImpl garden = new GardenImpl();
		return garden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nom_modelPackage getNom_modelPackage() {
		return (Nom_modelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Nom_modelPackage getPackage() {
		return Nom_modelPackage.eINSTANCE;
	}

} //Nom_modelFactoryImpl
