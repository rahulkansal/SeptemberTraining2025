package com.java.practice;

public class Employee {
	
	public String name;
	protected int age;
	static String department = "IT";
    int salary;
     
   
	public void calculateSalary() {
		int value = 500;
		salary = 100*545 + value;
		System.out.println(salary);
	}
	
	public void display() {
		System.out.println("display");
	}
	
	public static void display1() {
		System.out.println("display1");
	}
	
	public void taxCalculate(int pfAmount) {
		int taxValue = 100*545 - pfAmount;
		System.out.println(taxValue);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee1 = new Employee();
		employee1.name = "Rahul";
		employee1.age = 20;
		
		Employee employee2 = new Employee();
		employee2.name = "Automation";
		employee2.age = 30;
		
		System.out.println(employee1.name);
		//System.out.println(employee1.age);
		
		/*
		  System.out.println(employee2.name); System.out.println(employee2.age);
		 */
		
		employee1.calculateSalary();
		employee2.calculateSalary();
		
		System.out.println(employee1.department);
		System.out.println(employee2.department);
		
		employee1.department = "Development";
		
		System.out.println(employee1.department);
		System.out.println(employee2.department);
		
		System.out.println(Employee.department);
		Employee.display1();
		
		Employee [] employyess = new Employee [3];
		employyess[0] = employee1;
		employyess[1] = employee2;
		
		System.out.println(employyess[1].name);
		employee2.taxCalculate(400);
		

	}

}
