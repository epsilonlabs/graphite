package TestingMM.design;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import TestingPackage.CampaignResultSet;
import TestingPackage.TestCampaign;

/**
 * The services class used by VSM.
 */
public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public CampaignResultSet getNextCampaignResultSet(CampaignResultSet campaignResultSet) {
    	TestCampaign testCampaign = (TestCampaign)campaignResultSet.eContainer();
    	List<CampaignResultSet> resultSets = testCampaign.getResultSets();
    	int position = resultSets.indexOf(campaignResultSet);
    	if (position == resultSets.size()-1) {
    		return null;
    	}
    	else {
    		return resultSets.get(position+1);
    	}
    }
}
