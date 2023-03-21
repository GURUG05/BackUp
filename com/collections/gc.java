package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;



public class gc {
	
	public String toString() {
		return "temp";
		
	}
	public void finalize(){
		System.out.println("finalise method called , integer object is collected as garbage");
		
		
	}
	
  public static void main(String[]args) {
	  
	  WeakHashMap<Object, String> whm= new WeakHashMap<>();
	  gc o = new gc();
	  gc o2= new gc();
	  
	  System.gc();
	 //weak hashmap allow garbage collection of deferenced object 
	 //whereas hashmap doesnt allow garbage collection of dereferenced object
	  
	 
	  whm.put(o , "A");
	   System.out.println(whm);
	   o= null;
	   
	   System.gc();
	   System.out.println("remaining values"+whm);
	  
	   System.out.println("=========================");
	   
	   
	   Integer i2= 100;
	   HashMap<Object, String> hm= new HashMap<>();
	   hm.put(i2, "hashmap");
	   hm.put(o2, "hashmap2");
	   System.out.println(hm);
	   i2= null;
	   o2=null;
	
	   System.gc();
	   System.out.println(hm);
  }

}
