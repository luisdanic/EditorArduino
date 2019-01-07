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
	 * The feature id for the '<em><b>Instruccionactuador</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUADORES__INSTRUCCIONACTUADOR = 1;

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
	 * The feature id for the '<em><b>Instruccionactuador</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED__INSTRUCCIONACTUADOR = ACTUADORES__INSTRUCCIONACTUADOR;

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
	 * The number of structural features of the '<em>Apagar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APAGAR_FEATURE_COUNT = INSTRUCCIONES_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Bsensores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOQUES__BSENSORES = 2;

	/**
	 * The feature id for the '<em><b>Binstrucciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOQUES__BINSTRUCCIONES = 3;

	/**
	 * The number of structural features of the '<em>Bloques</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOQUES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bloques</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOQUES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link arduino.impl.DoWhileImpl <em>Do While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduino.impl.DoWhileImpl
	 * @see arduino.impl.ArduinoPackageImpl#getDoWhile()
	 * @generated
	 */
	int DO_WHILE = 11;

	/**
	 * The feature id for the '<em><b>Bloq</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE__BLOQ = BLOQUES__BLOQ;

	/**
	 * The feature id for the '<em><b>Bactuadores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE__BACTUADORES = BLOQUES__BACTUADORES;

	/**
	 * The feature id for the '<em><b>Bsensores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE__BSENSORES = BLOQUES__BSENSORES;

	/**
	 * The feature id for the '<em><b>Binstrucciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE__BINSTRUCCIONES = BLOQUES__BINSTRUCCIONES;

	/**
	 * The feature id for the '<em><b>Operando</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE__OPERANDO = BLOQUES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referencia</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE__REFERENCIA = BLOQUES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE__VALOR = BLOQUES_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Do While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_FEATURE_COUNT = BLOQUES_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Do While</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DO_WHILE_OPERATION_COUNT = BLOQUES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduino.impl.IfImpl <em>If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduino.impl.IfImpl
	 * @see arduino.impl.ArduinoPackageImpl#getIf()
	 * @generated
	 */
	int IF = 12;

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
	 * The feature id for the '<em><b>Bsensores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__BSENSORES = BLOQUES__BSENSORES;

	/**
	 * The feature id for the '<em><b>Binstrucciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF__BINSTRUCCIONES = BLOQUES__BINSTRUCCIONES;

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
	 * The meta object id for the '{@link arduino.impl.ForImpl <em>For</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduino.impl.ForImpl
	 * @see arduino.impl.ArduinoPackageImpl#getFor()
	 * @generated
	 */
	int FOR = 13;

	/**
	 * The feature id for the '<em><b>Bloq</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__BLOQ = BLOQUES__BLOQ;

	/**
	 * The feature id for the '<em><b>Bactuadores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__BACTUADORES = BLOQUES__BACTUADORES;

	/**
	 * The feature id for the '<em><b>Bsensores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__BSENSORES = BLOQUES__BSENSORES;

	/**
	 * The feature id for the '<em><b>Binstrucciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__BINSTRUCCIONES = BLOQUES__BINSTRUCCIONES;

	/**
	 * The feature id for the '<em><b>Iterador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__ITERADOR = BLOQUES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valor Inicial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__VALOR_INICIAL = BLOQUES_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valor Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__VALOR_FINAL = BLOQUES_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Valor Accion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__VALOR_ACCION = BLOQUES_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Accion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR__ACCION = BLOQUES_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>For</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_FEATURE_COUNT = BLOQUES_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>For</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_OPERATION_COUNT = BLOQUES_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link arduino.impl.WhileImpl <em>While</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduino.impl.WhileImpl
	 * @see arduino.impl.ArduinoPackageImpl#getWhile()
	 * @generated
	 */
	int WHILE = 14;

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
	 * The feature id for the '<em><b>Bsensores</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__BSENSORES = BLOQUES__BSENSORES;

	/**
	 * The feature id for the '<em><b>Binstrucciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE__BINSTRUCCIONES = BLOQUES__BINSTRUCCIONES;

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
	 * The meta object id for the '{@link arduino.operandos <em>operandos</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduino.operandos
	 * @see arduino.impl.ArduinoPackageImpl#getoperandos()
	 * @generated
	 */
	int OPERANDOS = 15;

	/**
	 * The meta object id for the '{@link arduino.forAccion <em>for Accion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see arduino.forAccion
	 * @see arduino.impl.ArduinoPackageImpl#getforAccion()
	 * @generated
	 */
	int FOR_ACCION = 16;

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
	 * Returns the meta object for the reference '{@link arduino.Actuadores#getInstruccionactuador <em>Instruccionactuador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instruccionactuador</em>'.
	 * @see arduino.Actuadores#getInstruccionactuador()
	 * @see #getActuadores()
	 * @generated
	 */
	EReference getActuadores_Instruccionactuador();

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
	 * Returns the meta object for the containment reference list '{@link arduino.Bloques#getBsensores <em>Bsensores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bsensores</em>'.
	 * @see arduino.Bloques#getBsensores()
	 * @see #getBloques()
	 * @generated
	 */
	EReference getBloques_Bsensores();

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
	 * Returns the meta object for class '{@link arduino.DoWhile <em>Do While</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Do While</em>'.
	 * @see arduino.DoWhile
	 * @generated
	 */
	EClass getDoWhile();

	/**
	 * Returns the meta object for the attribute '{@link arduino.DoWhile#getOperando <em>Operando</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operando</em>'.
	 * @see arduino.DoWhile#getOperando()
	 * @see #getDoWhile()
	 * @generated
	 */
	EAttribute getDoWhile_Operando();

	/**
	 * Returns the meta object for the attribute '{@link arduino.DoWhile#getReferencia <em>Referencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referencia</em>'.
	 * @see arduino.DoWhile#getReferencia()
	 * @see #getDoWhile()
	 * @generated
	 */
	EAttribute getDoWhile_Referencia();

	/**
	 * Returns the meta object for the attribute '{@link arduino.DoWhile#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see arduino.DoWhile#getValor()
	 * @see #getDoWhile()
	 * @generated
	 */
	EAttribute getDoWhile_Valor();

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
	 * Returns the meta object for class '{@link arduino.For <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For</em>'.
	 * @see arduino.For
	 * @generated
	 */
	EClass getFor();

	/**
	 * Returns the meta object for the attribute '{@link arduino.For#getIterador <em>Iterador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iterador</em>'.
	 * @see arduino.For#getIterador()
	 * @see #getFor()
	 * @generated
	 */
	EAttribute getFor_Iterador();

	/**
	 * Returns the meta object for the attribute '{@link arduino.For#getValorInicial <em>Valor Inicial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Inicial</em>'.
	 * @see arduino.For#getValorInicial()
	 * @see #getFor()
	 * @generated
	 */
	EAttribute getFor_ValorInicial();

	/**
	 * Returns the meta object for the attribute '{@link arduino.For#getValorFinal <em>Valor Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Final</em>'.
	 * @see arduino.For#getValorFinal()
	 * @see #getFor()
	 * @generated
	 */
	EAttribute getFor_ValorFinal();

	/**
	 * Returns the meta object for the attribute '{@link arduino.For#getValorAccion <em>Valor Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor Accion</em>'.
	 * @see arduino.For#getValorAccion()
	 * @see #getFor()
	 * @generated
	 */
	EAttribute getFor_ValorAccion();

	/**
	 * Returns the meta object for the attribute '{@link arduino.For#getAccion <em>Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accion</em>'.
	 * @see arduino.For#getAccion()
	 * @see #getFor()
	 * @generated
	 */
	EAttribute getFor_Accion();

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
	 * Returns the meta object for enum '{@link arduino.operandos <em>operandos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>operandos</em>'.
	 * @see arduino.operandos
	 * @generated
	 */
	EEnum getoperandos();

	/**
	 * Returns the meta object for enum '{@link arduino.forAccion <em>for Accion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>for Accion</em>'.
	 * @see arduino.forAccion
	 * @generated
	 */
	EEnum getforAccion();

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
		 * The meta object literal for the '<em><b>Instruccionactuador</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUADORES__INSTRUCCIONACTUADOR = eINSTANCE.getActuadores_Instruccionactuador();

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
		 * The meta object literal for the '<em><b>Bsensores</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOQUES__BSENSORES = eINSTANCE.getBloques_Bsensores();

		/**
		 * The meta object literal for the '<em><b>Binstrucciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOQUES__BINSTRUCCIONES = eINSTANCE.getBloques_Binstrucciones();

		/**
		 * The meta object literal for the '{@link arduino.impl.DoWhileImpl <em>Do While</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduino.impl.DoWhileImpl
		 * @see arduino.impl.ArduinoPackageImpl#getDoWhile()
		 * @generated
		 */
		EClass DO_WHILE = eINSTANCE.getDoWhile();

		/**
		 * The meta object literal for the '<em><b>Operando</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DO_WHILE__OPERANDO = eINSTANCE.getDoWhile_Operando();

		/**
		 * The meta object literal for the '<em><b>Referencia</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DO_WHILE__REFERENCIA = eINSTANCE.getDoWhile_Referencia();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DO_WHILE__VALOR = eINSTANCE.getDoWhile_Valor();

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
		 * The meta object literal for the '{@link arduino.impl.ForImpl <em>For</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduino.impl.ForImpl
		 * @see arduino.impl.ArduinoPackageImpl#getFor()
		 * @generated
		 */
		EClass FOR = eINSTANCE.getFor();

		/**
		 * The meta object literal for the '<em><b>Iterador</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR__ITERADOR = eINSTANCE.getFor_Iterador();

		/**
		 * The meta object literal for the '<em><b>Valor Inicial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR__VALOR_INICIAL = eINSTANCE.getFor_ValorInicial();

		/**
		 * The meta object literal for the '<em><b>Valor Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR__VALOR_FINAL = eINSTANCE.getFor_ValorFinal();

		/**
		 * The meta object literal for the '<em><b>Valor Accion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR__VALOR_ACCION = eINSTANCE.getFor_ValorAccion();

		/**
		 * The meta object literal for the '<em><b>Accion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR__ACCION = eINSTANCE.getFor_Accion();

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
		 * The meta object literal for the '{@link arduino.operandos <em>operandos</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduino.operandos
		 * @see arduino.impl.ArduinoPackageImpl#getoperandos()
		 * @generated
		 */
		EEnum OPERANDOS = eINSTANCE.getoperandos();

		/**
		 * The meta object literal for the '{@link arduino.forAccion <em>for Accion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see arduino.forAccion
		 * @see arduino.impl.ArduinoPackageImpl#getforAccion()
		 * @generated
		 */
		EEnum FOR_ACCION = eINSTANCE.getforAccion();

	}

} //ArduinoPackage
