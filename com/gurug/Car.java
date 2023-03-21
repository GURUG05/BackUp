package com.gurug;

public class Car {
	String Carname;
    String Carcolour;
    Engine engine;
    
      public Car(String carname, String carcolour) {
		super();
	  Engine  engine = new Engine("turbo","BS6"); //object creation
		Carname = carname;
		Carcolour = carcolour;
		engine.showenginedetails();
		Car car=null;
		 System.out.println(Carcolour);
	}
    
    
	
}
