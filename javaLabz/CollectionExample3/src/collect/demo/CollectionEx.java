package collect.demo;

import java.util.*;

public class CollectionEx {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("suru");
		
		al.add("khare");
		
		al.add("shivi");
		
		al.add("sowmitras");
		
		al.add("solutios");
		
		System.out.println("initial value"+al);
		
		Collections.addAll(al,"veer","pucchu" );
		
		System.out.println("adding after collection value "+al);
		
		String s[]={"varun","abhi"};
		
		Collections.addAll(al, s);
		
		System.out.println("adding after array value"+al);
		
		

	}

}
