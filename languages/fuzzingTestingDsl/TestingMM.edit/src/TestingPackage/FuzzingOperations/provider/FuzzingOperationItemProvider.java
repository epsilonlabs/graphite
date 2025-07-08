/**
 */
package TestingPackage.FuzzingOperations.provider;


import TestingPackage.FuzzingOperations.FuzzingOperation;
import TestingPackage.FuzzingOperations.FuzzingOperationsFactory;
import TestingPackage.FuzzingOperations.FuzzingOperationsPackage;

import TestingPackage.provider.TestingMMEditPlugin;

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link TestingPackage.FuzzingOperations.FuzzingOperation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FuzzingOperationItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzingOperationItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addPriorityPropertyDescriptor(object);
			addVariableToAffectPropertyDescriptor(object);
			addMessagesFromAllComponenentsPropertyDescriptor(object);
			addFromNodesPropertyDescriptor(object);
			addMessagesToAllComponenentsPropertyDescriptor(object);
			addToNodesPropertyDescriptor(object);
			addNodeToFuzzPropertyDescriptor(object);
			addAllPublishingVarsPropertyDescriptor(object);
			addPublishingVarsPropertyDescriptor(object);
			addAllSubscribingVarsPropertyDescriptor(object);
			addSubscribingVarsPropertyDescriptor(object);
			addFromTemplatePropertyDescriptor(object);
			addSeedPropertyDescriptor(object);
			addSequenceNumInTestPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FuzzingOperation_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FuzzingOperation_name_feature", "_UI_FuzzingOperation_type"),
				 FuzzingOperationsPackage.Literals.FUZZING_OPERATION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Priority feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPriorityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FuzzingOperation_priority_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FuzzingOperation_priority_feature", "_UI_FuzzingOperation_type"),
				 FuzzingOperationsPackage.Literals.FUZZING_OPERATION__PRIORITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Variable To Affect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariableToAffectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FuzzingOperation_variableToAffect_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FuzzingOperation_variableToAffect_feature", "_UI_FuzzingOperation_type"),
				 FuzzingOperationsPackage.Literals.FUZZING_OPERATION__VARIABLE_TO_AFFECT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Messages From All Componenents feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessagesFromAllComponenentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FuzzingOperation_messagesFromAllComponenents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FuzzingOperation_messagesFromAllComponenents_feature", "_UI_FuzzingOperation_type"),
				 FuzzingOperationsPackage.Literals.FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the From Nodes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromNodesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FuzzingOperation_fromNodes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FuzzingOperation_fromNodes_feature", "_UI_FuzzingOperation_type"),
				 FuzzingOperationsPackage.Literals.FUZZING_OPERATION__FROM_NODES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Messages To All Componenents feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessagesToAllComponenentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FuzzingOperation_messagesToAllComponenents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FuzzingOperation_messagesToAllComponenents_feature", "_UI_FuzzingOperation_type"),
				 FuzzingOperationsPackage.Literals.FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the To Nodes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToNodesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FuzzingOperation_toNodes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FuzzingOperation_toNodes_feature", "_UI_FuzzingOperation_type"),
				 FuzzingOperationsPackage.Literals.FUZZING_OPERATION__TO_NODES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Node To Fuzz feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodeToFuzzPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FuzzingOperation_nodeToFuzz_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FuzzingOperation_nodeToFuzz_feature", "_UI_FuzzingOperation_type"),
				 FuzzingOperationsPackage.Literals.FUZZING_OPERATION__NODE_TO_FUZZ,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the All Publishing Vars feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllPublishingVarsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FuzzingOperation_allPublishingVars_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FuzzingOperation_allPublishingVars_feature", "_UI_FuzzingOperation_type"),
				 FuzzingOperationsPackage.Literals.FUZZING_OPERATION__ALL_PUBLISHING_VARS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Publishing Vars feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublishingVarsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FuzzingOperation_publishingVars_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FuzzingOperation_publishingVars_feature", "_UI_FuzzingOperation_type"),
				 FuzzingOperationsPackage.Literals.FUZZING_OPERATION__PUBLISHING_VARS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the All Subscribing Vars feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllSubscribingVarsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FuzzingOperation_allSubscribingVars_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FuzzingOperation_allSubscribingVars_feature", "_UI_FuzzingOperation_type"),
				 FuzzingOperationsPackage.Literals.FUZZING_OPERATION__ALL_SUBSCRIBING_VARS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Subscribing Vars feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubscribingVarsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FuzzingOperation_subscribingVars_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FuzzingOperation_subscribingVars_feature", "_UI_FuzzingOperation_type"),
				 FuzzingOperationsPackage.Literals.FUZZING_OPERATION__SUBSCRIBING_VARS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the From Template feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFromTemplatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FuzzingOperation_fromTemplate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FuzzingOperation_fromTemplate_feature", "_UI_FuzzingOperation_type"),
				 FuzzingOperationsPackage.Literals.FUZZING_OPERATION__FROM_TEMPLATE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Seed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSeedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FuzzingOperation_seed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FuzzingOperation_seed_feature", "_UI_FuzzingOperation_type"),
				 FuzzingOperationsPackage.Literals.FUZZING_OPERATION__SEED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sequence Num In Test feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSequenceNumInTestPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FuzzingOperation_sequenceNumInTest_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FuzzingOperation_sequenceNumInTest_feature", "_UI_FuzzingOperation_type"),
				 FuzzingOperationsPackage.Literals.FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(FuzzingOperationsPackage.Literals.FUZZING_OPERATION__ACTIVATION);
			childrenFeatures.add(FuzzingOperationsPackage.Literals.FUZZING_OPERATION__RECORDED_TIMINGS);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FuzzingOperation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FuzzingOperation_type") :
			getString("_UI_FuzzingOperation_type") + " " + label;
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

		switch (notification.getFeatureID(FuzzingOperation.class)) {
			case FuzzingOperationsPackage.FUZZING_OPERATION__NAME:
			case FuzzingOperationsPackage.FUZZING_OPERATION__PRIORITY:
			case FuzzingOperationsPackage.FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS:
			case FuzzingOperationsPackage.FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS:
			case FuzzingOperationsPackage.FUZZING_OPERATION__ALL_PUBLISHING_VARS:
			case FuzzingOperationsPackage.FUZZING_OPERATION__ALL_SUBSCRIBING_VARS:
			case FuzzingOperationsPackage.FUZZING_OPERATION__SEED:
			case FuzzingOperationsPackage.FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__ACTIVATION:
			case FuzzingOperationsPackage.FUZZING_OPERATION__RECORDED_TIMINGS:
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

		newChildDescriptors.add
			(createChildParameter
				(FuzzingOperationsPackage.Literals.FUZZING_OPERATION__ACTIVATION,
				 FuzzingOperationsFactory.eINSTANCE.createFixedTimeActivation()));

		newChildDescriptors.add
			(createChildParameter
				(FuzzingOperationsPackage.Literals.FUZZING_OPERATION__ACTIVATION,
				 FuzzingOperationsFactory.eINSTANCE.createConditionBasedActivation()));

		newChildDescriptors.add
			(createChildParameter
				(FuzzingOperationsPackage.Literals.FUZZING_OPERATION__ACTIVATION,
				 FuzzingOperationsFactory.eINSTANCE.createConditionBasedTimeLimited()));

		newChildDescriptors.add
			(createChildParameter
				(FuzzingOperationsPackage.Literals.FUZZING_OPERATION__RECORDED_TIMINGS,
				 FuzzingOperationsFactory.eINSTANCE.createFixedTimeActivation()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == FuzzingOperationsPackage.Literals.FUZZING_OPERATION__ACTIVATION ||
			childFeature == FuzzingOperationsPackage.Literals.FUZZING_OPERATION__RECORDED_TIMINGS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return TestingMMEditPlugin.INSTANCE;
	}

}
