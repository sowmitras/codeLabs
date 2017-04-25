package com.arrayex;

import java.util.Scanner;

public class MatrixMulti {

	public static void main(String[] args) {
		
		int i, j, k, cols, rows, p;
		
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        
        rows = s.nextInt();
        
        System.out.print("Enter number of cols: ");
        
        cols = s.nextInt();
        
        int a[][] = new int[rows][cols]; 
        // First Array Elements
        int b[][] = new int[rows][cols]; 
        // Second Array Elements
        int c[][] = new int[rows][cols];
        
        // Multiplication of Two Matrix
        
        p = rows;
        
        System.out.println("Enter the first matrix");
        
        for (i = 0; i < rows; i++) {
        	
            for (j = 0; j < cols; j++) {
            	
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter the second matrix");
        
        for (i = 0; i < rows; i++) {
        	
            for (j = 0; j < cols; j++) {
            	
                b[i][j] = s.nextInt();
            }
        }
        // Multiplication start from here
        for (i = 0; i < rows; i++) {
        	
            for (j = 0; j < cols; j++) {
            	
                c[i][j] = 0;
                
                for (k = 0; k < p; k++) {
                	
                    c[i][j] = a[i][k] * b[k][j] + c[i][j];
                }
            }
        }
 
        // just for user display
        System.out.println("First Matrix is: ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
 
        // just for user display
        System.out.println("Second Matrix is: ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
 
        //Print the multiplication result here
       System.out.println("Multiplication matrix is: ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < cols; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

}
}
