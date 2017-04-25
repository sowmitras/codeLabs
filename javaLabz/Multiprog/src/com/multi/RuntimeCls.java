package com.multi;

public class RuntimeCls {

	public static void main(String[] args) {
		
		Runtime run=Runtime.getRuntime();
		
		System.out.println(run.totalMemory());
		
		System.out.println(run.freeMemory());
		
 for(int i=0;i<=100;i++)
 {
	
 }
 System.out.println("After creating 100 instance, Free Memory: "+run.freeMemory()); 
 
 System.gc();
 
 System.out.println("After gc(), Free Memory: "+run.freeMemory());  	
		
	}

}
