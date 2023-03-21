

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesinList {
	public static  List<Integer> findDuplicates(List<Integer> list) {
	    List<Integer> l = new ArrayList<Integer>();
	    Set<Integer> s = new HashSet<Integer>();
	    System.out.println(l);
	    System.out.println(s);
	     for(Integer num:list) {
	    	 if(s.contains(num)) {
	    		 l.add(num);
	    	 }
	    	 else {
	    		 s.add(num);
	    	 }
	    }
	    return l;
	    
	}
	public static void main(String[] args) {

		  List<Integer> list= new ArrayList<>();
		  list.add(11);
		  list.add(12);
		  list.add(11);
		  list.add(13);
		  list.add(12);
		  list.add(14);
		  System.out.println(findDuplicates(list));
		  
         
	}
	
}
