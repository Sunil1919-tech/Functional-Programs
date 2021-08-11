package com.bridgelabz;

import java.util.Scanner;

public class twoDArray {
    /*
     * Ask User To Print 2DArray Matrix
     * And Print The Matrix
     */
    public static void main(String args[]) {
        //Welcome Message Added
        System.out.println("Welcome to The 2-D Array Matrix Program");
        //Ask User To Enter The Array Size
        System.out.println("Enter 2D array size  ");
        //Ask User To Enter The Array Elements
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows of the Matrix  = ");
        int rows = sc.nextInt();
        System.out.println("Enter the no. of columns of a Matrix = ");
        int columns = sc.nextInt();
        System.out.println("Enter array elements : ");
        //Condition To Store The Array Values In Matrix
        int twoD[][] = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                twoD[i][j] = sc.nextInt();
            }
        }
        System.out.print("\nThe Matrix for given numbers is \n");
        for (int[] x : twoD) {
            for (int y : x) {
                System.out.print(y + "        ");
            }
            System.out.println();
        }
    }
}