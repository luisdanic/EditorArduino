/**
 */
package arduino.impl;

import arduino.Actuadores;
import arduino.ArduinoPackage;
import arduino.Instrucciones;
import arduino.Sensores;
import arduino.Sketch;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sketch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduino.impl.SketchImpl#getNombre <em>Nombre</em>}</li>
 *   <li>{@link arduino.impl.SketchImpl#getSensores <em>Sensores</em>}</li>
 *   <li>{@link arduino.impl.SketchImpl#getActuadores <em>Actuadores</em>}</li>
 *   <li>{@link arduino.impl.SketchImpl#getIns <em>Ins</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SketchImpl extends MinimalEObjectImpl.Container implements Sketch {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSensores() <em>Sensores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensores()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensores> sensores;

	/**
	 * The cached value of the '{@link #getActuadores() <em>Actuadores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuadores()
	 * @generated
	 * @ordered
	 */
	protected EList<Actuadores> actuadores;

	/**
	 * The cached value of the '{@link #getIns() <em>Ins</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIns()
	 * @generated
	 * @ordered
	 */
	protected EList<Instrucciones> ins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SketchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.SKETCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.SKETCH__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensores> getSensores() {
		if (sensores == null) {
			sensores = new EObjectContainmentEList<Sensores>(Sensores.class, this, ArduinoPackage.SKETCH__SENSORES);
		}
		return sensores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actuadores> getActuadores() {
		if (actuadores == null) {
			actuadores = new EObjectContainmentEList<Actuadores>(Actuadores.class, this,
					ArduinoPackage.SKETCH__ACTUADORES);
		}
		return actuadores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instrucciones> getIns() {
		if (ins == null) {
			ins = new EObjectResolvingEList<Instrucciones>(Instrucciones.class, this, ArduinoPackage.SKETCH__INS);
		}
		return ins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArduinoPackage.SKETCH__SENSORES:
			return ((InternalEList<?>) getSensores()).basicRemove(otherEnd, msgs);
		case ArduinoPackage.SKETCH__ACTUADORES:
			return ((InternalEList<?>) getActuadores()).basicRemove(otherEnd, msgs);
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
		case ArduinoPackage.SKETCH__NOMBRE:
			return getNombre();
		case ArduinoPackage.SKETCH__SENSORES:
			return getSensores();
		case ArduinoPackage.SKETCH__ACTUADORES:
			return getActuadores();
		case ArduinoPackage.SKETCH__INS:
			return getIns();
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
		case ArduinoPackage.SKETCH__NOMBRE:
			setNombre((String) newValue);
			return;
		case ArduinoPackage.SKETCH__SENSORES:
			getSensores().clear();
			getSensores().addAll((Collection<? extends Sensores>) newValue);
			return;
		case ArduinoPackage.SKETCH__ACTUADORES:
			getActuadores().clear();
			getActuadores().addAll((Collection<? extends Actuadores>) newValue);
			return;
		case ArduinoPackage.SKETCH__INS:
			getIns().clear();
			getIns().addAll((Collection<? extends Instrucciones>) newValue);
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
		case ArduinoPackage.SKETCH__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
			return;
		case ArduinoPackage.SKETCH__SENSORES:
			getSensores().clear();
			return;
		case ArduinoPackage.SKETCH__ACTUADORES:
			getActuadores().clear();
			return;
		case ArduinoPackage.SKETCH__INS:
			getIns().clear();
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
		case ArduinoPackage.SKETCH__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
		case ArduinoPackage.SKETCH__SENSORES:
			return sensores != null && !sensores.isEmpty();
		case ArduinoPackage.SKETCH__ACTUADORES:
			return actuadores != null && !actuadores.isEmpty();
		case ArduinoPackage.SKETCH__INS:
			return ins != null && !ins.isEmpty();
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
		result.append(" (Nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //SketchImpl
