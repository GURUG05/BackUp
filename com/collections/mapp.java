package com.collections;


import java.util.*;
import java.util.Map.Entry;

public class mapp {
  public static void main(String[]args) {
	  IdentityHashMap<Integer,String> map = new IdentityHashMap<>();
	  map.put(1, "A");
	  map.put(2,"A");
	  map.put(3, null);
	  map.put(3, "c");
	  	
	  	
	  	IdentityHashMap<Integer,String> map2 = new IdentityHashMap<>();
	  	map2.put(11, "guru");
	  	map2.put(21, "kiran");
	  	map.putAll(map2);
//	  	   
//	  Set<Map.Entry<Integer,String>> s=map.entrySet();	
//	  for( Map.Entry<Integer,String> name:s) {                  //concurrent modidication exception 
//		  System.out.println(name);
		  
		  
		  Integer i1= new Integer(10);
		  Integer i2= new Integer(10);
		  map.put(i1, "dghsh");                               //.equals comparison
		  System.out.println(map.put(i2, "kirthick"));
		 System.out.println(map);
 		 
		  
	  }
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
	  
	  
  }
  

