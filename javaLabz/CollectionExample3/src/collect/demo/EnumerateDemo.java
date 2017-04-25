package collect.demo;

import java.util.*;

public class EnumerateDemo {

public static void main(String[] args) {
		
	Vector<Integer> obj=new Vector<Integer>();
	
	obj.add(1);
	obj.add(5);
	obj.add(7);
	obj.add(2);
	
	Enumeration e=obj.elements();
	 
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
	
	

	}

}
