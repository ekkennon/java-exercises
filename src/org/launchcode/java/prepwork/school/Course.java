package org.launchcode.java.prepwork.school;

import java.util.ArrayList;

/**
 * Created by raefo on 16-May-17.
 */
public class Course {
    private String courseID;
    private String courseName;
    private String courseDesc;
    private String offeringCode;
    private ArrayList<String> prereqs;
    private ArrayList<Student> enrollees;

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }

    public String getOfferingCode() {
        return offeringCode;
    }

    public void setOfferingCode(String offeringCode) {
        this.offeringCode = offeringCode;
    }

    public ArrayList<String> getPrereqs() {
        return prereqs;
    }

    public void addPrereq(String courseID) {
        prereqs.add(courseID);
    }

    public void setPrereqs(ArrayList<String> prereqs) {
        this.prereqs = prereqs;
    }

    public ArrayList<Student> getEnrollees() {
        return enrollees;
    }

    public void addEnrollee(Student student) {
        enrollees.add(student);
    }

    public void setEnrollees(ArrayList<Student> enrollees) {
        this.enrollees = enrollees;
    }
}
