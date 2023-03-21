package com.gurug2;

public class Multicatch {
    public static void main(String[]args) {
    	String s= new String();
    	s=null;
    	
    	try {
    		System.out.println(10/0);
    	     s.length();
    		
    		
    	}
    	catch(NullPointerException|ArithmeticException e) {
    		e.printStackTrace();
    	   
    	}
    }
}
