
public class Employee {
	int length = 1000;
	private int age=21;                                              //overridden method
       public void run() {
    	   System.out.println( "employee is running");
       }
       public void texting() {                                        //own method 
    	   System.out.println( "typinggggggggg");
    	   
}
//	int length;
//       float cgpa;
//	public Employee(int length, float cgpa) {
//		super();
//		this.length = length;
//		this.cgpa = cgpa;
//	}
//		
//		public int getLength() {
//			return length;
//		}
//		public void setLength(int length) {
//			this.length = length;
//		}
//		public float getCgpa() {
//			return cgpa;
//		}
//		public void setCgpa(float cgpa) {
//			this.cgpa = cgpa;
//		
//	}
//    	
    
class Developer extends Employee{

	
	int breadth=2000;
	public void walk() {
		super.texting();                                          // invoking using super keyword
		System.out.println( "walking");
	}
	public void run() {                                                        //overridden method
		 System.out.println( "developer is running");
	}
	
	

}

class Tester extends Employee  {                                               //hierarchial  inheritance
	int testnumber= 100000;
	void test() {
		System.out.println( "Testing");
	}
}
class Checker extends Tester{                                           // hybrid inheritance
	int checknumber= 100000;
	void check() {
		System.out.println( "checking");
	}
}

	














