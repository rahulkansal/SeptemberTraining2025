package TestNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {
	
	//@Test(retryAnalyzer=TestNGTests.RetryTestCaseExample.class)
	@Test
	public void login() throws InterruptedException {
		WebDriver driver = null;
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("edge")) {
		 driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get("https:google.com");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		Assert.assertEquals(title, "Goooogle");

		}


}
