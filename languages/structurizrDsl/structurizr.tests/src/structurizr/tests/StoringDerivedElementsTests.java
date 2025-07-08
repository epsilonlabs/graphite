package structurizr.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import graphite.shared.DerivedObjectProperties;
import graphite.shared.FilesUtility;
import graphite.shared.Settings;
import structurizr.StructurizrPackage;
import structurizr.Workspace;
import structurizr.impl.XtextContainerViewImpl;
import structurizr.impl.XtextSystemContextViewImpl;

import org.eclipse.epsilon.emc.emf.EmfModel;


public class StoringDerivedElementsTests {
	
	private EmfModel validModel;
	private EmfModel invalidModel;
	private Workspace workspace1;
	private Workspace workspace2;
	
	@Before
	public void setup() throws Exception {	
 		validModel = new EmfModel();
 		validModel.setMetamodelUris((Arrays.asList(StructurizrPackage.eINSTANCE.getNsURI()))); 		
 		validModel.setModelFile(new File(TestsData.MODEL_VALID).getAbsolutePath());
 		validModel.setReadOnLoad(true);
 		validModel.setStoredOnDisposal(false);
 		validModel.load();
 		
 		invalidModel = new EmfModel();
 		invalidModel.setMetamodelUris((Arrays.asList(StructurizrPackage.eINSTANCE.getNsURI()))); 		
 		invalidModel.setModelFile(new File(TestsData.MODEL_INVALID).getAbsolutePath());
 		invalidModel.setReadOnLoad(true);
 		invalidModel.setStoredOnDisposal(false);
 		invalidModel.load();
 		
 		workspace1 = (Workspace)validModel.getResource().getContents().get(0);
 		workspace2 = (Workspace)invalidModel.getResource().getContents().get(0);
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
		assertTrue("First view is XtextContainerViewImpl", workspace1.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace1.getViews().getViewElements().get(0);
		for (DerivedObjectProperties derivedObjectProperties: containerView.getDerivedObjectsProperties().values()) {
			assertFalse("Expression is valid", derivedObjectProperties.isInvalid());
		}
		
		String serializedDerivedElements1 = " <include xsi:type=\"structurizr:ElementTagCondition\" comparisonOperation=\"NOT_EQUALS\" tags=\"//@model/@persons.0/@tags.0\"/>\n"
				+ "      <exclude xsi:type=\"structurizr:CompositeCondition\">\n"
				+ "        <left xsi:type=\"structurizr:RelationshipDestinationCondition\" destination=\"psql\"/>\n"
				+ "        <right xsi:type=\"structurizr:CompositeCondition\" logicalOperation=\"OR\">\n"
				+ "          <left xsi:type=\"structurizr:ElementTagCondition\" tags=\"//@model/@persons.1/@tags.0\"/>\n"
				+ "          <right xsi:type=\"structurizr:CompositeCondition\">\n"
				+ "            <left xsi:type=\"structurizr:RelationshipSourceCondition\" comparisonOperation=\"NOT_EQUALS\" source=\"twx\"/>\n"
				+ "          </right>\n"
				+ "        </right>\n"
				+ "      </exclude>";
		
		String serializedDerivedElements2 = "<include xsi:type=\"structurizr:NoFilterCondition\"/>\n" 
				+ "      <exclude xsi:type=\"structurizr:RelationshipSourceCondition\" source=\"p1\"/>";
		
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
		assertTrue("First view is XtextContainerViewImpl", workspace2.getViews().getViewElements().get(0) instanceof XtextContainerViewImpl);
		XtextContainerViewImpl containerView = (XtextContainerViewImpl) workspace2.getViews().getViewElements().get(0);
		for (DerivedObjectProperties derivedObjectProperties: containerView.getDerivedObjectsProperties().values()) {
			assertTrue("Expression is invalid", derivedObjectProperties.isInvalid());
		}
		
		assertTrue("Second view is XtextSystemContextViewImpl", workspace2.getViews().getViewElements().get(1) instanceof XtextSystemContextViewImpl);
		XtextSystemContextViewImpl systemContextView = (XtextSystemContextViewImpl) workspace2.getViews().getViewElements().get(1);
		for (DerivedObjectProperties derivedObjectProperties: systemContextView.getDerivedObjectsProperties().values()) {
			assertFalse("Expression is valid", derivedObjectProperties.isInvalid());
		}
		
		String serializedDerivedElements1 = " <include xsi:type=\"structurizr:ElementTagCondition\" comparisonOperation=\"NOT_EQUALS\" tags=\"//@model/@persons.0/@tags.0\"/>\n"
				+ "      <exclude xsi:type=\"structurizr:CompositeCondition\">\n"
				+ "        <left xsi:type=\"structurizr:RelationshipDestinationCondition\" destination=\"psql\"/>\n"
				+ "        <right xsi:type=\"structurizr:CompositeCondition\" logicalOperation=\"OR\">\n"
				+ "          <left xsi:type=\"structurizr:ElementTagCondition\" tags=\"//@model/@persons.1/@tags.0\"/>\n"
				+ "          <right xsi:type=\"structurizr:CompositeCondition\">\n"
				+ "            <left xsi:type=\"structurizr:RelationshipSourceCondition\" comparisonOperation=\"NOT_EQUALS\" source=\"twx\"/>\n"
				+ "          </right>\n"
				+ "        </right>\n"
				+ "      </exclude>";
		
		String serializedDerivedElements2 = "<include xsi:type=\"structurizr:NoFilterCondition\"/>\n" 
				+ "      <exclude xsi:type=\"structurizr:RelationshipSourceCondition\" source=\"p1\"/>";
		
		try {
			Settings.setStoreDerivedModelElements(false);
			invalidModel.store();			
			String modelContent = FilesUtility.readNormalizedFile(Path.of(TestsData.MODEL_INVALID));
			assertTrue("Invalid derived elements stored", modelContent.contains(serializedDerivedElements1));
			assertFalse("Valid derived elements not stored", modelContent.contains(serializedDerivedElements2));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
