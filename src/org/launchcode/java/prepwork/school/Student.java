package org.launchcode.java.prepwork.school;

/**
 * Created by raefo on 16-May-17.
 */
public abstract class Student {
    private static int nextStudentId = 1;
    private int studentID;
    private String studentName;
    private int numCredits;
    private double gpa;

    public Student(String name, int id, int numCredits, double gpa) {
        studentName = name;
        studentID = id;
        this.numCredits = numCredits;
        this.gpa = gpa;
    }

    public Student(String name, int id) {
        this(name, id, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
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
        return gpa;
    }

    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    public abstract String getGradeLevel();

    public void addGrade(int credits, double grade) {
        numCredits += credits;
        gpa = (gpa * numCredits) / numCredits;
    }

    @Override
    public boolean equals(Object o) {
        return ((Student) o).getStudentID() == getStudentID();
    }

    @Override
    public String toString() {
        return getStudentID() + getStudentName() + " - " + getGPA();
    }

    @Override
    public int hashCode() {
        return hashCode();
    }
}
