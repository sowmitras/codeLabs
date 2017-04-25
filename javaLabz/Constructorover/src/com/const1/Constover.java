package com.const1;

public class Constover {
	
	int i1;
	int j1; 
	char c1;
	
public Constover(int i,int j) {
	
	i1=i;
	j1=j;	
	
	System.out.println(i1+j1);
}


public Constover(char c) {
	c1=c;
	System.out.println(c1);	
}


	public static void main(String[] args) {
		
		Constover con=new Constover(1,8);
		
		
		Constover con1=new Constover('s');

		
		
			


	}

}
