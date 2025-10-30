package com.java.practice;

public class SubRunTimeExample extends SuperRunTimePolymorphism{
	
	public void addition (int a, int b) {
		System.out.println(a+b+400);
	}
	
	public void display() {
		super.addition(30, 40);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubRunTimeExample subRunTimeExample = new SubRunTimeExample();
		subRunTimeExample.addition(2, 10);
		
		subRunTimeExample.display();
	}

}
