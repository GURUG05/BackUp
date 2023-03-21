package com.gurug2;

import java.util.ArrayList;
import java.util.*;

public class Demo {
	
	public static  void method() {
		try {
			
			
		}
		finally {
			System.out.println("finally printed");
		}
		
	}
	
	
	public static void main(String[]args) 
	{    
		Demo object = new Demo();
		object= null;
	
		try {
			
      System.out.println(10/0);
    		}
		
		catch(ArithmeticException exception) {
			
		   System.out.println("divided by zero");
		   Object[]o=exception.getStackTrace();
		   for(Object ob:o) {
			   System.out.println(ob);
		   }
		 
			
		}
		method();
		
	int []a= new int[5];
	
	List<Integer>l=new ArrayList<>();
	Iterator obj=l.iterator();
	obj.hasNext();
	
	
	for(int num:a) {
		System.out.println(num);
	}
		
	
	} 
	
	
}
