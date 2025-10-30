package com.java.practice;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * HashSet<String> set=new HashSet<String>(); set.add("Ravi"); set.add("Vijay");
		 * set.add("Ravi");
		 * 
		 * //Traversing elements Iterator<String> itr=set.iterator();
		 * while(itr.hasNext()){ System.out.println(itr.next()); }
		 */
		
		
		HashSet<Object> set=new HashSet<Object>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add(500);
		set.add(3.455);
		set.add('f');
		
		
		//Traversing elements  
		Iterator<Object> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  }

	}

}
