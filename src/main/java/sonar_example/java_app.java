package sonar_example;

import java.util.ArrayList;
import java.util.List;

public class java_app {
	
    public java_app() {
		System.out.println("Constructor...");
	}

    
    public void m1() {
    	String s="";
    	List<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list = null;
    	list.add(2);
    	Object obj=getData();
    	System.out.println(obj.toString());
    }
    
    public Object getData() {
    	return null;
    }
    
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        java_app sc = new java_app();
        sc.m1();
    }
}

