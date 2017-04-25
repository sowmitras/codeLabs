package com.str;

public class SplitMeth {

public static void main(String[] args) {
	
	String s="This is string";
	String[] s1=s.split("\\s");
	
	for(int i=0;i<s1.length;i++)
	{
		System.out.println(s1[i]);
	}
		
	}

}
