/**
 */
package arduino;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.Variar#getPwm <em>Pwm</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getVariar()
 * @model
 * @generated
 */
public interface Variar extends Instrucciones {
	/**
	 * Returns the value of the '<em><b>Pwm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pwm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pwm</em>' attribute.
	 * @see #setPwm(int)
	 * @see arduino.ArduinoPackage#getVariar_Pwm()
	 * @model
	 * @generated
	 */
	int getPwm();

	/**
	 * Sets the value of the '{@link arduino.Variar#getPwm <em>Pwm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pwm</em>' attribute.
	 * @see #getPwm()
	 * @generated
	 */
	void setPwm(int value);

} // Variar
