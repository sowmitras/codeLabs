package simplepack;

class A
{
	protected char c;
	protected void set()
	{
		c='a';
	}
}

public class simpledemo extends A{
	
	public int i=120;
	
	public void get()
	{
		System.out.println("get");
//		set();
//		System.out.println(c);
		
	}

}
