package com.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 class prac {
   public static void main(String[]args) {
	   
	   ArrayList<String>a=new ArrayList<String>();
	List<String>synclist=Collections.synchronizedList(a);    //synchronised arraylist creation
	ArrayList<String>b=new ArrayList<>(a);                 //arraylist taking collection
	   
   }
}
