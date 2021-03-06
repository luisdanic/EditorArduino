/**
 */
package arduino;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sketch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.Sketch#getNombre <em>Nombre</em>}</li>
 *   <li>{@link arduino.Sketch#getSensores <em>Sensores</em>}</li>
 *   <li>{@link arduino.Sketch#getActuadores <em>Actuadores</em>}</li>
 *   <li>{@link arduino.Sketch#getInstrucciones <em>Instrucciones</em>}</li>
 *   <li>{@link arduino.Sketch#getBloques <em>Bloques</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getSketch()
 * @model
 * @generated
 */
public interface Sketch extends EObject {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nombre</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see arduino.ArduinoPackage#getSketch_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link arduino.Sketch#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Sensores</b></em>' containment reference list.
	 * The list contents are of type {@link arduino.Sensores}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensores</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensores</em>' containment reference list.
	 * @see arduino.ArduinoPackage#getSketch_Sensores()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sensores> getSensores();

	/**
	 * Returns the value of the '<em><b>Actuadores</b></em>' containment reference list.
	 * The list contents are of type {@link arduino.Actuadores}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actuadores</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuadores</em>' containment reference list.
	 * @see arduino.ArduinoPackage#getSketch_Actuadores()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actuadores> getActuadores();

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
	 * @see arduino.ArduinoPackage#getSketch_Instrucciones()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instrucciones> getInstrucciones();

	/**
	 * Returns the value of the '<em><b>Bloques</b></em>' containment reference list.
	 * The list contents are of type {@link arduino.Bloques}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bloques</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bloques</em>' containment reference list.
	 * @see arduino.ArduinoPackage#getSketch_Bloques()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bloques> getBloques();

} // Sketch
