package org.launchcode.java.studios;

import java.util.HashMap;

/**
 * studio day 2
 * Created by raefo on 11-May-17.
 */
public class CountingCharacters {
    public static void main(String[] args) {
        String s = "u";
        HashMap<Character,Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.replace(c,map.get(c) + 1);
            } else {
                map.put(c,1);
            }
        }

        System.out.println(map.toString());
    }
}
