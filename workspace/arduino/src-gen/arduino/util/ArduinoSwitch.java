/**
 */
package arduino.util;

import arduino.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see arduino.ArduinoPackage
 * @generated
 */
public class ArduinoSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArduinoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoSwitch() {
		if (modelPackage == null) {
			modelPackage = ArduinoPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ArduinoPackage.SKETCH: {
			Sketch sketch = (Sketch) theEObject;
			T result = caseSketch(sketch);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinoPackage.ACTUADORES: {
			Actuadores actuadores = (Actuadores) theEObject;
			T result = caseActuadores(actuadores);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinoPackage.SENSORES: {
			Sensores sensores = (Sensores) theEObject;
			T result = caseSensores(sensores);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinoPackage.LED: {
			Led led = (Led) theEObject;
			T result = caseLed(led);
			if (result == null)
				result = caseActuadores(led);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinoPackage.LDR: {
			LDR ldr = (LDR) theEObject;
			T result = caseLDR(ldr);
			if (result == null)
				result = caseSensores(ldr);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinoPackage.INSTRUCCIONES: {
			Instrucciones instrucciones = (Instrucciones) theEObject;
			T result = caseInstrucciones(instrucciones);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinoPackage.APAGAR: {
			Apagar apagar = (Apagar) theEObject;
			T result = caseApagar(apagar);
			if (result == null)
				result = caseInstrucciones(apagar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinoPackage.VARIAR: {
			Variar variar = (Variar) theEObject;
			T result = caseVariar(variar);
			if (result == null)
				result = caseInstrucciones(variar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinoPackage.ESPERAR: {
			Esperar esperar = (Esperar) theEObject;
			T result = caseEsperar(esperar);
			if (result == null)
				result = caseInstrucciones(esperar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinoPackage.ENCENDER: {
			Encender encender = (Encender) theEObject;
			T result = caseEncender(encender);
			if (result == null)
				result = caseInstrucciones(encender);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinoPackage.BLOQUES: {
			Bloques bloques = (Bloques) theEObject;
			T result = caseBloques(bloques);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinoPackage.DO_WHILE: {
			DoWhile doWhile = (DoWhile) theEObject;
			T result = caseDoWhile(doWhile);
			if (result == null)
				result = caseBloques(doWhile);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinoPackage.IF: {
			If if_ = (If) theEObject;
			T result = caseIf(if_);
			if (result == null)
				result = caseBloques(if_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinoPackage.FOR: {
			For for_ = (For) theEObject;
			T result = caseFor(for_);
			if (result == null)
				result = caseBloques(for_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ArduinoPackage.WHILE: {
			While while_ = (While) theEObject;
			T result = caseWhile(while_);
			if (result == null)
				result = caseBloques(while_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sketch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sketch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSketch(Sketch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actuadores</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actuadores</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActuadores(Actuadores object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensores</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensores</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensores(Sensores object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Led</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Led</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLed(Led object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LDR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LDR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLDR(LDR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instrucciones</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instrucciones</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstrucciones(Instrucciones object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apagar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apagar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApagar(Apagar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariar(Variar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Esperar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Esperar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEsperar(Esperar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encender</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encender</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncender(Encender object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bloques</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bloques</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBloques(Bloques object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Do While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Do While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoWhile(DoWhile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIf(If object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFor(For object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhile(While object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ArduinoSwitch
