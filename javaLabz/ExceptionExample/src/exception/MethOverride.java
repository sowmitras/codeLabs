package exception;

import java.io.IOException;

class A
{
	void override()
	{
	System.out.println("parent class...........");
}
}
public class MethOverride extends A{
	
	void override () throws ArithmeticException
	
	{
		// we cannot take unchecked exception
		//super.override();
		System.out.println("child class...........");
	}
	
public static void main(String[] args) {
		
	new MethOverride().override();
	}

}
