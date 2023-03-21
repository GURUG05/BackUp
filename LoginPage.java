package com.aspiresys;
import java.util.regex.*;
import java.util.Scanner;
public class LoginPage {
    public void loggingIn() {
    	 try (Scanner scan = new Scanner(System.in)) {
			System.out.println("enter the username:");
			String Username =scan.nextLine();
    	 System.out.println("enter the password:");
    	    String Password =scan.nextLine();
    	    Pattern pattern1=Pattern.compile(Username);
    	    Matcher match1=pattern1.matcher("guru");
    	    Pattern pattern2=Pattern.compile(Password);
    	    Matcher match2=pattern2.matcher("podadei");
    	    
    	    if(match1.find()&& match2.find())  {
    	    	System.out.println("credentials corect ,login successful");
    	    }
    	    else {
    	    	System.out.println("credentials incorrect ,login failed");
    	    }
		}
    }
}
    	    
    	   

