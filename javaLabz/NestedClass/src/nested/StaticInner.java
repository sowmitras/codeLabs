package nested;

class khare
{
	static int i=100;
	
	static String  s="java";
	
   static class surbhi
	{
		void disp()
		{
			System.out.println("display"+i+"\n"+s);
		}
	}
}

public class StaticInner {

public static void main(String[] args) {
	
	khare.surbhi obj=new khare.surbhi();
	
	obj.disp();
		

	}

}
