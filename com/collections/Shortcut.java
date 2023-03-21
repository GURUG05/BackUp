package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Shortcut {
         public static void dup(Integer[]arr){
        	 Set<Integer> s= new HashSet<>();
        	 for(Integer ele:arr) {
        		 s.add(ele);
        	 }
        	 System.out.println("removing duplicates in array using set:");
        	 System.out.println(s);
         }
        	 
        	 
        public static void dup2(List<Integer>l) {
                 Set<Integer> s2= new HashSet<>();
                 for(Integer ele:l) {
                	 s2.add(ele);
                 }
                 System.out.println("removing duplicates in list using set:");
            	 System.out.println(s2);
            	 }
         
	public static void main(String[] args) {
	Integer[]array= {1,2,3,4,4,2,1,3,5,6,7};
	List<Integer> l =Arrays.asList(array); //array into list
    List<String> l2= new ArrayList<>(List.of("A","B","C"));
    List<Integer>l3= new ArrayList<>();
     for(Integer num: l) {  
    	 if(!l3.contains(num)){
    		l3.add(num);
    	 }
    	 
    	 else {
    		
    		 System.out.println("duplicate num: "+num);
    	 }
     }
     System.out.println("list containing no duplicates:");
     System.out.println(l3);
     
     dup(array);
     dup2(l);
     
  
	}

}
