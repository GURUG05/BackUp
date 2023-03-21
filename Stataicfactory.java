
abstract class Stataicfactory {
 
	private void m1() {
	System.out.println("parent");
	}
	
	
}
class sub extends Stataicfactory{
   private void m1() {
	   System.out.println("child");
   }
   public static void main(String[]args) {
	   Stataicfactory obj= new sub();
	   sub obj2= new sub();
	  
   }
}
