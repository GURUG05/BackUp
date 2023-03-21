package com.gurug;

public class Kid extends Parent{
	String name;
    int age;
	
	public Kid(String name, int age) {
		super(name, age);
		System.out.println("kid classconstructor is called at last\n");
		this.name = name;
		this.age = age;
	}
	public void managing() {
  	  System.out.println(name+"is managing his studies");
    }
    public void exercising() {
  	  System.out.println(name+" started bodybuilding");
    }
    
 public void checkparentworking() {
    	
		super.working(); //grandparent method
		System.out.println("father working checked by child");
	}   
    
    //with argument
  public void checkparentworking(String name1) {
    	
		super.working(name1); //grandparent method
		System.out.println("father working checked");
	}
}
