package pack1;

class A
{
	protected int i=2;
}

public class Simple extends A {
	
	public void get()
	{
		System.out.println("get");
		
		System.out.println(i);
	}

}
