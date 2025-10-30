package com.java.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list. add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
		
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
