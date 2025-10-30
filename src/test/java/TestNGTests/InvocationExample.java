package TestNGTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class InvocationExample {

	@Test(invocationCount=2,threadPoolSize=2, invocationTimeOut=2)
	public void testCase() {
		WebDriver driver = null;
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("edge")) {
		 driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get("https:google.com");
		
		driver.navigate().to("https:facebook.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
		driver.close();
	}
}
