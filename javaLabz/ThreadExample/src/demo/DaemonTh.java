package demo;

public class DaemonTh extends Thread{
	
	public void run()
	{
		if (Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon thread......");
		}
		else
		{
			System.out.println("normal thread.........");
		}
	}
	


public static void main(String[] args) {
	
		DaemonTh obj=new DaemonTh();
		
		DaemonTh obj1=new DaemonTh();
		
	    obj.setDaemon(true);
	   
		obj.start();
	
		obj1.start();
		
	}

}
