package demo;

class Khare{
	void take(int n)
	{
		synchronized (this) {
			for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		}
		
}

public class TestSynchronization4 {

	public static void main(String[] args) {
		 
		Khare k=new Khare();
		
		Thread t=new Thread(){
		
		public void run()
		{
			k.take(4);
		}
		
		};
		
		Thread t1=new Thread()
		{
		public void run()
		{
			k.take(9);
			
		}
	    };
	    
	    t.start();
	    t1.start();

	}

}
