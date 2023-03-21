import java.util.Scanner;
public class Practice1 {
	String name;
	String school;
     Practice1(String name, String school) {
		this(2332,3636);
		this.name = name;
		this.school = school;
		
		 
	}
	Practice1(int i, int j) {
		 
				System.out.println(i+j);
			}
	
	enum colour{
		RED,BLUE,GREEN
	}
	static int var=100000000;
	int var2=1;
	 
	void add(final int x,int y) {
		final int z=x+y;
		System.out.println(z);
		System.out.println(var2);
	
	}
 static public 	 	void main (String...args)  {
	  System.out.println(var);
	
	  Practice1 p= new Practice1("guru","hams");
	  
//	   System.out.println("enter num");
	  Scanner scan=new Scanner(System.in);
//	  int i=scan.nextInt();
//	  if(i==1) {
//		 System.out.println("one"); 
//		 
//		 
//	    if(i==1) {
//	    	System.out.println("innerif1");
//	    }
//	      if(i==1) {
//	    	System.out.println("innerif2");
//	      }
//	    
//	    int e=scan.nextInt();
//	       if(e==3) {
//	    	System.out.println("innerif3");
//	      }
//	    
//	    else {
//	    	System.out.println("inner else");
//	    }
//	    }
//	    
//	  else {
//	    	System.out.println("else block");
//	    }
//	  
//	  
	  
	  System.out.println("enter name");
	  while(true) {
	  String X=scan.nextLine();
	  
	  switch(X) {
	  case "nishanth" :System.out.println("case1");
	                   break;
	  case "cryspin": System.out.println("case 2");
	                  break;
	  default:System.out.println("default");
	  }
	  {
	  
	  
	   colour c= colour.GREEN;
	  switch(c) {
	  case RED:System.out.println("case1");
	                   break;
	  case GREEN: System.out.println("case 2");
	                  break;
	  default:System.out.println("default");
	 }
	  }
  }
	  
	 
	  
}
  
}


  
	 

