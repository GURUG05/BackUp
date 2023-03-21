package com.collections;


import java.util.*;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.Collection;

public class navigable {
 public static void main(String[]args) {
	
	 NavigableMap<Integer, String> nmmp = new TreeMap<>();
	  
      
     nmmp.put(2, "two");
     nmmp.put(7, "seven");
     nmmp.put(3, "three");
     
     
    System.out.println(nmmp.floorEntry(12));
    System.out.println(nmmp.ceilingEntry(5));
    
     System.out.println("The mapping with greatest"
                        + " key is : " + nmmp.floorKey(10));
     System.out.println("The mapping with greatest"
             + " key is : " + nmmp.ceilingKey(0));
     
     Set<Integer> s= nmmp.descendingKeySet();   //descending keys
       for(Integer keys:s) {
    	   System.out.println(keys +"--"+ nmmp.values());
    	
       }
       Set<Integer> s2= nmmp.navigableKeySet().descendingSet();   //descending keys
       for(Integer keys:s2) {
    	   System.out.println(keys );
    	
       }
       
     NavigableMap<Integer,String> dm=  nmmp.descendingMap();
     System.out.println(dm);
     
     Iterator<NavigableMap.Entry<Integer,String>> iterator =nmmp.entrySet().iterator();
     while(iterator.hasNext()) {
    	 System.out.println(iterator.next());
     }
     while(iterator.hasNext()) {
    	 NavigableMap.Entry<Integer,String> e= iterator.next();   //entry element
    	 System.out.println(e.getKey() +"-----"+ e.getValue());
    	 
   
     }
 }
}
