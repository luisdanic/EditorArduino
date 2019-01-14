/**
 */
package arduino.impl;

import arduino.ArduinoPackage;
import arduino.Servo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Servo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduino.impl.ServoImpl#getAngulo <em>Angulo</em>}</li>
 *   <li>{@link arduino.impl.ServoImpl#getLibreria <em>Libreria</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServoImpl extends ActuadoresImpl implements Servo {
	/**
	 * The default value of the '{@link #getAngulo() <em>Angulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngulo()
	 * @generated
	 * @ordered
	 */
	protected static final int ANGULO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAngulo() <em>Angulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngulo()
	 * @generated
	 * @ordered
	 */
	protected int angulo = ANGULO_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibreria() <em>Libreria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibreria()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBRERIA_EDEFAULT = "Servo.h";

	/**
	 * The cached value of the '{@link #getLibreria() <em>Libreria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibreria()
	 * @generated
	 * @ordered
	 */
	protected String libreria = LIBRERIA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.SERVO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAngulo() {
		return angulo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngulo(int newAngulo) {
		int oldAngulo = angulo;
		angulo = newAngulo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.SERVO__ANGULO, oldAngulo, angulo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibreria() {
		return libreria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArduinoPackage.SERVO__ANGULO:
			return getAngulo();
		case ArduinoPackage.SERVO__LIBRERIA:
			return getLibreria();
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
		case ArduinoPackage.SERVO__ANGULO:
			setAngulo((Integer) newValue);
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
		case ArduinoPackage.SERVO__ANGULO:
			setAngulo(ANGULO_EDEFAULT);
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
		case ArduinoPackage.SERVO__ANGULO:
			return angulo != ANGULO_EDEFAULT;
		case ArduinoPackage.SERVO__LIBRERIA:
			return LIBRERIA_EDEFAULT == null ? libreria != null : !LIBRERIA_EDEFAULT.equals(libreria);
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
		result.append(" (angulo: ");
		result.append(angulo);
		result.append(", libreria: ");
		result.append(libreria);
		result.append(')');
		return result.toString();
	}

} //ServoImpl
