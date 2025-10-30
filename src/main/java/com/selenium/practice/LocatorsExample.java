package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class LocatorsExample {

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
		
		driver.get("https:google.com");
		
		 driver.findElement(By.id("APjFqb")).sendKeys("Rahul Automation Studio");
		
		//driver.findElement(By.name("q")).sendKeys("Rahul Automation Studio");
		

		
		
		driver.findElement(By.linkText("हिन्दी")).click();
		
		driver.findElement(By.partialLinkText("Engl")).click();
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(WebElement element : links) {
			System.out.println(element.getText().trim());
		}
		driver.findElement(By.className("gLFyf")).sendKeys("Rahul Automation Studio");
		//driver.findElement(By.xpath("(//input[@aria-label='Google Search'])[2]")).click();
		
		driver.findElement(By.className("gLFyf")).clear();
		driver.findElement(By.className("gLFyf")).sendKeys("Rahul Automation Studio");
		
		driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
		
		
		
		
		
	}

}
