package com.java.practice;


public class StringExample {
	
	static String value = "This is Rahul Automation";
	
	static String price = "price - $2,500";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(value.length());
		System.out.println(price.replaceAll(",", "").substring(price.indexOf("$")+1, price.length()-1));
	}

}
