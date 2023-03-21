package com.gurug;

public class GrandParent {
      String name;
      int age;

   public GrandParent() {
 	  System.out.println("\ndefault constructor is called\n");
   }
      
      public GrandParent(String name, int age) {
    	  super();
    	  System.out.println("\ngrandfather classconstructor is called");
		this.name = name;
		this.age = age;
	}


	public void resting() {
    	  System.out.println(name+" is resting");
      }
      public void walking() {
    	  System.out.println(name+" is walking");
      }
      public void exercising() {
    	  System.out.println(name+" is exercising for health issues");
      }
      public void eating() {
    	  System.out.println(name+" is eating");
      }
}