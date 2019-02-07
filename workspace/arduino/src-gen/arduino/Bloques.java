/**
 */
package arduino;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bloques</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.Bloques#getBloq <em>Bloq</em>}</li>
 *   <li>{@link arduino.Bloques#getBactuadores <em>Bactuadores</em>}</li>
 *   <li>{@link arduino.Bloques#getBinstrucciones <em>Binstrucciones</em>}</li>
 *   <li>{@link arduino.Bloques#getBsensores <em>Bsensores</em>}</li>
 *   <li>{@link arduino.Bloques#getBloacts <em>Bloacts</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getBloques()
 * @model abstract="true"
 * @generated
 */
public interface Bloques extends EObject {

	/**
	 * Returns the value of the '<em><b>Bloq</b></em>' containment reference list.
	 * The list contents are of type {@link arduino.Bloques}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bloq</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bloq</em>' containment reference list.
	 * @see arduino.ArduinoPackage#getBloques_Bloq()
	 * @model containment="true"
	 * @generated
	 */
	EList<Bloques> getBloq();

	/**
	 * Returns the value of the '<em><b>Bactuadores</b></em>' containment reference list.
	 * The list contents are of type {@link arduino.Actuadores}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bactuadores</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bactuadores</em>' containment reference list.
	 * @see arduino.ArduinoPackage#getBloques_Bactuadores()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actuadores> getBactuadores();

	/**
	 * Returns the value of the '<em><b>Binstrucciones</b></em>' containment reference list.
	 * The list contents are of type {@link arduino.Instrucciones}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binstrucciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binstrucciones</em>' containment reference list.
	 * @see arduino.ArduinoPackage#getBloques_Binstrucciones()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instrucciones> getBinstrucciones();

	/**
	 * Returns the value of the '<em><b>Bsensores</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bsensores</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bsensores</em>' reference.
	 * @see #setBsensores(Sensores)
	 * @see arduino.ArduinoPackage#getBloques_Bsensores()
	 * @model
	 * @generated
	 */
	Sensores getBsensores();

	/**
	 * Sets the value of the '{@link arduino.Bloques#getBsensores <em>Bsensores</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bsensores</em>' reference.
	 * @see #getBsensores()
	 * @generated
	 */
	void setBsensores(Sensores value);

	/**
	 * Returns the value of the '<em><b>Bloacts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bloacts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bloacts</em>' reference.
	 * @see #setBloacts(Actuadores)
	 * @see arduino.ArduinoPackage#getBloques_Bloacts()
	 * @model
	 * @generated
	 */
	Actuadores getBloacts();

	/**
	 * Sets the value of the '{@link arduino.Bloques#getBloacts <em>Bloacts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bloacts</em>' reference.
	 * @see #getBloacts()
	 * @generated
	 */
	void setBloacts(Actuadores value);

} // Bloques
