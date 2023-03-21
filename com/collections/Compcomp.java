package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Compcomp {
  public static void main(String[]args) {
	   Employee empobject1= new Employee("guru",105);
	   Employee empobject2= new Employee("dnish",102);
	   Employee empobject3= new Employee("zrun",101);
	   Employee empobject4= new Employee("kiran",110);
	   Employee empobject5= new Employee("riyash",121);
	 
	   TreeSet<Employee> treeobj= new TreeSet<Employee>();
	   treeobj.add(empobject1);
	   treeobj.add(empobject2);
	   treeobj.add(empobject3);
	   treeobj.add(empobject4);
	   treeobj.add(empobject5);
	   
	   
	   
	  	  
	   
	  Iterator<Employee> ite= treeobj.iterator();
	  while(ite.hasNext()) {
		  System.out.println(ite.next());
	  }
	  
	  
	  System.out.println("=============");
	  
	   
	   TreeSet<Employee> treeobj2= new TreeSet<Employee>(new Mycomparator().new Mycomparator2());
	   
	   treeobj2.add(empobject1);
	   treeobj2.add(empobject2);
	   treeobj2.add(empobject3);
	   treeobj2.add(empobject4);
	   
	   treeobj2.add(empobject5);
	   
	   Iterator<Employee> ite2= treeobj2.iterator();
		  while(ite2.hasNext()) {
			  System.out.println(ite2.next());
		  }
	   
	    }
  

  
}
class Mycomparator implements Comparator<Object> {
	

	@Override
	public int compare(Object o1,Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		String s1=e1.empname;
		String s2=e2.empname;
	    return s1.compareTo(s2);
	}
	class Mycomparator2 implements Comparator<Object>{	
		@Override
	    public int compare(Object o1,Object o2) {
			Employee e1=(Employee)o1;
			Employee e2=(Employee)o2;
			Integer id1= (Integer)e1.empid;
			Integer id2= (Integer)e2.empid;
		    return id2.compareTo(id1);
				
		    
		    
			
		}
	}
}



