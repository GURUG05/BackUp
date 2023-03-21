package com.gurug;
import java.util.ArrayList;
import java.util.List;
public class MainInterface {

	public static void main(String[] args) {
		Childclass object= new Childclass();
		object.deposit();
		object.withdraw();
		object.balance();
		object.loan();
		
		
		//generics
		
		Integer I= new Integer(100);
		ArrayList list = new ArrayList(100);
		  list.add("guru");
		  list.add("kiran");
		  list.add(I);
		  
		  String name=(String)list.get(0);
		  Integer I2=(Integer)list.get(2);
		System.out.println(name);
		System.out.println(I2);
		
		
		

		Integer In= new Integer(100);
		ArrayList<String> list2 = new ArrayList<String>(100);
		  list2.add("guru");
		  list2.add("kiran");
		  //list2.add(I);
		  
		  String name2=(String)list.get(0);
		  Integer I3=(Integer)list.get(2);
		System.out.println(name);
		System.out.println(I2);
		
		
	}
	

}
