
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
public class MainGeneric {
  public static <Medicinies2> void main(String[]args) {
	
	  
	  ArrayList<String>list1= new ArrayList<String>();
	  list1.add("one");
	  list1.add("two");
	 
	  ArrayList<Integer>list2=new ArrayList<Integer>();
	  list2.add(1);
	  list2.add(2);
	  
	  
	 
	  
	  Generic object=new Generic();
	  object.GetValue(list1);
	  object.GetValue(list2);
  }
}
