package nested;

 abstract class sur
{
	abstract void demo();
	 
}

public class Annonymous2 {

	public static void main(String[] args) {
		
		sur s=new sur()
		{
			void demo()
			{
				System.out.println("hello");
			}
			
		};
		s.demo();
		
		
		
	}

}
