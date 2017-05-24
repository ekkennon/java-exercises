package org.launchcode.java.prepwork.school;

/**
 * Created by raefo on 24-May-17.
 */
public class UndergraduateStudent extends Student {
    public UndergraduateStudent(String name) {
        super(name);
    }

    public String getGradeLevel() {
        if (getNumCredits() < 30) {
            return "Freshman";
        } else if (getNumCredits() < 60) {
            return "Sophomore";
        } else if (getNumCredits() < 90) {
            return "Junior";
        } else {
            return "Senior";
        }
    }
}
