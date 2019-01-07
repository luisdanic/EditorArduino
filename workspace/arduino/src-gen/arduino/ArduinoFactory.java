/**
 */
package arduino;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see arduino.ArduinoPackage
 * @generated
 */
public interface ArduinoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArduinoFactory eINSTANCE = arduino.impl.ArduinoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Sketch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sketch</em>'.
	 * @generated
	 */
	Sketch createSketch();

	/**
	 * Returns a new object of class '<em>Led</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Led</em>'.
	 * @generated
	 */
	Led createLed();

	/**
	 * Returns a new object of class '<em>LDR</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LDR</em>'.
	 * @generated
	 */
	LDR createLDR();

	/**
	 * Returns a new object of class '<em>Apagar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apagar</em>'.
	 * @generated
	 */
	Apagar createApagar();

	/**
	 * Returns a new object of class '<em>Variar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variar</em>'.
	 * @generated
	 */
	Variar createVariar();

	/**
	 * Returns a new object of class '<em>Esperar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Esperar</em>'.
	 * @generated
	 */
	Esperar createEsperar();

	/**
	 * Returns a new object of class '<em>Encender</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encender</em>'.
	 * @generated
	 */
	Encender createEncender();

	/**
	 * Returns a new object of class '<em>Do While</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Do While</em>'.
	 * @generated
	 */
	DoWhile createDoWhile();

	/**
	 * Returns a new object of class '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>If</em>'.
	 * @generated
	 */
	If createIf();

	/**
	 * Returns a new object of class '<em>For</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>For</em>'.
	 * @generated
	 */
	For createFor();

	/**
	 * Returns a new object of class '<em>While</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>While</em>'.
	 * @generated
	 */
	While createWhile();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArduinoPackage getArduinoPackage();

} //ArduinoFactory
