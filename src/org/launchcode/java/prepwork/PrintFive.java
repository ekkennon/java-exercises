package org.launchcode.java.prepwork;

import java.util.ArrayList;

/**
 * Created by raefo on 09-May-17.
 */
public class PrintFive {

    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>();
        lst.add("hello");
        lst.add("world");
        lst.add("kevin");
        lst.add("rags");
        lst.add("echo");

        printFive(lst);
    }

    public static void printFive(ArrayList<String> lst) {
        for (String s : lst) {
            if (s.length() == 5) {
                System.out.println(s);
            }
        }
    }
}
