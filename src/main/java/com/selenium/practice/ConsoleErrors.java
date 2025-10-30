package com.selenium.practice;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;

public class ConsoleErrors {

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
		
		driver.get("https://www.makemytrip.com/");
		
		LogEntries logs = driver.manage().logs().get("browser");
		List<LogEntry> allLogs = logs.getAll();
		
		for(LogEntry logValue : allLogs) {
			System.out.println(logValue.getMessage());
		}

	}

}
