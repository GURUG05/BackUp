package com.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class Stringbuffer {
   public static void main(String[]args) {
	   TreeSet<String> t= new TreeSet<String>(new Mycomp());
	   t.add("a");
	   t.add("b");
	   t.add("x");
	   t.add("d");
	   t.add("d");
	 
	   System.out.println(t);
   }
}
class Mycomp implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		
		return -1;
	}
	
}
