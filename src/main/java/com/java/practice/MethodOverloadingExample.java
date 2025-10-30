package com.java.practice;

public class MethodOverloadingExample {
	
	public void addition (int a, int b) {
		System.out.println(a+b);
	}
	
	public void addition (double a, int b) {
		System.out.println(a+b);
	}
	
	public void addition (double a, double b) {
		System.out.println(a+b);
	}
	
	public void addition (double a, double b, int c) {
		System.out.println(a+b + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingExample methodOverloadingExample = new MethodOverloadingExample();
		methodOverloadingExample.addition(20.4, 20.5, 10);
	}

}
