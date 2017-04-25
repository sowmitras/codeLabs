package com.inst;

class Sur{
	Sur()
	{
		System.out.println("parent");
	}
}

public class InstanceOne extends Sur{
	
	
	public InstanceOne() {
		System.out.println("child ");
	}
	{
		System.out.println("instance");
	}

	
	
	public static void main(String[] args) {
		InstanceOne obj=new InstanceOne();
		


	}

}
