package com.new1;

//Hierarchical inheritance

abstract class P{
	
	abstract void get();
	void set(int a,int b)
	{
		a=a;
		b=b;
		
		System.out.println(a+"\n"+b);
	}
	
	P()
	{
		System.out.println("constructor");
	}
    }

 class Q extends P{
	void get()
	{
		System.out.println("parent class meth");
	}
	
	Q(){
		System.out.println("This is Q constructor");
	}
}

abstract class R extends P
{
	void get()
	{
		System.out.println("parent class method 2");
	}
	
}

public class Abstraction3 extends R  {

	public static void main(String[] args) {
		
		Abstraction3 o=new Abstraction3();
		o.set(1, 5);
		o.get();
		
	
		Q q=new Q();
		q.get();
		
	}

}
