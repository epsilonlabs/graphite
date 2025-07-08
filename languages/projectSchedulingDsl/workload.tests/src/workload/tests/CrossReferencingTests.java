package workload.tests;

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
import workload.Effort;
import workload.Person;
import workload.Project;
import workload.WorkloadPackage;
import workload.impl.XtextTaskImpl;

public class CrossReferencingTests {

	private EmfModel model;
	private Project project;
	
	@Before
	public void setup() throws Exception {
		Settings.setMergeDerivedModelElements(false);
 		model = new EmfModel();
 		model.setMetamodelUris((Arrays.asList(WorkloadPackage.eINSTANCE.getNsURI()))); 		
 		model.setModelFile(new File(TestsData.MODEL).getAbsolutePath());
 		model.setReadOnLoad(true);
 		model.setStoredOnDisposal(false);
 		model.load();
 		project = (Project)model.getResource().getContents().get(0); 		
	}
	
	@After
	public void teardown() {
	    if (model != null) {
	    	model.getResource().unload();
	    }
	}
	
	@Test
	public void expressionWithCrossReference() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(2);
		assertEquals("Task has the initial expected efforts", "Alice : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
		Effort effort = task.getEfforts().get(0);
		EList<EObject> references = effort.eCrossReferences();
		Person person = project.getPeople().get(0);
		assertEquals("Expression with cross reference", person, references.get(0));
	}
	
	@Test
	public void expressionWithoutCrossReference() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(0) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(0);
		assertEquals("Task has the initial expected efforts", "Alice : 6\n: 4", task.getEffortsExpression());
		Effort effort = task.getEfforts().get(1);
		EList<EObject> references = effort.eCrossReferences();
		assertTrue("Expression without cross reference", references.isEmpty());
	}
	
}
