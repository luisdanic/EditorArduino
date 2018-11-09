/**
 */
package arduino;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link arduino.Actuadores#getInstrucciones <em>Instrucciones</em>}</li>
 *   <li>{@link arduino.Actuadores#getPin <em>Pin</em>}</li>
 *   <li>{@link arduino.Actuadores#getSen <em>Sen</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getActuadores()
 * @model abstract="true"
 * @generated
 */
public interface Actuadores extends EObject {

	/**
	 * Returns the value of the '<em><b>Instrucciones</b></em>' containment reference list.
	 * The list contents are of type {@link arduino.Instrucciones}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instrucciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instrucciones</em>' containment reference list.
	 * @see arduino.ArduinoPackage#getActuadores_Instrucciones()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instrucciones> getInstrucciones();

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
	 * Returns the value of the '<em><b>Sen</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link arduino.Sensores#getAct <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sen</em>' reference.
	 * @see #setSen(Sensores)
	 * @see arduino.ArduinoPackage#getActuadores_Sen()
	 * @see arduino.Sensores#getAct
	 * @model opposite="act"
	 * @generated
	 */
	Sensores getSen();

	/**
	 * Sets the value of the '{@link arduino.Actuadores#getSen <em>Sen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sen</em>' reference.
	 * @see #getSen()
	 * @generated
	 */
	void setSen(Sensores value);
} // Actuadores
