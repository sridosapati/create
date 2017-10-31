package create;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeaftapWrappers;

public class Viewlead extends LeaftapWrappers {
	
	public Viewlead(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		if (verifyTitle("View Lead | opentaps CRM")==false) {
			logSteps("fail", "Driver is not landed at View Lead page");
		}	
	}		
	public Viewlead verifyCompanyName()
	{		
		verifyTextById("viewLead_companyName_sp", "aegis");
		return this;
	}
	

}
