package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowsExample {

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
		
		driver.get("https://www.webdriveruniversity.com/");
		
		driver.findElement(By.id("login-portal")).click();
		
		//Store the ID of the original window
		String originalWindow = driver.getWindowHandle();
		System.out.println(originalWindow);
		
		//Loop through until we find a new window handle
		for (String windowHandle : driver.getWindowHandles()) {
		    if(!originalWindow.contentEquals(windowHandle)) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}

		driver.findElement(By.id("text")).sendKeys("username");
		driver.findElement(By.id("password")).sendKeys("password");
		
		driver.close();
		
		driver.switchTo().window(originalWindow);
		
		driver.findElement(By.id("contact-us")).click();
		
		
		
	}

}
