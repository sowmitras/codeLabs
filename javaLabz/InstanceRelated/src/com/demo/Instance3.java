package com.demo;


class Sur
{
	public Sur() {
		System.out.println("parent class constructor");
	}
}
public class Instance3 extends Sur {
	
	public Instance3() {
		System.out.println("child class constructor");
	}
	{
		System.out.println("instance initializer block ");
	}

	public static void main(String[] args) {
		Instance3 obj=new Instance3();

	}

}
