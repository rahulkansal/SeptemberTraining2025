package TestNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnnotationExample {
	
	WebDriver driver = null;
	
	@BeforeSuite
	public void beforSuite() {
		System.out.println("beforSuite");
	}
	
	@BeforeTest
	public void beforTest() {
		System.out.println("beforTest");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforClass");
	}
	
	@BeforeMethod
	public void beforMethod() {
		System.out.println("beforMethod");
		
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("edge")) {
		 driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	}
	
	@Test
	public void firstTest() {
		
		
		WebElement checkbox = driver.findElement(By.xpath("//label[text()='Option 2']"));
		if(checkbox.isDisplayed() && checkbox.isEnabled() && !checkbox.isSelected()) {
			checkbox.click();
		}
		
		String value = "orange";
		driver.findElement(By.xpath("//input[@value='"+value+"']")).click();
		
	}
	
	@Test
	public void firstTest_2() {
		
		WebElement checkbox = driver.findElement(By.xpath("//label[text()='Option 2']"));
		if(checkbox.isDisplayed() && checkbox.isEnabled() && !checkbox.isSelected()) {
			checkbox.click();
		}
		
		String value = "orange";
		driver.findElement(By.xpath("//input[@value='"+value+"']")).click();
		
	}
	
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
		driver.quit();
	}

}
