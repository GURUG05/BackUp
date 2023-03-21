package com.gurug;

public class GenericClass<G> {
     G objectname;
     GenericClass(G objectname){
    	 
    	 this.objectname=objectname;
     }
     public void display() {
    	 System.out.println(objectname.getClass());
     }
    public  G show(){
    	 return objectname;
     }
     
 
public static void main(String[]args) {
     GenericClass<String>name1= new GenericClass<String>("guru");
     GenericClass<Integer>name2= new GenericClass<Integer>(1000);
     GenericClass<Object>name3= new GenericClass<Object>(0);
     name1.display();
     name2.display();
     name3.display();
    System.out.println( name1.show());
    System.out.println(name2.show());
    
    MultipleParameters<String,Integer> object=new MultipleParameters<String,Integer>("guru",561 );
    object.getData();
  }
}
