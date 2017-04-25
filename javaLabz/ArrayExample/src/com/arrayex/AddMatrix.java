package com.arrayex;

import java.util.Scanner;

public class AddMatrix {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int a[][]=new int[10][10];
		
		int b[][]=new int[10][10];
	
		int row,col,j,i,k;
		
		System.out.println("enter row");
		
  row=s.nextInt();

 System.out.println("enter col");

col=s.nextInt();

System.out.println("Total array element"+row*col);

System.out.println("enter first matrix");

for(i=0;i<row;i++)
{
	for(j=0;j<col;j++)
	{
		a[i][j]=s.nextInt();
	}
}
System.out.println("enter secnd matrix");

for(i=0;i<row;i++){
	

	for(j=0;j<col;j++)	{
		
		b[i][j]=s.nextInt();
		
	}
	}



int[][] c = new int[row][col];

for (i = 0; i < row; i++) {
	
    for ( j = 0; j < col; j++) {
    	
        c[i][j] = a[i][j] + b[i][j];
    }
}
System.out.println("The sum of the two matrices is");

for (i = 0; i < row; i++) {
	
    for (j = 0; j < col; j++) {
    	
        System.out.print(c[i][j] + " ");
    }
    System.out.println();
     }
	}
	}






















