package com.arrayex;

import java.util.Scanner;

public class Matrixdemo {

public static void main(String[] args) {
	int a[][]=new int[3][3];
	
	int b[][]=new int[3][3];
	
	int c[][]=new int[3][3];
	
	 
System.out.println("enter first matrix");

Scanner s=new Scanner(System.in);

for(int i=0;i<3;i++)

	for(int j=0;j<3;j++)
		
		a[i][j]=s.nextInt();
		
	

System.out.println("enter second matrix");
for(int i=0;i<3;i++)

	for(int j=0;j<3;j++){
		
		b[i][j]=s.nextInt();
	
		System.out.println("matrix multiplication");
		
for( i=0;i<3;i++)
{
	for(j=0;j<3;j++){
		
		c[i][j]=0;
		
		for(int k=0;k<3;k++){
			
			c[i][j]=c[i][j]+a[i][k]*b[k][j];
		}
		
		
	}
	
	
    }


for( i=0;i<3;i++)
{
	for( j=0;j<3;j++){
	
		
System.out.print(c[i][j]);
	
		
 }
	
	System.out.println("");
	
    }
	
	}

	}
}

