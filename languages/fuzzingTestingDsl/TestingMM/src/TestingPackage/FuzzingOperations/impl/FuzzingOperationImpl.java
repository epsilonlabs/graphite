/**
 */
package TestingPackage.FuzzingOperations.impl;

import TestingPackage.FuzzingOperations.Activation;
import TestingPackage.FuzzingOperations.FixedTimeActivation;
import TestingPackage.FuzzingOperations.FuzzingOperation;
import TestingPackage.FuzzingOperations.FuzzingOperationsPackage;

import TestingPackage.MRSPackage.Node;
import TestingPackage.MRSPackage.Variable;

import TestingPackage.Test;
import TestingPackage.TestingMMPackage;

import graphite.shared.CustomEObjectImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuzzing Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.FuzzingOperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.FuzzingOperationImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.FuzzingOperationImpl#getActivation <em>Activation</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.FuzzingOperationImpl#getVariableToAffect <em>Variable To Affect</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.FuzzingOperationImpl#isMessagesFromAllComponenents <em>Messages From All Componenents</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.FuzzingOperationImpl#getFromNodes <em>From Nodes</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.FuzzingOperationImpl#isMessagesToAllComponenents <em>Messages To All Componenents</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.FuzzingOperationImpl#getToNodes <em>To Nodes</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.FuzzingOperationImpl#getNodeToFuzz <em>Node To Fuzz</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.FuzzingOperationImpl#isAllPublishingVars <em>All Publishing Vars</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.FuzzingOperationImpl#getPublishingVars <em>Publishing Vars</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.FuzzingOperationImpl#isAllSubscribingVars <em>All Subscribing Vars</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.FuzzingOperationImpl#getSubscribingVars <em>Subscribing Vars</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.FuzzingOperationImpl#getFromTemplate <em>From Template</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.FuzzingOperationImpl#getContainingTest <em>Containing Test</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.FuzzingOperationImpl#getRecordedTimings <em>Recorded Timings</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.FuzzingOperationImpl#getSeed <em>Seed</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.impl.FuzzingOperationImpl#getSequenceNumInTest <em>Sequence Num In Test</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FuzzingOperationImpl extends CustomEObjectImpl implements FuzzingOperation {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActivation() <em>Activation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivation()
	 * @generated
	 * @ordered
	 */
	protected Activation activation;

	/**
	 * The cached value of the '{@link #getVariableToAffect() <em>Variable To Affect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableToAffect()
	 * @generated
	 * @ordered
	 */
	protected Variable variableToAffect;

	/**
	 * The default value of the '{@link #isMessagesFromAllComponenents() <em>Messages From All Componenents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMessagesFromAllComponenents()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MESSAGES_FROM_ALL_COMPONENENTS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMessagesFromAllComponenents() <em>Messages From All Componenents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMessagesFromAllComponenents()
	 * @generated
	 * @ordered
	 */
	protected boolean messagesFromAllComponenents = MESSAGES_FROM_ALL_COMPONENENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFromNodes() <em>From Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> fromNodes;

	/**
	 * The default value of the '{@link #isMessagesToAllComponenents() <em>Messages To All Componenents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMessagesToAllComponenents()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MESSAGES_TO_ALL_COMPONENENTS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMessagesToAllComponenents() <em>Messages To All Componenents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMessagesToAllComponenents()
	 * @generated
	 * @ordered
	 */
	protected boolean messagesToAllComponenents = MESSAGES_TO_ALL_COMPONENENTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getToNodes() <em>To Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> toNodes;

	/**
	 * The cached value of the '{@link #getNodeToFuzz() <em>Node To Fuzz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeToFuzz()
	 * @generated
	 * @ordered
	 */
	protected Node nodeToFuzz;

	/**
	 * The default value of the '{@link #isAllPublishingVars() <em>All Publishing Vars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllPublishingVars()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_PUBLISHING_VARS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllPublishingVars() <em>All Publishing Vars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllPublishingVars()
	 * @generated
	 * @ordered
	 */
	protected boolean allPublishingVars = ALL_PUBLISHING_VARS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPublishingVars() <em>Publishing Vars</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishingVars()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> publishingVars;

	/**
	 * The default value of the '{@link #isAllSubscribingVars() <em>All Subscribing Vars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllSubscribingVars()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_SUBSCRIBING_VARS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllSubscribingVars() <em>All Subscribing Vars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllSubscribingVars()
	 * @generated
	 * @ordered
	 */
	protected boolean allSubscribingVars = ALL_SUBSCRIBING_VARS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubscribingVars() <em>Subscribing Vars</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribingVars()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> subscribingVars;

	/**
	 * The cached value of the '{@link #getFromTemplate() <em>From Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTemplate()
	 * @generated
	 * @ordered
	 */
	protected FuzzingOperation fromTemplate;

	/**
	 * The cached value of the '{@link #getRecordedTimings() <em>Recorded Timings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordedTimings()
	 * @generated
	 * @ordered
	 */
	protected FixedTimeActivation recordedTimings;

	/**
	 * The default value of the '{@link #getSeed() <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeed()
	 * @generated
	 * @ordered
	 */
	protected static final int SEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeed() <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeed()
	 * @generated
	 * @ordered
	 */
	protected int seed = SEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSequenceNumInTest() <em>Sequence Num In Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumInTest()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQUENCE_NUM_IN_TEST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSequenceNumInTest() <em>Sequence Num In Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequenceNumInTest()
	 * @generated
	 * @ordered
	 */
	protected int sequenceNumInTest = SEQUENCE_NUM_IN_TEST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuzzingOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FuzzingOperationsPackage.Literals.FUZZING_OPERATION;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.FUZZING_OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.FUZZING_OPERATION__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activation getActivation() {
		return activation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivation(Activation newActivation, NotificationChain msgs) {
		Activation oldActivation = activation;
		activation = newActivation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.FUZZING_OPERATION__ACTIVATION, oldActivation, newActivation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivation(Activation newActivation) {
		if (newActivation != activation) {
			NotificationChain msgs = null;
			if (activation != null)
				msgs = ((InternalEObject)activation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FuzzingOperationsPackage.FUZZING_OPERATION__ACTIVATION, null, msgs);
			if (newActivation != null)
				msgs = ((InternalEObject)newActivation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FuzzingOperationsPackage.FUZZING_OPERATION__ACTIVATION, null, msgs);
			msgs = basicSetActivation(newActivation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.FUZZING_OPERATION__ACTIVATION, newActivation, newActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariableToAffect() {
		if (variableToAffect != null && variableToAffect.eIsProxy()) {
			InternalEObject oldVariableToAffect = (InternalEObject)variableToAffect;
			variableToAffect = (Variable)eResolveProxy(oldVariableToAffect);
			if (variableToAffect != oldVariableToAffect) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FuzzingOperationsPackage.FUZZING_OPERATION__VARIABLE_TO_AFFECT, oldVariableToAffect, variableToAffect));
			}
		}
		return variableToAffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetVariableToAffect() {
		return variableToAffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableToAffect(Variable newVariableToAffect) {
		Variable oldVariableToAffect = variableToAffect;
		variableToAffect = newVariableToAffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.FUZZING_OPERATION__VARIABLE_TO_AFFECT, oldVariableToAffect, variableToAffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMessagesFromAllComponenents() {
		return messagesFromAllComponenents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessagesFromAllComponenents(boolean newMessagesFromAllComponenents) {
		boolean oldMessagesFromAllComponenents = messagesFromAllComponenents;
		messagesFromAllComponenents = newMessagesFromAllComponenents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS, oldMessagesFromAllComponenents, messagesFromAllComponenents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getFromNodes() {
		if (fromNodes == null) {
			fromNodes = new EObjectResolvingEList<Node>(Node.class, this, FuzzingOperationsPackage.FUZZING_OPERATION__FROM_NODES);
		}
		return fromNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMessagesToAllComponenents() {
		return messagesToAllComponenents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessagesToAllComponenents(boolean newMessagesToAllComponenents) {
		boolean oldMessagesToAllComponenents = messagesToAllComponenents;
		messagesToAllComponenents = newMessagesToAllComponenents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS, oldMessagesToAllComponenents, messagesToAllComponenents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getToNodes() {
		if (toNodes == null) {
			toNodes = new EObjectResolvingEList<Node>(Node.class, this, FuzzingOperationsPackage.FUZZING_OPERATION__TO_NODES);
		}
		return toNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getNodeToFuzz() {
		if (nodeToFuzz != null && nodeToFuzz.eIsProxy()) {
			InternalEObject oldNodeToFuzz = (InternalEObject)nodeToFuzz;
			nodeToFuzz = (Node)eResolveProxy(oldNodeToFuzz);
			if (nodeToFuzz != oldNodeToFuzz) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FuzzingOperationsPackage.FUZZING_OPERATION__NODE_TO_FUZZ, oldNodeToFuzz, nodeToFuzz));
			}
		}
		return nodeToFuzz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetNodeToFuzz() {
		return nodeToFuzz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeToFuzz(Node newNodeToFuzz) {
		Node oldNodeToFuzz = nodeToFuzz;
		nodeToFuzz = newNodeToFuzz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.FUZZING_OPERATION__NODE_TO_FUZZ, oldNodeToFuzz, nodeToFuzz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllPublishingVars() {
		return allPublishingVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllPublishingVars(boolean newAllPublishingVars) {
		boolean oldAllPublishingVars = allPublishingVars;
		allPublishingVars = newAllPublishingVars;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.FUZZING_OPERATION__ALL_PUBLISHING_VARS, oldAllPublishingVars, allPublishingVars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getPublishingVars() {
		if (publishingVars == null) {
			publishingVars = new EObjectResolvingEList<Variable>(Variable.class, this, FuzzingOperationsPackage.FUZZING_OPERATION__PUBLISHING_VARS);
		}
		return publishingVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllSubscribingVars() {
		return allSubscribingVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllSubscribingVars(boolean newAllSubscribingVars) {
		boolean oldAllSubscribingVars = allSubscribingVars;
		allSubscribingVars = newAllSubscribingVars;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.FUZZING_OPERATION__ALL_SUBSCRIBING_VARS, oldAllSubscribingVars, allSubscribingVars));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getSubscribingVars() {
		if (subscribingVars == null) {
			subscribingVars = new EObjectResolvingEList<Variable>(Variable.class, this, FuzzingOperationsPackage.FUZZING_OPERATION__SUBSCRIBING_VARS);
		}
		return subscribingVars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzingOperation getFromTemplate() {
		if (fromTemplate != null && fromTemplate.eIsProxy()) {
			InternalEObject oldFromTemplate = (InternalEObject)fromTemplate;
			fromTemplate = (FuzzingOperation)eResolveProxy(oldFromTemplate);
			if (fromTemplate != oldFromTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FuzzingOperationsPackage.FUZZING_OPERATION__FROM_TEMPLATE, oldFromTemplate, fromTemplate));
			}
		}
		return fromTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzingOperation basicGetFromTemplate() {
		return fromTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromTemplate(FuzzingOperation newFromTemplate) {
		FuzzingOperation oldFromTemplate = fromTemplate;
		fromTemplate = newFromTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.FUZZING_OPERATION__FROM_TEMPLATE, oldFromTemplate, fromTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Test getContainingTest() {
		if (eContainerFeatureID() != FuzzingOperationsPackage.FUZZING_OPERATION__CONTAINING_TEST) return null;
		return (Test)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedTimeActivation getRecordedTimings() {
		return recordedTimings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecordedTimings(FixedTimeActivation newRecordedTimings, NotificationChain msgs) {
		FixedTimeActivation oldRecordedTimings = recordedTimings;
		recordedTimings = newRecordedTimings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.FUZZING_OPERATION__RECORDED_TIMINGS, oldRecordedTimings, newRecordedTimings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordedTimings(FixedTimeActivation newRecordedTimings) {
		if (newRecordedTimings != recordedTimings) {
			NotificationChain msgs = null;
			if (recordedTimings != null)
				msgs = ((InternalEObject)recordedTimings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FuzzingOperationsPackage.FUZZING_OPERATION__RECORDED_TIMINGS, null, msgs);
			if (newRecordedTimings != null)
				msgs = ((InternalEObject)newRecordedTimings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FuzzingOperationsPackage.FUZZING_OPERATION__RECORDED_TIMINGS, null, msgs);
			msgs = basicSetRecordedTimings(newRecordedTimings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.FUZZING_OPERATION__RECORDED_TIMINGS, newRecordedTimings, newRecordedTimings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeed() {
		return seed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeed(int newSeed) {
		int oldSeed = seed;
		seed = newSeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.FUZZING_OPERATION__SEED, oldSeed, seed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSequenceNumInTest() {
		return sequenceNumInTest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSequenceNumInTest(int newSequenceNumInTest) {
		int oldSequenceNumInTest = sequenceNumInTest;
		sequenceNumInTest = newSequenceNumInTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzingOperationsPackage.FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST, oldSequenceNumInTest, sequenceNumInTest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FuzzingOperationsPackage.FUZZING_OPERATION__CONTAINING_TEST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, FuzzingOperationsPackage.FUZZING_OPERATION__CONTAINING_TEST, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FuzzingOperationsPackage.FUZZING_OPERATION__ACTIVATION:
				return basicSetActivation(null, msgs);
			case FuzzingOperationsPackage.FUZZING_OPERATION__CONTAINING_TEST:
				return eBasicSetContainer(null, FuzzingOperationsPackage.FUZZING_OPERATION__CONTAINING_TEST, msgs);
			case FuzzingOperationsPackage.FUZZING_OPERATION__RECORDED_TIMINGS:
				return basicSetRecordedTimings(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case FuzzingOperationsPackage.FUZZING_OPERATION__CONTAINING_TEST:
				return eInternalContainer().eInverseRemove(this, TestingMMPackage.TEST__OPERATIONS, Test.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FuzzingOperationsPackage.FUZZING_OPERATION__NAME:
				return getName();
			case FuzzingOperationsPackage.FUZZING_OPERATION__PRIORITY:
				return getPriority();
			case FuzzingOperationsPackage.FUZZING_OPERATION__ACTIVATION:
				return getActivation();
			case FuzzingOperationsPackage.FUZZING_OPERATION__VARIABLE_TO_AFFECT:
				if (resolve) return getVariableToAffect();
				return basicGetVariableToAffect();
			case FuzzingOperationsPackage.FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS:
				return isMessagesFromAllComponenents();
			case FuzzingOperationsPackage.FUZZING_OPERATION__FROM_NODES:
				return getFromNodes();
			case FuzzingOperationsPackage.FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS:
				return isMessagesToAllComponenents();
			case FuzzingOperationsPackage.FUZZING_OPERATION__TO_NODES:
				return getToNodes();
			case FuzzingOperationsPackage.FUZZING_OPERATION__NODE_TO_FUZZ:
				if (resolve) return getNodeToFuzz();
				return basicGetNodeToFuzz();
			case FuzzingOperationsPackage.FUZZING_OPERATION__ALL_PUBLISHING_VARS:
				return isAllPublishingVars();
			case FuzzingOperationsPackage.FUZZING_OPERATION__PUBLISHING_VARS:
				return getPublishingVars();
			case FuzzingOperationsPackage.FUZZING_OPERATION__ALL_SUBSCRIBING_VARS:
				return isAllSubscribingVars();
			case FuzzingOperationsPackage.FUZZING_OPERATION__SUBSCRIBING_VARS:
				return getSubscribingVars();
			case FuzzingOperationsPackage.FUZZING_OPERATION__FROM_TEMPLATE:
				if (resolve) return getFromTemplate();
				return basicGetFromTemplate();
			case FuzzingOperationsPackage.FUZZING_OPERATION__CONTAINING_TEST:
				return getContainingTest();
			case FuzzingOperationsPackage.FUZZING_OPERATION__RECORDED_TIMINGS:
				return getRecordedTimings();
			case FuzzingOperationsPackage.FUZZING_OPERATION__SEED:
				return getSeed();
			case FuzzingOperationsPackage.FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST:
				return getSequenceNumInTest();
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
			case FuzzingOperationsPackage.FUZZING_OPERATION__NAME:
				setName((String)newValue);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__ACTIVATION:
				setActivation((Activation)newValue);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__VARIABLE_TO_AFFECT:
				setVariableToAffect((Variable)newValue);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS:
				setMessagesFromAllComponenents((Boolean)newValue);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__FROM_NODES:
				getFromNodes().clear();
				getFromNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS:
				setMessagesToAllComponenents((Boolean)newValue);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__TO_NODES:
				getToNodes().clear();
				getToNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__NODE_TO_FUZZ:
				setNodeToFuzz((Node)newValue);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__ALL_PUBLISHING_VARS:
				setAllPublishingVars((Boolean)newValue);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__PUBLISHING_VARS:
				getPublishingVars().clear();
				getPublishingVars().addAll((Collection<? extends Variable>)newValue);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__ALL_SUBSCRIBING_VARS:
				setAllSubscribingVars((Boolean)newValue);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__SUBSCRIBING_VARS:
				getSubscribingVars().clear();
				getSubscribingVars().addAll((Collection<? extends Variable>)newValue);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__FROM_TEMPLATE:
				setFromTemplate((FuzzingOperation)newValue);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__RECORDED_TIMINGS:
				setRecordedTimings((FixedTimeActivation)newValue);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__SEED:
				setSeed((Integer)newValue);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST:
				setSequenceNumInTest((Integer)newValue);
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
			case FuzzingOperationsPackage.FUZZING_OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__ACTIVATION:
				setActivation((Activation)null);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__VARIABLE_TO_AFFECT:
				setVariableToAffect((Variable)null);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS:
				setMessagesFromAllComponenents(MESSAGES_FROM_ALL_COMPONENENTS_EDEFAULT);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__FROM_NODES:
				getFromNodes().clear();
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS:
				setMessagesToAllComponenents(MESSAGES_TO_ALL_COMPONENENTS_EDEFAULT);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__TO_NODES:
				getToNodes().clear();
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__NODE_TO_FUZZ:
				setNodeToFuzz((Node)null);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__ALL_PUBLISHING_VARS:
				setAllPublishingVars(ALL_PUBLISHING_VARS_EDEFAULT);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__PUBLISHING_VARS:
				getPublishingVars().clear();
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__ALL_SUBSCRIBING_VARS:
				setAllSubscribingVars(ALL_SUBSCRIBING_VARS_EDEFAULT);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__SUBSCRIBING_VARS:
				getSubscribingVars().clear();
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__FROM_TEMPLATE:
				setFromTemplate((FuzzingOperation)null);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__RECORDED_TIMINGS:
				setRecordedTimings((FixedTimeActivation)null);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__SEED:
				setSeed(SEED_EDEFAULT);
				return;
			case FuzzingOperationsPackage.FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST:
				setSequenceNumInTest(SEQUENCE_NUM_IN_TEST_EDEFAULT);
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
			case FuzzingOperationsPackage.FUZZING_OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FuzzingOperationsPackage.FUZZING_OPERATION__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case FuzzingOperationsPackage.FUZZING_OPERATION__ACTIVATION:
				return activation != null;
			case FuzzingOperationsPackage.FUZZING_OPERATION__VARIABLE_TO_AFFECT:
				return variableToAffect != null;
			case FuzzingOperationsPackage.FUZZING_OPERATION__MESSAGES_FROM_ALL_COMPONENENTS:
				return messagesFromAllComponenents != MESSAGES_FROM_ALL_COMPONENENTS_EDEFAULT;
			case FuzzingOperationsPackage.FUZZING_OPERATION__FROM_NODES:
				return fromNodes != null && !fromNodes.isEmpty();
			case FuzzingOperationsPackage.FUZZING_OPERATION__MESSAGES_TO_ALL_COMPONENENTS:
				return messagesToAllComponenents != MESSAGES_TO_ALL_COMPONENENTS_EDEFAULT;
			case FuzzingOperationsPackage.FUZZING_OPERATION__TO_NODES:
				return toNodes != null && !toNodes.isEmpty();
			case FuzzingOperationsPackage.FUZZING_OPERATION__NODE_TO_FUZZ:
				return nodeToFuzz != null;
			case FuzzingOperationsPackage.FUZZING_OPERATION__ALL_PUBLISHING_VARS:
				return allPublishingVars != ALL_PUBLISHING_VARS_EDEFAULT;
			case FuzzingOperationsPackage.FUZZING_OPERATION__PUBLISHING_VARS:
				return publishingVars != null && !publishingVars.isEmpty();
			case FuzzingOperationsPackage.FUZZING_OPERATION__ALL_SUBSCRIBING_VARS:
				return allSubscribingVars != ALL_SUBSCRIBING_VARS_EDEFAULT;
			case FuzzingOperationsPackage.FUZZING_OPERATION__SUBSCRIBING_VARS:
				return subscribingVars != null && !subscribingVars.isEmpty();
			case FuzzingOperationsPackage.FUZZING_OPERATION__FROM_TEMPLATE:
				return fromTemplate != null;
			case FuzzingOperationsPackage.FUZZING_OPERATION__CONTAINING_TEST:
				return getContainingTest() != null;
			case FuzzingOperationsPackage.FUZZING_OPERATION__RECORDED_TIMINGS:
				return recordedTimings != null;
			case FuzzingOperationsPackage.FUZZING_OPERATION__SEED:
				return seed != SEED_EDEFAULT;
			case FuzzingOperationsPackage.FUZZING_OPERATION__SEQUENCE_NUM_IN_TEST:
				return sequenceNumInTest != SEQUENCE_NUM_IN_TEST_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", priority: ");
		result.append(priority);
		result.append(", messagesFromAllComponenents: ");
		result.append(messagesFromAllComponenents);
		result.append(", messagesToAllComponenents: ");
		result.append(messagesToAllComponenents);
		result.append(", allPublishingVars: ");
		result.append(allPublishingVars);
		result.append(", allSubscribingVars: ");
		result.append(allSubscribingVars);
		result.append(", seed: ");
		result.append(seed);
		result.append(", sequenceNumInTest: ");
		result.append(sequenceNumInTest);
		result.append(')');
		return result.toString();
	}

} //FuzzingOperationImpl
