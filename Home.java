package com.aspiresys;
import java.util.Scanner ;
public class Home {
    public  void show(){
    	  int choice;
    	 System.out.println("welcome to hompage");
    	 System.out.println("enter number 1 for login and 2 if you are new user:");
    	 try (Scanner scan = new Scanner(System.in)) {
			choice=scan.nextInt();
		
    	  if(choice==1) {
    		 System.out.println("login panriya da");
    		  LoginPage loginpageobject =new LoginPage();
    		  loginpageobject.loggingIn();
    	 }
    	 
    	 
     } catch(Exception e) {
		  System.out.println(e);
     }
	  }
}
