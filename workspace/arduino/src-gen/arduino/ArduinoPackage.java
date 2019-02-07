/**
 */
package arduino;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>Instrucciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__INSTRUCCIONES = 3;

	/**
	 * The feature id for the '<em><b>Bloques</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH__BLOQUES = 4;

	/**
	 * The number of structural features of the '<em>Sketch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_FEATURE_COUNT = 5;

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
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUADORES__PIN = 0;

	/**
	 * The feature id for the '<em><b>Actuadorinstruccion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUADORES__ACTUADORINSTRUCCION = 1;

	/**
	 * The number of structural features of the '<em>Actuadores</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUADORES_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORES__PIN = 0;

	/**
	 * The feature id for the '<em><b>Act</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORES__ACT = 1;

	/**
	 * The feature id for the '<em><b>Med</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORES__MED = 2;

	/**
	 * The number of structural features of the '<em>Sensores</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSORES_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__PIN = ACTUADORES__PIN;

	/**
	 * The feature id for the '<em><b>Actuadorinstruccion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__ACTUADORINSTRUCCION = ACTUADORES__ACTUADORINSTRUCCION;

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
	 * The feature id for the '<em><b>Med</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LDR__MED = SENSORES__MED;

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
	 * The feature id for the '<em><b>Esperar1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APAGAR__ESPERAR1 = INSTRUCCIONES_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Datos</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIAR__DATOS = INSTRUCCIONES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIAR_FEATURE_COUNT = INSTRUCCIONES_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Miliseg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPERAR__MILISEG = INSTRUCCIONES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Apagar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPERAR__APAGAR = INSTRUCCIONES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Encender</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPERAR__ENCENDER = INSTRUCCIONES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Esperar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESPERAR_FEATURE_COUNT = INSTRUCCIONES_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Esperar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCENDER__ESPERAR = INSTRUCCIONES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Encender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCENDER_FEATURE_COUNT = INSTRUCCIONES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Encender</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCENDER_OPERATION_COUNT = INSTRUCCIONES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduino.impl.BloquesImpl <em>Bloques</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduino.impl.BloquesImpl
	 * @see arduino.impl.ArduinoPackageImpl#getBloques()
	 * @generated
	 */
	int BLOQUES = 10;

	/**
	 * The feature id for the '<em><b>Bloq</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOQUES__BLOQ = 0;

	/**
	 * The feature id for the '<em><b>Bactuadores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOQUES__BACTUADORES = 1;

	/**
	 * The feature id for the '<em><b>Binstrucciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOQUES__BINSTRUCCIONES = 2;

	/**
	 * The feature id for the '<em><b>Bsensores</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOQUES__BSENSORES = 3;

	/**
	 * The feature id for the '<em><b>Bloacts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOQUES__BLOACTS = 4;

	/**
	 * The number of structural features of the '<em>Bloques</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOQUES_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Bloques</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOQUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduino.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduino.impl.IfImpl
	 * @see arduino.impl.ArduinoPackageImpl#getIf()
	 * @generated
	 */
	int IF = 11;

	/**
	 * The feature id for the '<em><b>Bloq</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__BLOQ = BLOQUES__BLOQ;

	/**
	 * The feature id for the '<em><b>Bactuadores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__BACTUADORES = BLOQUES__BACTUADORES;

	/**
	 * The feature id for the '<em><b>Binstrucciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__BINSTRUCCIONES = BLOQUES__BINSTRUCCIONES;

	/**
	 * The feature id for the '<em><b>Bsensores</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__BSENSORES = BLOQUES__BSENSORES;

	/**
	 * The feature id for the '<em><b>Bloacts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__BLOACTS = BLOQUES__BLOACTS;

	/**
	 * The feature id for the '<em><b>Operando</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__OPERANDO = BLOQUES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__REFERENCIA = BLOQUES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__VALOR = BLOQUES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_FEATURE_COUNT = BLOQUES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_OPERATION_COUNT = BLOQUES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduino.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduino.impl.WhileImpl
	 * @see arduino.impl.ArduinoPackageImpl#getWhile()
	 * @generated
	 */
	int WHILE = 12;

	/**
	 * The feature id for the '<em><b>Bloq</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__BLOQ = BLOQUES__BLOQ;

	/**
	 * The feature id for the '<em><b>Bactuadores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__BACTUADORES = BLOQUES__BACTUADORES;

	/**
	 * The feature id for the '<em><b>Binstrucciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__BINSTRUCCIONES = BLOQUES__BINSTRUCCIONES;

	/**
	 * The feature id for the '<em><b>Bsensores</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__BSENSORES = BLOQUES__BSENSORES;

	/**
	 * The feature id for the '<em><b>Bloacts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__BLOACTS = BLOQUES__BLOACTS;

	/**
	 * The feature id for the '<em><b>Operando</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__OPERANDO = BLOQUES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__REFERENCIA = BLOQUES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__VALOR = BLOQUES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_FEATURE_COUNT = BLOQUES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_OPERATION_COUNT = BLOQUES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduino.impl.TemperaturaImpl <em>Temperatura</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduino.impl.TemperaturaImpl
	 * @see arduino.impl.ArduinoPackageImpl#getTemperatura()
	 * @generated
	 */
	int TEMPERATURA = 13;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURA__PIN = SENSORES__PIN;

	/**
	 * The feature id for the '<em><b>Act</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURA__ACT = SENSORES__ACT;

	/**
	 * The feature id for the '<em><b>Med</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURA__MED = SENSORES__MED;

	/**
	 * The feature id for the '<em><b>Temperatura</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURA__TEMPERATURA = SENSORES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Temperatura</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURA_FEATURE_COUNT = SENSORES_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Temperatura</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPERATURA_OPERATION_COUNT = SENSORES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduino.impl.PotenciometroImpl <em>Potenciometro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduino.impl.PotenciometroImpl
	 * @see arduino.impl.ArduinoPackageImpl#getPotenciometro()
	 * @generated
	 */
	int POTENCIOMETRO = 14;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENCIOMETRO__PIN = SENSORES__PIN;

	/**
	 * The feature id for the '<em><b>Act</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENCIOMETRO__ACT = SENSORES__ACT;

	/**
	 * The feature id for the '<em><b>Med</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENCIOMETRO__MED = SENSORES__MED;

	/**
	 * The number of structural features of the '<em>Potenciometro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENCIOMETRO_FEATURE_COUNT = SENSORES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Potenciometro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POTENCIOMETRO_OPERATION_COUNT = SENSORES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduino.impl.BotonImpl <em>Boton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduino.impl.BotonImpl
	 * @see arduino.impl.ArduinoPackageImpl#getBoton()
	 * @generated
	 */
	int BOTON = 15;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON__PIN = SENSORES__PIN;

	/**
	 * The feature id for the '<em><b>Act</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON__ACT = SENSORES__ACT;

	/**
	 * The feature id for the '<em><b>Med</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON__MED = SENSORES__MED;

	/**
	 * The number of structural features of the '<em>Boton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_FEATURE_COUNT = SENSORES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOTON_OPERATION_COUNT = SENSORES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduino.impl.PIRImpl <em>PIR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduino.impl.PIRImpl
	 * @see arduino.impl.ArduinoPackageImpl#getPIR()
	 * @generated
	 */
	int PIR = 16;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIR__PIN = SENSORES__PIN;

	/**
	 * The feature id for the '<em><b>Act</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIR__ACT = SENSORES__ACT;

	/**
	 * The feature id for the '<em><b>Med</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIR__MED = SENSORES__MED;

	/**
	 * The number of structural features of the '<em>PIR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIR_FEATURE_COUNT = SENSORES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PIR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIR_OPERATION_COUNT = SENSORES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduino.impl.BuzzerImpl <em>Buzzer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduino.impl.BuzzerImpl
	 * @see arduino.impl.ArduinoPackageImpl#getBuzzer()
	 * @generated
	 */
	int BUZZER = 17;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER__PIN = ACTUADORES__PIN;

	/**
	 * The feature id for the '<em><b>Actuadorinstruccion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER__ACTUADORINSTRUCCION = ACTUADORES__ACTUADORINSTRUCCION;

	/**
	 * The number of structural features of the '<em>Buzzer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER_FEATURE_COUNT = ACTUADORES_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Buzzer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER_OPERATION_COUNT = ACTUADORES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduino.impl.ServoImpl <em>Servo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduino.impl.ServoImpl
	 * @see arduino.impl.ArduinoPackageImpl#getServo()
	 * @generated
	 */
	int SERVO = 18;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVO__PIN = ACTUADORES__PIN;

	/**
	 * The feature id for the '<em><b>Actuadorinstruccion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVO__ACTUADORINSTRUCCION = ACTUADORES__ACTUADORINSTRUCCION;

	/**
	 * The feature id for the '<em><b>Angulo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVO__ANGULO = ACTUADORES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Libreria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVO__LIBRERIA = ACTUADORES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Servo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVO_FEATURE_COUNT = ACTUADORES_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Servo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVO_OPERATION_COUNT = ACTUADORES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduino.operandos <em>operandos</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduino.operandos
	 * @see arduino.impl.ArduinoPackageImpl#getoperandos()
	 * @generated
	 */
	int OPERANDOS = 19;

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
	 * Returns the meta object for the containment reference list '{@link arduino.Sketch#getInstrucciones <em>Instrucciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instrucciones</em>'.
	 * @see arduino.Sketch#getInstrucciones()
	 * @see #getSketch()
	 * @generated
	 */
	EReference getSketch_Instrucciones();

	/**
	 * Returns the meta object for the containment reference list '{@link arduino.Sketch#getBloques <em>Bloques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bloques</em>'.
	 * @see arduino.Sketch#getBloques()
	 * @see #getSketch()
	 * @generated
	 */
	EReference getSketch_Bloques();

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
	 * Returns the meta object for the reference '{@link arduino.Actuadores#getActuadorinstruccion <em>Actuadorinstruccion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actuadorinstruccion</em>'.
	 * @see arduino.Actuadores#getActuadorinstruccion()
	 * @see #getActuadores()
	 * @generated
	 */
	EReference getActuadores_Actuadorinstruccion();

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
	 * Returns the meta object for the reference '{@link arduino.Apagar#getEsperar1 <em>Esperar1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Esperar1</em>'.
	 * @see arduino.Apagar#getEsperar1()
	 * @see #getApagar()
	 * @generated
	 */
	EReference getApagar_Esperar1();

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
	 * Returns the meta object for the reference '{@link arduino.Variar#getDatos <em>Datos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datos</em>'.
	 * @see arduino.Variar#getDatos()
	 * @see #getVariar()
	 * @generated
	 */
	EReference getVariar_Datos();

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
	 * Returns the meta object for the attribute '{@link arduino.Esperar#getMiliseg <em>Miliseg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Miliseg</em>'.
	 * @see arduino.Esperar#getMiliseg()
	 * @see #getEsperar()
	 * @generated
	 */
	EAttribute getEsperar_Miliseg();

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
	 * Returns the meta object for the reference '{@link arduino.Esperar#getEncender <em>Encender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Encender</em>'.
	 * @see arduino.Esperar#getEncender()
	 * @see #getEsperar()
	 * @generated
	 */
	EReference getEsperar_Encender();

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
	 * Returns the meta object for class '{@link arduino.Bloques <em>Bloques</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bloques</em>'.
	 * @see arduino.Bloques
	 * @generated
	 */
	EClass getBloques();

	/**
	 * Returns the meta object for the containment reference list '{@link arduino.Bloques#getBloq <em>Bloq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bloq</em>'.
	 * @see arduino.Bloques#getBloq()
	 * @see #getBloques()
	 * @generated
	 */
	EReference getBloques_Bloq();

	/**
	 * Returns the meta object for the containment reference list '{@link arduino.Bloques#getBactuadores <em>Bactuadores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bactuadores</em>'.
	 * @see arduino.Bloques#getBactuadores()
	 * @see #getBloques()
	 * @generated
	 */
	EReference getBloques_Bactuadores();

	/**
	 * Returns the meta object for the containment reference list '{@link arduino.Bloques#getBinstrucciones <em>Binstrucciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binstrucciones</em>'.
	 * @see arduino.Bloques#getBinstrucciones()
	 * @see #getBloques()
	 * @generated
	 */
	EReference getBloques_Binstrucciones();

	/**
	 * Returns the meta object for the reference '{@link arduino.Bloques#getBsensores <em>Bsensores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bsensores</em>'.
	 * @see arduino.Bloques#getBsensores()
	 * @see #getBloques()
	 * @generated
	 */
	EReference getBloques_Bsensores();

	/**
	 * Returns the meta object for the reference '{@link arduino.Bloques#getBloacts <em>Bloacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bloacts</em>'.
	 * @see arduino.Bloques#getBloacts()
	 * @see #getBloques()
	 * @generated
	 */
	EReference getBloques_Bloacts();

	/**
	 * Returns the meta object for class '{@link arduino.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If</em>'.
	 * @see arduino.If
	 * @generated
	 */
	EClass getIf();

	/**
	 * Returns the meta object for the attribute '{@link arduino.If#getOperando <em>Operando</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operando</em>'.
	 * @see arduino.If#getOperando()
	 * @see #getIf()
	 * @generated
	 */
	EAttribute getIf_Operando();

	/**
	 * Returns the meta object for the attribute '{@link arduino.If#getReferencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referencia</em>'.
	 * @see arduino.If#getReferencia()
	 * @see #getIf()
	 * @generated
	 */
	EAttribute getIf_Referencia();

	/**
	 * Returns the meta object for the attribute '{@link arduino.If#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see arduino.If#getValor()
	 * @see #getIf()
	 * @generated
	 */
	EAttribute getIf_Valor();

	/**
	 * Returns the meta object for class '{@link arduino.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While</em>'.
	 * @see arduino.While
	 * @generated
	 */
	EClass getWhile();

	/**
	 * Returns the meta object for the attribute '{@link arduino.While#getOperando <em>Operando</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operando</em>'.
	 * @see arduino.While#getOperando()
	 * @see #getWhile()
	 * @generated
	 */
	EAttribute getWhile_Operando();

	/**
	 * Returns the meta object for the attribute '{@link arduino.While#getReferencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referencia</em>'.
	 * @see arduino.While#getReferencia()
	 * @see #getWhile()
	 * @generated
	 */
	EAttribute getWhile_Referencia();

	/**
	 * Returns the meta object for the attribute '{@link arduino.While#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see arduino.While#getValor()
	 * @see #getWhile()
	 * @generated
	 */
	EAttribute getWhile_Valor();

	/**
	 * Returns the meta object for class '{@link arduino.Temperatura <em>Temperatura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temperatura</em>'.
	 * @see arduino.Temperatura
	 * @generated
	 */
	EClass getTemperatura();

	/**
	 * Returns the meta object for the attribute '{@link arduino.Temperatura#getTemperatura <em>Temperatura</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperatura</em>'.
	 * @see arduino.Temperatura#getTemperatura()
	 * @see #getTemperatura()
	 * @generated
	 */
	EAttribute getTemperatura_Temperatura();

	/**
	 * Returns the meta object for class '{@link arduino.Potenciometro <em>Potenciometro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Potenciometro</em>'.
	 * @see arduino.Potenciometro
	 * @generated
	 */
	EClass getPotenciometro();

	/**
	 * Returns the meta object for class '{@link arduino.Boton <em>Boton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boton</em>'.
	 * @see arduino.Boton
	 * @generated
	 */
	EClass getBoton();

	/**
	 * Returns the meta object for class '{@link arduino.PIR <em>PIR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PIR</em>'.
	 * @see arduino.PIR
	 * @generated
	 */
	EClass getPIR();

	/**
	 * Returns the meta object for class '{@link arduino.Buzzer <em>Buzzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buzzer</em>'.
	 * @see arduino.Buzzer
	 * @generated
	 */
	EClass getBuzzer();

	/**
	 * Returns the meta object for class '{@link arduino.Servo <em>Servo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Servo</em>'.
	 * @see arduino.Servo
	 * @generated
	 */
	EClass getServo();

	/**
	 * Returns the meta object for the attribute '{@link arduino.Servo#getAngulo <em>Angulo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angulo</em>'.
	 * @see arduino.Servo#getAngulo()
	 * @see #getServo()
	 * @generated
	 */
	EAttribute getServo_Angulo();

	/**
	 * Returns the meta object for the attribute '{@link arduino.Servo#getLibreria <em>Libreria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Libreria</em>'.
	 * @see arduino.Servo#getLibreria()
	 * @see #getServo()
	 * @generated
	 */
	EAttribute getServo_Libreria();

	/**
	 * Returns the meta object for enum '{@link arduino.operandos <em>operandos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>operandos</em>'.
	 * @see arduino.operandos
	 * @generated
	 */
	EEnum getoperandos();

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
		 * The meta object literal for the '<em><b>Instrucciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKETCH__INSTRUCCIONES = eINSTANCE.getSketch_Instrucciones();

		/**
		 * The meta object literal for the '<em><b>Bloques</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SKETCH__BLOQUES = eINSTANCE.getSketch_Bloques();

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
		 * The meta object literal for the '<em><b>Pin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUADORES__PIN = eINSTANCE.getActuadores_Pin();

		/**
		 * The meta object literal for the '<em><b>Actuadorinstruccion</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUADORES__ACTUADORINSTRUCCION = eINSTANCE.getActuadores_Actuadorinstruccion();

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
		 * The meta object literal for the '<em><b>Esperar1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APAGAR__ESPERAR1 = eINSTANCE.getApagar_Esperar1();

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
		 * The meta object literal for the '<em><b>Datos</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIAR__DATOS = eINSTANCE.getVariar_Datos();

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
		 * The meta object literal for the '<em><b>Miliseg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESPERAR__MILISEG = eINSTANCE.getEsperar_Miliseg();

		/**
		 * The meta object literal for the '<em><b>Apagar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESPERAR__APAGAR = eINSTANCE.getEsperar_Apagar();

		/**
		 * The meta object literal for the '<em><b>Encender</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESPERAR__ENCENDER = eINSTANCE.getEsperar_Encender();

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
		 * The meta object literal for the '<em><b>Esperar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENCENDER__ESPERAR = eINSTANCE.getEncender_Esperar();

		/**
		 * The meta object literal for the '{@link arduino.impl.BloquesImpl <em>Bloques</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduino.impl.BloquesImpl
		 * @see arduino.impl.ArduinoPackageImpl#getBloques()
		 * @generated
		 */
		EClass BLOQUES = eINSTANCE.getBloques();

		/**
		 * The meta object literal for the '<em><b>Bloq</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOQUES__BLOQ = eINSTANCE.getBloques_Bloq();

		/**
		 * The meta object literal for the '<em><b>Bactuadores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOQUES__BACTUADORES = eINSTANCE.getBloques_Bactuadores();

		/**
		 * The meta object literal for the '<em><b>Binstrucciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOQUES__BINSTRUCCIONES = eINSTANCE.getBloques_Binstrucciones();

		/**
		 * The meta object literal for the '<em><b>Bsensores</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOQUES__BSENSORES = eINSTANCE.getBloques_Bsensores();

		/**
		 * The meta object literal for the '<em><b>Bloacts</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOQUES__BLOACTS = eINSTANCE.getBloques_Bloacts();

		/**
		 * The meta object literal for the '{@link arduino.impl.IfImpl <em>If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduino.impl.IfImpl
		 * @see arduino.impl.ArduinoPackageImpl#getIf()
		 * @generated
		 */
		EClass IF = eINSTANCE.getIf();

		/**
		 * The meta object literal for the '<em><b>Operando</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF__OPERANDO = eINSTANCE.getIf_Operando();

		/**
		 * The meta object literal for the '<em><b>Referencia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF__REFERENCIA = eINSTANCE.getIf_Referencia();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IF__VALOR = eINSTANCE.getIf_Valor();

		/**
		 * The meta object literal for the '{@link arduino.impl.WhileImpl <em>While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduino.impl.WhileImpl
		 * @see arduino.impl.ArduinoPackageImpl#getWhile()
		 * @generated
		 */
		EClass WHILE = eINSTANCE.getWhile();

		/**
		 * The meta object literal for the '<em><b>Operando</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHILE__OPERANDO = eINSTANCE.getWhile_Operando();

		/**
		 * The meta object literal for the '<em><b>Referencia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHILE__REFERENCIA = eINSTANCE.getWhile_Referencia();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHILE__VALOR = eINSTANCE.getWhile_Valor();

		/**
		 * The meta object literal for the '{@link arduino.impl.TemperaturaImpl <em>Temperatura</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduino.impl.TemperaturaImpl
		 * @see arduino.impl.ArduinoPackageImpl#getTemperatura()
		 * @generated
		 */
		EClass TEMPERATURA = eINSTANCE.getTemperatura();

		/**
		 * The meta object literal for the '<em><b>Temperatura</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPERATURA__TEMPERATURA = eINSTANCE.getTemperatura_Temperatura();

		/**
		 * The meta object literal for the '{@link arduino.impl.PotenciometroImpl <em>Potenciometro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduino.impl.PotenciometroImpl
		 * @see arduino.impl.ArduinoPackageImpl#getPotenciometro()
		 * @generated
		 */
		EClass POTENCIOMETRO = eINSTANCE.getPotenciometro();

		/**
		 * The meta object literal for the '{@link arduino.impl.BotonImpl <em>Boton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduino.impl.BotonImpl
		 * @see arduino.impl.ArduinoPackageImpl#getBoton()
		 * @generated
		 */
		EClass BOTON = eINSTANCE.getBoton();

		/**
		 * The meta object literal for the '{@link arduino.impl.PIRImpl <em>PIR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduino.impl.PIRImpl
		 * @see arduino.impl.ArduinoPackageImpl#getPIR()
		 * @generated
		 */
		EClass PIR = eINSTANCE.getPIR();

		/**
		 * The meta object literal for the '{@link arduino.impl.BuzzerImpl <em>Buzzer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduino.impl.BuzzerImpl
		 * @see arduino.impl.ArduinoPackageImpl#getBuzzer()
		 * @generated
		 */
		EClass BUZZER = eINSTANCE.getBuzzer();

		/**
		 * The meta object literal for the '{@link arduino.impl.ServoImpl <em>Servo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduino.impl.ServoImpl
		 * @see arduino.impl.ArduinoPackageImpl#getServo()
		 * @generated
		 */
		EClass SERVO = eINSTANCE.getServo();

		/**
		 * The meta object literal for the '<em><b>Angulo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVO__ANGULO = eINSTANCE.getServo_Angulo();

		/**
		 * The meta object literal for the '<em><b>Libreria</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVO__LIBRERIA = eINSTANCE.getServo_Libreria();

		/**
		 * The meta object literal for the '{@link arduino.operandos <em>operandos</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduino.operandos
		 * @see arduino.impl.ArduinoPackageImpl#getoperandos()
		 * @generated
		 */
		EEnum OPERANDOS = eINSTANCE.getoperandos();

	}

} //ArduinoPackage
