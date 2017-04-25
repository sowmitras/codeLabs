package com.inheritance;


class S

{
	void get()
	{
	System.out.println("get");
	}
}

class K extends S
{
	void get()
	{super.get();
		System.out.println("set");
	}
}

class C extends K {
	
	void get()
	{super.get();
		System.out.println("display");
	}
}

public class MultiLevel {

	public static void main(String[] args) {
		C obj=new C();
	
		obj.get();
	
	
	}

}
