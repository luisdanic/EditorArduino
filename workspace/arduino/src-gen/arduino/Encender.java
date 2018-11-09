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
 *   <li>{@link arduino.Encender#getOn <em>On</em>}</li>
 *   <li>{@link arduino.Encender#getEsperar <em>Esperar</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getEncender()
 * @model
 * @generated
 */
public interface Encender extends Instrucciones {
	/**
	 * Returns the value of the '<em><b>On</b></em>' attribute.
	 * The default value is <code>"HIGH"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' attribute.
	 * @see #setOn(String)
	 * @see arduino.ArduinoPackage#getEncender_On()
	 * @model default="HIGH"
	 * @generated
	 */
	String getOn();

	/**
	 * Sets the value of the '{@link arduino.Encender#getOn <em>On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' attribute.
	 * @see #getOn()
	 * @generated
	 */
	void setOn(String value);

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
