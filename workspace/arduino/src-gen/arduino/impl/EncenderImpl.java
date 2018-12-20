/**
 */
package arduino.impl;

import arduino.ArduinoPackage;
import arduino.Encender;

import arduino.Esperar;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encender</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduino.impl.EncenderImpl#getEsperar <em>Esperar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EncenderImpl extends InstruccionesImpl implements Encender {
	/**
	 * The cached value of the '{@link #getEsperar() <em>Esperar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEsperar()
	 * @generated
	 * @ordered
	 */
	protected Esperar esperar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncenderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.ENCENDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Esperar getEsperar() {
		if (esperar != null && esperar.eIsProxy()) {
			InternalEObject oldEsperar = (InternalEObject) esperar;
			esperar = (Esperar) eResolveProxy(oldEsperar);
			if (esperar != oldEsperar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.ENCENDER__ESPERAR,
							oldEsperar, esperar));
			}
		}
		return esperar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Esperar basicGetEsperar() {
		return esperar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsperar(Esperar newEsperar) {
		Esperar oldEsperar = esperar;
		esperar = newEsperar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.ENCENDER__ESPERAR, oldEsperar,
					esperar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArduinoPackage.ENCENDER__ESPERAR:
			if (resolve)
				return getEsperar();
			return basicGetEsperar();
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
		case ArduinoPackage.ENCENDER__ESPERAR:
			setEsperar((Esperar) newValue);
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
		case ArduinoPackage.ENCENDER__ESPERAR:
			setEsperar((Esperar) null);
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
		case ArduinoPackage.ENCENDER__ESPERAR:
			return esperar != null;
		}
		return super.eIsSet(featureID);
	}

} //EncenderImpl
