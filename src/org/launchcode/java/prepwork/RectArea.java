package org.launchcode.java.prepwork;

import java.util.Scanner;

/**
 * Created by ekk on 24-Apr-17.
 */
public class RectArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of side 1.");
        double side1 = in.nextDouble();
        System.out.println("Enter the size of side 2.");
        double side2 = in.nextDouble();
        System.out.println("The area is " + calcArea(side1,side2));
    }

    public static double calcArea(double s1, double s2) {
        return s1 * s2;
    }
}
