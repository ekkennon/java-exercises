package org.launchcode.java.prepwork;

import java.util.Scanner;

/**
 * Created by ekk on 24-Apr-17.
 */
public class Wonderland {
    public static void main(String[] args) {
        String text = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your search term.");
        String term = in.nextLine();
        if (find(text,term) == true) {
            System.out.println("Your search term was found.");
        } else {
            System.out.println("Your search term was not found.");
        }

    }

    public static boolean find(String text, String searchTerm) {
        return text.contains(searchTerm);
    }
}
