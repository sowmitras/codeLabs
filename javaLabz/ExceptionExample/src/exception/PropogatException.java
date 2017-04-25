package exception;

public class PropogatException {
	
	void get()
	{
		
   int a[]=new int[5];
		
  System.out.println(a[10]);
	}
	
	void set()
	{
		get();
	}
	
	void display()
	{
		try
		{
			set();
		}
		catch(Exception e)
		{
			System.out.println("Exeption............");
		}
	}

 public static void main(String[] args) {
	
	PropogatException obj=new PropogatException();
	
	obj.display();
	}

}
