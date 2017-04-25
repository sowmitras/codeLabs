package com.inter;

interface i{
	
	void get( int a,int b);
	
}

public class InterfaceOne implements i{
	
	public void get(final int a ,final int b)
	{
		
		
		System.out.println("get"+"\n"+a+"\n"+b);
	}

public static void main(String[] args) {
		
	InterfaceOne o=new InterfaceOne();
	
o.get(4,5);

	}

}
