package TestNGTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersExample {

	
	@DataProvider(name = "test1",parallel=true)
	public Object[][] createData1() {
	 return new Object[][] {
	   { "Cedric", "hggfgf" },
	   { "Anne", "dfdfdff"},
	 };
	}
	
	
	@Test(dataProvider = "test1")
	public void verifyData1(String username, String password) {
	 System.out.println(username + " " + password);
	 
	 WebDriver driver = null;
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("edge")) {
		 driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get("https:google.com");
	 
	 
	}

	
	
}
