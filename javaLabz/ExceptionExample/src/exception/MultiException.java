package exception;

public class MultiException {

public static void main(String[] args) {
	
	try
	{
		String s=null;
		System.out.println(s.length());

	}
	
	catch (Exception e) {
		System.out.println("surbhi");
	}
	
	try
	{

		int a=30/0;
		System.out.println(a);
	}
	catch (ArithmeticException e) {
		System.out.println("Arithmetic");
	}
	catch (RuntimeException e) {
		System.out.println("Runtime");
	}
	
	catch (Exception e) {
		System.out.println("Runtime");
	}
	catch (Throwable e) {
		System.out.println("Runtime");
	}
}
}
