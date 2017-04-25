package collect.demo;

import java.util.*;

public class SortCollection1 {

public static void main(String[] args) {
	
	ArrayList<Integer> al=new ArrayList<>();
	
	al.add(Integer.valueOf(520));
	
	al.add(Integer.valueOf(50));
	
	al.add(Integer.valueOf(52));
	
	al.add(Integer.valueOf(1000));

	
	Collections.sort(al);
	
	Iterator itr=al.iterator();
	
	while(itr.hasNext()){  
		
	System.out.println(itr.next());  
		
	}
}

}
