package com.demo;

public class Instance2 {
	
	
	public Instance2() {
		System.out.println("constructor");
	}
	
	
	{
		System.out.println("instance initializer");
	}

	public static void main(String[] args) {
		Instance2 obj=new Instance2();
		

	}

}
