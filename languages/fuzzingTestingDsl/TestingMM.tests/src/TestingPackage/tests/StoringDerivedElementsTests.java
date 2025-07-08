package TestingPackage.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

import org.eclipse.epsilon.emc.emf.EmfModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import TestingPackage.TestingMMPackage;
import TestingPackage.TestingSpace;
import TestingPackage.FuzzingOperations.RandomValueFromSetOperation;
import TestingPackage.FuzzingOperations.impl.XtextConditionBasedActivationImpl;
import graphite.shared.DerivedObjectProperties;
import graphite.shared.FilesUtility;
import graphite.shared.Settings;

public class StoringDerivedElementsTests {

	private EmfModel validModel;
	private EmfModel invalidModel;
	private TestingSpace testingSpace1;
	private TestingSpace testingSpace2;
	
	@Before
	public void setup() throws Exception { 		
 		validModel = new EmfModel();
 		validModel.setMetamodelUris((Arrays.asList(TestingMMPackage.eINSTANCE.getNsURI()))); 		
 		validModel.setModelFile(new File(TestsData.MODEL_VALID).getAbsolutePath());
 		validModel.setReadOnLoad(true);
 		validModel.setStoredOnDisposal(false);
 		validModel.load();
 		
 		invalidModel = new EmfModel();
 		invalidModel.setMetamodelUris((Arrays.asList(TestingMMPackage.eINSTANCE.getNsURI()))); 		
 		invalidModel.setModelFile(new File(TestsData.MODEL_INVALID).getAbsolutePath());
 		invalidModel.setReadOnLoad(true);
 		invalidModel.setStoredOnDisposal(false);
 		invalidModel.load();
 		
 		testingSpace1 = (TestingSpace)validModel.getResource().getContents().get(0);
 		testingSpace2 = (TestingSpace)invalidModel.getResource().getContents().get(0);
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
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace1.getCampaigns().get(0).getPerformedTests().get(1).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		for (DerivedObjectProperties derivedObjectProperties: conditionBasedActivation.getDerivedObjectsProperties().values()) {
			assertFalse("Expression is valid", derivedObjectProperties.isInvalid());
		}
		
		String serializedDerivedElements1 = "<starting>\n"
				+ "            <c xsi:type=\"_2:CompositeCondition\" binop=\"OR\">\n"
				+ "              <left xsi:type=\"_2:BasicCondition\" bincomp=\"GREATER_THAN\">\n"
				+ "                <left metric=\"_2fP74GBMEe27gLEnzzOoKw\"/>\n"
				+ "              </left>\n"
				+ "            </c>\n"
				+ "          </starting>";
		
		String serializedDerivedElements2 = "<ending>\n"
				+ "            <c xsi:type=\"_2:CompositeCondition\">\n"
				+ "              <left xsi:type=\"_2:BasicCondition\" bincomp=\"GREATER_THAN\">\n"
				+ "                <left/>\n"
				+ "                <right xsi:type=\"_2:ConditionVariable\" metric=\"__GkGIHCWEe2Y6ZOMdkM14Q\"/>\n"
				+ "              </left>\n"
				+ "              <right xsi:type=\"_2:BasicCondition\" bincomp=\"GREATER_THAN\">\n"
				+ "                <left metric=\"_2fP74GBMEe27gLEnzzOoKw\"/>\n"
				+ "                <right xsi:type=\"_2:ConditionInteger\" value=\"5\"/>\n"
				+ "              </right>\n"
				+ "            </c>\n"
				+ "          </ending>";
		
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
		RandomValueFromSetOperation randomValueFromSetOperation = (RandomValueFromSetOperation)testingSpace2.getCampaigns().get(0).getPerformedTests().get(1).getOperations().get(0);
		XtextConditionBasedActivationImpl conditionBasedActivation = (XtextConditionBasedActivationImpl)randomValueFromSetOperation.getActivation();
		ArrayList<DerivedObjectProperties> derivedObjectValues = new ArrayList<>(conditionBasedActivation.getDerivedObjectsProperties().values());	
		assertTrue("Expression is invalid", derivedObjectValues.get(0).isInvalid());
		assertFalse("Expression is valid", derivedObjectValues.get(1).isInvalid());
	
		String serializedDerivedElements1 = "<starting>\n"
				+ "            <c xsi:type=\"_2:CompositeCondition\" binop=\"OR\">\n"
				+ "              <left xsi:type=\"_2:BasicCondition\" bincomp=\"GREATER_THAN\">\n"
				+ "                <left metric=\"_2fP74GBMEe27gLEnzzOoKw\"/>\n"
				+ "              </left>\n"
				+ "            </c>\n"
				+ "          </starting>";
		
		String serializedDerivedElements2 = "<ending>\n"
				+ "            <c xsi:type=\"_2:CompositeCondition\">\n"
				+ "              <left xsi:type=\"_2:BasicCondition\" bincomp=\"GREATER_THAN\">\n"
				+ "                <left/>\n"
				+ "                <right xsi:type=\"_2:ConditionVariable\" metric=\"__GkGIHCWEe2Y6ZOMdkM14Q\"/>\n"
				+ "              </left>\n"
				+ "              <right xsi:type=\"_2:BasicCondition\" bincomp=\"GREATER_THAN\">\n"
				+ "                <left metric=\"_2fP74GBMEe27gLEnzzOoKw\"/>\n"
				+ "                <right xsi:type=\"_2:ConditionInteger\" value=\"5\"/>\n"
				+ "              </right>\n"
				+ "            </c>\n"
				+ "          </ending>";
		
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
