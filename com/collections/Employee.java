package com.collections;
import java.util.*;
public class Employee implements Comparable<Object>{
  


String empname;
  int empid;
  Employee(String name,int id){
	  this.empname=name;
	  this.empid=id;
  }
  
  
@Override
public String toString() {
	return "Employee [empname=" + empname + ", empid=" + empid + "]";
}


@Override
public int compareTo(Object id) {
	int eid1=this.empid;
	Employee e2=(Employee)id;
    int eid2=e2.empid;
	if(eid1<eid2) {
	  return -1;
	}
	else if(eid1>eid2) {
		return +1;
	}
	else
		return 0;
   }
 }
 








