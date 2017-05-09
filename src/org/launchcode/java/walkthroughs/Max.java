package org.launchcode.java.walkthroughs;

import java.util.ArrayList;

/**
 * Created by raefo on 08-May-17.
 */
public class Max {
    /*
    return largest in from an array
     */

    public static void main (String args[]) {
        ArrayList<Integer> intArray = new ArrayList<>();
        for (int i=0; i<10; i++) {
            intArray.add(i);
        }
        System.out.println(findMax(intArray));
    }

    public static int findMax(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
