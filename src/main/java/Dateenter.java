import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dateenter {

	public static void main(String[] args) {
 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		driver.findElementByClassName("hasDatepicker");
		//tablecount
		List<WEbElement> ListOfTable = driver.findElementByClassName("ui-datepicker-calendar");
		
		System.out.println("Total Table"+ListOfTable.size());
		
		WebElement Table=ListOfTable.get(0);

		
		
		
	}
	

}
