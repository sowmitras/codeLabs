package com.str;

public class LastIndexMeth {

	public static void main(String[] args) {
		String s1="this is index of example";//there are 2 's' characters in this sentence  
		
		int index1=s1.lastIndexOf('e');//returns last index of 's' char value
		
		System.out.println(index1);//23 
		
		System.out.println(s1.length());
	}

}
