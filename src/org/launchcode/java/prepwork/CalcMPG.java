package org.launchcode.java.prepwork;

import java.util.Scanner;

/**
 * Created by ekk on 24-Apr-17.
 */
public class CalcMPG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of miles you've driven");
        double miles = in.nextDouble();
        System.out.println("Enter the number of gallons of gas you've used");
        double gallons = in.nextDouble();
        System.out.println("Your MPG is " + calcMPG(miles,gallons));
    }

    public static double calcMPG(double m, double g) {
        return m * g;
    }
}
