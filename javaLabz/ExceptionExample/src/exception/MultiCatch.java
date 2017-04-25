package exception;

public class MultiCatch {

public static void main(String[] args) {
	
	try
	{
		String s="surbhi";
		
		int i= Integer.parseInt(s);
		
		//System.out.println(s.length());
	}
	catch (RuntimeException e) {
		
		System.out.println("exception");
	}
		
	catch (Exception e) {
		
		System.out.println("numberformatexception");
	}
  catch (Throwable e) {
		
		System.out.println("surbhi...........");
	}
	
	}

}
