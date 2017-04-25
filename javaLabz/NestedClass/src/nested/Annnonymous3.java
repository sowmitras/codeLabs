package nested;

interface surbhi{
	void get();
}

public class Annnonymous3 {

	public static void main(String[] args) {
		
		surbhi s=new surbhi()
				{
			public void get()
			{
				System.out.println("get");
			}
				
		   };
		   
		   s.get();
		
	       }

           }
