/**
 */
package TestingPackage.FuzzingOperations;

import TestingPackage.MRSPackage.Node;
import TestingPackage.MRSPackage.Variable;

import TestingPackage.Test;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuzzing Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TestingPackage.FuzzingOperations.FuzzingOperation#getName <em>Name</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.FuzzingOperation#getPriority <em>Priority</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.FuzzingOperation#getActivation <em>Activation</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.FuzzingOperation#getVariableToAffect <em>Variable To Affect</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.FuzzingOperation#isMessagesFromAllComponenents <em>Messages From All Componenents</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.FuzzingOperation#getFromNodes <em>From Nodes</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.FuzzingOperation#isMessagesToAllComponenents <em>Messages To All Componenents</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.FuzzingOperation#getToNodes <em>To Nodes</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.FuzzingOperation#getNodeToFuzz <em>Node To Fuzz</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.FuzzingOperation#isAllPublishingVars <em>All Publishing Vars</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.FuzzingOperation#getPublishingVars <em>Publishing Vars</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.FuzzingOperation#isAllSubscribingVars <em>All Subscribing Vars</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.FuzzingOperation#getSubscribingVars <em>Subscribing Vars</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.FuzzingOperation#getFromTemplate <em>From Template</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.FuzzingOperation#getContainingTest <em>Containing Test</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.FuzzingOperation#getRecordedTimings <em>Recorded Timings</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.FuzzingOperation#getSeed <em>Seed</em>}</li>
 *   <li>{@link TestingPackage.FuzzingOperations.FuzzingOperation#getSequenceNumInTest <em>Sequence Num In Test</em>}</li>
 * </ul>
 *
 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getFuzzingOperation()
 * @model abstract="true"
 * @generated
 */
public interface FuzzingOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getFuzzingOperation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.FuzzingOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getFuzzingOperation_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.FuzzingOperation#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Activation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation</em>' containment reference.
	 * @see #setActivation(Activation)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getFuzzingOperation_Activation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Activation getActivation();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.FuzzingOperation#getActivation <em>Activation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation</em>' containment reference.
	 * @see #getActivation()
	 * @generated
	 */
	void setActivation(Activation value);

	/**
	 * Returns the value of the '<em><b>Variable To Affect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable To Affect</em>' reference.
	 * @see #setVariableToAffect(Variable)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getFuzzingOperation_VariableToAffect()
	 * @model
	 * @generated
	 */
	Variable getVariableToAffect();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.FuzzingOperation#getVariableToAffect <em>Variable To Affect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable To Affect</em>' reference.
	 * @see #getVariableToAffect()
	 * @generated
	 */
	void setVariableToAffect(Variable value);

	/**
	 * Returns the value of the '<em><b>Messages From All Componenents</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages From All Componenents</em>' attribute.
	 * @see #setMessagesFromAllComponenents(boolean)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getFuzzingOperation_MessagesFromAllComponenents()
	 * @model default="true"
	 * @generated
	 */
	boolean isMessagesFromAllComponenents();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.FuzzingOperation#isMessagesFromAllComponenents <em>Messages From All Componenents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Messages From All Componenents</em>' attribute.
	 * @see #isMessagesFromAllComponenents()
	 * @generated
	 */
	void setMessagesFromAllComponenents(boolean value);

	/**
	 * Returns the value of the '<em><b>From Nodes</b></em>' reference list.
	 * The list contents are of type {@link TestingPackage.MRSPackage.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Nodes</em>' reference list.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getFuzzingOperation_FromNodes()
	 * @model
	 * @generated
	 */
	EList<Node> getFromNodes();

	/**
	 * Returns the value of the '<em><b>Messages To All Componenents</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages To All Componenents</em>' attribute.
	 * @see #setMessagesToAllComponenents(boolean)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getFuzzingOperation_MessagesToAllComponenents()
	 * @model default="true"
	 * @generated
	 */
	boolean isMessagesToAllComponenents();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.FuzzingOperation#isMessagesToAllComponenents <em>Messages To All Componenents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Messages To All Componenents</em>' attribute.
	 * @see #isMessagesToAllComponenents()
	 * @generated
	 */
	void setMessagesToAllComponenents(boolean value);

	/**
	 * Returns the value of the '<em><b>To Nodes</b></em>' reference list.
	 * The list contents are of type {@link TestingPackage.MRSPackage.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Nodes</em>' reference list.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getFuzzingOperation_ToNodes()
	 * @model
	 * @generated
	 */
	EList<Node> getToNodes();

	/**
	 * Returns the value of the '<em><b>Node To Fuzz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node To Fuzz</em>' reference.
	 * @see #setNodeToFuzz(Node)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getFuzzingOperation_NodeToFuzz()
	 * @model
	 * @generated
	 */
	Node getNodeToFuzz();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.FuzzingOperation#getNodeToFuzz <em>Node To Fuzz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node To Fuzz</em>' reference.
	 * @see #getNodeToFuzz()
	 * @generated
	 */
	void setNodeToFuzz(Node value);

	/**
	 * Returns the value of the '<em><b>All Publishing Vars</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Publishing Vars</em>' attribute.
	 * @see #setAllPublishingVars(boolean)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getFuzzingOperation_AllPublishingVars()
	 * @model default="false"
	 * @generated
	 */
	boolean isAllPublishingVars();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.FuzzingOperation#isAllPublishingVars <em>All Publishing Vars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Publishing Vars</em>' attribute.
	 * @see #isAllPublishingVars()
	 * @generated
	 */
	void setAllPublishingVars(boolean value);

	/**
	 * Returns the value of the '<em><b>Publishing Vars</b></em>' reference list.
	 * The list contents are of type {@link TestingPackage.MRSPackage.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publishing Vars</em>' reference list.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getFuzzingOperation_PublishingVars()
	 * @model
	 * @generated
	 */
	EList<Variable> getPublishingVars();

	/**
	 * Returns the value of the '<em><b>All Subscribing Vars</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Subscribing Vars</em>' attribute.
	 * @see #setAllSubscribingVars(boolean)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getFuzzingOperation_AllSubscribingVars()
	 * @model default="false"
	 * @generated
	 */
	boolean isAllSubscribingVars();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.FuzzingOperation#isAllSubscribingVars <em>All Subscribing Vars</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>All Subscribing Vars</em>' attribute.
	 * @see #isAllSubscribingVars()
	 * @generated
	 */
	void setAllSubscribingVars(boolean value);

	/**
	 * Returns the value of the '<em><b>Subscribing Vars</b></em>' reference list.
	 * The list contents are of type {@link TestingPackage.MRSPackage.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribing Vars</em>' reference list.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getFuzzingOperation_SubscribingVars()
	 * @model
	 * @generated
	 */
	EList<Variable> getSubscribingVars();

	/**
	 * Returns the value of the '<em><b>From Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Template</em>' reference.
	 * @see #setFromTemplate(FuzzingOperation)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getFuzzingOperation_FromTemplate()
	 * @model
	 * @generated
	 */
	FuzzingOperation getFromTemplate();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.FuzzingOperation#getFromTemplate <em>From Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Template</em>' reference.
	 * @see #getFromTemplate()
	 * @generated
	 */
	void setFromTemplate(FuzzingOperation value);

	/**
	 * Returns the value of the '<em><b>Containing Test</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link TestingPackage.Test#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containing Test</em>' container reference.
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getFuzzingOperation_ContainingTest()
	 * @see TestingPackage.Test#getOperations
	 * @model opposite="operations" changeable="false"
	 * @generated
	 */
	Test getContainingTest();

	/**
	 * Returns the value of the '<em><b>Recorded Timings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorded Timings</em>' containment reference.
	 * @see #setRecordedTimings(FixedTimeActivation)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getFuzzingOperation_RecordedTimings()
	 * @model containment="true"
	 * @generated
	 */
	FixedTimeActivation getRecordedTimings();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.FuzzingOperation#getRecordedTimings <em>Recorded Timings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorded Timings</em>' containment reference.
	 * @see #getRecordedTimings()
	 * @generated
	 */
	void setRecordedTimings(FixedTimeActivation value);

	/**
	 * Returns the value of the '<em><b>Seed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seed</em>' attribute.
	 * @see #setSeed(int)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getFuzzingOperation_Seed()
	 * @model
	 * @generated
	 */
	int getSeed();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.FuzzingOperation#getSeed <em>Seed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seed</em>' attribute.
	 * @see #getSeed()
	 * @generated
	 */
	void setSeed(int value);

	/**
	 * Returns the value of the '<em><b>Sequence Num In Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequence Num In Test</em>' attribute.
	 * @see #setSequenceNumInTest(int)
	 * @see TestingPackage.FuzzingOperations.FuzzingOperationsPackage#getFuzzingOperation_SequenceNumInTest()
	 * @model
	 * @generated
	 */
	int getSequenceNumInTest();

	/**
	 * Sets the value of the '{@link TestingPackage.FuzzingOperations.FuzzingOperation#getSequenceNumInTest <em>Sequence Num In Test</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sequence Num In Test</em>' attribute.
	 * @see #getSequenceNumInTest()
	 * @generated
	 */
	void setSequenceNumInTest(int value);

} // FuzzingOperation
