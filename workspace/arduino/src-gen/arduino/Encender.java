/**
 */
package arduino;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encender</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.Encender#getEsperar <em>Esperar</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getEncender()
 * @model
 * @generated
 */
public interface Encender extends Instrucciones {
	/**
	 * Returns the value of the '<em><b>Esperar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Esperar</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Esperar</em>' reference.
	 * @see #setEsperar(Esperar)
	 * @see arduino.ArduinoPackage#getEncender_Esperar()
	 * @model
	 * @generated
	 */
	Esperar getEsperar();

	/**
	 * Sets the value of the '{@link arduino.Encender#getEsperar <em>Esperar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Esperar</em>' reference.
	 * @see #getEsperar()
	 * @generated
	 */
	void setEsperar(Esperar value);

} // Encender
