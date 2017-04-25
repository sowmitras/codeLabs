package collect;

import java.util.*;

public class Hashset1 {

public static void main(String[] args) {
	
	HashSet obj=new HashSet();
	
	obj.add(null);
	obj.add(null);
	obj.add("khare");
	obj.add("java");
	obj.add("world");
	obj.add("java");
	 
	Iterator it=obj.iterator(); 

	while(it.hasNext())
	{
		System.out.println(it.next());
	}

	}

}
