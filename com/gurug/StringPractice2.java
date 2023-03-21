package com.gurug;

public class StringPractice2 {
    public static void main(String[]args) {
    	
    	 StringBuilder builderobject = new StringBuilder("builder");
    	 builderobject.append("object");
    	 
    	 
    	 String newstring=builderobject.toString();
    	 System.out.println(newstring);
    	 newstring.concat("concating");
    	 System.out.println(newstring);
    	String newreference= newstring.concat("concating");
    	 System.out.println(newreference);
    	 
    	StringBuffer bufferobject = new StringBuffer("buffer");
    	String buffertostring=bufferobject.toString();
    	buffertostring.concat("concating ");
    	System.out.println(buffertostring); 
         
    }
}
