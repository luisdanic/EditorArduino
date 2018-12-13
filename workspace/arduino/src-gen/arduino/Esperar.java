/**
 */
package arduino;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Esperar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.Esperar#getSegundos <em>Segundos</em>}</li>
 *   <li>{@link arduino.Esperar#getApagar <em>Apagar</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getEsperar()
 * @model
 * @generated
 */
public interface Esperar extends Instrucciones {
	/**
	 * Returns the value of the '<em><b>Segundos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segundos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segundos</em>' attribute.
	 * @see #setSegundos(int)
	 * @see arduino.ArduinoPackage#getEsperar_Segundos()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getSegundos();

	/**
	 * Sets the value of the '{@link arduino.Esperar#getSegundos <em>Segundos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segundos</em>' attribute.
	 * @see #getSegundos()
	 * @generated
	 */
	void setSegundos(int value);

	/**
	 * Returns the value of the '<em><b>Apagar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apagar</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Apagar</em>' reference.
	 * @see #setApagar(Apagar)
	 * @see arduino.ArduinoPackage#getEsperar_Apagar()
	 * @model
	 * @generated
	 */
	Apagar getApagar();

	/**
	 * Sets the value of the '{@link arduino.Esperar#getApagar <em>Apagar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apagar</em>' reference.
	 * @see #getApagar()
	 * @generated
	 */
	void setApagar(Apagar value);

} // Esperar
