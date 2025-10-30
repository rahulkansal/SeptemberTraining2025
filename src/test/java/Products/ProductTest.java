package Products;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Capabilities.CapabilitiesBase;



public class ProductTest extends CapabilitiesBase{
	
	
	@Test
	public void TC_Addproduct() {
		
		baseClass.maximize(extentTest, "Maximize the browser");
		baseClass.get(testData.get("url"));
		login.login(testData.get("username"),testData.get("password"));		
	}
	
	@Test
	public void TC_Addproduct1() {
		
		driver.manage().window().maximize();
		baseClass.get(testData.get("url"));
		login.login(testData.get("username"),testData.get("password"));
	}

}
