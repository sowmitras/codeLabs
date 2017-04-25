package com.const1;

public class Constthis {
	
	int i1,j1;
	
	public Constthis(int i,int j) {
		
    i1=i;
		
	j1=j;

	}
	void get()
	{
		System.out.println(i1+"\n"+j1);
	}

	public static void main(String[] args) {
		
		Constthis obj=new Constthis(1, 2);
		
		obj.get();


	}

}
