package com.inheritance;

class A{
	
	void get()
	{
		System.out.println("parent class");
	}
}

class B extends A
{
	void set()
	{
		System.out.println("child class");
	}
}

public class Single {

public static void main(String[] args) {
		B obj=new B();
		obj.get();
		obj.set();
	

	}

}
