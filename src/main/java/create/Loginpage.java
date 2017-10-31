package create;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeaftapWrappers;

public class Loginpage extends LeaftapWrappers{
	
	public Loginpage(RemoteWebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;
	}
	{
		if (verifyTitle("Opentaps Open Source ERP + CRM")==false) {
			logSteps("fail", "Driver is not landed in the login page");
		}	
	}
	
	
	public Loginpage typeUserName(String userName)
	{
		enterById("username", userName);
		return this;
	}	
	
	public Loginpage typePassword(String password)
	{
		enterById("password", password);
		return this;
	
	}
	public Homepage clickLogin()
	{
		clickByClassName("decorativeSubmit");
		return new Homepage(driver,test);
	}
	
	
	
}




