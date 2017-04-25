package pack2;

import pack1.One;

class B extends One{
	void disp()
	{
		System.out.println(c);
		
		//System.out.println(c);
		
		//default c cannot be access here while protected is access 
	}
	
}

public class Two {
	
public static void main(String[] args) {
	
	One obj=new One();
	obj.take();
	
	System.out.println(obj.i);
	

}

}
