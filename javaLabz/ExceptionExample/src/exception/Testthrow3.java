package exception;

import java.io.IOException;

class Ma{  
	
 void method()throws IOException{ 
	 
	 throw new IOException("device error"); 
	 
 // System.out.println("device operation performed"); 
	 
	 //if we use sop so we cannot write throws exception in main method
 } 
 
}  
class Testthrows3{
	
 public static void main(String args[]) throws Exception{//declare exception  
	  
	Ma m=new Ma(); 
     
    m.method();  
  
    System.out.println("normal flow...");  
     
    } 
	      
    } 
