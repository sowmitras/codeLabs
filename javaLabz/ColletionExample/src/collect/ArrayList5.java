package collect;

import java.util.*;

public class ArrayList5 {

public static void main(String[] args) {
		
	ArrayList al=new ArrayList();
	
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	al.add(5);

	ArrayList al1=new ArrayList();
	
	al1.add(6);
	al1.add(7);
	al1.add(8);
	al1.add(9);
	al1.add(10);
	
	al.removeAll(al1);
	
	  Iterator itr=al.iterator();
	  
	  while(itr.hasNext())
	  {  
		   System.out.println(itr.next());
	  }
	    
	}

}
