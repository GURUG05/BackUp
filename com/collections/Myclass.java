package com.collections;


		
		import java.util.ArrayList;
		import java.util.Arrays;
		import java.util.Collections;
		import java.util.Comparator;
		import java.util.HashSet;
		import java.util.List;
import java.util.ListIterator;
import java.util.Set;
		import java.util.Spliterator;
import java.util.Stack;
import java.util.function.Consumer;
		import java.util.stream.*;
		import java.util.function.Predicate;
		public class Myclass {
			  //predicate uses the current method for checking , and not the de
		     public static void pred(Integer num,Predicate<Integer> p) {
		    	System.out.println( p.test(num));
		     }
			
		  public static void main(String[]args) {
			  
			  var x= 10;
			  
			  Integer[]array= new Integer[10];
		      List<Integer>arl= new ArrayList<>(Arrays.asList(array));	  
			  List<String> l=Arrays.asList("C","Dad","Arwg","aad","Aagdag","B","Ea");
			  List<Integer> l2=Arrays.asList(5,6,7,1,2,3,4);
			  List<Integer>list= new ArrayList<>(List.of(1,2,3,4,6,2,2,5,3,46,4,2,2));
			  
			  List<Integer> mouli= new ArrayList<>();
			  mouli.add(1);
			  mouli.add(4);
			  mouli.add(9);
			  ListIterator<Integer> listiterator= mouli.listIterator();
			  
			  // has previous and previous
			  System.out.println("list iterator:");
			  while(listiterator.hasNext()) {
					 System.out.println(listiterator.next());
					
				 }
			 while(listiterator.hasPrevious()) {
					 System.out.println(listiterator.previous());
				 }
				  
			  
			  List<Integer> l3= l2.stream().filter(m->m%2==0).sorted().collect(Collectors.toList());
			  System.out.println(l3);
			  
			  
			  List<Integer>l4= l2.stream().sorted().collect(Collectors.toList());
			  System.out.println(l4);
			  
			  List<Integer>l5= l2.stream().map(y->y*y).sorted().collect(Collectors.toList());
			  System.out.println(l5);
			  
			  List<String>l6= l.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
			  System.out.println(l6);
			  
			  
			  System.out.println("chekcinggg:");
			  //intermediate operations and terminal operations (lazy intermediate operations)
			  l.stream().filter(s->s.startsWith("A")).map(s->{
				  System.out.println("checked");
				 return s.getClass(); 
			  });
			 
			 
			  List<String>l7= l.stream().sorted().collect(Collectors.toList());
			  System.out.println(l7);
			  Consumer<Integer>c= i->{
				  System.out.println("the sqrare of "+i+"is:  "+ i*i);
				  };
			  list.stream().forEach(c);
			  
			  Comparator<String>c1=(s1,s2)->{
				  int i1=s1.length();
				  int i2= s2.length();
				  if(i1<i2)
					  return -1;
				  else if(i1>i2)
					  return +1;
				  else 
					  return s1.compareTo(s2);
			  };
			 List<String>alphalist= l.stream().sorted(c1).collect(Collectors.toList());
			 System.out.println(alphalist);
			 
			 System.out.println("printing arrays using foreach method:");
			Integer[] array2= list.stream().toArray(Integer[]::new);
			  Stream.of(array2).forEach(System.out::println);
			  
			  int val= l2.stream().min((i1,i2)->i1.compareTo(i2)).get();
			  System.out.println("minimum value is");
			  System.out.println(val);
			  
			  int val2= l2.stream().min((i1,i2)->-i1.compareTo(i2)).get();
			  System.out.println("minimum value is");
			  System.out.println(val2);
			  
			 List<Integer>l8= l2.stream().filter(y->y%2==0).sorted().collect(Collectors.toList());
			  System.out.println(l8);
			  
			  
			  Set<Integer>s= new HashSet<>();
			  
			  System.out.println("original list:");
			  System.out.println(list);
			  
			  Set<Integer>s2=list.stream().filter(y->!s.add(y)).collect(Collectors.toSet());
			  System.out.println("duplicates in list given as set:");
			  System.out.println(s2);
			  
			  
			  Set<Integer>s3=list.stream().filter(z->s.add(z)).collect(Collectors.toSet());
			  System.out.println("non duplicates in list:");
			  System.out.println(s);
			  
		    //list of lists
			  Set<Integer> set= new HashSet<>(List.of(1, 2, 3, 4, 5, 9, 5, 2, 4, 6));
			  List<Integer> listl0= new ArrayList<>(List.of(33,43,64,23,56,75,64));
			  set.addAll(listl0);
			  
			  System.out.println(set);
			 
			 Set<Integer>setoflist= set.stream().map(r->r+1).collect(Collectors.toSet());
			  System.out.println(setoflist); //map don't work for in case of list of lists 
			  System.out.println( listl0);
			 System.out.println("==================================================="+"\nPredicates:");
			 
			 
			//predicate object and giving condition 
		     Predicate<Integer> pre= I->I%2==0;
			         System.out.println( pre.test(4));
			  //second predicate condition
			 Predicate<Integer>pre2=I->I%5==0;
			     System.out.println(pre2.test(9));
			     
			    
			     Boolean b= pre.and(pre2).test(4);  //chaining using "and"
			     
			     Boolean b2=pre.or(pre2).test(4);
			     
			    
			     System.out.println("predicate chaining using 'and':");
			     System.out.println(b);
			     System.out.println("predicate checking using 'or' :");
			     System.out.println(b2);
			         
			 //passing number and predicate as arguments
			         
			         pred(9,I->I%2==0);
			     
			     
			     //predicate using negate
			     System.out.println("predicate using negate:");
			     Predicate<Integer> pre3= I->I%2==0;
		          Boolean bp= pre3.negate().test(4);  
			        System.out.println(bp);
			        
			        
			        //filtering using predicate
			        System.out.println("names having length more than 3: ");
			      Predicate<String>p6=u->u.equals("Dad");
			      for(String st:l) {
			    	  if(p6.test(st)) {
			    		  System.out.println(st);
			    	  }
			      }
			   
			      
			      Collections.sort(l2); //sorting must before binarysearch
			      System.out.println(l2);
			      System.out.println("==================");
			      System.out.println("default sort binary search");
			     Integer num= Collections.binarySearch(l2, 4);
			      System.out.println(num); //returns index of success
			      
			      Comparator<Integer>comp=(y1,y2)->{
			    	  return y2.compareTo(y1);
			    	  };
			     Integer num2= Collections.binarySearch(l2, 8, comp);
			     System.out.println("custom sorting binary search:");
			      System.out.println(num2);
			      
			      
			      //array store exception =>storing heterogeneous elements in list of arrays
			      String[]sarray= {"a","c","d","e","r"};
			      List<String>slist= Arrays.asList(sarray);
			      //slist.add("g");    ----unsupproted operation exception
			      
			      slist.set(2, "g");
			      System.out.println(slist);
			     // slist.set(2, new Integer(9)); ----array sotre exception 
			      
			     Arrays.sort(sarray);
			     Integer result=  Arrays.binarySearch(sarray, "g");
			      System.out.println(result);  
			      
			      
			      
			      //spliterator trysplit method
			      System.out.println("spliterator:");
			      Collections.sort(list);
			     Spliterator <Integer> split= list.spliterator();
			     Spliterator<Integer> firstsplit= split.trySplit();
			     while(firstsplit.tryAdvance(System.out::println));     //splitted itretor parallel traversing 
			     split.forEachRemaining(System.out::println);
			     
			     
			     
			   //  l.add("mouli");
			    // l.remove(1);
			     l.set(1, "moulii");
			     System.out.println(l); 
			     
			     List<Integer> lit=new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,5));
			     List<Integer> lit2=new ArrayList<Integer>(Arrays.asList(6,7,8,9,0));
			     List<Integer> lit1=new ArrayList<Integer>(Arrays.asList(13,1,2,4,5,7));
			     
			     ArrayList<List<Integer>> all=new ArrayList<List<Integer>>();
			     all.add(lit);
			     all.add(lit1);
			     all.add(lit2);
			     
			     
			   
			    System.out.println("after flat used");
			    List<List<Integer>> values= all.stream().map(con->con).distinct().collect(Collectors.toList());
			    
			     values.forEach(System.out::println); 
			     //Collections.sort(values);
			     System.out.println(values);
			     
			     System.err.println(Collections.frequency(values,0));
			     
			    
			    System.out.println("foreachremaining:");
			    l.forEach(System.out::println);
			     
		      
		  
		  }
		  
		  
		 
	 }

	


