import java.time.*;
public class Stringpractice {
  public static void main(String[]args) {
	  String s=new String("once upon a time there lived aghost");
	  String[]arr= s.split("/");
	  char[]ch= {'a','s','d','f'};
	  
	   StringBuffer sb= new StringBuffer("s");
	   StringBuilder sbd = new StringBuilder("builder");
	  String stri1= new String( sb);
	  String stri2= new String( sbd);
	  String stri3=new String(ch);
	  stri1.concat("bufferr");
	  stri2.concat("builderrr");
	  System.out.println(stri1);
	  System.out.println(stri2);
	  System.out.println(stri3);
	  System.out.println(sb.capacity());
	
	
	Integer obj = new Integer(10);
	 for(String ele:arr) { 
		 System.out.println(ele);
	 }
	 System.out.println( s.contains("a"));
	 System.out.println( s.length());
	 System.out.println( s.replace('g', 'p'));
	 System.out.println( s.replace("time", "money"));
	 System.out.println( s.replaceAll("money","time"));  
	 System.out.println( s.format("dialogue is %s",s)); 
	 System.out.println( s.substring(4));
	 System.out.println( s.subSequence(4, 10)); 
	 System.out.println( s.concat("  called vikram")); 
	 
	 
	 System.out.println(s.charAt(10));
	 System.out.println(s.codePointAt(10));
	 System.out.println(s.codePointCount(0, 3));
	 System.out.println(s.codePointBefore(10));
	 
	 
	 
	 
	 String str1="   guru";                                                                                                           
	 String str2="   Guru";
	 String str3="";
	 System.out.println(str1.compareTo(str2));
	 System.out.println(str1.compareToIgnoreCase(str2));
	 System.out.println(str1.contentEquals("guru"));
	 System.out.println(str1.equals(str2));
	 System.out.println(str1.indexOf('u'));
	 System.out.println(str1.lastIndexOf('u'));
	 System.out.println(str1.trim());
	 System.out.println(str3.isEmpty());
	 System.out.println(s.startsWith("once"));
	 System.out.println(s.subSequence(0, 10));
	 Character chh='g';
	 Integer in=13910;
	 
	 System.out.println(ch.toString());
	 System.out.println(in.toString());
	 String s5=str1.toUpperCase();
	 System.out.println(s5);
	 
	 String name="mouli";
	 char[]array=name.toCharArray();
	 for(char c:array) {
		 System.out.println(c);
	 }

	
	 
	 
  }
}   
