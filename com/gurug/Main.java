package com.gurug;

public class Main {
	
     
	public static void main(String[] args) {
		 GrandParent grandparentobject= new GrandParent("grandfather",65);
         grandparentobject.resting();
         //grandparentobject.working();
         
         
         Parent parentobject= new Parent("father", 45);
         parentobject.working();
         parentobject.resting();
         
         Kid kidobject=new Kid("kid",16);
         //method overriding
         grandparentobject.exercising();
         kidobject.exercising();
         
         //super keyword and object passing
         kidobject.checkparentworking();
         kidobject.checkparentworking("gopalan");
         kidobject.managing();
         
         
         SecondKid secondkidobject= new SecondKid("secondkid", 2);
         secondkidobject.resting();
         
//         
//         secondkidobject= null;
//         System.out.println(secondkidobject);
//         secondkidobject.exercising();
         
        
	}

	
}
