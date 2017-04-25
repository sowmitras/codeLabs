package nested;

class M
{
	void set()
	{
		System.out.println("set");
	}
	interface N{
		
		void get();
	}
}

public class NestedInterfaceDemo2 implements M.N{
	
	public void get()
	{
		System.out.println("get");
	}

	public static void main(String[] args) {
		
		M.N obj=new NestedInterfaceDemo2(); {
			
			obj.get();
			//obj.set();
			
		}

	}

}
