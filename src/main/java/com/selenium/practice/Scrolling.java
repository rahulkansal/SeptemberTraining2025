package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrolling {

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
		
		driver.get("https://www.webdriveruniversity.com");
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		
     //   js.executeScript("window.scrollBy(0,1000)");
		
        //Find element by link text and store in variable "Element"        		
      WebElement element = driver.findElement(By.id("iframe"));

       //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", element);

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		
	}

}
