/**
 */
package arduino;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link arduino.For#getIterador <em>Iterador</em>}</li>
 *   <li>{@link arduino.For#getValorInicial <em>Valor Inicial</em>}</li>
 *   <li>{@link arduino.For#getValorFinal <em>Valor Final</em>}</li>
 *   <li>{@link arduino.For#getValorAccion <em>Valor Accion</em>}</li>
 *   <li>{@link arduino.For#getAccion <em>Accion</em>}</li>
 * </ul>
 *
 * @see arduino.ArduinoPackage#getFor()
 * @model
 * @generated
 */
public interface For extends Bloques {
	/**
	 * Returns the value of the '<em><b>Iterador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iterador</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterador</em>' attribute.
	 * @see #setIterador(String)
	 * @see arduino.ArduinoPackage#getFor_Iterador()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getIterador();

	/**
	 * Sets the value of the '{@link arduino.For#getIterador <em>Iterador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iterador</em>' attribute.
	 * @see #getIterador()
	 * @generated
	 */
	void setIterador(String value);

	/**
	 * Returns the value of the '<em><b>Valor Inicial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor Inicial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor Inicial</em>' attribute.
	 * @see #setValorInicial(int)
	 * @see arduino.ArduinoPackage#getFor_ValorInicial()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getValorInicial();

	/**
	 * Sets the value of the '{@link arduino.For#getValorInicial <em>Valor Inicial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Inicial</em>' attribute.
	 * @see #getValorInicial()
	 * @generated
	 */
	void setValorInicial(int value);

	/**
	 * Returns the value of the '<em><b>Valor Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor Final</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor Final</em>' attribute.
	 * @see #setValorFinal(int)
	 * @see arduino.ArduinoPackage#getFor_ValorFinal()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getValorFinal();

	/**
	 * Sets the value of the '{@link arduino.For#getValorFinal <em>Valor Final</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Final</em>' attribute.
	 * @see #getValorFinal()
	 * @generated
	 */
	void setValorFinal(int value);

	/**
	 * Returns the value of the '<em><b>Valor Accion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valor Accion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor Accion</em>' attribute.
	 * @see #setValorAccion(int)
	 * @see arduino.ArduinoPackage#getFor_ValorAccion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getValorAccion();

	/**
	 * Sets the value of the '{@link arduino.For#getValorAccion <em>Valor Accion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor Accion</em>' attribute.
	 * @see #getValorAccion()
	 * @generated
	 */
	void setValorAccion(int value);

	/**
	 * Returns the value of the '<em><b>Accion</b></em>' attribute.
	 * The literals are from the enumeration {@link arduino.forAccion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accion</em>' attribute.
	 * @see arduino.forAccion
	 * @see #setAccion(forAccion)
	 * @see arduino.ArduinoPackage#getFor_Accion()
	 * @model
	 * @generated
	 */
	forAccion getAccion();

	/**
	 * Sets the value of the '{@link arduino.For#getAccion <em>Accion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accion</em>' attribute.
	 * @see arduino.forAccion
	 * @see #getAccion()
	 * @generated
	 */
	void setAccion(forAccion value);

} // For
