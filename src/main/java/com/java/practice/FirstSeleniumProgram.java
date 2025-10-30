package com.java.practice;

public class FirstSeleniumProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverInterface driver = null ;
		String browser = "edge";
		
		if(browser.equalsIgnoreCase("chrome")) {
		
		 driver = new ChromeDriverInterface();
		
		
		} else if(browser.equalsIgnoreCase("edge")) {

		 driver = new EdgeDriverInterface();	
		
		}
		
		driver.get();
		driver.click();
		
		
		
	}

}
