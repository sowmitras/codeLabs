package com.surbhi;

public class Instance {
	
	public void get() {
		System.out.println("constructor");
	}
	
	{
		System.out.println("block");
	}
	
	static{
		System.out.println("static");	
	}
	
	void set()
	{
		System.out.println("set");	
	}
public static void main(String[] args) {
	
	Instance  obj=	new Instance();
	obj.get();
	obj.set();
	
	}

}
