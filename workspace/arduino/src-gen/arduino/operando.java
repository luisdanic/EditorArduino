/**
 */
package arduino;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>operando</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see arduino.ArduinoPackage#getoperando()
 * @model
 * @generated
 */
public enum operando implements Enumerator {
	/**
	 * The '<em><b>Menor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MENOR_VALUE
	 * @generated
	 * @ordered
	 */
	MENOR(0, "menor", "menor"),

	/**
	 * The '<em><b>Mayor</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAYOR_VALUE
	 * @generated
	 * @ordered
	 */
	MAYOR(1, "mayor", "mayor"),

	/**
	 * The '<em><b>Menorigual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MENORIGUAL_VALUE
	 * @generated
	 * @ordered
	 */
	MENORIGUAL(2, "menorigual", "menorigual"),

	/**
	 * The '<em><b>Mayorigual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAYORIGUAL_VALUE
	 * @generated
	 * @ordered
	 */
	MAYORIGUAL(3, "mayorigual", "mayorigual"),

	/**
	 * The '<em><b>Igual</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGUAL_VALUE
	 * @generated
	 * @ordered
	 */
	IGUAL(4, "igual", "igual"),

	/**
	 * The '<em><b>Diferente</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIFERENTE_VALUE
	 * @generated
	 * @ordered
	 */
	DIFERENTE(5, "diferente", "diferente");

	/**
	 * The '<em><b>Menor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Menor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MENOR
	 * @model name="menor"
	 * @generated
	 * @ordered
	 */
	public static final int MENOR_VALUE = 0;

	/**
	 * The '<em><b>Mayor</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mayor</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAYOR
	 * @model name="mayor"
	 * @generated
	 * @ordered
	 */
	public static final int MAYOR_VALUE = 1;

	/**
	 * The '<em><b>Menorigual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Menorigual</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MENORIGUAL
	 * @model name="menorigual"
	 * @generated
	 * @ordered
	 */
	public static final int MENORIGUAL_VALUE = 2;

	/**
	 * The '<em><b>Mayorigual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mayorigual</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAYORIGUAL
	 * @model name="mayorigual"
	 * @generated
	 * @ordered
	 */
	public static final int MAYORIGUAL_VALUE = 3;

	/**
	 * The '<em><b>Igual</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Igual</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IGUAL
	 * @model name="igual"
	 * @generated
	 * @ordered
	 */
	public static final int IGUAL_VALUE = 4;

	/**
	 * The '<em><b>Diferente</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Diferente</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIFERENTE
	 * @model name="diferente"
	 * @generated
	 * @ordered
	 */
	public static final int DIFERENTE_VALUE = 5;

	/**
	 * An array of all the '<em><b>operando</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final operando[] VALUES_ARRAY = new operando[] { MENOR, MAYOR, MENORIGUAL, MAYORIGUAL, IGUAL,
			DIFERENTE, };

	/**
	 * A public read-only list of all the '<em><b>operando</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<operando> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>operando</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static operando get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			operando result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>operando</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static operando getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			operando result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>operando</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static operando get(int value) {
		switch (value) {
		case MENOR_VALUE:
			return MENOR;
		case MAYOR_VALUE:
			return MAYOR;
		case MENORIGUAL_VALUE:
			return MENORIGUAL;
		case MAYORIGUAL_VALUE:
			return MAYORIGUAL;
		case IGUAL_VALUE:
			return IGUAL;
		case DIFERENTE_VALUE:
			return DIFERENTE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private operando(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //operando
