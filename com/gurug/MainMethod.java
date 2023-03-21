package com.gurug;

public class MainMethod {
public static void main(String[] args) {
		
        char [] ch= {'a','b','c'};
        main(ch);
        
        
        int[] i= {1,2,3,4,5};
        main(i);
       }
    
	public static void main(char[] args) {
		for(char s:args) {
			System.out.println(s);
			}
	}
	public static void main(int []args) {
		for(int i:args) {
			System.out.println(i);
			}
	}
}

	class sec extends MainMethod{
		public static void main(String[] args) {
			
			
		}
		
	}
	
	


