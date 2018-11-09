/**
 */
package arduino;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see arduino.ArduinoFactory
 * @model kind="package"
 * @generated
 */
public interface ArduinoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arduino";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/arduino";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "arduino";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArduinoPackage eINSTANCE = arduino.impl.ArduinoPackageImpl.init();

	/**
	 * The meta object id for the '{@link arduino.impl.SketchImpl <em>Sketch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduino.impl.SketchImpl
	 * @see arduino.impl.ArduinoPackageImpl#getSketch()
	 * @generated
	 */
	int SKETCH = 0;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__NOMBRE = 0;

	/**
	 * The feature id for the '<em><b>Sensores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__SENSORES = 1;

	/**
	 * The feature id for the '<em><b>Actuadores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__ACTUADORES = 2;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__INS = 3;

	/**
	 * The number of structural features of the '<em>Sketch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sketch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduino.impl.ActuadoresImpl <em>Actuadores</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduino.impl.ActuadoresImpl
	 * @see arduino.impl.ArduinoPackageImpl#getActuadores()
	 * @generated
	 */
	int ACTUADORES = 1;

	/**
	 * The feature id for the '<em><b>Instrucciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUADORES__INSTRUCCIONES = 0;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUADORES__PIN = 1;

	/**
	 * The feature id for the '<em><b>Sen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUADORES__SEN = 2;

	/**
	 * The number of structural features of the '<em>Actuadores</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUADORES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Actuadores</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUADORES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduino.impl.SensoresImpl <em>Sensores</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduino.impl.SensoresImpl
	 * @see arduino.impl.ArduinoPackageImpl#getSensores()
	 * @generated
	 */
	int SENSORES = 2;

	/**
	 * The feature id for the '<em><b>Med</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORES__MED = 0;

	/**
	 * The feature id for the '<em><b>Datos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORES__DATOS = 1;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORES__PIN = 2;

	/**
	 * The feature id for the '<em><b>Act</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORES__ACT = 3;

	/**
	 * The number of structural features of the '<em>Sensores</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sensores</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduino.impl.LedImpl <em>Led</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduino.impl.LedImpl
	 * @see arduino.impl.ArduinoPackageImpl#getLed()
	 * @generated
	 */
	int LED = 3;

	/**
	 * The feature id for the '<em><b>Instrucciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__INSTRUCCIONES = ACTUADORES__INSTRUCCIONES;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__PIN = ACTUADORES__PIN;

	/**
	 * The feature id for the '<em><b>Sen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__SEN = ACTUADORES__SEN;

	/**
	 * The number of structural features of the '<em>Led</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_FEATURE_COUNT = ACTUADORES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Led</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_OPERATION_COUNT = ACTUADORES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduino.impl.LDRImpl <em>LDR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduino.impl.LDRImpl
	 * @see arduino.impl.ArduinoPackageImpl#getLDR()
	 * @generated
	 */
	int LDR = 4;

	/**
	 * The feature id for the '<em><b>Med</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDR__MED = SENSORES__MED;

	/**
	 * The feature id for the '<em><b>Datos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDR__DATOS = SENSORES__DATOS;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDR__PIN = SENSORES__PIN;

	/**
	 * The feature id for the '<em><b>Act</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDR__ACT = SENSORES__ACT;

	/**
	 * The number of structural features of the '<em>LDR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDR_FEATURE_COUNT = SENSORES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>LDR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDR_OPERATION_COUNT = SENSORES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduino.impl.InstruccionesImpl <em>Instrucciones</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduino.impl.InstruccionesImpl
	 * @see arduino.impl.ArduinoPackageImpl#getInstrucciones()
	 * @generated
	 */
	int INSTRUCCIONES = 5;

	/**
	 * The number of structural features of the '<em>Instrucciones</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCCIONES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Instrucciones</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCCIONES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduino.impl.ApagarImpl <em>Apagar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduino.impl.ApagarImpl
	 * @see arduino.impl.ArduinoPackageImpl#getApagar()
	 * @generated
	 */
	int APAGAR = 6;

	/**
	 * The feature id for the '<em><b>Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APAGAR__OFF = INSTRUCCIONES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Apagar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APAGAR_FEATURE_COUNT = INSTRUCCIONES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Apagar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APAGAR_OPERATION_COUNT = INSTRUCCIONES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduino.impl.VariarImpl <em>Variar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduino.impl.VariarImpl
	 * @see arduino.impl.ArduinoPackageImpl#getVariar()
	 * @generated
	 */
	int VARIAR = 7;

	/**
	 * The feature id for the '<em><b>Pwm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIAR__PWM = INSTRUCCIONES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIAR_FEATURE_COUNT = INSTRUCCIONES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIAR_OPERATION_COUNT = INSTRUCCIONES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduino.impl.EsperarImpl <em>Esperar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduino.impl.EsperarImpl
	 * @see arduino.impl.ArduinoPackageImpl#getEsperar()
	 * @generated
	 */
	int ESPERAR = 8;

	/**
	 * The feature id for the '<em><b>Segundos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPERAR__SEGUNDOS = INSTRUCCIONES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Apagar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPERAR__APAGAR = INSTRUCCIONES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Esperar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPERAR_FEATURE_COUNT = INSTRUCCIONES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Esperar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPERAR_OPERATION_COUNT = INSTRUCCIONES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduino.impl.EncenderImpl <em>Encender</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduino.impl.EncenderImpl
	 * @see arduino.impl.ArduinoPackageImpl#getEncender()
	 * @generated
	 */
	int ENCENDER = 9;

	/**
	 * The feature id for the '<em><b>On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCENDER__ON = INSTRUCCIONES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Esperar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCENDER__ESPERAR = INSTRUCCIONES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Encender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCENDER_FEATURE_COUNT = INSTRUCCIONES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Encender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCENDER_OPERATION_COUNT = INSTRUCCIONES_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link arduino.Sketch <em>Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sketch</em>'.
	 * @see arduino.Sketch
	 * @generated
	 */
	EClass getSketch();

	/**
	 * Returns the meta object for the attribute '{@link arduino.Sketch#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see arduino.Sketch#getNombre()
	 * @see #getSketch()
	 * @generated
	 */
	EAttribute getSketch_Nombre();

	/**
	 * Returns the meta object for the containment reference list '{@link arduino.Sketch#getSensores <em>Sensores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensores</em>'.
	 * @see arduino.Sketch#getSensores()
	 * @see #getSketch()
	 * @generated
	 */
	EReference getSketch_Sensores();

	/**
	 * Returns the meta object for the containment reference list '{@link arduino.Sketch#getActuadores <em>Actuadores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actuadores</em>'.
	 * @see arduino.Sketch#getActuadores()
	 * @see #getSketch()
	 * @generated
	 */
	EReference getSketch_Actuadores();

	/**
	 * Returns the meta object for the reference list '{@link arduino.Sketch#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ins</em>'.
	 * @see arduino.Sketch#getIns()
	 * @see #getSketch()
	 * @generated
	 */
	EReference getSketch_Ins();

	/**
	 * Returns the meta object for class '{@link arduino.Actuadores <em>Actuadores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuadores</em>'.
	 * @see arduino.Actuadores
	 * @generated
	 */
	EClass getActuadores();

	/**
	 * Returns the meta object for the containment reference list '{@link arduino.Actuadores#getInstrucciones <em>Instrucciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instrucciones</em>'.
	 * @see arduino.Actuadores#getInstrucciones()
	 * @see #getActuadores()
	 * @generated
	 */
	EReference getActuadores_Instrucciones();

	/**
	 * Returns the meta object for the attribute '{@link arduino.Actuadores#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin</em>'.
	 * @see arduino.Actuadores#getPin()
	 * @see #getActuadores()
	 * @generated
	 */
	EAttribute getActuadores_Pin();

	/**
	 * Returns the meta object for the reference '{@link arduino.Actuadores#getSen <em>Sen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sen</em>'.
	 * @see arduino.Actuadores#getSen()
	 * @see #getActuadores()
	 * @generated
	 */
	EReference getActuadores_Sen();

	/**
	 * Returns the meta object for class '{@link arduino.Sensores <em>Sensores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensores</em>'.
	 * @see arduino.Sensores
	 * @generated
	 */
	EClass getSensores();

	/**
	 * Returns the meta object for the attribute '{@link arduino.Sensores#getMed <em>Med</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Med</em>'.
	 * @see arduino.Sensores#getMed()
	 * @see #getSensores()
	 * @generated
	 */
	EAttribute getSensores_Med();

	/**
	 * Returns the meta object for the reference '{@link arduino.Sensores#getDatos <em>Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datos</em>'.
	 * @see arduino.Sensores#getDatos()
	 * @see #getSensores()
	 * @generated
	 */
	EReference getSensores_Datos();

	/**
	 * Returns the meta object for the attribute '{@link arduino.Sensores#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin</em>'.
	 * @see arduino.Sensores#getPin()
	 * @see #getSensores()
	 * @generated
	 */
	EAttribute getSensores_Pin();

	/**
	 * Returns the meta object for the reference list '{@link arduino.Sensores#getAct <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Act</em>'.
	 * @see arduino.Sensores#getAct()
	 * @see #getSensores()
	 * @generated
	 */
	EReference getSensores_Act();

	/**
	 * Returns the meta object for class '{@link arduino.Led <em>Led</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Led</em>'.
	 * @see arduino.Led
	 * @generated
	 */
	EClass getLed();

	/**
	 * Returns the meta object for class '{@link arduino.LDR <em>LDR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LDR</em>'.
	 * @see arduino.LDR
	 * @generated
	 */
	EClass getLDR();

	/**
	 * Returns the meta object for class '{@link arduino.Instrucciones <em>Instrucciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instrucciones</em>'.
	 * @see arduino.Instrucciones
	 * @generated
	 */
	EClass getInstrucciones();

	/**
	 * Returns the meta object for class '{@link arduino.Apagar <em>Apagar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Apagar</em>'.
	 * @see arduino.Apagar
	 * @generated
	 */
	EClass getApagar();

	/**
	 * Returns the meta object for the attribute '{@link arduino.Apagar#getOff <em>Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Off</em>'.
	 * @see arduino.Apagar#getOff()
	 * @see #getApagar()
	 * @generated
	 */
	EAttribute getApagar_Off();

	/**
	 * Returns the meta object for class '{@link arduino.Variar <em>Variar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variar</em>'.
	 * @see arduino.Variar
	 * @generated
	 */
	EClass getVariar();

	/**
	 * Returns the meta object for the attribute '{@link arduino.Variar#getPwm <em>Pwm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pwm</em>'.
	 * @see arduino.Variar#getPwm()
	 * @see #getVariar()
	 * @generated
	 */
	EAttribute getVariar_Pwm();

	/**
	 * Returns the meta object for class '{@link arduino.Esperar <em>Esperar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Esperar</em>'.
	 * @see arduino.Esperar
	 * @generated
	 */
	EClass getEsperar();

	/**
	 * Returns the meta object for the attribute '{@link arduino.Esperar#getSegundos <em>Segundos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Segundos</em>'.
	 * @see arduino.Esperar#getSegundos()
	 * @see #getEsperar()
	 * @generated
	 */
	EAttribute getEsperar_Segundos();

	/**
	 * Returns the meta object for the reference '{@link arduino.Esperar#getApagar <em>Apagar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Apagar</em>'.
	 * @see arduino.Esperar#getApagar()
	 * @see #getEsperar()
	 * @generated
	 */
	EReference getEsperar_Apagar();

	/**
	 * Returns the meta object for class '{@link arduino.Encender <em>Encender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encender</em>'.
	 * @see arduino.Encender
	 * @generated
	 */
	EClass getEncender();

	/**
	 * Returns the meta object for the attribute '{@link arduino.Encender#getOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>On</em>'.
	 * @see arduino.Encender#getOn()
	 * @see #getEncender()
	 * @generated
	 */
	EAttribute getEncender_On();

	/**
	 * Returns the meta object for the reference '{@link arduino.Encender#getEsperar <em>Esperar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Esperar</em>'.
	 * @see arduino.Encender#getEsperar()
	 * @see #getEncender()
	 * @generated
	 */
	EReference getEncender_Esperar();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArduinoFactory getArduinoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link arduino.impl.SketchImpl <em>Sketch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduino.impl.SketchImpl
		 * @see arduino.impl.ArduinoPackageImpl#getSketch()
		 * @generated
		 */
		EClass SKETCH = eINSTANCE.getSketch();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKETCH__NOMBRE = eINSTANCE.getSketch_Nombre();

		/**
		 * The meta object literal for the '<em><b>Sensores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKETCH__SENSORES = eINSTANCE.getSketch_Sensores();

		/**
		 * The meta object literal for the '<em><b>Actuadores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKETCH__ACTUADORES = eINSTANCE.getSketch_Actuadores();

		/**
		 * The meta object literal for the '<em><b>Ins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKETCH__INS = eINSTANCE.getSketch_Ins();

		/**
		 * The meta object literal for the '{@link arduino.impl.ActuadoresImpl <em>Actuadores</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduino.impl.ActuadoresImpl
		 * @see arduino.impl.ArduinoPackageImpl#getActuadores()
		 * @generated
		 */
		EClass ACTUADORES = eINSTANCE.getActuadores();

		/**
		 * The meta object literal for the '<em><b>Instrucciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUADORES__INSTRUCCIONES = eINSTANCE.getActuadores_Instrucciones();

		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUADORES__PIN = eINSTANCE.getActuadores_Pin();

		/**
		 * The meta object literal for the '<em><b>Sen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUADORES__SEN = eINSTANCE.getActuadores_Sen();

		/**
		 * The meta object literal for the '{@link arduino.impl.SensoresImpl <em>Sensores</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduino.impl.SensoresImpl
		 * @see arduino.impl.ArduinoPackageImpl#getSensores()
		 * @generated
		 */
		EClass SENSORES = eINSTANCE.getSensores();

		/**
		 * The meta object literal for the '<em><b>Med</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSORES__MED = eINSTANCE.getSensores_Med();

		/**
		 * The meta object literal for the '<em><b>Datos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSORES__DATOS = eINSTANCE.getSensores_Datos();

		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSORES__PIN = eINSTANCE.getSensores_Pin();

		/**
		 * The meta object literal for the '<em><b>Act</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSORES__ACT = eINSTANCE.getSensores_Act();

		/**
		 * The meta object literal for the '{@link arduino.impl.LedImpl <em>Led</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduino.impl.LedImpl
		 * @see arduino.impl.ArduinoPackageImpl#getLed()
		 * @generated
		 */
		EClass LED = eINSTANCE.getLed();

		/**
		 * The meta object literal for the '{@link arduino.impl.LDRImpl <em>LDR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduino.impl.LDRImpl
		 * @see arduino.impl.ArduinoPackageImpl#getLDR()
		 * @generated
		 */
		EClass LDR = eINSTANCE.getLDR();

		/**
		 * The meta object literal for the '{@link arduino.impl.InstruccionesImpl <em>Instrucciones</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduino.impl.InstruccionesImpl
		 * @see arduino.impl.ArduinoPackageImpl#getInstrucciones()
		 * @generated
		 */
		EClass INSTRUCCIONES = eINSTANCE.getInstrucciones();

		/**
		 * The meta object literal for the '{@link arduino.impl.ApagarImpl <em>Apagar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduino.impl.ApagarImpl
		 * @see arduino.impl.ArduinoPackageImpl#getApagar()
		 * @generated
		 */
		EClass APAGAR = eINSTANCE.getApagar();

		/**
		 * The meta object literal for the '<em><b>Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APAGAR__OFF = eINSTANCE.getApagar_Off();

		/**
		 * The meta object literal for the '{@link arduino.impl.VariarImpl <em>Variar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduino.impl.VariarImpl
		 * @see arduino.impl.ArduinoPackageImpl#getVariar()
		 * @generated
		 */
		EClass VARIAR = eINSTANCE.getVariar();

		/**
		 * The meta object literal for the '<em><b>Pwm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIAR__PWM = eINSTANCE.getVariar_Pwm();

		/**
		 * The meta object literal for the '{@link arduino.impl.EsperarImpl <em>Esperar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduino.impl.EsperarImpl
		 * @see arduino.impl.ArduinoPackageImpl#getEsperar()
		 * @generated
		 */
		EClass ESPERAR = eINSTANCE.getEsperar();

		/**
		 * The meta object literal for the '<em><b>Segundos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESPERAR__SEGUNDOS = eINSTANCE.getEsperar_Segundos();

		/**
		 * The meta object literal for the '<em><b>Apagar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESPERAR__APAGAR = eINSTANCE.getEsperar_Apagar();

		/**
		 * The meta object literal for the '{@link arduino.impl.EncenderImpl <em>Encender</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduino.impl.EncenderImpl
		 * @see arduino.impl.ArduinoPackageImpl#getEncender()
		 * @generated
		 */
		EClass ENCENDER = eINSTANCE.getEncender();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCENDER__ON = eINSTANCE.getEncender_On();

		/**
		 * The meta object literal for the '<em><b>Esperar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCENDER__ESPERAR = eINSTANCE.getEncender_Esperar();

	}

} //ArduinoPackage
