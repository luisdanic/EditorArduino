/**
 */
package arduino.util;

import arduino.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see arduino.ArduinoPackage
 * @generated
 */
public class ArduinoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ArduinoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArduinoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ArduinoPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArduinoSwitch<Adapter> modelSwitch = new ArduinoSwitch<Adapter>() {
		@Override
		public Adapter caseSketch(Sketch object) {
			return createSketchAdapter();
		}

		@Override
		public Adapter caseActuadores(Actuadores object) {
			return createActuadoresAdapter();
		}

		@Override
		public Adapter caseSensores(Sensores object) {
			return createSensoresAdapter();
		}

		@Override
		public Adapter caseLed(Led object) {
			return createLedAdapter();
		}

		@Override
		public Adapter caseLDR(LDR object) {
			return createLDRAdapter();
		}

		@Override
		public Adapter caseInstrucciones(Instrucciones object) {
			return createInstruccionesAdapter();
		}

		@Override
		public Adapter caseApagar(Apagar object) {
			return createApagarAdapter();
		}

		@Override
		public Adapter caseVariar(Variar object) {
			return createVariarAdapter();
		}

		@Override
		public Adapter caseEsperar(Esperar object) {
			return createEsperarAdapter();
		}

		@Override
		public Adapter caseEncender(Encender object) {
			return createEncenderAdapter();
		}

		@Override
		public Adapter caseBloques(Bloques object) {
			return createBloquesAdapter();
		}

		@Override
		public Adapter caseDoWhile(DoWhile object) {
			return createDoWhileAdapter();
		}

		@Override
		public Adapter caseIf(If object) {
			return createIfAdapter();
		}

		@Override
		public Adapter caseFor(For object) {
			return createForAdapter();
		}

		@Override
		public Adapter caseWhile(While object) {
			return createWhileAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduino.Sketch <em>Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduino.Sketch
	 * @generated
	 */
	public Adapter createSketchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduino.Actuadores <em>Actuadores</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduino.Actuadores
	 * @generated
	 */
	public Adapter createActuadoresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduino.Sensores <em>Sensores</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduino.Sensores
	 * @generated
	 */
	public Adapter createSensoresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduino.Led <em>Led</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduino.Led
	 * @generated
	 */
	public Adapter createLedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduino.LDR <em>LDR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduino.LDR
	 * @generated
	 */
	public Adapter createLDRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduino.Instrucciones <em>Instrucciones</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduino.Instrucciones
	 * @generated
	 */
	public Adapter createInstruccionesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduino.Apagar <em>Apagar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduino.Apagar
	 * @generated
	 */
	public Adapter createApagarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduino.Variar <em>Variar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduino.Variar
	 * @generated
	 */
	public Adapter createVariarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduino.Esperar <em>Esperar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduino.Esperar
	 * @generated
	 */
	public Adapter createEsperarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduino.Encender <em>Encender</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduino.Encender
	 * @generated
	 */
	public Adapter createEncenderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduino.Bloques <em>Bloques</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduino.Bloques
	 * @generated
	 */
	public Adapter createBloquesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduino.DoWhile <em>Do While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduino.DoWhile
	 * @generated
	 */
	public Adapter createDoWhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduino.If <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduino.If
	 * @generated
	 */
	public Adapter createIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduino.For <em>For</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduino.For
	 * @generated
	 */
	public Adapter createForAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link arduino.While <em>While</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see arduino.While
	 * @generated
	 */
	public Adapter createWhileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ArduinoAdapterFactory
