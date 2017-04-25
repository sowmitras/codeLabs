package collect;

import java.util.*;

public class ListIterater1 {

public static void main(String[] args) {
		
	ArrayList al=new ArrayList();
	
	al.add("surbhi");
	
	al.add("khare");
	
	al.add("sowmitras");
	
	al.add("java");
	
	System.out.println("first poition"+al.get(0));
	
	ListIterator<String> itr=al.listIterator(); 
	
	System.out.println("traversing elements in forward direction...");  
	
	while(itr.hasNext()){ 
		
		System.out.println(itr.next());  
	   }
	System.out.println("traversing elements in backward direction...");
	
	while(itr.hasPrevious())
	{  
		
	System.out.println(itr.previous()); 
	}  
	 
	}
    }
