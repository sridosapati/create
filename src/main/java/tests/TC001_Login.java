package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import create.CrmSfa;
import create.CreateLead;
import create.Homepage;
import create.Loginpage;
import create.Myhomepage;
import create.Myleads;
import wrappers.LeaftapWrappers;


public class TC001_Login extends LeaftapWrappers{
	@BeforeClass
	public void beforeClass() {
		testCaseName="TC001_CreteLead";
		testDesc="Creating Lead";
		author = "hari";
		category = "Smoke";
		excelName="createLead";
	}	
	@Test(dataProvider = "getData")
	public void createLead(String companyName, String firstName, String lastName) {
		new Loginpage(driver, test)
		.typeUserName("DemoSalesManager")
		.typePassword("crmsfa")
		.clickLogin();
								
		new Homepage(driver, test)
		.clickCRMSFAlink();

		new Myhomepage(driver,test)
		.clickLeadsTab();
		
		new Myleads(driver,test)
		.clickCreateLeadTab();
			
	
		new CreateLead()
		.typeCompanyName(companyName)
		.typeFirstName(firstName)
		.typeLastName(lastName)
		.clicksubmitButton();
		
	}

}