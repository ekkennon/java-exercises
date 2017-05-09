package org.launchcode.java.studios;

import java.util.Scanner;

/**
 * studio day 1
 * Created by raefo on 08-May-17.
 */
public class Area {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);

        double radius = -1;

        while (radius <=0) {
            System.out.println("Enter the radius");
            radius = in.nextDouble();
        }

        System.out.println(calcArea(radius));
    }

    public static double calcArea(double r) {
        return Math.PI * Math.pow(r,2);
    }
}
