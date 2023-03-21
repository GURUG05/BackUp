
final public class ImmutableClass {
   private int var;
   ImmutableClass(int var){
	   this.var=var;
   }
      public ImmutableClass change(int num){
	   if(this.var==num) {
		   return this;
	   }
	   else {
		   return new ImmutableClass(num);
	   }
   }

public static void main(String[]args) {
	ImmutableClass object1= new ImmutableClass(10); 
	ImmutableClass object2=object1.change(1000);
	ImmutableClass object3=object1.change(10);
	System.out.println((object1==object3));
	System.out.println((object1==object2));
    
	
 }
}



/*int Number = 100;
void change(Passbyvalue pv) {
	 pv.Number = pv.Number + 100;
	 
	
}

public static void main(String...args){
	Passbyvalue pv= new Passbyvalue( );
	
	pv.change(pv);
	System.out.println(pv.Number);
	 
	}
}
*/