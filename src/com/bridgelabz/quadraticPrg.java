package com.bridgelabz;

import java.util.Scanner;

public class quadraticPrg {
    /*
     * Ask User To Find The Roots Of Equation
     */
    public static void main(String[] args) {
        double delta,r1,r2;
        //Welcome Message Added
        System.out.println("Welcome To The Roots Equation Program ");
        //Ask User To Enter The Values
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = sc.nextDouble();
        //Calculating The Delta Equation
        delta =  b * b - 4.0 * a * c;
        System.out.println("The Delta value is  : " +delta);
        //Calculating The Roots Of Equation
        r1 = (-b + Math.sqrt((delta)) / (2 * a));
        r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
        System.out.println("The roots are  r1 =" + r1 + " and \n r2 = " + r2);
    }
}
