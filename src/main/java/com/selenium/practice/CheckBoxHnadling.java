package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBoxHnadling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("edge")) {
		 driver = new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		WebElement checkbox = driver.findElement(By.xpath("//label[text()='Option 2']"));
		if(checkbox.isDisplayed() && checkbox.isEnabled() && !checkbox.isSelected()) {
			checkbox.click();
		}
		
		String value = "orange";
		driver.findElement(By.xpath("//input[@value='"+value+"']")).click();
		
		
	}

}
