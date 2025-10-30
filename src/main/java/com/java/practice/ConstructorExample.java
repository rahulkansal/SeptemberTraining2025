package com.java.practice;

public class ConstructorExample {
	
	String name ;
	int age;
	
	ConstructorExample(){
		System.out.println("No parameter");
	}
	
	ConstructorExample(String nameValue, int ageValue){
		name = nameValue;
		age = ageValue;
		System.out.println("parameter Constructor");
	}
	
	
	
	public void display() {
		System.out.println("display");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample constructorExample = new ConstructorExample();
		constructorExample.name = "Rahul";
		constructorExample.age = 30;
		
		ConstructorExample constructorExample1 = new ConstructorExample("Pooja" , 28);
		
		System.out.println(constructorExample1.name);
		
		
	}

}
