package com.java.practice;

public class InheritanceExample extends Employee{
	
	double shippingCharges;
	String domainName;
	
	public void assignDomainName(String domainValue) {
		domainName = domainValue;
		System.out.println(domainName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceExample inheritanceExample = new InheritanceExample();
		inheritanceExample.calculateSalary();
	}

}
