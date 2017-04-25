package collectE;

import java.util.*;

public class Dequeue1 {

public static void main(String[] args) {
		
	 Deque<Integer> deque = new ArrayDeque<Integer>();  
	 
	 deque.add(5);
	 deque.add(4);
	 deque.add(3);
	 deque.add(2);
	 deque.add(1);
	 deque.add(5);
	 deque.addFirst(78);

	 Iterator it=deque.iterator();
	 
	 for(Integer s:deque){ 
		 
		 System.out.println(s);  
	 }
	        
	    deque.pollLast(); 
	    
	    System.out.println("After pollLast() Traversal...");  
	    
	    for(Integer s:deque){
	    	
	        System.out.println(s);  

	    }  
	    
	}

}
