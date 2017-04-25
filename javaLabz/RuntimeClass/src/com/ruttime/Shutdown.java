package com.ruttime;

public class Shutdown {

	public static void main(String[] args) throws Exception {
		
		 Runtime.getRuntime().exec("shutdown -r -t 0"); 
		 
		 System.out.println(Runtime.getRuntime().availableProcessors());  

	}

}
