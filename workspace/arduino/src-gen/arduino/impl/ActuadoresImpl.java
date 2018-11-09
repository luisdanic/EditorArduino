/**
 */
package arduino.impl;

import arduino.Actuadores;
import arduino.ArduinoPackage;

import arduino.Instrucciones;
import arduino.Sensores;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuadores</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduino.impl.ActuadoresImpl#getInstrucciones <em>Instrucciones</em>}</li>
 *   <li>{@link arduino.impl.ActuadoresImpl#getPin <em>Pin</em>}</li>
 *   <li>{@link arduino.impl.ActuadoresImpl#getSen <em>Sen</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ActuadoresImpl extends MinimalEObjectImpl.Container implements Actuadores {
	/**
	 * The cached value of the '{@link #getInstrucciones() <em>Instrucciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstrucciones()
	 * @generated
	 * @ordered
	 */
	protected EList<Instrucciones> instrucciones;

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
	 * The cached value of the '{@link #getSen() <em>Sen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSen()
	 * @generated
	 * @ordered
	 */
	protected Sensores sen;

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
	public EList<Instrucciones> getInstrucciones() {
		if (instrucciones == null) {
			instrucciones = new EObjectContainmentEList<Instrucciones>(Instrucciones.class, this,
					ArduinoPackage.ACTUADORES__INSTRUCCIONES);
		}
		return instrucciones;
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
	public Sensores getSen() {
		if (sen != null && sen.eIsProxy()) {
			InternalEObject oldSen = (InternalEObject) sen;
			sen = (Sensores) eResolveProxy(oldSen);
			if (sen != oldSen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.ACTUADORES__SEN, oldSen,
							sen));
			}
		}
		return sen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensores basicGetSen() {
		return sen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSen(Sensores newSen, NotificationChain msgs) {
		Sensores oldSen = sen;
		sen = newSen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ArduinoPackage.ACTUADORES__SEN, oldSen, newSen);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSen(Sensores newSen) {
		if (newSen != sen) {
			NotificationChain msgs = null;
			if (sen != null)
				msgs = ((InternalEObject) sen).eInverseRemove(this, ArduinoPackage.SENSORES__ACT, Sensores.class, msgs);
			if (newSen != null)
				msgs = ((InternalEObject) newSen).eInverseAdd(this, ArduinoPackage.SENSORES__ACT, Sensores.class, msgs);
			msgs = basicSetSen(newSen, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.ACTUADORES__SEN, newSen, newSen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArduinoPackage.ACTUADORES__SEN:
			if (sen != null)
				msgs = ((InternalEObject) sen).eInverseRemove(this, ArduinoPackage.SENSORES__ACT, Sensores.class, msgs);
			return basicSetSen((Sensores) otherEnd, msgs);
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
		case ArduinoPackage.ACTUADORES__INSTRUCCIONES:
			return ((InternalEList<?>) getInstrucciones()).basicRemove(otherEnd, msgs);
		case ArduinoPackage.ACTUADORES__SEN:
			return basicSetSen(null, msgs);
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
		case ArduinoPackage.ACTUADORES__INSTRUCCIONES:
			return getInstrucciones();
		case ArduinoPackage.ACTUADORES__PIN:
			return getPin();
		case ArduinoPackage.ACTUADORES__SEN:
			if (resolve)
				return getSen();
			return basicGetSen();
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
		case ArduinoPackage.ACTUADORES__INSTRUCCIONES:
			getInstrucciones().clear();
			getInstrucciones().addAll((Collection<? extends Instrucciones>) newValue);
			return;
		case ArduinoPackage.ACTUADORES__PIN:
			setPin((Integer) newValue);
			return;
		case ArduinoPackage.ACTUADORES__SEN:
			setSen((Sensores) newValue);
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
		case ArduinoPackage.ACTUADORES__INSTRUCCIONES:
			getInstrucciones().clear();
			return;
		case ArduinoPackage.ACTUADORES__PIN:
			setPin(PIN_EDEFAULT);
			return;
		case ArduinoPackage.ACTUADORES__SEN:
			setSen((Sensores) null);
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
		case ArduinoPackage.ACTUADORES__INSTRUCCIONES:
			return instrucciones != null && !instrucciones.isEmpty();
		case ArduinoPackage.ACTUADORES__PIN:
			return pin != PIN_EDEFAULT;
		case ArduinoPackage.ACTUADORES__SEN:
			return sen != null;
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
