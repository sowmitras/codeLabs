package com.new1;


abstract class Simple
{
	void simpleget()
	{
		System.out.println("welcome to abstraction");
	}
	
	abstract void  get();
}

public class Simpleabstract extends  Simple{
	void get()
	{
		System.out.println("simple abstraction");
	}

public static void main(String[] args) {
	
	Simple sa=new Simpleabstract();
	sa.get();
	sa.simpleget();
	

}
}
