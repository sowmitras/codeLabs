package demo;

public class ThreadTwice extends Thread{
	public void run()
	{
		System.out.println("running.......");
	}

	public static void main(String[] args) {
		
		ThreadTwice t=new ThreadTwice();
		t.start();
		t.start();
	
	}

}
