package create;


import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeaftapWrappers;

public class Myleads extends LeaftapWrappers {
	
		
		public Myleads(RemoteWebDriver driver,ExtentTest test)
		{
			this.driver=driver;
			this.test=test;
			if (verifyTitle("My Leads | opentaps CRM")==false) {
				logSteps("fail", "Driver is not landed at My Lead page");
			}	
		}	
		public CreateLead clickCreateLeadTab()
		{
			clickByLink("Create Lead");
			return new CreateLead();
	}

}
