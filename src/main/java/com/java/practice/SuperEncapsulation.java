package com.java.practice;

public class SuperEncapsulation {
	
	private String name;
	
	final int age = 30;
	
	int baseSalary = 50;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		baseSalary = 600;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
