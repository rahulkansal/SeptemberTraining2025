package com.java.practice;

public class OperatorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * int a = 45455, b=10;
		 * 
		 * System.out.println(a/b);
		 * 
		 * System.out.println(a%b);
		 */
		
		
		int a = 5;

        // Pre-increment
        int b = ++a;  // a = 6, then b = 6
        System.out.println("Pre-increment: a = " + a + ", b = " + b);

        a = 5; // reset
        // Post-increment
        int c = a++;  // c = 5, then a = 6
        System.out.println("Post-increment: a = " + a + ", c = " + c);
        
        
        for (int i = 1; i <= 5; ++i) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Decrement in loop
        for (int j = 5; j > 0; j--) {
            System.out.print(j + " ");
        }
        
        int d= 002, f=89;
        
        System.out.println(d==f);
        
        String browser = "chrome" ;
        String enviornment = "sit";
               
        if(!browser.isEmpty() || browser.equalsIgnoreCase("chrome1"))
        {
        	System.out.println("Launch my chrome browser");
        }
        
        int result =  enviornment.equalsIgnoreCase("sit1") ? 1 : 0;
        System.out.println(result);
        
        
	}

}
