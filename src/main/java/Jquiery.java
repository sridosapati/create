import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquiery {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//switch to frame
		 WebDriver frame=driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		
		//when u want to perfform an action
		Actions builder =new Actions(driver);
		
		//action drag a box
		WebElement drag=driver.findElementById("draggable");
		
		//drag action
		builder.dragAndDropBy(drag,100,100).build().perform();
		System.out.println("Co-ordinats"+drag.getLocation());
		
	}

}
