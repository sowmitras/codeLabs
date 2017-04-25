package exception;

public class NestedTry1 {

public static void main(String[] args) {
	
	try
	{
//		int i=20/0;
//		
//		System.out.println(i);
		
	try
	{
		int a[]={2,5,4,7,8,9,1,0,2,5,5};
		
		System.out.println(a[50]);
	}
		catch (Exception e) {
			
			System.out.println("surbhi");
		}
	

	
	    try
     	{
		int a=5/0;
		
		System.out.println(a);
	    }
		catch (Exception e) {
			
			System.out.println("khare");
		}
	
	int i=20/0;
	
	System.out.println(i);
	
	}
	catch (Exception e) {
		
		System.out.println("maheshwar");
	}
	catch (Throwable e) {
		
		System.out.println("Indore");
	}
	


	}

}
