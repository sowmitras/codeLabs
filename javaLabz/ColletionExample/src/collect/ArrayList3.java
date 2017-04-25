package collect;

import java.util.*;

public class ArrayList3 {

public static void main(String[] args) {
	
	ArrayList al=new ArrayList();
	
	al.add(1);
	
	al.add("suru");
	
	al.add(2.35f);
	
	ArrayList al2=new ArrayList();
	
	al2.add(5);
	
	
	al2.add("welcome");
	
	al.addAll(al2);
	
	
	Iterator it=al.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}

	}

}
