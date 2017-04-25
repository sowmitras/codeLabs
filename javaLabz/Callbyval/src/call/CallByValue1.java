package call;

public class CallByValue1 {
	
	int a=10;

	void change(int a)
	{
		a=a+10;
		
	}

public static void main(String[] args) {
	
	CallByValue1 obj=new CallByValue1();
	
	System.out.println("before change"+obj.a);
	
	obj.change(1000);
	
	System.out.println("after change"+obj.a);
			
		
	}

}
