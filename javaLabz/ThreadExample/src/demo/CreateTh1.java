package demo;

public class CreateTh1 implements Runnable{
	
	
	public void run()
	{
		System.out.println("run............");
	}

	public static void main(String[] args) {
		
		CreateTh1 obj=new CreateTh1();
		
		Thread t=new Thread(obj);
		
		t.start();
	}

}
