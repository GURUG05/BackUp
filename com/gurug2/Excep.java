package com.gurug2;
import java.util.Scanner;

public class Excep {
   public static void main(String[]args)  {
	   System.out.println("who are you:");
	   try {
		   Scanner scan = new Scanner(System.in);
	 
		   
		    if( scan.nextLine().equals("revi")) {
		    	
		    	throw new WrongEntryExeption("illegal entry");
		     }
	   }
	   catch(WrongEntryExeption e) {
		   e.printStackTrace();
	
	   }
		   
		    
		  }
   }

