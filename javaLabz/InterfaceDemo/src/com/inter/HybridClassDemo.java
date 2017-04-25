package com.inter;

interface a{
	void get();
}

interface b extends a{
	void set();
}

interface c extends a{
	void show();
}

class d implements b,c{
	
public void get()
	{
		System.out.println("get");
	}

public void set()

{
	System.out.println("set");
}

public void show()

{
	System.out.println("show");
}
}

public class HybridClassDemo {
	
	
public static void main(String[] args) {
	d obj=new d();
	obj.get();
	
	obj.set();
	obj.show();

}
}
