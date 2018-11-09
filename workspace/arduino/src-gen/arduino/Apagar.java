/**
 */
package arduino;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apagar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.Apagar#getOff <em>Off</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getApagar()
 * @model
 * @generated
 */
public interface Apagar extends Instrucciones {
	/**
	 * Returns the value of the '<em><b>Off</b></em>' attribute.
	 * The default value is <code>"LOW"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Off</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Off</em>' attribute.
	 * @see #setOff(String)
	 * @see arduino.ArduinoPackage#getApagar_Off()
	 * @model default="LOW"
	 * @generated
	 */
	String getOff();

	/**
	 * Sets the value of the '{@link arduino.Apagar#getOff <em>Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Off</em>' attribute.
	 * @see #getOff()
	 * @generated
	 */
	void setOff(String value);

} // Apagar
