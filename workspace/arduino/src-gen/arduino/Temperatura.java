/**
 */
package arduino;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temperatura</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.Temperatura#getTemperatura <em>Temperatura</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getTemperatura()
 * @model
 * @generated
 */
public interface Temperatura extends Sensores {
	/**
	 * Returns the value of the '<em><b>Temperatura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperatura</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperatura</em>' attribute.
	 * @see #setTemperatura(float)
	 * @see arduino.ArduinoPackage#getTemperatura_Temperatura()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Float"
	 * @generated
	 */
	float getTemperatura();

	/**
	 * Sets the value of the '{@link arduino.Temperatura#getTemperatura <em>Temperatura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperatura</em>' attribute.
	 * @see #getTemperatura()
	 * @generated
	 */
	void setTemperatura(float value);

} // Temperatura
