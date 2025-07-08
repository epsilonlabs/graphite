package workload.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import graphite.shared.DerivedObjectProperties;
import graphite.shared.FilesUtility;
import graphite.shared.Settings;
import workload.Project;
import workload.WorkloadPackage;
import workload.impl.XtextTaskImpl;

public class StoringDerivedElementsTests {

	private EmfModel validModel;
	private EmfModel invalidModel;
	private Project project1;
	private Project project2;
	
	@Before
	public void setup() throws Exception {
		validModel = new EmfModel();
		validModel.setMetamodelUris((Arrays.asList(WorkloadPackage.eINSTANCE.getNsURI()))); 		
		validModel.setModelFile(new File(TestsData.MODEL_VALID).getAbsolutePath());
		validModel.setReadOnLoad(true);
		validModel.setStoredOnDisposal(false);
		validModel.load();
		
		invalidModel = new EmfModel();
		invalidModel.setMetamodelUris((Arrays.asList(WorkloadPackage.eINSTANCE.getNsURI()))); 		
		invalidModel.setModelFile(new File(TestsData.MODEL_INVALID).getAbsolutePath());
		invalidModel.setReadOnLoad(true);
		invalidModel.setStoredOnDisposal(false);
		invalidModel.load();
		
 		project1 = (Project)validModel.getResource().getContents().get(0);
 		project2 = (Project)invalidModel.getResource().getContents().get(0);
	}
	
	@After
	public void teardown() {
	    if (validModel != null) {
	    	validModel.getResource().unload();
	    }
	    if (invalidModel != null) {
	    	invalidModel.getResource().unload();
	    }
	}
	
	@Test
	public void storeValidDerivedElements() {
		assertTrue("The task is of type XtextTaskImpl", project1.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl task = (XtextTaskImpl)project1.getTasks().get(2);
		for (DerivedObjectProperties derivedObjectProperties: task.getDerivedObjectsProperties().values()) {
			assertFalse("Expression is valid", derivedObjectProperties.isInvalid());
		}
		
		String serializedDerivedElements1 = "<efforts person=\"//@people.0\" months=\"6\"/>\n"
				+ "    <efforts months=\"4\"/>";
		
		String serializedDerivedElements2 = "<efforts person=\"//@people.0\" months=\"3\"/>\n"
				+ "    <efforts person=\"//@people.1\" months=\"6\"/>\n"
				+ "    <efforts person=\"//@people.2\" months=\"8\"/>";
		
		try {
			Settings.setStoreDerivedModelElements(false);
			validModel.store();			
			String modelContent = FilesUtility.readNormalizedFile(Path.of(TestsData.MODEL_VALID));
			assertFalse("First valid derived elements not stored", modelContent.contains(serializedDerivedElements1));
			assertFalse("Last valid derived elements not stored", modelContent.contains(serializedDerivedElements2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void storeInvalidDerivedElements() {
		assertTrue("The task is of type XtextTaskImpl", project2.getTasks().get(0) instanceof XtextTaskImpl);
		XtextTaskImpl analysisTask = (XtextTaskImpl)project2.getTasks().get(0);
		for (DerivedObjectProperties derivedObjectProperties: analysisTask.getDerivedObjectsProperties().values()) {
			assertFalse("Expression is valid", derivedObjectProperties.isInvalid());
		}		
		assertTrue("The task is of type XtextTaskImpl", project2.getTasks().get(2) instanceof XtextTaskImpl);
		XtextTaskImpl implementationTask = (XtextTaskImpl)project2.getTasks().get(2);
		for (DerivedObjectProperties derivedObjectProperties: implementationTask.getDerivedObjectsProperties().values()) {
			assertTrue("Expression is invalid", derivedObjectProperties.isInvalid());
		}
		
		String serializedDerivedElements1 = "<efforts person=\"//@people.0\" months=\"6\"/>\n"
				+ "    <efforts months=\"4\"/>";
		
		String serializedDerivedElements2 = "<efforts person=\"//@people.0\" months=\"3\"/>\n"
				+ "    <efforts person=\"//@people.1\" months=\"6\"/>\n"
				+ "    <efforts person=\"//@people.2\" months=\"8\"/>";
		
		try {
			Settings.setStoreDerivedModelElements(false);
			invalidModel.store();
			String modelContent = FilesUtility.readNormalizedFile(Path.of(TestsData.MODEL_INVALID));
			assertFalse("Valid derived elements not stored", modelContent.contains(serializedDerivedElements1));
			assertTrue("Invalid derived elements stored", modelContent.contains(serializedDerivedElements2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
