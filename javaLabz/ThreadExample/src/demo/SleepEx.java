package demo;

class SleepEx extends Thread{  
	 public void run(){  
	  for(int i=1;i<5;i++)
	  {  
		  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    	System.out.println(i); 
	  }  
	  }  
	 
	 public static void main(String args[]){  
	  SleepEx t1=new SleepEx();  
	  SleepEx t2=new SleepEx();  
	   
	  t1.start();  
	  t2.start();  
	 }  
	}  
