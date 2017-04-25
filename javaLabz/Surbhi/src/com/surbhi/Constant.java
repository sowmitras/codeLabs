/**
 * 
 */
package com.surbhi;

/**
 * @author surbhi_khare
 *
 */
public class Constant {
	
	int i;
	String s;
	int j;

	
	public Constant(int i,String s) {
		
		i=i;
		s=s;
		System.out.println(i+"\n"+s);
		
	}

public Constant(int j) {
		
		j=j;
	
		System.out.println(j);
		
	}

	
	
	public static void main(String[] args) {
		
		Constant obj=new Constant(1,"java");
		Constant obj1=new Constant(2);
		
	}

}
