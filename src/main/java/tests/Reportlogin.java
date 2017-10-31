package tests;

import java.io.File;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
@Test
public class Reportlogin {
	
	
	ExtentReports reports;
	ExtentTest test;
	

	public void report() {
		
		ExtentReports reports=new ExtentReports("./reports/report.html",false);
		reports.loadConfig(new File("./report.xml"));

		
		
		ExtentTest test=reports.startTest("Login,Login to leaftaps application");
		
		test.log(LogStatus.PASS, "User is logged in successfully");
		test.log(LogStatus.PASS, "Username Sent successfully");
		test.log(LogStatus.PASS,"Password Sent successfully");
		
		test.assignAuthor("hari");
		test.assignCategory("test");
		reports.endTest(test);
		reports.flush();
		
		
		
		
		
		
		
		
		

	}

}
