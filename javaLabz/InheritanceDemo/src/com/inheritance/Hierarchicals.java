package com.inheritance;

class par
{
	void get()
	{
		System.out.println("par");
	}
}

class chil extends par{
	void set()
	{
		System.out.println("chil");
	}
	
}
class subchil extends par{
	void show()
	{
		System.out.println("subchil");
	}
}

public class Hierarchicals {
	public static void main(String args[]){
	subchil sc=new subchil();
	sc.get();
	
	sc.show();
	chil ch=new chil();
	ch.set();
	
	}

}
