package nested;

public class Inner {
	
static String s="surbhi";

static int i=100;

static boolean b=true;


void outside()
{
	System.out.println("outside");
}
	
	class SubInner
	{
		 void display()
		{
			 outside();
			System.out.println("display"+"\n"+s+"\n"+i+"\n"+b);
		}
		
	}

public static void main(String[] args) {
		
	Inner o=new Inner();
	
	Inner.SubInner o1=o.new SubInner();
	
	o1.display();

	}

}
