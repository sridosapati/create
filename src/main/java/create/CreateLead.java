package create;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeaftapWrappers;

public class CreateLead extends LeaftapWrappers{

	
	
	public CreateLead verifyLead(RemoteWebDriver driver,ExtentTest test){
		this.driver=driver;
		this.test=test;

		if (verifyTitle("Create Lead | opentaps CRM")==false) {
			logSteps("fail", "Driver is not at Create Lead page");
		}	
		return this;
	}
	public CreateLead typeCompanyName(String data){
		enterById("createLeadForm_companyName",data);
		return this;
	}
	
	public CreateLead typeFirstName(String data){
		
		enterById("createLeadForm_firstName",data);
		
		return this;
	}
	public CreateLead typeLastName(String data){
		enterById("createLeadForm_lastName",data);
		
		return this;
	}
	public Viewlead clicksubmitButton(){
		
		clickByClassName("submitButton");
	return new Viewlead(driver,test);
		
	
	}
}

