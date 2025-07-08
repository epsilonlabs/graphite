package workload.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Arrays;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import graphite.shared.Settings;
import workload.Project;
import workload.WorkloadPackage;
import workload.impl.XtextTaskImpl;

public class ModifyingTextualExpressionsTests {

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
	public void deleteReference() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(2);
		assertEquals("Task has the initial expected efforts", "Alice : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
		task.setEffortsExpression(": 3\nBob : 6\nCharlie : 8");
		assertEquals("Effort has null person", null, task.getEfforts().get(0).getPerson());
	}
	
	@Test
	public void deleteElement() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(2);
		assertEquals("Task has the initial expected efforts", "Alice : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
		assertTrue("Task has three efforts", task.getEfforts().size() == 3);
		task.setEffortsExpression("Alice : 3\nBob : 6");
		assertTrue("Task has two efforts", task.getEfforts().size() == 2);
	}
	
	@Test
	public void deleteAllElements() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(2);
		assertEquals("Task has the initial expected efforts", "Alice : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
		assertTrue("Task has three efforts", task.getEfforts().size() == 3);
		task.setEffortsExpression("");
		assertTrue("Task has no efforts", task.getEfforts().isEmpty());
	}
	
	@Test
	public void changeReference() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(2);
		assertEquals("Task has the initial expected efforts", "Alice : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
		task.setEffortsExpression("Charlie : 3\nBob : 6\nCharlie : 8");
		assertEquals("Effort has changed person", project.getPeople().get(2), task.getEfforts().get(0).getPerson());
	}
	
	@Test
	public void changeValue() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(2);
		assertEquals("Task has the initial expected efforts", "Alice : 3\nBob : 6\nCharlie : 8", task.getEffortsExpression());
		task.setEffortsExpression("Alice : 5\nBob : 6\nCharlie : 8");
		assertEquals("Effort has expected months", 5, task.getEfforts().get(0).getMonths());
	}
	
	@Test
	public void addElement() {
		assertTrue("The task is of type XtextTaskImpl", project.getTasks().get(1) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project.getTasks().get(1);
		assertEquals("Task has the initial expected efforts", null, task.getEffortsExpression());
		assertTrue("Task has no efforts", task.getEfforts().isEmpty());
		task.setEffortsExpression("Alice : 5");
		assertTrue("Task has one effort", task.getEfforts().size() == 1);
		assertEquals("Effort has expected person", project.getPeople().get(0), task.getEfforts().get(0).getPerson());
		assertEquals("Effort has expected months", 5, task.getEfforts().get(0).getMonths());
	}
	
}
