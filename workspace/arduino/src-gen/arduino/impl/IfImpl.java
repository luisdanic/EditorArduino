/**
 */
package arduino.impl;

import arduino.ArduinoPackage;
import arduino.If;
import arduino.operandos;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduino.impl.IfImpl#getOperando <em>Operando</em>}</li>
 *   <li>{@link arduino.impl.IfImpl#getReferencia <em>Referencia</em>}</li>
 *   <li>{@link arduino.impl.IfImpl#getValor <em>Valor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfImpl extends BloquesImpl implements If {
	/**
	 * The default value of the '{@link #getOperando() <em>Operando</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperando()
	 * @generated
	 * @ordered
	 */
	protected static final operandos OPERANDO_EDEFAULT = operandos.MENOR;

	/**
	 * The cached value of the '{@link #getOperando() <em>Operando</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperando()
	 * @generated
	 * @ordered
	 */
	protected operandos operando = OPERANDO_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferencia() <em>Referencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencia()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCIA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferencia() <em>Referencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencia()
	 * @generated
	 * @ordered
	 */
	protected String referencia = REFERENCIA_EDEFAULT;

	/**
	 * The default value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected static final String VALOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected String valor = VALOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.IF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public operandos getOperando() {
		return operando;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperando(operandos newOperando) {
		operandos oldOperando = operando;
		operando = newOperando == null ? OPERANDO_EDEFAULT : newOperando;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.IF__OPERANDO, oldOperando, operando));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferencia() {
		return referencia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencia(String newReferencia) {
		String oldReferencia = referencia;
		referencia = newReferencia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.IF__REFERENCIA, oldReferencia,
					referencia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValor() {
		return valor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValor(String newValor) {
		String oldValor = valor;
		valor = newValor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.IF__VALOR, oldValor, valor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArduinoPackage.IF__OPERANDO:
			return getOperando();
		case ArduinoPackage.IF__REFERENCIA:
			return getReferencia();
		case ArduinoPackage.IF__VALOR:
			return getValor();
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
		case ArduinoPackage.IF__OPERANDO:
			setOperando((operandos) newValue);
			return;
		case ArduinoPackage.IF__REFERENCIA:
			setReferencia((String) newValue);
			return;
		case ArduinoPackage.IF__VALOR:
			setValor((String) newValue);
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
		case ArduinoPackage.IF__OPERANDO:
			setOperando(OPERANDO_EDEFAULT);
			return;
		case ArduinoPackage.IF__REFERENCIA:
			setReferencia(REFERENCIA_EDEFAULT);
			return;
		case ArduinoPackage.IF__VALOR:
			setValor(VALOR_EDEFAULT);
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
		case ArduinoPackage.IF__OPERANDO:
			return operando != OPERANDO_EDEFAULT;
		case ArduinoPackage.IF__REFERENCIA:
			return REFERENCIA_EDEFAULT == null ? referencia != null : !REFERENCIA_EDEFAULT.equals(referencia);
		case ArduinoPackage.IF__VALOR:
			return VALOR_EDEFAULT == null ? valor != null : !VALOR_EDEFAULT.equals(valor);
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
		result.append(" (operando: ");
		result.append(operando);
		result.append(", referencia: ");
		result.append(referencia);
		result.append(", valor: ");
		result.append(valor);
		result.append(')');
		return result.toString();
	}

} //IfImpl
