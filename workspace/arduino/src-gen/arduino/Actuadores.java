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
 *   <li>{@link arduino.Actuadores#getActuadorinstruccion <em>Actuadorinstruccion</em>}</li>
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
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
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
	 * Returns the value of the '<em><b>Actuadorinstruccion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuadorinstruccion</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuadorinstruccion</em>' reference.
	 * @see #setActuadorinstruccion(Instrucciones)
	 * @see arduino.ArduinoPackage#getActuadores_Actuadorinstruccion()
	 * @model
	 * @generated
	 */
	Instrucciones getActuadorinstruccion();

	/**
	 * Sets the value of the '{@link arduino.Actuadores#getActuadorinstruccion <em>Actuadorinstruccion</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuadorinstruccion</em>' reference.
	 * @see #getActuadorinstruccion()
	 * @generated
	 */
	void setActuadorinstruccion(Instrucciones value);

	EObject getElemento();

} // Actuadores
