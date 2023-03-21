package com.gurug;

public class Start {
   public static void main (String[]args) {
	   Car car= new Car("audi","black");
//	  int [][]array= {{1,2,3},
//			         {4,5,6},
//	                  {6,7,8}};
//	  for(int i=0;i<array.length;i++) {
//		  for(int j=0;j<array[i].length;j++) {
//			  System.out.println(array[i][j]);
//		  }
//	  }
//	  for(int[]innerarray:array) {
//		  for(int number:innerarray) {
//			  System.out.println(number);
//		  }
//	  }
	  int[][][]array1= {
			  {{1,2,3},{4,5,6},{7,8,9}},
	  
			  {{12,42,73},{48,59,69},{79,89,99}},
			  
			 {{14,2,63},{84,5,69},{97,8,99}}
	  };
			  
	  for(int[][] twodimension:array1) {
		  System.out.print("{");
		  for(int[] innerarray:twodimension ){
			  System.out.print("[");
			  for(int number:innerarray)
			  {
				  System.out.print(number+",");
			  }
			  System.out.print("]");
		  }
		  System.out.print("]");
	  }
	  System.out.print("}");
	  
	  //break used inside label
	  int x=10;
	  label:{
		  
		  if(x==10) {
			  break label;
		  }
		  
	  }
	  System.out.println("\nout");
	  
			  
	  }
   }






