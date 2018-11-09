/**
 */
package arduino;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensores</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.Sensores#getMed <em>Med</em>}</li>
 *   <li>{@link arduino.Sensores#getDatos <em>Datos</em>}</li>
 *   <li>{@link arduino.Sensores#getPin <em>Pin</em>}</li>
 *   <li>{@link arduino.Sensores#getAct <em>Act</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getSensores()
 * @model abstract="true"
 * @generated
 */
public interface Sensores extends EObject {

	/**
	 * Returns the value of the '<em><b>Med</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Med</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Med</em>' attribute.
	 * @see #setMed(int)
	 * @see arduino.ArduinoPackage#getSensores_Med()
	 * @model
	 * @generated
	 */
	int getMed();

	/**
	 * Sets the value of the '{@link arduino.Sensores#getMed <em>Med</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Med</em>' attribute.
	 * @see #getMed()
	 * @generated
	 */
	void setMed(int value);

	/**
	 * Returns the value of the '<em><b>Datos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datos</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datos</em>' reference.
	 * @see #setDatos(Variar)
	 * @see arduino.ArduinoPackage#getSensores_Datos()
	 * @model
	 * @generated
	 */
	Variar getDatos();

	/**
	 * Sets the value of the '{@link arduino.Sensores#getDatos <em>Datos</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datos</em>' reference.
	 * @see #getDatos()
	 * @generated
	 */
	void setDatos(Variar value);

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
	 * @see arduino.ArduinoPackage#getSensores_Pin()
	 * @model
	 * @generated
	 */
	int getPin();

	/**
	 * Sets the value of the '{@link arduino.Sensores#getPin <em>Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin</em>' attribute.
	 * @see #getPin()
	 * @generated
	 */
	void setPin(int value);

	/**
	 * Returns the value of the '<em><b>Act</b></em>' reference list.
	 * The list contents are of type {@link arduino.Actuadores}.
	 * It is bidirectional and its opposite is '{@link arduino.Actuadores#getSen <em>Sen</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Act</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Act</em>' reference list.
	 * @see arduino.ArduinoPackage#getSensores_Act()
	 * @see arduino.Actuadores#getSen
	 * @model opposite="sen"
	 * @generated
	 */
	EList<Actuadores> getAct();
} // Sensores
