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
 * An implementation of the model object '<em><b>Apagar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduino.impl.ApagarImpl#getEsperar1 <em>Esperar1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApagarImpl extends InstruccionesImpl implements Apagar {
	/**
	 * The cached value of the '{@link #getEsperar1() <em>Esperar1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEsperar1()
	 * @generated
	 * @ordered
	 */
	protected Esperar esperar1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApagarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.APAGAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Esperar getEsperar1() {
		if (esperar1 != null && esperar1.eIsProxy()) {
			InternalEObject oldEsperar1 = (InternalEObject) esperar1;
			esperar1 = (Esperar) eResolveProxy(oldEsperar1);
			if (esperar1 != oldEsperar1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.APAGAR__ESPERAR1,
							oldEsperar1, esperar1));
			}
		}
		return esperar1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Esperar basicGetEsperar1() {
		return esperar1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsperar1(Esperar newEsperar1) {
		Esperar oldEsperar1 = esperar1;
		esperar1 = newEsperar1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.APAGAR__ESPERAR1, oldEsperar1,
					esperar1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArduinoPackage.APAGAR__ESPERAR1:
			if (resolve)
				return getEsperar1();
			return basicGetEsperar1();
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
		case ArduinoPackage.APAGAR__ESPERAR1:
			setEsperar1((Esperar) newValue);
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
		case ArduinoPackage.APAGAR__ESPERAR1:
			setEsperar1((Esperar) null);
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
		case ArduinoPackage.APAGAR__ESPERAR1:
			return esperar1 != null;
		}
		return super.eIsSet(featureID);
	}

} //ApagarImpl
