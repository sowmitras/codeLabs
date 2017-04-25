package com.const1;

public class Constoverthis {
	
	int i1,j1;
	
	String s1;
	
	
 Constoverthis(int i,int j) {
		
	i1=i;
		
	j1=j;
		
	System.out.println(i1+"\t"+j1);
	}
	
    Constoverthis(String s) {
    	
		s1=s;
		
		System.out.println(s1);
		
	}

	public static void main(String[] args) {
		
		Constoverthis obj=new Constoverthis(2,5);
		
		Constoverthis obj1=new Constoverthis("surbhi");

	}

}
