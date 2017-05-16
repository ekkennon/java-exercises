package org.launchcode.java.prepwork.school;

/**
 * Created by raefo on 16-May-17.
 */
public class Student {
    private int studentID;
    private String studentName;
    private int numCredits;
    private double GPA;

    public Student() {
        //todo initialize fields
    }

    public int getStudentID() {
        return studentID;
    }

    private void setStudentID(int studentID) {//this should only be set in the constructor
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getNumCredits() {
        return numCredits;
    }

    public void setNumCredits(int numCredits) {
        this.numCredits = numCredits;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
