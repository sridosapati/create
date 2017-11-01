package wrappers;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

import utils.DataInputProvider;

//import wrapper.GenericWrappers;

public class LeaftapWrappers extends  GenericWrappers {
	
	

	public String testCaseName, testDesc, author, category,excelName;
	
@BeforeSuite


public void beforeSuite() {
	
	CreateReport();

}

@BeforeTest
public void beforeTest()
{
	
}
@BeforeClass
public void beforeClass()
{
	//@Parameters({"url","browser","author","category","testDesc"})
	
}
//@Parameters({"URL","UserName","Password","Browser"})
@BeforeMethod
public void login()
{
	CreateTestReport(testCaseName, testDesc, author, category);
	invokeApp("chrome","http://leaftaps.com/opentaps");
}
	

@AfterMethod
public void close()
{
	closeBrowser();
	closeTestReport();
}



@AfterClass
public void afterClass()
{
	
}
@AfterTest
public void afterTest(){
	
}
@AfterSuite

public void afterSuite() {
	saveReport();

	
}

@DataProvider(name="getDataFromExcel")
public Object[][] datafromExcel() throws InvalidFormatException, IOException
{
	DataInputProvider re=new DataInputProvider();
	
	Object[][] dp= re.readExcelData(excelName);
	
	return dp;
	
}
}
	
	

	
	/*@Parameters({"url","browser"})
	@BeforeSuite
	
	public void login1(String browser,String url) {
		
		
	}

	
	
	@BeforeTest
	
	
	@BeforeClass
	@BeforeMethod
	

	public void login(String browser,String url) {
		
     invokeApp(url,browser);
		
		//Enter the UserName
		enterById("username", "DemoSalesManager");
		
		//Enter the Password
		enterById("password", "crmsfa");

		//Click on Login Button
		clickByClassName("decorativeSubmit");
	}


	
		
		@AfterMethod
		
		public void close(){
			
			
			
			
			closeBrowser();
		}
	
	@DataProvider(name="Createlead")
	
	public Object[] getCreateLeadData(){
		
		Object[] data = new Object[][]{
			{"Aegis","Hari","Dosapati"}
		};
		return data;
		}
		
	
		
		
	}
*/
		

	


