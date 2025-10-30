package TestNGTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample {
	
	@Test
	public void TestCase() {
		
		SoftAssert softAssert = new SoftAssert();
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
		
	//	Assert.assertEquals(title, "Google1", "Page title is not matched");
		
		//Assert.assertEquals(title, "Google", "Page title is not matched");
		
		softAssert.assertEquals(title, "Google1", "Page title is not matched");
		
		softAssert.assertEquals(title, "Google", "Page title is not matched");
		
		System.out.println("after assertion");
		
		softAssert.assertAll();
	}

}
