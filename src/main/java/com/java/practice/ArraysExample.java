package com.java.practice;

public class ArraysExample {
	
	public void calculateSalary() {
		int value = 500;
		int salary = 100*545 + value;
		System.out.println(salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a= 45.6, b= 55.6, c= 65.6;
		
		double[] values = {20.5, 10.6, 40.6};
		
		System.out.println(values[1]);
		System.out.println(values.length);
		
		
		int [] salary = new int[5];
		salary[0] = 40;
		salary[1] = 60;
		
		salary[2] = 70;
		
		salary[3] = 80;
		
		for(int i = 0; i <salary.length; i ++) {
			System.out.println(salary[i]);
		}
		
		

	}

}
