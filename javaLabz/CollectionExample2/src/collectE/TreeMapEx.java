package collectE;

import java.util.*;
import java.util.Map.Entry;

public abstract class TreeMapEx {

public static void main(String[] args) {
		
	TreeMap<Integer, String> obj=new TreeMap<Integer, String>();
	
	obj.put(1, null);
	
	obj.put(5, null);
	
	obj.put(8, null);
	
	obj.put(3, null);
	
	obj.put(2, null);
	
	//obj.put(null, "gygyg");
	
	//obj.put(null, "welcome");
	
	//System.out.println(obj);
	
	for(Map.Entry m:obj.entrySet())
	{
		System.out.println(m);
	}
	
	
	}

}
