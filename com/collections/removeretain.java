package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class removeretain {

	

	public static void main(String[] args) {
		Integer[]array=new Integer[100];
		LinkedList l= new LinkedList (List.of(1,2,3,4,5,6));
	    
	   
	 
	    
	    System.out.println(Collections.checkedList(l,Double.class) );
	   System.out.println( Collections.frequency(l,40));
        //Collections.fill(l, 100);           //filling all elements with specidied elements
        System.out.println(l);
        List<Integer> l2 = Collections.unmodifiableList(l);       //unsupported operation exception 
       System.out.println(l2);
       
       
       l.retainAll(l2);
       System.out.println(l);
     // l.removeAll(l2);
      
      System.out.println(l.size());
      Object[] oa= l.toArray();
      
       for(Object num:oa) {
    	   System.out.println(num);
       }
      Iterator desite= l.descendingIterator();
      while(desite.hasNext()) {
    	  System.out.println(desite.next()); 
      }
      System.out.println("==============================");
      System.out.println(l);
      System.out.println(l.pop());
      System.out.println(l);
      System.out.println(l.poll());
      System.out.println(l);
      System.out.println(l.remove());
      System.out.println(l);
      
     Vector v = new Vector();
     for(int i = 0;i<10;i++) {
    	 v.addElement(i);
     }
    
     }
}