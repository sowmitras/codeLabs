package com.multi;

class  statment
{
	int get(int op1,int op2)
	{
		return op1+op2;
	}
}

public class Returnstmnt {

public static void main(String[] args) {
	
	statment obj=new statment();
	
	System.out.println(obj.get(1,2));
		
	}

}
