package com.java.practice;

public class JvaDecisionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser = "chrome";
		String enviorment = "UAT";
		
//		if(browser.equalsIgnoreCase("chrome") || browser.equalsIgnoreCase("safari")) {
//			//launch the browser
//			System.out.println("Chrome browser");
//			if(enviorment.equalsIgnoreCase("sit")) {
//				//launch the url
//				System.out.println("sit url");
//			} else {
//				//launch the url
//				System.out.println("uat url");
//			}
//			
//		} else if(browser.equalsIgnoreCase("edge")) {
//			System.out.println("Edge browser");
//			
//		} else if(browser.equalsIgnoreCase("firefox")) {
//			System.out.println("firefox browser");
//			
//		}
//		else {
//			System.out.println("Chrome browser");
//		}
		
		
		switch(browser) {
		case "chrome":
			System.out.println("Chrome browser");
			break;
		case "edge":
			System.out.println("Edge browser");	
			break;
		case "Firefox":
		case "Safari":
			System.out.println("Firefox browser");	
			break;	
		default :
			System.out.println("Chrome browser");
				
		}
		
		
		for(int x = 1; x < 10; x ++) {
	         System.out.println("value of x : " + x );
	      }
		
		
		for(int x = 1; x < 10; x ++) {
	         System.out.println("value of x : " + x );
		if(x == 5){
		break; }
	     }
		
		for(int x = 1; x < 10; x ++) {
            if(x == 5){
            	continue; }
            System.out.println("value of x : " + x );
        }




	}

}
