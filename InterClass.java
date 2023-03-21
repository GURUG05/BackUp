
public  class InterClass implements DemoInterface {
	 int iasdf=1;
	 static  int  j;
	 
	 public  void method12() {
		   System.out.println(iasdf);
		   System.out.println(j);
	   }
	 public  void method1() {
		  
	   }
      static void method2() {
      
		//DemoInterface.super.method1();  //default method calling
		   System.out.println("static method overriden or method hiding");
		   
		   //default method is called within public method
		   //it cannot be called within static method since default belongs to its object and static belongs to its class
		   //object will hide inside with static method since it belongs t
	   }
      
      static void special() {
   	   System.out.println("special static   2");
      }
      static void m()
      {
    	  int i=10;
      }
	 
   public static void main(String[]args) {
	   
	   
	   
	   
	   DemoInterface.method2(); //static method calling
	   
       InterClass object= new InterClass();
       // object.method2();
       
     //calling static methods
     special();
     InterClass.special();
     DemoInterface.special();  //allowed
     object.special();
     object.method12();
     
     System.gc();
     System.runFinalization();
     
     
	  
	  
   }
@Override
public void method() {
	// TODO Auto-generated method stub
	
}
}
