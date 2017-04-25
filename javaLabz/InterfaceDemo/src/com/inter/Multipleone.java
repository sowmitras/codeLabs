package com.inter;

interface surbhi{
	 
	int z=156;

	void get();
	
}

interface j{
	
	void set();
}

class Vehicle  implements surbhi,j{
	
	public void get(){
		
		System.out.println("distance travelled is maheshwar");
		System.out.println(z);
	}
	public void set(){
		
		System.out.println("distance travelled is pune");
		
		System.out.println(z);
	}
}

public class Multipleone {

public static void main(String[] args) {
	
	Vehicle obj=new Vehicle();
	
	obj.get();
	obj.set();

	}

}
