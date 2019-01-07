/**
 */
package arduino.impl;

import arduino.Actuadores;
import arduino.Apagar;
import arduino.ArduinoFactory;
import arduino.ArduinoPackage;
import arduino.Bloques;
import arduino.DoWhile;
import arduino.Encender;
import arduino.Esperar;
import arduino.For;
import arduino.If;
import arduino.Instrucciones;
import arduino.Led;
import arduino.Sensores;
import arduino.Sketch;
import arduino.Variar;

import arduino.While;
import arduino.forAccion;
import arduino.operandos;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArduinoPackageImpl extends EPackageImpl implements ArduinoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sketchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuadoresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensoresEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ledEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ldrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instruccionesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apagarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass esperarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encenderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bloquesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doWhileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operandosEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum forAccionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see arduino.ArduinoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ArduinoPackageImpl() {
		super(eNS_URI, ArduinoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ArduinoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ArduinoPackage init() {
		if (isInited)
			return (ArduinoPackage) EPackage.Registry.INSTANCE.getEPackage(ArduinoPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredArduinoPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ArduinoPackageImpl theArduinoPackage = registeredArduinoPackage instanceof ArduinoPackageImpl
				? (ArduinoPackageImpl) registeredArduinoPackage
				: new ArduinoPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theArduinoPackage.createPackageContents();

		// Initialize created meta-data
		theArduinoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArduinoPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ArduinoPackage.eNS_URI, theArduinoPackage);
		return theArduinoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSketch() {
		return sketchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSketch_Nombre() {
		return (EAttribute) sketchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSketch_Sensores() {
		return (EReference) sketchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSketch_Actuadores() {
		return (EReference) sketchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSketch_Instrucciones() {
		return (EReference) sketchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSketch_Bloques() {
		return (EReference) sketchEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuadores() {
		return actuadoresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActuadores_Pin() {
		return (EAttribute) actuadoresEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActuadores_Instruccionactuador() {
		return (EReference) actuadoresEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensores() {
		return sensoresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensores_Med() {
		return (EAttribute) sensoresEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensores_Pin() {
		return (EAttribute) sensoresEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSensores_Act() {
		return (EReference) sensoresEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLed() {
		return ledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLDR() {
		return ldrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstrucciones() {
		return instruccionesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApagar() {
		return apagarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariar() {
		return variarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariar_Pwm() {
		return (EAttribute) variarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariar_Datos() {
		return (EReference) variarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEsperar() {
		return esperarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEsperar_Miliseg() {
		return (EAttribute) esperarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEsperar_Apagar() {
		return (EReference) esperarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncender() {
		return encenderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncender_Esperar() {
		return (EReference) encenderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBloques() {
		return bloquesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBloques_Bloq() {
		return (EReference) bloquesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBloques_Bactuadores() {
		return (EReference) bloquesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBloques_Bsensores() {
		return (EReference) bloquesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBloques_Binstrucciones() {
		return (EReference) bloquesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoWhile() {
		return doWhileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoWhile_Operando() {
		return (EAttribute) doWhileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoWhile_Referencia() {
		return (EAttribute) doWhileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoWhile_Valor() {
		return (EAttribute) doWhileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIf() {
		return ifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIf_Operando() {
		return (EAttribute) ifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIf_Referencia() {
		return (EAttribute) ifEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIf_Valor() {
		return (EAttribute) ifEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFor() {
		return forEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFor_Iterador() {
		return (EAttribute) forEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFor_ValorInicial() {
		return (EAttribute) forEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFor_ValorFinal() {
		return (EAttribute) forEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFor_ValorAccion() {
		return (EAttribute) forEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFor_Accion() {
		return (EAttribute) forEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhile() {
		return whileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhile_Operando() {
		return (EAttribute) whileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhile_Referencia() {
		return (EAttribute) whileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhile_Valor() {
		return (EAttribute) whileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getoperandos() {
		return operandosEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getforAccion() {
		return forAccionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoFactory getArduinoFactory() {
		return (ArduinoFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		sketchEClass = createEClass(SKETCH);
		createEAttribute(sketchEClass, SKETCH__NOMBRE);
		createEReference(sketchEClass, SKETCH__SENSORES);
		createEReference(sketchEClass, SKETCH__ACTUADORES);
		createEReference(sketchEClass, SKETCH__INSTRUCCIONES);
		createEReference(sketchEClass, SKETCH__BLOQUES);

		actuadoresEClass = createEClass(ACTUADORES);
		createEAttribute(actuadoresEClass, ACTUADORES__PIN);
		createEReference(actuadoresEClass, ACTUADORES__INSTRUCCIONACTUADOR);

		sensoresEClass = createEClass(SENSORES);
		createEAttribute(sensoresEClass, SENSORES__PIN);
		createEReference(sensoresEClass, SENSORES__ACT);
		createEAttribute(sensoresEClass, SENSORES__MED);

		ledEClass = createEClass(LED);

		ldrEClass = createEClass(LDR);

		instruccionesEClass = createEClass(INSTRUCCIONES);

		apagarEClass = createEClass(APAGAR);

		variarEClass = createEClass(VARIAR);
		createEAttribute(variarEClass, VARIAR__PWM);
		createEReference(variarEClass, VARIAR__DATOS);

		esperarEClass = createEClass(ESPERAR);
		createEAttribute(esperarEClass, ESPERAR__MILISEG);
		createEReference(esperarEClass, ESPERAR__APAGAR);

		encenderEClass = createEClass(ENCENDER);
		createEReference(encenderEClass, ENCENDER__ESPERAR);

		bloquesEClass = createEClass(BLOQUES);
		createEReference(bloquesEClass, BLOQUES__BLOQ);
		createEReference(bloquesEClass, BLOQUES__BACTUADORES);
		createEReference(bloquesEClass, BLOQUES__BSENSORES);
		createEReference(bloquesEClass, BLOQUES__BINSTRUCCIONES);

		doWhileEClass = createEClass(DO_WHILE);
		createEAttribute(doWhileEClass, DO_WHILE__OPERANDO);
		createEAttribute(doWhileEClass, DO_WHILE__REFERENCIA);
		createEAttribute(doWhileEClass, DO_WHILE__VALOR);

		ifEClass = createEClass(IF);
		createEAttribute(ifEClass, IF__OPERANDO);
		createEAttribute(ifEClass, IF__REFERENCIA);
		createEAttribute(ifEClass, IF__VALOR);

		forEClass = createEClass(FOR);
		createEAttribute(forEClass, FOR__ITERADOR);
		createEAttribute(forEClass, FOR__VALOR_INICIAL);
		createEAttribute(forEClass, FOR__VALOR_FINAL);
		createEAttribute(forEClass, FOR__VALOR_ACCION);
		createEAttribute(forEClass, FOR__ACCION);

		whileEClass = createEClass(WHILE);
		createEAttribute(whileEClass, WHILE__OPERANDO);
		createEAttribute(whileEClass, WHILE__REFERENCIA);
		createEAttribute(whileEClass, WHILE__VALOR);

		// Create enums
		operandosEEnum = createEEnum(OPERANDOS);
		forAccionEEnum = createEEnum(FOR_ACCION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ledEClass.getESuperTypes().add(this.getActuadores());
		ldrEClass.getESuperTypes().add(this.getSensores());
		apagarEClass.getESuperTypes().add(this.getInstrucciones());
		variarEClass.getESuperTypes().add(this.getInstrucciones());
		esperarEClass.getESuperTypes().add(this.getInstrucciones());
		encenderEClass.getESuperTypes().add(this.getInstrucciones());
		doWhileEClass.getESuperTypes().add(this.getBloques());
		ifEClass.getESuperTypes().add(this.getBloques());
		forEClass.getESuperTypes().add(this.getBloques());
		whileEClass.getESuperTypes().add(this.getBloques());

		// Initialize classes, features, and operations; add parameters
		initEClass(sketchEClass, Sketch.class, "Sketch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSketch_Nombre(), ecorePackage.getEString(), "Nombre", null, 0, 1, Sketch.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSketch_Sensores(), this.getSensores(), null, "sensores", null, 0, -1, Sketch.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSketch_Actuadores(), this.getActuadores(), null, "actuadores", null, 0, -1, Sketch.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSketch_Instrucciones(), this.getInstrucciones(), null, "instrucciones", null, 0, -1,
				Sketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSketch_Bloques(), this.getBloques(), null, "bloques", null, 0, -1, Sketch.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actuadoresEClass, Actuadores.class, "Actuadores", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActuadores_Pin(), theXMLTypePackage.getInt(), "pin", null, 0, 1, Actuadores.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActuadores_Instruccionactuador(), this.getInstrucciones(), null, "instruccionactuador", null,
				0, 1, Actuadores.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensoresEClass, Sensores.class, "Sensores", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensores_Pin(), theXMLTypePackage.getInt(), "pin", null, 0, 1, Sensores.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSensores_Act(), this.getActuadores(), null, "act", null, 0, 12, Sensores.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSensores_Med(), theXMLTypePackage.getInt(), "med", null, 0, 1, Sensores.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ledEClass, Led.class, "Led", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ldrEClass, arduino.LDR.class, "LDR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(instruccionesEClass, Instrucciones.class, "Instrucciones", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(apagarEClass, Apagar.class, "Apagar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variarEClass, Variar.class, "Variar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariar_Pwm(), theXMLTypePackage.getInt(), "pwm", null, 0, 1, Variar.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariar_Datos(), this.getSensores(), null, "datos", null, 0, 1, Variar.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(esperarEClass, Esperar.class, "Esperar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEsperar_Miliseg(), theXMLTypePackage.getInt(), "miliseg", null, 0, 1, Esperar.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEsperar_Apagar(), this.getApagar(), null, "apagar", null, 0, 1, Esperar.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(encenderEClass, Encender.class, "Encender", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEncender_Esperar(), this.getEsperar(), null, "esperar", null, 0, 1, Encender.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bloquesEClass, Bloques.class, "Bloques", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBloques_Bloq(), this.getBloques(), null, "bloq", null, 0, -1, Bloques.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getBloques_Bactuadores(), this.getActuadores(), null, "bactuadores", null, 0, -1, Bloques.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBloques_Bsensores(), this.getSensores(), null, "bsensores", null, 0, -1, Bloques.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBloques_Binstrucciones(), this.getInstrucciones(), null, "binstrucciones", null, 0, -1,
				Bloques.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doWhileEClass, DoWhile.class, "DoWhile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoWhile_Operando(), this.getoperandos(), "operando", null, 0, 1, DoWhile.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoWhile_Referencia(), theXMLTypePackage.getString(), "referencia", null, 0, 1, DoWhile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoWhile_Valor(), theXMLTypePackage.getString(), "valor", null, 0, 1, DoWhile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifEClass, If.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIf_Operando(), this.getoperandos(), "operando", null, 0, 1, If.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIf_Referencia(), theXMLTypePackage.getString(), "referencia", null, 0, 1, If.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIf_Valor(), theXMLTypePackage.getString(), "valor", null, 0, 1, If.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forEClass, For.class, "For", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFor_Iterador(), theXMLTypePackage.getString(), "iterador", null, 0, 1, For.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFor_ValorInicial(), theXMLTypePackage.getInt(), "valorInicial", null, 0, 1, For.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFor_ValorFinal(), theXMLTypePackage.getInt(), "valorFinal", null, 0, 1, For.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFor_ValorAccion(), theXMLTypePackage.getInt(), "valorAccion", null, 0, 1, For.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFor_Accion(), this.getforAccion(), "accion", null, 0, 1, For.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileEClass, While.class, "While", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhile_Operando(), this.getoperandos(), "operando", null, 0, 1, While.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWhile_Referencia(), theXMLTypePackage.getString(), "referencia", null, 0, 1, While.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWhile_Valor(), theXMLTypePackage.getString(), "valor", null, 0, 1, While.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(operandosEEnum, operandos.class, "operandos");
		addEEnumLiteral(operandosEEnum, operandos.MENOR);
		addEEnumLiteral(operandosEEnum, operandos.MAYOR);
		addEEnumLiteral(operandosEEnum, operandos.MENORIGUAL);
		addEEnumLiteral(operandosEEnum, operandos.MAYORIGUAL);
		addEEnumLiteral(operandosEEnum, operandos.IGUAL);
		addEEnumLiteral(operandosEEnum, operandos.DIFERENTE);

		initEEnum(forAccionEEnum, forAccion.class, "forAccion");
		addEEnumLiteral(forAccionEEnum, forAccion.INCREMENTO);
		addEEnumLiteral(forAccionEEnum, forAccion.DECREMENTO);

		// Create resource
		createResource(eNS_URI);
	}

} //ArduinoPackageImpl
