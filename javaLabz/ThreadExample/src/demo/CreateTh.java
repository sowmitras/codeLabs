package demo;

public class CreateTh extends Thread{
	public void run()
	{
		System.out.println("run..............");
	}

public static void main(String[] args) {
	
	CreateTh obj=new CreateTh();
	obj.start();
		

	}

}
