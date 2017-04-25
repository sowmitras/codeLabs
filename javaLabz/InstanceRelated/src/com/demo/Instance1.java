package com.demo;

public class Instance1 {
	
	int a;
	
	void get() {
		System.out.println("instance constructor"+a);
	}
	
	
	/*public Instance1() {
		System.out.println("constructor");
	}*/
	{
		a=895;
	}

	public static void main(String[] args) {
		Instance1 obj=new Instance1();
		obj.get();

	}

}
