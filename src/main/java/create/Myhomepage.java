package create;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeaftapWrappers;

public class Myhomepage extends LeaftapWrappers {
	
	public Myhomepage(RemoteWebDriver driver,ExtentTest test)
	{
		this.driver=driver;
		this.test=test;
		if (verifyTitle("My Home | opentaps CRM")==false) {
			logSteps("fail", "Driver is not landed at My Home page");
		}	
	}	
	public Myleads clickLeadsTab()
	{
		clickByLink("Leads");
		return new Myleads(driver,test);
	}

}
