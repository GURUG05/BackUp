package com.gurug;

public class MultipleParameters<T,E> {
	T object1;
    E object2;
    MultipleParameters(T object1,E object2){
    	this.object1=object1;
    	this.object2=object2;
    }
    
    void getData() {
    	System.out.println(object1  +"    belongs to"+object1.getClass());
    	System.out.println(object2  + "   belongs to"+object2.getClass());
    }
    
    

}
