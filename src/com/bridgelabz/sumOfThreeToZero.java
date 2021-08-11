package com.bridgelabz;

public class sumOfThreeToZero {
    /*
     * Ask User To Enter The Three Digits
     * And Write Condition To Sum Of Three Digits To Zero
     */
    public static void main(String[] args) {
        //Storing Array Values In Array
        int array[] = {0, -1, 2, -3, 1};
        int n = array.length;
        int sum = 0;
        //For Loop To Print To Get Sum Equals To Zero
        for (int p = 0; p < n - 2; p++) {
            for (int q = p + 1; q < n - 1; q++) {
                for (int r = q + 1; r < n; r++) {
                    if (array[p] + array[q] + array[r] == 0) {
                        System.out.print(array[p]);
                        System.out.print(" ");
                        System.out.print(array[q]);
                        System.out.print(" ");
                        System.out.print(array[r]);
                        System.out.print("\n");
                        sum = 0;
                    }
                }
            }
        }
        // If no triplet with 0 sum found in array
        if (sum != 0)
            System.out.println(" not exist ");

    }
}