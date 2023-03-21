package com.gurug;

public class Parent extends GrandParent {
	 String name;
    private int age;
    Parent(String name,int age){
  	super(name,age);                    //calling default constructor
    	System.out.println("parent classconsturctor is called");
    	this.name= name;
    	this.age=age;
    	
    }
    //with kid class reference
	public void working() {
  	  System.out.println(name+"working at IT company");
    }
	
	//with parent name
	public void working(String name1) {
	  	  System.out.println(name1+"working at IT company");
	    }
	
	
	public void managing() {
  	  System.out.println(name+"is managing the whole family");
    }
	
}

