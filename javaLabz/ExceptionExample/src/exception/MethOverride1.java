package exception;

class S
{int i=20;
	
	void get() throws Throwable
	{
		
		System.out.println("parent");
		
	}
}

public class MethOverride1 extends S{
	
	void get() throws ArithmeticException
	{ 
		//super.get();
		System.out.println("child"+i);
	}

public static void main(String[] args)  throws Exception {
	
//	try {
//		new MethOverride1().get();
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	

	new MethOverride1().get();
		
	}

}
