/**
 */
package arduino.impl;

import arduino.Actuadores;
import arduino.ArduinoPackage;
import arduino.Bloques;
import arduino.Instrucciones;
import arduino.Sensores;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bloques</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link arduino.impl.BloquesImpl#getBloq <em>Bloq</em>}</li>
 *   <li>{@link arduino.impl.BloquesImpl#getBactuadores <em>Bactuadores</em>}</li>
 *   <li>{@link arduino.impl.BloquesImpl#getBinstrucciones <em>Binstrucciones</em>}</li>
 *   <li>{@link arduino.impl.BloquesImpl#getBsensores <em>Bsensores</em>}</li>
 *   <li>{@link arduino.impl.BloquesImpl#getBloacts <em>Bloacts</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BloquesImpl extends MinimalEObjectImpl.Container implements Bloques {
	/**
	 * The cached value of the '{@link #getBloq() <em>Bloq</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBloq()
	 * @generated
	 * @ordered
	 */
	protected EList<Bloques> bloq;

	/**
	 * The cached value of the '{@link #getBactuadores() <em>Bactuadores</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBactuadores()
	 * @generated
	 * @ordered
	 */
	protected EList<Actuadores> bactuadores;
	/**
	 * The cached value of the '{@link #getBinstrucciones() <em>Binstrucciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinstrucciones()
	 * @generated
	 * @ordered
	 */
	protected EList<Instrucciones> binstrucciones;

	/**
	 * The cached value of the '{@link #getBsensores() <em>Bsensores</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBsensores()
	 * @generated
	 * @ordered
	 */
	protected Sensores bsensores;

	/**
	 * The cached value of the '{@link #getBloacts() <em>Bloacts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBloacts()
	 * @generated
	 * @ordered
	 */
	protected Actuadores bloacts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BloquesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoPackage.Literals.BLOQUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bloques> getBloq() {
		if (bloq == null) {
			bloq = new EObjectContainmentEList<Bloques>(Bloques.class, this, ArduinoPackage.BLOQUES__BLOQ);
		}
		return bloq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actuadores> getBactuadores() {
		if (bactuadores == null) {
			bactuadores = new EObjectContainmentEList<Actuadores>(Actuadores.class, this,
					ArduinoPackage.BLOQUES__BACTUADORES);
		}
		return bactuadores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instrucciones> getBinstrucciones() {
		if (binstrucciones == null) {
			binstrucciones = new EObjectContainmentEList<Instrucciones>(Instrucciones.class, this,
					ArduinoPackage.BLOQUES__BINSTRUCCIONES);
		}
		return binstrucciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensores getBsensores() {
		if (bsensores != null && bsensores.eIsProxy()) {
			InternalEObject oldBsensores = (InternalEObject) bsensores;
			bsensores = (Sensores) eResolveProxy(oldBsensores);
			if (bsensores != oldBsensores) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.BLOQUES__BSENSORES,
							oldBsensores, bsensores));
			}
		}
		return bsensores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensores basicGetBsensores() {
		return bsensores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBsensores(Sensores newBsensores) {
		Sensores oldBsensores = bsensores;
		bsensores = newBsensores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.BLOQUES__BSENSORES, oldBsensores,
					bsensores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuadores getBloacts() {
		if (bloacts != null && bloacts.eIsProxy()) {
			InternalEObject oldBloacts = (InternalEObject) bloacts;
			bloacts = (Actuadores) eResolveProxy(oldBloacts);
			if (bloacts != oldBloacts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArduinoPackage.BLOQUES__BLOACTS,
							oldBloacts, bloacts));
			}
		}
		return bloacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuadores basicGetBloacts() {
		return bloacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBloacts(Actuadores newBloacts) {
		Actuadores oldBloacts = bloacts;
		bloacts = newBloacts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArduinoPackage.BLOQUES__BLOACTS, oldBloacts,
					bloacts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ArduinoPackage.BLOQUES__BLOQ:
			return ((InternalEList<?>) getBloq()).basicRemove(otherEnd, msgs);
		case ArduinoPackage.BLOQUES__BACTUADORES:
			return ((InternalEList<?>) getBactuadores()).basicRemove(otherEnd, msgs);
		case ArduinoPackage.BLOQUES__BINSTRUCCIONES:
			return ((InternalEList<?>) getBinstrucciones()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ArduinoPackage.BLOQUES__BLOQ:
			return getBloq();
		case ArduinoPackage.BLOQUES__BACTUADORES:
			return getBactuadores();
		case ArduinoPackage.BLOQUES__BINSTRUCCIONES:
			return getBinstrucciones();
		case ArduinoPackage.BLOQUES__BSENSORES:
			if (resolve)
				return getBsensores();
			return basicGetBsensores();
		case ArduinoPackage.BLOQUES__BLOACTS:
			if (resolve)
				return getBloacts();
			return basicGetBloacts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ArduinoPackage.BLOQUES__BLOQ:
			getBloq().clear();
			getBloq().addAll((Collection<? extends Bloques>) newValue);
			return;
		case ArduinoPackage.BLOQUES__BACTUADORES:
			getBactuadores().clear();
			getBactuadores().addAll((Collection<? extends Actuadores>) newValue);
			return;
		case ArduinoPackage.BLOQUES__BINSTRUCCIONES:
			getBinstrucciones().clear();
			getBinstrucciones().addAll((Collection<? extends Instrucciones>) newValue);
			return;
		case ArduinoPackage.BLOQUES__BSENSORES:
			setBsensores((Sensores) newValue);
			return;
		case ArduinoPackage.BLOQUES__BLOACTS:
			setBloacts((Actuadores) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ArduinoPackage.BLOQUES__BLOQ:
			getBloq().clear();
			return;
		case ArduinoPackage.BLOQUES__BACTUADORES:
			getBactuadores().clear();
			return;
		case ArduinoPackage.BLOQUES__BINSTRUCCIONES:
			getBinstrucciones().clear();
			return;
		case ArduinoPackage.BLOQUES__BSENSORES:
			setBsensores((Sensores) null);
			return;
		case ArduinoPackage.BLOQUES__BLOACTS:
			setBloacts((Actuadores) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ArduinoPackage.BLOQUES__BLOQ:
			return bloq != null && !bloq.isEmpty();
		case ArduinoPackage.BLOQUES__BACTUADORES:
			return bactuadores != null && !bactuadores.isEmpty();
		case ArduinoPackage.BLOQUES__BINSTRUCCIONES:
			return binstrucciones != null && !binstrucciones.isEmpty();
		case ArduinoPackage.BLOQUES__BSENSORES:
			return bsensores != null;
		case ArduinoPackage.BLOQUES__BLOACTS:
			return bloacts != null;
		}
		return super.eIsSet(featureID);
	}

} //BloquesImpl
