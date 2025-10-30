package com.java.practice;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println(100/0);
			} catch (ArithmeticException e1) {
			   // Catch block
				System.out.println(e1);
			}
		
		try {
		int a[] = new int[2];
        System.out.println("Access element three :" + a[3]);
     } 
	catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Exception thrown  :" + e);
     }
		finally{
			System.out.println("Final execution");
		}


		
		System.out.println("Sfter execution");
	}

}
