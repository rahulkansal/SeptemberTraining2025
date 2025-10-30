package com.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable {

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
		
		driver.get("https://www.webdriveruniversity.com//Data-Table/index.html");
		
		int rows = driver.findElements(By.xpath("//table[@id='t01']//tr")).size();
		
		int columns = driver.findElements(By.xpath("//table[@id='t01']//tr[1]//th")).size();
		
		System.out.println(rows);
		System.out.println(columns);
		
		int rowNumber = 3;
		int	columnNumber = 1;
		String value = driver.findElement(By.xpath("//table[@id='t01']//tr["+rowNumber+"]//td["+columnNumber+"]")).getText();
		System.out.println(value);
		
		
		
	}

}
