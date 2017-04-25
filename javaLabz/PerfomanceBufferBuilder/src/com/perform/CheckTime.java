package com.perform;



public class CheckTime {

public static void main(String[] args) {
		
	long startTime=System.currentTimeMillis();
	
 StringBuilder sb1=new StringBuilder("Demo");
	
	for(int i=0;i<=1000;i++)
    {
    	sb1.append("example");
    }
    System.out.println("String Builder"+(System.currentTimeMillis()-startTime)+"ms");
	
	StringBuffer sb=new StringBuffer("Demo");
	
	
	
    for(int i=0;i<=1000;i++)
    {
    	sb.append("example");
    }
    System.out.println("String Buffer"+(System.currentTimeMillis()-startTime)+"ms");
    
    
   
	}

}
