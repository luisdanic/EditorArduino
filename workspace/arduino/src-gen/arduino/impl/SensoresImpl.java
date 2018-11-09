/**
 */
package arduino.impl;

import arduino.Actuadores;
import arduino.ArduinoPackage;
import arduino.Sensores;

import arduino.Variar;
import java.util.Collection;
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
 * An implementation of the model object '<em><b>Sensores</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduino.impl.SensoresImpl#getMed <em>Med</em>}</li>
 *   <li>{@link arduino.impl.SensoresImpl#getDatos <em>Datos</em>}</li>
 *   <li>{@link arduino.impl.SensoresImpl#getPin <em>Pin</em>}</li>
 *   <li>{@link arduino.impl.SensoresImpl#getAct <em>Act</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SensoresImpl extends MinimalEObjectImpl.Container implements Sensores {
	/**
	 * The default value of the '{@link #getMed() <em>Med</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMed()
	 * @generated
	 * @ordered
	 */
	protected static final int MED_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getMed() <em>Med</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMed()
	 * @generated
	 * @ordered
	 */
	protected int med = MED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDatos() <em>Datos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatos()
	 * @generated
	 * @ordered
	 */
	protected Variar datos;
	/**
	 * The default value of the '{@link #getPin() <em>Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin()
	 * @generated
	 * @ordered
	 */
	protected static final int PIN_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getPin() <em>Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPin()
	 * @generated
	 * @ordered
	 */
	protected int pin = PIN_EDEFAULT;
	/**
	 * The cached value of the '{@link #getAct() <em>Act</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAct()
	 * @generated
	 * @ordered
	 */
	protected EList<Actuadores> act;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensoresImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.SENSORES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMed() {
		return med;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMed(int newMed) {
		int oldMed = med;
		med = newMed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.SENSORES__MED, oldMed, med));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variar getDatos() {
		if (datos != null && datos.eIsProxy()) {
			InternalEObject oldDatos = (InternalEObject) datos;
			datos = (Variar) eResolveProxy(oldDatos);
			if (datos != oldDatos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.SENSORES__DATOS, oldDatos,
							datos));
			}
		}
		return datos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variar basicGetDatos() {
		return datos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatos(Variar newDatos) {
		Variar oldDatos = datos;
		datos = newDatos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.SENSORES__DATOS, oldDatos, datos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPin() {
		return pin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPin(int newPin) {
		int oldPin = pin;
		pin = newPin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.SENSORES__PIN, oldPin, pin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actuadores> getAct() {
		if (act == null) {
			act = new EObjectWithInverseResolvingEList<Actuadores>(Actuadores.class, this, ArduinoPackage.SENSORES__ACT,
					ArduinoPackage.ACTUADORES__SEN);
		}
		return act;
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
		case ArduinoPackage.SENSORES__ACT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAct()).basicAdd(otherEnd, msgs);
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
		case ArduinoPackage.SENSORES__ACT:
			return ((InternalEList<?>) getAct()).basicRemove(otherEnd, msgs);
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
		case ArduinoPackage.SENSORES__MED:
			return getMed();
		case ArduinoPackage.SENSORES__DATOS:
			if (resolve)
				return getDatos();
			return basicGetDatos();
		case ArduinoPackage.SENSORES__PIN:
			return getPin();
		case ArduinoPackage.SENSORES__ACT:
			return getAct();
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
		case ArduinoPackage.SENSORES__MED:
			setMed((Integer) newValue);
			return;
		case ArduinoPackage.SENSORES__DATOS:
			setDatos((Variar) newValue);
			return;
		case ArduinoPackage.SENSORES__PIN:
			setPin((Integer) newValue);
			return;
		case ArduinoPackage.SENSORES__ACT:
			getAct().clear();
			getAct().addAll((Collection<? extends Actuadores>) newValue);
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
		case ArduinoPackage.SENSORES__MED:
			setMed(MED_EDEFAULT);
			return;
		case ArduinoPackage.SENSORES__DATOS:
			setDatos((Variar) null);
			return;
		case ArduinoPackage.SENSORES__PIN:
			setPin(PIN_EDEFAULT);
			return;
		case ArduinoPackage.SENSORES__ACT:
			getAct().clear();
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
		case ArduinoPackage.SENSORES__MED:
			return med != MED_EDEFAULT;
		case ArduinoPackage.SENSORES__DATOS:
			return datos != null;
		case ArduinoPackage.SENSORES__PIN:
			return pin != PIN_EDEFAULT;
		case ArduinoPackage.SENSORES__ACT:
			return act != null && !act.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (med: ");
		result.append(med);
		result.append(", pin: ");
		result.append(pin);
		result.append(')');
		return result.toString();
	}

} //SensoresImpl
