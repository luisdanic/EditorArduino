/**
 */
package arduino;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Else</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.IfElse#getOperando <em>Operando</em>}</li>
 *   <li>{@link arduino.IfElse#getReferencia <em>Referencia</em>}</li>
 *   <li>{@link arduino.IfElse#getValor <em>Valor</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getIfElse()
 * @model
 * @generated
 */
public interface IfElse extends Bloques {
	/**
	 * Returns the value of the '<em><b>Operando</b></em>' attribute.
	 * The literals are from the enumeration {@link arduino.operandos}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operando</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operando</em>' attribute.
	 * @see arduino.operandos
	 * @see #setOperando(operandos)
	 * @see arduino.ArduinoPackage#getIfElse_Operando()
	 * @model
	 * @generated
	 */
	operandos getOperando();

	/**
	 * Sets the value of the '{@link arduino.IfElse#getOperando <em>Operando</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operando</em>' attribute.
	 * @see arduino.operandos
	 * @see #getOperando()
	 * @generated
	 */
	void setOperando(operandos value);

	/**
	 * Returns the value of the '<em><b>Referencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referencia</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referencia</em>' attribute.
	 * @see #setReferencia(String)
	 * @see arduino.ArduinoPackage#getIfElse_Referencia()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getReferencia();

	/**
	 * Sets the value of the '{@link arduino.IfElse#getReferencia <em>Referencia</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referencia</em>' attribute.
	 * @see #getReferencia()
	 * @generated
	 */
	void setReferencia(String value);

	/**
	 * Returns the value of the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' attribute.
	 * @see #setValor(String)
	 * @see arduino.ArduinoPackage#getIfElse_Valor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getValor();

	/**
	 * Sets the value of the '{@link arduino.IfElse#getValor <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' attribute.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(String value);

} // IfElse
