package org.launchcode.java.prepwork;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * prep work day 2
 * Created by raefo on 09-May-17.
 */
public class NewGradeBookMap {

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newStudent;

        // Get student names and grades
        do {

            System.out.println("Enter your students as id and name with a space between (or ENTER to finish):");
            newStudent = in.nextLine();

            if (!newStudent.equals("")) {
                int id = Integer.parseInt(newStudent.substring(0,newStudent.indexOf(" ")));
                String name = newStudent.substring(newStudent.indexOf(" "));

                students.put(id, name);

                // Read in the newline before looping back
                in.nextLine();
            }

        } while (!newStudent.equals(""));

        // Print class roster
        StringBuilder builder = new StringBuilder();
        builder.append("\nClass roster:\n");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            builder.append(student.getKey() + " - " + student.getValue());
        }
        System.out.println(builder);
    }
}
