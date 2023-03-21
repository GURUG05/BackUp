
public interface DemoInterface {
	
	//variable-public static final
//	default void toString() {
//		//cannot use method of object class   
//	}
	
   void method();
   default void method1() {             //defender method or virtual extension method
	   System.out.println("default");
   }
   static void method2() {
	   System.out.println("static");
   }
   private void method3() {
	   System.out.println("private method");
   }
   static void special() {
	   System.out.println("special static    1");
   }
   
}
