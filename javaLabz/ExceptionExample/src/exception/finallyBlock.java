package exception;

public class finallyBlock {

	public static void main(String[] args) {
		
		try
		{
			int a=10/0;
			
			System.out.println(a);
			
			System.exit(0);
		}
		
		
		catch(Exception e)
		{
			System.out.println("handle");
			System.exit(0);
		}
	
		
		finally
		{
			System.out.println("finally.......");	
		}
	}

}
