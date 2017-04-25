package collectE;

 import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQ {

	public static void main(String[] args) {
		
		PriorityQueue obj=new PriorityQueue();
		
		//obj.add(5);
		
		//obj.add(null);
		
		//obj.add(5);
		
		obj.add("Khargone");
		
		obj.add("Borawn");
		
		obj.add("JIT");
		
		obj.add("Khargone");
		
		obj.add("JIT");
		
		
	
		//obj.add(1);
		
		System.out.println("head:"+obj.element()); 
		
		System.out.println("head:"+obj.peek());  
		
		Iterator it=obj.iterator() ;

         while(it.hasNext())
         {
	   System.out.println(it.next());
         }
         
         obj.remove();  
         
         obj.poll(); 
         
         System.out.println("after removing two elements:");  
         
         Iterator<String> itr2=obj.iterator();  
         
         while(itr2.hasNext()){  
        	 
         System.out.println(itr2.next()); 

	}
	}

}
