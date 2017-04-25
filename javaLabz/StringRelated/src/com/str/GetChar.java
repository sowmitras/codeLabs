package com.str;

public class GetChar {

public static void main(String[] args) {
	
	String  s="This is a demo of getchars method This is a demo of getchars method";
	
	//int start=8;
	
	//int end=30;
	
	char c[]=new char[s.length()];
	
	s.getChars(8,15, c, 0); 
	
	System.out.println(c);// a demo
	
	String s1=s.replaceAll("is", "was");
	
	System.out.println(s1);
	
	}

}
