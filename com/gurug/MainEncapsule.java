package com.gurug;

public class MainEncapsule {
  public static void main(String[]args) {
	  Encapsulate person1= new Encapsulate();
	  person1.setName("guru");
	  person1.setPassword("safetyfirst");
	  person1.setSalary(35000);
	 System.out.println(person1.getName());
	 System.out.println(person1.getPassword());
	 System.out.println(person1.getSalary());
	 
	 Integer I=new Integer(10);
	 int i=I.intValue();
	 System.out.println(i);
	 int i2=I; //unboxing
	Integer I2=100; //autoboxing
	int i3=Integer.parseInt("10");
	
	
	Integer obj = 130 ;
    Integer obj2= Integer.valueOf("100");
    //Character obj3= Character.valueOf("g");
   System.out.println( obj.byteValue());
   System.out.println( obj.longValue());
   
   Character charobj= new Character('g');
   char c= charobj.charValue();
   System.out.println(c);
   
  
   
   
   char ch='s';
    Character C=ch; //autoboxing
    Integer Int=10;  //Integer.valueOf("10");
    
    
    
    int in = Integer.valueOf("1000");
    
	 
	 
      
      
  }
  
}
