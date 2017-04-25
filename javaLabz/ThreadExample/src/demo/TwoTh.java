package demo;

class A extends Thread
{
	public void run()
	{
		System.out.println("classs A");
	}
}

class B extends Thread
{
    public void run()
    {
	System.out.println("classs B");
	}

}
public class TwoTh {

	public static void main(String[] args) {
		
		A obj=new A();
		
		obj.start();
		
		B obj1=new B();
		
		obj1.start();
		
		

	}

}
