package com.selenium.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertPopUp {

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
		
		driver.get("https://www.webdriveruniversity.com/Popup-Alerts/index.html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		
		WebElement button = driver.findElement(By.id("button4"));

        js.executeScript("arguments[0].click();", button);

		//driver.findElement(By.id("button4")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String value = alert.getText();
		System.out.println(value);

		//alert.accept();
		
		alert.dismiss();
	}

}
