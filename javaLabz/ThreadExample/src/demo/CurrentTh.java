package demo;

public class CurrentTh extends Thread{
	
	public void run()
	{
		System.out.println(Thread.currentThread());
	}

	public static void main(String[] args) {
		
		CurrentTh obj=new CurrentTh();
		CurrentTh obj1=new CurrentTh();
		
		obj.start();
		
		obj1.start();

	}

}
