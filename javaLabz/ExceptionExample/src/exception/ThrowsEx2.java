package exception;
import java.io.*;

class L
{
	void get() throws IOException
	{
		System.out.println("Exception..........");
	}
}

public class ThrowsEx2 {
	
	public static void main(String [] args) 
	{
		
		L obj=new L();
		
		//obj.get();
	     
		
		System.out.println("handled");
	}
		
	}


