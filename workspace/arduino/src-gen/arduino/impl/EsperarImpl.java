/**
 */
package arduino.impl;

import arduino.Apagar;
import arduino.ArduinoPackage;
import arduino.Esperar;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Esperar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduino.impl.EsperarImpl#getSegundos <em>Segundos</em>}</li>
 *   <li>{@link arduino.impl.EsperarImpl#getApagar <em>Apagar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EsperarImpl extends InstruccionesImpl implements Esperar {
	/**
	 * The default value of the '{@link #getSegundos() <em>Segundos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegundos()
	 * @generated
	 * @ordered
	 */
	protected static final int SEGUNDOS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSegundos() <em>Segundos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegundos()
	 * @generated
	 * @ordered
	 */
	protected int segundos = SEGUNDOS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getApagar() <em>Apagar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApagar()
	 * @generated
	 * @ordered
	 */
	protected Apagar apagar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EsperarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.ESPERAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSegundos() {
		return segundos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSegundos(int newSegundos) {
		int oldSegundos = segundos;
		segundos = newSegundos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.ESPERAR__SEGUNDOS, oldSegundos,
					segundos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Apagar getApagar() {
		if (apagar != null && apagar.eIsProxy()) {
			InternalEObject oldApagar = (InternalEObject) apagar;
			apagar = (Apagar) eResolveProxy(oldApagar);
			if (apagar != oldApagar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.ESPERAR__APAGAR, oldApagar,
							apagar));
			}
		}
		return apagar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Apagar basicGetApagar() {
		return apagar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApagar(Apagar newApagar) {
		Apagar oldApagar = apagar;
		apagar = newApagar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.ESPERAR__APAGAR, oldApagar, apagar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArduinoPackage.ESPERAR__SEGUNDOS:
			return getSegundos();
		case ArduinoPackage.ESPERAR__APAGAR:
			if (resolve)
				return getApagar();
			return basicGetApagar();
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
		case ArduinoPackage.ESPERAR__SEGUNDOS:
			setSegundos((Integer) newValue);
			return;
		case ArduinoPackage.ESPERAR__APAGAR:
			setApagar((Apagar) newValue);
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
		case ArduinoPackage.ESPERAR__SEGUNDOS:
			setSegundos(SEGUNDOS_EDEFAULT);
			return;
		case ArduinoPackage.ESPERAR__APAGAR:
			setApagar((Apagar) null);
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
		case ArduinoPackage.ESPERAR__SEGUNDOS:
			return segundos != SEGUNDOS_EDEFAULT;
		case ArduinoPackage.ESPERAR__APAGAR:
			return apagar != null;
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
		result.append(" (segundos: ");
		result.append(segundos);
		result.append(')');
		return result.toString();
	}

} //EsperarImpl
