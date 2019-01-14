/**
 */
package arduino.provider;

import arduino.ArduinoFactory;
import arduino.ArduinoPackage;
import arduino.Bloques;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link arduino.Bloques} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BloquesItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BloquesItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addBloqPropertyDescriptor(object);
			addBactuadoresPropertyDescriptor(object);
			addBsensoresPropertyDescriptor(object);
			addBloactsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Bloq feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBloqPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Bloques_bloq_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Bloques_bloq_feature", "_UI_Bloques_type"),
						ArduinoPackage.Literals.BLOQUES__BLOQ, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Bactuadores feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBactuadoresPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Bloques_bactuadores_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Bloques_bactuadores_feature",
								"_UI_Bloques_type"),
						ArduinoPackage.Literals.BLOQUES__BACTUADORES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Bsensores feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBsensoresPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Bloques_bsensores_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Bloques_bsensores_feature",
								"_UI_Bloques_type"),
						ArduinoPackage.Literals.BLOQUES__BSENSORES, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Bloacts feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBloactsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Bloques_bloacts_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Bloques_bloacts_feature",
								"_UI_Bloques_type"),
						ArduinoPackage.Literals.BLOQUES__BLOACTS, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ArduinoPackage.Literals.BLOQUES__BLOQ);
			childrenFeatures.add(ArduinoPackage.Literals.BLOQUES__BACTUADORES);
			childrenFeatures.add(ArduinoPackage.Literals.BLOQUES__BINSTRUCCIONES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Bloques.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Bloques"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Bloques_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Bloques.class)) {
		case ArduinoPackage.BLOQUES__BLOQ:
		case ArduinoPackage.BLOQUES__BACTUADORES:
		case ArduinoPackage.BLOQUES__BINSTRUCCIONES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors
				.add(createChildParameter(ArduinoPackage.Literals.BLOQUES__BLOQ, ArduinoFactory.eINSTANCE.createIf()));

		newChildDescriptors.add(
				createChildParameter(ArduinoPackage.Literals.BLOQUES__BLOQ, ArduinoFactory.eINSTANCE.createWhile()));

		newChildDescriptors.add(createChildParameter(ArduinoPackage.Literals.BLOQUES__BACTUADORES,
				ArduinoFactory.eINSTANCE.createLed()));

		newChildDescriptors.add(createChildParameter(ArduinoPackage.Literals.BLOQUES__BACTUADORES,
				ArduinoFactory.eINSTANCE.createBuzzer()));

		newChildDescriptors.add(createChildParameter(ArduinoPackage.Literals.BLOQUES__BACTUADORES,
				ArduinoFactory.eINSTANCE.createServo()));

		newChildDescriptors.add(createChildParameter(ArduinoPackage.Literals.BLOQUES__BINSTRUCCIONES,
				ArduinoFactory.eINSTANCE.createApagar()));

		newChildDescriptors.add(createChildParameter(ArduinoPackage.Literals.BLOQUES__BINSTRUCCIONES,
				ArduinoFactory.eINSTANCE.createVariar()));

		newChildDescriptors.add(createChildParameter(ArduinoPackage.Literals.BLOQUES__BINSTRUCCIONES,
				ArduinoFactory.eINSTANCE.createEsperar()));

		newChildDescriptors.add(createChildParameter(ArduinoPackage.Literals.BLOQUES__BINSTRUCCIONES,
				ArduinoFactory.eINSTANCE.createEncender()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ArduinoEditPlugin.INSTANCE;
	}

}
