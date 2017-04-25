package com.op;

 public class BooleanType {
	
	static boolean A=true;
	
	static boolean B=true;
	
 public static void main(String[] args) {
		
		System.out.println("A|B="+(A|B));
		
		System.out.println("A&B="+(A&B));
		
		System.out.println("A&B="+!(A&B));
		
		System.out.println("!A="+(!A));
		
		System.out.println("A^B="+(A^B));

	}

}
