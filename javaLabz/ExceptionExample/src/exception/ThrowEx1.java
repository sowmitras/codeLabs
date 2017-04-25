package exception;

import java.io.IOException;

public class ThrowEx1 {
	
	 static void checkEligibilty(int stuage, int stuweight){ 
		 
		 
	      if(stuage<12 && stuweight<40) {
	    	  
	    	  
	         throw new NullPointerException("Student is not eligible for registration");
	         
	      }
	      else {
	    	  
	         System.out.println("Entries Valid!!"); 
	      }
	   } 

	   public static void main(String args[]){ 
		   
	     System.out.println("Welcome to the Registration process!!");
	     
	     checkEligibilty(15, 390); 
	     
	     System.out.println("Have a nice day.."); 
	 
	   } 
	}