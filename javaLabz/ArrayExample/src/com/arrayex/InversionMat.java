package com.arrayex;

import java.util.Scanner;

public class InversionMat {

	public static void main(String[] args) {
		
		// array creation and allocated memory
        int[][] array = new int[3][3];
        // to initialize the values
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;
        array[2][0] = 7;
        array[2][1] = 8;
        array[2][2] = 9;
        // to print the matrix array
        System.out.println("Matrix");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
 
        //  to print the inverse of matrix array
        System.out.println("Inverse of Matrix");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(array[j][i] + " ");
            }
            System.out.print("\n");
        }
 
}
 
}