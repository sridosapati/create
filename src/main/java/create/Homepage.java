package create;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeaftapWrappers;

public class Homepage extends LeaftapWrappers {
	
	public Homepage(RemoteWebDriver driver,ExtentTest test)
	{
      this.driver=driver;
      this.test=test;
		if (verifyTitle("Opentaps Open Source ERP + CRM")==false) {
			logSteps("fail", "Driver is not landed in the Home page");
		}	
	}	
	public Myhomepage clickCRMSFAlink()
	{
		clickByLink("CRM/SFA");
		return new Myhomepage(driver,test);
	}
	public Loginpage clickLogOut()
	{
		clickByClassName("decorativeSubmit");
		return new Loginpage(driver,test);
}
}