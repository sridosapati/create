package utils;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class Reporter {
	
	
	ExtentReports reports;
	 protected ExtentTest test;
	
	public void CreateReport(){
		
		
		 reports=new ExtentReports(".\reports\report.html",false);
		reports.loadConfig(new File(".\report.xml"));

		
	}
	
	public void CreateTestReport(String testCaaseName,String desc,String author,String category){
		
		reports.startTest("Login,Login to leaftaps application");
		
		test.assignAuthor("authorName");

		test.assignCategory("group");
		
	}
	
	public void LogSteps(String status,String desc){
		
		if(status.equalsIgnoreCase("pass"))
		{
			test.log(LogStatus.PASS, desc);
		}else if(status.equalsIgnoreCase("fail"))
		{
			test.log(LogStatus.FAIL, desc);
			throw new RuntimeException();
		}
		else if(status.equalsIgnoreCase("warning"))
		{
			test.log(LogStatus.WARNING, desc);	
		}
		else if(status.equalsIgnoreCase("skip"))
		{
			test.log(LogStatus.SKIP,desc);	
		}
		else if(status.equalsIgnoreCase("fatal"))
		{
			test.log(LogStatus.FATAL,desc);	
		}
		else if(status.equalsIgnoreCase("unknown"))
		{
			test.log(LogStatus.UNKNOWN,desc);	
		}
		
	}
	
	
	
	
	
	public void closeTestReport(){
		
		reports.endTest(test);

		
		
	}
	
	public void saveReport(){
		
		reports.flush();

		
	}
	
	
	}
