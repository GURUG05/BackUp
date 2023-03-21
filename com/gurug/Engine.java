package com.gurug;

public class Engine {
	
	String Enginename;
    String Enginemodel;
    
       public Engine(String enginename, String enginemodel) {
		super();
		Enginename = enginename;
		Enginemodel = enginemodel;
	}
     public  void showenginedetails() {
    	   System.out.println(Enginename); 
    	   System.out.println(Enginemodel); 
    	   
    	   }
	
}
