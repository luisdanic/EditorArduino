/**
 */
package arduino;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuadores</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.Actuadores#getPin <em>Pin</em>}</li>
 *   <li>{@link arduino.Actuadores#getInstruccionactuador <em>Instruccionactuador</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getActuadores()
 * @model abstract="true"
 * @generated
 */
public interface Actuadores extends EObject {

	/**
	 * Returns the value of the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin</em>' attribute.
	 * @see #setPin(int)
	 * @see arduino.ArduinoPackage#getActuadores_Pin()
	 * @model
	 * @generated
	 */
	int getPin();

	/**
	 * Sets the value of the '{@link arduino.Actuadores#getPin <em>Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin</em>' attribute.
	 * @see #getPin()
	 * @generated
	 */
	void setPin(int value);

	/**
	 * Returns the value of the '<em><b>Instruccionactuador</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruccionactuador</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruccionactuador</em>' reference.
	 * @see #setInstruccionactuador(Instrucciones)
	 * @see arduino.ArduinoPackage#getActuadores_Instruccionactuador()
	 * @model
	 * @generated
	 */
	Instrucciones getInstruccionactuador();

	/**
	 * Sets the value of the '{@link arduino.Actuadores#getInstruccionactuador <em>Instruccionactuador</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instruccionactuador</em>' reference.
	 * @see #getInstruccionactuador()
	 * @generated
	 */
	void setInstruccionactuador(Instrucciones value);
} // Actuadores
