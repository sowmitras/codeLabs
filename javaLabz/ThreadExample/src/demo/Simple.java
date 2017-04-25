package demo;

public class Simple implements Runnable{
	
	public void run()
	{
		System.out.println("running..........");
	}

 public static void main(String[] args) {
	
	Thread t=new Thread(new Simple());
		
	Thread t1=new Thread(new Simple());
	
	t.start();
	t1.start();
	}

}
