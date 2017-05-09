package org.launchcode.java.prepwork;

import java.util.ArrayList;

/**
 * Created by raefo on 09-May-17.
 */
public class SumEven {

    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<>();

        for (int i=0; i<10; i++) {
            lst.add(i);
        }

        System.out.println(sum(lst));
    }

    public static int sum(ArrayList<Integer> lst) {
        int total = 0;
        for (int i : lst) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        return total;
    }
}
