package com.new1;

// multilevel inheritance
abstract class A{
	
abstract void AB();

}

abstract class B extends A{
	
	void set()
	{
		System.out.println("set method");
	}
	
abstract void AB();

abstract void CD();

}

abstract class S extends B{
	
	void AB() {
	
		
System.out.println("AB");
		
	}
	
	
	void CD() {
		
		System.out.println("CD");
	}

	
	
}
public class Abstraction2 extends S{

	public static void main(String[] args) {
		
		Abstraction2 obj=new Abstraction2();
		obj.AB();
		obj.CD();
		obj.set();
		

	}

}
