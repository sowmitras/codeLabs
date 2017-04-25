package demo;

class A
{
	void get(int n)
	{
		synchronized (this) {
			
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}
}

class B extends Thread{
	
	A a;
	B (A a)
	{
		this.a=a;
	}
	
	public void run()
	{
		a.get(2);
	}
}

class C extends Thread{
	
	A a;
	C(A a)
	{
		this.a=a;
	}
	public void run()
	{
		a.get(5);
	}
	
}

public class TestSynchronization3 {

public static void main(String[] args) {
		
		A t=new A();
		B b=new B(t);
		C c=new C(t);
		
		b.start();
		c.start();
		
	}

}
