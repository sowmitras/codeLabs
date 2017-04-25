package com.str;

public class StrBuffermeth {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("welcome");
		
		sb.append("string");
		
		sb.insert(7, "surbhi");
		
		sb.replace(1, 4,"khare");
		
		sb.delete(2, 5);
		
		sb.reverse();
		
		System.out.println(sb);

	}

}
