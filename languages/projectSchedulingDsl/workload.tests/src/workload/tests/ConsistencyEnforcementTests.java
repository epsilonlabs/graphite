package workload.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import graphite.shared.Settings;
import workload.Person;
import workload.Project;
import workload.WorkloadFactory;
import workload.WorkloadPackage;
import workload.impl.XtextTaskImpl;

import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;

public class ConsistencyEnforcementTests {

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
	public void changedNameOfReference() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(2);
		assertEquals("Task has the initial expected efforts", "Alice : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
		Person person = project.getPeople().get(0);
		person.setName("AliceX");
		assertEquals("Task has the final expected efforts", "AliceX : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
	}
	
	@Test
	public void deletedReference() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(2);
		assertEquals("Task has the initial expected efforts", "Alice : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
		Person person = project.getPeople().get(0);
		try {
			model.deleteElement(person);
		} catch (EolRuntimeException e) {
			e.printStackTrace();
		}
		assertEquals("Task has the final expected efforts", ": 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
	}
	
	@Test
	public void invalidExpressionBecomingValid() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(2);
		assertEquals("Task has the initial expected efforts", "Alice : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
		task.setEffortsExpression("David : 3\nBob : 6\nCharlie : 8");
		WorkloadFactory workloadFactory = workload.impl.WorkloadFactoryImpl.init();
		Person person = workloadFactory.createPerson();
		project.getPeople().add(person);
		person.setName("David");
		assertEquals("David is the new person", person, task.getEfforts().get(0).getPerson());
	}
	
}
