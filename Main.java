
//Reflection
import java.lang.reflect.*;
public class Main {
	 public static void main(String[]args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//	    	Employee employee =new Employee(10,9.5f);
//	    	
//	    	Class classname =employee.getClass();       //can find the class of object
//	    	System.out.println(classname.getName());
//	    	
//	    	//can find the method of the object
//	    	Method[] methodnames = classname.getMethods();
//	    	for(Method  m:methodnames) {
//	    		System.out.println(m.getName());
//	    	}
//	    	//we can also invoke using the methods without knowing what method it is
//	    System.out.println("hashcode is"+methodnames[9].invoke(employee, null));
//   }
	 
		 Developer developer = new Developer();
		System.out.println( developer.breadth);
		System.out.println( developer.length);
		//System.out.println( developer.age); 
		developer.walk();
		developer.run();
		
		Employee employee = new Employee();
	//employee.run();
		//System.out.println( employee.breadth);
		//employee.walk();  
		Tester tester = new Tester();
		System.out.println( tester.length);
	
		//tester.walk();
		//tester.run();
		Checker checker = new Checker();
		//checker.run();
		//checker.walk();
		//checker.test();
		
	 }
} 





