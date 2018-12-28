/**
 */
package nom_model.impl;

import java.util.Collection;

import nom_model.Nom_modelPackage;
import nom_model.PublicSpace;
import nom_model.Road;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Road</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nom_model.impl.RoadImpl#getName <em>Name</em>}</li>
 *   <li>{@link nom_model.impl.RoadImpl#getLenght <em>Lenght</em>}</li>
 *   <li>{@link nom_model.impl.RoadImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link nom_model.impl.RoadImpl#getMeet <em>Meet</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoadImpl extends MinimalEObjectImpl.Container implements Road {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLenght() <em>Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLenght()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLenght() <em>Lenght</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLenght()
	 * @generated
	 * @ordered
	 */
	protected int lenght = LENGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBorder() <em>Border</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorder()
	 * @generated
	 * @ordered
	 */
	protected EList<PublicSpace> border;

	/**
	 * The cached value of the '{@link #getMeet() <em>Meet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeet()
	 * @generated
	 * @ordered
	 */
	protected Road meet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Nom_modelPackage.Literals.ROAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Nom_modelPackage.ROAD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLenght() {
		return lenght;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLenght(int newLenght) {
		int oldLenght = lenght;
		lenght = newLenght;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Nom_modelPackage.ROAD__LENGHT, oldLenght, lenght));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PublicSpace> getBorder() {
		if (border == null) {
			border = new EObjectWithInverseResolvingEList.ManyInverse<PublicSpace>(PublicSpace.class, this, Nom_modelPackage.ROAD__BORDER, Nom_modelPackage.PUBLIC_SPACE__BORDERED_BY);
		}
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Road getMeet() {
		if (meet != null && meet.eIsProxy()) {
			InternalEObject oldMeet = (InternalEObject)meet;
			meet = (Road)eResolveProxy(oldMeet);
			if (meet != oldMeet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Nom_modelPackage.ROAD__MEET, oldMeet, meet));
			}
		}
		return meet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Road basicGetMeet() {
		return meet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeet(Road newMeet) {
		Road oldMeet = meet;
		meet = newMeet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Nom_modelPackage.ROAD__MEET, oldMeet, meet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Nom_modelPackage.ROAD__BORDER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBorder()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Nom_modelPackage.ROAD__BORDER:
				return ((InternalEList<?>)getBorder()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Nom_modelPackage.ROAD__NAME:
				return getName();
			case Nom_modelPackage.ROAD__LENGHT:
				return getLenght();
			case Nom_modelPackage.ROAD__BORDER:
				return getBorder();
			case Nom_modelPackage.ROAD__MEET:
				if (resolve) return getMeet();
				return basicGetMeet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Nom_modelPackage.ROAD__NAME:
				setName((String)newValue);
				return;
			case Nom_modelPackage.ROAD__LENGHT:
				setLenght((Integer)newValue);
				return;
			case Nom_modelPackage.ROAD__BORDER:
				getBorder().clear();
				getBorder().addAll((Collection<? extends PublicSpace>)newValue);
				return;
			case Nom_modelPackage.ROAD__MEET:
				setMeet((Road)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Nom_modelPackage.ROAD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Nom_modelPackage.ROAD__LENGHT:
				setLenght(LENGHT_EDEFAULT);
				return;
			case Nom_modelPackage.ROAD__BORDER:
				getBorder().clear();
				return;
			case Nom_modelPackage.ROAD__MEET:
				setMeet((Road)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Nom_modelPackage.ROAD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Nom_modelPackage.ROAD__LENGHT:
				return lenght != LENGHT_EDEFAULT;
			case Nom_modelPackage.ROAD__BORDER:
				return border != null && !border.isEmpty();
			case Nom_modelPackage.ROAD__MEET:
				return meet != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", lenght: ");
		result.append(lenght);
		result.append(')');
		return result.toString();
	}

} //RoadImpl
