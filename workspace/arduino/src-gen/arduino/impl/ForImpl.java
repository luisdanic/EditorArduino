/**
 */
package arduino.impl;

import arduino.ArduinoPackage;
import arduino.For;
import arduino.forAccion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>For</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduino.impl.ForImpl#getIterador <em>Iterador</em>}</li>
 *   <li>{@link arduino.impl.ForImpl#getValorInicial <em>Valor Inicial</em>}</li>
 *   <li>{@link arduino.impl.ForImpl#getValorFinal <em>Valor Final</em>}</li>
 *   <li>{@link arduino.impl.ForImpl#getValorAccion <em>Valor Accion</em>}</li>
 *   <li>{@link arduino.impl.ForImpl#getAccion <em>Accion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForImpl extends BloquesImpl implements For {
	/**
	 * The default value of the '{@link #getIterador() <em>Iterador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterador()
	 * @generated
	 * @ordered
	 */
	protected static final String ITERADOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIterador() <em>Iterador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterador()
	 * @generated
	 * @ordered
	 */
	protected String iterador = ITERADOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getValorInicial() <em>Valor Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorInicial()
	 * @generated
	 * @ordered
	 */
	protected static final int VALOR_INICIAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValorInicial() <em>Valor Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorInicial()
	 * @generated
	 * @ordered
	 */
	protected int valorInicial = VALOR_INICIAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getValorFinal() <em>Valor Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorFinal()
	 * @generated
	 * @ordered
	 */
	protected static final int VALOR_FINAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValorFinal() <em>Valor Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorFinal()
	 * @generated
	 * @ordered
	 */
	protected int valorFinal = VALOR_FINAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getValorAccion() <em>Valor Accion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorAccion()
	 * @generated
	 * @ordered
	 */
	protected static final int VALOR_ACCION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValorAccion() <em>Valor Accion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValorAccion()
	 * @generated
	 * @ordered
	 */
	protected int valorAccion = VALOR_ACCION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccion() <em>Accion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccion()
	 * @generated
	 * @ordered
	 */
	protected static final forAccion ACCION_EDEFAULT = forAccion.INCREMENTO;

	/**
	 * The cached value of the '{@link #getAccion() <em>Accion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccion()
	 * @generated
	 * @ordered
	 */
	protected forAccion accion = ACCION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.FOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIterador() {
		return iterador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterador(String newIterador) {
		String oldIterador = iterador;
		iterador = newIterador;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.FOR__ITERADOR, oldIterador, iterador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValorInicial() {
		return valorInicial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValorInicial(int newValorInicial) {
		int oldValorInicial = valorInicial;
		valorInicial = newValorInicial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.FOR__VALOR_INICIAL, oldValorInicial,
					valorInicial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValorFinal() {
		return valorFinal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValorFinal(int newValorFinal) {
		int oldValorFinal = valorFinal;
		valorFinal = newValorFinal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.FOR__VALOR_FINAL, oldValorFinal,
					valorFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValorAccion() {
		return valorAccion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValorAccion(int newValorAccion) {
		int oldValorAccion = valorAccion;
		valorAccion = newValorAccion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.FOR__VALOR_ACCION, oldValorAccion,
					valorAccion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public forAccion getAccion() {
		return accion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccion(forAccion newAccion) {
		forAccion oldAccion = accion;
		accion = newAccion == null ? ACCION_EDEFAULT : newAccion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.FOR__ACCION, oldAccion, accion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArduinoPackage.FOR__ITERADOR:
			return getIterador();
		case ArduinoPackage.FOR__VALOR_INICIAL:
			return getValorInicial();
		case ArduinoPackage.FOR__VALOR_FINAL:
			return getValorFinal();
		case ArduinoPackage.FOR__VALOR_ACCION:
			return getValorAccion();
		case ArduinoPackage.FOR__ACCION:
			return getAccion();
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
		case ArduinoPackage.FOR__ITERADOR:
			setIterador((String) newValue);
			return;
		case ArduinoPackage.FOR__VALOR_INICIAL:
			setValorInicial((Integer) newValue);
			return;
		case ArduinoPackage.FOR__VALOR_FINAL:
			setValorFinal((Integer) newValue);
			return;
		case ArduinoPackage.FOR__VALOR_ACCION:
			setValorAccion((Integer) newValue);
			return;
		case ArduinoPackage.FOR__ACCION:
			setAccion((forAccion) newValue);
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
		case ArduinoPackage.FOR__ITERADOR:
			setIterador(ITERADOR_EDEFAULT);
			return;
		case ArduinoPackage.FOR__VALOR_INICIAL:
			setValorInicial(VALOR_INICIAL_EDEFAULT);
			return;
		case ArduinoPackage.FOR__VALOR_FINAL:
			setValorFinal(VALOR_FINAL_EDEFAULT);
			return;
		case ArduinoPackage.FOR__VALOR_ACCION:
			setValorAccion(VALOR_ACCION_EDEFAULT);
			return;
		case ArduinoPackage.FOR__ACCION:
			setAccion(ACCION_EDEFAULT);
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
		case ArduinoPackage.FOR__ITERADOR:
			return ITERADOR_EDEFAULT == null ? iterador != null : !ITERADOR_EDEFAULT.equals(iterador);
		case ArduinoPackage.FOR__VALOR_INICIAL:
			return valorInicial != VALOR_INICIAL_EDEFAULT;
		case ArduinoPackage.FOR__VALOR_FINAL:
			return valorFinal != VALOR_FINAL_EDEFAULT;
		case ArduinoPackage.FOR__VALOR_ACCION:
			return valorAccion != VALOR_ACCION_EDEFAULT;
		case ArduinoPackage.FOR__ACCION:
			return accion != ACCION_EDEFAULT;
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
		result.append(" (iterador: ");
		result.append(iterador);
		result.append(", valorInicial: ");
		result.append(valorInicial);
		result.append(", valorFinal: ");
		result.append(valorFinal);
		result.append(", valorAccion: ");
		result.append(valorAccion);
		result.append(", accion: ");
		result.append(accion);
		result.append(')');
		return result.toString();
	}

} //ForImpl
