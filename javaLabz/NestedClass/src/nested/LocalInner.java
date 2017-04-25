package nested;

class ABC
{
	int i=2;
	
	void show()
	{
	String s="welcome";
		
		class s{
			int j=8;
			
			void msg(){
				
			System.out.println(i+"\n"+j+"\n"+s);
			
			}
			
		}
		  s obj=new s();
			obj.msg();
	}
}

public class LocalInner {

	public static void main(String[] args) {
		
		ABC a=new ABC();
		a.show();

	}

}
