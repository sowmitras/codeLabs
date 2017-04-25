package collectE;

import java.util.*;

enum number
{
 one,two,three,four,five;
	
}

public class EnumSetEx1{

public static void main(String[] args) {
	
	   Set<number> set = EnumSet.of(number.one, number.five);  
	   
	    // Traversing elements
	   
	    Iterator<number> iter = set.iterator();  
	    
	    while (iter.hasNext()) 
	    	
	    System.out.println(iter.next()); 
	    
	   
	  }  
	
	}


