/**
 */
package arduino;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Servo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.Servo#getAngulo <em>Angulo</em>}</li>
 *   <li>{@link arduino.Servo#getLibreria <em>Libreria</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getServo()
 * @model
 * @generated
 */
public interface Servo extends Actuadores {
	/**
	 * Returns the value of the '<em><b>Angulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angulo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angulo</em>' attribute.
	 * @see #setAngulo(int)
	 * @see arduino.ArduinoPackage#getServo_Angulo()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getAngulo();

	/**
	 * Sets the value of the '{@link arduino.Servo#getAngulo <em>Angulo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angulo</em>' attribute.
	 * @see #getAngulo()
	 * @generated
	 */
	void setAngulo(int value);

	/**
	 * Returns the value of the '<em><b>Libreria</b></em>' attribute.
	 * The default value is <code>"Servo.h"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libreria</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libreria</em>' attribute.
	 * @see arduino.ArduinoPackage#getServo_Libreria()
	 * @model default="Servo.h" dataType="org.eclipse.emf.ecore.xml.type.String" changeable="false"
	 * @generated
	 */
	String getLibreria();

} // Servo
