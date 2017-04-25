package collect.demo;

import java.util.*;

public class MaxCollections {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(422);
		al.add(5);
		System.out.println("max values"+Collections.max(al));
		
		System.out.println("min values"+Collections.min(al));
	}

}
