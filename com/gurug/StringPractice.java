package com.gurug;

public class StringPractice {

	public static void main(String[] args) {
   String string= new String("guru");//new-heap storage
   String string1= "kiran";
   
   String refcheck= "kiran";//literal-scp storage
   
   string.concat("dsfg");

   String newrefstring=string.concat("dsfg");
   
   System.out.println(string);
  string=string.concat(string1); 
  System.out.println(string);
  //string reference pointing to another object
   System.out.println(string1);
   System.out.println(newrefstring);
   
   StringBuffer stringbuffer1= new StringBuffer("spicot");
   StringBuffer stringbuffer2= new StringBuffer("spicot");
   
   
   stringbuffer1.append("IT park");
   stringbuffer2.append("IT park");
  // stringbuffer.concate("IT park");   concate not available for stringbuffer class
   
   System.out.println(stringbuffer1);
   System.out.println(string.equals(string1));
    System.out.println(string.equals(newrefstring));  //content checking 
    System.out.println(stringbuffer1.equals(stringbuffer2)); // reference checking
    
    System.out.println(string==string1);  //reference checking
    System.out.println(string==newrefstring);  
    System.out.println(stringbuffer1==stringbuffer2); 
    System.out.println(string1==refcheck); 
	}

}
