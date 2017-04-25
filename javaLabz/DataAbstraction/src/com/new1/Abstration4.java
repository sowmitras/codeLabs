package com.new1;


abstract class Apple {
	
	int i=5;
	int j=3;
	
	abstract void meth(int i,int  j) ;
	
   static int a=5;
	static{
		System.out.println(a);
	}

	static{
		System.out.println("hello");
		System.out.println("helloworld");
	}
}


public class Abstration4 extends  Apple{
	
	void meth(int i,int j)
	{
		i=i+100;
		j=j+100;
		
		System.out.println(i+"\t"+j);
	}
	

	public static void main(String[] args) {
		
		
		Abstration4 o=new Abstration4();
		o.meth(5, 5);
		
		System.out.println("main");
		
		


	}

}
