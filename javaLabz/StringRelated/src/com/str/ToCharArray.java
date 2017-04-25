package com.str;

public class ToCharArray {

	public static void main(String[] args) {
		String s="java string";
		
		char[] c=s.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}

}
