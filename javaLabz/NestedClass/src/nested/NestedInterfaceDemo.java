package nested;

interface parent{
	
	void done();
	
	interface child{
		
	void did();
	
	}
}

public class NestedInterfaceDemo implements parent.child{
	
	public void done()
	{
		System.out.println("done......");
	}
	
	public void did()
	{
		System.out.println("did........");
	}

public static void main(String[] args) {
	
	parent.child obj=new NestedInterfaceDemo();
	
		obj.did();
		
	//	obj.done();
	
	}

}
