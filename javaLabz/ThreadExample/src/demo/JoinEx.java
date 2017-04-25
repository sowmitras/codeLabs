package demo;

class JoinEx extends Thread{  
	
	 public void run(){
		 
	  for(int i=1;i<=5;i++){  
		  
	   try {
		   
		Thread.sleep(1000);
		
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	  System.out.println(i);  
	  
	 } 
	  
	 }
	public static void main(String args[]){  
		
		JoinEx t1=new JoinEx(); 
		
		JoinEx t2=new JoinEx(); 
		
		JoinEx t3=new JoinEx();  
	   t1.start();  
	 
	 try{
		 //t1.join(); 
		 
	  t1.join(1500); 
	  
	 }
	 catch(Exception e){
		 
		 System.out.println(e);
		 }  
	  
	 t2.start();
	 
	 t3.start();  
	 }  
	}  