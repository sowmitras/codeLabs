package com.surbhi;



class B
{
	B()
	{
		System.out.println("parent");
	}
}


public class InstanceTwo extends B {
	
	public InstanceTwo() {
		
		System.out.println("child");
	}
	

	public static void main(String[] args) {
		Instance i=new  Instance();
		

	}

}
