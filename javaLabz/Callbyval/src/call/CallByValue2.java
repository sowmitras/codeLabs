package call;

public class CallByValue2 {

int a=2;
	
void change(int a)
	{
	
a=a+100;

	}
public static void main(String[] args) {
		
CallByValue2 obj=new CallByValue2();
	
System.out.println("before change"+obj.a);
	
obj.change(4);
	
System.out.println("after change"+obj.a);
	
	}

}
