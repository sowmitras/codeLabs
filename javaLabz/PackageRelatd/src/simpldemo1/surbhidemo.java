package simpldemo1;
import simplepack.*;


class protecteddemo extends simpledemo{
	 int k=1;
}
public class surbhidemo extends protecteddemo{
	
	public int j=5;
	
	public  void set()
	{
		System.out.println("set");
		System.out.println(k);
	}
}
