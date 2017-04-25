package collect;

import java.util.*;

public class ArrayList4 {

public static void main(String[] args) {
	
	ArrayList<String> al = new ArrayList<String>();
	
	   al.add("India");
	   
	   al.add("US");
	   
	   al.add("China");
	   
	   al.add("Denmark");

	   /*Unsorted List*/
	   System.out.println("Before Sorting:");
	   
	   for(String counter: al){
		   
			System.out.println(counter);
		}

	   /* Sort statement*/
	   Collections.sort(al);

	   /* Sorted List*/
	   System.out.println("After Sorting:");
	   
	   for(String counter: al){
		   
			System.out.println(counter);
		}
	}
}