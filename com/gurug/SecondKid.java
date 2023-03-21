package com.gurug;

public class SecondKid extends Parent {
	 String name;
     int age;
     
     SecondKid(String name,int age){
    	 super(name,age);
    	 this.name=name;
    	 this.age=age;
    		 
    	 }
     public void birth() {
    	 System.out.println("second born");
     }
	

}
