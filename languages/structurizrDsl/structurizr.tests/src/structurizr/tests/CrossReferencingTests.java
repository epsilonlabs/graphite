package structurizr.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Arrays;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import graphite.shared.Settings;
import structurizr.NoFilterCondition;
import structurizr.Person;
import structurizr.RelationshipSourceCondition;
import structurizr.StructurizrPackage;
import structurizr.Workspace;
import structurizr.impl.XtextSystemContextViewImpl;


public class CrossReferencingTests {

	private EmfModel model;
	private Workspace workspace;
	
	@Before
	public void setup() throws Exception {
		Settings.setMergeDerivedModelElements(false);
 		model = new EmfModel();
 		model.setMetamodelUris((Arrays.asList(StructurizrPackage.eINSTANCE.getNsURI()))); 		
 		model.setModelFile(new File(TestsData.MODEL).getAbsolutePath());
 		model.setReadOnLoad(true);
 		model.setStoredOnDisposal(false);
 		model.load();
 		workspace = (Workspace)model.getResource().getContents().get(0);
	}
	
	@After
	public void teardown() {
	    if (model != null) {
	    	model.getResource().unload();
	    }
	}
	
	@Test
	public void expressionWithCrossReference() {
		assertTrue("First view is XtextSystemContextViewImpl", workspace.getViews().getViewElements().get(1) instanceof XtextSystemContextViewImpl);
		XtextSystemContextViewImpl systemContextView = (XtextSystemContextViewImpl) workspace.getViews().getViewElements().get(1);
		assertEquals("SystemContextView has the initial expected exclude", "(relationship.source==p1)", systemContextView.getExcludeExpression());
		assertTrue("Exclude condition is RelationshipSourceCondition", systemContextView.getExclude() instanceof RelationshipSourceCondition);
		RelationshipSourceCondition relationshipSourceCondition = (RelationshipSourceCondition)systemContextView.getExclude();
		EList<EObject> references = relationshipSourceCondition.eCrossReferences();
		Person person = workspace.getModel().getPersons().get(0);
		assertEquals("Expression with cross reference", person, references.get(0));
	}
	
	@Test
	public void expressionWithoutCrossReference() {
		assertTrue("First view is XtextSystemContextViewImpl", workspace.getViews().getViewElements().get(1) instanceof XtextSystemContextViewImpl);
		XtextSystemContextViewImpl systemContextView = (XtextSystemContextViewImpl) workspace.getViews().getViewElements().get(1);
		assertEquals("SystemContextView has the initial expected include", "*", systemContextView.getIncludeExpression());
		assertTrue("Include condition is NoFilterCondition", systemContextView.getInclude() instanceof NoFilterCondition);
		NoFilterCondition noFilterCondition = (NoFilterCondition)systemContextView.getInclude();
		EList<EObject> references = noFilterCondition.eCrossReferences();
		assertTrue("Expression without cross reference", references.isEmpty());
	}
	
}
