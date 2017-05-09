package org.launchcode.java.prepwork;

/**
 * prep work day 2
 * Created by raefo on 09-May-17.
 */
public class PrintValues {

    public static void main(String[] args) {
        int[] lst = {1,1,2,3,5,8};
        prnt(lst);
    }

    public static void prnt(int[] lst) {
        for (int i=0; i<lst.length; i++) {
            System.out.println(i);
        }
    }
}
