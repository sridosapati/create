package tests;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.DataInputProvider;
import wrappers.LeaftapWrappers;

public class Createlead extends LeaftapWrappers {

	
	@Test(dataProvider="getDataFromExcel")
	public void createLead(String com_name,String FirstName,String lastName) {
		clickByLink("Create Lead");
		enterById("createLeadForm_companyName",com_name);
		enterById("createLeadForm_firstName",FirstName);
		enterById("createLeadForm_lastName",lastName);
		clickByName("submitButton");
	}
	
	@DataProvider(name="getDataFromExcel")
	public Object[][] datafromExcel() throws InvalidFormatException, IOException
	{
		DataInputProvider rfe=new DataInputProvider();
		
		Object[][] dp= rfe.getSheet("CreateLeadData");
		
		return dp;
		
	}
}

