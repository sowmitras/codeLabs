package com.arrayex;

import java.util.Scanner;

public class Matrix {

public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
		
	int i,row,col;
		
	int a[][]=new int[3][3];
		
	System.out.println("enter row");
		
	row=s.nextInt();
		
	 System.out.println("enter col");
	
      col=s.nextInt();
      
      System.out.println("total elements"+(row*col));
      
      for(i=0;i<row;i++)
      {
    	  for(int j=0;j<col;j++)
    	  {
    		  a[i][j]=s.nextInt();
    	  }
      }
      
      for( i=0;i<row;i++)
      {
    	for(int j=0;j<col;j++)  {
    		
    		System.out.print(a[i][j]+" ");
    		
    	}
    	System.out.println(" ");
      }
      
      
      
      
	}
}
