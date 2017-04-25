package collect;

import java.util.*;

public class ArrayListEx {
	
public static void main(String[] args) {
	
	List<String> al=new ArrayList<String>();
	
	al.add("welcome");
		
	al.add("world");
	
	al.add("surbhi");
	
	al.add("khare");
	
	
	
//Iterator<String> it=al.iterator();
//while(it.hasNext())
//{
//	System.out.println(it.next());
//}
	
	for(String obj:al)
	{
		System.out.println(obj);
	
	}
	String getval=al.get(1);
	
	System.out.println("value get"+getval);
	
	}

}
