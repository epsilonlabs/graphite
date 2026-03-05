/**
 */
package flow.util;

import flow.CapacityBound;
import flow.CompositeProcessor;
import flow.DataFlow;
import flow.DataSource;
import flow.Fan;
import flow.FlowElement;
import flow.FlowPackage;
import flow.FlowSource;
import flow.FlowTarget;
import flow.Named;
import flow.Physical;
import flow.PowerInput;
import flow.PowerLink;
import flow.PowerOutput;
import flow.Powered;
import flow.Processor;
import flow.RoutingRule;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see flow.FlowPackage
 * @generated
 */
public class FlowAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FlowPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FlowPackage.eINSTANCE;
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
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowSwitch<Adapter> modelSwitch =
		new FlowSwitch<Adapter>() {
			@Override
			public Adapter caseFan(Fan object) {
				return createFanAdapter();
			}
			@Override
			public Adapter casePhysical(Physical object) {
				return createPhysicalAdapter();
			}
			@Override
			public Adapter caseCompositeProcessor(CompositeProcessor object) {
				return createCompositeProcessorAdapter();
			}
			@Override
			public Adapter caseDataFlow(DataFlow object) {
				return createDataFlowAdapter();
			}
			@Override
			public Adapter caseCapacityBound(CapacityBound object) {
				return createCapacityBoundAdapter();
			}
			@Override
			public Adapter caseSystem(flow.System object) {
				return createSystemAdapter();
			}
			@Override
			public Adapter caseRoutingRule(RoutingRule object) {
				return createRoutingRuleAdapter();
			}
			@Override
			public Adapter casePowerOutput(PowerOutput object) {
				return createPowerOutputAdapter();
			}
			@Override
			public Adapter casePowered(Powered object) {
				return createPoweredAdapter();
			}
			@Override
			public Adapter casePowerInput(PowerInput object) {
				return createPowerInputAdapter();
			}
			@Override
			public Adapter casePowerLink(PowerLink object) {
				return createPowerLinkAdapter();
			}
			@Override
			public Adapter caseFlowSource(FlowSource object) {
				return createFlowSourceAdapter();
			}
			@Override
			public Adapter caseProcessor(Processor object) {
				return createProcessorAdapter();
			}
			@Override
			public Adapter caseFlowTarget(FlowTarget object) {
				return createFlowTargetAdapter();
			}
			@Override
			public Adapter caseDataSource(DataSource object) {
				return createDataSourceAdapter();
			}
			@Override
			public Adapter caseFlowElement(FlowElement object) {
				return createFlowElementAdapter();
			}
			@Override
			public Adapter caseNamed(Named object) {
				return createNamedAdapter();
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
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link flow.Fan <em>Fan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flow.Fan
	 * @generated
	 */
	public Adapter createFanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flow.Physical <em>Physical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flow.Physical
	 * @generated
	 */
	public Adapter createPhysicalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flow.CompositeProcessor <em>Composite Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flow.CompositeProcessor
	 * @generated
	 */
	public Adapter createCompositeProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flow.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flow.DataFlow
	 * @generated
	 */
	public Adapter createDataFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flow.CapacityBound <em>Capacity Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flow.CapacityBound
	 * @generated
	 */
	public Adapter createCapacityBoundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flow.System <em>System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flow.System
	 * @generated
	 */
	public Adapter createSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flow.RoutingRule <em>Routing Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flow.RoutingRule
	 * @generated
	 */
	public Adapter createRoutingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flow.PowerOutput <em>Power Output</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flow.PowerOutput
	 * @generated
	 */
	public Adapter createPowerOutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flow.Powered <em>Powered</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flow.Powered
	 * @generated
	 */
	public Adapter createPoweredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flow.PowerInput <em>Power Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flow.PowerInput
	 * @generated
	 */
	public Adapter createPowerInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flow.PowerLink <em>Power Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flow.PowerLink
	 * @generated
	 */
	public Adapter createPowerLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flow.FlowSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flow.FlowSource
	 * @generated
	 */
	public Adapter createFlowSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flow.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flow.Processor
	 * @generated
	 */
	public Adapter createProcessorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flow.FlowTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flow.FlowTarget
	 * @generated
	 */
	public Adapter createFlowTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flow.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flow.DataSource
	 * @generated
	 */
	public Adapter createDataSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flow.FlowElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flow.FlowElement
	 * @generated
	 */
	public Adapter createFlowElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link flow.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see flow.Named
	 * @generated
	 */
	public Adapter createNamedAdapter() {
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

} //FlowAdapterFactory
