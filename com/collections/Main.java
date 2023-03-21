package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[]args) {
     Student s1= new Student("guru","1");
     Student s2= new Student("guru","1");
     
     Set < Student>set =new HashSet< Student> ();
      set.add(s1);
      set.add(s2);
      System.out.println(set.toString());
      
  List<Integer> l = new ArrayList<>();
  l.add(10);
  int i= 10;
  l.add(i);
  System.out.println(l);

   
	}

	
}
