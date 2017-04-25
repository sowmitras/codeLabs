package com.multi;

class example
{
public surbhi getNew()
	{
		return new surbhi();
	}
}

class surbhi
{
	int i=100;
}

public class ReturnObj {

public static void main(String[] args) {
		
example ex=new example();

ex.getNew();

surbhi obj=new surbhi();

System.out.println(obj.i);
	}

}
