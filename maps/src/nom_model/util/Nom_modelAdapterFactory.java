/**
 */
package nom_model.util;

import nom_model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see nom_model.Nom_modelPackage
 * @generated
 */
public class Nom_modelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Nom_modelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nom_modelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Nom_modelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Nom_modelSwitch<Adapter> modelSwitch =
		new Nom_modelSwitch<Adapter>() {
			@Override
			public Adapter casemap(map object) {
				return createmapAdapter();
			}
			@Override
			public Adapter caseRoad(Road object) {
				return createRoadAdapter();
			}
			@Override
			public Adapter casePublicSpace(PublicSpace object) {
				return createPublicSpaceAdapter();
			}
			@Override
			public Adapter caseStreet(Street object) {
				return createStreetAdapter();
			}
			@Override
			public Adapter casePedestrian(Pedestrian object) {
				return createPedestrianAdapter();
			}
			@Override
			public Adapter caseSquare(Square object) {
				return createSquareAdapter();
			}
			@Override
			public Adapter caseGarden(Garden object) {
				return createGardenAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link nom_model.map <em>map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nom_model.map
	 * @generated
	 */
	public Adapter createmapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nom_model.Road <em>Road</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nom_model.Road
	 * @generated
	 */
	public Adapter createRoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nom_model.PublicSpace <em>Public Space</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nom_model.PublicSpace
	 * @generated
	 */
	public Adapter createPublicSpaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nom_model.Street <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nom_model.Street
	 * @generated
	 */
	public Adapter createStreetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nom_model.Pedestrian <em>Pedestrian</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nom_model.Pedestrian
	 * @generated
	 */
	public Adapter createPedestrianAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nom_model.Square <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nom_model.Square
	 * @generated
	 */
	public Adapter createSquareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link nom_model.Garden <em>Garden</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see nom_model.Garden
	 * @generated
	 */
	public Adapter createGardenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Nom_modelAdapterFactory
