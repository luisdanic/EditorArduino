/**
 */
package arduino.impl;

import arduino.Actuadores;
import arduino.ArduinoPackage;
import arduino.Instrucciones;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuadores</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduino.impl.ActuadoresImpl#getPin <em>Pin</em>}</li>
 *   <li>{@link arduino.impl.ActuadoresImpl#getActuadorinstruccion <em>Actuadorinstruccion</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActuadoresImpl extends MinimalEObjectImpl.Container implements Actuadores {
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
	 * The cached value of the '{@link #getActuadorinstruccion() <em>Actuadorinstruccion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuadorinstruccion()
	 * @generated
	 * @ordered
	 */
	protected Instrucciones actuadorinstruccion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuadoresImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.ACTUADORES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.ACTUADORES__PIN, oldPin, pin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instrucciones getActuadorinstruccion() {
		if (actuadorinstruccion != null && actuadorinstruccion.eIsProxy()) {
			InternalEObject oldActuadorinstruccion = (InternalEObject) actuadorinstruccion;
			actuadorinstruccion = (Instrucciones) eResolveProxy(oldActuadorinstruccion);
			if (actuadorinstruccion != oldActuadorinstruccion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ArduinoPackage.ACTUADORES__ACTUADORINSTRUCCION, oldActuadorinstruccion,
							actuadorinstruccion));
			}
		}
		return actuadorinstruccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instrucciones basicGetActuadorinstruccion() {
		return actuadorinstruccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuadorinstruccion(Instrucciones newActuadorinstruccion) {
		Instrucciones oldActuadorinstruccion = actuadorinstruccion;
		actuadorinstruccion = newActuadorinstruccion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.ACTUADORES__ACTUADORINSTRUCCION,
					oldActuadorinstruccion, actuadorinstruccion));
	}

	public EObject getElemento() {

		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArduinoPackage.ACTUADORES__PIN:
			return getPin();
		case ArduinoPackage.ACTUADORES__ACTUADORINSTRUCCION:
			if (resolve)
				return getActuadorinstruccion();
			return basicGetActuadorinstruccion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ArduinoPackage.ACTUADORES__PIN:
			setPin((Integer) newValue);
			return;
		case ArduinoPackage.ACTUADORES__ACTUADORINSTRUCCION:
			setActuadorinstruccion((Instrucciones) newValue);
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
		case ArduinoPackage.ACTUADORES__PIN:
			setPin(PIN_EDEFAULT);
			return;
		case ArduinoPackage.ACTUADORES__ACTUADORINSTRUCCION:
			setActuadorinstruccion((Instrucciones) null);
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
		case ArduinoPackage.ACTUADORES__PIN:
			return pin != PIN_EDEFAULT;
		case ArduinoPackage.ACTUADORES__ACTUADORINSTRUCCION:
			return actuadorinstruccion != null;
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
		result.append(" (pin: ");
		result.append(pin);
		result.append(')');
		return result.toString();
	}

} //ActuadoresImpl
