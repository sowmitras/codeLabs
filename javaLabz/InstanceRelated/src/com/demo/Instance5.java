package com.demo;


class D{
	
	D()
	{
		System.out.println("parent class constructor");
	}
}
public class Instance5 extends D{
	
	 Instance5() {
		
		System.out.println("default child constructor");
	}
	
	Instance5(int i){
		System.out.println("parameterized constructor"+i);
	}
	
	{
		System.out.println("instance initializer block");
	}
	{
		System.out.println("instance initializer block2");
	}

	public static void main(String[] args) {
		
		Instance5 obj=new  Instance5();
		Instance5 obj1=new Instance5(564);

	}

}
