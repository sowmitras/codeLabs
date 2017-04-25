package exception;

public class simpleexception {

public static void main(String[] args) {
	try
	{
		
	int a=50/0;
	
	System.out.println(a);
     }
	catch (Exception e) {
		
	System.out.println("Arithmetic exception caught");
	}
	
	try
	
	{ 
		
	String s=null;
	
	System.out.println(s.length());
	
    }
	catch (Exception e) {
		
		System.out.println("Nullpointer exception caught");
		
	}
	
	try
	
	{
		
	String s1="abc";
	
	int i=Integer.parseInt(s1);
	
    }
	catch (Exception e) {
		
		System.out.println("NumberFormat exception caught");
		
	}
	
	try
	{
		
		int a[]=new int[10];
		
		System.out.println(a[20]);
	
    }
	catch (Exception e) {
		
		System.out.println("ArrayIndex out of bounds exception caught");
		
	}
	
}


}
