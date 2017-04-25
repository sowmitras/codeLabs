package demo;

 class SimpleEx {

	synchronized static void printTable(int n){  
		   for(int i=1;i<=10;i++){  
		     System.out.println(n*i);  
		     try{  
		       Thread.sleep(400);  
		     }catch(Exception e){
		    	 
		     }  
		   }  
		 }  
		}  
		  
		/*class a extends Thread{  
		public void run(){  
		SimpleEx.printTable(1);  
		}  
		}  
		  
		class K extends Thread{  
		public void run(){  
		SimpleEx.printTable(10);  
		}  
		}  */
		  
		
		  
		/*public class StaticSync{  
		public static void main(String t[]){  
		Surbhi t1=new Surbhi();  
		K t2=new K();  
		
		t1.start();  
		t2.start();  
		
		}  
		}  */