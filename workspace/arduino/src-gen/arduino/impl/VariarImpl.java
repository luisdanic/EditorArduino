/**
 */
package arduino.impl;

import arduino.ArduinoPackage;
import arduino.Sensores;
import arduino.Variar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduino.impl.VariarImpl#getPwm <em>Pwm</em>}</li>
 *   <li>{@link arduino.impl.VariarImpl#getDatos <em>Datos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariarImpl extends InstruccionesImpl implements Variar {
	/**
	 * The default value of the '{@link #getPwm() <em>Pwm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPwm()
	 * @generated
	 * @ordered
	 */
	protected static final int PWM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPwm() <em>Pwm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPwm()
	 * @generated
	 * @ordered
	 */
	protected int pwm = PWM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDatos() <em>Datos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatos()
	 * @generated
	 * @ordered
	 */
	protected Sensores datos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.VARIAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPwm() {
		return pwm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPwm(int newPwm) {
		int oldPwm = pwm;
		pwm = newPwm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.VARIAR__PWM, oldPwm, pwm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensores getDatos() {
		if (datos != null && datos.eIsProxy()) {
			InternalEObject oldDatos = (InternalEObject) datos;
			datos = (Sensores) eResolveProxy(oldDatos);
			if (datos != oldDatos) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.VARIAR__DATOS, oldDatos,
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
	public Sensores basicGetDatos() {
		return datos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatos(Sensores newDatos) {
		Sensores oldDatos = datos;
		datos = newDatos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.VARIAR__DATOS, oldDatos, datos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArduinoPackage.VARIAR__PWM:
			return getPwm();
		case ArduinoPackage.VARIAR__DATOS:
			if (resolve)
				return getDatos();
			return basicGetDatos();
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
		case ArduinoPackage.VARIAR__PWM:
			setPwm((Integer) newValue);
			return;
		case ArduinoPackage.VARIAR__DATOS:
			setDatos((Sensores) newValue);
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
		case ArduinoPackage.VARIAR__PWM:
			setPwm(PWM_EDEFAULT);
			return;
		case ArduinoPackage.VARIAR__DATOS:
			setDatos((Sensores) null);
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
		case ArduinoPackage.VARIAR__PWM:
			return pwm != PWM_EDEFAULT;
		case ArduinoPackage.VARIAR__DATOS:
			return datos != null;
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
		result.append(" (pwm: ");
		result.append(pwm);
		result.append(')');
		return result.toString();
	}

} //VariarImpl
