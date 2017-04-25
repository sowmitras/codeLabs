package com.surbhi;


class A
{
	A()
	{
		System.out.println("a");
	}
	
	A(int i)
	{
		this();
		i=i+20;
		System.out.println(i);
		
		
	}
}

public class ThisKey {
	
public static void main(String[] args){

	
	A aa1=new A(40);


	}

}
